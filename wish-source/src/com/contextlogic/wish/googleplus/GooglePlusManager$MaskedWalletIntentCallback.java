// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.googleplus;

import com.google.android.gms.wallet.MaskedWallet;

// Referenced classes of package com.contextlogic.wish.googleplus:
//            GooglePlusManager

public static interface 
{

    public abstract void onMaskedWalletCancelled();

    public abstract void onMaskedWalletError(int i);

    public abstract void onMaskedWalletSuccess(MaskedWallet maskedwallet);
}
