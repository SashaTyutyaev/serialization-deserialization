package user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
class User implements Serializable {

    private String name;

    private String surname;

    private transient String mail;
}
