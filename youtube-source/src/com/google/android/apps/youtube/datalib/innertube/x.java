// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import android.text.TextUtils;
import com.google.a.a.a.a.jd;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            b, p

public abstract class x extends b
{

    protected String c;
    protected String d;

    protected x(p p)
    {
        super(p);
        c = "";
        d = "";
    }

    public x a(String s)
    {
        c = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
        return this;
    }

    public x b(String s)
    {
        d = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
        return this;
    }

    protected final void c()
    {
        boolean flag;
        if (TextUtils.isEmpty(d) != TextUtils.isEmpty(c))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag);
    }

    protected final jd g()
    {
        jd jd1 = new jd();
        jd1.c = d;
        jd1.b = c;
        return jd1;
    }
}
