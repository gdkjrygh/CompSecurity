// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Preconditions;
import java.util.concurrent.TimeUnit;

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
        s1.charAt(s1.length() - 1);
        JVM INSTR lookupswitch 4: default 188
    //                   100: 137
    //                   104: 164
    //                   109: 172
    //                   115: 180;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_180;
_L1:
        throw new IllegalArgumentException(String.format("key %s invalid format.  was %s, must end with one of [dDhHmMsS]", new Object[] {
            s, s1
        }));
_L2:
        TimeUnit timeunit = TimeUnit.DAYS;
_L6:
        parseDuration(cachebuilderspec, Long.parseLong(s1.substring(0, s1.length() - 1)), timeunit);
        return;
_L3:
        try
        {
            timeunit = TimeUnit.HOURS;
        }
        // Misplaced declaration of an exception variable
        catch (CacheBuilderSpec cachebuilderspec)
        {
            throw new IllegalArgumentException(String.format("key %s value set to %s, must be integer", new Object[] {
                s, s1
            }));
        }
          goto _L6
_L4:
        timeunit = TimeUnit.MINUTES;
          goto _L6
        timeunit = TimeUnit.SECONDS;
          goto _L6
    }

    protected abstract void parseDuration(CacheBuilderSpec cachebuilderspec, long l, TimeUnit timeunit);

    ()
    {
    }
}
