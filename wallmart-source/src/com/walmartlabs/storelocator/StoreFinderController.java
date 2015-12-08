// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.walmart.android.ui.PresenterStack;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreFinderConfigurator, FilterManager, StoreManager, StoreViewPresenter, 
//            StorePickerListener, StoreData

public class StoreFinderController
{
    public static interface ClosestStoreFoundListener
    {

        public abstract void onClosestStoreFound(double d, double d1, StoreData storedata);

        public abstract void onClosestStoreFound(String s, StoreData storedata);
    }

    public static interface OnShowStoreDetailsListener
    {

        public abstract void onShowStoreDetails(StoreData storedata);
    }

    public static interface StoreFilterListener
    {

        public abstract void onFilterDialogDisplayed();
    }


    public static final String EXTRA_DEFAULT_FILTER = "default_filter";
    protected static final String TAG = com/walmartlabs/storelocator/StoreFinderController.getSimpleName();
    private Activity mActivity;
    private String mDefaultFilter;
    private FilterManager mFilterManager;
    private String mItemRestrictions[];
    private OnShowStoreDetailsListener mOnShowStoreDetailsListener;
    private boolean mPickerModeOn;
    private PresenterStack mPresenterStack;
    private StoreFilterListener mStoreFilterListener;
    private StoreFinderConfigurator mStoreFinderConfigurator;
    private StoreManager mStoreManager;
    private StorePickerListener mStorePickerListener;
    private StoreViewPresenter mStoreViewPresenter;

    public StoreFinderController(Activity activity, PresenterStack presenterstack, StoreFinderConfigurator storefinderconfigurator)
    {
        mActivity = activity;
        mPresenterStack = presenterstack;
        mStoreFinderConfigurator = storefinderconfigurator;
    }

    private void init()
    {
        FilterManager filtermanager1 = mStoreFinderConfigurator.getFilterManager(mActivity);
        FilterManager filtermanager = filtermanager1;
        if (filtermanager1 == null)
        {
            filtermanager = new FilterManager();
        }
        mFilterManager = filtermanager;
        mStoreManager = new StoreManager(mFilterManager);
        mStoreViewPresenter = new StoreViewPresenter(mActivity, mFilterManager, mStoreManager, mItemRestrictions, mStoreFinderConfigurator);
        if (mPickerModeOn)
        {
            mStoreViewPresenter.initPickerMode();
        } else
        {
            mStoreViewPresenter.initMapMode();
        }
        wireListeners();
    }

    private void wireListeners()
    {
        mStoreViewPresenter.setStorePickerListener(new StorePickerListener() {

            final StoreFinderController this$0;

            public void onCancelled()
            {
                if (mStorePickerListener != null)
                {
                    mStorePickerListener.onCancelled();
                }
            }

            public void onStoreClicked(StoreData storedata)
            {
                if (!mPickerModeOn)
                {
                    if (mOnShowStoreDetailsListener != null)
                    {
                        mOnShowStoreDetailsListener.onShowStoreDetails(storedata);
                    }
                } else
                if (mStorePickerListener != null)
                {
                    mStorePickerListener.onStoreClicked(storedata);
                    return;
                }
            }

            
            {
                this$0 = StoreFinderController.this;
                super();
            }
        });
        mStoreViewPresenter.setStoreFilterListener(new StoreViewPresenter.StoreFilterListener() {

            final StoreFinderController this$0;

            public void onFilterDialogDisplayed()
            {
                if (mStoreFilterListener != null)
                {
                    mStoreFilterListener.onFilterDialogDisplayed();
                }
            }

            
            {
                this$0 = StoreFinderController.this;
                super();
            }
        });
    }

