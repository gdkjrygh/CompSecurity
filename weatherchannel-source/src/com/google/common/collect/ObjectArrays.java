// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            Platform

public final class ObjectArrays
{

    static final Object EMPTY_ARRAY[] = new Object[0];

    private ObjectArrays()
    {
    }

    static Object[] arraysCopyOf(Object aobj[], int i)
    {
        Object aobj1[] = newArray(aobj, i);
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, Math.min(aobj.length, i));
        return aobj1;
    }

    static Object checkElementNotNull(Object obj, int i)
    {
        if (obj == null)
        {
            throw new NullPointerException((new StringBuilder(20)).append("at index ").append(i).toString());
        } else
        {
            return obj;
        }
    }

    static transient Object[] checkElementsNotNull(Object aobj[])
    {
        return checkElementsNotNull(aobj, aobj.length);
    }

    static Object[] checkElementsNotNull(Object aobj[], int i)
    {
        for (int j = 0; j < i; j++)
        {
            checkElementNotNull(aobj[j], j);
        }

        return aobj;
    }

    public static Object[] concat(Object obj, Object aobj[])
    {
        Object aobj1[] = newArray(aobj, aobj.length + 1);
        aobj1[0] = obj;
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 1, aobj.length);
        return aobj1;
    }

    public static Object[] concat(Object aobj[], Object obj)
    {
        Object aobj1[] = arraysCopyOf(aobj, aobj.length + 1);
        aobj1[aobj.length] = obj;
        return aobj1;
    }

    public static Object[] concat(Object aobj[], Object aobj1[], Class class1)
    {
        class1 = ((Class) (newArray(class1, aobj.length + aobj1.length)));
        System.arraycopy(((Object) (aobj)), 0, class1, 0, aobj.length);
        System.arraycopy(((Object) (aobj1)), 0, class1, aobj.length, aobj1.length);
        return class1;
    }

    static Object[] copyAsObjectArray(Object aobj[], int i, int j)
    {
        Preconditions.checkPositionIndexes(i, i + j, aobj.length);
        if (j == 0)
        {
            return EMPTY_ARRAY;
        } else
        {
            Object aobj1[] = new Object[j];
            System.arraycopy(((Object) (aobj)), i, ((Object) (aobj1)), 0, j);
            return aobj1;
        }
    }

    private static Object[] fillArray(Iterable iterable, Object aobj[])
    {
        int i = 0;
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            aobj[i] = iterable.next();
            i++;
        }

        return aobj;
    }

    public static Object[] newArray(Class class1, int i)
    {
        return (Object[])(Object[])Array.newInstance(class1, i);
    }

    public static Object[] newArray(Object aobj[], int i)
    {
        return Platform.newArray(aobj, i);
    }

    static void swap(Object aobj[], int i, int j)
    {
        Object obj = aobj[i];
        aobj[i] = aobj[j];
        aobj[j] = obj;
    }

    static Object[] toArrayImpl(Collection collection)
    {
        return fillArray(collection, new Object[collection.size()]);
    }

    static Object[] toArrayImpl(Collection collection, Object aobj[])
    {
        int i = collection.size();
        Object aobj1[] = aobj;
        if (aobj.length < i)
        {
            aobj1 = newArray(aobj, i);
        }
        fillArray(collection, aobj1);
        if (aobj1.length > i)
        {
            aobj1[i] = null;
        }
        return aobj1;
    }

    static Object[] toArrayImpl(Object aobj[], int i, int j, Object aobj1[])
    {
        Preconditions.checkPositionIndexes(i, i + j, aobj.length);
        if (aobj1.length >= j) goto _L2; else goto _L1
_L1:
        Object aobj2[] = newArray(aobj1, j);
_L4:
        System.arraycopy(((Object) (aobj)), i, ((Object) (aobj2)), 0, j);
        return aobj2;
_L2:
        aobj2 = aobj1;
        if (aobj1.length > j)
        {
            aobj1[j] = null;
            aobj2 = aobj1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
