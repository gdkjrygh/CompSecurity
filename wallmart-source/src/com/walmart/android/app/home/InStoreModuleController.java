// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.home;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.app.fastpickup.FastPickupUtil;
import com.walmart.android.app.fastpickup.FastPickupViewEvent;
import com.walmart.android.app.main.HomeActivity;
import com.walmart.android.app.storelocator.LocationUtil;
import com.walmart.android.events.FastPickupOrderReadyEvent;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.ScannerUtil;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.fastpickup.FastPickupManager;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import com.walmartlabs.msco.service.StoreModeEvent;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.utils.WLog;

public class InStoreModuleController
{

    private static final String TAG = com/walmart/android/app/home/InStoreModuleController.getSimpleName();
    private final Context mContext;
    private final View mEnableLocationMessage;
    private FastPickupOrderReadyEvent mFastPickupOrderEvent;
    private final ViewGroup mInStoreModuleGroup;
    private final View mOutOfStoreModule;
    private final View mPhonePaddingView;
    private TextView mStoreAddressTextView;
    private StoreModeEvent mStoreModeEvent;
    private final View mTabletPaddingView;

    public InStoreModuleController(Context context, View view)
    {
        mContext = context;
        mInStoreModuleGroup = (ViewGroup)ViewUtil.findViewById(view, 0x7f100163);
        mEnableLocationMessage = ViewUtil.findViewById(view, 0x7f100161);
        mOutOfStoreModule = ViewUtil.findViewById(view, 0x7f100162);
        mPhonePaddingView = ViewUtil.findViewById(view, 0x7f100164);
        mTabletPaddingView = ViewUtil.findViewById(view, 0x7f100166);
    }

    private void launchLocationSettings()
    {
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        try
        {
            mContext.startActivity(intent);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            WLog.w(TAG, "Location Services Setting activity not Found");
        }
    }

    private boolean refreshFastPickup(View view)
    {
        View view1 = view.findViewById(0x7f100177);
        boolean flag = false;
        if (mFastPickupOrderEvent != null && mFastPickupOrderEvent.orderAvailable())
        {
            WLog.d(TAG, "fast pickup visible");
            view1.setVisibility(0);
            view = (TextView)ViewUtil.findViewById(view, 0x7f10019d);
            if (mFastPickupOrderEvent.isCheckedIn(mFastPickupOrderEvent.storeId))
            {
                view.setText(0x7f090160);
            } else
            {
                view.setText(0x7f09015f);
            }
            flag = true;
        } else
        {
            WLog.d(TAG, "fast pickup gone storeId:");
            view1.setVisibility(8);
        }
        MessageBus.getBus().post(new FastPickupViewEvent(flag));
        return flag;
    }

    private void setupBasicAction(int i, int j, int k, android.view.View.OnClickListener onclicklistener)
    {
        View view = ViewUtil.findViewById(mInStoreModuleGroup, i);
        view.setOnClickListener(onclicklistener);
        ViewUtil.setText(0x7f10019a, view, k);
        ((ImageView)view.findViewById(0x7f100199)).setImageResource(j);
    }

