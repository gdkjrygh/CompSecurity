// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.IOCase;

// Referenced classes of package org.apache.commons.io.comparator:
//            AbstractFileComparator, ReverseComparator

public class NameFileComparator extends AbstractFileComparator
    implements Serializable
{

    public static final Comparator NAME_COMPARATOR;
    public static final Comparator NAME_INSENSITIVE_COMPARATOR;
    public static final Comparator NAME_INSENSITIVE_REVERSE;
    public static final Comparator NAME_REVERSE;
    public static final Comparator NAME_SYSTEM_COMPARATOR;
    public static final Comparator NAME_SYSTEM_REVERSE;
    private final IOCase caseSensitivity;

    public NameFileComparator()
    {
        caseSensitivity = IOCase.SENSITIVE;
    }

    public NameFileComparator(IOCase iocase)
    {
        IOCase iocase1 = iocase;
        if (iocase == null)
        {
            iocase1 = IOCase.SENSITIVE;
        }
        caseSensitivity = iocase1;
    }

    public int compare(File file, File file1)
    {
        return caseSensitivity.checkCompareTo(file.getName(), file1.getName());
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

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append("[caseSensitivity=").append(caseSensitivity).append("]").toString();
    }

    static 
    {
        NAME_COMPARATOR = new NameFileComparator();
        NAME_REVERSE = new ReverseComparator(NAME_COMPARATOR);
        NAME_INSENSITIVE_COMPARATOR = new NameFileComparator(IOCase.INSENSITIVE);
        NAME_INSENSITIVE_REVERSE = new ReverseComparator(NAME_INSENSITIVE_COMPARATOR);
        NAME_SYSTEM_COMPARATOR = new NameFileComparator(IOCase.SYSTEM);
        NAME_SYSTEM_REVERSE = new ReverseComparator(NAME_SYSTEM_COMPARATOR);
    }
}
