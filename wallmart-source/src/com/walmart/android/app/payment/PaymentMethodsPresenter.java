// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.payment;

import android.app.Activity;
import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.AnalyticsHelper;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.payment.controller.edit.PaymentMethodsController;

public class PaymentMethodsPresenter extends Presenter
    implements com.walmartlabs.payment.controller.edit.PaymentMethodsController.Callbacks
{

    private static final String TAG = com/walmart/android/app/payment/PaymentMethodsPresenter.getSimpleName();
    private final Activity mActivity;
    private final PaymentMethodsController mController;
    private View mRootView;

    public PaymentMethodsPresenter(Activity activity)
    {
        mActivity = activity;
        mController = new PaymentMethodsController(mActivity);
    }

    public View getView()
    {
        return mRootView;
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        mController.refresh();
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        menuinflater.inflate(0x7f120004, menu);
        return true;
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = ViewUtil.inflate(mActivity, 0x7f040125, viewgroup, false);
            mController.init(mRootView, this);
            setTitleText(mActivity.getResources().getString(0x7f09044f));
        }
        MessageBus.getBus().post(AnalyticsHelper.prepareMobilePayPageViewEvent());
    }

    public void onOpenPay()
    {
        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.MOBILE_PAY));
    }

    public boolean onOptionsMenuItemSelected(MenuItem menuitem, Activity activity)
    {
        if (menuitem.getItemId() == 0x7f100698)
        {
            MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("mobilePayHeader"));
            PaymentMethodsController.addCard(activity);
        }
        return super.onOptionsMenuItemSelected(menuitem, activity);
    }

    public void onRestartAsTop()
    {
        super.onRestartAsTop();
        mController.refresh();
    }

}
