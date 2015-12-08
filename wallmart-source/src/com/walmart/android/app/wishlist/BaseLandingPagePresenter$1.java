// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.FloatLabel;

// Referenced classes of package com.walmart.android.app.wishlist:
//            BaseLandingPagePresenter

class this._cls0 extends OnSingleClickListener
{

    final BaseLandingPagePresenter this$0;

    public void onSingleClick(View view)
    {
        view = mNewListNameView.getText().toString().trim();
        if (!TextUtils.isEmpty(view))
        {
            if (!BaseLandingPagePresenter.access$000(BaseLandingPagePresenter.this, view))
            {
                BaseLandingPagePresenter.access$100(BaseLandingPagePresenter.this);
                ViewUtil.hideKeyboard(mRootView);
                mProgressView.setVisibility(0);
                handleCreateListAction(view);
                view = (new com.walmartlabs.anivia.init>("createNewListTap")).utString("tapLocation", getPageName());
                MessageBus.getBus().post(view);
                return;
            } else
            {
                BaseLandingPagePresenter.access$200(BaseLandingPagePresenter.this).setError(0x7f090673);
                return;
            }
        } else
        {
            BaseLandingPagePresenter.access$200(BaseLandingPagePresenter.this).setError(0x7f090655);
            return;
        }
    }

    A(Presenter presenter)
    {
        this$0 = BaseLandingPagePresenter.this;
        super(presenter);
    }
}
