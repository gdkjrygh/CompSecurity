// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import com.google.android.apps.youtube.datalib.model.transfer.a;

public final class t
{

    public String a;
    public String b;
    public com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status c;
    public int d;
    public long e;
    public long f;
    public a g;
    public a h;
    public String i;

    public t(String s, String s1, String s2, a a1)
    {
        a = com.google.android.apps.youtube.common.fromguava.c.a(s1, "filePath may not be empty");
        b = com.google.android.apps.youtube.common.fromguava.c.a(s2, "networkUri may not be empty");
        g = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        c = com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.PENDING;
        d = 1;
        e = 0L;
        f = 0L;
        h = new a();
        i = s;
    }

    public final Transfer a()
    {
        return new Transfer(a, b, c, d, e, f, g, h, i);
    }

    public final boolean b()
    {
        return c != com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.COMPLETED && c != com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.FAILED;
    }
}
