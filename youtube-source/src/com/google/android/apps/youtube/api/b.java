// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;

import com.google.android.apps.youtube.core.client.as;

// Referenced classes of package com.google.android.apps.youtube.api:
//            a, c, f

final class b
    implements Runnable
{

    final f a;
    final a b;

    b(a a1, f f)
    {
        b = a1;
        a = f;
        super();
    }

    public final void run()
    {
        com.google.android.apps.youtube.api.a.d(b).a(new c(this));
    }
}
