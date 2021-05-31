

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.ning.http.client.FilePart;

import utils.BizConstants;
/**
 * 测试接收接口
 * 
 * @ClassName: TestUrl 
 * @author: wangsm
 * @date: 2016年3月25日 上午10:01:28
 */
public class TestUrl {
	public static void main(String[] args) throws Exception {
		String userinfo="{\"name\":\"123\",\"password\":\"123456\",\"idcard\":\"130654654738272746\",\"birthdate\":\"2015-05-09\""+
				",\"sex\":\"男\",\"address\":\"北京市东城区东四十条中汇广场22层\",\"phone\":\"13283928372\"}";
		String detail="{\"idcard\":\"130654654738272746\",\"huiyuanziliao_tizhong\":\"56\",\"lizifenxi_na\":\"12\",\"huiyuanziliao_nianling\":\"12\"}";
		String url="http://localhost:9000/wjcloud/heathdata";
		SubmitPost(url,"维极接口方案.pdf",userinfo,detail,"E:/维极接口方案.pdf");
	} 
	/**
	 * 上传文件
	 *
	 * @Title: uploadFile 
	 * @param file
	 * @param url
	 * @return: void
	 */
	 public static void SubmitPost(String url,String filename,String userinfo,String detail, String filepath){  
         
	        HttpClient httpclient = new DefaultHttpClient();  
	          
	        try {  
	        	//file1与file2在同一个文件夹下 filepath是该文件夹指定的路径  
	            HttpPost httppost = new HttpPost(url);  
	            FileBody bin = new FileBody(new File(filepath));  
	            StringBody user = new StringBody(userinfo,Charset.forName("UTF-8"));  
	            StringBody det=new StringBody(detail,Charset.forName("UTF-8"));
	            MultipartEntity reqEntity = new MultipartEntity();  
	            reqEntity.addPart("pdf", bin);//file为请求后台的File upload;属性      
	            reqEntity.addPart("userinfo", user);//filename1为请求后台的普通参数;属性     
	            reqEntity.addPart("detail", det);
	            httppost.setEntity(reqEntity);
	            HttpResponse response = httpclient.execute(httppost);  
	            int statusCode = response.getStatusLine().getStatusCode();  
	            if(statusCode == HttpStatus.SC_OK){  
	                System.out.println("服务器正常响应.....");  
	                HttpEntity resEntity = response.getEntity();  
	                System.out.println(EntityUtils.toString(resEntity));//httpclient自带的工具类读取返回数据  
	                System.out.println(resEntity.getContent());     
	                EntityUtils.consume(resEntity);  
	            }  
	            } catch (ParseException e) {  
	                // TODO Auto-generated catch block  
	                e.printStackTrace();  
	            } catch (IOException e) {  
	                // TODO Auto-generated catch block  
	                e.printStackTrace();  
	            } finally {  
	                try {   
	                    httpclient.getConnectionManager().shutdown();   
	                } catch (Exception ignore) {  
	                      
	                }  
	            }  
	        }  
	
}
