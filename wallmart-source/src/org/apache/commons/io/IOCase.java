// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io;

import java.io.Serializable;

// Referenced classes of package org.apache.commons.io:
//            FilenameUtils

public final class IOCase
    implements Serializable
{

    public static final IOCase INSENSITIVE = new IOCase("Insensitive", false);
    public static final IOCase SENSITIVE = new IOCase("Sensitive", true);
    public static final IOCase SYSTEM;
    private static final long serialVersionUID = 0xa7f889439aec7931L;
    private final String name;
    private final transient boolean sensitive;

    private IOCase(String s, boolean flag)
    {
        name = s;
        sensitive = flag;
    }

    public static IOCase forName(String s)
    {
        if (SENSITIVE.name.equals(s))
        {
            return SENSITIVE;
        }
        if (INSENSITIVE.name.equals(s))
        {
            return INSENSITIVE;
        }
        if (SYSTEM.name.equals(s))
        {
            return SYSTEM;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid IOCase name: ").append(s).toString());
        }
    }

    private Object readResolve()
    {
        return forName(name);
    }

    public int checkCompareTo(String s, String s1)
    {
        if (s == null || s1 == null)
        {
            throw new NullPointerException("The strings must not be null");
        }
        if (sensitive)
        {
            return s.compareTo(s1);
        } else
        {
            return s.compareToIgnoreCase(s1);
        }
    }

    public boolean checkEndsWith(String s, String s1)
    {
        int i = s1.length();
        boolean flag;
        if (!sensitive)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return s.regionMatches(flag, s.length() - i, s1, 0, i);
    }

    public boolean checkEquals(String s, String s1)
    {
        if (s == null || s1 == null)
        {
            throw new NullPointerException("The strings must not be null");
        }
        if (sensitive)
        {
            return s.equals(s1);
        } else
        {
            return s.equalsIgnoreCase(s1);
        }
    }

    public int checkIndexOf(String s, int i, String s1)
    {
        int j = s.length() - s1.length();
        if (j >= i)
        {
            for (; i <= j; i++)
            {
                if (checkRegionMatches(s, i, s1))
                {
                    return i;
                }
            }

        }
        return -1;
    }

    public boolean checkRegionMatches(String s, int i, String s1)
    {
        boolean flag;
        if (!sensitive)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return s.regionMatches(flag, i, s1, 0, s1.length());
    }

    public boolean checkStartsWith(String s, String s1)
    {
        boolean flag;
        if (!sensitive)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return s.regionMatches(flag, 0, s1, 0, s1.length());
    }

    public String getName()
    {
        return name;
    }

    public boolean isCaseSensitive()
    {
        return sensitive;
    }

    public String toString()
    {
        return name;
    }

    static 
    {
        boolean flag = true;
        if (FilenameUtils.isSystemWindows())
        {
            flag = false;
        }
        SYSTEM = new IOCase("System", flag);
    }
}
