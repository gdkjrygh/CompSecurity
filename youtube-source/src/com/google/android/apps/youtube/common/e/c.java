// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.e;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class c
{

    public static List a(List list)
    {
        if (list == null || list == Collections.EMPTY_LIST)
        {
            return Collections.emptyList();
        } else
        {
            return Collections.unmodifiableList(list);
        }
    }

    public static List a(int ai[])
    {
        ArrayList arraylist = new ArrayList();
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(Integer.valueOf(ai[i]));
        }

        return arraylist;
    }

    public static Set a(Map map, Object obj)
    {
        if (!map.containsKey(obj))
        {
            return new HashSet();
        } else
        {
            return (Set)map.get(obj);
        }
    }

    public static Set a(Set set)
    {
        if (set == null || set == Collections.EMPTY_SET)
        {
            return Collections.emptySet();
        } else
        {
            return Collections.unmodifiableSet(set);
        }
    }

    public static transient Set a(Object aobj[])
    {
        HashSet hashset = new HashSet(aobj.length);
        Collections.addAll(hashset, aobj);
        return a(((Set) (hashset)));
    }

    public static void a(Map map, Object obj, Object obj1)
    {
        Set set = (Set)map.get(obj);
        Object obj2 = set;
        if (set == null)
        {
            obj2 = new HashSet();
            map.put(obj, obj2);
        }
        ((Set) (obj2)).add(obj1);
    }

    public static transient int[] a(int ai[], int ai1[])
    {
        int ai2[] = Arrays.copyOf(ai, ai.length + ai1.length);
        System.arraycopy(ai1, 0, ai2, ai.length, ai1.length);
        return ai2;
    }

    public static transient Object[] a(Object aobj[], Object aobj1[])
    {
        Object aobj2[] = Arrays.copyOf(aobj, aobj.length + aobj1.length);
        System.arraycopy(((Object) (aobj1)), 0, ((Object) (aobj2)), aobj.length, aobj1.length);
        return aobj2;
    }

    public static boolean b(Map map, Object obj, Object obj1)
    {
        if (!map.containsKey(obj) || !((Set)map.get(obj)).contains(obj1))
        {
            return false;
        } else
        {
            ((Set)map.get(obj)).remove(obj1);
            return true;
        }
    }

    public static int[] b(List list)
    {
        int ai[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            ai[i] = ((Integer)list.get(i)).intValue();
        }

        return ai;
    }
}
