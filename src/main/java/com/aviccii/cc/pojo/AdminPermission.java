package com.aviccii.cc.pojo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
/**
 * @author aviccii 2020/9/3
 * @Discrimination
 */
@Data
@Entity
@Table(name = "admin_permission")
@ToString
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class AdminPermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    /**
     * Permission name;
     */
    private String name;

    /**
     * Permission's description(in Chinese)
     */
    private String desc_;

    /**
     * The path which triggers permission check.
     */
    private String url;
}