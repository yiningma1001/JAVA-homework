package src;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

	public class counthash {
//定义得到依次访问并更新后的messsagedigest文件的函数
	    public static byte[] dfs(String path) throws Exception{
	        File dir = new File(path);
	        File[] fs = dir.listFiles();
	        List fslist = Arrays.asList(fs);
	        //定义按文件名排序的访问方式，文件夹都在文件后访问
	        Collections.sort(fslist, new Comparator<File>() {
	        @Override
	        public int compare(File f1, File f2) {
	              if (f1.isDirectory() && f2.isFile())
	                   return 1;
	              if (f1.isFile() && f2.isDirectory())
	                   return -1;
	              return f1.getName().compareTo(f2.getName());
	         }
	        });	        
	        //定义生成hash的变量和缓冲区变量
	        MessageDigest complete = MessageDigest.getInstance("SHA-1");
	        byte[] buffer = new byte[1024];
	        for(int i = 0; i < fs.length; i++) {
	        	//对于文件，阅读文件到缓冲区并更新messagedigest类的变量
	            if(fs[i].isFile()) {
	                System.out.println("file " + fs[i].getName());
	                File file =fs[i];
	                FileInputStream is = new FileInputStream(file);
	                int numRead;
	    	        do {	    	            
	    	            numRead = is.read(buffer);
	    	            if (numRead > 0) {	    	                
	    	                complete.update(buffer, 0, numRead);
	    	            }	    	            
	    	        }
	    	        while (numRead != -1);    	       
	    	        is.close();	    	        
	            }
	            //对于文件夹，打印文件夹名字并递归调用访问函数
	            if(fs[i].isDirectory()) {
	                System.out.println("directory " + fs[i].getName());
	                dfs(path + File.separator + fs[i].getName());
	            }	        
	        }
	        return complete.digest();
	    }

	    public static void main(String[] args) {
	        try {
	            byte[] sha1=dfs("/Users/mayining/Desktop/new_count");//新建一个包含一个文件夹和两个文件的文件夹以测试
	        String result="";
	        for (int j = 0; j < sha1.length; j++) {
	                    result += Integer.toString(sha1[j]&0xff, 16);//将得到的结果转换为字符串输出
	        }
	        System.out.println("更新后的总hash值为："+result);
	        } catch (Exception e) {//捕捉异常
	            e.printStackTrace();
	        }
	    }
	}

