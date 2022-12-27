package com.exemple.test.soutnanceproject.entities;

import com.exemple.test.soutnanceproject.entities.Element_Competence;
import com.exemple.test.soutnanceproject.entities.Evaluateur;
import com.exemple.test.soutnanceproject.entities.EvaluationPk;
import com.exemple.test.soutnanceproject.entities.Memoire;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-27T19:12:54", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Evaluation.class)
public class Evaluation_ { 

    public static volatile SingularAttribute<Evaluation, EvaluationPk> evaluationPK;
    public static volatile SingularAttribute<Evaluation, Short> note;
    public static volatile SingularAttribute<Evaluation, Element_Competence> elementCompetence;
    public static volatile SingularAttribute<Evaluation, Memoire> memoire;
    public static volatile SingularAttribute<Evaluation, Evaluateur> evaluateur;
    public static volatile SingularAttribute<Evaluation, String> commentaire;

}