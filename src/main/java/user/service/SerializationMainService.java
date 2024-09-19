package user.service;

import user.constants.UsersList;
import user.factory.SerializationFactory;
import user.factory.impl.ManyUsersFactory;
import user.factory.impl.SingleUserFactory;

public class SerializationMainService {

    public void serializeAndDeserialize(Boolean isMany) {
        SerializationFactory serializationFactory;
        if (isMany) {
            serializationFactory = new ManyUsersFactory();
            serializationFactory.createSerializationService().serialize(UsersList.USERS_ARRAY);
            serializationFactory.createSerializationService().deserialize();
        } else {
            serializationFactory = new SingleUserFactory();
            serializationFactory.createSerializationService().serialize(UsersList.USERS_ARRAY[0]);
            serializationFactory.createSerializationService().deserialize();
        }
    }
}
