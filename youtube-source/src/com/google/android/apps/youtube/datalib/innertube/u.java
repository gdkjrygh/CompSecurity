// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.google.a.a.a.a.ij;
import com.google.a.a.a.a.ik;
import com.google.a.a.a.a.va;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            b, p

public final class u extends b
{

    private List c;

    private u(p p)
    {
        super(p);
        c = new ArrayList();
        a(new byte[0]);
    }

    u(p p, byte byte0)
    {
        this(p);
    }

    public final u b(byte abyte0[])
    {
        ik ik1 = new ik();
        ik1.b = new va();
        ik1.b.b = (new byte[][] {
            abyte0
        });
        c.add(ik1);
        return this;
    }

    protected final void c()
    {
        boolean flag;
        if (!c.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag);
    }

    public final String e()
    {
        return "log_interaction";
    }

    public final com.google.protobuf.nano.c f()
    {
        b();
        ij ij1 = new ij();
        ij1.b = d();
        ij1.c = (ik[])c.toArray(new ik[c.size()]);
        return ij1;
    }
}
