// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.converter.http.c;
import com.google.android.apps.youtube.core.utils.PackageUtil;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            DebugOnlyVmapAdRequester

final class o
    implements Runnable
{

    final c a;
    final b b;
    final DebugOnlyVmapAdRequester c;

    o(DebugOnlyVmapAdRequester debugonlyvmapadrequester, c c1, b b1)
    {
        c = debugonlyvmapadrequester;
        a = c1;
        b = b1;
        super();
    }

    public final void run()
    {
        if (!PackageUtil.b(DebugOnlyVmapAdRequester.a(c)))
        {
            throw new IllegalStateException("Forced VMAP request should only be used in debug build");
        } else
        {
            DebugOnlyVmapAdRequester.a(c, a, b);
            return;
        }
    }
}
