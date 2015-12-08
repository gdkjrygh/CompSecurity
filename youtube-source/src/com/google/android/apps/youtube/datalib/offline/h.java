// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.offline;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.d.c;
import com.google.android.apps.youtube.common.d.g;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.datalib.offline:
//            j

public final class h extends c
{

    private final j a;
    private final Set b = new HashSet();

    public h(j j1)
    {
        a = (j)com.google.android.apps.youtube.common.fromguava.c.a(j1);
        b.add(g.a);
    }

    protected final void a()
    {
        L.e("Network change detected, dispatch offline http requests.");
        a.a();
    }

    protected final Set b()
    {
        return b;
    }
}
