// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;


// Referenced classes of package com.google.android.gms.wallet:
//            FullWalletRequest, Cart

public final class <init>
{

    final FullWalletRequest zzaIl;

    public FullWalletRequest build()
    {
        return zzaIl;
    }

    public zzaIl setCart(Cart cart)
    {
        zzaIl.zzaIk = cart;
        return this;
    }

    public zzaIl setGoogleTransactionId(String s)
    {
        zzaIl.zzaHZ = s;
        return this;
    }

    private (FullWalletRequest fullwalletrequest)
    {
        zzaIl = fullwalletrequest;
        super();
    }

    zzaIl(FullWalletRequest fullwalletrequest, zzaIl zzail)
    {
        this(fullwalletrequest);
    }
}
