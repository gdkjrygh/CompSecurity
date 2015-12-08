// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.shared;

import java.util.UUID;

// Referenced classes of package com.google.android.gms.wallet.shared:
//            BuyFlowConfig, ApplicationParameters

public final class b
{

    final BuyFlowConfig a;

    private b(BuyFlowConfig buyflowconfig)
    {
        a = buyflowconfig;
        super();
    }

    b(BuyFlowConfig buyflowconfig, byte byte0)
    {
        this(buyflowconfig);
    }

    public final BuyFlowConfig a()
    {
        if (a.Px == null)
        {
            a.Px = UUID.randomUUID().toString();
        }
        return a;
    }

    public final b a(ApplicationParameters applicationparameters)
    {
        a.Py = applicationparameters;
        return this;
    }

    public final b a(String s)
    {
        a.Px = s;
        return this;
    }

    public final b b(String s)
    {
        a.Pz = s;
        return this;
    }

    public final b c(String s)
    {
        a.PA = s;
        return this;
    }
}
