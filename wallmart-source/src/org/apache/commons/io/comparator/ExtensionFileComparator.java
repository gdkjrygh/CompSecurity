// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOCase;

// Referenced classes of package org.apache.commons.io.comparator:
//            AbstractFileComparator, ReverseComparator

public class ExtensionFileComparator extends AbstractFileComparator
    implements Serializable
{

    public static final Comparator EXTENSION_COMPARATOR;
    public static final Comparator EXTENSION_INSENSITIVE_COMPARATOR;
    public static final Comparator EXTENSION_INSENSITIVE_REVERSE;
    public static final Comparator EXTENSION_REVERSE;
    public static final Comparator EXTENSION_SYSTEM_COMPARATOR;
    public static final Comparator EXTENSION_SYSTEM_REVERSE;
    private final IOCase caseSensitivity;

    public ExtensionFileComparator()
    {
        caseSensitivity = IOCase.SENSITIVE;
    }

    public ExtensionFileComparator(IOCase iocase)
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
        file = FilenameUtils.getExtension(file.getName());
        file1 = FilenameUtils.getExtension(file1.getName());
        return caseSensitivity.checkCompareTo(file, file1);
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
        EXTENSION_COMPARATOR = new ExtensionFileComparator();
        EXTENSION_REVERSE = new ReverseComparator(EXTENSION_COMPARATOR);
        EXTENSION_INSENSITIVE_COMPARATOR = new ExtensionFileComparator(IOCase.INSENSITIVE);
        EXTENSION_INSENSITIVE_REVERSE = new ReverseComparator(EXTENSION_INSENSITIVE_COMPARATOR);
        EXTENSION_SYSTEM_COMPARATOR = new ExtensionFileComparator(IOCase.SYSTEM);
        EXTENSION_SYSTEM_REVERSE = new ReverseComparator(EXTENSION_SYSTEM_COMPARATOR);
    }
}
