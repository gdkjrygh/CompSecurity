// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.c;

import a.a.a.d;

public class e
{

    public static String a(String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder("SELECT COUNT(*) FROM ");
        stringbuilder.append(s).append(' ');
        if (s1 != null)
        {
            stringbuilder.append(s1).append(' ');
        }
        return stringbuilder.toString();
    }

    public static String a(String s, String s1, String as[])
    {
        s = new StringBuilder(s);
        s.append(s1).append(" (");
        a(((StringBuilder) (s)), as);
        s.append(") VALUES (");
        a(((StringBuilder) (s)), as.length);
        s.append(')');
        return s.toString();
    }

    public static String a(String s, String as[])
    {
        StringBuilder stringbuilder = new StringBuilder("DELETE FROM ");
        stringbuilder.append(s);
        if (as != null && as.length > 0)
        {
            stringbuilder.append(" WHERE ");
            b(stringbuilder, s, as);
        }
        return stringbuilder.toString();
    }

    public static String a(String s, String as[], String as1[])
    {
        StringBuilder stringbuilder = new StringBuilder("UPDATE ");
        stringbuilder.append(s).append(" SET ");
        b(stringbuilder, as);
        stringbuilder.append(" WHERE ");
        b(stringbuilder, s, as1);
        return stringbuilder.toString();
    }

    public static StringBuilder a(StringBuilder stringbuilder, int i)
    {
        int j = 0;
        do
        {
            if (j >= i)
            {
                return stringbuilder;
            }
            if (j < i - 1)
            {
                stringbuilder.append("?,");
            } else
            {
                stringbuilder.append('?');
            }
            j++;
        } while (true);
    }

    public static StringBuilder a(StringBuilder stringbuilder, String s)
    {
        stringbuilder.append('\'').append(s).append('\'');
        return stringbuilder;
    }

    public static StringBuilder a(StringBuilder stringbuilder, String s, String s1)
    {
        stringbuilder.append(s).append(".'").append(s1).append('\'');
        return stringbuilder;
    }

    public static StringBuilder a(StringBuilder stringbuilder, String s, String as[])
    {
        int j = as.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return stringbuilder;
            }
            a(stringbuilder, s, as[i]);
            if (i < j - 1)
            {
                stringbuilder.append(',');
            }
            i++;
        } while (true);
    }

    public static StringBuilder a(StringBuilder stringbuilder, String as[])
    {
        int j = as.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return stringbuilder;
            }
            stringbuilder.append('\'').append(as[i]).append('\'');
            if (i < j - 1)
            {
                stringbuilder.append(',');
            }
            i++;
        } while (true);
    }

    public static String b(String s, String s1, String as[])
    {
        StringBuilder stringbuilder = new StringBuilder("SELECT ");
        if (s1 == null || s1.length() < 0)
        {
            throw new d("Table alias required");
        } else
        {
            a(stringbuilder, s1, as).append(" FROM ");
            stringbuilder.append(s).append(' ').append(s1).append(' ');
            return stringbuilder.toString();
        }
    }

    public static StringBuilder b(StringBuilder stringbuilder, String s, String as[])
    {
        int i = 0;
        do
        {
            if (i >= as.length)
            {
                return stringbuilder;
            }
            a(stringbuilder, s, as[i]).append("=?");
            if (i < as.length - 1)
            {
                stringbuilder.append(',');
            }
            i++;
        } while (true);
    }

    public static StringBuilder b(StringBuilder stringbuilder, String as[])
    {
        int i = 0;
        do
        {
            if (i >= as.length)
            {
                return stringbuilder;
            }
            a(stringbuilder, as[i]).append("=?");
            if (i < as.length - 1)
            {
                stringbuilder.append(',');
            }
            i++;
        } while (true);
    }
}
