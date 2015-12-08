// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.d;

import com.google.android.apps.youtube.a.a.g;

// Referenced classes of package com.google.android.apps.youtube.common.d:
//            j

final class m
    implements Runnable
{

    final g a;
    final j b;

    m(j j1, g g)
    {
        b = j1;
        a = g;
        super();
    }

    public final void run()
    {
        b.d(a);
    }
}
