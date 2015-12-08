// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;

import java.util.Comparator;

// Referenced classes of package com.vladium.emma.report:
//            IItemAttribute, IItem

private static final class <init>
    implements Comparator
{

    public int compare(Object obj, Object obj1)
    {
        obj = (IItem)obj;
        obj1 = (IItem)obj1;
        return ((IItem) (obj)).getName().compareTo(((IItem) (obj1)).getName());
    }

    private Q()
    {
    }

    Q(Q q)
    {
        this();
    }
}
