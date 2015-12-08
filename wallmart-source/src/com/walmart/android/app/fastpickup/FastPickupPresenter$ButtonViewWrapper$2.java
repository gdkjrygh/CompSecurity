// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.fastpickup;

import android.view.View;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.wmservice.fastpickup.FastPickupManager;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.fastpickup:
//            FastPickupPresenter, FastPickupUtil

class val.callback
    implements android.view.r.ButtonViewWrapper._cls2
{

    final val.callback this$1;
    final AsyncCallback val$callback;
    final FastPickupPresenter val$this$0;

    public void onClick(View view)
    {
        WLog.d(FastPickupPresenter.access$100(), "onClick()");
        if (FastPickupPresenter.access$500(_fld0).checkin(cess._mth400(this._cls1.this), val$callback))
        {
            FastPickupUtil.sendPageViewEvent("check in : confirmation");
            view.setEnabled(false);
        }
    }

    ()
    {
        this$1 = final_;
        val$this$0 = fastpickuppresenter;
        val$callback = AsyncCallback.this;
        super();
    }
}
