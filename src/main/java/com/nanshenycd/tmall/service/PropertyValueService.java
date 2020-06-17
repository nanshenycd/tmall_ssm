
package com.nanshenycd.tmall.service;

import com.nanshenycd.tmall.pojo.Product;
import com.nanshenycd.tmall.pojo.PropertyValue;

import java.util.List;

public interface PropertyValueService {
    void init(Product p);
    void update(PropertyValue pv);

    PropertyValue get(int ptid, int pid);
    List<PropertyValue> list(int pid);
}


