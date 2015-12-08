// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Predicate;

// Referenced classes of package com.google.common.reflect:
//            ClassPath

static final class assInfo
    implements Predicate
{

    public boolean apply(assInfo assinfo)
    {
        return assInfo.access._mth000(assinfo).indexOf('$') == -1;
    }

    public volatile boolean apply(Object obj)
    {
        return apply((assInfo)obj);
    }

    assInfo()
    {
    }
}
