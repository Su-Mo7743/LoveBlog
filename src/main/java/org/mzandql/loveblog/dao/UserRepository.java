package org.mzandql.loveblog.dao;

import org.mzandql.loveblog.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
