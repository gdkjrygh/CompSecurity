// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            PhotoView

class ab0
    implements Runnable
{

    private float a;
    private boolean b;
    private float c;
    private boolean d;
    private long e;
    private final PhotoView f;
    private float g;

    public ab0(PhotoView photoview)
    {
        f = photoview;
    }

    public void a()
    {
        d = false;
        b = true;
        PhotoView.a(f, Math.round(PhotoView.a(f)));
        PhotoView.a(f, true);
        f.requestLayout();
        f.invalidate();
    }

    public void a(float f1)
    {
        if (d)
        {
            return;
        } else
        {
            c = f1;
            g = c / 300F;
            a = 0.0F;
            e = -1L;
            b = false;
            d = true;
            f.post(this);
            return;
        }
    }

    public void run()
    {
        if (!b) goto _L2; else goto _L1
_L1:
        return;
_L2:
label0:
        {
            if (a == c)
            {
                continue; /* Loop/switch isn't completed */
            }
            long l1 = System.currentTimeMillis();
            float f1;
            float f2;
            long l;
            if (e != -1L)
            {
                l = l1 - e;
            } else
            {
                l = 0L;
            }
            f1 = g;
            f2 = (float)l * f1;
            if (a >= c || a + f2 <= c)
            {
                f1 = f2;
                if (a <= c)
                {
                    break label0;
                }
                f1 = f2;
                if (a + f2 >= c)
                {
                    break label0;
                }
            }
            f1 = c - a;
        }
        f.a(f1, false);
        a = f1 + a;
        if (a == c)
        {
            a();
        }
        e = l1;
        if (b) goto _L1; else goto _L3
_L3:
        f.post(this);
        return;
    }
}
