// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.AnalyticsHelper;
import com.walmart.android.app.storelocator.StoreDetailPresenter;
import com.walmart.android.config.WalmartStoreConfigurator;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StoreFinderController;

// Referenced classes of package com.walmart.android.fragments:
//            WalmartPresenterFragment

public class StoreFragment extends WalmartPresenterFragment
{

    public static final String EXTRA_DEFAULT_FILTER = "default_filter";
    private static final String TAG = com/walmart/android/fragments/StoreFragment.getSimpleName();
    private WalmartStoreConfigurator mStoreConfigurator;
    private StoreFinderController mStoreFinderController;

    public StoreFragment()
    {
    }

    public View getView()
    {
        return super.getView();
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public Presenter onCreatePresenter()
    {
        return null;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (mStoreFinderController != null)
        {
            mStoreFinderController.onDestroy();
        }
        mStoreFinderController = null;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
    }

    public void onDetach()
    {
        super.onDetach();
    }

    public void onHiddenChanged(boolean flag)
    {
        super.onHiddenChanged(flag);
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        if (mStoreFinderController != null)
        {
            mStoreFinderController.onLowMemory();
        }
    }

    public void onMakeMyStoreEvent(com.walmart.android.util.SharedPreferencesUtil.StoreUpdateEvent storeupdateevent)
    {
        if (mStoreFinderController != null)
        {
            mStoreConfigurator.updateStoreData();
            mStoreFinderController.reloadStoreData();
        }
    }

    public void onPause()
    {
        super.onPause();
        if (mStoreFinderController != null)
        {
            mStoreFinderController.onPause();
        }
    }

    public void onResume()
    {
        super.onResume();
        if (mStoreFinderController != null)
        {
            mStoreConfigurator.updateStoreData();
            mStoreFinderController.onResume();
            mStoreFinderController.reloadStoreData();
            mStoreFinderController.handleIntent(getDynamicArguments());
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (mStoreFinderController != null)
        {
            mStoreFinderController.onSaveInstanceState(bundle);
        }
    }

    public void onStart()
    {
        super.onStart();
        MessageBus.getBus().register(this);
    }

    public void onStop()
    {
        super.onStop();
        MessageBus.getBus().unregister(this);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (mStoreFinderController == null)
        {
            mStoreConfigurator = new WalmartStoreConfigurator(getActivity());
            mStoreFinderController = new StoreFinderController(getActivity(), mPresenterStack, mStoreConfigurator);
            mStoreFinderController.initMapMode();
            mStoreFinderController.setOnShowStoreDetailsListener(new com.walmartlabs.storelocator.StoreFinderController.OnShowStoreDetailsListener() {

                final StoreFragment this$0;

                public void onShowStoreDetails(WalmartStore walmartstore)
                {
                    walmartstore = new StoreDetailPresenter(getActivity(), walmartstore);
                    
// JavaClassFileOutputException: get_constant: invalid tag

                public volatile void onShowStoreDetails(StoreData storedata)
                {
                    onShowStoreDetails((WalmartStore)storedata);
                }

            
            {
                this$0 = StoreFragment.this;
                super();
            }
            });
            mStoreFinderController.setStoreFilterListener(new com.walmartlabs.storelocator.StoreFinderController.StoreFilterListener() {

                final StoreFragment this$0;

                public void onFilterDialogDisplayed()
                {
                    AnalyticsHelper.post(AnalyticsHelper.prepareStoreFilterPageViewEvent());
                }

            
            {
                this$0 = StoreFragment.this;
                super();
            }
            });
            mStoreFinderController.show(false);
            mStoreFinderController.initLocation();
            mStoreFinderController.onCreate(bundle);
        }
    }


}
