// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.cache:
//            CacheBuilderSpec

static class 
    implements 
{

    public void parse(CacheBuilderSpec cachebuilderspec, String s, String s1)
    {
        boolean flag1 = false;
        boolean flag;
        if (s1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "recordStats does not take values");
        flag = flag1;
        if (cachebuilderspec.recordStats == null)
        {
            flag = true;
        }
        Preconditions.checkArgument(flag, "recordStats already set");
        cachebuilderspec.recordStats = Boolean.valueOf(true);
    }

    ()
    {
    }
}
