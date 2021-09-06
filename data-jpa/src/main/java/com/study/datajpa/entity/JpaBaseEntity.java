package com.study.datajpa.entity;

import javax.persistence.Column;
import javax.persistence.PrePersist;
import java.time.LocalDateTime;

public class JpaBaseEntity {

    @Column(updatable = false)
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;

    @PrePersist
    public void prePersist(){
        LocalDateTime now = LocalDateTime.now();
        createdTime = now;
        updatedTime = now;
    }
}
