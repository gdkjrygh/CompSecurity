// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.shared;

import android.accounts.Account;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.wallet.shared:
//            ApplicationParameters

public final class a
{

    final ApplicationParameters a;

    private a(ApplicationParameters applicationparameters)
    {
        a = applicationparameters;
        super();
    }

    a(ApplicationParameters applicationparameters, byte byte0)
    {
        this(applicationparameters);
    }

    public final ApplicationParameters a()
    {
        return a;
    }

    public final a a(int i)
    {
        a.Pp = i;
        return this;
    }

    public final a a(Account account)
    {
        a.Pu = account;
        return this;
    }

    public final a a(Bundle bundle)
    {
        a.mArgs = bundle;
        return this;
    }

    public final a b(int i)
    {
        a.mTheme = i;
        return this;
    }
}
