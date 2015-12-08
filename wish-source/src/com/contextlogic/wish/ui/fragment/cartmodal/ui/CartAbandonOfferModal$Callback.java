// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui;

import com.contextlogic.wish.api.data.WishCart;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui:
//            CartAbandonOfferModal

public static interface 
{

    public abstract void onClaim(WishCart wishcart);

    public abstract void onDismiss();

    public abstract void onError();
}
