// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import com.google.android.apps.youtube.api.ApiPlayer;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            d

final class j
    implements Runnable
{

    final int a;
    final d b;

    j(d d1, int i)
    {
        b = d1;
        a = i;
        super();
    }

    public final void run()
    {
        d.a(b).a(a);
    }
}
