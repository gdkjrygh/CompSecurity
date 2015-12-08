// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            aa, ah

final class af
    implements Runnable
{

    final Exception a;
    final aa b;

    af(aa aa1, Exception exception)
    {
        b = aa1;
        a = exception;
        super();
    }

    public final void run()
    {
        for (Iterator iterator = aa.a(b).iterator(); iterator.hasNext(); ((ah)iterator.next()).a(a)) { }
        aa.a(b).clear();
    }
}
