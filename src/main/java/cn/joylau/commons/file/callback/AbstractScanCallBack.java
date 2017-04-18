/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.commons.file.callback;

/**
 * Created by JoyLau on 4/17/2017.
 * cn.joylau.commons.file.callback
 * 2587038142.liu@gmail.com
 */
public abstract class AbstractScanCallBack implements ScanCallBack {

    private boolean exit = false;

    @Override
    public void exit() {
        exit=true;
    }

    @Override
    public boolean isExit() {
        return exit;
    }

}
