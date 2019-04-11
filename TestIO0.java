
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class TestIO0 {
    public static void main(String[] args) throws Exception{
        File file = new File("D:"+File.separator+"新建文件夹"+File.separator+"test"+File.separator+"io.java");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        OutputStream out = new FileOutputStream(file,true);
        String msg = "i miss you";
        out.write(msg.getBytes(),0,7);
        out.close();
    }
}
