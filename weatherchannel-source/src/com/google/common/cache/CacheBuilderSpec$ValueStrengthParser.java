// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.cache:
//            CacheBuilderSpec

static class strength
    implements strength
{

    private final strength strength;

    public void parse(CacheBuilderSpec cachebuilderspec, String s, String s1)
    {
        boolean flag;
        if (s1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "key %s does not take values", new Object[] {
            s
        });
        if (cachebuilderspec.valueStrength == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "%s was already set to %s", new Object[] {
            s, cachebuilderspec.valueStrength
        });
        cachebuilderspec.valueStrength = strength;
    }

    public ( )
    {
        strength = ;
    }
}
