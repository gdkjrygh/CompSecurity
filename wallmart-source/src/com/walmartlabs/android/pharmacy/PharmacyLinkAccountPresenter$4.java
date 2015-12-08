// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyLinkAccountPresenter

class this._cls0
    implements android.view.kAccountPresenter._cls4
{

    final PharmacyLinkAccountPresenter this$0;

    public void onClick(View view)
    {
        if (PharmacyLinkAccountPresenter.access$200(PharmacyLinkAccountPresenter.this))
        {
            ((InputMethodManager)mActivity.getSystemService("input_method")).hideSoftInputFromWindow(PharmacyLinkAccountPresenter.access$300(PharmacyLinkAccountPresenter.this).getWindowToken(), 0);
            PharmacyLinkAccountPresenter.access$400(PharmacyLinkAccountPresenter.this);
        }
    }

    ()
    {
        this$0 = PharmacyLinkAccountPresenter.this;
        super();
    }
}
