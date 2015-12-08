// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ebay.redlasersdk.recognizers;

import RLSDK.ab;
import RLSDK.ad;
import RLSDK.ae;
import RLSDK.av;
import RLSDK.l;
import RLSDK.q;
import RLSDK.s;
import RLSDK.u;
import RLSDK.x;
import RLSDK.y;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.ebay.redlasersdk.BarcodeTypes;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;

// Referenced classes of package com.ebay.redlasersdk.recognizers:
//            a, BarcodeResultInternal

public final class b extends a
    implements ae
{

    private static Hashtable a;
    private final x b = new x();

    public b(BarcodeTypes barcodetypes)
    {
        super(barcodetypes);
        a();
    }

    protected final BarcodeResultInternal[] ProcessFrame(RLSDK.d.a a1)
    {
        Object obj;
        Matrix matrix;
        matrix = new Matrix();
        obj = new Rect(0, 0, a1.b, a1.c);
        obj = new s(new av(new l(a1.a, a1.b, a1.c, ((Rect) (obj)).left, ((Rect) (obj)).top, ((Rect) (obj)).width(), ((Rect) (obj)).height())));
        obj = b.a(((s) (obj)));
        b.a();
_L4:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_735;
        }
        Object aobj[] = new BarcodeResultInternal[1];
        aobj[0] = new BarcodeResultInternal();
        BarcodeResultInternal barcoderesultinternal;
        float af[];
        Object obj1;
        int i;
        int j;
        if (((ab) (obj)).c().equals(q.n))
        {
            aobj[0].barcodeString = (new StringBuilder("0")).append(((ab) (obj)).a()).toString();
        } else
        {
            aobj[0].barcodeString = ((ab) (obj)).a();
        }
        barcoderesultinternal = aobj[0];
        obj1 = ((ab) (obj)).c();
        if (obj1.equals(q.k))
        {
            i = 16;
        } else
        if (obj1.equals(q.f))
        {
            i = 128;
        } else
        if (obj1.equals(q.e))
        {
            i = 32;
        } else
        if (obj1.equals(q.c))
        {
            i = 64;
        } else
        if (obj1.equals(q.h))
        {
            i = 1;
        } else
        if (obj1.equals(q.g))
        {
            i = 4;
        } else
        if (obj1.equals(q.n))
        {
            i = 1;
        } else
        if (obj1.equals(q.o))
        {
            i = 2;
        } else
        if (obj1.equals(q.p))
        {
            i = 4096;
        } else
        if (obj1.equals(q.i))
        {
            i = 256;
        } else
        if (obj1.equals(q.l))
        {
            i = 1024;
        } else
        if (obj1.equals(q.d))
        {
            i = 512;
        } else
        if (obj1.equals(q.b))
        {
            i = 2048;
        } else
        {
            i = 0;
        }
        barcoderesultinternal.barcodeType = i;
        aobj[0].setRecognizedBy(2);
        obj = ((ab) (obj)).b();
        af = new float[2];
        for (i = 0; i < obj.length; i++)
        {
            af[0] = obj[i].a();
            af[1] = obj[i].b();
            matrix.mapPoints(af);
            obj1 = new PointF(af[0], af[1]);
            (new StringBuilder("ZXing found point: x=")).append(obj[i].a()).append(" y=").append(obj[i].b()).append(" active rect: l=").append(a1.d.left).append(" t=").append(a1.d.top).append(" r=").append(a1.d.right).append(" b=").append(a1.d.bottom).toString();
            aobj[0].barcodeLocation.add(obj1);
        }

        break MISSING_BLOCK_LABEL_703;
        obj;
        b.a();
        obj = null;
        continue; /* Loop/switch isn't completed */
        obj;
        Log.e("ZXingScanner", "unhandled exception during decode");
        aobj = ((Exception) (obj)).getStackTrace();
        j = aobj.length;
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.e("ZXingScanner", ((StackTraceElement) (aobj[i])).toString());
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        ((Exception) (obj)).printStackTrace();
        b.a();
        obj = null;
        continue; /* Loop/switch isn't completed */
        a1;
        b.a();
        throw a1;
        (new StringBuilder("VALID: ")).append(aobj[0].barcodeString).toString();
        return ((BarcodeResultInternal []) (aobj));
        return null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final volatile BarcodeResultInternal[] ProcessFrameSync(RLSDK.d.a a1)
    {
        return super.ProcessFrameSync(a1);
    }

    public final void a()
    {
        a = new Hashtable();
        Vector vector = new Vector();
        if (enabledScanTypes != null)
        {
            if (enabledScanTypes.getDataMatrix())
            {
                vector.add(q.f);
            }
            if (enabledScanTypes.getQRCode())
            {
                vector.add(q.k);
            }
        }
        a.put(u.c, vector);
        a.put(u.d, Boolean.FALSE);
        a.put(u.h, this);
        b.a(a);
    }

    public final void a(ad ad1)
    {
        (new StringBuilder("foundPossibleResultPoint ")).append(ad1).toString();
        Message.obtain(parentHandler, 0x764840, null).sendToTarget();
    }

    protected final int getInUseFlagValue()
    {
        return 2;
    }

    public final int getRecognizableTypes()
    {
        return 144;
    }

    public final volatile Handler getThreadHandler()
    {
        return super.getThreadHandler();
    }

    public final volatile void run()
    {
        super.run();
    }

    public final volatile void setHandler(Handler handler)
    {
        super.setHandler(handler);
    }
}
