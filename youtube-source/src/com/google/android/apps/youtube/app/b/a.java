// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.b;

import com.google.a.a.a.a.dt;
import com.google.android.apps.youtube.core.client.a.g;

// Referenced classes of package com.google.android.apps.youtube.app.b:
//            u, s, t

public final class a extends com.google.android.apps.youtube.core.client.a.a
{

    public a(int i, boolean flag, String s1, dt dt)
    {
        super("home", i, flag, s1, dt);
    }

    protected final boolean a(g g)
    {
        if (!(g instanceof u)) goto _L2; else goto _L1
_L1:
        a("home_sign_in");
_L4:
        return super.a(g);
_L2:
        if (g instanceof s)
        {
            a("home_signed_in");
        } else
        if (g instanceof t)
        {
            a("home_signed_out");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
