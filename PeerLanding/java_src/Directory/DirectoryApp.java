package Directory;

import Directory.Resources.Directory;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DirectoryApp extends Application<DirectoryConf>{
    public static void main(String[] args) throws Exception {
        new DirectoryApp().run(args);
    }

    public void initialize(Bootstrap<DirectoryConf> bootstrap) { }

    public void run (DirectoryConf configuration, Environment environment) {
        Directory hist = new Directory();

        environment.jersey().register(hist);
    }
}
