package me.kdshim.kdd_j.common;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity implements Serializable {
    @CreatedDate
    LocalDateTime created;

    @LastModifiedDate
    LocalDateTime updated;

    @PrePersist
    void prePersist(){
        this.created = LocalDateTime.now();
        this.updated = created;
    }

    @PreUpdate()
    void preUpdate(){
        updated = LocalDateTime.now();
    }
}
