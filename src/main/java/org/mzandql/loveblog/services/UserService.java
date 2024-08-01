package org.mzandql.loveblog.services;

import org.mzandql.loveblog.Entity.User;
import org.mzandql.loveblog.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //依据ID查找账户，仅返回用户名
    public String findByid(Long id) {
        if (userRepository.existsById(id)) {
            return userRepository.findById(id).get().getUsername();
        }
        return null;
    }

    //新增用户
    public void save(User user) {
        userRepository.save(user);
    }

    //根据用户id注销账户，controller层应同步删除用户在Post和Comment库中相关信息
    public Boolean deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }

    //更新用户数据，传入参数为User class
    public Boolean updateUser(User user) {
        if (userRepository.existsById(user.getId())) {
            userRepository.save(user);
            return true;
        }
        return false;
    }


    //返回数据库中所有用户信息
    public Iterable<User> getAllUser() {
        return userRepository.findAll();
    }
}
