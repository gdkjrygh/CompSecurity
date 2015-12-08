// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverScannerActivity

private class <init> extends Handler
{

    public static final int MSG_SCAN_TIMEOUT = 1;
    public static final int SCAN_TIMEOUT_MILLIS = 20000;
    final SaverScannerActivity this$0;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            SaverScannerActivity.access$1600(SaverScannerActivity.this, 112);
            break;
        }
    }

    private ()
    {
        this$0 = SaverScannerActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
