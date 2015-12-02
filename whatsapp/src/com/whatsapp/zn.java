// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            z2, og, jy

public final class zn extends z2
{

    public zn(og og1)
    {
        super(og1);
    }

    protected boolean b(og og1)
    {
        jy jy1;
        jy jy2;
        boolean flag;
        if (og1.G != null)
        {
            jy1 = og1.G;
        } else
        {
            jy1 = jy.getDefault();
        }
        if (a.G != null)
        {
            jy2 = a.G;
        } else
        {
            jy2 = jy.getDefault();
        }
        if (jy1 != jy2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        og1.G = a.G;
        return flag;
    }
}
