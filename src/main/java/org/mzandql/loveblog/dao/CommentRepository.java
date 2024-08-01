package org.mzandql.loveblog.dao;

import org.mzandql.loveblog.Entity.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {
}
