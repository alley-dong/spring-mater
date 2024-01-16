package com.mashibing.populateBean.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("PersonService1")
public class PersonService {

    @Autowired
    private PersonDao personDao;
}
