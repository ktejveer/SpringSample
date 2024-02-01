package com.bharati.dairy.example24.model;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class BaseEntity {
    @CreatedDate
    @Column(name="created_at", updatable = false)
    private LocalDateTime createdDate;

    @CreatedBy
    @Column(name="created_by", updatable = false)
    private String createdBy;

    @LastModifiedDate
    @Column(name="updated_at", insertable = false)
    private LocalDateTime updatedDate;

    @LastModifiedBy
    @Column(name="updated_by", insertable = false)
    private String updatedBy;
}
