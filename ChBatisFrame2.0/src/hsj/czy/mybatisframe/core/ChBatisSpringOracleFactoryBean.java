package hsj.czy.mybatisframe.core;

import org.springframework.core.io.Resource;

public class ChBatisSpringOracleFactoryBean extends ChBatisSpringFactoryBean {

    public ChBatisSpringOracleFactoryBean(){
        this.dialect = "oracle";
        setMapperLocations(new Resource[] {});
    }
}
