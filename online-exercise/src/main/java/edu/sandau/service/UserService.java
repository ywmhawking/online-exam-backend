package edu.sandau.service;

import edu.sandau.entity.User;
import edu.sandau.enums.LoginValueEnum;
import edu.sandau.rest.model.Page;

public interface UserService {

    /***
     * LoginUser 转成 User
     * @param user
     * @return
     */
    User refactorEntity(User user) throws Exception ;

    /***
     * 添加用户
     * @param user
     * @return
     * @throws Exception
     */
    User addUser(User user) throws Exception;

    /***
     * 查询是否存在指定用户
     * @param loginUser { username，email，telephone }
     * @return 若存在用户，返回用户
     * @throws Exception
     */
    User check(User loginUser) throws Exception;

    /***
     * 查询是否存在相同用户个数
     * @param user
     * @return
     * @throws Exception
     */
    Integer checkNumber(User user) throws Exception;

    /***
     * 若登录失败，返回null
     * @param loginValue
     * @param loginNmae
     * @param password
     * @return
     * @throws Exception
     */
    User login(LoginValueEnum loginValue, String loginNmae, String password) throws  Exception;

    /***
     * 重置密码
     * @param id
     * @param password
     * @return
     * @throws Exception
     */
    Boolean resetPassword(Integer id, String password) throws Exception;

    /***
     * 设置默认密码
     * @param id
     * @return
     * @throws Exception
     */
    Boolean resetPassword(Integer id) throws Exception;

    /***
     * 分页查询所有用户
     * @param page
     * @return
     * @throws Exception
     */
    Page getUsersByPage(Page page) throws Exception;

    /***
     * 更新用户信息
     * @param user
     * @return
     * @throws Exception
     */
    User updateUser(User user) throws Exception;

    User getUserById(Integer userId) throws Exception;

    User getUserByWxId(String wxId) throws Exception;
}
