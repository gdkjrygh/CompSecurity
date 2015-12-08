// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

// Referenced classes of package com.google.common.io:
//            CharSource

class MultiReader extends Reader
{

    private Reader current;
    private final Iterator it;

    MultiReader(Iterator iterator)
        throws IOException
    {
        it = iterator;
        advance();
    }

    private void advance()
        throws IOException
    {
        close();
        if (it.hasNext())
        {
            current = ((CharSource)it.next()).openStream();
        }
    }

    public void close()
        throws IOException
    {
        if (current == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        current.close();
        current = null;
        return;
        Exception exception;
        exception;
        current = null;
        throw exception;
    }

    public int read(char ac[], int i, int j)
        throws IOException
    {
        int k;
        if (current == null)
        {
            k = -1;
        } else
        {
            int l = current.read(ac, i, j);
            k = l;
            if (l == -1)
            {
                advance();
                return read(ac, i, j);
            }
        }
        return k;
    }

    public boolean ready()
        throws IOException
    {
        return current != null && current.ready();
    }

    public long skip(long l)
        throws IOException
    {
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "n is negative");
        if (l > 0L)
        {
            while (current != null) 
            {
                long l1 = current.skip(l);
                if (l1 > 0L)
                {
                    return l1;
                }
                advance();
            }
        }
        return 0L;
    }
}
