// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.walmart.android.utils:
//            Criteria

public class CollectionUtils
{
    public static interface UnaryPredicate
    {

        public abstract boolean isTrue(Object obj);
    }


    public CollectionUtils()
    {
    }

    public static Object[] addAndExpand(Object aobj[], Object obj, Class class1)
    {
        if (aobj == null)
        {
            aobj = (Object[])(Object[])Array.newInstance(class1, 1);
            aobj[0] = obj;
            return aobj;
        }
        class1 = ((Class) ((Object[])(Object[])Array.newInstance(class1, aobj.length + 1)));
        for (int i = 0; i < aobj.length; i++)
        {
            class1[i] = aobj[i];
        }

        class1[class1.length - 1] = obj;
        return class1;
    }

    public static void addIfNotNull(Collection collection, Object obj)
    {
        if (obj != null)
        {
            collection.add(obj);
        }
    }

    public static void collectIf(List list, List list1, UnaryPredicate unarypredicate)
    {
        list = list.listIterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = list.next();
            if (unarypredicate.isTrue(obj))
            {
                list1.add(obj);
            }
        } while (true);
    }

    public static boolean containsElementWithCriteria(Collection collection, Criteria criteria)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (criteria.fullfilled(collection.next()))
            {
                return true;
            }
        }

        return false;
    }

    public static int indexOf(List list, UnaryPredicate unarypredicate)
    {
        int i = 0;
        for (list = list.iterator(); list.hasNext();)
        {
            if (unarypredicate.isTrue(list.next()))
            {
                return i;
            }
            i++;
        }

        return -1;
    }

    public static boolean removeIf(List list, UnaryPredicate unarypredicate)
    {
        boolean flag = false;
        list = list.listIterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            if (unarypredicate.isTrue(list.next()))
            {
                list.remove();
                flag = true;
            }
        } while (true);
        return flag;
    }

    public static List toUnmodifiableList(List list)
    {
        if (list != null)
        {
            return Collections.unmodifiableList(list);
        } else
        {
            return Collections.emptyList();
        }
    }
}
