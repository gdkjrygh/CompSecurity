// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

// Referenced classes of package org.apache.commons.io.filefilter:
//            AbstractFileFilter, NotFileFilter, AndFileFilter, CanWriteFileFilter, 
//            IOFileFilter

public class CanReadFileFilter extends AbstractFileFilter
    implements Serializable
{

    public static final IOFileFilter CANNOT_READ;
    public static final IOFileFilter CAN_READ;
    public static final IOFileFilter READ_ONLY;

    protected CanReadFileFilter()
    {
    }

    public boolean accept(File file)
    {
        return file.canRead();
    }

    static 
    {
        CAN_READ = new CanReadFileFilter();
        CANNOT_READ = new NotFileFilter(CAN_READ);
        READ_ONLY = new AndFileFilter(CAN_READ, CanWriteFileFilter.CANNOT_WRITE);
    }
}
