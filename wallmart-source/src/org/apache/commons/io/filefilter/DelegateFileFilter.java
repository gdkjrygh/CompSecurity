// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.Serializable;

// Referenced classes of package org.apache.commons.io.filefilter:
//            AbstractFileFilter

public class DelegateFileFilter extends AbstractFileFilter
    implements Serializable
{

    private final FileFilter fileFilter;
    private final FilenameFilter filenameFilter;

    public DelegateFileFilter(FileFilter filefilter)
    {
        if (filefilter == null)
        {
            throw new IllegalArgumentException("The FileFilter must not be null");
        } else
        {
            fileFilter = filefilter;
            filenameFilter = null;
            return;
        }
    }

    public DelegateFileFilter(FilenameFilter filenamefilter)
    {
        if (filenamefilter == null)
        {
            throw new IllegalArgumentException("The FilenameFilter must not be null");
        } else
        {
            filenameFilter = filenamefilter;
            fileFilter = null;
            return;
        }
    }

    public boolean accept(File file)
    {
        if (fileFilter != null)
        {
            return fileFilter.accept(file);
        } else
        {
            return super.accept(file);
        }
    }

    public boolean accept(File file, String s)
    {
        if (filenameFilter != null)
        {
            return filenameFilter.accept(file, s);
        } else
        {
            return super.accept(file, s);
        }
    }

    public String toString()
    {
        String s;
        if (fileFilter != null)
        {
            s = fileFilter.toString();
        } else
        {
            s = filenameFilter.toString();
        }
        return (new StringBuilder()).append(super.toString()).append("(").append(s).append(")").toString();
    }
}
