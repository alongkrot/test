import java.net.*; 
import java.io.*;
import java.util.*;
class insertWeb{
public static void main(String [] unused){
String s = "https://www.set.or.th/set/historicaltrading.do"+
           "?symbol=MBK&ssoPageId=2&language=us&country=US";
String content = "";
    try{
   URL url = new URL(s);
   InputStream imput = url.openStream();
    while (true) {
        int k = imput.read();
        if(k == -1){break;} 
        
        content = content + (char)k; 
    }
}catch(Exception e){}
    
    int start = content.indexOf("<tbody>");
    int stop = content.indexOf("</tbody>");
    String name = content.substring(start , stop);
    System.out.println(name);
}
}