// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.d;
import com.android.volley.j;
import com.android.volley.m;
import com.android.volley.n;
import com.android.volley.r;

// Referenced classes of package com.android.volley.toolbox:
//            e

public final class o extends Request
{

    private static final Object e = new Object();
    private final com.android.volley.o a;
    private final android.graphics.Bitmap.Config b;
    private final int c;
    private final int d;

    public o(String s, com.android.volley.o o1, int i, int k, android.graphics.Bitmap.Config config, n n1)
    {
        super(0, s, n1);
        a(new d(1000, 2, 2.0F));
        a = o1;
        b = config;
        c = i;
        d = k;
    }

    private static int a(int i, int k, int l, int i1)
    {
        int j1;
        if (i == 0 && k == 0)
        {
            j1 = l;
        } else
        {
            if (i == 0)
            {
                return (int)(((double)k / (double)i1) * (double)l);
            }
            j1 = i;
            if (k != 0)
            {
                double d1 = (double)i1 / (double)l;
                j1 = i;
                if ((double)i * d1 > (double)k)
                {
                    return (int)((double)k / d1);
                }
            }
        }
        return j1;
    }

    private static int b(int i, int k, int l, int i1)
    {
        double d1 = Math.min((double)i / (double)l, (double)k / (double)i1);
        float f;
        for (f = 1.0F; (double)(f * 2.0F) <= d1; f *= 2.0F) { }
        return (int)f;
    }

    protected final m a(j j1)
    {
        Object obj2 = e;
        obj2;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        obj = j1.b;
        obj1 = new android.graphics.BitmapFactory.Options();
        if (c != 0 || d != 0) goto _L2; else goto _L1
_L1:
        obj1.inPreferredConfig = b;
        obj = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, ((android.graphics.BitmapFactory.Options) (obj1)));
_L6:
        if (obj != null) goto _L4; else goto _L3
_L3:
        obj = m.a(new ParseError(j1));
        j1 = ((j) (obj));
_L8:
        obj2;
        JVM INSTR monitorexit ;
        return j1;
_L2:
        int l;
        int i1;
        obj1.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, ((android.graphics.BitmapFactory.Options) (obj1)));
        int i = ((android.graphics.BitmapFactory.Options) (obj1)).outWidth;
        int k = ((android.graphics.BitmapFactory.Options) (obj1)).outHeight;
        l = a(c, d, i, k);
        i1 = a(d, c, k, i);
        obj1.inJustDecodeBounds = false;
        obj1.inSampleSize = b(i, k, l, i1);
        obj = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, ((android.graphics.BitmapFactory.Options) (obj1)));
        if (obj == null) goto _L6; else goto _L5
_L5:
        if (((Bitmap) (obj)).getWidth() <= l && ((Bitmap) (obj)).getHeight() <= i1) goto _L6; else goto _L7
_L7:
        obj1 = Bitmap.createScaledBitmap(((Bitmap) (obj)), l, i1, true);
        ((Bitmap) (obj)).recycle();
        obj = obj1;
          goto _L6
        obj;
        r.c("Caught OOM for %d byte image, url=%s", new Object[] {
            Integer.valueOf(j1.b.length), c()
        });
        j1 = m.a(new ParseError(((Throwable) (obj))));
        obj2;
        JVM INSTR monitorexit ;
        return j1;
        j1;
        throw j1;
_L4:
        obj = m.a(obj, com.android.volley.toolbox.e.a(j1));
        j1 = ((j) (obj));
          goto _L8
    }

    protected final volatile void a(Object obj)
    {
        obj = (Bitmap)obj;
        a.a(obj);
    }

    public final com.android.volley.Request.Priority n()
    {
        return com.android.volley.Request.Priority.LOW;
    }

}
