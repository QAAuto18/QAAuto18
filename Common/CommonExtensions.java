package transformationcrmhbf.common;

import io.cucumber.java.Scenario;
import java.util.HashMap;
import java.util.Map;

public class CommonExtensions {

    // We'll use a Map to mimic ScenarioContext storage
    private static Map<String, Object> scenarioData = new HashMap<>();

    /**
     * Stores a value into the scenario context.
     */
    public static void setValue(String key, Object value) {
        scenarioData.put(key, value);
    }

    /**
     * Gets the current logged in user.
     */
    public static String getCurrentUser() {
        Object currentUser = scenarioData.get("Test User");
        return currentUser != null ? currentUser.toString() : null;
    }
}
