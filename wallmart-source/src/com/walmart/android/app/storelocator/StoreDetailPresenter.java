// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.storelocator;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.config.WalmartStoreConfigurator;
import com.walmart.android.data.StoreInfo;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.HourGroupUtil;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.utils.CapabilityUtils;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.utils.WLog;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.walmart.android.app.storelocator:
//            MapFragment, MapReadyEvent

public class StoreDetailPresenter extends Presenter
{
    public static interface OnShowLocalAdListener
    {

        public abstract void onShowLocalAd();
    }


    private static final String OPEN_24_HOURS = "Open 24 hours";
    private static final String S2S_DEPARTMENT_NAME = "Site to StoreSM";
    public static final String TAG = com/walmart/android/app/storelocator/StoreDetailPresenter.getSimpleName();
    private final Activity mActivity;
    private TextView mAddressLine1Text;
    private TextView mAddressLine2Text;
    private boolean mCanMakeCall;
    private WalmartStore mCurrentStore;
    private boolean mIsMyStore;
    private boolean mIsOpen24;
    private SupportMapFragment mMapFragment;
    private OnShowLocalAdListener mOnShowLocalAdListener;
    private TextView mPhoneText;
    private boolean mShowLocalAd;
    private boolean mShowMap;
    private View mStoreDetailView;
    private TextView mStoreIdText;
    private TextView mStoreTypeText;

    public StoreDetailPresenter(Activity activity, WalmartStore walmartstore)
    {
        mCurrentStore = null;
        mShowLocalAd = true;
        mActivity = activity;
        mCurrentStore = walmartstore;
        setTitleText(mActivity.getString(0x7f090591));
    }

