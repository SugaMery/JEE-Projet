package com.exemple.test.soutnanceproject.entities;

import com.exemple.test.soutnanceproject.entities.Institut;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-27T19:12:54", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Evaluateur.class)
public class Evaluateur_ extends Personne_ {

    public static volatile SingularAttribute<Evaluateur, String> role;
    public static volatile SingularAttribute<Evaluateur, String> titre;
    public static volatile SingularAttribute<Evaluateur, String> fonction;
    public static volatile SingularAttribute<Evaluateur, Institut> institut;

}