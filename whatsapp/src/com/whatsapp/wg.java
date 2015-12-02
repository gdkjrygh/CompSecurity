// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            wv, App, aoz, u5, 
//            un

final class wg extends wv
{

    wg()
    {
    }

    public void a(String s)
    {
        if (App.ah.v(s))
        {
            u5.c(s);
            App.Z();
        }
    }

    public void a(String s, boolean flag)
    {
        App.Z();
    }

    public void b(String s)
    {
        int i;
        boolean flag1;
label0:
        {
            i = App.am;
            boolean flag = true;
            if (App.ah.v(s))
            {
                flag = u5.c(s);
                flag1 = flag;
                if (i == 0)
                {
                    break label0;
                }
            }
            u5.e(s);
            flag1 = flag;
        }
label1:
        {
            if (flag1)
            {
                App.Z();
                if (i == 0)
                {
                    break label1;
                }
            }
            App.B(s);
        }
    }

    public void c(String s)
    {
        u5.e(s);
        App.Z();
    }

    public void d(String s)
    {
        if (App.e(s))
        {
            un.a(App.ah.x());
        }
    }
}
