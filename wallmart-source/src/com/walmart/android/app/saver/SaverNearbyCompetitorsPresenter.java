// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.squareup.otto.Bus;
import com.walmart.android.events.SaverSummaryUpdateEvent;
import com.walmart.android.events.SaverViewEvent;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.saver.CompetitorsResponse;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.SaverUtils;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StoreService;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverMerchandiseController

public class SaverNearbyCompetitorsPresenter extends Presenter
{
    public static interface ActionCallbacks
    {

        public abstract void onForceClose();

        public abstract void onGettingResults();

        public abstract void onScanAnother();

        public abstract void onShowMerchandise(String s);

        public abstract void onShowReceipt(String s, String s1, String s2, String s3, boolean flag);
    }

    private static class CompetitorPagerAdapter extends PagerAdapter
    {

        private final Activity mActivity;
        private final List mCompetitors;

        private String fixCompetitorAddress(com.walmart.android.service.saver.CompetitorsResponse.Competitor competitor)
        {
            StringBuilder stringbuilder = new StringBuilder();
            if (!TextUtils.isEmpty(competitor.address))
            {
                stringbuilder.append(competitor.address);
            }
            if (!TextUtils.isEmpty(competitor.city))
            {
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append(", ");
                }
                stringbuilder.append(competitor.city);
            }
            if (!TextUtils.isEmpty(competitor.state) || !TextUtils.isEmpty(competitor.zip))
            {
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append(", ");
                }
                if (!TextUtils.isEmpty(competitor.state))
                {
                    stringbuilder.append(competitor.state);
                }
                if (!TextUtils.isEmpty(competitor.zip))
                {
                    if (!TextUtils.isEmpty(competitor.state))
                    {
                        stringbuilder.append(" ");
                    }
                    stringbuilder.append(competitor.zip);
                }
            }
            return stringbuilder.toString();
        }

        private String fixCompetitorName(String s)
        {
            String s1 = s;
            Object obj = s1;
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_86;
            }
            s = s.split(" ");
            obj = s1;
            if (s.length <= 2)
            {
                break MISSING_BLOCK_LABEL_86;
            }
            int i;
            try
            {
                Integer.parseInt(s[s.length - 1]);
                obj = new StringBuilder();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return s1;
            }
            i = 0;
            if (i >= s.length - 1)
            {
                break; /* Loop/switch isn't completed */
            }
            ((StringBuilder) (obj)).append(s[i]);
            ((StringBuilder) (obj)).append(" ");
            i++;
            if (true) goto _L2; else goto _L1
_L2:
            break MISSING_BLOCK_LABEL_44;
