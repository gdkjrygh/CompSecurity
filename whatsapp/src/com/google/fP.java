// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            fw

public final class fP extends fw
{

    private final float d;

    fP(float f, float f1, float f2)
    {
        super(f, f1);
        d = f2;
    }

    boolean a(float f, float f1, float f2)
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
            if (Math.abs(f2 - a()) > f)
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

    fP b(float f, float f1, float f2)
    {
        return new fP((a() + f1) / 2.0F, (b() + f) / 2.0F, (d + f2) / 2.0F);
    }
}
