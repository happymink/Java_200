package javastudy.File;

import java.io.File;

// 디렉토리에 포함된 파일과 디렉토리의 목록을 보여주는 예제 
public class FileEx2 {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("USAGE : java FileEx2 DIRECTORY");
            System.exit(0);
        }

        File f = new File(args[0]);

        if (!f.exists() || !f.isDirectory()){
            System.out.println("Invalid directory");
            System.exit(0);
        }

        //파일 객체배열 생성
        File[] files = f.listFiles();

        for(int i = 0; i < files.length; i++){
            String fileName = files[i].getName();
            System.out.println(files[i].isDirectory() ? "["+fileName+"]" : fileName);
        }

    }
}
