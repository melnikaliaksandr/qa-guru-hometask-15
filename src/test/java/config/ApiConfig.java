package config;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.LoadType.MERGE;

@Config.LoadPolicy(MERGE)
@Config.Sources({"system:properties",
        "classpath:api.properties"})
public interface ApiConfig extends Config {

    @Key("api.base.url")
    String getUrl();

}
