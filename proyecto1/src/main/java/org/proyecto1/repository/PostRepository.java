package org.proyecto1.repository;

import org.proyecto1.domain.PostEntity;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<PostEntity, Long> {

}
