package org.example.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "user_data")
public class UserEntity {
    @Id
    private Long ID;
    @Column(name="Balance")
    public int Balance;


    public UserEntity() {

    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public int getBalance(Long balance) {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

}
