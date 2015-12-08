// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ebay.redlasersdk.recognizers;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ebay.redlasersdk.BarcodeTypes;

// Referenced classes of package com.ebay.redlasersdk.recognizers:
//            BarcodeResultInternal

abstract class a extends Thread
{

    public BarcodeTypes enabledScanTypes;
    public boolean isBusy;
    public boolean isPhotoScan;
    protected Handler parentHandler;
    private Handler threadHandler;

    public a(BarcodeTypes barcodetypes)
    {
        enabledScanTypes = barcodetypes;
    }

    protected abstract BarcodeResultInternal[] ProcessFrame(RLSDK.d.a a1);

    public BarcodeResultInternal[] ProcessFrameSync(RLSDK.d.a a1)
    {
        isPhotoScan = true;
        return ProcessFrame(a1);
    }

    protected abstract int getInUseFlagValue();

    public int getRecognizableTypes()
    {
        return 0;
    }

    public Handler getThreadHandler()
    {
        return threadHandler;
    }

    public void run()
    {
        Looper.prepare();
        threadHandler = new Handler() {

            final a a;

            public final void handleMessage(Message message)
            {
                message.what;
                JVM INSTR lookupswitch 2: default 32
            //                           7877120: 33
            //                           7877125: 154;
                   goto _L1 _L2 _L3
_L1:
                return;
_L2:
                if ((message.obj instanceof RLSDK.d.a) && ((message = (RLSDK.d.a)message.obj) != null && ((RLSDK.d.a) (message)).a != null))
                {
                    a.isPhotoScan = false;
                    BarcodeResultInternal abarcoderesultinternal[] = a.ProcessFrame(message);
                    if (abarcoderesultinternal != null && abarcoderesultinternal.length > 0)
                    {
                        Message.obtain(a.parentHandler, 0x783202, abarcoderesultinternal).sendToTarget();
                    }
                    message.e = ((RLSDK.d.a) (message)).e & ~a.getInUseFlagValue();
                    if (((RLSDK.d.a) (message)).e == 0)
                    {
                        Message.obtain(a.parentHandler, 0x783201, message).sendToTarget();
                    }
                    a.isBusy = false;
                    return;
                }
                  goto _L1
_L3:
                Looper.myLooper().quit();
                return;
            }

            
            {
                a = a.this;
                super();
            }
        };
        Looper.loop();
    }

    public void setHandler(Handler handler)
    {
        parentHandler = handler;
    }
}
