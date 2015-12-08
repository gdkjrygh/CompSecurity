// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import com.gau.go.launcherex.gowidget.weather.globalview.a;
import com.gau.go.launcherex.gowidget.weather.globalview.i;
import com.gau.go.launcherex.gowidget.weather.globalview.m;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.go.weatherex.setting:
//            ba, bk, bg

class bc
    implements m
{

    final ba a;

    bc(ba ba1)
    {
        a = ba1;
        super();
    }

    public void a(i i, boolean flag, ArrayList arraylist)
    {
        if (flag)
        {
            ba.b(a).c = 0;
            ba.b(a).d = 0;
            ba.b(a).e = 0;
            i = arraylist.iterator();
            do
            {
                if (!i.hasNext())
                {
                    break;
                }
                arraylist = (bg)((a)i.next()).c;
                arraylist.c = 1;
                switch (((bg) (arraylist)).a)
                {
                case 2131231717: 
                    ba.b(a).c = ((bg) (arraylist)).c;
                    break;

                case 2131231718: 
                    ba.b(a).d = ((bg) (arraylist)).c;
                    break;

                case 2131231719: 
                    ba.b(a).e = ((bg) (arraylist)).c;
                    break;
                }
            } while (true);
        }
    }
}
