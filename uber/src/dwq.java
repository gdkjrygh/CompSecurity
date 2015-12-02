// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.wallet.MaskedWallet;

public final class dwq
{

    private final MaskedWallet a;

    private dwq(MaskedWallet maskedwallet)
    {
        a = maskedwallet;
    }

    public static dwq a(MaskedWallet maskedwallet)
    {
        return new dwq(maskedwallet);
    }

    public final MaskedWallet a()
    {
        return a;
    }
}