    public void handleIntent(Bundle bundle)
    {
        String s = null;
        if (bundle == null) goto _L2; else goto _L1
_L1:
        s = bundle.getString("default_filter");
        bundle = s;
        if (!TextUtils.isEmpty(s))
        {
            bundle = s;
            if (!s.equals(mDefaultFilter))
            {
                bundle = s;
                if (mPresenterStack != null)
                {
                    mPresenterStack.popToRoot();
                    mStoreViewPresenter.showMapView(false);
                    mFilterManager.clearAll();
                    mFilterManager.startEditing();
                    mFilterManager.setServiceCheck(s, true);
                    mFilterManager.stopEditingAndSave();
                    mStoreViewPresenter.toggleFilterActive(true);
                    mStoreManager.updateFilter();
                    initLocation();
                    bundle = s;
                }
            }
        }
_L4:
        mDefaultFilter = bundle;
        return;
_L2:
        bundle = s;
        if (!TextUtils.isEmpty(mDefaultFilter))
        {
            mPresenterStack.popToRoot();
            mStoreViewPresenter.showMapView(false);
            mFilterManager.clearAll();
            mStoreViewPresenter.toggleFilterActive(false);
            mStoreManager.updateFilter();
            initLocation();
            bundle = s;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public transient void initFilteredPickerMode(String as[])
    {
        initPickerMode();
        mFilterManager.clearAll();
        mFilterManager.startEditing();
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            mFilterManager.setServiceCheck(s, true);
        }

        mFilterManager.stopEditingAndSave();
        mStoreManager.updateFilter();
    }

    public void initLocation()
    {
        mStoreViewPresenter.initLocation();
    }

    public void initMapMode()
    {
        mPickerModeOn = false;
        init();
    }

    public void initPickerMode()
    {
        mPickerModeOn = true;
        init();
    }

    public void initWithItemRestrictions(String as[])
    {
        mPickerModeOn = true;
        mItemRestrictions = as;
        init();
    }

    public void onCreate(Bundle bundle)
    {
        mStoreViewPresenter.onCreate(bundle);
    }

    public void onDestroy()
    {
        mStoreViewPresenter.onDestroy();
    }

    public void onLowMemory()
    {
        mStoreViewPresenter.onLowMemory();
    }

    public void onPause()
    {
        mStoreViewPresenter.onPause();
    }

    public void onResume()
    {
        mStoreViewPresenter.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        mStoreViewPresenter.onSaveInstanceState(bundle);
    }

    public void popAndSetAsFront()
    {
        popAndSetAsFront(true);
    }

    public void popAndSetAsFront(boolean flag)
    {
        if (mPresenterStack.getCount() > 0)
        {
            mPresenterStack.popToRoot();
            mPresenterStack.pushAndReplacePresenter(mStoreViewPresenter, flag);
        }
    }

    public void popToRoot()
    {
        if (mPresenterStack != null)
        {
            if (mPresenterStack.getCount() > 1)
            {
                mPresenterStack.popToRoot();
                mStoreViewPresenter.showMapView(false);
            } else
            if (mStoreViewPresenter != null)
            {
                mStoreViewPresenter.showMapView(true);
                return;
            }
        }
    }

    public void pushStoreFinderView()
    {
        mPresenterStack.pushPresenter(mStoreViewPresenter, true);
    }

    public void reloadStoreData()
    {
        if (mStoreViewPresenter != null)
        {
            mStoreViewPresenter.reloadStoreData();
        }
    }

    public void setClosestStoreFoundListener(ClosestStoreFoundListener closeststorefoundlistener)
    {
        mStoreViewPresenter.setClosestStoreFoundListener(closeststorefoundlistener);
    }

    public void setOnShowStoreDetailsListener(OnShowStoreDetailsListener onshowstoredetailslistener)
    {
        mOnShowStoreDetailsListener = onshowstoredetailslistener;
    }

    public void setStoreFilterListener(StoreFilterListener storefilterlistener)
    {
        mStoreFilterListener = storefilterlistener;
    }

    public void setStorePickerListener(StorePickerListener storepickerlistener)
    {
        mStorePickerListener = storepickerlistener;
    }

    public void setStorePickerTitle(String s)
    {
        mStoreViewPresenter.setTitleText(s);
    }

    public void show(boolean flag)
    {
        mPresenterStack.pushPresenter(mStoreViewPresenter, flag);
    }





}
