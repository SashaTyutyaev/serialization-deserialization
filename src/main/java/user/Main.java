package user;

import user.factory.SerializationFactory;
import user.factory.impl.ManyUsersFactory;
import user.factory.impl.SingleUserFactory;
import user.service.SerializationMainService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SerializationMainService mainService = new SerializationMainService();

        Scanner scanner = new Scanner(System.in);
        Boolean isMany = false;

        while (true) {
            System.out.println("Что вы хотите сделать?\n1 - Сериализовать 1 юзера\n2 - Сериализовать список юзеров");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    mainService.serializeAndDeserialize(isMany);
                    break;
                case 2:
                    mainService.serializeAndDeserialize(!isMany);
            }
        }
    }
}