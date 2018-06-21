package in.futurastic.portal.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadLocalStorage {

    private static ThreadLocal<String> tenant = new ThreadLocal<>();
    private static Logger logger = LoggerFactory.getLogger(ThreadLocalStorage.class.getName());

    public static void setTenantName(String tenantName) {
        logger.debug("Setting tenant to " + tenantName);
        tenant.set(tenantName);
    }

    public static String getTenantName() {
        logger.debug("Getting tenant name" + tenant);
        return tenant.get();
    }

    public static void clear() {
        tenant.set(null);
    }

}
