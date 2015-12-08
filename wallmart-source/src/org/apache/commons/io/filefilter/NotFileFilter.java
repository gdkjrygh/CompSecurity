// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

// Referenced classes of package org.apache.commons.io.filefilter:
//            AbstractFileFilter, IOFileFilter

public class NotFileFilter extends AbstractFileFilter
    implements Serializable
{

    private final IOFileFilter filter;

    public NotFileFilter(IOFileFilter iofilefilter)
    {
        if (iofilefilter == null)
        {
            throw new IllegalArgumentException("The filter must not be null");
        } else
        {
            filter = iofilefilter;
            return;
        }
    }

    public boolean accept(File file)
    {
        return !filter.accept(file);
    }

    public boolean accept(File file, String s)
    {
        return !filter.accept(file, s);
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append("(").append(filter.toString()).append(")").toString();
    }
}
