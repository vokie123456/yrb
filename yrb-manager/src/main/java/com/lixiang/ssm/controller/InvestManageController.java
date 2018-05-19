package com.lixiang.ssm.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.lixiang.ssm.entity.InvProject;
import com.lixiang.ssm.entity.InvRecord;
import com.lixiang.ssm.entity.OperateRecord;
import com.lixiang.ssm.entity.PaybackPlan;
import com.lixiang.ssm.entity.User;
import com.lixiang.ssm.service.InvManageService;
import com.lixiang.ssm.utils.InterestObject;
import com.lixiang.ssm.utils.InterestUtils;

@RequestMapping("/investManage")
@Controller
public class InvestManageController {

	@Autowired
	private InvManageService invManageService;
	
	protected Logger log = Logger.getLogger(LoginController.class);

	
	//项目总览controller
	@RequestMapping("/subProject")
	public String submitProject(Integer id, Model model, HttpSession session) {
		Subject currentUser = SecurityUtils.getSubject();
		User result = (User) currentUser.getPrincipal();
		boolean oper_result = invManageService.updateProjectStatus(20,id);
		InvProject inv = invManageService.selectByPrimaryKey(id);
		OperateRecord operRecord = new OperateRecord(null,1,new Date(),inv.getProjectType(),id,result.getId(),result.getUsername(),"提交");
		invManageService.insertSelective(operRecord);
		session.setAttribute("oper_result", oper_result);
		return "redirect:/investManage/pageList";
	}

	@RequestMapping("/pageList")
	public String list(InvProject invProject, Model model) {
		// 封装了总数，封装了分页信息，封装了查询出来的数据
		PageInfo<InvProject> inv = invManageService.pageList(invProject);
		model.addAttribute("inv", inv);
		return "invproject-list";
	}
	
	@RequestMapping("/detailsList")
	public String detailsList(Integer id, Model model) {
		// 封装了总数，封装了分页信息，封装了查询出来的数据
		InvProject invProject = invManageService.selectByPrimaryKey(id);
		model.addAttribute("invProject", invProject);
		return "invproject-details";
	}
	
	@RequestMapping("/toDel")
	public String toDelInvProject(Integer id,Model model){
		InvProject invProject = invManageService.selectByPrimaryKey(id);
		model.addAttribute("invProject", invProject);
		return "invproject-del";
	}
	

	@RequestMapping("/delInvProject")
	public String delInvProject(@RequestParam Integer id,Model model,HttpSession session){
		int result = invManageService.deleteByPrimaryKey(id);
		System.out.println(result);
		model.addAttribute("result", result);
		session.setAttribute("oper_result", result>0);
		return "redirect:/investManage/pageList";
	}
	
	@RequestMapping("/toInsert")
	public String toInsertInvProject() {
		return "invproject-add";
	}

	@RequestMapping("/insert")
	public String insertProject(InvProject invProject, Model model, HttpSession session) {
		Subject currentUser = SecurityUtils.getSubject();
		User result = (User) currentUser.getPrincipal();
		SimpleDateFormat time = new SimpleDateFormat("yyyyMMddHH");
		String time1 = time.format(new Date());
		invProject.setInvNo(new Integer(time1));
		invProject.setCreatorId(result.getId());
		invProject.setCreatorName(result.getUsername());
		invProject.setProjectStatus(10);
		invProject.setResource(2);
		int invPro = invManageService.insertSelective(invProject);
		model.addAttribute("invPro", invPro);
		session.setAttribute("oper_result", invPro > 0);
		model.addAttribute("result", result);
		return "redirect:/investManage/pageList";
	}
	
	@RequestMapping("/toUpdate")
	public String toUpdateInvPro(Integer id,Model model){
		
		InvProject invProject = invManageService.selectByPrimaryKey(id);
		model.addAttribute("invProject", invProject);
		return "invproject-update";
	}
	
