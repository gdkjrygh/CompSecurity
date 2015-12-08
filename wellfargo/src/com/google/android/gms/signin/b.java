// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.signin.internal.m;

// Referenced classes of package com.google.android.gms.signin:
//            c, d, e

public final class b
{

    public static final i a;
    public static final i b;
    public static final g c;
    static final g d;
    public static final Scope e = new Scope("profile");
    public static final Scope f = new Scope("email");
    public static final a g;
    public static final a h;
    public static final e i = new m();

    static 
    {
        a = new i();
        b = new i();
        c = new c();
        d = new d();
        g = new a("SignIn.API", c, a);
        h = new a("SignIn.INTERNAL_API", d, b);
    }
}
