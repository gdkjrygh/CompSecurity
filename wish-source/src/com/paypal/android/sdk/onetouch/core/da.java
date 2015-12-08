// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            dc, cx

public final class da extends dc
{

    private boolean a;
    private Collection b;
    private Map c;

    public da()
    {
        b = new HashSet();
        c = new HashMap();
    }

    public final volatile dc a()
    {
        return this;
    }

    public final void a(String s)
    {
        b.add(s);
    }

    public final void a(String s, cx cx1)
    {
        c.put(s, cx1);
    }

    public final boolean a(Set set)
    {
        if (a)
        {
            return true;
        } else
        {
            return set.containsAll(set);
        }
    }

    public final cx b(String s)
    {
        if (c.containsKey(s))
        {
            return (cx)c.get(s);
        }
        if (c.containsKey("develop"))
        {
            return (cx)c.get("develop");
        } else
        {
            return (cx)c.get("live");
        }
    }

    public final void b()
    {
        a = true;
    }
}
