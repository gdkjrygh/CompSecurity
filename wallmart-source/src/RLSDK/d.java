// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.ebay.redlasersdk.BarcodeTypes;
import com.ebay.redlasersdk.recognizers.NewLaserScanner;
import com.ebay.redlasersdk.recognizers.RealtimeScanner;
import com.ebay.redlasersdk.recognizers.b;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package RLSDK:
//            c, m, b, g

public final class d extends Handler
{
    public final class a
    {

        public byte a[];
        public int b;
        public int c;
        public RectF d;
        public int e;
        public int f;
        final d g;

        public a()
        {
            g = d.this;
            super();
        }
    }


    public BarcodeTypes a;
    public RectF b;
    private final String c = "BarcodeEngine";
    private final boolean d = true;
    private NewLaserScanner e;
    private boolean f;
    private RealtimeScanner g;
    private final boolean h = true;
    private b i;
    private long j;
    private int k;
    private int l;
    private int m;
    private m n;

    public d(BarcodeTypes barcodetypes, Context context)
    {
        f = false;
        j = 0L;
        k = 0;
        l = 0;
        m = 0;
        RLSDK.c.a(context);
        a = barcodetypes;
        n = new m();
        b = new RectF();
        b.setEmpty();
        e = new NewLaserScanner(a);
        e.setHandler(n);
        e.start();
        e.isBusy = false;
        g = new RealtimeScanner(context, a);
        g.setHandler(n);
        g.start();
        g.isBusy = false;
        i = new b(a);
        i.setHandler(n);
        i.start();
        i.isBusy = false;
    }

