// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core;

import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.core.client.v;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core:
//            a, au

final class al extends f
{

    final a a;

    al(a a1)
    {
        a = a1;
        super();
    }

    public final Object a()
    {
        v v1 = new v(a.a, a.aJ(), a.aL(), a.aG(), a.aN(), a.aB(), a.aT(), a.av().getAbsolutePath());
        ArrayList arraylist = new ArrayList();
        arraylist.add(a.aE());
        arraylist.add(a.aS());
        v1.a(a.aA(), arraylist, a.aR(), a.aU(), a.au().C());
        return v1;
    }
}
