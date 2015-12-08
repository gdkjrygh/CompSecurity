// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.IOCase;

// Referenced classes of package org.apache.commons.io.filefilter:
//            AbstractFileFilter

public class RegexFileFilter extends AbstractFileFilter
    implements Serializable
{

    private final Pattern pattern;

    public RegexFileFilter(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Pattern is missing");
        } else
        {
            pattern = Pattern.compile(s);
            return;
        }
    }

    public RegexFileFilter(String s, int i)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Pattern is missing");
        } else
        {
            pattern = Pattern.compile(s, i);
            return;
        }
    }

    public RegexFileFilter(String s, IOCase iocase)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Pattern is missing");
        }
        boolean flag = false;
        byte byte0 = flag;
        if (iocase != null)
        {
            byte0 = flag;
            if (!iocase.isCaseSensitive())
            {
                byte0 = 2;
            }
        }
        pattern = Pattern.compile(s, byte0);
    }

    public RegexFileFilter(Pattern pattern1)
    {
        if (pattern1 == null)
        {
            throw new IllegalArgumentException("Pattern is missing");
        } else
        {
            pattern = pattern1;
            return;
        }
    }

    public boolean accept(File file, String s)
    {
        return pattern.matcher(s).matches();
    }
}
