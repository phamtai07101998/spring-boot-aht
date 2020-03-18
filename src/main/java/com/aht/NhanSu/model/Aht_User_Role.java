package com.aht.NhanSu.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Optional;

@Entity
@Table(name = "aht_user_role")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Aht_User_Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_role_id")
    private int userRoleId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Aht_User user;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Aht_Role role;

}
