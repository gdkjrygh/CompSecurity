// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.google.common.base:
//            Joiner, Preconditions

class nit> extends Joiner
{

    final Joiner this$0;

    public Appendable appendTo(Appendable appendable, Iterator iterator)
        throws IOException
    {
        Preconditions.checkNotNull(appendable, "appendable");
        Preconditions.checkNotNull(iterator, "parts");
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = iterator.next();
            if (obj == null)
            {
                continue;
            }
            appendable.append(toString(obj));
            break;
        } while (true);
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj1 = iterator.next();
            if (obj1 != null)
            {
                appendable.append(Joiner.access$100(Joiner.this));
                appendable.append(toString(obj1));
            }
        } while (true);
        return appendable;
    }

    public Joiner useForNull(String s)
    {
        throw new UnsupportedOperationException("already specified skipNulls");
    }

    public pJoiner withKeyValueSeparator(String s)
    {
        throw new UnsupportedOperationException("can't use .skipNulls() with maps");
    }

    pJoiner(Joiner joiner1)
    {
        this$0 = Joiner.this;
        super(joiner1, null);
    }
}
