package com.baglie.CRUDProxyBandTest.Service;

import com.baglie.CRUDProxyBandTest.Entity.User;
import com.baglie.CRUDProxyBandTest.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SequenceGeneratorService generatorService;

    public User createUser(User user) {
        user.setId(generatorService.getSequenceNumber(User.SEQUENCE_NAME));

        return userRepository.save(user);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User updateUser(User user, int updateUserId) {
//        Query query = new Query().addCriteria(Criteria.where("id").is(updateUserId));
        User userNew = userRepository.findById(updateUserId).orElse(null);
        if (userNew == null) {
            userNew = new User();
            userNew.setId(updateUserId);
        }
        if (user.getName() != null)
            userNew.setName(user.getName());
        if (user.getEmail() != null)
            userNew.setEmail(user.getEmail());
        return userRepository.save(userNew);
    }

    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }


}
