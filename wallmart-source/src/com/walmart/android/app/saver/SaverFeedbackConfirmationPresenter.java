// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;

public class SaverFeedbackConfirmationPresenter extends Presenter
{

    private final Activity mActivity;
    private View mRootView;

    public SaverFeedbackConfirmationPresenter(Activity activity)
    {
        mActivity = activity;
        setTitleText(mActivity.getString(0x7f0904ad));
    }

    public View getView()
    {
        return mRootView;
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        return super.onCreateMenu(menu, menuinflater);
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        super.onCreateView(viewgroup);
        if (mRootView == null)
        {
            mRootView = ViewUtil.inflate(mActivity, 0x7f04014e, viewgroup, false);
        }
    }

    protected void onPageView()
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Missed Ad - Thank You").putString("section", "Saver").putString("subCategory", "Savings Catcher");
        MessageBus.getBus().post(builder);
    }
}
