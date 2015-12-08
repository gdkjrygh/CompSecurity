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

public class PrefixFileFilter extends AbstractFileFilter
    implements Serializable
{

    private final IOCase caseSensitivity;
    private final String prefixes[];

    public PrefixFileFilter(String s)
    {
        this(s, IOCase.SENSITIVE);
    }

    public PrefixFileFilter(String s, IOCase iocase)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("The prefix must not be null");
        }
        prefixes = (new String[] {
            s
        });
        s = iocase;
        if (iocase == null)
        {
            s = IOCase.SENSITIVE;
        }
        caseSensitivity = s;
    }

    public PrefixFileFilter(List list)
    {
        this(list, IOCase.SENSITIVE);
    }

    public PrefixFileFilter(List list, IOCase iocase)
    {
        if (list == null)
        {
            throw new IllegalArgumentException("The list of prefixes must not be null");
        }
        prefixes = (String[])list.toArray(new String[list.size()]);
        list = iocase;
        if (iocase == null)
        {
            list = IOCase.SENSITIVE;
        }
        caseSensitivity = list;
    }

    public PrefixFileFilter(String as[])
    {
        this(as, IOCase.SENSITIVE);
    }

    public PrefixFileFilter(String as[], IOCase iocase)
    {
        if (as == null)
        {
            throw new IllegalArgumentException("The array of prefixes must not be null");
        }
        prefixes = new String[as.length];
        System.arraycopy(as, 0, prefixes, 0, as.length);
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
        String as[] = prefixes;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            if (caseSensitivity.checkStartsWith(file, s))
            {
                return true;
            }
        }

        return false;
    }

    public boolean accept(File file, String s)
    {
        file = prefixes;
        int j = file.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = file[i];
            if (caseSensitivity.checkStartsWith(s, s1))
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
        if (prefixes != null)
        {
            for (int i = 0; i < prefixes.length; i++)
            {
                if (i > 0)
                {
                    stringbuilder.append(",");
                }
                stringbuilder.append(prefixes[i]);
            }

        }
        stringbuilder.append(")");
        return stringbuilder.toString();
    }
}
