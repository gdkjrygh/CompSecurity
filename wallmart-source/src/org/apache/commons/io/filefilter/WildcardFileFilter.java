// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOCase;

// Referenced classes of package org.apache.commons.io.filefilter:
//            AbstractFileFilter

public class WildcardFileFilter extends AbstractFileFilter
    implements Serializable
{

    private final IOCase caseSensitivity;
    private final String wildcards[];

    public WildcardFileFilter(String s)
    {
        this(s, null);
    }

    public WildcardFileFilter(String s, IOCase iocase)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("The wildcard must not be null");
        }
        wildcards = (new String[] {
            s
        });
        s = iocase;
        if (iocase == null)
        {
            s = IOCase.SENSITIVE;
        }
        caseSensitivity = s;
    }

    public WildcardFileFilter(List list)
    {
        this(list, null);
    }

    public WildcardFileFilter(List list, IOCase iocase)
    {
        if (list == null)
        {
            throw new IllegalArgumentException("The wildcard list must not be null");
        }
        wildcards = (String[])list.toArray(new String[list.size()]);
        list = iocase;
        if (iocase == null)
        {
            list = IOCase.SENSITIVE;
        }
        caseSensitivity = list;
    }

    public WildcardFileFilter(String as[])
    {
        this(as, null);
    }

    public WildcardFileFilter(String as[], IOCase iocase)
    {
        if (as == null)
        {
            throw new IllegalArgumentException("The wildcard array must not be null");
        }
        wildcards = new String[as.length];
        System.arraycopy(as, 0, wildcards, 0, as.length);
        as = iocase;
        if (iocase == null)
        {
            as = IOCase.SENSITIVE;
        }
        caseSensitivity = as;
    }

    public boolean accept(File file)
    {
        file = file.getName();
        String as[] = wildcards;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            if (FilenameUtils.wildcardMatch(file, as[i], caseSensitivity))
            {
                return true;
            }
        }

        return false;
    }

    public boolean accept(File file, String s)
    {
        file = wildcards;
        int j = file.length;
        for (int i = 0; i < j; i++)
        {
            if (FilenameUtils.wildcardMatch(s, file[i], caseSensitivity))
            {
                return true;
            }
        }

        return false;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(super.toString());
        stringbuilder.append("(");
        if (wildcards != null)
        {
            for (int i = 0; i < wildcards.length; i++)
            {
                if (i > 0)
                {
                    stringbuilder.append(",");
                }
                stringbuilder.append(wildcards[i]);
            }

        }
        stringbuilder.append(")");
        return stringbuilder.toString();
    }
}
