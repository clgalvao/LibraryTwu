package com.twu.biblioteca;
import com.twu.Util.BibliotecaUserTypeEnum;
import com.twu.model.User;
import com.twu.Util.AuthUser;
import org.junit.Assert;
import org.junit.Test;

public class AuthUtilTest
{
        @Test
        public void authCostumer() {
            User usertest = new User("LibrarianOwner",
                    "999-0099",
                    "COSTUMER",
                    "2222",
                    "cost@gmail.com",
                    "9999-9999");
            AuthUser userAuthTest =  new AuthUser();
            Assert.assertEquals(BibliotecaUserTypeEnum.COSTUMER,userAuthTest.auth(usertest));
        }
}
