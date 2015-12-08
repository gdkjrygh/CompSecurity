// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;

import com.google.android.apps.youtube.common.fromguava.c;

final class n
{

    public final String a;
    public final String b;
    public final String c;
    private int d;

    public n(String s, String s1, String s2)
    {
        a = com.google.android.apps.youtube.common.fromguava.c.a(s, "packageName cannot be null or empty");
        b = com.google.android.apps.youtube.common.fromguava.c.a(s1, "versionName cannot be null or empty");
        c = com.google.android.apps.youtube.common.fromguava.c.a(s2, "developerKey cannot be null or empty");
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof n))
            {
                return false;
            }
            obj = (n)obj;
            if (!a.equals(((n) (obj)).a) || !b.equals(((n) (obj)).b) || !c.equals(((n) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = d;
        int i = j;
        if (j == 0)
        {
            i = ((a.hashCode() + 527) * 31 + b.hashCode()) * 31 + c.hashCode();
            d = i;
        }
        return i;
    }
}
