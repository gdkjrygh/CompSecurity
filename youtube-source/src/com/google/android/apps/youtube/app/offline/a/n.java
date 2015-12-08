// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.a;

import com.google.android.apps.youtube.core.offline.store.i;

// Referenced classes of package com.google.android.apps.youtube.app.offline.a:
//            f

final class n
    implements Runnable
{

    final String a;
    final f b;

    n(f f1, String s)
    {
        b = f1;
        a = s;
        super();
    }

    public final void run()
    {
        f.a(b).w(a);
    }
}
