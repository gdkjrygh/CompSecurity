// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.fastpickup;

import android.view.View;
import android.widget.AdapterView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnItemSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.fastpickup:
//            FastPickupStorePresenter, FastPickupPresenter

class this._cls0 extends OnItemSingleClickListener
{

    final FastPickupStorePresenter this$0;

    public void onItemSingleClick(AdapterView adapterview, View view, int i, long l)
    {
        boolean flag = true;
        if (l >= 0L)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (l >= (long)FastPickupStorePresenter.access$000(FastPickupStorePresenter.this).getCount())
        {
            flag = false;
        }
        if ((i & flag) != 0)
        {
            adapterview = ((com.walmart.android.data.esenter.Adapter.getCount)FastPickupStorePresenter.access$000(FastPickupStorePresenter.this).getItem((int)l)).r;
            WLog.d(FastPickupStorePresenter.access$100(), (new StringBuilder()).append("onItemClick() storeId=").append(adapterview).toString());
            view = (new com.walmartlabs.anivia.init>("expressStoreSelect")).utString("storeId", adapterview);
            MessageBus.getBus().post(view);
            FastPickupStorePresenter.access$300(FastPickupStorePresenter.this, new FastPickupPresenter(FastPickupStorePresenter.access$200(FastPickupStorePresenter.this), adapterview));
        }
    }

    apter(Presenter presenter)
    {
        this$0 = FastPickupStorePresenter.this;
        super(presenter);
    }
}
