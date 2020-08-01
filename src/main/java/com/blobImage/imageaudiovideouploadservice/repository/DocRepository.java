package com.blobImage.imageaudiovideouploadservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blobImage.imageaudiovideouploadservice.model.Doc;

@Repository
public interface DocRepository extends JpaRepository<Doc, Integer> {

}
