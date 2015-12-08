// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.os.Bundle;
import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.item.BuyingOptionModel;
import com.walmart.android.service.item.ItemModel;
import com.walmart.android.service.item.ItemPrice;
import com.walmart.android.service.item.VariantsModel;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.WalmartPrice;
import java.util.Locale;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter, ItemLogic

class this._cls0 extends OnSingleClickListener
{

    final ItemDetailsPresenter this$0;

    public void onSingleClick(View view)
    {
        Bundle bundle = new Bundle();
        String s1 = ItemDetailsPresenter.access$2100(ItemDetailsPresenter.this).getUpc();
        String s = ItemDetailsPresenter.access$300(ItemDetailsPresenter.this).getSelectedItemId();
        view = s;
        if (ItemDetailsPresenter.access$2100(ItemDetailsPresenter.this).hasVariants())
        {
            view = ItemDetailsPresenter.access$2100(ItemDetailsPresenter.this).getVariantsModel().getVariantItemWithId(s);
            String s2;
            String s3;
            WalmartPrice walmartprice;
            if (view != null)
            {
                view = view.getBuyingOptionModel();
            } else
            {
                view = null;
            }
            if (view != null)
            {
                view = view.getUsItemId();
            } else
            {
                view = "";
            }
        }
        s2 = ItemDetailsPresenter.access$2100(ItemDetailsPresenter.this).getPrimarySellerId();
        s3 = ItemDetailsPresenter.access$2100(ItemDetailsPresenter.this).getProductName();
        s = "";
        walmartprice = WalmartPrice.fromString(ItemDetailsPresenter.access$300(ItemDetailsPresenter.this).getOnlinePrice().getPriceString());
        if (walmartprice.isValid())
        {
            s = String.format(Locale.US, "%d.%02d", new Object[] {
                Integer.valueOf(walmartprice.getLowerBound().erPart), Integer.valueOf(walmartprice.getLowerBound().alPart)
            });
        }
        bundle.putString("registry_add_path", String.format(Locale.US, "/lists/registry-homepage?upc=%s&USItemId=%s&USSellerId=%s&productName=%s&quantity=1&price=%s&action=add-to-registry", new Object[] {
            s1, view, s2, s3, s
        }));
        bundle.putBoolean("reload", true);
        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.ame.REGISTRY, bundle, true));
    }

    e(Presenter presenter)
    {
        this$0 = ItemDetailsPresenter.this;
        super(presenter);
    }
}
