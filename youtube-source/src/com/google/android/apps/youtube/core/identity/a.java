// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import android.content.Intent;
import android.util.Pair;
import com.google.android.apps.youtube.common.fromguava.c;

public final class a
{

    private final String a;
    private final Intent b;
    private final Exception c;
    private final boolean d;

    protected a()
    {
        a = null;
        b = null;
        c = null;
        d = false;
    }

    private a(String s, Intent intent, Exception exception, boolean flag)
    {
        a = s;
        b = intent;
        c = exception;
        d = flag;
    }

    static a a(Intent intent)
    {
        return new a(null, (Intent)com.google.android.apps.youtube.common.fromguava.c.a(intent), null, false);
    }

    static a a(Exception exception)
    {
        return new a(null, null, (Exception)com.google.android.apps.youtube.common.fromguava.c.a(exception), true);
    }

    protected static a a(String s)
    {
        return new a(com.google.android.apps.youtube.common.fromguava.c.a(s), null, null, false);
    }

    protected static a b(Exception exception)
    {
        return new a(null, null, (Exception)com.google.android.apps.youtube.common.fromguava.c.a(exception), false);
    }

    public final boolean a()
    {
        return a != null;
    }

    public final boolean b()
    {
        return b != null;
    }

    public final String c()
    {
        if (!a())
        {
            throw new IllegalStateException("Cannot call getAuthenticationToken on an unsuccessful fetch.");
        } else
        {
            return a;
        }
    }

    public final Pair d()
    {
        if (!a())
        {
            throw new IllegalStateException("Cannot call getAuthenticationHeaderInfo on an unsuccessful fetch.");
        } else
        {
            return Pair.create("Authorization", (new StringBuilder("Bearer ")).append(a).toString());
        }
    }

    public final Intent e()
    {
        if (a())
        {
            throw new IllegalStateException("Cannot call getRecoveryIntent() on a successful fetch.");
        }
        if (!b())
        {
            throw new IllegalStateException("Cannot call getRecoveryIntent() on an unrecoverable fetch.");
        } else
        {
            return b;
        }
    }

    public final Exception f()
    {
        if (c == null)
        {
            throw new IllegalStateException("Cannot call getException() on a successful or recoverable fetch.");
        } else
        {
            return c;
        }
    }

    public final boolean g()
    {
        return d;
    }
}