_L1:
            obj = ((StringBuilder) (obj)).toString().trim();
            return ((String) (obj));
        }

        public void destroyItem(ViewGroup viewgroup, int i, Object obj)
        {
            viewgroup.removeView((View)obj);
        }

        public int getCount()
        {
            return mCompetitors.size();
        }

        public Object instantiateItem(ViewGroup viewgroup, int i)
        {
            com.walmart.android.service.saver.CompetitorsResponse.Competitor competitor = (com.walmart.android.service.saver.CompetitorsResponse.Competitor)mCompetitors.get(i);
            ViewGroup viewgroup1 = (ViewGroup)ViewUtil.inflate(mActivity, 0x7f04015c, viewgroup, false);
            ViewUtil.setTextHideIfEmpty(0x7f1004c4, viewgroup1, fixCompetitorName(competitor.name));
            ViewUtil.setTextHideIfEmpty(0x7f1004c5, viewgroup1, fixCompetitorAddress(competitor));
            viewgroup.addView(viewgroup1);
            return viewgroup1;
        }

        public boolean isViewFromObject(View view, Object obj)
        {
            return view == obj;
        }

        public CompetitorPagerAdapter(Activity activity, List list)
        {
            mActivity = activity;
            mCompetitors = list;
        }
    }


    private static final int DIALOG_ERROR_COMPETITORS = 102;
    private static final int DIALOG_ERROR_UNKNOWN = 101;
    private static final float MAP_ZOOM_LEVEL = 15F;
    private static final int REQUEST_CODE_SIGN_IN = 1;
    private static final String TAG = com/walmart/android/app/saver/SaverNearbyCompetitorsPresenter.getSimpleName();
    private final ActionCallbacks mActionCallbacks;
    private final FragmentActivity mActivity;
    private CompetitorPagerAdapter mAdapter;
    private View mCompetitorSection;
    private final android.view.View.OnLayoutChangeListener mCompetitorSectionLayoutListener = new android.view.View.OnLayoutChangeListener() {

        final SaverNearbyCompetitorsPresenter this$0;

        public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
                int k1, int l1)
        {
            if (mMapView != null && view != null)
            {
                android.view.ViewGroup.LayoutParams layoutparams = mMapView.getLayoutParams();
                layoutparams.height = view.getHeight();
                mMapView.setLayoutParams(layoutparams);
            }
            if (view != null)
            {
                view.removeOnLayoutChangeListener(this);
            }
        }

            
            {
                this$0 = SaverNearbyCompetitorsPresenter.this;
                super();
            }
    };
    private boolean mFromScanner;
    private boolean mHasStartedSync;
    private boolean mIsMapViewPaused;
    private double mLat;
    private String mLocalDate;
    private double mLong;
    private MapView mMapView;
    private final SaverMerchandiseController mMerchandiseController;
    private int mOrientation;
    private View mRootView;
    private String mRuid;
    private String mStoreId;
    private String mTcNbr;

    public SaverNearbyCompetitorsPresenter(FragmentActivity fragmentactivity, String s, String s1, String s2, String s3, boolean flag, ActionCallbacks actioncallbacks)
    {
        mOrientation = 0;
        mActivity = fragmentactivity;
        mRuid = s;
        mStoreId = s1;
        mTcNbr = s2;
        mLocalDate = s3;
        mFromScanner = flag;
        setTitleText(mActivity.getString(0x7f0904d7));
        mActionCallbacks = actioncallbacks;
        mMerchandiseController = new SaverMerchandiseController(mActivity, "SavingsCatcherReceiptReceived", "Checking For Matches", new SaverMerchandiseController.MerchandiseSelectedListener() {

            final SaverNearbyCompetitorsPresenter this$0;

            public void onShowMerchandise(String s4)
            {
                mActionCallbacks.onShowMerchandise(s4);
            }

            
            {
                this$0 = SaverNearbyCompetitorsPresenter.this;
                super();
            }
        });
    }

    private void findNearbyCompetitors()
    {
        SaverManager.get().findNearbyCompetitors(mStoreId, new AsyncCallbackOnThread(new Handler()) {

            final SaverNearbyCompetitorsPresenter this$0;

            public void onFailureSameThread(Integer integer, CompetitorsResponse competitorsresponse)
            {
                if (isTop())
                {
                    showDialog(102);
                }
                if (!isPopped())
                {
                    mAdapter = new CompetitorPagerAdapter(mActivity, Collections.emptyList());
                    setupWidgets();
                }
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (CompetitorsResponse)obj1);
            }

            public void onSuccessSameThread(CompetitorsResponse competitorsresponse)
            {
                if (competitorsresponse.payload == null || competitorsresponse.payload.competitors == null || competitorsresponse.payload.competitors.size() == 0)
                {
                    onFailureSameThread(Integer.valueOf(0x15f90), competitorsresponse);
                } else
                if (!isPopped())
                {
                    mAdapter = new CompetitorPagerAdapter(mActivity, competitorsresponse.payload.competitors);
                    setupWidgets();
                    setupMap();
                    return;
                }
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((CompetitorsResponse)obj);
            }

            
            {
                this$0 = SaverNearbyCompetitorsPresenter.this;
                super(handler);
            }
        });
    }

    private void findStoreLocation()
    {
        int i = Integer.parseInt(mStoreId);
        StoreService.getStoreService().getStore(i, new com.walmartlabs.storelocator.StoreService.GetStoresCallback() {

            final SaverNearbyCompetitorsPresenter this$0;

            public void onFailure(int j)
            {
            }

            public void onStoresReceived(StoreData astoredata[])
            {
                if (!isPopped() && astoredata != null && astoredata.length > 0)
                {
                    mLat = astoredata[0].getLatitude();
                    mLong = astoredata[0].getLongitude();
                    setupMap();
                }
            }

            
            {
                this$0 = SaverNearbyCompetitorsPresenter.this;
                super();
            }
        });
    }

    private void setupMap()
    {
        if (mMapView != null && mLat != 0.0D && mLong != 0.0D && GooglePlayServicesUtil.isGooglePlayServicesAvailable(mActivity) == 0)
        {
            GoogleMap googlemap = mMapView.getMap();
            if (googlemap != null)
            {
                googlemap.setMyLocationEnabled(false);
                UiSettings uisettings = googlemap.getUiSettings();
                uisettings.setAllGesturesEnabled(false);
                uisettings.setCompassEnabled(false);
                uisettings.setZoomControlsEnabled(false);
                uisettings.setMapToolbarEnabled(false);
                googlemap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(mLat, mLong), 15F));
                googlemap.setOnMapLoadedCallback(new com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback() {

                    final SaverNearbyCompetitorsPresenter this$0;

                    public void onMapLoaded()
                    {
                        if (mCompetitorSection != null)
                        {
                            mCompetitorSection.setBackgroundColor(mActivity.getResources().getColor(0x7f0f00d2));
                        }
                    }

            
            {
                this$0 = SaverNearbyCompetitorsPresenter.this;
                super();
            }
                });
            }
        }
    }

    private void setupMapSection()
    {
        if (mStoreId != null)
        {
            findNearbyCompetitors();
            findStoreLocation();
            return;
        } else
        {
            mAdapter = new CompetitorPagerAdapter(mActivity, Collections.emptyList());
            setupWidgets();
            return;
        }
    }

    private void setupWidgets()
    {
        if (mAdapter == null)
        {
            return;
        }
        final ViewPager pager;
        final View prev;
        final View next;
        if (!mFromScanner)
        {
            ViewUtil.findViewById(mRootView, 0x7f1004c2).setVisibility(8);
        } else
        {
            ViewUtil.findViewById(mRootView, 0x7f1004c2).setOnClickListener(new android.view.View.OnClickListener() {

                final SaverNearbyCompetitorsPresenter this$0;

                public void onClick(View view1)
                {
                    mActionCallbacks.onScanAnother();
                }

            
            {
                this$0 = SaverNearbyCompetitorsPresenter.this;
                super();
            }
            });
        }
        if (mRuid != null || mTcNbr != null)
        {
            ViewUtil.findViewById(mRootView, 0x7f1004c1).setOnClickListener(new android.view.View.OnClickListener() {

                final SaverNearbyCompetitorsPresenter this$0;

                public void onClick(View view1)
                {
                    mActionCallbacks.onShowReceipt(mRuid, mTcNbr, mLocalDate, mStoreId, mHasStartedSync);
                }

            
            {
                this$0 = SaverNearbyCompetitorsPresenter.this;
                super();
            }
            });
        } else
        {
            ViewUtil.findViewById(mRootView, 0x7f1004c1).setVisibility(8);
        }
        if (mStoreId == null) goto _L2; else goto _L1
_L1:
        ViewUtil.setText(0x7f1004c7, mRootView, String.valueOf(mAdapter.getCount()));
        ViewUtil.setText(0x7f1004c8, mRootView, mActivity.getResources().getQuantityText(0x7f11000a, mAdapter.getCount()));
        pager = (ViewPager)ViewUtil.findViewById(mRootView, 0x7f1004ca);
        pager.setAdapter(mAdapter);
        prev = ViewUtil.findViewById(mRootView, 0x7f1004c9);
        prev.setOnClickListener(new android.view.View.OnClickListener() {

            final SaverNearbyCompetitorsPresenter this$0;
            final ViewPager val$pager;

            public void onClick(View view1)
            {
                pager.setCurrentItem(pager.getCurrentItem() - 1);
            }

            
            {
                this$0 = SaverNearbyCompetitorsPresenter.this;
                pager = viewpager;
                super();
            }
        });
        prev.setEnabled(false);
        next = ViewUtil.findViewById(mRootView, 0x7f1004cb);
        next.setOnClickListener(new android.view.View.OnClickListener() {

            final SaverNearbyCompetitorsPresenter this$0;
            final ViewPager val$pager;

            public void onClick(View view1)
            {
                pager.setCurrentItem(pager.getCurrentItem() + 1);
            }

            
            {
                this$0 = SaverNearbyCompetitorsPresenter.this;
                pager = viewpager;
                super();
            }
        });
        pager.setOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final SaverNearbyCompetitorsPresenter this$0;
            final View val$next;
            final ViewPager val$pager;
            final View val$prev;

            public void onPageScrollStateChanged(int i)
            {
            }

            public void onPageScrolled(int i, float f, int j)
            {
            }

            public void onPageSelected(int i)
            {
                if (i <= 0)
                {
                    prev.setEnabled(false);
                } else
                {
                    prev.setEnabled(true);
                }
                if (i >= pager.getAdapter().getCount() - 1)
                {
                    next.setEnabled(false);
                    return;
                } else
                {
                    next.setEnabled(true);
                    return;
                }
            }

            
            {
                this$0 = SaverNearbyCompetitorsPresenter.this;
                prev = view;
                pager = viewpager;
                next = view1;
                super();
            }
        });
