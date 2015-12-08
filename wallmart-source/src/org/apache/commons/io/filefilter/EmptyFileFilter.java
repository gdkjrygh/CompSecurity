// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

// Referenced classes of package org.apache.commons.io.filefilter:
//            AbstractFileFilter, NotFileFilter, IOFileFilter

public class EmptyFileFilter extends AbstractFileFilter
    implements Serializable
{

    public static final IOFileFilter EMPTY;
    public static final IOFileFilter NOT_EMPTY;

    protected EmptyFileFilter()
    {
    }

    public boolean accept(File file)
    {
        boolean flag;
label0:
        {
label1:
            {
                flag = true;
                boolean flag1 = false;
                if (!file.isDirectory())
                {
                    break label0;
                }
                file = file.listFiles();
                if (file != null)
                {
                    flag = flag1;
                    if (file.length != 0)
                    {
                        break label1;
                    }
                }
                flag = true;
            }
            return flag;
        }
        if (file.length() != 0L)
        {
            flag = false;
        }
        return flag;
    }

    static 
    {
        EMPTY = new EmptyFileFilter();
        NOT_EMPTY = new NotFileFilter(EMPTY);
    }
}
