// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.walmart.android.analytics.AnalyticsHelper;
import com.walmart.android.app.storelocator.WalmartStoreModeManager;
import com.walmart.android.data.AppConfig;
import com.walmart.android.data.StoreInfo;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterGroup;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmart.android.wmui.ScrollDirectionListener;
import com.walmartlabs.msco.service.StoreModeEvent;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StoreLocationManager;
import java.util.List;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfListPresenter, InStoreListPresenter

public class SearchResultPresenter extends PresenterGroup
{
    public static interface OnTabSelectedListener
    {

        public abstract void onTabSelected(int i);
    }

    private class TabBarHider extends ScrollDirectionListener
    {

        final SearchResultPresenter this$0;

        public void onScrollDirectionChanged(int i)
        {
            switch (i)
            {
            default:
                return;

            case 1: // '\001'
                mTabBar.animate().y(0.0F);
                return;

            case 0: // '\0'
                mTabBar.animate().y(-mTabBarHeight);
                return;
            }
        }

        public TabBarHider(Context context)
        {
            this$0 = SearchResultPresenter.this;
            super(context);
        }
    }


    public static final int TAB_IN_STORE = 1;
    public static final int TAB_ONLINE = 0;
    public static final String TAG = com/walmart/android/app/shop/SearchResultPresenter.getSimpleName();
    private final Context mContext;
    private String mDept;
    private View mInStoreButton;
    private InStoreListPresenter mInStoreListPresenter;
    private boolean mInStoreSearchEnabled;
    private OnTabSelectedListener mOnTabSelectedListener;
    private View mOnlineButton;
    private String mQuery;
    private ViewGroup mRootContainer;
    private ViewGroup mSearchListContainer;
    private com.walmart.android.search.SearchData.SearchType mSearchType;
    private int mSelectedTab;
    private Presenter mShelfPresenter;
    private View mTabBar;
    private int mTabBarHeight;

    public SearchResultPresenter(Context context, String s, String s1, int i)
    {
        mInStoreSearchEnabled = false;
        mContext = context;
        mQuery = s;
        mDept = s1;
        mSelectedTab = i;
    }

    private void populateInStoreTabButton()
    {
        TextView textview = (TextView)ViewUtil.findViewById(mInStoreButton, 0x7f100534);
        TextView textview1 = (TextView)ViewUtil.findViewById(mInStoreButton, 0x7f100533);
        StoreInfo storeinfo = SharedPreferencesUtil.getSavedLocalAdStore(mContext);
        StoreModeEvent storemodeevent = WalmartStoreModeManager.create(mContext).getStoreModeEvent();
        List list = StoreLocationManager.getInstance(mContext).getNearbyByStores();
        Object obj1 = null;
        Object obj = obj1;
        if (storemodeevent != null)
        {
            obj = obj1;
            if (storemodeevent.isInStore())
            {
                obj = storemodeevent.getStoreData();
            }
        }
        if (obj != null)
        {
            obj = ((StoreData) (obj)).getCity();
            textview.setVisibility(0);
            textview.setText(((CharSequence) (obj)));
            textview1.setText(mContext.getString(0x7f090548));
            return;
        }
        if (storeinfo != null)
        {
            String s = storeinfo.getCity();
            textview.setVisibility(0);
            textview.setText(s);
            textview1.setText(0x7f090549);
            return;
        }
        if (!list.isEmpty())
        {
            StoreData storedata = (StoreData)list.get(0);
            textview.setVisibility(0);
            textview.setText(storedata.getCity());
            textview1.setText(0x7f090547);
            return;
        } else
        {
            textview.setVisibility(8);
            textview1.setText(mContext.getString(0x7f090546));
            return;
        }
    }

    public Presenter createChildPresenter(int i)
    {
        if (i == 0)
        {
            if (mShelfPresenter == null)
            {
                ShelfListPresenter shelflistpresenter = new ShelfListPresenter((Activity)mContext, mQuery, mDept);
                if (mInStoreSearchEnabled)
                {
                    shelflistpresenter.setScrollDirectionListener(new TabBarHider(mContext));
                    shelflistpresenter.setHeaderView(0x7f040046);
                }
                mShelfPresenter = shelflistpresenter;
            }
            return mShelfPresenter;
        }
        if (mInStoreListPresenter == null)
        {
            mInStoreListPresenter = new InStoreListPresenter((Activity)mContext, mQuery);
            mInStoreListPresenter.setSearchType(mSearchType);
            mInStoreListPresenter.setHeaderView(0x7f040046);
            mInStoreListPresenter.setScrollDirectionListener(new TabBarHider(mContext));
        }
        return mInStoreListPresenter;
    }

