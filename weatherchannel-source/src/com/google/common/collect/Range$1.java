// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;

// Referenced classes of package com.google.common.collect:
//            Range, Cut

static final class 
    implements Function
{

    public Cut apply(Range range)
    {
        return range.lowerBound;
    }

    public volatile Object apply(Object obj)
    {
        return apply((Range)obj);
    }

    ()
    {
    }
}
