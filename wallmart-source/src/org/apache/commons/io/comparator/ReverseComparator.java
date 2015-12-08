// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package org.apache.commons.io.comparator:
//            AbstractFileComparator

class ReverseComparator extends AbstractFileComparator
    implements Serializable
{

    private final Comparator _flddelegate;

    public ReverseComparator(Comparator comparator)
    {
        if (comparator == null)
        {
            throw new IllegalArgumentException("Delegate comparator is missing");
        } else
        {
            _flddelegate = comparator;
            return;
        }
    }

    public int compare(File file, File file1)
    {
        return _flddelegate.compare(file1, file);
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((File)obj, (File)obj1);
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append("[").append(_flddelegate.toString()).append("]").toString();
    }
}
