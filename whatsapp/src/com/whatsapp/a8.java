// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            aq, HomeActivity, a3n

class a8
    implements aq
{

    final HomeActivity a;

    a8(HomeActivity homeactivity)
    {
        a = homeactivity;
        super();
    }

    public boolean a(String s)
    {
        a3n a3n1 = HomeActivity.b(a, HomeActivity.c(a));
        if (a3n1 != null)
        {
            a3n1.a(s);
        }
        return false;
    }
}
