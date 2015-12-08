// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            TreeTraverser

private static final class childIterator
{

    final Iterator childIterator;
    final Object root;

    (Object obj, Iterator iterator)
    {
        root = Preconditions.checkNotNull(obj);
        childIterator = (Iterator)Preconditions.checkNotNull(iterator);
    }
}
