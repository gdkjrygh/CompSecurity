// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.events.BuyFromFullSiteTapEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.cart.ListInfo;
import com.walmart.android.service.item.ItemModel;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import java.util.Locale;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter

class this._cls0 extends OnSingleClickListener
{

    final ItemDetailsPresenter this$0;

    public void onSingleClick(View view)
    {
        Uri uri = Uri.parse(String.format(Locale.US, "http://www.walmart.com/msharbor%s?adid=1500000000000033643520&veh=mappa", new Object[] {
            ItemDetailsPresenter.access$2100(ItemDetailsPresenter.this).getUrlPath()
        }));
        view = uri;
        if (ItemDetailsPresenter.access$3800(ItemDetailsPresenter.this) != null)
        {
            view = uri.buildUpon();
            view.arameter("registryId", ItemDetailsPresenter.access$3800(ItemDetailsPresenter.this).registryId);
            view.arameter("listId", ItemDetailsPresenter.access$3800(ItemDetailsPresenter.this).id);
            view.arameter("listType", ItemDetailsPresenter.access$3800(ItemDetailsPresenter.this).type);
            view.arameter("listItemId", ItemDetailsPresenter.access$3800(ItemDetailsPresenter.this).itemId);
            view = view.itemId();
        }
        view = new Intent("android.intent.action.VIEW", view);
        if (view.resolveActivity(ItemDetailsPresenter.access$200(ItemDetailsPresenter.this).getPackageManager()) != null)
        {
            ItemDetailsPresenter.access$200(ItemDetailsPresenter.this).startActivity(view);
            MessageBus.getBus().post(new BuyFromFullSiteTapEvent(ItemDetailsPresenter.access$100(ItemDetailsPresenter.this)));
        }
    }

    apEvent(Presenter presenter)
    {
        this$0 = ItemDetailsPresenter.this;
        super(presenter);
    }
}
