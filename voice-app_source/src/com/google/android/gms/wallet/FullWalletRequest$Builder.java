// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;


// Referenced classes of package com.google.android.gms.wallet:
//            FullWalletRequest, Cart

public final class <init>
{

    final FullWalletRequest zzaQy;

    public FullWalletRequest build()
    {
        return zzaQy;
    }

    public zzaQy setCart(Cart cart)
    {
        zzaQy.zzaQx = cart;
        return this;
    }

    public zzaQy setGoogleTransactionId(String s)
    {
        zzaQy.zzaQm = s;
        return this;
    }

    public zzaQy setMerchantTransactionId(String s)
    {
        zzaQy.zzaQn = s;
        return this;
    }

    private (FullWalletRequest fullwalletrequest)
    {
        zzaQy = fullwalletrequest;
        super();
    }

    zzaQy(FullWalletRequest fullwalletrequest, zzaQy zzaqy)
    {
        this(fullwalletrequest);
    }
}
