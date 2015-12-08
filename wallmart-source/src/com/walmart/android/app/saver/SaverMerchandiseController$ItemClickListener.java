// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.RecyclerItemSingleClickListener;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverMerchandiseController

private class this._cls0 extends RecyclerItemSingleClickListener
{

    final SaverMerchandiseController this$0;

    public void onItemSingleClick(BasicViewHolder basicviewholder, int i)
    {
        basicviewholder = SaverMerchandiseController.access$600(SaverMerchandiseController.this).getItem(i);
        SaverMerchandiseController.access$1100(SaverMerchandiseController.this).onShowMerchandise(((com.walmart.android.service.saver.tener.onShowMerchandise) (basicviewholder)).onShowMerchandise);
        com.walmartlabs.anivia.stener stener = new com.walmartlabs.anivia.tUrl("recommendedTap");
        if (((com.walmart.android.service.saver.tener.onShowMerchandise) (basicviewholder)).onShowMerchandise != null)
        {
            stener.tId("itemId", ((com.walmart.android.service.saver.tener.onShowMerchandise) (basicviewholder)).onShowMerchandise);
        }
        if (((com.walmart.android.service.saver.tener.onShowMerchandise) (basicviewholder)).onShowMerchandise != null)
        {
            stener.geText("productName", ((com.walmart.android.service.saver.tener.onShowMerchandise) (basicviewholder)).onShowMerchandise);
        }
        if (((com.walmart.android.service.saver.tener.onShowMerchandise) (basicviewholder)).onShowMerchandise != null)
        {
            stener.Beacon("athenaBeacon", ((com.walmart.android.service.saver.tener.onShowMerchandise) (basicviewholder)).onShowMerchandise);
        }
        MessageBus.getBus().post(stener);
    }

    public dListener(Presenter presenter)
    {
        this$0 = SaverMerchandiseController.this;
        super(presenter);
    }
}
