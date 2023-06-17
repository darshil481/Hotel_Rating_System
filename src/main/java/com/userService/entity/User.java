package com.userService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="userDetails")
public class User {
    @Id
    private String userId;
    private String name;
    private String email;
    private String abount;

    @Transient
    private List<Rating> ratingList;

}
