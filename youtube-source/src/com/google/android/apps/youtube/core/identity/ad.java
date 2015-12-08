// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            aa, ah

final class ad
    implements Runnable
{

    final aa a;

    ad(aa aa1)
    {
        a = aa1;
        super();
    }

    public final void run()
    {
        for (Iterator iterator = aa.a(a).iterator(); iterator.hasNext(); ((ah)iterator.next()).a()) { }
        aa.a(a).clear();
    }
}
