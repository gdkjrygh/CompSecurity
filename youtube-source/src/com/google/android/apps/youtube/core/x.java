// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core;

import com.google.android.apps.youtube.common.d.j;
import com.google.android.apps.youtube.common.d.q;
import com.google.android.apps.youtube.common.e.f;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.apps.youtube.core:
//            a

final class x extends f
{

    final a a;

    x(a a1)
    {
        a = a1;
        super();
    }

    public final Object a()
    {
        return new j(new q(a.bg()), Executors.newScheduledThreadPool(1), a.aG(), a.au(), a.aJ());
    }
}
