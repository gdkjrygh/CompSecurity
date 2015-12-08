// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util;

import java.lang.reflect.Field;

public final class ObjectUtils
{

    private ObjectUtils()
    {
    }

    public static transient int getHashCodeFrom(Object obj, Object aobj[])
    {
        int j = getHashCodeFromSingleObject(obj);
        int k = aobj.length;
        for (int i = 0; i < k; i++)
        {
            j += getHashCodeFromSingleObject(aobj[i]);
        }

        return j;
    }

    private static int getHashCodeFromSingleObject(Object obj)
    {
        if (obj == null)
        {
            return 0;
        } else
        {
            return obj.hashCode();
        }
    }

    public static void injectValue(Object obj, String s, Object obj1)
        throws NoSuchFieldException, IllegalAccessException
    {
        s = obj.getClass().getDeclaredField(s);
        s.setAccessible(true);
        s.set(obj, obj1);
    }

    public static transient boolean isAnyNull(Object obj, Object aobj[])
    {
        if (obj != null && aobj != null) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        int j = aobj.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                if (aobj[i] == null)
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }
}
