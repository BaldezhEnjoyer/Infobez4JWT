package com.example.InfobesJWT.retoken;

import com.example.InfobesJWT.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity(name = "refreshtoken")
public class RefreshToken {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter private long id;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @Getter @Setter
    private User user;

    @Column(nullable = false, unique = true)
    @Getter @Setter private String token;

    @Column(nullable = false)
    @Getter @Setter private Instant expiryDate;

    public RefreshToken() {
    }

}
