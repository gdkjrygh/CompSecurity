// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.android.a.ab;
import com.android.a.f;
import com.android.a.o;
import com.android.a.p;
import com.android.a.r;
import com.android.a.t;
import com.android.a.u;
import com.android.a.v;

// Referenced classes of package com.android.a.a:
//            i

public class m extends p
{

    private static final Object e = new Object();
    private final v a;
    private android.graphics.Bitmap.Config b;
    private final int c;
    private final int d;

    public m(String s1, v v1, int j, int k, android.graphics.Bitmap.Config config, u u)
    {
        super(0, s1, u);
        a(new f(1000, 2, 2.0F));
        a = v1;
        b = config;
        c = j;
        d = k;
    }

    static int a(int j, int k, int l, int i1)
    {
        double d1 = Math.min((double)j / (double)l, (double)k / (double)i1);
        float f1 = 1.0F;
        do
        {
            if ((double)(f1 * 2.0F) > d1)
            {
                return (int)f1;
            }
            f1 *= 2.0F;
        } while (true);
    }

    private static int b(int j, int k, int l, int i1)
    {
        int j1;
        if (j == 0 && k == 0)
        {
            j1 = l;
        } else
        {
            if (j == 0)
            {
                return (int)(((double)k / (double)i1) * (double)l);
            }
            j1 = j;
            if (k != 0)
            {
                double d1 = (double)i1 / (double)l;
                j1 = j;
                if ((double)j * d1 > (double)k)
                {
                    return (int)((double)k / d1);
                }
            }
        }
        return j1;
    }

    private t b(com.android.a.m m1)
    {
        Object obj = m1.b;
        if (obj != null && obj.length >= 4 && obj[1] == 80 && obj[2] == 78 && obj[3] == 71)
        {
            b = android.graphics.Bitmap.Config.ARGB_8888;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        if (c == 0 && d == 0)
        {
            options.inPreferredConfig = b;
            obj = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, options);
        } else
        {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, options);
            int j = options.outWidth;
            int k = options.outHeight;
            options.inPreferredConfig = b;
            int l = b(c, d, j, k);
            int i1 = b(d, c, k, j);
            options.inJustDecodeBounds = false;
            options.inSampleSize = a(j, k, l, i1);
            obj = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, options);
            if (obj != null && (((Bitmap) (obj)).getWidth() > l || ((Bitmap) (obj)).getHeight() > i1))
            {
                Bitmap bitmap = Bitmap.createScaledBitmap(((Bitmap) (obj)), l, i1, true);
                ((Bitmap) (obj)).recycle();
                obj = bitmap;
            }
        }
        if (obj == null)
        {
            return t.a(new o(m1));
        } else
        {
            return t.a(obj, i.a(m1));
        }
    }

    protected t a(com.android.a.m m1)
    {
        obj;
        JVM INSTR monitorenter ;
        t t1;
        synchronized (e)
        {
            t1 = b(m1);
        }
        return t1;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        ab.c("Caught OOM for %d byte image, url=%s", new Object[] {
            Integer.valueOf(m1.b.length), d()
        });
        m1 = t.a(new o(outofmemoryerror));
        obj;
        JVM INSTR monitorexit ;
        return m1;
        m1;
        obj;
        JVM INSTR monitorexit ;
        throw m1;
    }

    protected void a(Bitmap bitmap)
    {
        a.a(bitmap);
    }

    protected void b(Object obj)
    {
        a((Bitmap)obj);
    }

    public r s()
    {
        return r.a;
    }

}
