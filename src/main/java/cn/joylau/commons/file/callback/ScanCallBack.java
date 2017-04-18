/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.commons.file.callback;

import java.io.File;

/**
 * Created by JoyLau on 4/17/2017.
 * cn.joylau.commons.file.callback
 * 2587038142.liu@gmail.com
 */
public interface ScanCallBack extends CanExitCallBack {

    void accept(int deep, File file);

    default void error(int deep, File file, Throwable e) {
        e.printStackTrace();
    }

}
