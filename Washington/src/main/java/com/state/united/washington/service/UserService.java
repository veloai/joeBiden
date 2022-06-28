package com.state.united.washington.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.state.united.washington.model.User;
import com.state.united.washington.repository.UserRepository;
import entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserEntity getUser(Long id) {
//        ObjectMapper objectMapper = new ObjectMapper();// userEntity -> user 로 멥핑한다.
//        objectMapper.

        return userRepository.findById(id).get();
//        Optional<UserEntity> userEntity = userRepository.findById(id).get();
//            return userEntity.map(UserEntity ->  {
//                var user = User.builder()
//                        .id(UserEntity.getId()) //TODO: Long parese
//                        .name(UserEntity.getName())
//                        .email(UserEntity.getEmail())
//                        .address(UserEntity.getAddress())
//                        .build();
//                return user;
//            }).get();
//    }
    }

    public Long setUser(User user){
        //todo : user -> userEntity
        UserEntity userEntity = new UserEntity();
        return userRepository.save(userEntity).getId();
    }

    public String getUserByAddressOrEmail(String address, String Email){
        userRepository.findByAddressAndEmail()
    }

}
