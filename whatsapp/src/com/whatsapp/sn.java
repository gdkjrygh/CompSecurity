// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            PhotoView

class sn
    implements Runnable
{

    private float a;
    private long b;
    private boolean c;
    private float d;
    private float e;
    private boolean f;
    private float g;
    private boolean h;
    private float i;
    private final PhotoView j;

    public sn(PhotoView photoview)
    {
        j = photoview;
    }

    public void a()
    {
        f = false;
        h = true;
    }

    public boolean a(float f1, float f2, float f3, float f4)
    {
        if (f)
        {
            return false;
        }
        g = f3;
        a = f4;
        e = f2;
        b = System.currentTimeMillis();
        d = f1;
        boolean flag;
        if (e > d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        i = (e - d) / 200F;
        f = true;
        h = false;
        j.post(this);
        return true;
    }

    public void run()
    {
        if (!h) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l = System.currentTimeMillis();
        long l1 = b;
        float f1 = d;
        float f2 = i;
        f1 += (float)(l - l1) * f2;
        PhotoView.a(j, f1, g, a, true);
        if (f1 != e)
        {
            boolean flag1 = c;
            boolean flag;
            if (f1 > e)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag1 != flag)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        PhotoView.a(j, e, g, a, true);
        a();
        if (h) goto _L1; else goto _L3
_L3:
        j.post(this);
        return;
    }
}
