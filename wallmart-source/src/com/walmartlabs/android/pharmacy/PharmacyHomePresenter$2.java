// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyHomePresenter

class this._cls0 extends OnSingleClickListener
{

    final PharmacyHomePresenter this$0;

    public void onSingleClick(View view)
    {
        int i = view.getId();
        if (i == fill)
        {
            startEasyRefill();
            return;
        }
        if (i == ptions)
        {
            PharmacyHomePresenter.access$100(PharmacyHomePresenter.this);
            return;
        }
        if (i == rescription)
        {
            view = createTransferPrescriptionPresenter();
            PharmacyHomePresenter.access$200(PharmacyHomePresenter.this, view);
            MessageBus.getBus().post(new com.walmartlabs.anivia.r("pharmacyTransferInitiate"));
            return;
        }
        if (i == r_prescriptions)
        {
            view = createFourDollarPresenter();
            PharmacyHomePresenter.access$300(PharmacyHomePresenter.this, view);
            return;
        }
        if (i == rmacy)
        {
            startFindAPharmacy();
            MessageBus.getBus().post((new com.walmartlabs.anivia.r("pageView")).putString("name", "Rx:Pharmacy Locator Page"));
            return;
        } else
        {
            clearSingleClickFlag();
            return;
        }
    }

    (Presenter presenter)
    {
        this$0 = PharmacyHomePresenter.this;
        super(presenter);
    }
}
