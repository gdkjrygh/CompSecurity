// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            PhotoView, App

class a35
    implements Runnable
{

    private final PhotoView a;
    private float b;
    private float c;
    private boolean d;
    private boolean e;
    private long f;

    public a35(PhotoView photoview)
    {
        f = -1L;
        a = photoview;
    }

    static boolean a(a35 a35_1)
    {
        return a35_1.e;
    }

    public void a()
    {
        e = false;
        d = true;
    }

    public boolean a(float f1, float f2)
    {
        if (e)
        {
            return false;
        } else
        {
            f = -1L;
            c = f1;
            b = f2;
            d = false;
            e = true;
            a.post(this);
            return true;
        }
    }

    public void run()
    {
        int i = App.am;
        if (!d) goto _L2; else goto _L1
_L1:
        return;
_L2:
label0:
        {
            long l = System.currentTimeMillis();
            float f1;
            boolean flag;
            if (f != -1L)
            {
                f1 = (float)(l - f) / 1000F;
            } else
            {
                f1 = 0.0F;
            }
            flag = PhotoView.a(a, c * f1, b * f1);
            f = l;
            f1 *= 1000F;
            if (c > 0.0F)
            {
                c = c - f1;
                if (c >= 0.0F)
                {
                    break label0;
                }
                c = 0.0F;
                if (i == 0)
                {
                    break label0;
                }
            }
            c = c + f1;
            if (c > 0.0F)
            {
                c = 0.0F;
            }
        }
label1:
        {
            if (b > 0.0F)
            {
                b = b - f1;
                if (b >= 0.0F)
                {
                    break label1;
                }
                b = 0.0F;
                if (i == 0)
                {
                    break label1;
                }
            }
            b = f1 + b;
            if (b > 0.0F)
            {
                b = 0.0F;
            }
        }
        if (c == 0.0F && b == 0.0F || !flag)
        {
            a();
            PhotoView.b(a, false);
        }
        if (!d)
        {
            a.post(this);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
