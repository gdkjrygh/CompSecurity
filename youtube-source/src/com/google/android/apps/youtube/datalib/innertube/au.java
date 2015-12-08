// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.google.a.a.a.a.fi;
import com.google.a.a.a.a.ql;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.v;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            b, p

public final class au extends b
{

    private String c;
    private String d;
    private fi e;

    private au(p p)
    {
        super(p);
        e = new fi();
        a(new byte[0]);
    }

    au(p p, byte byte0)
    {
        this(p);
    }

    public final au a(v v1)
    {
        if (v1.a())
        {
            e.l = 3;
            return this;
        } else
        {
            e.l = 0;
            return this;
        }
    }

    public final au a(SearchService.ResultTypeRestrictType resulttyperestricttype)
    {
        e.c = resulttyperestricttype.getType();
        return this;
    }

    public final au a(SearchService.UploadDateRestrictType uploaddaterestricttype)
    {
        e.b = uploaddaterestricttype.getType();
        return this;
    }

    public final au a(String s)
    {
        c = s;
        return this;
    }

    public final au b(String s)
    {
        d = s;
        return this;
    }

    protected final void c()
    {
        if (c == null)
        {
            com.google.android.apps.youtube.common.fromguava.c.a(d);
            return;
        } else
        {
            com.google.android.apps.youtube.common.fromguava.c.a(c);
            return;
        }
    }

    public final String e()
    {
        return "search";
    }

    public final com.google.protobuf.nano.c f()
    {
        b();
        ql ql1 = new ql();
        ql1.b = d();
        if (e.c != 0 || e.b != 0 || e.l != 0)
        {
            ql1.g = e;
        }
        if (c != null)
        {
            ql1.c = c;
            return ql1;
        } else
        {
            ql1.f = d;
            return ql1;
        }
    }
}
