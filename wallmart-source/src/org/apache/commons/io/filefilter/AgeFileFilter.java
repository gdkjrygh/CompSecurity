// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.Date;
import org.apache.commons.io.FileUtils;

// Referenced classes of package org.apache.commons.io.filefilter:
//            AbstractFileFilter

public class AgeFileFilter extends AbstractFileFilter
    implements Serializable
{

    private final boolean acceptOlder;
    private final long cutoff;

    public AgeFileFilter(long l)
    {
        this(l, true);
    }

    public AgeFileFilter(long l, boolean flag)
    {
        acceptOlder = flag;
        cutoff = l;
    }

    public AgeFileFilter(File file)
    {
        this(file, true);
    }

    public AgeFileFilter(File file, boolean flag)
    {
        this(file.lastModified(), flag);
    }

    public AgeFileFilter(Date date)
    {
        this(date, true);
    }

    public AgeFileFilter(Date date, boolean flag)
    {
        this(date.getTime(), flag);
    }

    public boolean accept(File file)
    {
label0:
        {
            boolean flag1 = FileUtils.isFileNewer(file, cutoff);
            boolean flag = flag1;
            if (acceptOlder)
            {
                if (flag1)
                {
                    break label0;
                }
                flag = true;
            }
            return flag;
        }
        return false;
    }

    public String toString()
    {
        String s;
        if (acceptOlder)
        {
            s = "<=";
        } else
        {
            s = ">";
        }
        return (new StringBuilder()).append(super.toString()).append("(").append(s).append(cutoff).append(")").toString();
    }
}
