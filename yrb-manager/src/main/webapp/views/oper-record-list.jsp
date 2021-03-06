<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
</head>
<script type="text/javascript">
	
</script>
<body>
	<%@ include file="/top.jsp"%>
	<div class="main-container" id="main-container">
		<jsp:include page="/menu.jsp">
			<jsp:param value="inv-oper" name="menu" />
		</jsp:include>


		<div class="main-content">
			<div class="breadcrumbs" id="breadcrumbs">
				<script type="text/javascript">
					try {
						ace.settings.check('breadcrumbs', 'fixed')
					} catch (e) {
					}
				</script>

				<ul class="breadcrumb">
					<li><i class="icon-home home-icon"></i> <a href="#">首页</a></li>
					<li class="active">投资管理</li>
				</ul>
				<!-- .breadcrumb -->

				<div class="nav-search" id="nav-search">
					<form class="form-search">
						<span class="input-icon"> <input type="text"
							placeholder="Search ..." class="nav-search-input"
							id="nav-search-input" autocomplete="off"> <i
							class="icon-search nav-search-icon"></i>
						</span>
					</form>
				</div>
				<!-- #nav-search -->
			</div>
			<div class="page-content">
				<div class="row">
					<div class="col-xs-12">
						<div class="table-header">审批投资项目列表</div>
						<div class="breadcrumbs" id="breadcrumbs"
							style="margin-top: 5px; padding-bottom: 50px">
							<div class="nav-search" id="nav-search">
								<div class="col-lg-6">
									<form class="form-search"
										action="${ctx }/investManage/listOperProject" method="post">
										<div class="input-group">
											<input type="text" name="projectName" class="form-control"
												placeholder="请输入您项目名" value="${operRecord.projectName }"
												aria-describedby="basic-addon2" maxlength="12"> <span
												class="input-group-btn">
												<button class="btn btn-primary btn-sm" type="submit">查询</button>
												<a class="btn btn-primary btn-sm"
												href="${ctx }/investManage/showOperRecord"
												data-toggle="modal" data-target="#myOperRecordModal"
												role="button" title="新增项目">查看审核记录</a>
											</span>

										</div>
									</form>
								</div>
							</div>
							<!-- #nav-search -->
						</div>
						<div class="table-responsive">
							<table id="sample-table-2"
								class="table table-striped table-bordered table-hover">
								<thead>
									<tr>
										<th class="center"><label> <input type="checkbox"
												class="ace" /> <span class="lbl"></span>
										</label></th>
										<th>项目名称</th>
										<th>项目类型</th>
										<th>需投资总金额</th>
										<th>年利率</th>
										<th>借款原因</th>
										<th>项目状态</th>
										<th>操作</th>
									</tr>
								</thead>

								<tbody>
									<c:forEach items="${inv.list }" var="operRecord">
										<tr>
											<td class="center"><label> <input
													type="checkbox" class="ace" value="${operRecord.id }" /> <span
													class="lbl"></span>
											</label></td>
											<td>${operRecord.projectName }</td>
											<td><c:if test="${operRecord.projectType==1}">
													车易贷
												</c:if> <c:if test="${operRecord.projectType==2}">
													房易贷
												</c:if> <c:if test="${operRecord.projectType==3}">
													售楼贷
												</c:if> <c:if test="${operRecord.projectType==4}">
													债券贷
												</c:if></td>
											<td>${operRecord.invTotbalance }</td>
											<td>${operRecord.rate }</td>
											<td>${operRecord.loanReason }</td>
											<td><c:if test="${operRecord.projectStatus==10}">
													待提交
												</c:if> <c:if test="${operRecord.projectStatus==11}">
													退回
												</c:if> <c:if test="${operRecord.projectStatus==20}">
													<span style="color: purple;">待审批</span>
												</c:if> <c:if test="${operRecord.projectStatus==30}">
													待发布
												</c:if> <c:if test="${operRecord.projectStatus==40}">
													筹款中
												</c:if> <c:if test="${operRecord.projectStatus==50}">
													筹资成功
												</c:if> <c:if test="${operRecord.projectStatus==60}">
													还款中
												</c:if> <c:if test="${operRecord.projectStatus==70}">
													结束
												</c:if> <c:if test="${operRecord.projectStatus==100}">
													流标
												</c:if></td>
											<td>
												<div
													class="visible-md visible-lg hidden-sm hidden-xs action-buttons">
													<c:if test="${operRecord.projectStatus==20}">
														<a class="green"
															href="${ctx }/investManage/toPass?id=${operRecord.id}"
															data-toggle="modal" data-target="#passModal" title="通过审核">
															<i class="icon-check bigger-130"></i>
														</a>
														<a class="red"
															href="${ctx }/investManage/toFail?id=${operRecord.id}"
															data-toggle="modal" data-target="#failModal"
															title="审核不通过"> <i class="icon-trash bigger-130"></i>
														</a>
													</c:if>
													<a class="green" data-toggle="modal"
														data-target="#proOperRecordModal"
														href="${ctx }/investManage/showProOperRecord?id=${operRecord.id}"
														title="该项目审核记录"> <i class="icon-eye-open bigger-130"></i>
													</a> <a class="green" data-toggle="modal"
														data-target="#detailsModal"
														href="${ctx }/investManage/detailsList?id=${operRecord.id}"
														id="details" title="项目详情"> <i
														class="icon-search bigger-130"></i>
													</a>

												</div>

												<div class="visible-xs visible-sm hidden-md hidden-lg">
													<div class="inline position-relative">
														<button class="btn btn-minier btn-yellow dropdown-toggle"
															data-toggle="dropdown">
															<i class="icon-caret-down icon-only bigger-120"></i>
														</button>

														<ul
															class="dropdown-menu dropdown-only-icon dropdown-yellow pull-right dropdown-caret dropdown-close">
															<li><a
																href="${ctx }/investManage/detailsList?id=${operRecord.id}"
																data-toggle="modal" data-target="#detailsModal"
																class="tooltip-success" data-rel="tooltip" title="Edit">
																	<span class="green"> <i
																		class="icon-edit bigger-120"></i>
																</span>

															</a></li>

															<li><a
																href="${ctx }/investManage/showProOperRecord?id=${operRecord.id}"
																class="tooltip-error" data-rel="tooltip"
																data-toggle="modal" data-target="#failModal"
																title="该项目操作记录"> <span class="red"> <i
																		class="icon-inbox bigger-120"></i>
																</span>
															</a></li>
														</ul>
													</div>
												</div>
											</td>
										</tr>

									</c:forEach>

								</tbody>
							</table>
						</div>

						<div class="modal-footer no-margin-top">
							<w:pager pageSize="${inv.pageSize }"
								url="${ctx }/investManage/listOperProject"
								recordCount="${inv.total }" pageNum="${inv.pageNum }" />
						</div>

					</div>
					<!-- /.modal-content -->
				</div>
				<!-- /.modal-dialog -->
			</div>
			<!-- PAGE CONTENT ENDS -->
		</div>
		<!-- /.col -->
	</div>
	<!-- 审核项目的模态框 -->
	<div class="modal fade" id="passModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content"></div>
		</div>
	</div>

	<!-- 删除项目的模态框 -->
	<div class="modal fade" id="failModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content"></div>
		</div>
	</div>

	<!-- 项目详情的模态框 -->
	<div class="modal fade" id="detailsModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content"></div>
		</div>
	</div>

	<!-- 审核操作记录的模态框 -->
	<div class="modal fade" id="myOperRecordModal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content"></div>
		</div>
	</div>

	<!-- 单个项目的审核操作记录的模态框 -->
	<div class="modal fade" id="proOperRecordModal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content"></div>
		</div>
	</div>

	<div class="ace-settings-container" id="ace-settings-container">
		<div class="btn btn-app btn-xs btn-warning ace-settings-btn"
			id="ace-settings-btn">
			<i class="icon-cog bigger-150"></i>
		</div>

		<div class="ace-settings-box" id="ace-settings-box">
			<div>
				<div class="pull-left">
					<select id="skin-colorpicker" class="hide">
						<option data-skin="default" value="#438EB9">#438EB9</option>
						<option data-skin="skin-1" value="#222A2D">#222A2D</option>
						<option data-skin="skin-2" value="#C6487E">#C6487E</option>
						<option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
					</select>
				</div>
				<span>&nbsp; Choose Skin</span>
			</div>

			<div>
				<input type="checkbox" class="ace ace-checkbox-2"
					id="ace-settings-navbar" /> <label class="lbl"
					for="ace-settings-navbar"> Fixed Navbar</label>
			</div>

			<div>
				<input type="checkbox" class="ace ace-checkbox-2"
					id="ace-settings-sidebar" /> <label class="lbl"
					for="ace-settings-sidebar"> Fixed Sidebar</label>
			</div>

			<div>
				<input type="checkbox" class="ace ace-checkbox-2"
					id="ace-settings-breadcrumbs" /> <label class="lbl"
					for="ace-settings-breadcrumbs"> Fixed Breadcrumbs</label>
			</div>

			<div>
				<input type="checkbox" class="ace ace-checkbox-2"
					id="ace-settings-rtl" /> <label class="lbl" for="ace-settings-rtl">
					Right To Left (rtl)</label>
			</div>

			<div>
				<input type="checkbox" class="ace ace-checkbox-2"
					id="ace-settings-add-container" /> <label class="lbl"
					for="ace-settings-add-container"> Inside <b>.container</b>
				</label>
			</div>
		</div>
	</div>
	<!-- /#ace-settings-container -->
	<!-- /.main-container-inner -->

	<a href="#" id="btn-scroll-up"
		class="btn-scroll-up btn btn-sm btn-inverse"> <i
		class="icon-double-angle-up icon-only bigger-110"></i>
	</a>

	<script src="${ctx}/assets/js/jquery-2.0.3.min.js"></script>
	<script src="${ctx}/assets/js/jquery.mobile.custom.min.js"></script>

	<script src="${ctx}/assets/js/bootstrap.min.js"></script>
	<script src="${ctx}/assets/js/typeahead-bs2.min.js"></script>

	<!-- page specific plugin scripts -->

	<script src="${ctx}/assets/js/jquery.dataTables.min.js"></script>
	<script src="${ctx}/assets/js/jquery.dataTables.bootstrap.js"></script>

	<!-- ace scripts -->

	<script src="${ctx}/assets/js/ace-elements.min.js"></script>
	<script src="${ctx}/assets/js/ace.min.js"></script>

	<script type="text/javascript">
		/* 模态框隐藏的时候把原来模态框里面的内容去掉 */
		$("#myModal").on("hidden.bs.modal", function() {
			$(this).removeData("bs.modal");
		});
	</script>
	<%@ include file="/tip.jsp"%>
</body>
</html>
