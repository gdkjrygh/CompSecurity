// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.wishlist:
//            LandingPagePresenter, FindListActivity

class this._cls0 extends OnSingleClickListener
{

    final LandingPagePresenter this$0;

    public void onSingleClick(View view)
    {
        mActivity.startActivity(new Intent(mActivity, com/walmart/android/app/wishlist/FindListActivity));
        mActivity.overridePendingTransition(0x7f05002c, 0x7f050033);
        MessageBus.getBus().post(new com.walmartlabs.anivia.er("findListTap"));
    }

    (Presenter presenter)
    {
        this$0 = LandingPagePresenter.this;
        super(presenter);
    }
}
