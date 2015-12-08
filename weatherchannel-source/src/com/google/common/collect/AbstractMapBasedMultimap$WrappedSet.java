// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultimap, Sets

private class ection extends ection
    implements Set
{

    final AbstractMapBasedMultimap this$0;

    public boolean removeAll(Collection collection)
    {
        boolean flag;
        if (collection.isEmpty())
        {
            flag = false;
        } else
        {
            int i = size();
            boolean flag1 = Sets.removeAllImpl((Set)_flddelegate, collection);
            flag = flag1;
            if (flag1)
            {
                int j = _flddelegate.size();
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, j - i);
                removeIfEmpty();
                return flag1;
            }
        }
        return flag;
    }

    ection(Object obj, Set set)
    {
        this$0 = AbstractMapBasedMultimap.this;
        super(AbstractMapBasedMultimap.this, obj, set, null);
    }
}
