// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.cache;

import android.os.ConditionVariable;

// Referenced classes of package com.google.android.apps.youtube.common.cache:
//            c

final class h
    implements Runnable
{

    final c a;

    h(c c1)
    {
        a = c1;
        super();
    }

    public final void run()
    {
        c.a(a);
        c.b(a).open();
    }
}
