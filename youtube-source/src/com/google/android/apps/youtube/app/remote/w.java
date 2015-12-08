// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.youtube.common.a.b;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            ac, t

final class w extends ac
{

    final b a;
    final t b;

    w(t t1, Void void1, b b1, b b2)
    {
        b = t1;
        a = b2;
        super(t1, null, b1);
    }

    public final volatile void a(Object obj, Object obj1)
    {
        obj = (List)obj1;
        if (a != null)
        {
            a.a(null, t.a(b, ((List) (obj))));
        }
    }
}
