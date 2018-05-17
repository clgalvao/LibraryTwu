package com.twu.Util;

import com.twu.model.User;

public class AuthUser {
    public AuthUser() {
    }

    public BibliotecaUserTypeEnum auth(User user)
    {

        switch (user.userType)
        {
            case "COSTUMER":
                return BibliotecaUserTypeEnum.COSTUMER;
            case "LIBRARIAN":
                return BibliotecaUserTypeEnum.LIBRARIAN;

                default:
                    return BibliotecaUserTypeEnum.COSTUMER;
        }
    }
}
