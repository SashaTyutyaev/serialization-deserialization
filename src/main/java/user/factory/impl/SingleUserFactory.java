package user.factory.impl;

import user.factory.SerializationFactory;
import user.service.SerializationService;
import user.service.SingleUserService;

public class SingleUserFactory implements SerializationFactory {

    @Override
    public SerializationService createSerializationService() {
        return new SingleUserService();
    }
}
