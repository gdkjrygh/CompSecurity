// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core;

import com.google.android.apps.youtube.common.e.f;

// Referenced classes of package com.google.android.apps.youtube.core:
//            a

final class aq extends f
{

    final a a;

    aq(a a1)
    {
        a = a1;
        super();
    }

    public final Object a()
    {
        return com.google.android.apps.youtube.core.a.a(Math.max(1, Runtime.getRuntime().availableProcessors() - 1), 60, 10);
    }
}
