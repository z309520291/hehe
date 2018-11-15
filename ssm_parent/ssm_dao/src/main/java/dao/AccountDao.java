package dao;

import domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 帐户dao接口
 */
public interface AccountDao {


    @Select("select * from account")
    public List<Account> findAll();


    @Insert("insert into account (name,money) values (#{name},#{money})")
    public void saveAccount(Account account);


}
