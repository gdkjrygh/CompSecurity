// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ebay.redlasersdk.recognizers;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.ebay.redlasersdk.BarcodeTypes;
import java.util.ArrayList;

// Referenced classes of package com.ebay.redlasersdk.recognizers:
//            a, CvRect, BarcodeResultInternal

public class RealtimeScanner extends a
{

    public static final int MSG_BARCODE_IN_RANGE = 0x764840;
    public static final int MSG_BARCODE_OUT_OF_RANGE = 0x764841;
    private String TAG;
    private CvRect lastRect;
    public int realtimeReaderPtr;

    public RealtimeScanner(Context context, BarcodeTypes barcodetypes)
    {
        super(barcodetypes);
        TAG = "RealtimeScanner";
        lastRect = new CvRect(0, 0, 0, 0);
        CreateReader();
    }

    private int getEnabledFormats()
    {
        return enabledScanTypes.getEnabledTypes() & getRecognizableTypes();
    }

    public native void CreateReader();

    public native void DestroyReader();

    protected BarcodeResultInternal[] ProcessFrame(RLSDK.d.a a1)
    {
        if (a1.a.length < a1.b * a1.c)
        {
            Log.e("RealtimeScanner", "Not enough data");
            return null;
        }
        int k = getEnabledFormats();
        int i = 0;
        CvRect cvrect;
        int j;
        if (a1.f == 90)
        {
            i = 1;
        } else
        if (a1.f == 180)
        {
            i = 2;
        } else
        if (a1.f == 270)
        {
            i = 3;
        }
        RRSetSourceImage(a1.b, a1.c, (int)a1.d.left, (int)a1.d.top, (int)a1.d.width(), (int)a1.d.height(), a1.a, i);
        cvrect = (CvRect)RRFindBarcode(150, 300, (int)a1.d.left, (int)a1.d.top, i);
        if (cvrect.width > 50 || cvrect.height > 50)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        a1 = parentHandler;
        if (i != 0)
        {
            j = 0x764840;
        } else
        {
            j = 0x764841;
        }
        Message.obtain(a1, j, null).sendToTarget();
        if (i != 0)
        {
            RRRotateBarcode();
            if (enabledScanTypes.getUpce() || enabledScanTypes.getEan8() || enabledScanTypes.getEan13() || enabledScanTypes.getSticky())
            {
                BarcodeResultInternal abarcoderesultinternal[] = (BarcodeResultInternal[])RRReadBarcode(k);
                a1 = abarcoderesultinternal;
                if (abarcoderesultinternal != null)
                {
                    a1 = abarcoderesultinternal;
                    if (abarcoderesultinternal.length > 0)
                    {
                        a1 = abarcoderesultinternal[0];
                        if (cvrect.width == 10)
                        {
                            cvrect.width = 40;
                        }
                        if (cvrect.height == 10)
                        {
                            cvrect.height = 40;
                        }
                        ((BarcodeResultInternal) (a1)).barcodeLocation.add(new PointF(cvrect.x, cvrect.y));
                        ((BarcodeResultInternal) (a1)).barcodeLocation.add(new PointF(cvrect.x + cvrect.width, cvrect.y));
                        ((BarcodeResultInternal) (a1)).barcodeLocation.add(new PointF(cvrect.x + cvrect.width, cvrect.y + cvrect.height));
                        ((BarcodeResultInternal) (a1)).barcodeLocation.add(new PointF(cvrect.x, cvrect.y + cvrect.height));
                        a1 = TAG;
                        (new StringBuilder("found position x=")).append(cvrect.x).append(" y=").append(cvrect.y).append(" width=").append(cvrect.width).append(" height=").append(cvrect.height).toString();
                        a1 = abarcoderesultinternal;
                    }
                }
            } else
            {
                a1 = null;
            }
            lastRect = cvrect;
            return a1;
        } else
        {
            return null;
        }
    }

    public volatile BarcodeResultInternal[] ProcessFrameSync(RLSDK.d.a a1)
    {
        return super.ProcessFrameSync(a1);
    }

    public native Object RRFindBarcode(int i, int j, int k, int l, int i1);

    public native int RRGetSourceImage();

    public native Object RRReadBarcode(int i);

    public native void RRRotateBarcode();

    public native void RRSetSourceImage(int i, int j, int k, int l, int i1, int j1, byte abyte0[], 
            int k1);

    public void finalize()
    {
        DestroyReader();
    }

    protected int getInUseFlagValue()
    {
        return 1;
    }

    public int getRecognizableTypes()
    {
        return 7;
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
