package models;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import models.mappers.WebHraDetailMapper;

import org.apache.ibatis.session.SqlSession;
import org.hibernate.annotations.GenericGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aton.db.SessionFactory;
/**
 * 体检数据实体类
 * 
 * @ClassName: WebHraDetail 
 * @author: wangsm
 * @date: 2016年3月24日 下午5:03:18
 */
public class WebHraDetail implements java.io.Serializable {
	//private static final Logger log = LoggerFactory.getLogger(WebHraDetail.class);
	public static final String TABLE_NAME="webhra_detail";
	@Id
	public  String	did;
	public	String	idcard;
	public	String	packageid;
	public	String	deviceid;
	public	String	devicemodel;
	public	String	pdfname;
	public  Date  	createtime;
	public	String	huiyuanziliao_jianchariqi;
	public	String	huiyuanziliao_jianchashijian;
	public	String	huiyuanziliao_songjianyishi;
	public	String	huiyuanziliao_nianling;
	public	String	rtc_shengao;
	public	String	rtc_tizhong;
	public	String	rtc_bmi;
	public	String	rtc_gaoya;
	public	String	rtc_diya;
	public	String	rtc_xinlv;
	public	String	rtc_xueyang;
	public	String	rtc_zhifanghanliang;
	public	String	rtc_jichudaixie;
	public	String	lizifenxi_na;
	public	String	lizifenxi_jia;
	public	String	lizifenxi_lv;
	public	String	lizifenxi_mei;
	public	String	lizifenxi_gai;
	public	String	lizifenxi_lin;
	public	String	lizifenxi_tie;
	public	String	shenjingdizhi_wuqingsean;
	public	String	shenjingdizhi_duobaan;
	public	String	shenjingdizhi_erchafenan;
	public	String	shenjingdizhi_yixuandanjian;
	public	String	suanjianpingheng_ph;
	public	String	suanjianpingheng_hco3;
	public	String	suanjianpingheng_paco2;
	public	String	suanjianpingheng__po2;
	public	String	suanjianpingheng_h;
	public	String	suanjianpingheng_sbe;
	public	String	suanjianpingheng_iso2;
	public	String	jisushuiping_cujiazhuangxian;
	public	String	jisushuiping_culuanpao;	
	public	String	jisushuiping_tuoqingbiaoxiongtong;
	public	String	jisushuiping_pizhichun;
	public	String	jisushuiping_quangutong;
	public	String	jisushuiping_shenshangxian;
	public	String	jisushuiping_cijisu;
	public	String	jisushuiping__gaowanjisu;
	public	String	jisushuiping_yidaosu;
	public	String	jisushuiping_jiazhuangpangxian;
	public	String	jisushuiping_jiazhuangxian;
	public	String	jisushuiping__kangliniao;
	public	String	jisushuiping_cushenshangxianpizhi;
	public	String	ziyouji_guoyuangyaxiaosuan;
	public	String	ziyouji_xiaofenzi;
	public	String	ziyouji_guoyanghuaqing;
	public	String	ziyouji_chaoyangyinlizi;
	public	String	ziyouji_qiangziyouji;
	public	String	shenghuazhibiao_ganyousanzhi;
	public	String	shenghuazhibiao_gucaozhuananmei;
	public	String	shenghuazhibiao_jianxinglinsuanmei;
	public	String	shenghuazhibiao_xuetang;
	public	String	shenghuazhibiao_LDLdimiduzhidanbai;
	public	String	fengxian_huxixitong_zhuangtai;
	public	String	fengxian_huxixitong_zhuangtai_shuoming;
	public	String	fengxian_xiaohuaxitong_zhuangtai;
	public	String	fengxian_xiaohuaxitong_zhuangtai_shuoming;
	public	String	fengxian_mianyixitong_zhuangtai;
	public	String	fengxian_mianyixitong_zhuangtai_shuoming;
	public	String	fengxian_miniaoshengzhixitong_zhuangtai;
	public	String	fengxian_miniaoshengzhixitong_shuoming;
	public	String	fengxian_gugexitong_zhuangtai;
	public	String	fengxian_gugexitong_shuoming;
	public	String	fengxian_xinxueguanxitong_zhuangtai;
	public	String	fengxian_xinxueguanxitong_shuoming;
	public	String	fengxian_neifenmixitong_zhuangtai;
	public	String	fengxian_neifenmixitong_shuoming;
	public	String	fengxian_shenjingxitong_zhuagntai;
	public	String	fengxian_shenjingxitong_shuoming;
	public	String	fengxian_ziyouji_zhuangtai;
	public	String	fengxian_ziyouji_shuoming;
	public	String	fengxian_guomin_zhuangtai;
	public	String	fengxian_guomin_shuoming;
	public	String	fengxian_neihuanjing_zhuangtai;
	public	String	fengxian_neihuanjing_shuoming;
	public	String	fengxian_erbihou_zhuangtai;
	public	String	fengxian_erbihou_shuoming;
	public	String	fengxian_pifu_zhuangtai;
	public	String	fengxian_pifu_shuoming;
	public	String	fengxian_xipaobianxing_zhuangtai;
	public	String	fengxian_xipaobianxing_shuoming;
	public	String	fengxian_ganran_zhuangtai;
	public	String	fengxian_ganran_shuoming;
	public	String	zangqihuoxing_shierzhichang;
	public	String	zangqihuoxing_zhiqiguan;
	public	String	zangqihuoxing_zuofeishangye;
	public	String	zangqihuoxing_youfeishangye;
	public	String	zangqihuoxing_shengjiechang;
	public	String	zangqihuoxing_zuoshanghedou;
	public	String	zangqihuoxing_youshanghedou;
	public	String	zangqihuoxing_youyanheleixian;
	public	String	zangqihuoxing_zuoyanheleixian;
	public	String	zangqihuoxing_xiongxian;
	public	String	zangqihuoxing_zuohenggemoshenjing;
	public	String	zangqihuoxing_youcegeshenjin;
	public	String	zangqihuoxing_weiquyu;
	public	String	zangqihuoxing_dannang;
	public	String	zangqihuoxing_zuotuoyexian;
	public	String	zangqihuoxing_youceshangheyachi;
	public	String	zangqihuoxing_zuocexiaheyachi;
	public	String	zangqihuoxing_youtuoyexian;
	public	String	zangqihuoxing_zuoxi;
	public	String	zangqihuoxing_youxi;
	public	String	zangqihuoxing_xiongbu_zuoce;
	public	String	zangqihuoxing_zuoceeyepiceng;
	public	String	zangqihuoxing_youceeyepicheng;
	public	String	zangqihuoxing_qianliexian;
	public	String	zangqihuoxing_zigong;
	public	String	zangqihuoxing_pangguang;
	public	String	zangqihuoxing_gaowan;
	public	String	zangqihuoxing_luancao;
	public	String	zangqihuoxing_zuo_gaowan;
	public	String	zangqihuoxing_you_gaowan;
	public	String	zangqihuoxing_zuo_luancao;
	public	String	zangqihuoxing_you_luancao;
	public	String	zangqihuoxing_zuofeixiaye;
	public	String	zangqihuoxing_youfeixiaye;
	public	String	zangqihuoxing_jiangjiechang;
	public	String	zangqihuoxing_youcebiqianting;
	public	String	zangqihuoxing_zuocebiqianting;
	public	String	zangqihuoxing_ganzuoye_danguan;
	public	String	zangqihuoxing_shidao_xiaduan;
	public	String	zangqihuoxing_yixian;
	public	String	zangqihuoxing_jiechang_ganqu;
	public	String	zangqihuoxing_zuoshen_shuniaoguan;
	public	String	zangqihuoxing_youshen_shuniaoguan;
	public	String	zangqihuoxing_xiongbu_youce;
	public	String	zangqihuoxing_zhichang;
	public	String	zangqihuoxing_pizang;
	public	String	zangqihuoxing_xinzang;
	public	String	zangqihuoxing_yizhuangjiechang;
	public	String	zangqihuoxing_mangchang_lanwei;
	public	String	zangqihuoxing_youfeizhongye;
	public	String	zangqihuoxing_xiaochang;
	public	String	zangqihuoxing_qiguan;
	public	String	zangqihuoxing_zuoer;
	public	String	zangqihuoxing_youer;
	public	String	zangqihuoxing_zuoce_jingbu;
	public	String	zangqihuoxing_youce_jingbu;
	public	String	zangqihuoxing_jiazhuangxian;
	public	String	zangqihuoxing_zuodatui_shenjingxueguanshu;
	public	String	zangqihuoxing_youdatui_shenjingxueguanshu;
	public	String	zangqihuoxing_zuoxiaotui_shenjinxueguanshu;
	public	String	zangqihuoxing_youxiaotui_shenjingxueguanshu;
	public	String	zangqihuoxing_zuoshou_shenjingxueguanshu;
	public	String	zangqihuoxing_youshou_shenjingxueguanshu;
	public	String	zangqihuoxing_zuoshangbi_shenjingxueguanshu;
	public	String	zangqihuoxing_youshangbi_shenjingxueguanshu;
	public	String	zangqihuoxing_zuoqianbi_shenjingxueguanshu;
	public	String	zangqihuoxing_youqianbi_shenjingxueguanshu;
	public	String	zangqihuoxing_zuojiao_shenjingxueguanshu;
	public	String	zangqihuoxing_youjiao_shenjingxueguanshu;
	public	String	zangqihuoxing_youce_shenshanxiansuizhi;
	public	String	zangqihuoxing_zuoce_shenshangxiansuizhi;
	public	String	zangqihuoxing_zuoce_nieye;
	public	String	zangqihuoxing_you_jingdongmai;
	public	String	zangqihuoxing_zuo_jingdongmai;
	public	String	zangqihuoxing_youce_nieye;
	public	String	zangqihuoxing_chuiti;
	public	String	zangqihuoxing_xiaqiunao;
	public	String	zangqihuoxing_qiunao;
	public	String	zangqihuoxing_jiazhuangxian_youye;
	public	String	zangqihuoxing_jiazhuangxian_zuoye;
	public	String	zangqihuoxing_youce_luneixueguan;
	public	String	zangqihuoxing_zuoce_luneixueguan;
	public	String	zangqihuoxing_shangqiangjingmai;
	public	String	zangqihuoxing_zhudongmai;
	public	String	zangqihuoxing_youxinshi;
	public	String	zangqihuoxing_zuoxinshi;
	public	String	zangqihuoxing_guanzhuangxueguan;
	public	String	zangqihuoxing_gan_youye;
	public	String	zangqihuoxing_shidao_shangduan;
	public	String	zangqihuoxing_youce_shenshangxianpizhi;
	public	String	zangqihuoxing_zuoce_shenshangxianpizhi;
	public	String	zangqihuoxing_jiechang_pi;
	public	String	zangqihuoxing_xinfeixunhuan;
	public	String	zangqihuoxing_gugexitong;
	public	String	zangqihuoxing_menmaixunhuan;
	public	String	zangqihuoxing_zuoce_bianyuanxitong;
	public	String	zangqihuoxing_youce_bianyuanxitong;
	public	String	zangqihuoxing_you_xingrenti;
	public	String	zangqihuoxing_zuo_xingrenti;
	public	String	zangqihuoxing_xiaqiangjingmai;
	public	String	zangqihuoxing_you_qiantingyaliganshouqi;
	public	String	zangqihuoxing_zuo_qiantingyaliganshouqi;
	public	String	zangqihuoxing_xinji;
	public	String	zangqihuoxing_c1;
	public	String	zangqihuoxing_c2;
	public	String	zangqihuoxing_c3;
	public	String	zangqihuoxing_c4;
	public	String	zangqihuoxing_c5;
	public	String	zangqihuoxing_c6;
	public	String	zangqihuoxing_c7;
	public	String	zangqihuoxing_c8;
	public	String	zangqihuoxing_th1;
	public	String	zangqihuoxing_th2;
	public	String	zangqihuoxing_th3;
	public	String	zangqihuoxing_th4;
	public	String	zangqihuoxing_th5;
	public	String	zangqihuoxing_th6;
	public	String	zangqihuoxing_th7;
	public	String	zangqihuoxing_th8;
	public	String	zangqihuoxing_th9;
	public	String	zangqihuoxing_th10;
	public	String	zangqihuoxing_th11;
	public	String	zangqihuoxing_th12;
	public	String	zangqihuoxing_l1;
	public	String	zangqihuoxing_l2;
	public	String	zangqihuoxing_l3;
	public	String	zangqihuoxing_l4;
	public	String	zangqihuoxing_l5;
	public	String	zangqihuoxing_s1;
	public	String	zangqihuoxing_s2;
	public	String	zangqihuoxing_s3;
	public	String	zangqihuoxing_s4;
	public	String	zangqihuoxing_s5;
	public	String	zangqihuoxing_col;
	public	String	yishi_jinzhideshiwu;
	public	String	weiyingyang;
	public	String	yishi_tuijiandeshiwu;
	public	String	yishi_pengtiaofangfa;
	public	String	rentichengfenfenxi;
	public	String	yishi_yishijianyi;
	public	String	yishi_xiangguanyishi;
	public	String	tuijian_yinshi;
	public	String	yisheng_zonghefenxipingu_panduan;
	public	String	zhiliao_jianyi;
	
