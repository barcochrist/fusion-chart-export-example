package co.com.fusionexport.example;

import com.fusioncharts.fusionexport.client.ExportConfig;
import com.fusioncharts.fusionexport.client.ExportManager;

public class MultiplePdfExport {

  public static void main(String[] args) throws Exception {

    // Instantiate the ExportManager class
    ExportManager em = new ExportManager();
    em.setHostAndPort(ServerConfiguration.protocol, ServerConfiguration.host,
        ServerConfiguration.port);

    // Instantiate the ExportConfig class and add the required configurations
    ExportConfig config = new ExportConfig();
    config.set("chartConfig", ClassLoader.getSystemResource("multiple_charts_config.json").getPath());
    config.set("type", "pdf");
    config.set("asyncCapture", true);

    em.export(config, ".", true);

    System.out.println("Done");
  }
}