_L4:
        ViewUtil.findViewById(mRootView, 0x7f1004c0).setOnClickListener(new OnSingleClickListener(this) {

            final SaverNearbyCompetitorsPresenter this$0;

            public void onSingleClick(View view1)
            {
                mActionCallbacks.onGettingResults();
            }

            
            {
                this$0 = SaverNearbyCompetitorsPresenter.this;
                super(presenter);
            }
        });
        ViewUtil.findViewById(mRootView, 0x7f10010f).setVisibility(8);
        return;
_L2:
        View view = ViewUtil.findViewById(mRootView, 0x7f1004bf);
        if (view != null)
        {
            view.setVisibility(8);
        } else
        {
            if (mCompetitorSection != null)
            {
                mCompetitorSection.setVisibility(8);
            }
            if (mMapView != null)
            {
                mMapView.setVisibility(8);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void updateRemainingReceipts(com.walmart.android.service.saver.ReceiptsSummaryResponse.OverallSavingsSummary overallsavingssummary)
    {
        if (overallsavingssummary != null)
        {
            overallsavingssummary = mActivity.getResources().getQuantityString(0x7f11000b, overallsavingssummary.tcLeftCount, new Object[] {
                Integer.valueOf(overallsavingssummary.tcLeftCount)
            });
            ViewUtil.setText(0x7f1004c3, mRootView, overallsavingssummary);
            ViewUtil.findViewById(mRootView, 0x7f1004c3).setVisibility(0);
            return;
        } else
        {
            ViewUtil.findViewById(mRootView, 0x7f1004c3).setVisibility(4);
            return;
        }
    }

    public View getView()
    {
        return mRootView;
    }

    public void onActivityResultAsTop(int i, int j, Intent intent)
    {
label0:
        {
            super.onActivityResultAsTop(i, j, intent);
            if (i == 1)
            {
                if (j == 1)
                {
                    break label0;
                }
                mActionCallbacks.onForceClose();
            }
            return;
        }
        setupMapSection();
        syncReceipts();
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        MessageBus.getBus().register(this);
        Services.get().getAuthentication().renewSession(new com.walmart.android.wmservice.Authentication.AuthCallback() {

            final SaverNearbyCompetitorsPresenter this$0;

            public void onFailure(int i)
            {
label0:
                {
                    if (isTop())
                    {
                        if (4 != i)
                        {
                            break label0;
                        }
                        mActivity.startActivityForResult(SaverUtils.createSignInIntent(mActivity), 1);
                        mActivity.overridePendingTransition(0x7f05002c, 0x7f050033);
                    }
                    return;
                }
                showDialog(101);
            }

            public void onSuccess()
            {
                if (!isPopped())
                {
                    setupMapSection();
                    syncReceipts();
                    mMerchandiseController.loadMerchandise();
                }
            }

            
            {
                this$0 = SaverNearbyCompetitorsPresenter.this;
                super();
            }
        });
    }

    protected Dialog onCreateDialog(int i)
    {
        i;
        JVM INSTR tableswitch 101 102: default 24
    //                   101 32
    //                   102 79;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_79;
_L1:
        Object obj = null;
_L4:
        if (obj != null)
        {
            return ((Dialog) (obj));
        } else
        {
            return super.onCreateDialog(i);
        }
_L2:
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(0x7f0904a8).setCancelable(true).setPositiveButton(0x7f090292, null).create();
        ((Dialog) (obj)).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final SaverNearbyCompetitorsPresenter this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
                mActionCallbacks.onForceClose();
            }

            
            {
                this$0 = SaverNearbyCompetitorsPresenter.this;
                super();
            }
        });
          goto _L4
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(0x7f0904a8).setCancelable(true).setPositiveButton(0x7f090292, null).create();
          goto _L4
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        super.onCreateView(viewgroup);
        int i = mActivity.getResources().getConfiguration().orientation;
        if (mRootView == null || mOrientation != i)
        {
            mRootView = ViewUtil.inflate(mActivity, 0x7f04015b, viewgroup, false);
            mMapView = (MapView)ViewUtil.findViewById(mRootView, 0x7f1004cc);
            if (mMapView != null)
            {
                MapsInitializer.initialize(mActivity);
                mMapView.onCreate(null);
                if (mOrientation != i)
                {
                    mMapView.onResume();
                    mIsMapViewPaused = false;
                }
            }
            mCompetitorSection = ViewUtil.findViewById(mRootView, 0x7f1004c6);
            if (mCompetitorSection != null)
            {
                mCompetitorSection.addOnLayoutChangeListener(mCompetitorSectionLayoutListener);
            }
            mMerchandiseController.updateViews(this, mRootView);
            mOrientation = i;
            setupWidgets();
            setupMap();
        }
    }

    protected void onPageView()
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Checking For Matches").putString("section", "Saver").putString("subCategory", "Receipt");
        MessageBus.getBus().post(builder);
        MessageBus.getBus().post(new SaverViewEvent());
        mMerchandiseController.pageViewed();
    }

    public void onPauseAsTop()
    {
        super.onPauseAsTop();
        if (mMapView != null)
        {
            mMapView.onPause();
            mIsMapViewPaused = true;
        }
    }

    public void onPop()
    {
        super.onPop();
        if (mMapView != null)
        {
            if (!mIsMapViewPaused)
            {
                mMapView.onPause();
                mIsMapViewPaused = true;
            }
            mMapView.onDestroy();
        }
        MessageBus.getBus().unregister(this);
    }

    public void onResumeAsTop()
    {
        super.onResumeAsTop();
        if (mMapView != null)
        {
            mMapView.onResume();
            mIsMapViewPaused = false;
        }
    }

    public void onSaverSummaryUpdateEvent(SaverSummaryUpdateEvent saversummaryupdateevent)
    {
        if (mHasStartedSync)
        {
            updateRemainingReceipts(saversummaryupdateevent.mOverallSavingsSummary);
        }
    }

    protected void syncReceipts()
    {
        if (mHasStartedSync)
        {
            return;
        } else
        {
            SaverManager.get().syncAll(false);
            mHasStartedSync = true;
            return;
        }
    }








/*
    static CompetitorPagerAdapter access$1302(SaverNearbyCompetitorsPresenter savernearbycompetitorspresenter, CompetitorPagerAdapter competitorpageradapter)
    {
        savernearbycompetitorspresenter.mAdapter = competitorpageradapter;
        return competitorpageradapter;
    }

*/




/*
    static double access$1602(SaverNearbyCompetitorsPresenter savernearbycompetitorspresenter, double d)
    {
        savernearbycompetitorspresenter.mLat = d;
        return d;
    }

*/


/*
    static double access$1702(SaverNearbyCompetitorsPresenter savernearbycompetitorspresenter, double d)
    {
        savernearbycompetitorspresenter.mLong = d;
        return d;
    }

*/








}
