// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.Locale;
import java.util.Map;

class AnswersEventValidator
{

    boolean failFast;
    final int maxNumAttributes;
    final int maxStringLength;

    public AnswersEventValidator(int i, int j, boolean flag)
    {
        maxNumAttributes = i;
        maxStringLength = j;
        failFast = flag;
    }

    private void logOrThrowException(RuntimeException runtimeexception)
    {
        if (failFast)
        {
            throw runtimeexception;
        } else
        {
            Fabric.getLogger().e("Answers", "Invalid user input detected", runtimeexception);
            return;
        }
    }

    public boolean isFullMap(Map map, String s)
    {
        if (map.size() >= maxNumAttributes && !map.containsKey(s))
        {
            logOrThrowException(new IllegalArgumentException(String.format(Locale.US, "Limit of %d attributes reached, skipping attribute", new Object[] {
                Integer.valueOf(maxNumAttributes)
            })));
            return true;
        } else
        {
            return false;
        }
    }

    public boolean isNull(Object obj, String s)
    {
        if (obj == null)
        {
            logOrThrowException(new NullPointerException((new StringBuilder()).append(s).append(" must not be null").toString()));
            return true;
        } else
        {
            return false;
        }
    }

    public String limitStringLength(String s)
    {
        String s1 = s;
        if (s.length() > maxStringLength)
        {
            logOrThrowException(new IllegalArgumentException(String.format(Locale.US, "String is too long, truncating to %d characters", new Object[] {
                Integer.valueOf(maxStringLength)
            })));
            s1 = s.substring(0, maxStringLength);
        }
        return s1;
    }
}
