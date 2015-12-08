// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.model;

import com.google.android.apps.ytremote.util.c;

public final class f
{

    public final String a;
    public final String b;

    public f(String s, String s1)
    {
        a = (String)c.a(s);
        b = s1;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a).append(": ").append(b).toString();
    }
}
