package org.mzandql.loveblog.dao;

import org.mzandql.loveblog.Entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
