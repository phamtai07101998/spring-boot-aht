package com.aht.NhanSu.controller;

import com.aht.NhanSu.model.Aht_User_Role;
import com.aht.NhanSu.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/rest/userRole")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    @GetMapping("")
    public ResponseEntity<List<Aht_User_Role>> findUserRole(){
        return ResponseEntity.ok().body(userRoleService.findAllUser());
    }

    @PostMapping("/create")
    public ResponseEntity<Aht_User_Role> createRole(@RequestBody Aht_User_Role ahtUserRole){
        return ResponseEntity.ok().body(userRoleService.createRole(ahtUserRole));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Aht_User_Role> updateUserRole(@PathVariable("id") int id,@RequestBody Aht_User_Role ahtUserRole){
        ahtUserRole.setUserRoleId(id);
        return ResponseEntity.ok().body(userRoleService.createRole(ahtUserRole));
    }

    @DeleteMapping("/delete/{id}")
    public HttpStatus deleteUserRole(@PathVariable("id") int id){
        userRoleService.delete(id);
        return HttpStatus.OK;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Aht_User_Role>> findUserById(@PathVariable("id") int id){
        return ResponseEntity.ok().body(userRoleService.findUserById(id));
    }
}
