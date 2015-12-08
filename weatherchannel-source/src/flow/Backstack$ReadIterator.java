// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package flow;

import java.util.Iterator;

// Referenced classes of package flow:
//            Backstack

private static class iterator
    implements Iterator
{

    private final Iterator iterator;

    public boolean hasNext()
    {
        return iterator.hasNext();
    }

    public Object next()
    {
        return iterator.next();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    public onException(Iterator iterator1)
    {
        iterator = iterator1;
    }
}
