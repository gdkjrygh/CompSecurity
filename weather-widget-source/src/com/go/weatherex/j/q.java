// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j;

import com.gau.go.launcherex.gowidget.weather.systemwidget.l;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.j:
//            p

class q
    implements l
{

    final p a;

    q(p p1)
    {
        a = p1;
        super();
    }

    public void a(ArrayList arraylist)
    {
        p.a(a, arraylist);
        if (arraylist == null || arraylist.isEmpty())
        {
            p.a(a);
        }
    }
}
