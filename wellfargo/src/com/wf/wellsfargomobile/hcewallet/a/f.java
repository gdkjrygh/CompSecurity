// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.a;


// Referenced classes of package com.wf.wellsfargomobile.hcewallet.a:
//            a

public class f
{

    private static f a = null;
    private a b;

    public f()
    {
        b = null;
    }

    public static f a()
    {
        if (a == null)
        {
            a = new f();
        }
        return a;
    }

    public void a(a a1)
    {
        b = a1;
    }

    public a b()
    {
        return b;
    }

}
