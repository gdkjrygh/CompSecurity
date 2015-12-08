// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core;

import com.google.android.apps.youtube.common.d.d;
import com.google.android.apps.youtube.common.d.g;
import com.google.android.apps.youtube.common.e.f;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.apps.youtube.core:
//            a

final class z extends f
{

    final a a;

    z(a a1)
    {
        a = a1;
        super();
    }

    public final Object a()
    {
        g g1 = new g(a.bf(), a.aX());
        HashMap hashmap = new HashMap();
        hashmap.put(g1.b(), g1);
        return new d(hashmap, Executors.newSingleThreadExecutor());
    }
}
