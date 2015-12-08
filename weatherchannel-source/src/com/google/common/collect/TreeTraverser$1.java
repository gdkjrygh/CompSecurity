// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            FluentIterable, TreeTraverser, UnmodifiableIterator

class init> extends FluentIterable
{

    final TreeTraverser this$0;
    final Object val$root;

    public UnmodifiableIterator iterator()
    {
        return preOrderIterator(val$root);
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    ator()
    {
        this$0 = final_treetraverser;
        val$root = Object.this;
        super();
    }
}
