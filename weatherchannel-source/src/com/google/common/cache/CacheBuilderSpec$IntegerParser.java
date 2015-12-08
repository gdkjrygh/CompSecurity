// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.cache:
//            CacheBuilderSpec

static abstract class 
    implements 
{

    public void parse(CacheBuilderSpec cachebuilderspec, String s, String s1)
    {
        boolean flag;
        if (s1 != null && !s1.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "value of key %s omitted", new Object[] {
            s
        });
        try
        {
            parseInteger(cachebuilderspec, Integer.parseInt(s1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CacheBuilderSpec cachebuilderspec)
        {
            throw new IllegalArgumentException(String.format("key %s value set to %s, must be integer", new Object[] {
                s, s1
            }), cachebuilderspec);
        }
    }

    protected abstract void parseInteger(CacheBuilderSpec cachebuilderspec, int i);

    ()
    {
    }
}
