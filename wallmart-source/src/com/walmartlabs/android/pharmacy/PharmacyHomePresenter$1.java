// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.view.View;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyHomePresenter

class this._cls0 extends OnSingleClickListener
{

    final PharmacyHomePresenter this$0;

    public void onSingleClick(View view)
    {
        view = createPrivacyNoticePresenter();
        PharmacyHomePresenter.access$000(PharmacyHomePresenter.this, view);
    }

    (Presenter presenter)
    {
        this$0 = PharmacyHomePresenter.this;
        super(presenter);
    }
}
