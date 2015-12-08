// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            e, au

final class f
    implements Runnable
{

    final au a;
    final e b;

    f(e e1, au au)
    {
        b = e1;
        a = au;
        super();
    }

    public final void run()
    {
        e.a(b).add(a);
    }
}
