// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import android.net.Uri;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            ak, af

final class am
    implements b
{

    final ak a;
    private final b b;
    private boolean c;

    public am(ak ak1, b b1, boolean flag)
    {
        a = ak1;
        super();
        b = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        c = flag;
    }

    public final volatile void a(Object obj, Exception exception)
    {
        obj = (Uri)obj;
        b.a(obj, exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Uri)obj;
        obj1 = (Long)obj1;
        if (c && ((Long) (obj1)).longValue() <= 0L)
        {
            c = false;
            ak.a(a, true);
            ak.a(a).a(obj, this);
            return;
        } else
        {
            b.a(obj, obj1);
            return;
        }
    }
}
