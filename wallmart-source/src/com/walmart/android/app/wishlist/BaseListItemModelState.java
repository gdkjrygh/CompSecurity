// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import com.walmart.android.service.wishlist.models.ListItemModel;

class BaseListItemModelState
{

    private int mCartQuantity;
    private boolean mInCartState;
    private boolean mIsAddToCartInProgress;
    protected final ListItemModel mItem;

    public BaseListItemModelState(ListItemModel listitemmodel)
    {
        mItem = listitemmodel;
        mInCartState = false;
        mCartQuantity = 1;
        mIsAddToCartInProgress = false;
    }

    public void enterCartMode()
    {
        if (!mInCartState)
        {
            mInCartState = true;
            mCartQuantity = 1;
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (BaseListItemModelState)obj;
            if (!mItem.equals(((BaseListItemModelState) (obj)).mItem))
            {
                return false;
            }
        }
        return true;
    }

    public int getCartQuantity()
    {
        return mCartQuantity;
    }

    public ListItemModel getItem()
    {
        return mItem;
    }

    public int hashCode()
    {
        return mItem.hashCode();
    }

    public boolean isAddToCartInProgress()
    {
        return mIsAddToCartInProgress;
    }

    public boolean isInCartState()
    {
        return mInCartState;
    }

    public void leaveCartMode()
    {
        if (mInCartState)
        {
            mInCartState = false;
            mCartQuantity = 1;
        }
    }

    public void setCartQuantity(int i)
    {
        mCartQuantity = i;
    }

    public void setIsAddToCartInProgress(boolean flag)
    {
        mIsAddToCartInProgress = flag;
    }
}
