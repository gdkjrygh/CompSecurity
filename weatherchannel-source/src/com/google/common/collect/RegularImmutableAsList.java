// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableAsList, ImmutableList, ImmutableCollection, UnmodifiableListIterator

class RegularImmutableAsList extends ImmutableAsList
{

    private final ImmutableCollection _flddelegate;
    private final ImmutableList delegateList;

    RegularImmutableAsList(ImmutableCollection immutablecollection, ImmutableList immutablelist)
    {
        _flddelegate = immutablecollection;
        delegateList = immutablelist;
    }

    RegularImmutableAsList(ImmutableCollection immutablecollection, Object aobj[])
    {
        this(immutablecollection, ImmutableList.asImmutableList(aobj));
    }

    int copyIntoArray(Object aobj[], int i)
    {
        return delegateList.copyIntoArray(aobj, i);
    }

    ImmutableCollection delegateCollection()
    {
        return _flddelegate;
    }

    ImmutableList delegateList()
    {
        return delegateList;
    }

    public Object get(int i)
    {
        return delegateList.get(i);
    }

    public UnmodifiableListIterator listIterator(int i)
    {
        return delegateList.listIterator(i);
    }

    public volatile ListIterator listIterator(int i)
    {
        return listIterator(i);
    }
}
