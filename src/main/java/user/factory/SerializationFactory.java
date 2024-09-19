package user.factory;

import user.service.SerializationService;

public interface SerializationFactory {

    SerializationService createSerializationService();
}
