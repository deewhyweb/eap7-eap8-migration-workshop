package org.jboss.as.quickstarts.kitchensink.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Member.class)
public abstract class Member_ {

	public static volatile SingularAttribute<Member, String> phoneNumber;
	public static volatile SingularAttribute<Member, String> name;
	public static volatile SingularAttribute<Member, Long> id;
	public static volatile SingularAttribute<Member, String> email;

	public static final String PHONE_NUMBER = "phoneNumber";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String EMAIL = "email";

}