	@RequestMapping("/update")
	public String updateProject(InvProject invProject,Model model,HttpSession session) throws ParseException{
		Subject currentUser = SecurityUtils.getSubject();
		User result = (User) currentUser.getPrincipal();
		invProject.setModifiorId(result.getId());
		invProject.setModifiorName(result.getUsername());
		
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH-mm:ss");
		String time1 = time.format(new Date());
		invProject.setModifyDate(time.parse(time1));
		
		int invPro = invManageService.updateByPrimaryKeySelective(invProject);
		model.addAttribute("invProject", invPro);
		session.setAttribute("oper_result", invPro>0);
		model.addAttribute("result", result);
		return "redirect:/investManage/pageList";
	}
	
	
	//审核项目相关controller
	@RequestMapping("/listOperProject")
	public String listOperProject(InvProject invProject, Model model){
		// 封装了总数，封装了分页信息，封装了查询出来的数据
		PageInfo<InvProject> inv = invManageService.listOperProject(invProject);
		model.addAttribute("inv", inv);
		
		return "oper-record-list";
	}
	
	@RequestMapping("/showOperRecord")
	public String showOperRecord(OperateRecord operateRecord,Model model){
		List<OperateRecord> showList = invManageService.queryOperRecord(operateRecord);
		model.addAttribute("showList", showList);
		return "oper-record-show";
	}
	
	@RequestMapping("/showProOperRecord")
	public String queryProOperRecord(Integer id, Model model) {
		// 封装了总数，封装了分页信息，封装了查询出来的数据
		System.out.println("这是查询操作记录的项目ID："+id);
		List<OperateRecord> inv = invManageService.queryProOperRecord(id);
		System.out.println("这是查询操作记录的项目："+inv);
		model.addAttribute("inv", inv);
		return "oper-record-showpro";
	}
	
	@RequestMapping("/toPass")
	public String toPassOperProject(Integer id,Model model){
		InvProject invProject = invManageService.selectByPrimaryKey(id);
		model.addAttribute("invProject", invProject);
		return "oper-record-pass";
	}
	
	@RequestMapping("/passOper")
	public String passOperProject(Integer id,Model model,HttpSession session) throws ParseException{
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH-mm:ss");
		String time1 = time.format(new Date());
		
		boolean oper_result = invManageService.updateProjectStatus(30,id);
		InvProject inv = invManageService.selectByPrimaryKey(id);
		OperateRecord operRecord = new OperateRecord(null,2,time.parse(time1),inv.getProjectType(),id,inv.getModifiorId(),inv.getModifiorName(),"审核通过");
		invManageService.insertSelective(operRecord);
		
		session.setAttribute("oper_result", oper_result);
		return "redirect:/investManage/listOperProject";
	}
	
	@RequestMapping("/toFail")
	public String toFailOperProject(Integer id,Model model){
		InvProject invProject = invManageService.selectByPrimaryKey(id);
		model.addAttribute("invProject", invProject);
		return "oper-record-fail";
	}
	
	@RequestMapping("/failOper")
	public String failOperProject(OperateRecord operateRecord,Integer id,Model model,HttpSession session) throws ParseException{
		boolean oper_result = invManageService.updateProjectStatus(11,id);
		InvProject inv = invManageService.selectByPrimaryKey(id);
		OperateRecord operRecord = new OperateRecord(null,3,new Date(),inv.getProjectType(),id,inv.getModifiorId(),inv.getModifiorName(),operateRecord.getRemark());
		invManageService.insertSelective(operRecord);
		
		session.setAttribute("oper_result", oper_result);
		return "redirect:/investManage/listOperProject";
	}
	
	@RequestMapping("/toRelease")
	public String toReleaseProject(Integer id,Model model){
		InvProject invProject = invManageService.selectByPrimaryKey(id);
		model.addAttribute("invProject", invProject);
		return "oper-record-release";
	}
	@RequestMapping("/releaseOper")
	public String releaseOperProject(InvProject invProject,Model model,HttpSession session) throws ParseException{
		boolean oper_result = invManageService.updateProjectStatus(40,invProject.getId());
		System.out.println("项目id："+invProject.getId());
		InvProject inv = invManageService.selectByPrimaryKey(invProject.getId());
		inv.setBiddingDate(new Date());
		inv.setFinancingEndTime(invProject.getFinancingEndTime());
		invManageService.updateByPrimaryKeySelective(inv);
		OperateRecord operRecord = new OperateRecord(null,5,new Date() ,inv.getProjectType(),invProject.getId(),inv.getModifiorId(),inv.getModifiorName(),"项目发布");
		invManageService.insertSelective(operRecord);
		
		session.setAttribute("oper_result", oper_result);
		return "redirect:/investManage/listServiceProject";
	}
	
