// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.googleplus;

import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.google.android.gms.wallet.FullWallet;

// Referenced classes of package com.contextlogic.wish.googleplus:
//            GooglePlusManager

public static interface Q
{

    public abstract CartManager getCartManager();

    public abstract void onFullWalletCancelled();

    public abstract void onFullWalletError(int i);

    public abstract void onFullWalletSuccess(FullWallet fullwallet, String s, String s1);
}
