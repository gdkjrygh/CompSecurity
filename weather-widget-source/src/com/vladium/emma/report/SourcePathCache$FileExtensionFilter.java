// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;

import java.io.File;
import java.io.FileFilter;

// Referenced classes of package com.vladium.emma.report:
//            SourcePathCache

private static final class m_extension
    implements FileFilter
{

    private final String m_extension;

    private static String canonicalizeExtension(String s)
    {
        String s1 = s;
        if (s.charAt(0) != '.')
        {
            s1 = ".".concat(s);
        }
        return s1;
    }

    public boolean accept(File file)
    {
        if (!file.isDirectory())
        {
            file = file.getName();
            int i = file.lastIndexOf('.');
            if (i > 0)
            {
                return m_extension.equals(file.substring(i));
            }
        }
        return false;
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append(", extension = [").append(m_extension).append("]").toString();
    }

    A(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("null input: extension");
        }
        String s1 = canonicalizeExtension(s);
        if (s.length() <= 1)
        {
            throw new IllegalArgumentException("empty input: extension");
        } else
        {
            m_extension = s1;
            return;
        }
    }
}
