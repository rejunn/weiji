/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : weiji

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-04-07 16:05:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `idcard` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `birthdate` datetime DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `salt` varchar(10) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `modifytime` datetime DEFAULT NULL,
  `createway` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idcard`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('130654654738272746', '15662b7e862aa65148ee88f6ac75dbd7', '123', '13283928372', '男', '2015-05-09 00:00:00', '北京市东城区东四十条中汇广场22层', '72187255', '2016-03-25 18:22:55', null, 'upload');
INSERT INTO `user` VALUES ('130846273627', '123456', '测试', '13435426352', '男', '2016-03-01 13:17:04', '都睡得晚', '231232', null, null, null);

-- ----------------------------
-- Table structure for webhra_detail
-- ----------------------------
DROP TABLE IF EXISTS `webhra_detail`;
CREATE TABLE `webhra_detail` (
  `did` bigint(20) NOT NULL AUTO_INCREMENT,
  `idcard` varchar(50) COLLATE utf8_bin NOT NULL,
  `packageid ` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `deviceid` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `devicemodel` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `huiyuanziliao_jianchariqi` longtext COLLATE utf8_bin,
  `huiyuanziliao_jianchashijian` longtext COLLATE utf8_bin,
  `huiyuanziliao_songjianyishi` longtext COLLATE utf8_bin,
  `huiyuanziliao_nianling` longtext COLLATE utf8_bin,
  `rtc_shengao` longtext COLLATE utf8_bin,
  `rtc_tizhong` longtext COLLATE utf8_bin,
  `rtc_bmi` longtext COLLATE utf8_bin,
  `rtc_gaoya` longtext COLLATE utf8_bin,
  `rtc_diya` longtext COLLATE utf8_bin,
  `rtc_xinlv` longtext COLLATE utf8_bin,
  `rtc_xueyang` longtext COLLATE utf8_bin,
  `rtc_zhifanghanliang` longtext COLLATE utf8_bin,
  `rtc_jichudaixie` longtext COLLATE utf8_bin,
  `lizifenxi_na` longtext COLLATE utf8_bin,
  `lizifenxi_jia` longtext COLLATE utf8_bin,
  `lizifenxi_lv` longtext COLLATE utf8_bin,
  `lizifenxi_mei` longtext COLLATE utf8_bin,
  `lizifenxi_gai` longtext COLLATE utf8_bin,
  `lizifenxi_lin` longtext COLLATE utf8_bin,
  `lizifenxi_tie` longtext COLLATE utf8_bin,
  `shenjingdizhi_wuqingsean` longtext COLLATE utf8_bin,
  `shenjingdizhi_duobaan` longtext COLLATE utf8_bin,
  `shenjingdizhi_erchafenan` longtext COLLATE utf8_bin,
  `shenjingdizhi_yixuandanjian` longtext COLLATE utf8_bin,
  `suanjianpingheng_ph` longtext COLLATE utf8_bin,
  `suanjianpingheng_hco3` longtext COLLATE utf8_bin,
  `suanjianpingheng_paco2` longtext COLLATE utf8_bin,
  `suanjianpingheng__po2` longtext COLLATE utf8_bin,
  `suanjianpingheng_h` longtext COLLATE utf8_bin,
  `suanjianpingheng_sbe` longtext COLLATE utf8_bin,
  `suanjianpingheng_iso2` longtext COLLATE utf8_bin,
  `jisushuiping_cujiazhuangxian` longtext COLLATE utf8_bin,
  `jisushuiping_culuanpao` longtext COLLATE utf8_bin,
  `jisushuiping_tuoqingbiaoxiongtong` longtext COLLATE utf8_bin,
  `jisushuiping_pizhichun` longtext COLLATE utf8_bin,
  `jisushuiping_quangutong` longtext COLLATE utf8_bin,
  `jisushuiping_shenshangxian` longtext COLLATE utf8_bin,
  `jisushuiping_cijisu` longtext COLLATE utf8_bin,
  `jisushuiping__gaowanjisu` longtext COLLATE utf8_bin,
  `jisushuiping_yidaosu` longtext COLLATE utf8_bin,
  `jisushuiping_jiazhuangpangxian` longtext COLLATE utf8_bin,
  `jisushuiping_jiazhuangxian` longtext COLLATE utf8_bin,
  `jisushuiping__kangliniao` longtext COLLATE utf8_bin,
  `jisushuiping_cushenshangxianpizhi` longtext COLLATE utf8_bin,
  `ziyouji_guoyuangyaxiaosuan` longtext COLLATE utf8_bin,
  `ziyouji_xiaofenzi` longtext COLLATE utf8_bin,
  `ziyouji_guoyanghuaqing` longtext COLLATE utf8_bin,
  `ziyouji_chaoyangyinlizi` longtext COLLATE utf8_bin,
  `ziyouji_qiangziyouji` longtext COLLATE utf8_bin,
  `shenghuazhibiao_ganyousanzhi` longtext COLLATE utf8_bin,
  `shenghuazhibiao_gucaozhuananmei` longtext COLLATE utf8_bin,
  `shenghuazhibiao_jianxinglinsuanmei` longtext COLLATE utf8_bin,
  `shenghuazhibiao_xuetang` longtext COLLATE utf8_bin,
  `shenghuazhibiao_LDLdimiduzhidanbai` longtext COLLATE utf8_bin,
  `fengxian_huxixitong_zhuangtai` longtext COLLATE utf8_bin,
  `fengxian_huxixitong_zhuangtai_shuoming` longtext COLLATE utf8_bin,
  `fengxian_xiaohuaxitong_zhuangtai` longtext COLLATE utf8_bin,
  `fengxian_xiaohuaxitong_zhuangtai_shuoming` longtext COLLATE utf8_bin,
  `fengxian_mianyixitong_zhuangtai` longtext COLLATE utf8_bin,
  `fengxian_mianyixitong_zhuangtai_shuoming` longtext COLLATE utf8_bin,
  `fengxian_miniaoshengzhixitong_zhuangtai` longtext COLLATE utf8_bin,
  `fengxian_miniaoshengzhixitong_shuoming` longtext COLLATE utf8_bin,
  `fengxian_gugexitong_zhuangtai` longtext COLLATE utf8_bin,
  `fengxian_gugexitong_shuoming` longtext COLLATE utf8_bin,
  `fengxian_xinxueguanxitong_zhuangtai` longtext COLLATE utf8_bin,
  `fengxian_xinxueguanxitong_shuoming` longtext COLLATE utf8_bin,
  `fengxian_neifenmixitong_zhuangtai` longtext COLLATE utf8_bin,
  `fengxian_neifenmixitong_shuoming` longtext COLLATE utf8_bin,
  `fengxian_shenjingxitong_zhuagntai` longtext COLLATE utf8_bin,
  `fengxian_shenjingxitong_shuoming` longtext COLLATE utf8_bin,
  `fengxian_ziyouji_zhuangtai` longtext COLLATE utf8_bin,
  `fengxian_ziyouji_shuoming` longtext COLLATE utf8_bin,
  `fengxian_guomin_zhuangtai` longtext COLLATE utf8_bin,
  `fengxian_guomin_shuoming` longtext COLLATE utf8_bin,
  `fengxian_neihuanjing_zhuangtai` longtext COLLATE utf8_bin,
  `fengxian_neihuanjing_shuoming` longtext COLLATE utf8_bin,
  `fengxian_erbihou_zhuangtai` longtext COLLATE utf8_bin,
  `fengxian_erbihou_shuoming` longtext COLLATE utf8_bin,
  `fengxian_pifu_zhuangtai` longtext COLLATE utf8_bin,
  `fengxian_pifu_shuoming` longtext COLLATE utf8_bin,
  `fengxian_xipaobianxing_zhuangtai` longtext COLLATE utf8_bin,
  `fengxian_xipaobianxing_shuoming` longtext COLLATE utf8_bin,
  `fengxian_ganran_zhuangtai` longtext COLLATE utf8_bin,
  `fengxian_ganran_shuoming` longtext COLLATE utf8_bin,
  `zangqihuoxing_shierzhichang` longtext COLLATE utf8_bin,
  `zangqihuoxing_zhiqiguan` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuofeishangye` longtext COLLATE utf8_bin,
  `zangqihuoxing_youfeishangye` longtext COLLATE utf8_bin,
  `zangqihuoxing_shengjiechang` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuoshanghedou` longtext COLLATE utf8_bin,
  `zangqihuoxing_youshanghedou` longtext COLLATE utf8_bin,
  `zangqihuoxing_youyanheleixian` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuoyanheleixian` longtext COLLATE utf8_bin,
  `zangqihuoxing_xiongxian` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuohenggemoshenjing` longtext COLLATE utf8_bin,
  `zangqihuoxing_youcegeshenjin` longtext COLLATE utf8_bin,
  `zangqihuoxing_weiquyu` longtext COLLATE utf8_bin,
  `zangqihuoxing_dannang` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuotuoyexian` longtext COLLATE utf8_bin,
  `zangqihuoxing_youceshangheyachi` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuocexiaheyachi` longtext COLLATE utf8_bin,
  `zangqihuoxing_youtuoyexian` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuoxi` longtext COLLATE utf8_bin,
  `zangqihuoxing_youxi` longtext COLLATE utf8_bin,
  `zangqihuoxing_xiongbu_zuoce` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuoceeyepiceng` longtext COLLATE utf8_bin,
  `zangqihuoxing_youceeyepicheng` longtext COLLATE utf8_bin,
  `zangqihuoxing_qianliexian` longtext COLLATE utf8_bin,
  `zangqihuoxing_zigong` longtext COLLATE utf8_bin,
  `zangqihuoxing_pangguang` longtext COLLATE utf8_bin,
  `zangqihuoxing_gaowan` longtext COLLATE utf8_bin,
  `zangqihuoxing_luancao` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuo_gaowan` longtext COLLATE utf8_bin,
  `zangqihuoxing_you_gaowan` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuo_luancao` longtext COLLATE utf8_bin,
  `zangqihuoxing_you_luancao` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuofeixiaye` longtext COLLATE utf8_bin,
  `zangqihuoxing_youfeixiaye` longtext COLLATE utf8_bin,
  `zangqihuoxing_jiangjiechang` longtext COLLATE utf8_bin,
  `zangqihuoxing_youcebiqianting` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuocebiqianting` longtext COLLATE utf8_bin,
  `zangqihuoxing_ganzuoye_danguan` longtext COLLATE utf8_bin,
  `zangqihuoxing_shidao_xiaduan` longtext COLLATE utf8_bin,
  `zangqihuoxing_yixian` longtext COLLATE utf8_bin,
  `zangqihuoxing_jiechang_ganqu` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuoshen_shuniaoguan` longtext COLLATE utf8_bin,
  `zangqihuoxing_youshen_shuniaoguan` longtext COLLATE utf8_bin,
  `zangqihuoxing_xiongbu_youce` longtext COLLATE utf8_bin,
  `zangqihuoxing_zhichang` longtext COLLATE utf8_bin,
  `zangqihuoxing_pizang` longtext COLLATE utf8_bin,
  `zangqihuoxing_xinzang` longtext COLLATE utf8_bin,
  `zangqihuoxing_yizhuangjiechang` longtext COLLATE utf8_bin,
  `zangqihuoxing_mangchang_lanwei` longtext COLLATE utf8_bin,
  `zangqihuoxing_youfeizhongye` longtext COLLATE utf8_bin,
  `zangqihuoxing_xiaochang` longtext COLLATE utf8_bin,
  `zangqihuoxing_qiguan` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuoer` longtext COLLATE utf8_bin,
  `zangqihuoxing_youer` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuoce_jingbu` longtext COLLATE utf8_bin,
  `zangqihuoxing_youce_jingbu` longtext COLLATE utf8_bin,
  `zangqihuoxing_jiazhuangxian` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuodatui_shenjingxueguanshu` longtext COLLATE utf8_bin,
  `zangqihuoxing_youdatui_shenjingxueguanshu` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuoxiaotui_shenjinxueguanshu` longtext COLLATE utf8_bin,
  `zangqihuoxing_youxiaotui_shenjingxueguanshu` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuoshou_shenjingxueguanshu` longtext COLLATE utf8_bin,
  `zangqihuoxing_youshou_shenjingxueguanshu` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuoshangbi_shenjingxueguanshu` longtext COLLATE utf8_bin,
  `zangqihuoxing_youshangbi_shenjingxueguanshu` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuoqianbi_shenjingxueguanshu` longtext COLLATE utf8_bin,
  `zangqihuoxing_youqianbi_shenjingxueguanshu` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuojiao_shenjingxueguanshu` longtext COLLATE utf8_bin,
  `zangqihuoxing_youjiao_shenjingxueguanshu` longtext COLLATE utf8_bin,
  `zangqihuoxing_youce_shenshanxiansuizhi` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuoce_shenshangxiansuizhi` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuoce_nieye` longtext COLLATE utf8_bin,
  `zangqihuoxing_you_jingdongmai` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuo_jingdongmai` longtext COLLATE utf8_bin,
  `zangqihuoxing_youce_nieye` longtext COLLATE utf8_bin,
  `zangqihuoxing_chuiti` longtext COLLATE utf8_bin,
  `zangqihuoxing_xiaqiunao` longtext COLLATE utf8_bin,
  `zangqihuoxing_qiunao` longtext COLLATE utf8_bin,
  `zangqihuoxing_jiazhuangxian_youye` longtext COLLATE utf8_bin,
  `zangqihuoxing_jiazhuangxian_zuoye` longtext COLLATE utf8_bin,
  `zangqihuoxing_youce_luneixueguan` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuoce_luneixueguan` longtext COLLATE utf8_bin,
  `zangqihuoxing_shangqiangjingmai` longtext COLLATE utf8_bin,
  `zangqihuoxing_zhudongmai` longtext COLLATE utf8_bin,
  `zangqihuoxing_youxinshi` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuoxinshi` longtext COLLATE utf8_bin,
  `zangqihuoxing_guanzhuangxueguan` longtext COLLATE utf8_bin,
  `zangqihuoxing_gan_youye` longtext COLLATE utf8_bin,
  `zangqihuoxing_shidao_shangduan` longtext COLLATE utf8_bin,
  `zangqihuoxing_youce_shenshangxianpizhi` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuoce_shenshangxianpizhi` longtext COLLATE utf8_bin,
  `zangqihuoxing_jiechang_pi` longtext COLLATE utf8_bin,
  `zangqihuoxing_xinfeixunhuan` longtext COLLATE utf8_bin,
  `zangqihuoxing_gugexitong` longtext COLLATE utf8_bin,
  `zangqihuoxing_menmaixunhuan` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuoce_bianyuanxitong` longtext COLLATE utf8_bin,
  `zangqihuoxing_youce_bianyuanxitong` longtext COLLATE utf8_bin,
  `zangqihuoxing_you_xingrenti` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuo_xingrenti` longtext COLLATE utf8_bin,
  `zangqihuoxing_xiaqiangjingmai` longtext COLLATE utf8_bin,
  `zangqihuoxing_you_qiantingyaliganshouqi` longtext COLLATE utf8_bin,
  `zangqihuoxing_zuo_qiantingyaliganshouqi` longtext COLLATE utf8_bin,
  `zangqihuoxing_xinji` longtext COLLATE utf8_bin,
  `zangqihuoxing_c1` longtext COLLATE utf8_bin,
  `zangqihuoxing_c2` longtext COLLATE utf8_bin,
  `zangqihuoxing_c3` longtext COLLATE utf8_bin,
  `zangqihuoxing_c4` longtext COLLATE utf8_bin,
  `zangqihuoxing_c5` longtext COLLATE utf8_bin,
  `zangqihuoxing_c6` longtext COLLATE utf8_bin,
  `zangqihuoxing_c7` longtext COLLATE utf8_bin,
  `zangqihuoxing_c8` longtext COLLATE utf8_bin,
  `zangqihuoxing_th1` longtext COLLATE utf8_bin,
  `zangqihuoxing_th2` longtext COLLATE utf8_bin,
  `zangqihuoxing_th3` longtext COLLATE utf8_bin,
  `zangqihuoxing_th4` longtext COLLATE utf8_bin,
  `zangqihuoxing_th5` longtext COLLATE utf8_bin,
  `zangqihuoxing_th6` longtext COLLATE utf8_bin,
  `zangqihuoxing_th7` longtext COLLATE utf8_bin,
  `zangqihuoxing_th8` longtext COLLATE utf8_bin,
  `zangqihuoxing_th9` longtext COLLATE utf8_bin,
  `zangqihuoxing_th10` longtext COLLATE utf8_bin,
  `zangqihuoxing_th11` longtext COLLATE utf8_bin,
  `zangqihuoxing_th12` longtext COLLATE utf8_bin,
  `zangqihuoxing_l1` longtext COLLATE utf8_bin,
  `zangqihuoxing_l2` longtext COLLATE utf8_bin,
  `zangqihuoxing_l3` longtext COLLATE utf8_bin,
  `zangqihuoxing_l4` longtext COLLATE utf8_bin,
  `zangqihuoxing_l5` longtext COLLATE utf8_bin,
  `zangqihuoxing_s1` longtext COLLATE utf8_bin,
  `zangqihuoxing_s2` longtext COLLATE utf8_bin,
  `zangqihuoxing_s3` longtext COLLATE utf8_bin,
  `zangqihuoxing_s4` longtext COLLATE utf8_bin,
  `zangqihuoxing_s5` longtext COLLATE utf8_bin,
  `zangqihuoxing_col` longtext COLLATE utf8_bin,
  `yishi_jinzhideshiwu` longtext COLLATE utf8_bin,
  `weiyingyang` longtext COLLATE utf8_bin,
  `yishi_tuijiandeshiwu` longtext COLLATE utf8_bin,
  `yishi_pengtiaofangfa` longtext COLLATE utf8_bin,
  `rentichengfenfenxi` longtext COLLATE utf8_bin,
  `yishi_yishijianyi` longtext COLLATE utf8_bin,
  `yishi_xiangguanyishi` longtext COLLATE utf8_bin,
  `tuijian_yinshi` longtext COLLATE utf8_bin,
  `yisheng_zonghefenxipingu_panduan` longtext COLLATE utf8_bin,
  `zhiliao_jianyi` longtext COLLATE utf8_bin,
  `pdfname` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`did`)
) ENGINE=MyISAM AUTO_INCREMENT=61 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of webhra_detail
-- ----------------------------
INSERT INTO `webhra_detail` VALUES ('60', '130654654738272746', null, null, null, null, null, null, 0x3132, null, null, null, null, null, null, null, null, null, 0x3132, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '123', null);
