// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

// Referenced classes of package org.apache.commons.io.filefilter:
//            AbstractFileFilter

public class SizeFileFilter extends AbstractFileFilter
    implements Serializable
{

    private final boolean acceptLarger;
    private final long size;

    public SizeFileFilter(long l)
    {
        this(l, true);
    }

    public SizeFileFilter(long l, boolean flag)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("The size must be non-negative");
        } else
        {
            size = l;
            acceptLarger = flag;
            return;
        }
    }

    public boolean accept(File file)
    {
        boolean flag;
        if (file.length() < size)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (acceptLarger)
        {
            return !flag;
        } else
        {
            return flag;
        }
    }

    public String toString()
    {
        String s;
        if (acceptLarger)
        {
            s = ">=";
        } else
        {
            s = "<";
        }
        return (new StringBuilder()).append(super.toString()).append("(").append(s).append(size).append(")").toString();
    }
}
