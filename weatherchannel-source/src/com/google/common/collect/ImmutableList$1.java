// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            AbstractIndexedListIterator, ImmutableList

class istIterator extends AbstractIndexedListIterator
{

    final ImmutableList this$0;

    protected Object get(int i)
    {
        return ImmutableList.this.get(i);
    }

    istIterator(int i, int j)
    {
        this$0 = ImmutableList.this;
        super(i, j);
    }
}
