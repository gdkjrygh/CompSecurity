// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Preconditions;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.cache:
//            CacheBuilderSpec

static class  extends 
{

    protected void parseDuration(CacheBuilderSpec cachebuilderspec, long l, TimeUnit timeunit)
    {
        boolean flag;
        if (cachebuilderspec.refreshTimeUnit == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "refreshAfterWrite already set");
        cachebuilderspec.refreshDuration = l;
        cachebuilderspec.refreshTimeUnit = timeunit;
    }

    ()
    {
    }
}
