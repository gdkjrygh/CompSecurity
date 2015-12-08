// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;

import android.accounts.Account;
import com.google.android.gms.internal.gi;

public final class c
{

    private final Account a;
    private final String b;
    private final long c;
    private long d;
    private long e;
    private String f;

    private c(Account account, String s, long l)
    {
        d = 0x7fffffffffffffffL;
        e = 0x7fffffffffffffffL;
        a = (Account)gi.a(account, "account");
        b = (String)gi.a(s, "reason");
        c = l;
    }

    c(Account account, String s, long l, byte byte0)
    {
        this(account, s, l);
    }

    static Account a(c c1)
    {
        return c1.a;
    }

    static String b(c c1)
    {
        return c1.b;
    }

    static long c(c c1)
    {
        return c1.c;
    }

    static long d(c c1)
    {
        return c1.d;
    }

    static long e(c c1)
    {
        return c1.e;
    }

    static String f(c c1)
    {
        return c1.f;
    }
}
