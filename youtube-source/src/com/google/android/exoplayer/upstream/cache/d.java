// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream.cache;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class d
    implements Comparable
{

    private static final Pattern g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)(\\.v1\\.exo)$");
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    private d(String s, long l, long l1, boolean flag, long l2, File file)
    {
        a = s;
        b = l;
        c = l1;
        d = flag;
        e = file;
        f = l2;
    }

    public static d a(File file)
    {
        Matcher matcher = g.matcher(file.getName());
        if (!matcher.matches())
        {
            return null;
        } else
        {
            return a(matcher.group(1), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)), file);
        }
    }

    public static d a(String s, long l)
    {
        return new d(s, l, -1L, false, -1L, null);
    }

    public static d a(String s, long l, long l1)
    {
        return new d(s, l, l1, false, -1L, null);
    }

    private static d a(String s, long l, long l1, File file)
    {
        return new d(s, l, file.length(), true, l1, file);
    }

    public static File a(File file, String s, long l, long l1)
    {
        return new File(file, (new StringBuilder()).append(s).append(".").append(l).append(".").append(l1).append(".v1.exo").toString());
    }

    public static d b(String s, long l)
    {
        return new d(s, l, -1L, false, -1L, null);
    }

    public final int a(d d1)
    {
        if (!a.equals(d1.a))
        {
            return a.compareTo(d1.a);
        }
        long l = b - d1.b;
        if (l == 0L)
        {
            return 0;
        }
        return l >= 0L ? 1 : -1;
    }

    public final boolean a()
    {
        return c == -1L;
    }

    public final d b()
    {
        long l = System.currentTimeMillis();
        File file = a(e.getParentFile(), a, b, l);
        e.renameTo(file);
        return a(a, b, l, file);
    }

    public final int compareTo(Object obj)
    {
        return a((d)obj);
    }

}
