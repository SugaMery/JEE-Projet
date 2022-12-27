package com.exemple.test.soutnanceproject.entities;

import com.exemple.test.soutnanceproject.entities.Memoire;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-27T19:13:35", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Personne.class)
public class Personne_ { 

    public static volatile SingularAttribute<Personne, String> lieuNaissance;
    public static volatile SingularAttribute<Personne, String> emailPerso;
    public static volatile SingularAttribute<Personne, Date> dateNaissance;
    public static volatile SingularAttribute<Personne, Memoire> memoire;
    public static volatile SingularAttribute<Personne, Long> id;
    public static volatile SingularAttribute<Personne, String> emailPro;
    public static volatile SingularAttribute<Personne, String> nom;
    public static volatile SingularAttribute<Personne, String> prenom;
    public static volatile SingularAttribute<Personne, Integer> age;
    public static volatile SingularAttribute<Personne, Date> dateEnregistrement;

}