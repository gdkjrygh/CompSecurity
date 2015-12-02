// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            z2, og

public final class z7 extends z2
{

    public z7(og og1)
    {
        super(og1);
    }

    protected boolean b(og og1)
    {
        og1.C = a.C;
        boolean flag;
        if (a.u > 0 && og1.u != a.u || a.q > 0 && og1.q != a.q || a.u < 0 && og1.u >= 0 || a.q < 0 && og1.q >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        og1.u = a.u;
        og1.q = a.q;
        og1.i = a.i;
        return flag;
    }
}
