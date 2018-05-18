package com.lixiang.ssm.dao;

import java.util.List;

import com.lixiang.ssm.entity.News;

public interface NewsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    int insert(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    int insertSelective(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    News selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    int updateByPrimaryKeySelective(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Wed May 16 11:53:23 CST 2018
     */
    int updateByPrimaryKey(News record);

	List<News> listIndexNews();
	
	List<News> list(News news);
	
	int updateNewsStatusById(News news);
}

