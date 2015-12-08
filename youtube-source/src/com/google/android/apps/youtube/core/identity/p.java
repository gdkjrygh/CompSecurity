// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            o, v

final class p
    implements Runnable
{

    final o a;

    p(o o1)
    {
        a = o1;
        super();
    }

    public final void run()
    {
        for (Iterator iterator = o.a(a).iterator(); iterator.hasNext(); ((v)iterator.next()).a()) { }
        o.a(a).clear();
    }
}
