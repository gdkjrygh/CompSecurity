// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.filefilter;

import java.io.File;

// Referenced classes of package org.apache.commons.io.filefilter:
//            IOFileFilter

public abstract class AbstractFileFilter
    implements IOFileFilter
{

    public AbstractFileFilter()
    {
    }

    public boolean accept(File file)
    {
        return accept(file.getParentFile(), file.getName());
    }

    public boolean accept(File file, String s)
    {
        return accept(new File(file, s));
    }

    public String toString()
    {
        return getClass().getSimpleName();
    }
}
