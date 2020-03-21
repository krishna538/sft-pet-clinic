package com.springKrish.sfgpetclinic.services;

import model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String name);


}
