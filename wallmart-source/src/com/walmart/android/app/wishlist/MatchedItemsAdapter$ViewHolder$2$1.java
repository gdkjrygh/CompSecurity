// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.walmart.android.service.wishlist.models.ListItemModel;

// Referenced classes of package com.walmart.android.app.wishlist:
//            MatchedItemsAdapter, MatchedItemModel, QuantityEditorDialogFragment

class this._cls2
    implements uantityListener
{

    final Editor this$2;

    public void onNewQuantity(int i)
    {
        chedItemModel.setQuantity(i);
        Editor.setText(String.valueOf(i));
    }

    l.this._cls0()
    {
        this$2 = this._cls2.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/app/wishlist/MatchedItemsAdapter$ViewHolder$2

/* anonymous class */
    class MatchedItemsAdapter.ViewHolder._cls2
        implements android.view.View.OnClickListener
    {

        final MatchedItemsAdapter.ViewHolder this$1;
        final MatchedItemsAdapter val$this$0;

        public void onClick(View view)
        {
            view = QuantityEditorDialogFragment.newInstance(mMatchedItemModel.getQuantity(), 1, mMatchedItemModel.getItem().getReceiptQuantity());
            view.setOnNewQuantityListener(new MatchedItemsAdapter.ViewHolder._cls2._cls1());
            view.show(MatchedItemsAdapter.access$100(MatchedItemsAdapter.ViewHolder.this.this$0).getSupportFragmentManager(), "qtyDialog");
        }

            
            {
                this$1 = final_viewholder;
                this$0 = MatchedItemsAdapter.this;
                super();
            }
    }

}
