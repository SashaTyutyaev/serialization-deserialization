package user.service;

import user.model.User;

public interface SerializationService {

    void serialize(User... users);

    void deserialize();
}
