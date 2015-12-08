// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.text.TextUtils;

public final class c
{

    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public c(String s, String s1, String s2, String s3)
    {
        a = s;
        b = s1;
        c = s2;
        d = s3;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof c)
        {
            c c1 = (c)obj;
            return obj == this || TextUtils.equals(a, c1.a) && TextUtils.equals(b, c1.b) && TextUtils.equals(c, c1.c) && TextUtils.equals(d, c1.d);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        if (b != null)
        {
            j = b.hashCode();
        } else
        {
            j = 0;
        }
        if (c != null)
        {
            k = c.hashCode();
        } else
        {
            k = 0;
        }
        if (d != null)
        {
            l = d.hashCode();
        }
        return (k + (j + (i - 629) * 37) * 37) * 37 + l;
    }

    public final String toString()
    {
        return (new StringBuilder("{domain:")).append(a).append(",code:").append(b).append(",location:").append(c).append(",internalReason:").append(d).append("}").toString();
    }
}
