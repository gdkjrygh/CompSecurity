// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.fastpickup;

import android.widget.Button;
import com.squareup.otto.Bus;
import com.walmart.android.data.FastPickupOrder;
import com.walmart.android.events.FastPickupOrderReadyEvent;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.utils.WLog;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.walmart.android.app.fastpickup:
//            FastPickupPresenter, FastPickupUtil

class val.this._cls0
    implements AsyncCallback
{

    final onSuccess this$1;
    final FastPickupPresenter val$this$0;

    public int getID()
    {
        return 0;
    }

    public void onCancelled()
    {
        cess._mth200(this._cls1.this).setEnabled(true);
    }

    public void onFailure(Integer integer, FastPickupOrderReadyEvent fastpickuporderreadyevent)
    {
        int i = 1;
        WLog.d(FastPickupPresenter.access$100(), (new StringBuilder()).append("onFailure(): ").append(integer).toString());
        cess._mth200(this._cls1.this).setEnabled(true);
        if (isPopped())
        {
            return;
        }
        int j = FastPickupUtil.translateErrorCode(integer);
        integer = _fld0;
        if (j != 0x15f92)
        {
            i = 0;
        }
        FastPickupPresenter.access$300(integer, i);
    }

    public volatile void onFailure(Object obj, Object obj1)
    {
        onFailure((Integer)obj, (FastPickupOrderReadyEvent)obj1);
    }

    public void onSuccess(FastPickupOrderReadyEvent fastpickuporderreadyevent)
    {
        if (fastpickuporderreadyevent != null && fastpickuporderreadyevent.orders != null)
        {
            Object obj;
            for (fastpickuporderreadyevent = fastpickuporderreadyevent.orders.getOrderIds(cess._mth400(this._cls1.this)).iterator(); fastpickuporderreadyevent.hasNext(); MessageBus.getBus().post(obj))
            {
                obj = (String)fastpickuporderreadyevent.next();
                obj = (new com.walmartlabs.anivia.ewWrapper("expressPrepareOrder")).ewWrapper("storeId", cess._mth400(this._cls1.this)).ewWrapper("orderId", ((String) (obj)));
            }

        }
        cess._mth200(this._cls1.this).setEnabled(true);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((FastPickupOrderReadyEvent)obj);
    }

    public void setID(int i)
    {
    }

    ()
    {
        this$1 = final_;
        val$this$0 = FastPickupPresenter.this;
        super();
    }
}