    public int getChildPresenterCount()
    {
        return 2;
    }

    public ViewGroup getContainerView()
    {
        return mSearchListContainer;
    }

    public String getTitleText()
    {
        return mContext.getString(0x7f090543);
    }

    public View getView()
    {
        return mRootContainer;
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        if (!mInStoreSearchEnabled)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        if (mSelectedTab != 0) goto _L2; else goto _L1
_L1:
        toggleOnline();
_L4:
        return;
_L2:
        if (mSelectedTab != 1) goto _L4; else goto _L3
_L3:
        toggleInStore();
        return;
        mTabBar.setVisibility(8);
        switchToPresenter(0);
        return;
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootContainer == null)
        {
            AppConfig appconfig = AppConfigManager.get().getAppConfig();
            if (appconfig != null)
            {
                boolean flag;
                if (!appconfig.inStoreSearchOn)
                {
                    flag = false;
                } else
                {
                    flag = true;
                }
                mInStoreSearchEnabled = flag;
            }
            mRootContainer = (ViewGroup)ViewUtil.inflate(mContext, 0x7f04017f, viewgroup);
            mTabBarHeight = mRootContainer.findViewById(0x7f100530).getLayoutParams().height;
            mOnlineButton = mRootContainer.findViewById(0x7f100531);
            mInStoreButton = mRootContainer.findViewById(0x7f100532);
            mSearchListContainer = (ViewGroup)mRootContainer.findViewById(0x7f10052f);
            mTabBar = mRootContainer.findViewById(0x7f100530);
            mOnlineButton.setOnClickListener(new android.view.View.OnClickListener() {

                final SearchResultPresenter this$0;

                public void onClick(View view)
                {
                    if (getSelectedPresenterPosition() != 0)
                    {
                        AnalyticsHelper.post(AnalyticsHelper.prepareSearchResultsPageViewEvent());
                    }
                    toggleOnline();
                }

            
            {
                this$0 = SearchResultPresenter.this;
                super();
            }
            });
            mInStoreButton.setOnClickListener(new android.view.View.OnClickListener() {

                final SearchResultPresenter this$0;

                public void onClick(View view)
                {
                    toggleInStore();
                }

            
            {
                this$0 = SearchResultPresenter.this;
                super();
            }
            });
        }
    }

    protected void onPageView()
    {
        boolean flag = true;
        if (!recentlyPushed())
        {
            int i = getSelectedPresenterPosition();
            if (i == 0 || i == 1)
            {
                flag = false;
            }
            if (i == 0 || flag && mSelectedTab == 0)
            {
                AnalyticsHelper.post(AnalyticsHelper.prepareSearchResultsPageViewEvent());
            }
        }
    }

    public void onResumeAsTop()
    {
        super.onResumeAsTop();
        if (mInStoreSearchEnabled)
        {
            populateInStoreTabButton();
        }
    }

    public void setOnTabSelectedListener(OnTabSelectedListener ontabselectedlistener)
    {
        mOnTabSelectedListener = ontabselectedlistener;
    }

    public void setSearchType(com.walmart.android.search.SearchData.SearchType searchtype)
    {
        mSearchType = searchtype;
    }

    public void toggleInStore()
    {
        if (getSelectedPresenterPosition() != 1)
        {
            mOnlineButton.setSelected(false);
            mInStoreButton.setSelected(true);
            switchToPresenter(1);
            if (mOnTabSelectedListener != null)
            {
                mOnTabSelectedListener.onTabSelected(1);
            }
        }
    }

    public void toggleOnline()
    {
        if (getSelectedPresenterPosition() != 0)
        {
            mOnlineButton.setSelected(true);
            mInStoreButton.setSelected(false);
            switchToPresenter(0);
            if (mShelfPresenter != null)
            {
                mShelfPresenter.onStartAsTop();
            }
            if (mOnTabSelectedListener != null)
            {
                mOnTabSelectedListener.onTabSelected(0);
            }
        }
    }



}
