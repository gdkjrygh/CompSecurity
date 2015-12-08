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

public class DefaultFileComparator extends AbstractFileComparator
    implements Serializable
{

    public static final Comparator DEFAULT_COMPARATOR;
    public static final Comparator DEFAULT_REVERSE;

    public DefaultFileComparator()
    {
    }

    public int compare(File file, File file1)
    {
        return file.compareTo(file1);
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
        DEFAULT_COMPARATOR = new DefaultFileComparator();
        DEFAULT_REVERSE = new ReverseComparator(DEFAULT_COMPARATOR);
    }
}
