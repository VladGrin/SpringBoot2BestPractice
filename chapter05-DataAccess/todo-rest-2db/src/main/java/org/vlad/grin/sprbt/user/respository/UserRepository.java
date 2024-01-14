package org.vlad.grin.sprbt.user.respository;

import org.vlad.grin.sprbt.user.domain.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<AppUser,String> {
}
