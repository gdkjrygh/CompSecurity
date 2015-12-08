// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import com.walmart.android.wmui.NumberPicker;

// Referenced classes of package com.walmart.android.app.wishlist:
//            BaseItemViewHolder, BaseListItemModelState

class this._cls0
    implements com.walmart.android.wmui.dListener
{

    final BaseItemViewHolder this$0;

    public void onChanged(NumberPicker numberpicker, int i, int j)
    {
        if (mItemState != null)
        {
            mItemState.setCartQuantity(j);
        }
    }

    e()
    {
        this$0 = BaseItemViewHolder.this;
        super();
    }
}