	@RequestMapping("/listServiceProject")
	public String listServiceProject(InvProject invProject, Model model) {
		// 封装了总数，封装了分页信息，封装了查询出来的数据
		PageInfo<InvProject> inv = invManageService.listServiceProject(invProject);
		model.addAttribute("inv", inv);
		return "service-oper-list";
	}
	@RequestMapping("/listInvRecord")
	public String listInvRecord(Integer id,Model model){
		List<InvRecord> invRec = invManageService.queryListInvRecord(id);
		model.addAttribute("invRec", invRec);
		return "invrecord-list";
	}
	
	@RequestMapping("/toEfiiective")
	public String toProjectEffective(Integer id,Model model){
		InvProject invProject = invManageService.selectByPrimaryKey(id);
		System.out.println("这是传过来的参数："+invProject.getId());
		model.addAttribute("invProject", invProject);
		return "invproject-effective";
	}
	
	@RequestMapping("/effective")
	public String projectEffective(Integer id,Model model,HttpSession session){
		System.out.println("这是id："+id);
		List<InvRecord> invRecList = invManageService.queryListInvRecord(id);
		for(Iterator<InvRecord> it = invRecList.iterator(); it.hasNext();){
			
			PaybackPlan paybackPlan = new PaybackPlan();
			Subject currentUser = SecurityUtils.getSubject();
			User usr = (User) currentUser.getPrincipal();
			System.out.println("这是用户："+usr.getUsername());
			InvRecord obj = (InvRecord) it.next();
			System.out.println("这是投资记录:"+obj);
			// 设置投资记录id
			paybackPlan.setInvRecordId(obj.getId());
			// 设置项目id
			paybackPlan.setProjectId(obj.getInvRecId());
			// 设置操作人id
			paybackPlan.setOperatorId(usr.getId());
			// 设置操作人姓名
			paybackPlan.setOperatorName(usr.getRealName());
			// 设置操作时间
			paybackPlan.setOperatorDate(new Date());
			// 通过投资记录表中项目ID来查询项目的对象
			System.out.println("这是投资记录表中的项目id:"+obj.getInvRecId());
			InvProject invProject = invManageService.selectByPrimaryKey(obj.getInvRecId());
			// 修改项目状态为待回款
			invProject.setProjectStatus(60);
			// 设置实际筹集结束时间
			invProject.setEndTime(new Date());
			invManageService.updateByPrimaryKeySelective(invProject);
			// 设置项目名称
			paybackPlan.setProjectName(invProject.getProjectName());
			// 设置回款期数
			paybackPlan.setPaybackNo(invProject.getPaybackTime());
			List<InterestObject> intObj = InterestUtils.getInterestList(invProject.getPaybackWay(),obj.getInvrecMoney(),invProject.getPaybackTime(),invProject.getRate(),new Date());
			for(Iterator<InterestObject> ite = intObj.iterator();it.hasNext();){
				InterestObject interestObj = (InterestObject) ite.next();
				paybackPlan.setPlanPaybackDate(interestObj.getPaymentDate());
				paybackPlan.setPaybackMoney(interestObj.getCapital());
				paybackPlan.setPaybackMargin(interestObj.getInterest());
				int addResult = invManageService.addPaybackPlan(paybackPlan);
				if (addResult > 0) {
					System.out.println("成功生成回款计划,计划为：" + paybackPlan);
				}
				session.setAttribute("oper_result", addResult > 0);
			}
		}
		
		return "redirect:/investManage/listServiceProject";
	}
}
