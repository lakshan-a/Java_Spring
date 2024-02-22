package lk.ijse.api.SpringConfiguration.dao;

import lk.ijse.api.SpringConfiguration.bo.BOSpringBean;
import org.springframework.context.annotation.Configuration;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 2/22/2024
 */

@Configuration
public class DAOSpringBean {

    public DAOSpringBean() {
        System.out.println("DAOSpringBean() - Constructor");
    }

    public DAOSpringBean daoSpringBean(){
        return new DAOSpringBean();
    }


}
