package com.newportcapital.sia_erp.adapter.out.persistance.user;

import com.newportcapital.sia_erp.adapter.out.persistance.user.mapper.UserMapper;
import com.newportcapital.sia_erp.adapter.web.user.dto.UserUpdateRequest;
import com.newportcapital.sia_erp.domain.model.user.User;
import com.newportcapital.sia_erp.domain.model.user.UserId;
import com.newportcapital.sia_erp.domain.repository.UserRepository;
import com.newportcapital.sia_erp.infrastructure.user.persistance.entity.UserEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserRepositoryImpl implements UserRepository {

    private final UserJpaRepository userJpaRepository;
    private final UserMapper userMapper;

    public UserRepositoryImpl(UserJpaRepository userJpaRepository, UserMapper userMapper) {
        this.userJpaRepository = userJpaRepository;
        this.userMapper = userMapper;
    }
    @Override
    public User findByUsername(String user) {
        return userMapper.mapUserEntityToUser(userJpaRepository.findByUser(user)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found")));
    }

    @Override
    public User findById(UserId id) {
        return userMapper.mapUserEntityToUser(userJpaRepository.findById(id.getId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found")));
    }

    @Override
    public User save(User userModel) {
        UserEntity  userEntity = userMapper.mapUserToUserEntity(userModel);
        UserEntity userEntitySaved = userJpaRepository.save(userEntity);
        return userMapper.mapUserEntityToUser(userEntitySaved);
    }


}
