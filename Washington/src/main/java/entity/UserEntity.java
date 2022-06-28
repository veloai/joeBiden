package entity;

import lombok.Data;
import lombok.Value;
import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Entity
@Data
@Table(name = "USER_INFO")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "departe")
    private String departe;

    @OneToMany
    @Column(name = "address")
    private String address;
}

