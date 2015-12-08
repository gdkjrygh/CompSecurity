// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.comparator;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

abstract class AbstractFileComparator
    implements Comparator
{

    AbstractFileComparator()
    {
    }

    public List sort(List list)
    {
        if (list != null)
        {
            Collections.sort(list, this);
        }
        return list;
    }

    public transient File[] sort(File afile[])
    {
        if (afile != null)
        {
            Arrays.sort(afile, this);
        }
        return afile;
    }

    public String toString()
    {
        return getClass().getSimpleName();
    }
}
