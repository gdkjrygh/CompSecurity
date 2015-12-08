// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item.model;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.walmart.android.service.item.model:
//            Nutrition

public static class <init>
{

    public final String amount;
    public final List children;
    public final String dvp;
    public final String name;

    public (String s, String s1, String s2, List list)
    {
        if (s == null)
        {
            s = "";
        }
        name = s;
        if (s1 == null)
        {
            s1 = "";
        }
        dvp = s1;
        if (s2 == null)
        {
            s2 = "";
        }
        amount = s2;
        children = Collections.unmodifiableList(list);
    }

    public children(List list)
    {
        this(null, null, null, list);
    }
}
