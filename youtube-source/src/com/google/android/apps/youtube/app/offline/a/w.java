// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.a;

import android.net.Uri;
import com.google.android.apps.youtube.core.offline.store.t;
import com.google.android.apps.youtube.core.player.a.l;

// Referenced classes of package com.google.android.apps.youtube.app.offline.a:
//            f

final class w
    implements t
{

    final f a;
    private final long b;

    private w(f f1, long l1)
    {
        a = f1;
        super();
        b = l1;
    }

    w(f f1, long l1, byte byte0)
    {
        this(f1, l1);
    }

    public final Uri a(String s, int i, long l1, long l2)
    {
        return f.b(a).a(s, i, l1, l2, b);
    }
}
