// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.text.TextUtils;
import com.walmart.android.app.item.ItemDetailsPresenter;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.ui.RecyclerItemSingleClickListener;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import org.apache.commons.lang3.math.NumberUtils;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfPresenter, ShelfAdapter, SimpleItemDetailsPresenter

class Listener extends RecyclerItemSingleClickListener
{

    final ShelfPresenter this$0;

    public void onItemSingleClick(BasicViewHolder basicviewholder, int i)
    {
        com.walmart.android.data.Item item = (com.walmart.android.data.Item)mAdapter.getItem(i);
        if (item != null)
        {
            Object obj1 = null;
            basicviewholder = item.getiD();
            if (item.showOnWebsite())
            {
                showOnWebsite(item);
            } else
            {
                if (!NumberUtils.isDigits(basicviewholder))
                {
                    String s = item.getName();
                    basicviewholder = item.getProductImageUrl();
                    Object obj = basicviewholder;
                    if (TextUtils.isEmpty(basicviewholder))
                    {
                        obj = item.getImageThumbnailUrl();
                    }
                    basicviewholder = obj1;
                    if (s != null)
                    {
                        basicviewholder = obj1;
                        if (obj != null)
                        {
                            basicviewholder = new SimpleItemDetailsPresenter(mActivity);
                            basicviewholder.init(s, null, ((String) (obj)), item.getPrice(), item.getPriceDisplaySubtext(), item.getDescription(), item.getDealInfo());
                        }
                    }
                } else
                {
                    basicviewholder = new ItemDetailsPresenter(mActivity, item.getiD());
                }
                if (basicviewholder != null)
                {
                    mPresenterStackForPushes.pushPresenter(basicviewholder, true);
                    return;
                }
            }
        }
    }

    ter(Presenter presenter)
    {
        this$0 = ShelfPresenter.this;
        super(presenter);
    }
}
