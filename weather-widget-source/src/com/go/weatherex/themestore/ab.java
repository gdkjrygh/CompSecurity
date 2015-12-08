// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import com.gau.go.launcherex.gowidget.weather.view.as;

// Referenced classes of package com.go.weatherex.themestore:
//            ac

public class ab
{

    public int a;
    public String b;
    public int c;
    public int d;

    public ab()
    {
        a = -1;
        c = 1;
        d = 1;
    }

    public void a(as as1)
    {
        a = as1.c;
        b = as1.d;
        if (as1.a == 999)
        {
            c = 2;
        } else
        {
            c = 1;
        }
        as1.b;
        JVM INSTR tableswitch 41 41: default 52
    //                   41 69;
           goto _L1 _L2
_L1:
        d = 1;
_L4:
        ac.f();
        return;
_L2:
        d = 3;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
