// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.List;

// Referenced classes of package com.google.common.collect:
//            ImmutableList, Sets, ImmutableSet

static final class  extends ImmutableList
{

    final ImmutableList val$axes;

    public volatile Object get(int i)
    {
        return get(i);
    }

    public List get(int i)
    {
        return ((ImmutableSet)val$axes.get(i)).asList();
    }

    boolean isPartialView()
    {
        return true;
    }

    public int size()
    {
        return val$axes.size();
    }

    (ImmutableList immutablelist)
    {
        val$axes = immutablelist;
        super();
    }
}
