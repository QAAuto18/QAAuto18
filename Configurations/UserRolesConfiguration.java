package TransformationCRMAUTOTEST.Configurations;

import java.util.HashMap;
import java.util.Map;

public class UserRolesConfiguration {

    // Helper class to store Dev and Sit user values
    private static class RoleMapping {
        String devUser;
        String sitUser;

        RoleMapping(String devUser, String sitUser) {
            this.devUser = devUser;
            this.sitUser = sitUser;
        }
    }

    private static final Map<String, RoleMapping> roles = new HashMap<>();

    static {
        roles.put("Front Line", new RoleMapping("Front Line", "Front line"));
        roles.put("Processor", new RoleMapping("AUTOTEST Processor", "Processor"));
        roles.put("Front Line Management", new RoleMapping("Front Line Management", "Front Line Management"));
    }

    public static String getUserRoleToLogin(String environment, String role) {
        RoleMapping mapping = roles.get(role);

        if (mapping == null) {
            throw new IllegalArgumentException("Role '" + role + "' not found");
        }

        switch (environment.toLowerCase()) {
            case "dev1":
                return mapping.devUser;
            case "sit":
                return mapping.sitUser;
            default:
                throw new IllegalArgumentException("Environment value '" + environment + "' unknown");
        }
    }
}
