// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.wishlist.CancelableCallback;
import com.walmart.android.service.wishlist.WishList;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.kangaroo.Result;

// Referenced classes of package com.walmart.android.app.wishlist:
//            BaseLandingPagePresenter, ListCreatorActivity, FindListActivity

public class LandingPagePresenter extends BaseLandingPagePresenter
{

    private static final String TAG = com/walmart/android/app/wishlist/LandingPagePresenter.getSimpleName();
    private CancelableCallback mCallbackCreateList;

    public LandingPagePresenter(AppCompatActivity appcompatactivity)
    {
        super(appcompatactivity);
    }

    private void cancelCreateListCallback()
    {
        if (mCallbackCreateList != null)
        {
            mCallbackCreateList.cancel();
            mCallbackCreateList = null;
        }
    }

    protected String getPageName()
    {
        return "list tab";
    }

    protected void handleCreateListAction(String s)
    {
        cancelCreateListCallback();
        mCallbackCreateList = new CancelableCallback() {

            final LandingPagePresenter this$0;

            protected void onCancel()
            {
                mCallbackCreateList = null;
                mProgressView.setVisibility(8);
            }

            protected void onResult(Result result)
            {
                mCallbackCreateList = null;
                mProgressView.setVisibility(8);
                if (result.successful() && result.hasData())
                {
                    result = ((WishList)result.getData()).id;
                    ListCreatorActivity.launch(mActivity, result);
                    return;
                } else
                {
                    DialogFactory.showDialog(250, mActivity);
                    return;
                }
            }

            
            {
                this$0 = LandingPagePresenter.this;
                super();
            }
        };
        createList(s, mCallbackCreateList);
    }

    protected void handleListSelectedAction(String s)
    {
        ListCreatorActivity.launch(mActivity, s);
    }

    public void onAfterPop()
    {
        cancelCreateListCallback();
        super.onAfterPop();
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            super.onCreateView(viewgroup);
            viewgroup = ViewUtil.findViewById(mRootView, 0x7f100642);
            viewgroup.setVisibility(0);
            viewgroup.setOnClickListener(new OnSingleClickListener(this) {

                final LandingPagePresenter this$0;

                public void onSingleClick(View view)
                {
                    mActivity.startActivity(new Intent(mActivity, com/walmart/android/app/wishlist/FindListActivity));
                    mActivity.overridePendingTransition(0x7f05002c, 0x7f050033);
                    MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("findListTap"));
                }

            
            {
                this$0 = LandingPagePresenter.this;
                super(presenter);
            }
            });
            mListTitle.setText(0x7f090656);
        }
    }

    public void onPauseAsTop()
    {
        super.onPauseAsTop();
    }

    public void onStopAsTop()
    {
        cancelCreateListCallback();
        super.onStopAsTop();
    }



/*
    static CancelableCallback access$002(LandingPagePresenter landingpagepresenter, CancelableCallback cancelablecallback)
    {
        landingpagepresenter.mCallbackCreateList = cancelablecallback;
        return cancelablecallback;
    }

*/
}
