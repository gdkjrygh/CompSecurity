// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import android.net.Uri;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            x, w, z

final class y
    implements b
{

    final w a;
    private final x b;

    public y(w w1, x x1)
    {
        a = w1;
        super();
        b = (x)c.a(x1);
    }

    public final void a(Object obj, Exception exception)
    {
        com.google.android.apps.youtube.core.transfer.w.b(a).remove(x.k(b));
        com.google.android.apps.youtube.core.transfer.w.c(a).a(exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Uri)obj1;
        x.g(b, ((Uri) (obj)).toString());
        w.a(a).put(x.a(b), com.google.android.apps.youtube.core.transfer.x.c(b));
        w.a(a, b);
    }
}
