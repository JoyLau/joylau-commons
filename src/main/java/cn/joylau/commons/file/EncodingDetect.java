/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.commons.file;

import java.io.File;

public class EncodingDetect {
    /**
     * 得到文件的编码
     *
     * @param filePath 文件路径
     * @return 文件的编码
     */
    public static String getJavaEncode(String filePath) {
        BytesEncodingDetect s = new BytesEncodingDetect();
        String fileCode = BytesEncodingDetect.javaname[s.detectEncoding(new File(filePath))];
        return fileCode;
    }

}

