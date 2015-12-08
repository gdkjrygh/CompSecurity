// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin;

import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.s;

// Referenced classes of package com.google.android.gms.signin:
//            i, h

public final class g
    implements f
{

    public static final g a = (new i()).a();
    private final boolean b;
    private final boolean c;
    private final String d;
    private final s e;

    private g(boolean flag, boolean flag1, String s, s s1)
    {
        b = flag;
        c = flag1;
        d = s;
        e = s1;
    }

    g(boolean flag, boolean flag1, String s, s s1, h h)
    {
        this(flag, flag1, s, s1);
    }

    public boolean a()
    {
        return b;
    }

    public boolean b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public s d()
    {
        return e;
    }

}
