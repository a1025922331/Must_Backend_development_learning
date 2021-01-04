package mo.must.day13;

import java.io.File;

//删除多级目录
public class FileTest3 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\a1025\\Desktop\\1231");
        if (file.isDirectory()) {
//            deleteAll(file);
        } else {
//            file.delete();
        }
    }

    private static void deleteAll(File file) {
        //先获取子目录File数组
        File[] files = file.listFiles();
        //遍历整个子目录
        for (File file_ : files) {
            //如果是文件
            if (file_.isFile()) {
                file_.delete();
            } else {//如果是文件夹
                deleteAll(file_);
            }
        }

        //删除自己
        file.delete();
    }
}
