package com.lagou.sqlSession;

import java.util.List;

public interface SqlSession {

    //查询所有
    public <E> List<E> selectList(String statementid,Object... params) throws Exception;

    //根据条件查询单个
    public <T> T selectOne(String statementid,Object... params) throws Exception;

    //新增
    public void insert(String statementid, Object... param) throws Exception;

    //修改
    public void update(String statementid, Object... param) throws Exception;

    //删除
    public void delete(String statementid, Object... param) throws Exception;

    //为Dao接口生成代理实现类
    public <T> T getMapper(Class<?> mapperClass);
}
