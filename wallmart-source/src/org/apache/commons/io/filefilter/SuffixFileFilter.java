// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.io.IOCase;

// Referenced classes of package org.apache.commons.io.filefilter:
//            AbstractFileFilter

public class SuffixFileFilter extends AbstractFileFilter
    implements Serializable
{

    private final IOCase caseSensitivity;
    private final String suffixes[];

    public SuffixFileFilter(String s)
    {
        this(s, IOCase.SENSITIVE);
    }

    public SuffixFileFilter(String s, IOCase iocase)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("The suffix must not be null");
        }
        suffixes = (new String[] {
            s
        });
        s = iocase;
        if (iocase == null)
        {
            s = IOCase.SENSITIVE;
        }
        caseSensitivity = s;
    }

    public SuffixFileFilter(List list)
    {
        this(list, IOCase.SENSITIVE);
    }

    public SuffixFileFilter(List list, IOCase iocase)
    {
        if (list == null)
        {
            throw new IllegalArgumentException("The list of suffixes must not be null");
        }
        suffixes = (String[])list.toArray(new String[list.size()]);
        list = iocase;
        if (iocase == null)
        {
            list = IOCase.SENSITIVE;
        }
        caseSensitivity = list;
    }

    public SuffixFileFilter(String as[])
    {
        this(as, IOCase.SENSITIVE);
    }

    public SuffixFileFilter(String as[], IOCase iocase)
    {
        if (as == null)
        {
            throw new IllegalArgumentException("The array of suffixes must not be null");
        }
        suffixes = new String[as.length];
        System.arraycopy(as, 0, suffixes, 0, as.length);
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
        String as[] = suffixes;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            if (caseSensitivity.checkEndsWith(file, s))
            {
                return true;
            }
        }

        return false;
    }

    public boolean accept(File file, String s)
    {
        file = suffixes;
        int j = file.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = file[i];
            if (caseSensitivity.checkEndsWith(s, s1))
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
        if (suffixes != null)
        {
            for (int i = 0; i < suffixes.length; i++)
            {
                if (i > 0)
                {
                    stringbuilder.append(",");
                }
                stringbuilder.append(suffixes[i]);
            }

        }
        stringbuilder.append(")");
        return stringbuilder.toString();
    }
}
