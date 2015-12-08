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

public class NameFileFilter extends AbstractFileFilter
    implements Serializable
{

    private final IOCase caseSensitivity;
    private final String names[];

    public NameFileFilter(String s)
    {
        this(s, null);
    }

    public NameFileFilter(String s, IOCase iocase)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("The wildcard must not be null");
        }
        names = (new String[] {
            s
        });
        s = iocase;
        if (iocase == null)
        {
            s = IOCase.SENSITIVE;
        }
        caseSensitivity = s;
    }

    public NameFileFilter(List list)
    {
        this(list, null);
    }

    public NameFileFilter(List list, IOCase iocase)
    {
        if (list == null)
        {
            throw new IllegalArgumentException("The list of names must not be null");
        }
        names = (String[])list.toArray(new String[list.size()]);
        list = iocase;
        if (iocase == null)
        {
            list = IOCase.SENSITIVE;
        }
        caseSensitivity = list;
    }

    public NameFileFilter(String as[])
    {
        this(as, null);
    }

    public NameFileFilter(String as[], IOCase iocase)
    {
        if (as == null)
        {
            throw new IllegalArgumentException("The array of names must not be null");
        }
        names = new String[as.length];
        System.arraycopy(as, 0, names, 0, as.length);
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
        String as[] = names;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            if (caseSensitivity.checkEquals(file, s))
            {
                return true;
            }
        }

        return false;
    }

    public boolean accept(File file, String s)
    {
        file = names;
        int j = file.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = file[i];
            if (caseSensitivity.checkEquals(s, s1))
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
        if (names != null)
        {
            for (int i = 0; i < names.length; i++)
            {
                if (i > 0)
                {
                    stringbuilder.append(",");
                }
                stringbuilder.append(names[i]);
            }

        }
        stringbuilder.append(")");
        return stringbuilder.toString();
    }
}
