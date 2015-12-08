// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.a;

import com.google.android.apps.youtube.core.offline.store.i;

// Referenced classes of package com.google.android.apps.youtube.app.offline.a:
//            f

final class o
    implements Runnable
{

    final String a;
    final String b;
    final f c;

    o(f f1, String s, String s1)
    {
        c = f1;
        a = s;
        b = s1;
        super();
    }

    public final void run()
    {
        f.a(c).d(a, b);
    }
}
