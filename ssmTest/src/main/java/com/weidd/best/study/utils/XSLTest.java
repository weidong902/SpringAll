package com.weidd.best.study.utils;

import org.springframework.util.FileCopyUtils;

import javax.xml.transform.TransformerException;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-06-02 17:37
 * 测试工具类XSLUtil
 **/
public class XSLTest {
    //存放模板
    private static Map<String, byte[]> TEMPLA_TEMAP = new HashMap<>();
    //    private static final String REQ_TEMPLATE_PATH = String.format("xsl%s", File.separator);
    private static final String REQ_TEMPLATE_PATH = "classpath:/xsl/";
    //    private static final String RES_TEMPLATE_PATH = String.format("xsl%s", File.separator);
    private static final String RES_TEMPLATE_PATH = "classpath:/xsl/";

    public static void main(String[] args) throws IOException, TransformerException {
        //加载模板文件
        loadTempalte(REQ_TEMPLATE_PATH, RES_TEMPLATE_PATH);


        //交易码
        String tr_code = "1000";
        byte[] templateKey = TEMPLA_TEMAP.get("tr_code" + "req");
        //接收到客户的报文
        String source = "";
        //对请求报文进行转换
        String reqData = tranreqParm(source, tr_code, templateKey);
    }

    private static void loadTempalte(String reqTemplatePath, String resTemplatePath) throws IOException {
        System.out.println("reqTemplatePath > " + reqTemplatePath + "  resTemplatePath: >" + resTemplatePath);
        int reqCount = 0;
        File[] reqFiles = new File(reqTemplatePath).listFiles();
        for (File file : reqFiles) {
            String fileName = file.getName();
            String key = fileName.substring(0, fileName.indexOf("."));
            byte[] bytes = FileCopyUtils.copyToByteArray(new FileInputStream(file));
            TEMPLA_TEMAP.put(key, bytes);
            reqCount++;
        }
        int resCount = 0;
        File[] resFiles = new File(resTemplatePath).listFiles();
        for (File file : resFiles) {
            String fileName = file.getName();
            String key = fileName.substring(0, fileName.indexOf("."));
            byte[] bytes = FileCopyUtils.copyToByteArray(new FileInputStream(file));
            TEMPLA_TEMAP.put(key, bytes);
            resCount++;
        }
        System.out.println("reqCount" + reqCount + "<   resCount" + resCount);

    }


    private static String tranreqParm(String source, String tr_code, byte[] templateKey) throws UnsupportedEncodingException, TransformerException {
        String reqTemplateKey = "classpath:xsl" + tr_code + "req.xml";//正常情况下提前加载到内存中
        //添加一些需要的参数
        HashMap<String, Object> parmMap = new HashMap<>();
        parmMap.put("cstNo", 9001);//客户号
        parmMap.put("userId", 0001);//操作员号
        return XSLUtil.creatXMLByXslTemplate(source, templateKey, "UTF-8", parmMap);
    }
}
