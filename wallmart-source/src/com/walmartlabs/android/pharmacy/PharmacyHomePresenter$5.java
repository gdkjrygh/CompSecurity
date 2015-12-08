// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import com.walmart.android.ui.PresenterStack;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyHomePresenter, PrescriptionPresenter

class this._cls0
    implements mpleted
{

    final PharmacyHomePresenter this$0;

    public void onFlowCompleted()
    {
        getPresenterStack().popToRoot();
        PrescriptionPresenter prescriptionpresenter = new PrescriptionPresenter(mActivity);
        PharmacyHomePresenter.access$500(PharmacyHomePresenter.this, prescriptionpresenter);
    }

    mpleted()
    {
        this$0 = PharmacyHomePresenter.this;
        super();
    }
}
