// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;

import android.content.Context;
import android.util.Base64;
import com.google.a.a.a.a.ii;
import com.google.a.a.a.a.su;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.apps.youtube.datalib.a.f;

public final class r
    implements f
{

    private final String a;
    private final String b;
    private final String c;

    public r(Context context, String s, String s1)
    {
        a = com.google.android.apps.youtube.common.fromguava.c.a(s);
        b = com.google.android.apps.youtube.common.fromguava.c.a(s1);
        c = Base64.encodeToString(PackageUtil.i(context), 10);
    }

    private su b()
    {
        su su1 = new su();
        su1.c = b;
        su1.d = c;
        su1.b = a;
        return su1;
    }

    public final String a()
    {
        return Base64.encodeToString(Util.b(com.google.protobuf.nano.c.a(b())), 11);
    }

    public final void a(ii ii1)
    {
        ii1.g = b();
    }
}
