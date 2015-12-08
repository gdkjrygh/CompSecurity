// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package android.support.v7.widget:
//            GridLayout

static final class <init>
{

    public final int index[];
    public final Object keys[];
    public final Object values[];

    private static Object[] compact(Object aobj[], int ai[])
    {
        int j = aobj.length;
        Object aobj1[] = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), GridLayout.max2(ai, -1) + 1);
        for (int i = 0; i < j; i++)
        {
            aobj1[ai[i]] = aobj[i];
        }

        return aobj1;
    }

    private static int[] createIndex(Object aobj[])
    {
        int j = aobj.length;
        int ai[] = new int[j];
        HashMap hashmap = new HashMap();
        for (int i = 0; i < j; i++)
        {
            Object obj = aobj[i];
            Integer integer1 = (Integer)hashmap.get(obj);
            Integer integer = integer1;
            if (integer1 == null)
            {
                integer = Integer.valueOf(hashmap.size());
                hashmap.put(obj, integer);
            }
            ai[i] = integer.intValue();
        }

        return ai;
    }

    public Object getValue(int i)
    {
        return values[index[i]];
    }

    private (Object aobj[], Object aobj1[])
    {
        index = createIndex(aobj);
        keys = compact(aobj, index);
        values = compact(aobj1, index);
    }

    index(Object aobj[], Object aobj1[], index index1)
    {
        this(aobj, aobj1);
    }
}
