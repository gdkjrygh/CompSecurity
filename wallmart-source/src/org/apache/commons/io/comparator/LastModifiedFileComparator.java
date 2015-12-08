// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

// Referenced classes of package org.apache.commons.io.comparator:
//            AbstractFileComparator, ReverseComparator

public class LastModifiedFileComparator extends AbstractFileComparator
    implements Serializable
{

    public static final Comparator LASTMODIFIED_COMPARATOR;
    public static final Comparator LASTMODIFIED_REVERSE;

    public LastModifiedFileComparator()
    {
    }

    public int compare(File file, File file1)
    {
        long l = file.lastModified() - file1.lastModified();
        if (l < 0L)
        {
            return -1;
        }
        return l <= 0L ? 0 : 1;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((File)obj, (File)obj1);
    }

    public volatile List sort(List list)
    {
        return super.sort(list);
    }

    public volatile File[] sort(File afile[])
    {
        return super.sort(afile);
    }

    public volatile String toString()
    {
        return super.toString();
    }

    static 
    {
        LASTMODIFIED_COMPARATOR = new LastModifiedFileComparator();
        LASTMODIFIED_REVERSE = new ReverseComparator(LASTMODIFIED_COMPARATOR);
    }
}
