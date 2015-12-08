// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.internal.ix;
import com.google.android.gms.internal.iz;
import com.google.android.gms.internal.jq;
import com.google.android.gms.internal.ju;

// Referenced classes of package com.google.android.gms.c:
//            b

public final class a
{

    private final iz a;
    private ju b;

    public a(Context context, int i, String s, b b1)
    {
        this(context, 11, null, null, null);
    }

    private a(Context context, int i, String s, String s1, b b1)
    {
        this(context, i, s, null, b1, true);
    }

    private a(Context context, int i, String s, String s1, b b1, boolean flag)
    {
        String s2;
        int j;
        j = 0;
        super();
        s2 = context.getPackageName();
        int k = context.getPackageManager().getPackageInfo(s2, 0).versionCode;
        j = k;
_L2:
        b = new ju(s2, j, i, s, s1, true);
        a = new iz(context, new ix(b1));
        return;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        Log.wtf("PlayLogger", "This can't happen.");
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a()
    {
        a.c();
    }

    public final transient void a(long l, String s, byte abyte0[], String as[])
    {
        a.a(b, new jq(l, s, abyte0, as));
    }

    public final void b()
    {
        a.l();
    }
}
