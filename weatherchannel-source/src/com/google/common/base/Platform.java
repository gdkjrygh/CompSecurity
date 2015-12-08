// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.lang.ref.WeakReference;
import java.util.Map;

// Referenced classes of package com.google.common.base:
//            Enums, Optional, CharMatcher

final class Platform
{

    private Platform()
    {
    }

    static Optional getEnumIfPresent(Class class1, String s)
    {
        s = (WeakReference)Enums.getEnumConstants(class1).get(s);
        if (s == null)
        {
            return Optional.absent();
        } else
        {
            return Optional.of(class1.cast(s.get()));
        }
    }

    static CharMatcher precomputeCharMatcher(CharMatcher charmatcher)
    {
        return charmatcher.precomputedInternal();
    }

    static long systemNanoTime()
    {
        return System.nanoTime();
    }
}
