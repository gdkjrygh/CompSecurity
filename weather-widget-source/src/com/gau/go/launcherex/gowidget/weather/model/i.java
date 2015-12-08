// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;

import java.util.Comparator;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.model:
//            h, GoLifeBean, j

public class i
    implements Comparator
{

    public i()
    {
    }

    private int a(GoLifeBean golifebean)
    {
        switch (h.a[golifebean.c().ordinal()])
        {
        default:
            throw new IllegalArgumentException("bad GoLifeBean.getType");

        case 1: // '\001'
            return 1;

        case 2: // '\002'
            return 2;

        case 3: // '\003'
            return 3;

        case 4: // '\004'
            return 4;

        case 5: // '\005'
            return 5;

        case 6: // '\006'
            return 6;

        case 7: // '\007'
            return 7;

        case 8: // '\b'
            return 8;

        case 9: // '\t'
            return 9;
        }
    }

    public int a(GoLifeBean golifebean, GoLifeBean golifebean1)
    {
        if (a(golifebean) < a(golifebean1))
        {
            return -1;
        }
        return a(golifebean) <= a(golifebean1) ? 0 : 1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((GoLifeBean)obj, (GoLifeBean)obj1);
    }
}
