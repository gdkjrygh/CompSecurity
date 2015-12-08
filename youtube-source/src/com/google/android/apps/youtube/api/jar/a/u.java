// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.youtube.api.jar.c;
import com.google.android.youtube.player.e;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            a

final class u
    implements c
{

    final a a;

    private u(a a1)
    {
        a = a1;
        super();
    }

    u(a a1, byte byte0)
    {
        this(a1);
    }

    public final void a()
    {
        if (!TextUtils.isEmpty(com.google.android.apps.youtube.api.jar.a.a.h(a)) && e.a(com.google.android.apps.youtube.api.jar.a.a.f(a)))
        {
            com.google.android.apps.youtube.api.jar.a.a.f(a).startActivity(e.a(com.google.android.apps.youtube.api.jar.a.a.f(a), com.google.android.apps.youtube.api.jar.a.a.h(a), false, false));
        }
    }
}
