// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.app.weeklyad.WeeklyAdPresenter;
import com.walmart.android.app.weeklyad.WeeklyAdStoreController;
import com.walmart.android.data.StoreInfo;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.events.PresenterStackUpdatedEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmartlabs.storelocator.StoreFinderController;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.fragments:
//            WalmartPresenterFragment

public class WeeklyAdFragment extends WalmartPresenterFragment
{

    public static final String EXTRA_FLYER_ID = "flyer_id";
    public static final String EXTRA_FLYER_TYPE = "flyer_type";
    public static final String EXTRA_LEGACY_PROMOTION_ID = "promotion";
    public static final String EXTRA_PREVIEW_CODE = "preview_code";
    public static final String EXTRA_STORE_ID = "store_id";
    private static final String FLYER_TYPE_CIRCULAR = "circular";
    private static final String TAG = com/walmart/android/fragments/WeeklyAdFragment.getSimpleName();
    private String mFlyerId;
    private String mFlyerType;
    private Menu mMenu;
    private String mPreviewCode;
    private StoreFinderController mStoreSelector;

    public WeeklyAdFragment()
    {
    }

    private String getCurrentStoreId()
    {
        StoreInfo storeinfo = SharedPreferencesUtil.getSavedLocalAdStore(getActivity());
        if (storeinfo != null)
        {
            return storeinfo.storeID;
        } else
        {
            return null;
        }
    }

    private void init()
    {
        WLog.d(TAG, "init()");
        mPresenterStack.clear();
        String s = getCurrentStoreId();
        WLog.d(TAG, (new StringBuilder()).append("init(): Store ID from settings is ").append(s).toString());
        WLog.d(TAG, (new StringBuilder()).append("init(): Current flyer type is ").append(mFlyerType).toString());
        WLog.d(TAG, (new StringBuilder()).append("init(): Current flyer id is ").append(mFlyerId).toString());
        WLog.d(TAG, (new StringBuilder()).append("init(): Current preview code is ").append(mPreviewCode).toString());
        Bundle bundle = getDynamicArguments();
        String s2 = s;
        if (bundle != null)
        {
            String s5 = bundle.getString("store_id");
            s2 = bundle.getString("flyer_id");
            String s4 = bundle.getString("flyer_type");
            String s3 = bundle.getString("preview_code");
            if (!TextUtils.isEmpty(s5))
            {
                s = s5;
            }
            if (TextUtils.isEmpty(s2))
            {
                s2 = mFlyerId;
            }
            mFlyerId = s2;
            if (!TextUtils.isEmpty(s4))
            {
                s2 = s4;
            } else
            {
                s2 = mFlyerId;
            }
            mFlyerType = s2;
            if (!TextUtils.isEmpty(s3))
            {
                s2 = s3;
            } else
            {
                s2 = mPreviewCode;
            }
            mPreviewCode = s2;
            s2 = s;
        }
        if (mFlyerId == null)
        {
            String s1;
            if (bundle != null)
            {
                s1 = bundle.getString("promotion");
            } else
            {
                s1 = null;
            }
            mFlyerId = s1;
        }
        if (mFlyerType == null)
        {
            mFlyerType = "circular";
        }
        WLog.d(TAG, (new StringBuilder()).append("init(): After applying arguments, store is ").append(s2).append(", flyer type is ").append(mFlyerType).append(", flyer id is ").append(mFlyerId).append(", preview code is ").append(mPreviewCode).toString());
        if (!TextUtils.isEmpty(s2) && !TextUtils.isEmpty(mPreviewCode))
        {
            pushWeeklyAdPresenter(s2, mPreviewCode);
        } else
        if (!TextUtils.isEmpty(s2))
        {
            pushWeeklyAdPresenter(s2, mFlyerType, mFlyerId);
        } else
        {
            pushStoreSelector();
        }
        setDynamicArguments(null);
    }

    private void pushStoreSelector()
    {
        if (mStoreSelector == null)
        {
            mStoreSelector = new WeeklyAdStoreController(getActivity(), mPresenterStack, new com.walmart.android.app.weeklyad.WeeklyAdStoreController.StoreSelectionListener() {

                final WeeklyAdFragment this$0;

                public void onStoreSelected(WalmartStore walmartstore)
                {
                    WLog.d(WeeklyAdFragment.TAG, (new StringBuilder()).append("onStoreSelected(): ").append(walmartstore.getId()).toString());
                    init();
                }

            
            {
                this$0 = WeeklyAdFragment.this;
                super();
            }
            });
        }
        mStoreSelector.show(true);
        GoogleAnalytics.trackPageView("Local Ad Select Store");
    }

    private void pushWeeklyAdPresenter(WeeklyAdPresenter weeklyadpresenter)
    {
        weeklyadpresenter.setWeeklyAdListener(new com.walmart.android.app.weeklyad.WeeklyAdPresenter.WeeklyAdListener() {

            final WeeklyAdFragment this$0;

            public void onUpdateStoreSelectorVisibility(boolean flag)
            {
                setStoreSelectorVisibility(flag);
            }

            
            {
                this$0 = WeeklyAdFragment.this;
                super();
            }
        });
        mPresenterStack.popToRoot();
        mPresenterStack.pushAndReplacePresenter(weeklyadpresenter, false);
    }

    private void pushWeeklyAdPresenter(String s, String s1)
    {
        pushWeeklyAdPresenter(new WeeklyAdPresenter(getActivity(), s, s1));
    }

    private void pushWeeklyAdPresenter(String s, String s1, String s2)
    {
        pushWeeklyAdPresenter(new WeeklyAdPresenter(getActivity(), s, s1, s2));
    }

    private void setStoreSelectorVisibility(boolean flag)
    {
        if (flag && mMenu != null && mMenu.findItem(0x7f1006a4) == null)
        {
            getActivity().getMenuInflater().inflate(0x7f12000e, mMenu);
        } else
        if (!flag && mMenu != null)
        {
            mMenu.removeItem(0x7f1006a4);
            return;
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        mMenu = menu;
        menu.clear();
        super.onCreateOptionsMenu(menu, menuinflater);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        WLog.d(TAG, "onCreateView()");
        MessageBus.getBus().register(this);
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroyView()
    {
        WLog.d(TAG, "onDestroyView()");
        mFlyerId = null;
        mFlyerType = null;
        mPreviewCode = null;
        MessageBus.getBus().unregister(this);
        super.onDestroyView();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f1006a4)
        {
            pushStoreSelector();
        }
        return super.onOptionsItemSelected(menuitem);
    }

    public void onPresenterStackUpdatedEvent(PresenterStackUpdatedEvent presenterstackupdatedevent)
    {
        if (presenterstackupdatedevent.fragmentName == com.walmart.android.config.FragmentConfig.FragmentName.LOCAL_AD && mPresenterStack.peek() != null)
        {
            getActivity().setTitle(mPresenterStack.peek().getTitleText());
        }
    }

    public void onStoreUpdateEvent(com.walmart.android.util.SharedPreferencesUtil.StoreUpdateEvent storeupdateevent)
    {
        init();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        WLog.d(TAG, "onViewCreated()");
        init();
    }




}
