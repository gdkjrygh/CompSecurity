// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

// Referenced classes of package org.apache.commons.io.filefilter:
//            AbstractFileFilter, IOFileFilter

public class DirectoryFileFilter extends AbstractFileFilter
    implements Serializable
{

    public static final IOFileFilter DIRECTORY;
    public static final IOFileFilter INSTANCE;

    protected DirectoryFileFilter()
    {
    }

    public boolean accept(File file)
    {
        return file.isDirectory();
    }

    static 
    {
        DIRECTORY = new DirectoryFileFilter();
        INSTANCE = DIRECTORY;
    }
}
