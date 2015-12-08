// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            Fragment

final class u
{

    private final String a;
    private final Class b;
    private final Bundle c;
    private Fragment d;

    static Fragment a(u u1)
    {
        return u1.d;
    }

    static Fragment a(u u1, Fragment fragment)
    {
        u1.d = fragment;
        return fragment;
    }

    static String b(u u1)
    {
        return u1.a;
    }

    static Class c(u u1)
    {
        return u1.b;
    }

    static Bundle d(u u1)
    {
        return u1.c;
    }
}
