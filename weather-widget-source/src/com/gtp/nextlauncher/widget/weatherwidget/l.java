// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import java.nio.ShortBuffer;
import java.util.ArrayList;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            m

public class l
{

    public m a;
    public m b;
    public m c;
    public m d;
    private ArrayList e;

    public l(m m1, m m2, m m3, m m4)
    {
        e = new ArrayList();
        a = m1;
        b = m2;
        c = m3;
        d = m4;
        e.add(a);
        e.add(b);
        e.add(c);
        e.add(d);
    }

    public int a()
    {
        return 6;
    }

    public void a(ShortBuffer shortbuffer)
    {
        shortbuffer.put(a.a());
        shortbuffer.put(b.a());
        shortbuffer.put(d.a());
        shortbuffer.put(b.a());
        shortbuffer.put(c.a());
        shortbuffer.put(d.a());
    }
}
