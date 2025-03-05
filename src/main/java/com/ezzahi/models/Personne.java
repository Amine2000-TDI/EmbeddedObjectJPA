package com.ezzahi.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Personne {
    @Id @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name ="zipCode" , column = @Column(name = "codePostale") ),
            @AttributeOverride( name ="street", column = @Column(name="rue")),
            @AttributeOverride( name ="city" , column=@Column(name = "ville"))
    })
    private Adresse adresse;
}
