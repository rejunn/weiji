package models.mappers;


import models.WebHraDetail;

import org.apache.ibatis.annotations.Insert;

public interface WebHraDetailMapper {
	/**
	 * 插入体检数据
	 *
	 * @Title: insert 
	 * @param hra 体检数据
	 * @return: void
	 */
	@Insert("insert into webhra_detail " +
           "(did,idcard,"
           + "huiyuanziliao_tizhong,huiyuanziliao_jianchariqi,huiyuanziliao_jianchashijian,"
           + "huiyuanziliao_yaowei,huiyuanziliao_songjianyishi,huiyuanziliao_nianling,"
           + "huiyuanziliao_shengao,"
           + "lizifenxi_na,lizifenxi_jia,lizifenxi_lv,lizifenxi_mei,lizifenxi_gai,"
           + "lizifenxi_lin,lizifenxi_tie,"
           + "shenjingdizhi_wuqingsean,shenjingdizhi_duobaan,shenjingdizhi_erchafenan,"
           + "shenjingdizhi_yixuandanjian,suanjianpingheng_ph,suanjianpingheng_hco3,"
           + "suanjianpingheng_paco2,suanjianpingheng__po2,suanjianpingheng_h,suanjianpingheng_sbe,"
           + "suanjianpingheng_iso2,"
           + "jisushuiping_cujiazhuangxian,jisushuiping_culuanpao,"
           + "jisushuiping_tuoqingbiaoxiongtong,jisushuiping_pizhichun,jisushuiping_quangutong,"
           + "jisushuiping_shenshangxian,jisushuiping_cijisu,jisushuiping__gaowanjisu,"
           + "jisushuiping_yidaosu,jisushuiping_jiazhuangpangxian,jisushuiping_jiazhuangxian,"
           + "jisushuiping__kangliniao,jisushuiping_cushenshangxianpizhi,"
           + "ziyouji_guoyuangyaxiaosuan,ziyouji_xiaofenzi,ziyouji_guoyanghuaqing,"
           + "ziyouji_chaoyangyinlizi,ziyouji_qiangziyouji,"
           + "shenghuazhibiao_ganyousanzhi,shenghuazhibiao_gucaozhuananmei,shenghuazhibiao_jianxinglinsuanmei,"
           + "shenghuazhibiao_xuetang,shenghuazhibiao_LDLdimiduzhidanbai,fengxian_huxixitong_zhuangtai,"
           + "fengxian_huxixitong_zhuangtai_shuoming,fengxian_xiaohuaxitong_zhuangtai,"
           + "fengxian_xiaohuaxitong_zhuangtai_shuoming,fengxian_mianyixitong_zhuangtai,"
           + "fengxian_mianyixitong_zhuangtai_shuoming,fengxian_miniaoshengzhixitong_zhuangtai,"
           + "fengxian_miniaoshengzhixitong_shuoming,fengxian_gugexitong_zhuangtai,"
           + "fengxian_gugexitong_shuoming,fengxian_xinxueguanxitong_zhuangtai,"
           + "fengxian_xinxueguanxitong_shuoming,fengxian_neifenmixitong_zhuangtai,"
           + "fengxian_neifenmixitong_shuoming,fengxian_shenjingxitong_zhuagntai,"
           +"fengxian_shenjingxitong_shuoming,fengxian_ziyouji_zhuangtai,fengxian_ziyouji_shuoming,"
           +"fengxian_guomin_zhuangtai,fengxian_guomin_shuoming,fengxian_neihuanjing_zhuangtai,"
           +"fengxian_neihuanjing_shuoming,fengxian_erbihou_zhuangtai,fengxian_erbihou_shuoming,"
           +"fengxian_pifu_zhuangtai,fengxian_pifu_shuoming,fengxian_xipaobianxing_zhuangtai,"
           +"fengxian_xipaobianxing_shuoming,fengxian_ganran_zhuangtai,fengxian_ganran_shuoming,"
           +"zangqihuoxing_shierzhichang,zangqihuoxing_zhiqiguan,zangqihuoxing_zuofeishangye,"
           +"zangqihuoxing_youfeishangye,zangqihuoxing_shengjiechang,zangqihuoxing_zuoshanghedou,"
           +"zangqihuoxing_youshanghedou,zangqihuoxing_youyanheleixian,zangqihuoxing_zuoyanheleixian,"
           +"zangqihuoxing_xiongxian,zangqihuoxing_zuohenggemoshenjing,zangqihuoxing_youcegeshenjin,"
           +"zangqihuoxing_weiquyu,zangqihuoxing_dannang,zangqihuoxing_zuotuoyexian,"
           +"zangqihuoxing_youceshangheyachi,zangqihuoxing_zuocexiaheyachi,zangqihuoxing_youtuoyexian,"
           +"zangqihuoxing_zuoxi,zangqihuoxing_youxi,zangqihuoxing_xiongbu_zuoce,"
           +"zangqihuoxing_zuoceeyepiceng,zangqihuoxing_youceeyepicheng,zangqihuoxing_qianliexian,"
           +"zangqihuoxing_zigong,zangqihuoxing_pangguang,zangqihuoxing_gaowan,"
           +"zangqihuoxing_luancao,zangqihuoxing_zuo_gaowan,zangqihuoxing_you_gaowan,"
           +"zangqihuoxing_zuo_luancao,zangqihuoxing_you_luancao,zangqihuoxing_zuofeixiaye,"
           +"zangqihuoxing_youfeixiaye,zangqihuoxing_jiangjiechang,zangqihuoxing_youcebiqianting,"
           +"zangqihuoxing_zuocebiqianting,zangqihuoxing_ganzuoye_danguan,zangqihuoxing_shidao_xiaduan,"
           +"zangqihuoxing_yixian,zangqihuoxing_jiechang_ganqu,zangqihuoxing_zuoshen_shuniaoguan,"
           +"zangqihuoxing_youshen_shuniaoguan,zangqihuoxing_xiongbu_youce,zangqihuoxing_zhichang,"
           +"zangqihuoxing_pizang,zangqihuoxing_xinzang,zangqihuoxing_yizhuangjiechang,"
           +"zangqihuoxing_mangchang_lanwei,zangqihuoxing_youfeizhongye,zangqihuoxing_xiaochang,"
           +"zangqihuoxing_qiguan,zangqihuoxing_zuoer,zangqihuoxing_youer,zangqihuoxing_zuoce_jingbu,"
           +"zangqihuoxing_youce_jingbu,zangqihuoxing_jiazhuangxian,zangqihuoxing_zuodatui_shenjingxueguanshu,"
           +"zangqihuoxing_youdatui_shenjingxueguanshu,zangqihuoxing_zuoxiaotui_shenjinxueguanshu,"
           +"zangqihuoxing_youxiaotui_shenjingxueguanshu,zangqihuoxing_zuoshou_shenjingxueguanshu,"
           +"zangqihuoxing_youshou_shenjingxueguanshu,zangqihuoxing_zuoshangbi_shenjingxueguanshu,"
           +"zangqihuoxing_youshangbi_shenjingxueguanshu,zangqihuoxing_zuoqianbi_shenjingxueguanshu,"
           +"zangqihuoxing_youqianbi_shenjingxueguanshu,zangqihuoxing_zuojiao_shenjingxueguanshu,"
           +"zangqihuoxing_youjiao_shenjingxueguanshu,zangqihuoxing_youce_shenshanxiansuizhi,"
           +"zangqihuoxing_zuoce_shenshangxiansuizhi,zangqihuoxing_zuoce_nieye,zangqihuoxing_you_jingdongmai,"
           +"zangqihuoxing_zuo_jingdongmai,zangqihuoxing_youce_nieye,zangqihuoxing_chuiti,"
           +"zangqihuoxing_xiaqiunao,zangqihuoxing_qiunao,zangqihuoxing_jiazhuangxian_youye,"
           +"zangqihuoxing_jiazhuangxian_zuoye,zangqihuoxing_youce_luneixueguan,"
           +"zangqihuoxing_zuoce_luneixueguan,zangqihuoxing_shangqiangjingmai,"
           +"zangqihuoxing_zhudongmai,zangqihuoxing_youxinshi,zangqihuoxing_zuoxinshi,"
           +"zangqihuoxing_guanzhuangxueguan,zangqihuoxing_gan_youye,zangqihuoxing_shidao_shangduan,"
           +"zangqihuoxing_youce_shenshangxianpizhi,zangqihuoxing_zuoce_shenshangxianpizhi,"
           +"zangqihuoxing_jiechang_pi,zangqihuoxing_xinfeixunhuan,zangqihuoxing_gugexitong,"
           +"zangqihuoxing_menmaixunhuan,zangqihuoxing_zuoce_bianyuanxitong,"
           +"zangqihuoxing_youce_bianyuanxitong,zangqihuoxing_you_xingrenti,"
           +"zangqihuoxing_zuo_xingrenti,zangqihuoxing_xiaqiangjingmai,zangqihuoxing_you_qiantingyaliganshouqi,"
           +"zangqihuoxing_zuo_qiantingyaliganshouqi,zangqihuoxing_xinji,zangqihuoxing_c1,"
           +"zangqihuoxing_c2,zangqihuoxing_c3,zangqihuoxing_c4,zangqihuoxing_c5,zangqihuoxing_c6,"
           +"zangqihuoxing_c7,zangqihuoxing_c8,zangqihuoxing_th1,zangqihuoxing_th2,"
           +"zangqihuoxing_th3,zangqihuoxing_th4,zangqihuoxing_th5,zangqihuoxing_th6,"
           +"zangqihuoxing_th7,zangqihuoxing_th8,zangqihuoxing_th9,zangqihuoxing_th10,"
           +"zangqihuoxing_th11,zangqihuoxing_th12,zangqihuoxing_l1,zangqihuoxing_l2,"
           +"zangqihuoxing_l3,zangqihuoxing_l4,zangqihuoxing_l5,zangqihuoxing_s1,"
           +"zangqihuoxing_s2,zangqihuoxing_s3,zangqihuoxing_s4,zangqihuoxing_s5,"
           +"zangqihuoxing_col,yishi_jinzhideshiwu,weiyingyang,yishi_tuijiandeshiwu,"
           +"yishi_pengtiaofangfa,rentichengfenfenxi,yishi_yishijianyi,yishi_xiangguanyishi,"
           +"tuijian_yinshi,yisheng_zonghefenxipingu_panduan,zhiliao_jianyi,pdf_url)"
     +"values"
           +"(#{did},#{idcard},"
           +"#{huiyuanziliao_tizhong},#{huiyuanziliao_jianchariqi},#{huiyuanziliao_jianchashijian},"
           +"#{huiyuanziliao_yaowei},#{huiyuanziliao_songjianyishi},#{huiyuanziliao_nianling},"
           +"#{huiyuanziliao_shengao},#{lizifenxi_na},#{lizifenxi_jia},#{lizifenxi_lv},"
           +"#{lizifenxi_mei},#{lizifenxi_gai},#{lizifenxi_lin},#{lizifenxi_tie},"
           +"#{shenjingdizhi_wuqingsean},#{shenjingdizhi_duobaan},#{shenjingdizhi_erchafenan},"
           +"#{shenjingdizhi_yixuandanjian},#{suanjianpingheng_ph},#{suanjianpingheng_hco3},"
           +"#{suanjianpingheng_paco2},#{suanjianpingheng__po2},#{suanjianpingheng_h},"
           +"#{suanjianpingheng_sbe},#{suanjianpingheng_iso2},#{jisushuiping_cujiazhuangxian},"
           +"#{jisushuiping_culuanpao},#{jisushuiping_tuoqingbiaoxiongtong},"
           +"#{jisushuiping_pizhichun},#{jisushuiping_quangutong},#{jisushuiping_shenshangxian},"
           +"#{jisushuiping_cijisu},#{jisushuiping__gaowanjisu},#{jisushuiping_yidaosu},"
           +"#{jisushuiping_jiazhuangpangxian},#{jisushuiping_jiazhuangxian},"
           +"#{jisushuiping__kangliniao},#{jisushuiping_cushenshangxianpizhi},"
           +"#{ziyouji_guoyuangyaxiaosuan},#{ziyouji_xiaofenzi},#{ziyouji_guoyanghuaqing},"
           +"#{ziyouji_chaoyangyinlizi},#{ziyouji_qiangziyouji},#{shenghuazhibiao_ganyousanzhi},"
           +"#{shenghuazhibiao_gucaozhuananmei},#{shenghuazhibiao_jianxinglinsuanmei},"
           +"#{shenghuazhibiao_xuetang},#{shenghuazhibiao_LDLdimiduzhidanbai},"
           +"#{fengxian_huxixitong_zhuangtai},#{fengxian_huxixitong_zhuangtai_shuoming},"
           +"#{fengxian_xiaohuaxitong_zhuangtai},#{fengxian_xiaohuaxitong_zhuangtai_shuoming},"
           +"#{fengxian_mianyixitong_zhuangtai},#{fengxian_mianyixitong_zhuangtai_shuoming},"
           +"#{fengxian_miniaoshengzhixitong_zhuangtai},#{fengxian_miniaoshengzhixitong_shuoming},"
           +"#{fengxian_gugexitong_zhuangtai},#{fengxian_gugexitong_shuoming},"
           +"#{fengxian_xinxueguanxitong_zhuangtai},#{fengxian_xinxueguanxitong_shuoming},"
           +"#{fengxian_neifenmixitong_zhuangtai},#{fengxian_neifenmixitong_shuoming},"
           +"#{fengxian_shenjingxitong_zhuagntai},#{fengxian_shenjingxitong_shuoming},"
           +"#{fengxian_ziyouji_zhuangtai},#{fengxian_ziyouji_shuoming},"
           +"#{fengxian_guomin_zhuangtai},#{fengxian_guomin_shuoming},"
           +"#{fengxian_neihuanjing_zhuangtai},#{fengxian_neihuanjing_shuoming},"
           +"#{fengxian_erbihou_zhuangtai},#{fengxian_erbihou_shuoming},#{fengxian_pifu_zhuangtai},"
           +"#{fengxian_pifu_shuoming},#{fengxian_xipaobianxing_zhuangtai},"
           +"#{fengxian_xipaobianxing_shuoming},#{fengxian_ganran_zhuangtai},"
           +"#{fengxian_ganran_shuoming},#{zangqihuoxing_shierzhichang},#{zangqihuoxing_zhiqiguan},"
           +"#{zangqihuoxing_zuofeishangye},#{zangqihuoxing_youfeishangye},"
           +"#{zangqihuoxing_shengjiechang},#{zangqihuoxing_zuoshanghedou},"
           +"#{zangqihuoxing_youshanghedou},#{zangqihuoxing_youyanheleixian},"
           +"#{zangqihuoxing_zuoyanheleixian},#{zangqihuoxing_xiongxian},"
           +"#{zangqihuoxing_zuohenggemoshenjing},#{zangqihuoxing_youcegeshenjin},"
           +"#{zangqihuoxing_weiquyu},#{zangqihuoxing_dannang},#{zangqihuoxing_zuotuoyexian},"
           +"#{zangqihuoxing_youceshangheyachi},#{zangqihuoxing_zuocexiaheyachi},"
           +"#{zangqihuoxing_youtuoyexian},#{zangqihuoxing_zuoxi},"
           +"#{zangqihuoxing_youxi},#{zangqihuoxing_xiongbu_zuoce},"
           +"#{zangqihuoxing_zuoceeyepiceng},#{zangqihuoxing_youceeyepicheng},"
           +"#{zangqihuoxing_qianliexian},#{zangqihuoxing_zigong},#{zangqihuoxing_pangguang},"
           +"#{zangqihuoxing_gaowan},#{zangqihuoxing_luancao},#{zangqihuoxing_zuo_gaowan},"
           +"#{zangqihuoxing_you_gaowan},#{zangqihuoxing_zuo_luancao},#{zangqihuoxing_you_luancao},"
           +"#{zangqihuoxing_zuofeixiaye},#{zangqihuoxing_youfeixiaye},#{zangqihuoxing_jiangjiechang},"
           +"#{zangqihuoxing_youcebiqianting},#{zangqihuoxing_zuocebiqianting},#{zangqihuoxing_ganzuoye_danguan},"
           +"#{zangqihuoxing_shidao_xiaduan},#{zangqihuoxing_yixian},#{zangqihuoxing_jiechang_ganqu},"
           +"#{zangqihuoxing_zuoshen_shuniaoguan},#{zangqihuoxing_youshen_shuniaoguan},"
           +"#{zangqihuoxing_xiongbu_youce},#{zangqihuoxing_zhichang},#{zangqihuoxing_pizang},"
           +"#{zangqihuoxing_xinzang},#{zangqihuoxing_yizhuangjiechang},#{zangqihuoxing_mangchang_lanwei},"
           +"#{zangqihuoxing_youfeizhongye},#{zangqihuoxing_xiaochang},"
           +"#{zangqihuoxing_qiguan},#{zangqihuoxing_zuoer},#{zangqihuoxing_youer},"
           +"#{zangqihuoxing_zuoce_jingbu},#{zangqihuoxing_youce_jingbu},"
           +"#{zangqihuoxing_jiazhuangxian},#{zangqihuoxing_zuodatui_shenjingxueguanshu},"
           +"#{zangqihuoxing_youdatui_shenjingxueguanshu},#{zangqihuoxing_zuoxiaotui_shenjinxueguanshu},"
           +"#{zangqihuoxing_youxiaotui_shenjingxueguanshu},#{zangqihuoxing_zuoshou_shenjingxueguanshu},"
           +"#{zangqihuoxing_youshou_shenjingxueguanshu},#{zangqihuoxing_zuoshangbi_shenjingxueguanshu},"
           +"#{zangqihuoxing_youshangbi_shenjingxueguanshu},#{zangqihuoxing_zuoqianbi_shenjingxueguanshu},"
           +"#{zangqihuoxing_youqianbi_shenjingxueguanshu},#{zangqihuoxing_zuojiao_shenjingxueguanshu},"
           +"#{zangqihuoxing_youjiao_shenjingxueguanshu},#{zangqihuoxing_youce_shenshanxiansuizhi},"
           +"#{zangqihuoxing_zuoce_shenshangxiansuizhi},#{zangqihuoxing_zuoce_nieye},"
           +"#{zangqihuoxing_you_jingdongmai},#{zangqihuoxing_zuo_jingdongmai},"
           +"#{zangqihuoxing_youce_nieye},#{zangqihuoxing_chuiti},#{zangqihuoxing_xiaqiunao},"
           +"#{zangqihuoxing_qiunao},#{zangqihuoxing_jiazhuangxian_youye},"
           +"#{zangqihuoxing_jiazhuangxian_zuoye},#{zangqihuoxing_youce_luneixueguan},"
           +"#{zangqihuoxing_zuoce_luneixueguan},#{zangqihuoxing_shangqiangjingmai},"
           +"#{zangqihuoxing_zhudongmai},#{zangqihuoxing_youxinshi},"
           +"#{zangqihuoxing_zuoxinshi},#{zangqihuoxing_guanzhuangxueguan},"
           +"#{zangqihuoxing_gan_youye},#{zangqihuoxing_shidao_shangduan},"
           +"#{zangqihuoxing_youce_shenshangxianpizhi},#{zangqihuoxing_zuoce_shenshangxianpizhi},"
           +"#{zangqihuoxing_jiechang_pi},#{zangqihuoxing_xinfeixunhuan},"
           +"#{zangqihuoxing_gugexitong},#{zangqihuoxing_menmaixunhuan},"
           +"#{zangqihuoxing_zuoce_bianyuanxitong},#{zangqihuoxing_youce_bianyuanxitong},"
           +"#{zangqihuoxing_you_xingrenti},#{zangqihuoxing_zuo_xingrenti},"
           +"#{zangqihuoxing_xiaqiangjingmai},#{zangqihuoxing_you_qiantingyaliganshouqi},"
           +"#{zangqihuoxing_zuo_qiantingyaliganshouqi},#{zangqihuoxing_xinji},"
           +"#{zangqihuoxing_c1},#{zangqihuoxing_c2},#{zangqihuoxing_c3},#{zangqihuoxing_c4},"
           +"#{zangqihuoxing_c5},#{zangqihuoxing_c6},#{zangqihuoxing_c7},#{zangqihuoxing_c8},"
           +"#{zangqihuoxing_th1},#{zangqihuoxing_th2},#{zangqihuoxing_th3},#{zangqihuoxing_th4},"
           +"#{zangqihuoxing_th5},#{zangqihuoxing_th6},#{zangqihuoxing_th7},"
           +"#{zangqihuoxing_th8},#{zangqihuoxing_th9},#{zangqihuoxing_th10},"
           +"#{zangqihuoxing_th11},#{zangqihuoxing_th12},#{zangqihuoxing_l1},"
           +"#{zangqihuoxing_l2},#{zangqihuoxing_l3},#{zangqihuoxing_l4},"
           +"#{zangqihuoxing_l5},#{zangqihuoxing_s1},#{zangqihuoxing_s2},"
           +"#{zangqihuoxing_s3},#{zangqihuoxing_s4},#{zangqihuoxing_s5},"
           +"#{zangqihuoxing_col},#{yishi_jinzhideshiwu},#{weiyingyang},#{yishi_tuijiandeshiwu},"
           +"#{yishi_pengtiaofangfa},#{rentichengfenfenxi},#{yishi_yishijianyi},"
           +"#{yishi_xiangguanyishi},#{tuijian_yinshi},#{yisheng_zonghefenxipingu_panduan},"
           +"#{zhiliao_jianyi},#{pdf_url})")
	 void insert(WebHraDetail hra);
}