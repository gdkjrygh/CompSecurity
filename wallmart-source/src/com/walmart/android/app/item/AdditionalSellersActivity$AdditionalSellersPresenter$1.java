// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmart.android.app.item:
//            AdditionalSellersActivity

class this._cls0
    implements com.walmartlabs.ui.recycler.
{

    final this._cls0 this$0;

    public void onItemClick(BasicViewHolder basicviewholder, int i)
    {
        basicviewholder = cess._mth100(this._cls0.this)._mth0(i);
        cess._mth200(this._cls0.this).finishWithSellerId(((this._cls0) (basicviewholder))._fld0);
    }

    Y()
    {
        this$0 = this._cls0.this;
        super();
    }
}
