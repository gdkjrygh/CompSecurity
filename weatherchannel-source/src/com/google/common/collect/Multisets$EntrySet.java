// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            Multisets, Multiset

static abstract class ctSet extends ctSet
{

    public void clear()
    {
        multiset().clear();
    }

    public boolean contains(Object obj)
    {
        if (obj instanceof multiset)
        {
            obj = (multiset)obj;
            break MISSING_BLOCK_LABEL_12;
        }
        do
        {
            return false;
        } while (((multiset) (obj)).ount() <= 0 || multiset().count(((multiset) (obj)).lement()) != ((lement) (obj)).ount());
        return true;
    }

    abstract Multiset multiset();

    public boolean remove(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ount)
        {
            obj = (ount)obj;
            Object obj1 = ((ount) (obj)).lement();
            int i = ((lement) (obj)).ount();
            flag = flag1;
            if (i != 0)
            {
                flag = multiset().setCount(obj1, i, 0);
            }
        }
        return flag;
    }

    ctSet()
    {
    }
}
