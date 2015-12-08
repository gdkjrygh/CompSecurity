// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item.model;

import java.util.Collections;
import java.util.List;

public class SupplementFacts
{

    public final List footer;
    public final List header;
    public final List segments;

    public SupplementFacts(List list, List list1, List list2)
    {
        header = Collections.unmodifiableList(list);
        segments = Collections.unmodifiableList(list1);
        footer = Collections.unmodifiableList(list2);
    }
}
