package com.playground.store.jpo;

import com.playground.domain.entity.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Getter
@Setter
@Entity(name = "User")
@Table(name = "user", schema = "scheme1")
public class UserJpo {
    @Id
    @Column(name = "userid")
    private String userid;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "role")
    private String role;

    public UserJpo(User user) {BeanUtils.copyProperties(user, this);}

    public UserJpo() {

    }

    public User toDomain() {
        User retVal = new User();
        BeanUtils.copyProperties(this, retVal);
        return retVal;
    }

    public static List<User> toDomains(Iterable<UserJpo> jpos) {
        return StreamSupport.stream(jpos.spliterator(), false).map((UserJpo::toDomain)).collect(Collectors.toList());
    }
}
