// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            da, RequestTarget, cw

public class db
{

    private ArrayList a;
    private ArrayList b;
    private String c;

    public db()
    {
        a = new ArrayList();
        b = new ArrayList();
    }

    public final da a(Set set)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            da da1 = (da)iterator.next();
            if (da1.d() == RequestTarget.browser && da1.a(set))
            {
                return da1;
            }
        }

        return null;
    }

    public final db a(da da1)
    {
        a.add(da1);
        return this;
    }

    public final db a(String s)
    {
        c = s;
        return this;
    }

    public final String a()
    {
        return c;
    }

    public final void a(cw cw1)
    {
        b.add(cw1);
    }

    public final cw b()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            cw cw1 = (cw)iterator.next();
            if (cw1.d() == RequestTarget.browser)
            {
                return cw1;
            }
        }

        return null;
    }

    public final List c()
    {
        return new ArrayList(a);
    }

    public final List d()
    {
        return new ArrayList(b);
    }

    public String toString()
    {
        return (new StringBuilder()).append(com/paypal/android/sdk/onetouch/core/db.getSimpleName()).append("[fileTimestamp=").append(c).append(", oauth2RecipesInDecreasingPriorityOrder").append(a).append(", checkoutRecipesInDecreasingPriorityOrder").append(b).append("]").toString();
    }
}
