// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.model;

import android.net.Uri;

// Referenced classes of package com.google.android.apps.ytremote.model:
//            AppStatus, ScreenId

public final class b
{

    private Uri a;
    private String b;
    private ScreenId c;
    private int d;
    private boolean e;

    public b()
    {
    }

    static int a(b b1)
    {
        return b1.d;
    }

    static Uri b(b b1)
    {
        return b1.a;
    }

    static String c(b b1)
    {
        return b1.b;
    }

    static ScreenId d(b b1)
    {
        return b1.c;
    }

    static boolean e(b b1)
    {
        return b1.e;
    }

    public final AppStatus a()
    {
        return new AppStatus(this);
    }

    public final b a(int i)
    {
        d = i;
        return this;
    }

    public final b a(Uri uri)
    {
        a = uri;
        return this;
    }

    public final b a(ScreenId screenid)
    {
        c = screenid;
        return this;
    }

    public final b a(String s)
    {
        b = s;
        return this;
    }

    public final b a(boolean flag)
    {
        e = flag;
        return this;
    }
}
