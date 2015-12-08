// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            ForwardingSet

public abstract class ForwardingSortedSet extends ForwardingSet
    implements SortedSet
{

    protected ForwardingSortedSet()
    {
    }

    private int unsafeCompare(Object obj, Object obj1)
    {
        Comparator comparator1 = comparator();
        if (comparator1 == null)
        {
            return ((Comparable)obj).compareTo(obj1);
        } else
        {
            return comparator1.compare(obj, obj1);
        }
    }

    public Comparator comparator()
    {
        return _mthdelegate().comparator();
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Set _mthdelegate()
    {
        return _mthdelegate();
    }

    protected abstract SortedSet _mthdelegate();

    public Object first()
    {
        return _mthdelegate().first();
    }

    public SortedSet headSet(Object obj)
    {
        return _mthdelegate().headSet(obj);
    }

    public Object last()
    {
        return _mthdelegate().last();
    }

    protected boolean standardContains(Object obj)
    {
        boolean flag = false;
        int i;
        try
        {
            i = unsafeCompare(tailSet(obj).first(), obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        if (i == 0)
        {
            flag = true;
        }
        return flag;
    }

    protected boolean standardRemove(Object obj)
    {
        boolean flag1 = false;
        Iterator iterator;
        boolean flag;
        try
        {
            iterator = tailSet(obj).iterator();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        flag = flag1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_53;
        }
        flag = flag1;
        if (unsafeCompare(iterator.next(), obj) != 0)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        iterator.remove();
        flag = true;
        return flag;
    }

    protected SortedSet standardSubSet(Object obj, Object obj1)
    {
        return tailSet(obj).headSet(obj1);
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        return _mthdelegate().subSet(obj, obj1);
    }

    public SortedSet tailSet(Object obj)
    {
        return _mthdelegate().tailSet(obj);
    }
}
