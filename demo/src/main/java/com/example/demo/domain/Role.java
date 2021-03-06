package com.example.demo.domain;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ROLE")
@ToString(exclude = {"members", "resourcesSet"})
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter @Setter
@EqualsAndHashCode(of = "id")
public class Role implements Serializable{
    @Id @GeneratedValue
    @Column(name = "role_id")
    private Long id;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "role_desc")
    private String roleDesc;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "roleSet")
    @OrderBy("orderNum desc")
    private Set<Resources> resourcesSet = new LinkedHashSet<>();

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "memberRoles")
    private Set<Member> members = new HashSet<>();


}