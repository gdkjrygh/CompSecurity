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

class val.this._cls0
    implements android.view.dapter.ViewHolder._cls2
{

    final  this$1;
    final MatchedItemsAdapter val$this$0;

    public void onClick(View view)
    {
        view = QuantityEditorDialogFragment.newInstance(atchedItemModel.getQuantity(), 1, atchedItemModel.getItem().getReceiptQuantity());
        view.setOnNewQuantityListener(new QuantityEditorDialogFragment.OnNewQuantityListener() {

            final MatchedItemsAdapter.ViewHolder._cls2 this$2;

            public void onNewQuantity(int i)
            {
                mMatchedItemModel.setQuantity(i);
                mQtyEditor.setText(String.valueOf(i));
            }

            
            {
                this$2 = MatchedItemsAdapter.ViewHolder._cls2.this;
                super();
            }
        });
        view.show(MatchedItemsAdapter.access$100(_fld0).getSupportFragmentManager(), "qtyDialog");
    }

    _cls1.this._cls2()
    {
        this$1 = final__pcls2;
        val$this$0 = MatchedItemsAdapter.this;
        super();
    }
}
