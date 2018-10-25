package com.zk.repository.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zk.entity.Person;
import com.zk.repository.PersonRepository;

@Repository
public class PersonRepositoryImpl implements PersonRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session openSession() {
        return this.sessionFactory.openSession();
    }

    public Person load(Long id) {
        return (Person)openSession().load(Person.class,id);
    }

    public Person get(Long id) {
        return (Person)openSession().get(Person.class,id);
    }

    public List<Person> findAll() {
        return null;
    }

    public void persist(Person entity) {
    	openSession().persist(entity);
    }

    public Long save(Person entity) {
        return (Long)openSession().save(entity);
    }

    public void saveOrUpdate(Person entity) {
    	openSession().saveOrUpdate(entity);
    }

    public void delete(Long id) {
        Person person = load(id);
        openSession().delete(person);
    }

    public void flush() {
    	openSession().flush();
    }
}
