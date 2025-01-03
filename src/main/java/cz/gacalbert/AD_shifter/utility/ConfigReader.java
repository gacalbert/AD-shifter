package cz.gacalbert.AD_shifter.utility;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private final String configFile;
    private final Properties properties = new Properties();

    public ConfigReader(String configFileName) {
        this.configFile = configFileName;
        loadProperties();
    }

    private void loadProperties() {
        try (InputStream configFile = ConfigReader.class.getResourceAsStream(this.configFile)) {
            if (configFile != null) {
                properties.load(configFile);
            } else {
                throw new IOException("Property file not found in classpath.");
            }
        } catch (IOException e) {
            System.out.println("Error occurred while trying to open the file. " + e);
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
