// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.api:
//            av, h, ai

class au extends av
{

    final ai a;
    private final ArrayList c;

    public au(ai ai1, ArrayList arraylist)
    {
        a = ai1;
        super(ai1, null);
        c = arraylist;
    }

    public void a()
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((h)iterator.next()).a(ai.g(a))) { }
    }
}
