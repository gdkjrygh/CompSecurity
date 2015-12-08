// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.a.b;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            ad

final class ae
    implements b
{

    final ad a;
    private final List b;
    private List c;
    private b d;

    public ae(ad ad1, List list, List list1, b b1)
    {
        a = ad1;
        super();
        c = list;
        b = list1;
        d = b1;
    }

    public final volatile void a(Object obj, Exception exception)
    {
        d.a(c, exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (List)obj1;
        b.addAll(((java.util.Collection) (obj)));
        ad.a(a, c, b, this, d);
    }
}
