// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableMultiset, Multiset, LinkedHashMultiset

private static class counts
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final int counts[];
    final Object elements[];

    Object readResolve()
    {
        LinkedHashMultiset linkedhashmultiset = LinkedHashMultiset.create(elements.length);
        for (int i = 0; i < elements.length; i++)
        {
            linkedhashmultiset.add(elements[i], counts[i]);
        }

        return ImmutableMultiset.copyOf(linkedhashmultiset);
    }

    (Multiset multiset)
    {
        int i = multiset.entrySet().size();
        elements = new Object[i];
        counts = new int[i];
        i = 0;
        for (multiset = multiset.entrySet().iterator(); multiset.hasNext();)
        {
              = (counts)multiset.next();
            elements[i] = .elements();
            counts[i] = .counts();
            i++;
        }

    }
}
