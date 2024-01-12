package org.example.Repository;

import org.example.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.Optional;


@RepositoryRestResource
public interface Repository extends JpaRepository<UserEntity,Long> {
    @Query("select Balance from UserEntity where ID=:n")
    Optional<UserEntity> getBalanceByID(@Param("n") Long ID);

}