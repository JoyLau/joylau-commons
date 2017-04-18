/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.commons.file.callback;

/**
 * Created by JoyLau on 4/17/2017.
 * cn.joylau.commons.file.callback
 * 2587038142.liu@gmail.com
 */
public class ReadStringCallBack implements ReadCallBack {

    protected StringBuilder builder = new StringBuilder();

    @Override
    public String toString() {
        return builder.toString();
    }

    @Override
    public void readLine(int lineNumber, String line) {
        builder.append(line).append("\n");
    }
}
