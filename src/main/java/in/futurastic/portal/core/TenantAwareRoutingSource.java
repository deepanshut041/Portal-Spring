package in.futurastic.portal.core;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;


public class TenantAwareRoutingSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return ThreadLocalStorage.getTenantName();
    }
}
