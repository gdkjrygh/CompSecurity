// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.a;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.offline.store.i;

// Referenced classes of package com.google.android.apps.youtube.app.offline.a:
//            f

final class m
    implements Runnable
{

    final String a;
    final b b;
    final f c;

    m(f f1, String s, b b1)
    {
        c = f1;
        a = s;
        b = b1;
        super();
    }

    public final void run()
    {
        java.util.List list = f.a(c).m(a);
        if (list != null)
        {
            b.a(null, list);
            return;
        } else
        {
            b.a(null, null);
            return;
        }
    }
}
