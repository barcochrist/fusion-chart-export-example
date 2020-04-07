package co.com.fusionexport.example;

import com.fusioncharts.fusionexport.client.ExportConfig;
import com.fusioncharts.fusionexport.client.ExportManager;

public class AmChartPngExport {

  public static void main(String[] args) throws Exception {

    // Instantiate the ExportManager class
    ExportManager em = new ExportManager();
    //TODO Add fusion export server configuration
    em.setHostAndPort("http", "10.0.10.6", 1337);

    // Instantiate the ExportConfig class and add the required configurations
    ExportConfig config = new ExportConfig();
    config
        .set("templateFilePath", ClassLoader.getSystemResource("template_amcharts.html").getPath());
    config.set("type", "png");
    config.set("asyncCapture", true);

    em.export(config, ".", true);

    System.out.println("Done");
  }
}
