package user;

import user.constants.UsersList;
import user.service.ManyUsersService;
import user.service.SingleUserService;

public class Main {
    public static void main(String[] args) {
        System.out.println("------ ОДИН ЮЗЕР ------");
        SingleUserService singleUserService = new SingleUserService();
        singleUserService.serializeUser(UsersList.USERS_LIST.get(0));
        singleUserService.deserializeUser();

        System.out.println();
        System.out.println("------ СПИСОК ЮЗЕРОВ ------");
        ManyUsersService manyUsersService = new ManyUsersService();
        manyUsersService.serializeUsers(UsersList.USERS_LIST);
        manyUsersService.deserializeUsers();
    }
}