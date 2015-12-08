// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.widget.CompoundButton;

// Referenced classes of package com.walmart.android.app.wishlist:
//            MatchedItemsAdapter, MatchedItemModel

class val.this._cls0
    implements android.widget.tener
{

    final tAdapterPosition this$1;
    final MatchedItemsAdapter val$this$0;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (!elfChange && flag != atchedItemModel.isSelected())
        {
            atchedItemModel.setSelected(flag);
            MatchedItemsAdapter.access$000(_fld0);
            notifyItemChanged(tAdapterPosition());
        }
    }

    ()
    {
        this$1 = final_;
        val$this$0 = MatchedItemsAdapter.this;
        super();
    }
}
