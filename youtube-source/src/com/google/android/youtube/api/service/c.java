// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.api.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.youtube.api.service:
//            a

public final class c
{

    private final Set a = new HashSet();

    public c()
    {
    }

    public final void a()
    {
        for (Iterator iterator = (new HashSet(a)).iterator(); iterator.hasNext(); ((a)iterator.next()).a()) { }
    }

    public final void a(a a1)
    {
        a.add(a1);
    }

    public final void b(a a1)
    {
        a.remove(a1);
    }
}
