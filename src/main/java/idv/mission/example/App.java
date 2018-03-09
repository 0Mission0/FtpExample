package idv.mission.example;

import java.io.IOException;

import org.apache.commons.net.ftp.FTPFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
        FtpHelper ftpHelper = context.getBean(FtpHelper.class);
        ftpHelper.login();
        FTPFile[] files = ftpHelper.listFiles();
        for (FTPFile file : files) {
            System.out.println(file.getName());
        }
        ftpHelper.logout();
    }
}
