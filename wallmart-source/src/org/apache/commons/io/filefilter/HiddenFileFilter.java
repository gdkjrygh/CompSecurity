// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

// Referenced classes of package org.apache.commons.io.filefilter:
//            AbstractFileFilter, NotFileFilter, IOFileFilter

public class HiddenFileFilter extends AbstractFileFilter
    implements Serializable
{

    public static final IOFileFilter HIDDEN;
    public static final IOFileFilter VISIBLE;

    protected HiddenFileFilter()
    {
    }

    public boolean accept(File file)
    {
        return file.isHidden();
    }

    static 
    {
        HIDDEN = new HiddenFileFilter();
        VISIBLE = new NotFileFilter(HIDDEN);
    }
}
