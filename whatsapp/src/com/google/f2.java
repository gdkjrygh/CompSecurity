// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            fw

public final class f2 extends fw
{

    private final float d;
    private final int e;

    f2(float f, float f1, float f3)
    {
        this(f, f1, f3, 1);
    }

    private f2(float f, float f1, float f3, int i)
    {
        super(f, f1);
        d = f3;
        e = i;
    }

    boolean a(float f, float f1, float f3)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (Math.abs(f1 - b()) > f)
            {
                break label0;
            }
            flag = flag1;
            if (Math.abs(f3 - a()) > f)
            {
                break label0;
            }
            f = Math.abs(f - d);
            if (f > 1.0F)
            {
                flag = flag1;
                if (f > d)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    f2 b(float f, float f1, float f3)
    {
        int i = e + 1;
        return new f2(((float)e * a() + f1) / (float)i, ((float)e * b() + f) / (float)i, ((float)e * d + f3) / (float)i, i);
    }

    public float c()
    {
        return d;
    }

    int d()
    {
        return e;
    }
}
