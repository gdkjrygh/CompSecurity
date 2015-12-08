// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

// Referenced classes of package com.google.common.io:
//            CharSource, MultiReader

private static final class sources extends CharSource
{

    private final Iterable sources;

    public boolean isEmpty()
        throws IOException
    {
        for (Iterator iterator = sources.iterator(); iterator.hasNext();)
        {
            if (!((CharSource)iterator.next()).isEmpty())
            {
                return false;
            }
        }

        return true;
    }

    public Reader openStream()
        throws IOException
    {
        return new MultiReader(sources.iterator());
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(sources));
        return (new StringBuilder(s.length() + 19)).append("CharSource.concat(").append(s).append(")").toString();
    }

    (Iterable iterable)
    {
        sources = (Iterable)Preconditions.checkNotNull(iterable);
    }
}
