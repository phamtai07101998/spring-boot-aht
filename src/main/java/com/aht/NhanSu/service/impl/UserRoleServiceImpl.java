package com.aht.NhanSu.service.impl;

import com.aht.NhanSu.dao.RoleDAO;
import com.aht.NhanSu.dao.UserDAO;
import com.aht.NhanSu.dao.UserRoleDAO;
import com.aht.NhanSu.model.Aht_Role;
import com.aht.NhanSu.model.Aht_User_Role;
import com.aht.NhanSu.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleDAO userRoleDAO;

    @Autowired
    private RoleDAO roleDAO;

    @Autowired
    private UserDAO userDAO;

    @Override
    public List<Aht_User_Role> findAllUser() {
        return userRoleDAO.findAll();
    }

    @Override
    public Aht_User_Role createRole(Aht_User_Role userRole) {
        return userRoleDAO.save(userRole);
    }

    @Override
    public Aht_User_Role updateUserRole(Aht_User_Role ahtUserRole) {
        Optional<Aht_User_Role> findUserRole = userRoleDAO.findById(ahtUserRole.getUserRoleId());
        if (findUserRole.isPresent()){
            Aht_User_Role updateUserRole = findUserRole.get();
            updateUserRole.setUserRoleId(ahtUserRole.getUserRoleId());
            updateUserRole.setUser(ahtUserRole.getUser());
            updateUserRole.setRole(ahtUserRole.getRole());
            userRoleDAO.save(updateUserRole);
            return updateUserRole;
        }
        return null;
    }

    @Override
    public Optional<Aht_User_Role> findUserById(int id) {
        return userRoleDAO.findById(id);
    }

    @Override
    public void delete(int id) {
        userRoleDAO.deleteById(id);
    }
}
