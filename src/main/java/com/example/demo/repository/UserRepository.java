package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserEntity;



@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{



@Query(value="select * from user_entity where name=?1",nativeQuery=true)
UserEntity getUserByName(String name);

//
//@Query(value="select * from user_entity where name=?1",nativeQuery=true)
//
//UserEntity updatebyUser(int id,String name);

@Query(value="select * from user_entity where country=?1",nativeQuery=true)
UserEntity getUserByCountry(String country);

@Query(value="select * from user_entity where passport=?1",nativeQuery=true)
UserEntity getUserByPassportd(String passport);

//@Query(value="update user_entity set  name='siva' Where id=1 ",nativeQuery=true)
//UserEntity updateByUserId(String name);


}
