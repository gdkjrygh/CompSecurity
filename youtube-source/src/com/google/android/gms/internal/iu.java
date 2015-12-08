// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            iv, ju, jq

public final class iu
{

    private final ArrayList a;
    private int b;

    public iu()
    {
        this(100);
    }

    private iu(int i)
    {
        a = new ArrayList();
        b = 100;
    }

    public final ArrayList a()
    {
        return a;
    }

    public final void a(ju ju, jq jq)
    {
        a.add(new iv(ju, jq, (byte)0));
        for (; a.size() > b; a.remove(0)) { }
    }

    public final void b()
    {
        a.clear();
    }

    public final boolean c()
    {
        return a.isEmpty();
    }
}
