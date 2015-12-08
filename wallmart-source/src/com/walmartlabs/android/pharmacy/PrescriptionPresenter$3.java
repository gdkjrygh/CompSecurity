// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PrescriptionPresenter, PrescriptionTabsAdapter

class this._cls0
    implements android.support.v4.view.stener
{

    final PrescriptionPresenter this$0;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        if (PrescriptionPresenter.access$600(PrescriptionPresenter.this) != null)
        {
            PrescriptionPresenter.access$600(PrescriptionPresenter.this).onPageSelected(i);
        }
        String s;
        if (i == 1)
        {
            s = "Rx:OrderHistory";
        } else
        {
            s = "Rx:YourPrescriptions";
        }
        MessageBus.getBus().post((new com.walmartlabs.anivia.r("pageView")).putString("name", s));
    }

    ()
    {
        this$0 = PrescriptionPresenter.this;
        super();
    }
}
