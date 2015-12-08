// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;


// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            f

final class g extends f
{

    g(String s, String s1)
    {
        super(s, null);
    }

    final String a()
    {
        throw new IllegalStateException("Cannot get GAIA ID of signed out identity.");
    }

    final String b()
    {
        throw new IllegalStateException("Cannot get managing account name of signed out identity.");
    }

    public final boolean equals(Object obj)
    {
        return this == obj;
    }

    public final int hashCode()
    {
        return 0;
    }
}
