package user.factory.impl;

import user.factory.SerializationFactory;
import user.service.ManyUsersService;
import user.service.SerializationService;

public class ManyUsersFactory implements SerializationFactory {

    @Override
    public SerializationService createSerializationService() {
        return new ManyUsersService();
    }
}
