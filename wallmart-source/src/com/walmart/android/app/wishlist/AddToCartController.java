// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;


// Referenced classes of package com.walmart.android.app.wishlist:
//            BaseListItemModelState, BaseItemViewHolder

class AddToCartController
{

    private BaseItemViewHolder mCurrentHolder;
    private BaseListItemModelState mCurrentItemState;

    AddToCartController()
    {
        mCurrentHolder = null;
        mCurrentItemState = null;
    }

    public void closeQuickAdd()
    {
        if (mCurrentItemState != null)
        {
            mCurrentItemState.leaveCartMode();
            mCurrentItemState = null;
        }
        if (mCurrentHolder != null)
        {
            mCurrentHolder.changeToRegular();
            mCurrentHolder = null;
        }
    }

    public BaseItemViewHolder getCurrentHolder()
    {
        return mCurrentHolder;
    }

    public void openQuickAdd(BaseItemViewHolder baseitemviewholder, BaseListItemModelState baselistitemmodelstate)
    {
        closeQuickAdd();
        mCurrentHolder = baseitemviewholder;
        mCurrentItemState = baselistitemmodelstate;
        mCurrentItemState.enterCartMode();
        mCurrentHolder.updateCartQuantity(mCurrentItemState.getCartQuantity());
        mCurrentHolder.changeToCart();
    }

    public void updateCurrentHolder(BaseItemViewHolder baseitemviewholder)
    {
        mCurrentHolder = baseitemviewholder;
    }

    public void updateItemState(BaseListItemModelState baselistitemmodelstate)
    {
        mCurrentItemState = baselistitemmodelstate;
    }
}
