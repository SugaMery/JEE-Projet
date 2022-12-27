package com.exemple.test.soutnanceproject.entities;

import com.exemple.test.soutnanceproject.entities.Personne;
import com.exemple.test.soutnanceproject.entities.Resume;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-27T19:12:53", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Memoire.class)
public class Memoire_ { 

    public static volatile SingularAttribute<Memoire, Resume> resume;
    public static volatile SingularAttribute<Memoire, byte[]> pdf;
    public static volatile SingularAttribute<Memoire, Long> id;
    public static volatile SingularAttribute<Memoire, String> langue;
    public static volatile SingularAttribute<Memoire, String> sujet;
    public static volatile SingularAttribute<Memoire, Date> dateSoutenance;
    public static volatile SingularAttribute<Memoire, Personne> etudiant;
    public static volatile SingularAttribute<Memoire, String> lieu;

}