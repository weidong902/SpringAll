package com.weidd.best.study.utils;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayInputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-06-02 17:20
 * 根据xsl模板,字符串转化为xml(并且向其中添加属性)
 **/
public class XSLUtil {

    public static String creatXMLByXslTemplate(String sourceData, byte[] template, String srcCharset, Map<String, Object> parmMap) throws UnsupportedEncodingException, TransformerException {
        StringWriter stringWriter = new StringWriter();

        StreamResult streamResult = new StreamResult(new PrintWriter(stringWriter));

        Source sourceSource = new StreamSource(new ByteArrayInputStream(sourceData.getBytes(srcCharset)));

        Transformer transformer = TransformerFactory.newInstance().newTransformer(new StreamSource(new ByteArrayInputStream(template)));
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");//不声明为xml(不会自动生成xml头)

        if (parmMap != null && parmMap.size() > 0) {
            Iterator<String> iterator = parmMap.keySet().iterator();
            while (iterator.hasNext()) {
                String key = iterator.next();
                transformer.setParameter(key, parmMap.get(key));
            }
        }

        transformer.transform(sourceSource, streamResult);

        return stringWriter.toString();
    }

}