    private void trackHomescreenSection(String s)
    {
        s = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("section")).putString("sectionId", s);
        MessageBus.getBus().post(s);
    }

    private void wireListeners()
    {
        android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

            final InStoreModuleController this$0;

            public void onClick(View view)
            {
                switch (view.getId())
                {
                default:
                    return;

                case 2131755361: 
                    launchLocationSettings();
                    trackHomescreenSection("enable location");
                    return;

                case 2131755415: 
                    view = new Intent(mContext, com/walmart/android/app/main/HomeActivity);
                    view.setAction("android.intent.action.SEARCH");
                    view.setData(Uri.parse("scanner"));
                    mContext.startActivity(view);
                    trackHomescreenSection("scan for price");
                    return;

                case 2131755414: 
                    view = new Intent(mContext, com/walmart/android/app/main/HomeActivity);
                    view.setAction("android.intent.action.SEARCH");
                    mContext.startActivity(view);
                    trackHomescreenSection("search this store");
                    return;

                case 2131755416: 
                    view = new Bundle();
                    view.putString("store_id", mStoreModeEvent.getStoreId());
                    MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.LOCAL_AD, view, true));
                    trackHomescreenSection("weekly ad");
                    return;

                case 2131755383: 
                    Services.get().getFastPickupManager().refresh(true);
                    MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.FAST_PICKUP, null, false));
                    trackHomescreenSection("express pickup");
                    return;
                }
            }

            
            {
                this$0 = InStoreModuleController.this;
                super();
            }
        };
        mEnableLocationMessage.setOnClickListener(onclicklistener);
        setupBasicAction(0x7f100196, 0x7f020169, 0x7f090164, onclicklistener);
        setupBasicAction(0x7f100198, 0x7f02016a, 0x7f090166, onclicklistener);
        if (ScannerUtil.scannerAvailable(mContext))
        {
            setupBasicAction(0x7f100197, 0x7f020167, 0x7f090162, onclicklistener);
        } else
        {
            mInStoreModuleGroup.findViewById(0x7f100197).setVisibility(8);
        }
        mInStoreModuleGroup.findViewById(0x7f100177).setOnClickListener(onclicklistener);
        mOutOfStoreModule.findViewById(0x7f100177).setOnClickListener(onclicklistener);
    }

    public void destroy()
    {
        MessageBus.getBus().unregister(this);
    }

    public void init()
    {
        mStoreAddressTextView = (TextView)ViewUtil.findViewById(mInStoreModuleGroup, 0x7f100193);
        wireListeners();
        MessageBus.getBus().register(this);
    }

    public void onAuthenticationStatusEvent(AuthenticationStatusEvent authenticationstatusevent)
    {
        refresh();
    }

    public void onFastPickupReady(FastPickupOrderReadyEvent fastpickuporderreadyevent)
    {
        WLog.d(TAG, (new StringBuilder()).append("onFastPickupReady :").append(fastpickuporderreadyevent).toString());
        mFastPickupOrderEvent = fastpickuporderreadyevent;
        refresh();
    }

    public void onStoreMode(StoreModeEvent storemodeevent)
    {
        WLog.d(TAG, (new StringBuilder()).append("onStoreMode() ").append(storemodeevent.isInStore()).toString());
        mStoreModeEvent = storemodeevent;
        refresh();
    }

    public void refresh()
    {
        boolean flag1 = false;
        boolean flag = false;
        boolean flag4 = true;
        boolean flag2 = false;
        int i;
        boolean flag3;
        if (mStoreModeEvent != null && mStoreModeEvent.isInStore() && mStoreModeEvent.getStoreData() != null)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        WLog.d(TAG, (new StringBuilder()).append("InStoreModuleController.refresh() - START inStore=").append(flag3).toString());
        if (!LocationUtil.isLocationServicesEnabled(mContext))
        {
            mInStoreModuleGroup.setVisibility(8);
            mEnableLocationMessage.setVisibility(0);
            View view = mOutOfStoreModule;
            if (refreshFastPickup(mOutOfStoreModule) && FastPickupUtil.isUseStorePickup())
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
            i = 1;
            flag3 = flag4;
        } else
        if (flag3)
        {
            StoreData storedata = mStoreModeEvent.getStoreData();
            mStoreAddressTextView.setText(mContext.getString(0x7f090163, new Object[] {
                storedata.getAddressStreetLine(), storedata.getCity(), storedata.getState()
            }));
            mInStoreModuleGroup.setVisibility(0);
            mEnableLocationMessage.setVisibility(8);
            mOutOfStoreModule.setVisibility(8);
            refreshFastPickup(mInStoreModuleGroup);
            flag3 = flag4;
            i = ((flag2) ? 1 : 0);
        } else
        {
            mInStoreModuleGroup.setVisibility(8);
            mEnableLocationMessage.setVisibility(8);
            flag3 = refreshFastPickup(mOutOfStoreModule);
            View view1 = mOutOfStoreModule;
            if (flag3 && FastPickupUtil.isUseStorePickup())
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view1.setVisibility(i);
            i = ((flag2) ? 1 : 0);
        }
        if (mPhonePaddingView != null)
        {
            view = mPhonePaddingView;
            if (flag3)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
        } else
        if (mTabletPaddingView != null)
        {
            View view2 = mTabletPaddingView;
            if (i != 0)
            {
                i = ((flag1) ? 1 : 0);
            } else
            {
                i = 8;
            }
            view2.setVisibility(i);
            return;
        }
    }





}
