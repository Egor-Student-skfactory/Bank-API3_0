package org.example.Service;

import org.example.Entity.UserEntity;
import org.example.Repository.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final Repository repository;

    UserEntity userEntity;

    public UserService(Repository repository) {
        this.repository = repository;
    }

    public Optional<UserEntity> getBalanceAndID(Long ID)throws Exception {
        try {
            return repository.getBalanceByID(ID);
        } catch (Exception e){
            throw new Exception("Ошибка при выполнении операции");
        }
    }

    public void putMoneyAndBalance(Long ID, int putSum) throws Exception {
        try {
            UserEntity userEntity = repository.findById(ID).get();
            userEntity.setBalance(userEntity.Balance + putSum);

            repository.save(userEntity);

        }
        catch (Exception e){
            throw new Exception("Ошибка при выполнении операции" + 0);
        }
    }

    public void takeMoneyAndBalance(Long ID, int takeSum) throws Exception {
        try {
            UserEntity userEntity = repository.findById(ID).get();
            userEntity.setBalance(userEntity.Balance - takeSum);

            repository.save(userEntity);

        }
        catch (Exception e){
            throw new Exception("Ошибка при выполнении операции"+ 0);
        }
    }
    }
