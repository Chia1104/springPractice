package chia1104.springpractise.users.models.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table
public class Users {

    @NotNull
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique=true)
    private String email;

    @Column(nullable = false, unique=true)
    private String password;

    @Column(nullable = false)
    private String createdAt;
    private String updatedAt;

    public Users(Long id, String name, String email, String password, String createdAt, String updatedAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Users() {

    }
}
