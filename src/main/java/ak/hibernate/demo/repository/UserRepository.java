package ak.hibernate.demo.repository;

import ak.hibernate.demo.User;
import org.springframework.data.repository.CrudRepository;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

    default List<User> findByName(Iterable<User> allUsers, String name){
        List<User> users = new ArrayList<>();

        for (User user:allUsers){
            if (user.getName().contains(name)){
                users.add(user);
            }
        }
        return users;
    }
}