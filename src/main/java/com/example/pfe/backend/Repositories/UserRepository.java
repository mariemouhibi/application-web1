package com.example.pfe.backend.Repositories;

import com.example.pfe.backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository
public interface UserRepository extends JpaRepository<User,Long>
{
    @Query(value= "SELECT id, username FROM  User where username = :username")
    User findByUsername(@Param("username") String username);
    @Query("SELECT id, username from User  where id = :id")
    User findUserByID(@Param("id")long id);
    @Modifying
    @Transactional()
    @Query("DELETE FROM User where id = :id")
void deleteUser(@Param("id")long id);

//    @Transactional
//    @Modifying
//    @Query(value = "delete  from  Bac.user_role  where user_id like :userID and role_id like :roleId")
//    void deleteRole(@Param("roleId") long roleId,@Param("userID") long userID);
    @Query("select id, username from User where email = :email")
    User findUserByEmail(String email);
}
