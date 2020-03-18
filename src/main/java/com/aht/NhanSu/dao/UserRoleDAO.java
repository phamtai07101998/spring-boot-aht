package com.aht.NhanSu.dao;

import com.aht.NhanSu.model.Aht_User_Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleDAO extends JpaRepository<Aht_User_Role,Integer> {
}
