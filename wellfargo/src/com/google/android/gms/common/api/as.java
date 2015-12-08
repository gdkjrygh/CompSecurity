// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            av, ai, ax, h

class as extends av
{

    final ai a;
    private final ArrayList c;

    public as(ai ai1, ArrayList arraylist)
    {
        a = ai1;
        super(ai1, null);
        c = arraylist;
    }

    public void a()
    {
        Set set = ai.d(a).f;
        if (set.isEmpty())
        {
            set = ai.h(a);
        }
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((h)iterator.next()).a(ai.g(a), set)) { }
    }
}
