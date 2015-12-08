// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.text.TextUtils;
import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.app.wishlist.ListCreatorActivity;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.item.BundleModel;
import com.walmart.android.service.item.BuyingOptionModel;
import com.walmart.android.service.item.ItemModel;
import com.walmart.android.service.item.ItemPrice;
import com.walmart.android.service.wishlist.AddBundle;
import com.walmart.android.service.wishlist.AddItemOfferId;
import com.walmart.android.service.wishlist.AddItemUsItemId;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.WalmartPrice;
import java.util.Locale;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter, ItemLogic, ItemState

class this._cls0 extends OnSingleClickListener
{

    final ItemDetailsPresenter this$0;

    private String getPriceString()
    {
        String s = "0";
        WalmartPrice walmartprice = WalmartPrice.fromString(ItemDetailsPresenter.access$300(ItemDetailsPresenter.this).getOnlinePrice().getPriceString());
        if (walmartprice.isValid())
        {
            s = String.format(Locale.US, "%d.%02d", new Object[] {
                Integer.valueOf(walmartprice.getLowerBound().erPart), Integer.valueOf(walmartprice.getLowerBound().alPart)
            });
        }
        return s;
    }

    public void onSingleClick(View view)
    {
        if (ItemDetailsPresenter.access$2100(ItemDetailsPresenter.this).isNonConfigurableBundle())
        {
            view = new AddBundle(ItemDetailsPresenter.access$2100(ItemDetailsPresenter.this).getBundleModel().getGroupingId(), 1, AddBundle.convertItems(ItemDetailsPresenter.access$3700(ItemDetailsPresenter.this)));
            ListCreatorActivity.launch(ItemDetailsPresenter.access$200(ItemDetailsPresenter.this), view);
        } else
        if (ItemDetailsPresenter.access$2000(ItemDetailsPresenter.this).getSelectedBuyingOption() != null && ItemDetailsPresenter.access$2100(ItemDetailsPresenter.this).isInflexibleKit())
        {
            view = new AddBundle(ItemDetailsPresenter.access$2000(ItemDetailsPresenter.this).getSelectedBuyingOption().getInflexibleKitId(), 1, AddBundle.convertItems(ItemDetailsPresenter.access$2000(ItemDetailsPresenter.this).getSelectedBuyingOption().getInflexibleKitConfiguration()));
            ListCreatorActivity.launch(ItemDetailsPresenter.access$200(ItemDetailsPresenter.this), view);
        } else
        {
            view = ItemDetailsPresenter.access$2000(ItemDetailsPresenter.this).getSelectedBuyingOption();
            if (view != null && !TextUtils.isEmpty(view.getOfferId()))
            {
                view = new AddItemOfferId(1, getPriceString(), view.getOfferId());
            } else
            {
                view = ItemDetailsPresenter.access$2100(ItemDetailsPresenter.this).getItemId();
                String s = ItemDetailsPresenter.access$2100(ItemDetailsPresenter.this).getPrimarySellerId();
                String s1 = ItemDetailsPresenter.access$2100(ItemDetailsPresenter.this).getProductName();
                view = new AddItemUsItemId(1, getPriceString(), view, s, s1);
            }
            ListCreatorActivity.launch(ItemDetailsPresenter.access$200(ItemDetailsPresenter.this), view);
        }
        view = (new com.walmartlabs.anivia.r("AddToListTap")).putString("itemId", ItemDetailsPresenter.access$2100(ItemDetailsPresenter.this).getItemId()).putString("tapLocation", "item page");
        MessageBus.getBus().post(view);
    }

    (Presenter presenter)
    {
        this$0 = ItemDetailsPresenter.this;
        super(presenter);
    }
}
