package javastudy.File;

import java.io.File;
import java.io.IOException;

// 파일의 경로를 출력하는 예제
public class FileEx1 {
    public static void main(String[] args) {
        File f = new File("C:\\Java_200\\src\\javastudy\\File\\FileEx1.java");
        String fileName = f.getName();
        int pos = fileName.lastIndexOf(".");



//        //이미 존재하는 파일을 참조할 때
//        File f3 = new File("C:\\Java_200\\src\\javastudy\\Ex14.java");
//

        //기존에 없는 파일을 새로 생성
        File f2 = new File("C:\\Java_200\\src\\javastudy\\NewFile.java");
        try {
            f2.createNewFile();
        }
        catch (IOException e){};



        System.out.println("경로를 제외한 파일 이름 : " + f.getName());
        System.out.println("확장자를 제외한 파일 이름 : " + fileName.substring(0,pos));
        System.out.println("확장자 : " + fileName.substring(pos+1));

        System.out.println("경로를 포함한 파일 이름 : " + f.getPath());
        System.out.println("파일의 절대경로" + f.getAbsolutePath());
        try {
            System.out.println("파일의 정규경로" + f.getCanonicalPath());
        }
        catch (IOException e){};
        System.out.println("파일이 속해있는 디렉토리 " + f.getParent());

        System.out.println();


    }
}
