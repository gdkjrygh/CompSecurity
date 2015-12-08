// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.nextpanel;

import android.content.Context;

// Referenced classes of package com.gtp.nextlauncher.widget.nextpanel:
//            RainyView, Fog, Snowy, DayWallView, 
//            NightWallView, OverCast, Wall

public class m
{

    private int a;

    public m(int i, boolean flag)
    {
        a = -1;
        a = i;
        if ((a == 2 || 3 == a) && !flag)
        {
            a = a + 7;
        }
    }

    public static int a(int i, boolean flag)
    {
        int j;
label0:
        {
            if (i != 2)
            {
                j = i;
                if (3 != i)
                {
                    break label0;
                }
            }
            j = i;
            if (!flag)
            {
                j = i + 7;
            }
        }
        return j;
    }

    public Wall a(Context context)
    {
        if (a == 8 || a == 7)
        {
            context = new RainyView(context);
            ((RainyView)context).setHasRain(b());
            ((RainyView)context).setHasThunder(c());
            return context;
        }
        if (a == 6)
        {
            return new Fog(context);
        }
        if (a == 5)
        {
            return new Snowy(context);
        }
        if (a == 2 || a == 3)
        {
            context = new DayWallView(context);
            ((DayWallView)context).setHasCloud(a());
            return context;
        }
        if (a == 9 || a == 10)
        {
            context = new NightWallView(context);
            ((NightWallView)context).setHasCloud(a());
            return context;
        }
        if (a == 4)
        {
            return new OverCast(context);
        } else
        {
            return new RainyView(context);
        }
    }

    public boolean a()
    {
        return 2 != a && 9 != a;
    }

    public boolean b()
    {
        return 7 == a || 8 == a;
    }

    public boolean c()
    {
        return 8 == a;
    }
}
