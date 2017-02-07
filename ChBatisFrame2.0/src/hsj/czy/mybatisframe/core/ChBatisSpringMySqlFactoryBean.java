package hsj.czy.mybatisframe.core;

import org.springframework.core.io.Resource;

public class ChBatisSpringMySqlFactoryBean extends ChBatisSpringFactoryBean {

    public ChBatisSpringMySqlFactoryBean(){
        this.dialect = "mysql";
        setMapperLocations(new Resource[] {});
    }
}
