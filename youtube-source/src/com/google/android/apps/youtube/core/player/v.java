// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;


// Referenced classes of package com.google.android.apps.youtube.core.player:
//            Interval

public final class v
    implements Comparable
{

    final Interval a;
    private Interval.EdgeType b;
    private long c;

    public final long a()
    {
        return c;
    }

    public final int compareTo(Object obj)
    {
        obj = (v)obj;
        if (c != ((v) (obj)).c)
        {
            return c >= ((v) (obj)).c ? 1 : -1;
        }
        if (a.d != ((v) (obj)).a.d)
        {
            return ((v) (obj)).a.d - a.d;
        }
        if (b.ordinal() != ((v) (obj)).b.ordinal())
        {
            return b.ordinal() - ((v) (obj)).b.ordinal();
        } else
        {
            return a.c.compareTo(((v) (obj)).a.c);
        }
    }

    public final String toString()
    {
        return (new StringBuilder()).append(b.name()).append("@").append(c).toString();
    }
}