	public WebHraDetail(){
		
	}

	public WebHraDetail(String did, String idcard, String packageid,
			String deviceid, String devicemodel, String pdfname,
			Date createtime, String huiyuanziliao_jianchariqi,
			String huiyuanziliao_jianchashijian,
			String huiyuanziliao_songjianyishi, String huiyuanziliao_nianling,
			String rtc_shengao, String rtc_tizhong, String rtc_bmi,
			String rtc_gaoya, String rtc_diya, String rtc_xinlv,
			String rtc_xueyang, String rtc_zhifanghanliang,
			String rtc_jichudaixie, String lizifenxi_na, String lizifenxi_jia,
			String lizifenxi_lv, String lizifenxi_mei, String lizifenxi_gai,
			String lizifenxi_lin, String lizifenxi_tie,
			String shenjingdizhi_wuqingsean, String shenjingdizhi_duobaan,
			String shenjingdizhi_erchafenan,
			String shenjingdizhi_yixuandanjian, String suanjianpingheng_ph,
			String suanjianpingheng_hco3, String suanjianpingheng_paco2,
			String suanjianpingheng__po2, String suanjianpingheng_h,
			String suanjianpingheng_sbe, String suanjianpingheng_iso2,
			String jisushuiping_cujiazhuangxian, String jisushuiping_culuanpao,
			String jisushuiping_tuoqingbiaoxiongtong,
			String jisushuiping_pizhichun, String jisushuiping_quangutong,
			String jisushuiping_shenshangxian, String jisushuiping_cijisu,
			String jisushuiping__gaowanjisu, String jisushuiping_yidaosu,
			String jisushuiping_jiazhuangpangxian,
			String jisushuiping_jiazhuangxian, String jisushuiping__kangliniao,
			String jisushuiping_cushenshangxianpizhi,
			String ziyouji_guoyuangyaxiaosuan, String ziyouji_xiaofenzi,
			String ziyouji_guoyanghuaqing, String ziyouji_chaoyangyinlizi,
			String ziyouji_qiangziyouji, String shenghuazhibiao_ganyousanzhi,
			String shenghuazhibiao_gucaozhuananmei,
			String shenghuazhibiao_jianxinglinsuanmei,
			String shenghuazhibiao_xuetang,
			String shenghuazhibiao_LDLdimiduzhidanbai,
			String fengxian_huxixitong_zhuangtai,
			String fengxian_huxixitong_zhuangtai_shuoming,
			String fengxian_xiaohuaxitong_zhuangtai,
			String fengxian_xiaohuaxitong_zhuangtai_shuoming,
			String fengxian_mianyixitong_zhuangtai,
			String fengxian_mianyixitong_zhuangtai_shuoming,
			String fengxian_miniaoshengzhixitong_zhuangtai,
			String fengxian_miniaoshengzhixitong_shuoming,
			String fengxian_gugexitong_zhuangtai,
			String fengxian_gugexitong_shuoming,
			String fengxian_xinxueguanxitong_zhuangtai,
			String fengxian_xinxueguanxitong_shuoming,
			String fengxian_neifenmixitong_zhuangtai,
			String fengxian_neifenmixitong_shuoming,
			String fengxian_shenjingxitong_zhuagntai,
			String fengxian_shenjingxitong_shuoming,
			String fengxian_ziyouji_zhuangtai,
			String fengxian_ziyouji_shuoming, String fengxian_guomin_zhuangtai,
			String fengxian_guomin_shuoming,
			String fengxian_neihuanjing_zhuangtai,
			String fengxian_neihuanjing_shuoming,
			String fengxian_erbihou_zhuangtai,
			String fengxian_erbihou_shuoming, String fengxian_pifu_zhuangtai,
			String fengxian_pifu_shuoming,
			String fengxian_xipaobianxing_zhuangtai,
			String fengxian_xipaobianxing_shuoming,
			String fengxian_ganran_zhuangtai, String fengxian_ganran_shuoming,
			String zangqihuoxing_shierzhichang, String zangqihuoxing_zhiqiguan,
			String zangqihuoxing_zuofeishangye,
			String zangqihuoxing_youfeishangye,
			String zangqihuoxing_shengjiechang,
			String zangqihuoxing_zuoshanghedou,
			String zangqihuoxing_youshanghedou,
			String zangqihuoxing_youyanheleixian,
			String zangqihuoxing_zuoyanheleixian,
			String zangqihuoxing_xiongxian,
			String zangqihuoxing_zuohenggemoshenjing,
			String zangqihuoxing_youcegeshenjin, String zangqihuoxing_weiquyu,
			String zangqihuoxing_dannang, String zangqihuoxing_zuotuoyexian,
			String zangqihuoxing_youceshangheyachi,
			String zangqihuoxing_zuocexiaheyachi,
			String zangqihuoxing_youtuoyexian, String zangqihuoxing_zuoxi,
			String zangqihuoxing_youxi, String zangqihuoxing_xiongbu_zuoce,
			String zangqihuoxing_zuoceeyepiceng,
			String zangqihuoxing_youceeyepicheng,
			String zangqihuoxing_qianliexian, String zangqihuoxing_zigong,
			String zangqihuoxing_pangguang, String zangqihuoxing_gaowan,
			String zangqihuoxing_luancao, String zangqihuoxing_zuo_gaowan,
			String zangqihuoxing_you_gaowan, String zangqihuoxing_zuo_luancao,
			String zangqihuoxing_you_luancao, String zangqihuoxing_zuofeixiaye,
			String zangqihuoxing_youfeixiaye,
			String zangqihuoxing_jiangjiechang,
			String zangqihuoxing_youcebiqianting,
			String zangqihuoxing_zuocebiqianting,
			String zangqihuoxing_ganzuoye_danguan,
			String zangqihuoxing_shidao_xiaduan, String zangqihuoxing_yixian,
			String zangqihuoxing_jiechang_ganqu,
			String zangqihuoxing_zuoshen_shuniaoguan,
			String zangqihuoxing_youshen_shuniaoguan,
			String zangqihuoxing_xiongbu_youce, String zangqihuoxing_zhichang,
			String zangqihuoxing_pizang, String zangqihuoxing_xinzang,
			String zangqihuoxing_yizhuangjiechang,
			String zangqihuoxing_mangchang_lanwei,
			String zangqihuoxing_youfeizhongye, String zangqihuoxing_xiaochang,
			String zangqihuoxing_qiguan, String zangqihuoxing_zuoer,
			String zangqihuoxing_youer, String zangqihuoxing_zuoce_jingbu,
			String zangqihuoxing_youce_jingbu,
			String zangqihuoxing_jiazhuangxian,
			String zangqihuoxing_zuodatui_shenjingxueguanshu,
			String zangqihuoxing_youdatui_shenjingxueguanshu,
			String zangqihuoxing_zuoxiaotui_shenjinxueguanshu,
			String zangqihuoxing_youxiaotui_shenjingxueguanshu,
			String zangqihuoxing_zuoshou_shenjingxueguanshu,
			String zangqihuoxing_youshou_shenjingxueguanshu,
			String zangqihuoxing_zuoshangbi_shenjingxueguanshu,
			String zangqihuoxing_youshangbi_shenjingxueguanshu,
			String zangqihuoxing_zuoqianbi_shenjingxueguanshu,
			String zangqihuoxing_youqianbi_shenjingxueguanshu,
			String zangqihuoxing_zuojiao_shenjingxueguanshu,
			String zangqihuoxing_youjiao_shenjingxueguanshu,
			String zangqihuoxing_youce_shenshanxiansuizhi,
			String zangqihuoxing_zuoce_shenshangxiansuizhi,
			String zangqihuoxing_zuoce_nieye,
			String zangqihuoxing_you_jingdongmai,
			String zangqihuoxing_zuo_jingdongmai,
			String zangqihuoxing_youce_nieye, String zangqihuoxing_chuiti,
			String zangqihuoxing_xiaqiunao, String zangqihuoxing_qiunao,
			String zangqihuoxing_jiazhuangxian_youye,
			String zangqihuoxing_jiazhuangxian_zuoye,
			String zangqihuoxing_youce_luneixueguan,
			String zangqihuoxing_zuoce_luneixueguan,
			String zangqihuoxing_shangqiangjingmai,
			String zangqihuoxing_zhudongmai, String zangqihuoxing_youxinshi,
			String zangqihuoxing_zuoxinshi,
			String zangqihuoxing_guanzhuangxueguan,
			String zangqihuoxing_gan_youye,
			String zangqihuoxing_shidao_shangduan,
			String zangqihuoxing_youce_shenshangxianpizhi,
			String zangqihuoxing_zuoce_shenshangxianpizhi,
			String zangqihuoxing_jiechang_pi,
			String zangqihuoxing_xinfeixunhuan,
			String zangqihuoxing_gugexitong,
			String zangqihuoxing_menmaixunhuan,
			String zangqihuoxing_zuoce_bianyuanxitong,
			String zangqihuoxing_youce_bianyuanxitong,
			String zangqihuoxing_you_xingrenti,
			String zangqihuoxing_zuo_xingrenti,
			String zangqihuoxing_xiaqiangjingmai,
			String zangqihuoxing_you_qiantingyaliganshouqi,
			String zangqihuoxing_zuo_qiantingyaliganshouqi,
			String zangqihuoxing_xinji, String zangqihuoxing_c1,
			String zangqihuoxing_c2, String zangqihuoxing_c3,
			String zangqihuoxing_c4, String zangqihuoxing_c5,
			String zangqihuoxing_c6, String zangqihuoxing_c7,
			String zangqihuoxing_c8, String zangqihuoxing_th1,
			String zangqihuoxing_th2, String zangqihuoxing_th3,
			String zangqihuoxing_th4, String zangqihuoxing_th5,
			String zangqihuoxing_th6, String zangqihuoxing_th7,
			String zangqihuoxing_th8, String zangqihuoxing_th9,
			String zangqihuoxing_th10, String zangqihuoxing_th11,
			String zangqihuoxing_th12, String zangqihuoxing_l1,
			String zangqihuoxing_l2, String zangqihuoxing_l3,
			String zangqihuoxing_l4, String zangqihuoxing_l5,
			String zangqihuoxing_s1, String zangqihuoxing_s2,
			String zangqihuoxing_s3, String zangqihuoxing_s4,
			String zangqihuoxing_s5, String zangqihuoxing_col,
			String yishi_jinzhideshiwu, String weiyingyang,
			String yishi_tuijiandeshiwu, String yishi_pengtiaofangfa,
			String rentichengfenfenxi, String yishi_yishijianyi,
			String yishi_xiangguanyishi, String tuijian_yinshi,
			String yisheng_zonghefenxipingu_panduan, String zhiliao_jianyi) {
		super();
		this.did = did;
		this.idcard = idcard;
		this.packageid = packageid;
		this.deviceid = deviceid;
		this.devicemodel = devicemodel;
		this.pdfname = pdfname;
		this.createtime = createtime;
		this.huiyuanziliao_jianchariqi = huiyuanziliao_jianchariqi;
		this.huiyuanziliao_jianchashijian = huiyuanziliao_jianchashijian;
		this.huiyuanziliao_songjianyishi = huiyuanziliao_songjianyishi;
		this.huiyuanziliao_nianling = huiyuanziliao_nianling;
		this.rtc_shengao = rtc_shengao;
		this.rtc_tizhong = rtc_tizhong;
		this.rtc_bmi = rtc_bmi;
		this.rtc_gaoya = rtc_gaoya;
		this.rtc_diya = rtc_diya;
		this.rtc_xinlv = rtc_xinlv;
		this.rtc_xueyang = rtc_xueyang;
		this.rtc_zhifanghanliang = rtc_zhifanghanliang;
		this.rtc_jichudaixie = rtc_jichudaixie;
		this.lizifenxi_na = lizifenxi_na;
		this.lizifenxi_jia = lizifenxi_jia;
		this.lizifenxi_lv = lizifenxi_lv;
		this.lizifenxi_mei = lizifenxi_mei;
		this.lizifenxi_gai = lizifenxi_gai;
		this.lizifenxi_lin = lizifenxi_lin;
		this.lizifenxi_tie = lizifenxi_tie;
		this.shenjingdizhi_wuqingsean = shenjingdizhi_wuqingsean;
		this.shenjingdizhi_duobaan = shenjingdizhi_duobaan;
		this.shenjingdizhi_erchafenan = shenjingdizhi_erchafenan;
		this.shenjingdizhi_yixuandanjian = shenjingdizhi_yixuandanjian;
		this.suanjianpingheng_ph = suanjianpingheng_ph;
		this.suanjianpingheng_hco3 = suanjianpingheng_hco3;
		this.suanjianpingheng_paco2 = suanjianpingheng_paco2;
		this.suanjianpingheng__po2 = suanjianpingheng__po2;
		this.suanjianpingheng_h = suanjianpingheng_h;
		this.suanjianpingheng_sbe = suanjianpingheng_sbe;
		this.suanjianpingheng_iso2 = suanjianpingheng_iso2;
		this.jisushuiping_cujiazhuangxian = jisushuiping_cujiazhuangxian;
		this.jisushuiping_culuanpao = jisushuiping_culuanpao;
		this.jisushuiping_tuoqingbiaoxiongtong = jisushuiping_tuoqingbiaoxiongtong;
		this.jisushuiping_pizhichun = jisushuiping_pizhichun;
		this.jisushuiping_quangutong = jisushuiping_quangutong;
		this.jisushuiping_shenshangxian = jisushuiping_shenshangxian;
		this.jisushuiping_cijisu = jisushuiping_cijisu;
		this.jisushuiping__gaowanjisu = jisushuiping__gaowanjisu;
		this.jisushuiping_yidaosu = jisushuiping_yidaosu;
		this.jisushuiping_jiazhuangpangxian = jisushuiping_jiazhuangpangxian;
		this.jisushuiping_jiazhuangxian = jisushuiping_jiazhuangxian;
		this.jisushuiping__kangliniao = jisushuiping__kangliniao;
		this.jisushuiping_cushenshangxianpizhi = jisushuiping_cushenshangxianpizhi;
		this.ziyouji_guoyuangyaxiaosuan = ziyouji_guoyuangyaxiaosuan;
		this.ziyouji_xiaofenzi = ziyouji_xiaofenzi;
		this.ziyouji_guoyanghuaqing = ziyouji_guoyanghuaqing;
		this.ziyouji_chaoyangyinlizi = ziyouji_chaoyangyinlizi;
		this.ziyouji_qiangziyouji = ziyouji_qiangziyouji;
		this.shenghuazhibiao_ganyousanzhi = shenghuazhibiao_ganyousanzhi;
		this.shenghuazhibiao_gucaozhuananmei = shenghuazhibiao_gucaozhuananmei;
		this.shenghuazhibiao_jianxinglinsuanmei = shenghuazhibiao_jianxinglinsuanmei;
		this.shenghuazhibiao_xuetang = shenghuazhibiao_xuetang;
		this.shenghuazhibiao_LDLdimiduzhidanbai = shenghuazhibiao_LDLdimiduzhidanbai;
		this.fengxian_huxixitong_zhuangtai = fengxian_huxixitong_zhuangtai;
		this.fengxian_huxixitong_zhuangtai_shuoming = fengxian_huxixitong_zhuangtai_shuoming;
		this.fengxian_xiaohuaxitong_zhuangtai = fengxian_xiaohuaxitong_zhuangtai;
		this.fengxian_xiaohuaxitong_zhuangtai_shuoming = fengxian_xiaohuaxitong_zhuangtai_shuoming;
		this.fengxian_mianyixitong_zhuangtai = fengxian_mianyixitong_zhuangtai;
		this.fengxian_mianyixitong_zhuangtai_shuoming = fengxian_mianyixitong_zhuangtai_shuoming;
		this.fengxian_miniaoshengzhixitong_zhuangtai = fengxian_miniaoshengzhixitong_zhuangtai;
		this.fengxian_miniaoshengzhixitong_shuoming = fengxian_miniaoshengzhixitong_shuoming;
		this.fengxian_gugexitong_zhuangtai = fengxian_gugexitong_zhuangtai;
		this.fengxian_gugexitong_shuoming = fengxian_gugexitong_shuoming;
		this.fengxian_xinxueguanxitong_zhuangtai = fengxian_xinxueguanxitong_zhuangtai;
		this.fengxian_xinxueguanxitong_shuoming = fengxian_xinxueguanxitong_shuoming;
		this.fengxian_neifenmixitong_zhuangtai = fengxian_neifenmixitong_zhuangtai;
		this.fengxian_neifenmixitong_shuoming = fengxian_neifenmixitong_shuoming;
		this.fengxian_shenjingxitong_zhuagntai = fengxian_shenjingxitong_zhuagntai;
		this.fengxian_shenjingxitong_shuoming = fengxian_shenjingxitong_shuoming;
		this.fengxian_ziyouji_zhuangtai = fengxian_ziyouji_zhuangtai;
		this.fengxian_ziyouji_shuoming = fengxian_ziyouji_shuoming;
		this.fengxian_guomin_zhuangtai = fengxian_guomin_zhuangtai;
		this.fengxian_guomin_shuoming = fengxian_guomin_shuoming;
		this.fengxian_neihuanjing_zhuangtai = fengxian_neihuanjing_zhuangtai;
		this.fengxian_neihuanjing_shuoming = fengxian_neihuanjing_shuoming;
		this.fengxian_erbihou_zhuangtai = fengxian_erbihou_zhuangtai;
		this.fengxian_erbihou_shuoming = fengxian_erbihou_shuoming;
		this.fengxian_pifu_zhuangtai = fengxian_pifu_zhuangtai;
		this.fengxian_pifu_shuoming = fengxian_pifu_shuoming;
		this.fengxian_xipaobianxing_zhuangtai = fengxian_xipaobianxing_zhuangtai;
		this.fengxian_xipaobianxing_shuoming = fengxian_xipaobianxing_shuoming;
		this.fengxian_ganran_zhuangtai = fengxian_ganran_zhuangtai;
		this.fengxian_ganran_shuoming = fengxian_ganran_shuoming;
		this.zangqihuoxing_shierzhichang = zangqihuoxing_shierzhichang;
		this.zangqihuoxing_zhiqiguan = zangqihuoxing_zhiqiguan;
		this.zangqihuoxing_zuofeishangye = zangqihuoxing_zuofeishangye;
		this.zangqihuoxing_youfeishangye = zangqihuoxing_youfeishangye;
		this.zangqihuoxing_shengjiechang = zangqihuoxing_shengjiechang;
		this.zangqihuoxing_zuoshanghedou = zangqihuoxing_zuoshanghedou;
		this.zangqihuoxing_youshanghedou = zangqihuoxing_youshanghedou;
		this.zangqihuoxing_youyanheleixian = zangqihuoxing_youyanheleixian;
		this.zangqihuoxing_zuoyanheleixian = zangqihuoxing_zuoyanheleixian;
		this.zangqihuoxing_xiongxian = zangqihuoxing_xiongxian;
		this.zangqihuoxing_zuohenggemoshenjing = zangqihuoxing_zuohenggemoshenjing;
		this.zangqihuoxing_youcegeshenjin = zangqihuoxing_youcegeshenjin;
		this.zangqihuoxing_weiquyu = zangqihuoxing_weiquyu;
		this.zangqihuoxing_dannang = zangqihuoxing_dannang;
		this.zangqihuoxing_zuotuoyexian = zangqihuoxing_zuotuoyexian;
		this.zangqihuoxing_youceshangheyachi = zangqihuoxing_youceshangheyachi;
		this.zangqihuoxing_zuocexiaheyachi = zangqihuoxing_zuocexiaheyachi;
		this.zangqihuoxing_youtuoyexian = zangqihuoxing_youtuoyexian;
		this.zangqihuoxing_zuoxi = zangqihuoxing_zuoxi;
		this.zangqihuoxing_youxi = zangqihuoxing_youxi;
		this.zangqihuoxing_xiongbu_zuoce = zangqihuoxing_xiongbu_zuoce;
		this.zangqihuoxing_zuoceeyepiceng = zangqihuoxing_zuoceeyepiceng;
		this.zangqihuoxing_youceeyepicheng = zangqihuoxing_youceeyepicheng;
		this.zangqihuoxing_qianliexian = zangqihuoxing_qianliexian;
		this.zangqihuoxing_zigong = zangqihuoxing_zigong;
		this.zangqihuoxing_pangguang = zangqihuoxing_pangguang;
		this.zangqihuoxing_gaowan = zangqihuoxing_gaowan;
		this.zangqihuoxing_luancao = zangqihuoxing_luancao;
		this.zangqihuoxing_zuo_gaowan = zangqihuoxing_zuo_gaowan;
		this.zangqihuoxing_you_gaowan = zangqihuoxing_you_gaowan;
		this.zangqihuoxing_zuo_luancao = zangqihuoxing_zuo_luancao;
		this.zangqihuoxing_you_luancao = zangqihuoxing_you_luancao;
		this.zangqihuoxing_zuofeixiaye = zangqihuoxing_zuofeixiaye;
		this.zangqihuoxing_youfeixiaye = zangqihuoxing_youfeixiaye;
		this.zangqihuoxing_jiangjiechang = zangqihuoxing_jiangjiechang;
		this.zangqihuoxing_youcebiqianting = zangqihuoxing_youcebiqianting;
		this.zangqihuoxing_zuocebiqianting = zangqihuoxing_zuocebiqianting;
		this.zangqihuoxing_ganzuoye_danguan = zangqihuoxing_ganzuoye_danguan;
		this.zangqihuoxing_shidao_xiaduan = zangqihuoxing_shidao_xiaduan;
		this.zangqihuoxing_yixian = zangqihuoxing_yixian;
		this.zangqihuoxing_jiechang_ganqu = zangqihuoxing_jiechang_ganqu;
		this.zangqihuoxing_zuoshen_shuniaoguan = zangqihuoxing_zuoshen_shuniaoguan;
		this.zangqihuoxing_youshen_shuniaoguan = zangqihuoxing_youshen_shuniaoguan;
		this.zangqihuoxing_xiongbu_youce = zangqihuoxing_xiongbu_youce;
		this.zangqihuoxing_zhichang = zangqihuoxing_zhichang;
		this.zangqihuoxing_pizang = zangqihuoxing_pizang;
		this.zangqihuoxing_xinzang = zangqihuoxing_xinzang;
		this.zangqihuoxing_yizhuangjiechang = zangqihuoxing_yizhuangjiechang;
		this.zangqihuoxing_mangchang_lanwei = zangqihuoxing_mangchang_lanwei;
		this.zangqihuoxing_youfeizhongye = zangqihuoxing_youfeizhongye;
		this.zangqihuoxing_xiaochang = zangqihuoxing_xiaochang;
		this.zangqihuoxing_qiguan = zangqihuoxing_qiguan;
		this.zangqihuoxing_zuoer = zangqihuoxing_zuoer;
		this.zangqihuoxing_youer = zangqihuoxing_youer;
		this.zangqihuoxing_zuoce_jingbu = zangqihuoxing_zuoce_jingbu;
		this.zangqihuoxing_youce_jingbu = zangqihuoxing_youce_jingbu;
		this.zangqihuoxing_jiazhuangxian = zangqihuoxing_jiazhuangxian;
		this.zangqihuoxing_zuodatui_shenjingxueguanshu = zangqihuoxing_zuodatui_shenjingxueguanshu;
		this.zangqihuoxing_youdatui_shenjingxueguanshu = zangqihuoxing_youdatui_shenjingxueguanshu;
		this.zangqihuoxing_zuoxiaotui_shenjinxueguanshu = zangqihuoxing_zuoxiaotui_shenjinxueguanshu;
		this.zangqihuoxing_youxiaotui_shenjingxueguanshu = zangqihuoxing_youxiaotui_shenjingxueguanshu;
		this.zangqihuoxing_zuoshou_shenjingxueguanshu = zangqihuoxing_zuoshou_shenjingxueguanshu;
		this.zangqihuoxing_youshou_shenjingxueguanshu = zangqihuoxing_youshou_shenjingxueguanshu;
		this.zangqihuoxing_zuoshangbi_shenjingxueguanshu = zangqihuoxing_zuoshangbi_shenjingxueguanshu;
		this.zangqihuoxing_youshangbi_shenjingxueguanshu = zangqihuoxing_youshangbi_shenjingxueguanshu;
		this.zangqihuoxing_zuoqianbi_shenjingxueguanshu = zangqihuoxing_zuoqianbi_shenjingxueguanshu;
		this.zangqihuoxing_youqianbi_shenjingxueguanshu = zangqihuoxing_youqianbi_shenjingxueguanshu;
		this.zangqihuoxing_zuojiao_shenjingxueguanshu = zangqihuoxing_zuojiao_shenjingxueguanshu;
		this.zangqihuoxing_youjiao_shenjingxueguanshu = zangqihuoxing_youjiao_shenjingxueguanshu;
		this.zangqihuoxing_youce_shenshanxiansuizhi = zangqihuoxing_youce_shenshanxiansuizhi;
		this.zangqihuoxing_zuoce_shenshangxiansuizhi = zangqihuoxing_zuoce_shenshangxiansuizhi;
		this.zangqihuoxing_zuoce_nieye = zangqihuoxing_zuoce_nieye;
		this.zangqihuoxing_you_jingdongmai = zangqihuoxing_you_jingdongmai;
		this.zangqihuoxing_zuo_jingdongmai = zangqihuoxing_zuo_jingdongmai;
		this.zangqihuoxing_youce_nieye = zangqihuoxing_youce_nieye;
		this.zangqihuoxing_chuiti = zangqihuoxing_chuiti;
		this.zangqihuoxing_xiaqiunao = zangqihuoxing_xiaqiunao;
		this.zangqihuoxing_qiunao = zangqihuoxing_qiunao;
		this.zangqihuoxing_jiazhuangxian_youye = zangqihuoxing_jiazhuangxian_youye;
		this.zangqihuoxing_jiazhuangxian_zuoye = zangqihuoxing_jiazhuangxian_zuoye;
		this.zangqihuoxing_youce_luneixueguan = zangqihuoxing_youce_luneixueguan;
		this.zangqihuoxing_zuoce_luneixueguan = zangqihuoxing_zuoce_luneixueguan;
		this.zangqihuoxing_shangqiangjingmai = zangqihuoxing_shangqiangjingmai;
		this.zangqihuoxing_zhudongmai = zangqihuoxing_zhudongmai;
		this.zangqihuoxing_youxinshi = zangqihuoxing_youxinshi;
		this.zangqihuoxing_zuoxinshi = zangqihuoxing_zuoxinshi;
		this.zangqihuoxing_guanzhuangxueguan = zangqihuoxing_guanzhuangxueguan;
		this.zangqihuoxing_gan_youye = zangqihuoxing_gan_youye;
		this.zangqihuoxing_shidao_shangduan = zangqihuoxing_shidao_shangduan;
		this.zangqihuoxing_youce_shenshangxianpizhi = zangqihuoxing_youce_shenshangxianpizhi;
		this.zangqihuoxing_zuoce_shenshangxianpizhi = zangqihuoxing_zuoce_shenshangxianpizhi;
		this.zangqihuoxing_jiechang_pi = zangqihuoxing_jiechang_pi;
		this.zangqihuoxing_xinfeixunhuan = zangqihuoxing_xinfeixunhuan;
		this.zangqihuoxing_gugexitong = zangqihuoxing_gugexitong;
		this.zangqihuoxing_menmaixunhuan = zangqihuoxing_menmaixunhuan;
		this.zangqihuoxing_zuoce_bianyuanxitong = zangqihuoxing_zuoce_bianyuanxitong;
		this.zangqihuoxing_youce_bianyuanxitong = zangqihuoxing_youce_bianyuanxitong;
		this.zangqihuoxing_you_xingrenti = zangqihuoxing_you_xingrenti;
		this.zangqihuoxing_zuo_xingrenti = zangqihuoxing_zuo_xingrenti;
		this.zangqihuoxing_xiaqiangjingmai = zangqihuoxing_xiaqiangjingmai;
		this.zangqihuoxing_you_qiantingyaliganshouqi = zangqihuoxing_you_qiantingyaliganshouqi;
		this.zangqihuoxing_zuo_qiantingyaliganshouqi = zangqihuoxing_zuo_qiantingyaliganshouqi;
		this.zangqihuoxing_xinji = zangqihuoxing_xinji;
		this.zangqihuoxing_c1 = zangqihuoxing_c1;
		this.zangqihuoxing_c2 = zangqihuoxing_c2;
		this.zangqihuoxing_c3 = zangqihuoxing_c3;
		this.zangqihuoxing_c4 = zangqihuoxing_c4;
		this.zangqihuoxing_c5 = zangqihuoxing_c5;
		this.zangqihuoxing_c6 = zangqihuoxing_c6;
		this.zangqihuoxing_c7 = zangqihuoxing_c7;
		this.zangqihuoxing_c8 = zangqihuoxing_c8;
		this.zangqihuoxing_th1 = zangqihuoxing_th1;
		this.zangqihuoxing_th2 = zangqihuoxing_th2;
		this.zangqihuoxing_th3 = zangqihuoxing_th3;
		this.zangqihuoxing_th4 = zangqihuoxing_th4;
		this.zangqihuoxing_th5 = zangqihuoxing_th5;
		this.zangqihuoxing_th6 = zangqihuoxing_th6;
		this.zangqihuoxing_th7 = zangqihuoxing_th7;
		this.zangqihuoxing_th8 = zangqihuoxing_th8;
		this.zangqihuoxing_th9 = zangqihuoxing_th9;
		this.zangqihuoxing_th10 = zangqihuoxing_th10;
		this.zangqihuoxing_th11 = zangqihuoxing_th11;
		this.zangqihuoxing_th12 = zangqihuoxing_th12;
		this.zangqihuoxing_l1 = zangqihuoxing_l1;
		this.zangqihuoxing_l2 = zangqihuoxing_l2;
		this.zangqihuoxing_l3 = zangqihuoxing_l3;
		this.zangqihuoxing_l4 = zangqihuoxing_l4;
		this.zangqihuoxing_l5 = zangqihuoxing_l5;
		this.zangqihuoxing_s1 = zangqihuoxing_s1;
		this.zangqihuoxing_s2 = zangqihuoxing_s2;
		this.zangqihuoxing_s3 = zangqihuoxing_s3;
		this.zangqihuoxing_s4 = zangqihuoxing_s4;
		this.zangqihuoxing_s5 = zangqihuoxing_s5;
		this.zangqihuoxing_col = zangqihuoxing_col;
		this.yishi_jinzhideshiwu = yishi_jinzhideshiwu;
		this.weiyingyang = weiyingyang;
		this.yishi_tuijiandeshiwu = yishi_tuijiandeshiwu;
		this.yishi_pengtiaofangfa = yishi_pengtiaofangfa;
		this.rentichengfenfenxi = rentichengfenfenxi;
		this.yishi_yishijianyi = yishi_yishijianyi;
		this.yishi_xiangguanyishi = yishi_xiangguanyishi;
		this.tuijian_yinshi = tuijian_yinshi;
		this.yisheng_zonghefenxipingu_panduan = yisheng_zonghefenxipingu_panduan;
		this.zhiliao_jianyi = zhiliao_jianyi;
	}

}
