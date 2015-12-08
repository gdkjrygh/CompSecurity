// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.google.a.a.a.a.sf;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            b, p

public final class aw extends b
{

    private final Set c;

    private aw(p p)
    {
        super(p);
        c = new HashSet();
    }

    aw(p p, byte byte0)
    {
        this(p);
    }

    public final aw a(String s)
    {
        c.add(s);
        return this;
    }

    protected final void c()
    {
        boolean flag;
        if (c.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag);
    }

    public final String e()
    {
        return "subscription/subscribe";
    }

    public final com.google.protobuf.nano.c f()
    {
        b();
        sf sf1 = new sf();
        sf1.b = d();
        sf1.c = (String[])c.toArray(new String[c.size()]);
        return sf1;
    }
}
