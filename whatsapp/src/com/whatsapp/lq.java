// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            PhotoView, App

class lq
    implements Runnable
{

    private boolean a;
    private final PhotoView b;
    private long c;
    private float d;
    private boolean e;
    private float f;

    public lq(PhotoView photoview)
    {
        c = -1L;
        b = photoview;
    }

    public void a()
    {
        a = false;
        e = true;
    }

    public boolean a(float f1, float f2)
    {
        if (a)
        {
            return false;
        } else
        {
            c = -1L;
            f = f1;
            d = f2;
            e = false;
            a = true;
            b.postDelayed(this, 250L);
            return true;
        }
    }

    public void run()
    {
        if (!e) goto _L2; else goto _L1
_L1:
        return;
_L2:
        float f1;
        float f3;
        long l = System.currentTimeMillis();
        float f2;
        if (c != -1L)
        {
            f1 = l - c;
        } else
        {
            f1 = 0.0F;
        }
        if (c == -1L)
        {
            c = l;
        }
        if (f1 >= 100F)
        {
            f2 = f;
            f3 = d;
            if (App.am == 0)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        f2 = (f / (100F - f1)) * 10F;
        f3 = (d / (100F - f1)) * 10F;
        if (Math.abs(f2) > Math.abs(f) || f2 == (0.0F / 0.0F))
        {
            f1 = f;
        } else
        {
            f1 = f2;
        }
        if (Math.abs(f3) > Math.abs(d) || f3 == (0.0F / 0.0F))
        {
            f3 = d;
            f2 = f1;
            f1 = f3;
        } else
        {
            f2 = f1;
            f1 = f3;
        }
_L4:
        PhotoView.a(b, f2, f1);
        f = f - f2;
        d = d - f1;
        if (f == 0.0F && d == 0.0F)
        {
            a();
        }
        if (!e)
        {
            b.post(this);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        f1 = f3;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }
}
