// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.youtube.common.fromguava.c;

public final class as
{

    public final String a;
    public final int b;
    public final boolean c;

    public as(String s, int i, boolean flag)
    {
        a = com.google.android.apps.youtube.common.fromguava.c.a(s, "name cannot be empty");
        b = i;
        c = flag;
    }

    public final String toString()
    {
        return (new StringBuilder("RemoteError [name=")).append(a).append(", canRetry=").append(c).append("]").toString();
    }
}
