package com.btao.dao;

import com.btao.pojo.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * Created by S_TU on 2019/12/18
 */
public interface IEmpDao extends JpaRepository<Emp, Serializable> {
}
