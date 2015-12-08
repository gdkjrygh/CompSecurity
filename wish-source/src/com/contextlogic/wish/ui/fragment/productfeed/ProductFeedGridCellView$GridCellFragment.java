// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import com.contextlogic.wish.api.data.WishCredit;
import com.contextlogic.wish.api.data.WishProduct;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedGridCellView

public static interface 
{

    public abstract void addProductToCart(WishProduct wishproduct);

    public abstract void editListForProduct(String s);

    public abstract long getAnimationTimeRemaining();

    public abstract WishCredit getApplicableCredit(WishProduct wishproduct);

    public abstract  getDataMode();

    public abstract void handleRecommendClick(WishProduct wishproduct);

    public abstract boolean isProductSelected(WishProduct wishproduct);

    public abstract boolean isWishPending(String s);

    public abstract void unwishProduct(WishProduct wishproduct);

    public abstract void wishForProduct(WishProduct wishproduct);
}
