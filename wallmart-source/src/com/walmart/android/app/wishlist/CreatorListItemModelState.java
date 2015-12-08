// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import com.walmart.android.service.wishlist.models.ListItemModel;

// Referenced classes of package com.walmart.android.app.wishlist:
//            BaseListItemModelState

public class CreatorListItemModelState extends BaseListItemModelState
{

    private boolean mDeleted;
    private int mWantsQuantity;

    public CreatorListItemModelState(ListItemModel listitemmodel)
    {
        super(listitemmodel);
        mWantsQuantity = listitemmodel.getWantsQuantity();
        mDeleted = false;
    }

    public volatile void enterCartMode()
    {
        super.enterCartMode();
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public volatile int getCartQuantity()
    {
        return super.getCartQuantity();
    }

    public volatile ListItemModel getItem()
    {
        return super.getItem();
    }

    public int getWantsQuantity()
    {
        return mWantsQuantity;
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public volatile boolean isAddToCartInProgress()
    {
        return super.isAddToCartInProgress();
    }

    public boolean isDeleted()
    {
        return mDeleted;
    }

    public volatile boolean isInCartState()
    {
        return super.isInCartState();
    }

    public volatile void leaveCartMode()
    {
        super.leaveCartMode();
    }

    public volatile void setCartQuantity(int i)
    {
        super.setCartQuantity(i);
    }

    public void setDeleted(boolean flag)
    {
        mDeleted = flag;
    }

    public volatile void setIsAddToCartInProgress(boolean flag)
    {
        super.setIsAddToCartInProgress(flag);
    }

    public void setWantsQuantity(int i)
    {
        mWantsQuantity = i;
    }
}
