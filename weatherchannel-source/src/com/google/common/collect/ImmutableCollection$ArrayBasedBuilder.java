// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, CollectPreconditions, ObjectArrays

static abstract class size extends size
{

    Object contents[];
    int size;

    private void ensureCapacity(int i)
    {
        if (contents.length < i)
        {
            contents = ObjectArrays.arraysCopyOf(contents, expandedCapacity(contents.length, i));
        }
    }

    public contents add(Object obj)
    {
        Preconditions.checkNotNull(obj);
        ensureCapacity(size + 1);
        Object aobj[] = contents;
        int i = size;
        size = i + 1;
        aobj[i] = obj;
        return this;
    }

    public volatile size add(Object obj)
    {
        return add(obj);
    }

    public transient add add(Object aobj[])
    {
        ObjectArrays.checkElementsNotNull(aobj);
        ensureCapacity(size + aobj.length);
        System.arraycopy(((Object) (aobj)), 0, ((Object) (contents)), size, aobj.length);
        size = size + aobj.length;
        return this;
    }

    public size addAll(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            Collection collection = (Collection)iterable;
            ensureCapacity(size + collection.size());
        }
        super.size(iterable);
        return this;
    }

    (int i)
    {
        CollectPreconditions.checkNonnegative(i, "initialCapacity");
        contents = new Object[i];
        size = 0;
    }
}
