package user.constants;

import user.model.User;

public class UsersList {

    public static final User[] USERS_ARRAY;

    static {
        USERS_ARRAY = new User[3];
        USERS_ARRAY[0] = (User.builder()
                .name("Sasha")
                .surname("Tyutyaev")
                .mail("sasha@mail.ru")
                .build());
        USERS_ARRAY[1] = (User.builder()
                .name("Masha")
                .surname("MashaSurname")
                .mail("masha@mail.ru")
                .build());
        USERS_ARRAY[2] = (User.builder()
                .name("Medved")
                .surname("MedvedSurname")
                .mail("medved@mail.ru")
                .build());
    }
}