    public final Set a(Bitmap bitmap)
    {
        int i1;
        long l2 = SystemClock.uptimeMillis();
        new HashSet();
        if (RLSDK.c.a() == c.c.c || RLSDK.c.a() == c.c.e)
        {
            return null;
        }
        double d1;
        Object aobj[];
        Object obj;
        Object aobj1[];
        HashMap hashmap;
        RectF rectf;
        int j1;
        int k1;
        int l1;
        try
        {
            aobj1 = new byte[bitmap.getHeight() * bitmap.getWidth()];
            aobj = new int[bitmap.getWidth() * 4 + 16];
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            return null;
        }
        i1 = 0;
_L2:
        if (i1 >= bitmap.getHeight())
        {
            break MISSING_BLOCK_LABEL_164;
        }
        k1 = bitmap.getWidth();
        bitmap.getPixels(((int []) (aobj)), 0, bitmap.getWidth(), 0, i1, bitmap.getWidth(), 1);
        j1 = 0;
        while (j1 < bitmap.getWidth()) 
        {
            l1 = aobj[j1];
            aobj1[k1 * i1 + j1] = (byte)((l1 & 0xff) + ((l1 >> 16 & 0xff) + (l1 >> 7 & 0x1fe)) >> 2);
            j1++;
        }
        break MISSING_BLOCK_LABEL_461;
        rectf = new RectF(0.0F, 0.0F, bitmap.getWidth(), bitmap.getHeight());
        obj = new a();
        obj.a = ((byte []) (aobj1));
        obj.b = bitmap.getWidth();
        obj.c = bitmap.getHeight();
        obj.d = rectf;
        obj.e = 0;
        obj.f = 0;
        aobj1 = e.ProcessFrameSync(((a) (obj)));
        n.a(((com.ebay.redlasersdk.recognizers.BarcodeResultInternal []) (aobj1)));
        aobj1 = g.ProcessFrameSync(((a) (obj)));
        n.a(((com.ebay.redlasersdk.recognizers.BarcodeResultInternal []) (aobj1)));
        obj = i.ProcessFrameSync(((a) (obj)));
        n.a(((com.ebay.redlasersdk.recognizers.BarcodeResultInternal []) (obj)));
        obj = (Set)n.a().get("FoundBarcodes");
        d1 = (double)(SystemClock.uptimeMillis() - l2) / 1000D;
        hashmap = new HashMap();
        hashmap.put("numFinds", String.format("%d", new Object[] {
            Integer.valueOf(((Set) (obj)).size())
        }));
        hashmap.put("dur", String.format("%.2f", new Object[] {
            Double.valueOf(d1)
        }));
        hashmap.put("height", String.format("%d", new Object[] {
            Integer.valueOf(bitmap.getHeight())
        }));
        hashmap.put("width", String.format("%d", new Object[] {
            Integer.valueOf(bitmap.getWidth())
        }));
        RLSDK.b.a("ANDRSDK.PHOTO_SESSION_FINISHED", hashmap);
        return ((Set) (obj));
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a()
    {
        if (e != null)
        {
            Message.obtain(e.getThreadHandler(), 0x783205, null).sendToTarget();
            e = null;
        }
        if (g != null)
        {
            Message.obtain(g.getThreadHandler(), 0x783205, null).sendToTarget();
            g = null;
        }
        if (i != null)
        {
            Message.obtain(i.getThreadHandler(), 0x783205, null).sendToTarget();
            i = null;
        }
        n.b();
    }

    public final void a(RectF rectf)
    {
        b = rectf;
    }

    public final void a(BarcodeTypes barcodetypes)
    {
        a = barcodetypes;
        e.enabledScanTypes = a;
        if (f)
        {
            g.enabledScanTypes = a;
        }
        barcodetypes = i;
        BarcodeTypes barcodetypes1 = a;
        barcodetypes.a();
    }

    public final void a(boolean flag)
    {
        f = flag;
    }

    public final void a(byte abyte0[])
    {
        n.a(abyte0);
    }

    final void a(byte abyte0[], int i1, int j1, int k1)
    {
        Integer integer1 = Integer.valueOf(0);
        Integer integer = integer1;
        if (!e.isBusy)
        {
            integer = integer1;
            if ((e.getRecognizableTypes() & a.getEnabledTypes()) != 0)
            {
                integer = Integer.valueOf(integer1.intValue() | 4);
            }
        }
        integer1 = integer;
        if (f)
        {
            integer1 = integer;
            if (!g.isBusy)
            {
                integer1 = integer;
                if ((g.getRecognizableTypes() & a.getEnabledTypes()) != 0)
                {
                    integer1 = Integer.valueOf(integer.intValue() | 1);
                }
            }
        }
        integer = integer1;
        if (!i.isBusy)
        {
            integer = integer1;
            if ((i.getRecognizableTypes() & a.getEnabledTypes()) != 0)
            {
                integer = Integer.valueOf(integer1.intValue() | 2);
            }
        }
        if (integer.intValue() != 0)
        {
            Object obj = new RectF(0.0F, 0.0F, i1, j1);
            RectF rectf1 = new RectF(b);
            RectF rectf = rectf1;
            if (rectf1.isEmpty())
            {
                rectf = ((RectF) (obj));
            }
            rectf.setIntersect(rectf, ((RectF) (obj)));
            obj = new a();
            obj.a = abyte0;
            obj.b = i1;
            obj.c = j1;
            obj.d = rectf;
            obj.e = integer.intValue();
            obj.f = k1;
            if ((integer.intValue() & 4) != 0)
            {
                e.isBusy = true;
                Message.obtain(e.getThreadHandler(), 0x783200, obj).sendToTarget();
                k = k + 1;
            }
            if ((integer.intValue() & 1) != 0)
            {
                g.isBusy = true;
                Message.obtain(g.getThreadHandler(), 0x783200, obj).sendToTarget();
                l = l + 1;
            }
            if ((integer.intValue() & 2) != 0)
            {
                i.isBusy = true;
                Message.obtain(i.getThreadHandler(), 0x783200, obj).sendToTarget();
                m = m + 1;
            }
        } else
        {
            RLSDK.g.get().addCallbackBuffer(abyte0);
        }
        if (j == 0L)
        {
            j = Calendar.getInstance().getTimeInMillis();
            k = 0;
            l = 0;
            m = 0;
        } else
        {
            long l1 = (Calendar.getInstance().getTimeInMillis() - j) / 1000L;
            if ((double)l1 > 10D)
            {
                String.format("Last 10 seconds:%.2f NL scans/s, %.2f OCC scans/s, %.2f ZXing scans/s", new Object[] {
                    Float.valueOf((float)k / (float)l1), Float.valueOf((float)l / (float)l1), Float.valueOf((float)m / (float)l1)
                });
                j = Calendar.getInstance().getTimeInMillis();
                k = 0;
                l = 0;
                m = 0;
                return;
            }
        }
    }

    public final HashMap b()
    {
        return n.a();
    }
}
