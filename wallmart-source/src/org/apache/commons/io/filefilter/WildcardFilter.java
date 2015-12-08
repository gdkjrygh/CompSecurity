// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.io.FilenameUtils;

// Referenced classes of package org.apache.commons.io.filefilter:
//            AbstractFileFilter

public class WildcardFilter extends AbstractFileFilter
    implements Serializable
{

    private final String wildcards[];

    public WildcardFilter(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("The wildcard must not be null");
        } else
        {
            wildcards = (new String[] {
                s
            });
            return;
        }
    }

    public WildcardFilter(List list)
    {
        if (list == null)
        {
            throw new IllegalArgumentException("The wildcard list must not be null");
        } else
        {
            wildcards = (String[])list.toArray(new String[list.size()]);
            return;
        }
    }

    public WildcardFilter(String as[])
    {
        if (as == null)
        {
            throw new IllegalArgumentException("The wildcard array must not be null");
        } else
        {
            wildcards = new String[as.length];
            System.arraycopy(as, 0, wildcards, 0, as.length);
            return;
        }
    }

    public boolean accept(File file)
    {
        if (!file.isDirectory())
        {
            String as[] = wildcards;
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                String s = as[i];
                if (FilenameUtils.wildcardMatch(file.getName(), s))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public boolean accept(File file, String s)
    {
        if (file == null || !(new File(file, s)).isDirectory())
        {
            file = wildcards;
            int j = file.length;
            int i = 0;
            while (i < j) 
            {
                if (FilenameUtils.wildcardMatch(s, file[i]))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}