    private boolean canShowMap()
    {
        boolean flag1 = false;
        Object obj = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0"));
        obj = mActivity.getPackageManager().queryIntentActivities(((Intent) (obj)), 0);
        boolean flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (!((List) (obj)).isEmpty())
            {
                flag = true;
            }
        }
        return flag;
    }

    private String getDepartmentName(com.walmart.android.data.WalmartStore.StoreService storeservice)
    {
        return Html.fromHtml(storeservice.getName(), null, null).toString();
    }

    private boolean hasNavigation()
    {
        boolean flag1 = false;
        Object obj = new Intent("android.intent.action.VIEW", Uri.parse("google.navigation:q=0,0;0,0"));
        obj = mActivity.getPackageManager().queryIntentActivities(((Intent) (obj)), 0);
        boolean flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (!((List) (obj)).isEmpty())
            {
                flag = true;
            }
        }
        return flag;
    }

    private boolean isMyStore()
    {
        StoreInfo storeinfo = SharedPreferencesUtil.getSavedLocalAdStore(mActivity);
        return storeinfo != null && storeinfo.storeID.equals(mCurrentStore.getId());
    }

    private boolean isOpen24Hours(com.walmart.android.data.WalmartStore.StoreService astoreservice[])
    {
        boolean flag1 = false;
        int j = astoreservice.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    String s = astoreservice[i].getName();
                    if (s == null || !s.startsWith("Open 24 hours"))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    private void launchMaps()
    {
        Object obj = mCurrentStore.getAddress();
        obj = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("geo:0,0?q=walmart, ").append(((com.walmart.android.data.WalmartStore.Address) (obj)).getStreet1()).append(", ").append(((com.walmart.android.data.WalmartStore.Address) (obj)).getCity()).append(",").append(((com.walmart.android.data.WalmartStore.Address) (obj)).getState()).toString()));
        if (((Intent) (obj)).resolveActivity(mActivity.getPackageManager()) != null)
        {
            mActivity.startActivity(((Intent) (obj)));
            GoogleAnalytics.trackEvent("Store Details", "Map", mCurrentStore.getId());
        }
    }

    private void populateDepartments(com.walmart.android.data.WalmartStore.StoreService astoreservice[])
    {
        LayoutInflater layoutinflater = mActivity.getLayoutInflater();
        ViewGroup viewgroup = (ViewGroup)mStoreDetailView.findViewById(0x7f1005a0);
        int i = 0;
        do
        {
            if (i >= astoreservice.length)
            {
                break;
            }
            final String phoneNumber = astoreservice[i];
            String s = getDepartmentName(phoneNumber).trim();
            if (shouldBeDisplayed(phoneNumber) && !"Open 24 hours".equals(s))
            {
                final String departmentNameTextString = s;
                if ("Site to StoreSM".equals(s))
                {
                    departmentNameTextString = mActivity.getString(0x7f09058f);
                    ViewUtil.findViewById(mStoreDetailView, 0x7f1005a2).setVisibility(0);
                }
                com.walmart.android.data.WalmartStore.HoursOfOperation ahoursofoperation[] = phoneNumber.getHoursOfOperation();
                ViewGroup viewgroup1 = (ViewGroup)layoutinflater.inflate(0x7f0401a0, viewgroup, false);
                View view = viewgroup1.findViewById(0x7f100599);
                TextView textview = (TextView)viewgroup1.findViewById(0x7f100598);
                phoneNumber = phoneNumber.getPhone();
                if (TextUtils.isEmpty(phoneNumber))
                {
                    view.setVisibility(8);
                    textview.setVisibility(8);
                    viewgroup1.setClickable(false);
                } else
                {
                    textview.setText(phoneNumber);
                    if (mCanMakeCall)
                    {
                        viewgroup1.setOnClickListener(new android.view.View.OnClickListener() {

                            final StoreDetailPresenter this$0;
                            final String val$departmentNameTextString;
                            final String val$phoneNumber;

                            public void onClick(View view1)
                            {
                                view1 = new Intent("android.intent.action.DIAL", Uri.parse((new StringBuilder()).append("tel:").append(phoneNumber).toString()));
                                if (view1.resolveActivity(mActivity.getPackageManager()) != null)
                                {
                                    mActivity.startActivity(view1);
                                    GoogleAnalytics.trackEvent("Store Details", String.format(Locale.US, "Call %s", new Object[] {
                                        departmentNameTextString
                                    }), mCurrentStore.getId());
                                    trackSection("callDepartment");
                                }
                            }

            
            {
                this$0 = StoreDetailPresenter.this;
                phoneNumber = s;
                departmentNameTextString = s1;
                super();
            }
                        });
                    } else
                    {
                        viewgroup1.setClickable(false);
                        view.setVisibility(8);
                    }
                }
                HourGroupUtil.populateHoursFields((ViewGroup)viewgroup1.findViewById(0x7f10059a), ahoursofoperation);
                ((TextView)viewgroup1.findViewById(0x7f100597)).setText(departmentNameTextString);
                viewgroup.addView(viewgroup1);
            }
            i++;
        } while (true);
    }

    private void populateStoreAddress()
    {
label0:
        {
            View view;
label1:
            {
                if (mMapFragment == null)
                {
                    view = ViewUtil.findViewById(mStoreDetailView, 0x7f10059b);
                    if (view == null)
                    {
                        break label0;
                    }
                    mAddressLine1Text.setVisibility(8);
                    mAddressLine2Text.setVisibility(8);
                    mAddressLine1Text = (TextView)mStoreDetailView.findViewById(0x7f10059d);
                    mAddressLine2Text = (TextView)mStoreDetailView.findViewById(0x7f10059e);
                    if (!mShowMap)
                    {
                        break label1;
                    }
                    view.setOnClickListener(new android.view.View.OnClickListener() {

                        final StoreDetailPresenter this$0;

                        public void onClick(View view1)
                        {
                            launchMaps();
                        }

            
            {
                this$0 = StoreDetailPresenter.this;
                super();
            }
                    });
                }
                return;
            }
            view.setEnabled(false);
            return;
        }
        Log.e(TAG, "Address container == null. Should not happen. ");
    }

    private void populateWidgets()
    {
        mStoreTypeText.setText(mCurrentStore.getDescription());
        mStoreIdText.setText(mActivity.getString(0x7f090590, new Object[] {
            mCurrentStore.getId()
        }));
        Object obj = (CheckBox)ViewUtil.findViewById(ViewUtil.findViewById(mStoreDetailView, 0x7f1005b0), 0x7f10005b);
        if (mIsMyStore)
        {
            ((CheckBox) (obj)).setChecked(true);
        }
        populateStoreAddress();
        obj = mCurrentStore.getPhone();
        String as[];
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            mPhoneText.setText(((CharSequence) (obj)));
            if (!mCanMakeCall)
            {
                mStoreDetailView.findViewById(0x7f1005ac).setVisibility(8);
            }
        } else
        {
            mStoreDetailView.findViewById(0x7f1005aa).setVisibility(8);
            mStoreDetailView.findViewById(0x7f1005ad).setVisibility(8);
        }
        as = WalmartStore.getAddressLines(mCurrentStore.getAddress());
        mAddressLine1Text.setText(as[0]);
        mAddressLine2Text.setText(as[1]);
        as = (ViewGroup)mStoreDetailView.findViewById(0x7f1005b2);
        if (mIsOpen24)
        {
            as.setVisibility(8);
            mStoreDetailView.findViewById(0x7f1005b1).setVisibility(0);
        } else
        {
            HourGroupUtil.populateHoursFields(as, mCurrentStore.getHoursOfOperation());
        }
        populateDepartments(mCurrentStore.getStoreServices());
        wireListeners();
    }

    private void setWidgets()
    {
        mStoreTypeText = (TextView)mStoreDetailView.findViewById(0x7f1005a1);
        mStoreIdText = (TextView)mStoreDetailView.findViewById(0x7f1005a3);
        mPhoneText = (TextView)mStoreDetailView.findViewById(0x7f1005ab);
        mAddressLine1Text = (TextView)mStoreDetailView.findViewById(0x7f1005a6);
        mAddressLine2Text = (TextView)mStoreDetailView.findViewById(0x7f1005a7);
        if (mMapFragment == null && ViewUtil.findViewById(mStoreDetailView, 0x7f10059f) != null)
        {
            mMapFragment = MapFragment.newInstance();
            ((FragmentActivity)mActivity).getSupportFragmentManager().beginTransaction().add(0x7f10059f, mMapFragment).commit();
        }
    }

    private boolean shouldBeDisplayed(com.walmart.android.data.WalmartStore.StoreService storeservice)
    {
        boolean flag1 = false;
        String as[] = WalmartStoreConfigurator.SERVICE_FILTER_ARRAY;
        int j = as.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!storeservice.matches(as[i]))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    private void trackSection(String s)
    {
        s = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("storeDetailsSections")).putString("sectionId", s);
        MessageBus.getBus().post(s);
    }

    private void updateMapMarker()
    {
        if (mMapFragment != null)
        {
            GoogleMap googlemap = mMapFragment.getMap();
            if (googlemap != null)
            {
                googlemap.clear();
                LatLng latlng;
                int i;
                if (mIsMyStore)
                {
                    i = 0x7f0201e6;
                } else
                {
                    i = 0x7f0201e5;
                }
                latlng = new LatLng(mCurrentStore.getLatitude(), mCurrentStore.getLongitude());
                googlemap.addMarker((new MarkerOptions()).position(latlng).icon(BitmapDescriptorFactory.fromResource(i)));
            }
        }
    }

    private void wireListeners()
    {
        Object obj = mStoreDetailView.findViewById(0x7f1005aa);
        if (mCanMakeCall)
        {
            ((View) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

                final StoreDetailPresenter this$0;

                public void onClick(View view1)
                {
                    view1 = mCurrentStore.getPhone();
                    view1 = new Intent("android.intent.action.DIAL", Uri.parse((new StringBuilder()).append("tel:").append(view1).toString()));
                    if (view1.resolveActivity(mActivity.getPackageManager()) != null)
                    {
                        mActivity.startActivity(view1);
                        GoogleAnalytics.trackEvent("Store Details", "Call Store", mCurrentStore.getId());
                        trackSection("callStore");
                    }
                }

            
            {
                this$0 = StoreDetailPresenter.this;
                super();
            }
            });
        }
        obj = mStoreDetailView.findViewById(0x7f1005a4);
        View view;
        if (hasNavigation())
        {
            ((View) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

                final StoreDetailPresenter this$0;

                public void onClick(View view1)
                {
                    view1 = mCurrentStore.getAddress();
                    view1 = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("google.navigation:q=").append(view1.getStreet1()).append(", ").append(view1.getCity()).append(",").append(view1.getState()).toString()));
                    try
                    {
                        mActivity.startActivity(view1);
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view1)
                    {
                        WLog.w(StoreDetailPresenter.TAG, "Failed to launch navigation");
                    }
                    trackSection("getDirections");
                }

            
            {
                this$0 = StoreDetailPresenter.this;
                super();
            }
            });
        } else
        {
            ((View) (obj)).setEnabled(false);
        }
        obj = mStoreDetailView.findViewById(0x7f1005ae);
        if (mShowLocalAd)
        {
            ((View) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

                final StoreDetailPresenter this$0;

                public void onClick(View view1)
                {
                    if (mOnShowLocalAdListener != null)
                    {
                        mOnShowLocalAdListener.onShowLocalAd();
                    } else
                    {
                        view1 = new Bundle();
                        view1.putString("store_id", mCurrentStore.getId());
                        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.LOCAL_AD, view1, true));
                        GoogleAnalytics.trackEvent("Store Details", "Local Ad", mCurrentStore.getId());
                    }
                    trackSection("weeklyAd");
                }

            
            {
                this$0 = StoreDetailPresenter.this;
                super();
            }
            });
        } else
        {
            ((View) (obj)).setVisibility(8);
        }
        obj = new android.view.View.OnClickListener() {

            final StoreDetailPresenter this$0;

            public void onClick(View view1)
            {
                ((CheckBox)ViewUtil.findViewById(view1, 0x7f10005b)).toggle();
            }

            
            {
                this$0 = StoreDetailPresenter.this;
                super();
            }
        };
        view = ViewUtil.findViewById(mStoreDetailView, 0x7f1005b0);
        view.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        ((CheckBox)ViewUtil.findViewById(view, 0x7f10005b)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final StoreDetailPresenter this$0;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                mIsMyStore = flag;
                if (flag)
                {
                    MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("makeMyStore")).putString("storeId", mCurrentStore.getId()).putString("tapLocation", "store details"));
                    SharedPreferencesUtil.saveLocalAdStore(mActivity, mCurrentStore);
                    GoogleAnalytics.trackEvent("Store Details", "Make My Store", mCurrentStore.getId());
                } else
                {
                    SharedPreferencesUtil.clearStoreInfo(mActivity);
                }
                updateMapMarker();
                trackSection("setAsMyStore");
            }

            
            {
                this$0 = StoreDetailPresenter.this;
                super();
            }
        });
    }

    public int getType()
    {
        return 100;
    }

    public View getView()
    {
        return mStoreDetailView;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        if (mMapFragment != null)
        {
            FragmentManager fragmentmanager = ((FragmentActivity)mActivity).getSupportFragmentManager();
            try
            {
                fragmentmanager.beginTransaction().remove(mMapFragment).commit();
            }
            catch (IllegalStateException illegalstateexception)
            {
                Log.e(TAG, "Caught IllegalStateException while removing map fragment probably due to popping after activity getting paused.", illegalstateexception);
            }
            mMapFragment = null;
        }
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        if (mCurrentStore != null)
        {
            mIsOpen24 = isOpen24Hours(mCurrentStore.getStoreServices());
            mShowMap = canShowMap();
            mCanMakeCall = CapabilityUtils.canMakeCalls(mActivity);
            mIsMyStore = isMyStore();
            setWidgets();
            populateWidgets();
            MessageBus.getBus().register(this);
        }
        GoogleAnalytics.trackEvent("Store Details", "Views", mCurrentStore.getId());
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        super.onCreateView(viewgroup);
        if (mStoreDetailView == null)
        {
            mStoreDetailView = ViewUtil.inflate(mActivity, 0x7f0401a2, viewgroup);
        }
    }

    public void onMapReadyEvent(MapReadyEvent mapreadyevent)
    {
        WLog.d(TAG, "onMapReadyEvent");
        if (mMapFragment != null)
        {
            mapreadyevent = mMapFragment.getMap();
            if (mapreadyevent != null)
            {
                Object obj = mapreadyevent.getUiSettings();
                ((UiSettings) (obj)).setAllGesturesEnabled(false);
                ((UiSettings) (obj)).setZoomControlsEnabled(false);
                ((UiSettings) (obj)).setMyLocationButtonEnabled(false);
                ((UiSettings) (obj)).setMapToolbarEnabled(false);
                obj = new LatLng(mCurrentStore.getLatitude(), mCurrentStore.getLongitude());
                updateMapMarker();
                mapreadyevent.setOnMapClickListener(new com.google.android.gms.maps.GoogleMap.OnMapClickListener() {

                    final StoreDetailPresenter this$0;

                    public void onMapClick(LatLng latlng)
                    {
                        launchMaps();
                        trackSection("map");
                    }

            
            {
                this$0 = StoreDetailPresenter.this;
                super();
            }
                });
                mapreadyevent.moveCamera(CameraUpdateFactory.newLatLngZoom(((LatLng) (obj)), 14F));
            }
        }
    }

    protected void onPageView()
    {
        super.onPageView();
        GoogleAnalytics.trackPageView("Store Details");
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "store details").putString("section", "store").putString("subCategory", "store").putString("storeId", mCurrentStore.getId());
        MessageBus.getBus().post(builder);
    }

    public void onPop()
    {
        super.onPop();
        try
        {
            MessageBus.getBus().unregister(this);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return;
        }
    }

    public void setOnShowLocalAdListener(OnShowLocalAdListener onshowlocaladlistener)
    {
        mOnShowLocalAdListener = onshowlocaladlistener;
    }

    public void setShowLocalAd(boolean flag)
    {
        mShowLocalAd = flag;
    }








/*
    static boolean access$502(StoreDetailPresenter storedetailpresenter, boolean flag)
    {
        storedetailpresenter.mIsMyStore = flag;
        return flag;
    }

*/

}
