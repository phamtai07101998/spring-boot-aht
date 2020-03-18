package com.aht.NhanSu.service;

import com.aht.NhanSu.model.Aht_Role;
import com.aht.NhanSu.model.Aht_User_Role;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public interface UserRoleService {
    List<Aht_User_Role> findAllUser();

    Aht_User_Role createRole(Aht_User_Role role);

    Aht_User_Role updateUserRole(Aht_User_Role ahtUserRole);

    Optional<Aht_User_Role> findUserById(int id);

    void delete(int id);
}
