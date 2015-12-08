// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ebay.redlasersdk.recognizers;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.ebay.redlasersdk.BarcodeTypes;

// Referenced classes of package com.ebay.redlasersdk.recognizers:
//            a, BarcodeResultInternal

public class NewLaserScanner extends a
{

    private String TAG;
    public int recognizerPtr;

    public NewLaserScanner(BarcodeTypes barcodetypes)
    {
        super(barcodetypes);
        TAG = "NewLaserScanner";
        CreateNewLaserEngine();
    }

    private int TranslateNLFormatsToSDK(int i)
    {
        int k = i & 0xffff89ff;
        int j = k;
        if ((i & 0x200) != 0)
        {
            j = k | 0x1000;
        }
        k = j;
        if ((i & 0x400) != 0)
        {
            k = j | 0x2000;
        }
        j = k;
        if ((i & 0x1000) != 0)
        {
            j = k | 0x200;
        }
        k = j;
        if ((i & 0x2000) != 0)
        {
            k = j | 0x4000;
        }
        j = k;
        if ((i & 0x4000) != 0)
        {
            j = k | 0x400;
        }
        return j;
    }

    private int TranslateSDKFormatsToNL(int i)
    {
        int k = i & 0xffff89ff;
        int j = k;
        if ((i & 0x200) != 0)
        {
            j = k | 0x1000;
        }
        k = j;
        if ((i & 0x400) != 0)
        {
            k = j | 0x4000;
        }
        j = k;
        if ((i & 0x1000) != 0)
        {
            j = k | 0x200;
        }
        k = j;
        if ((i & 0x2000) != 0)
        {
            k = j | 0x400;
        }
        j = k;
        if ((i & 0x4000) != 0)
        {
            j = k | 0x2000;
        }
        return j;
    }

    public native void CreateNewLaserEngine();

    public native void DestroyNewLaserEngine();

    public native Object FindBarcodesInPixelMap(byte abyte0[], int i, int j, int k, int l);

    protected BarcodeResultInternal[] ProcessFrame(RLSDK.d.a a1)
    {
        if (a1.a.length >= a1.b * a1.c) goto _L2; else goto _L1
_L1:
        Log.e(TAG, "Not enough data");
        a1 = null;
_L4:
        return a1;
_L2:
        SetEnabledScanTypes(TranslateSDKFormatsToNL(enabledScanTypes.getEnabledTypes()));
        int i = 32;
        if (isPhotoScan)
        {
            i = 500;
        }
        BarcodeResultInternal abarcoderesultinternal[] = (BarcodeResultInternal[])FindBarcodesInPixelMap(a1.a, a1.b, a1.c, a1.b, i);
        a1 = abarcoderesultinternal;
        if (abarcoderesultinternal == null)
        {
            continue;
        }
        a1 = abarcoderesultinternal;
        if (abarcoderesultinternal.length <= 0)
        {
            continue;
        }
        i = 0;
        do
        {
            a1 = abarcoderesultinternal;
            if (i >= abarcoderesultinternal.length)
            {
                continue;
            }
            abarcoderesultinternal[i].barcodeType = TranslateNLFormatsToSDK(abarcoderesultinternal[i].barcodeType);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public volatile BarcodeResultInternal[] ProcessFrameSync(RLSDK.d.a a1)
    {
        return super.ProcessFrameSync(a1);
    }

    void ReportMaxRunLengths(int i)
    {
        Message.obtain(parentHandler, 0x783204, Integer.valueOf(i)).sendToTarget();
    }

    void ReportPartialBarcode(BarcodeResultInternal barcoderesultinternal)
    {
        String s = TAG;
        Message.obtain(parentHandler, 0x783203, barcoderesultinternal).sendToTarget();
    }

    public native void SetEnabledScanTypes(int i);

    public void finalize()
    {
        DestroyNewLaserEngine();
    }

    protected int getInUseFlagValue()
    {
        return 4;
    }

    public int getRecognizableTypes()
    {
        return 65383;
    }

    public volatile Handler getThreadHandler()
    {
        return super.getThreadHandler();
    }

    public volatile void run()
    {
        super.run();
    }

    public volatile void setHandler(Handler handler)
    {
        super.setHandler(handler);
    }

    static 
    {
        System.loadLibrary("redlaser");
    }
}
