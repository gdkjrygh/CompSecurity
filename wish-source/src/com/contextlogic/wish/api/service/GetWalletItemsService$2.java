// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;


// Referenced classes of package com.contextlogic.wish.api.service:
//            GetWalletItemsService

static class pe
{

    static final int $SwitchMap$com$contextlogic$wish$api$data$WishWalletItem$WalletItemType[];

    static 
    {
        $SwitchMap$com$contextlogic$wish$api$data$WishWalletItem$WalletItemType = new int[com.contextlogic.wish.api.data.mType.values().length];
        try
        {
            $SwitchMap$com$contextlogic$wish$api$data$WishWalletItem$WalletItemType[com.contextlogic.wish.api.data.mType.GiftCard.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$contextlogic$wish$api$data$WishWalletItem$WalletItemType[com.contextlogic.wish.api.data.mType.ExpiredGiftCard.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
