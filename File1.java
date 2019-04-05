
import java.io.File;
import java.io.IOException;
import java.util.Date;
public class File1{
    public static void main(String[] args) throws IOException {
        //定义要操作的文件路径
        File file = new File("D:" + File.separator + "test" + File.separator + "new" + File.separator + "a.java");
        File file1 = new File("D:" + File.separator + "test" + File.separator + "new");
        //判断父文件是否存在
        if (!file.getParentFile().exists()) {
            //不存在，创建父目录
            file.getParentFile().mkdirs();
        }
        //判断新文件是否存在
        if (file.exists()) {
            //若存在，删除
            file.delete();
        } else {
            //不存在，创建
            file.createNewFile();
        }
        if (file.exists() && file.isFile()) {
            //若文件存在并且是文件
            //输出修改日期和长度
            System.out.println("文件修改日期" + new Date(file.lastModified()));
            System.out.println("文件长度" + file.length());
        }
        if(file1.exists()&&file1.isDirectory()){
            //输出目录下的所有内容
            File[] result = file1.listFiles();
            for(File file2:result){
                System.out.println(file2);
            }
        }
    }
}
