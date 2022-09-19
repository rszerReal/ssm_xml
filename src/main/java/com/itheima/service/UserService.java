
package com.itheima.service;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public boolean save(User user);

    /**
     * 修改用户
     *
     * @param user
     * @return
     */
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public boolean update(User user);

    /**
     * 删除用户
     *
     * @param uuid
     * @return
     */
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public boolean delete(Integer uuid);

    /**
     * 查询单个用户信息
     *
     * @param uuid
     * @return
     */
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    public User get(Integer uuid);

    /**
     * 查询全部用户信息
     *
     * @return
     */
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    public List<User> getAll();

    /**
     * 根据用户名密码进行登录
     *
     * @param userName
     * @param password
     * @return
     */
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    public User login(String userName, String password);

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    public PageInfo<User> getAll(int page, int size);
}