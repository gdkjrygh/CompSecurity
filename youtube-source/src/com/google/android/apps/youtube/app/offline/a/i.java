// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.a;

import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.app.offline.a:
//            f

final class i
    implements Runnable
{

    final b a;
    final f b;

    i(f f1, b b1)
    {
        b = f1;
        a = b1;
        super();
    }

    public final void run()
    {
        a.a(null, f.a(b).b());
    }
}
