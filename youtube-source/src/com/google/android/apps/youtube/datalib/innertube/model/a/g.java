// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model.a;

import com.google.a.a.a.a.gl;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model.a:
//            e

public class g
{

    protected String a;
    protected List b;

    g()
    {
        b = new ArrayList();
    }

    public g(gl gl1)
    {
        b = new ArrayList();
        c.a(gl1);
        a = gl1.c;
        b = e.a(gl1.b);
    }

    public final String a()
    {
        return a;
    }

    public final List b()
    {
        return b;
    }
}
