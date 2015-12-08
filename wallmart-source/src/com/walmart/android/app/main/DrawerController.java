// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.app.account.AccountActivity;
import com.walmart.android.app.pharmacy.PharmacyActivity;
import com.walmart.android.app.photo.WalmartIntegrationProvider;
import com.walmart.android.app.settings.PharmacyHybridSettingsActivity;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.events.ScreenStateEvent;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.util.UserVoiceUtils;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmui.Typefaces;
import com.walmartlabs.android.photo.controller.MainActivity;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import com.walmartlabs.payment.service.mpay.MobilePayEvent;
import com.walmartlabs.payment.service.mpay.MobilePayManager;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmart.android.app.main:
//            MiscActivity

public class DrawerController
{
    private static class DrawerAdapter extends BaseAdapter
    {

        private static final int TYPE_CATEGORY = 0;
        private static final int TYPE_CATEGORY_IN_STORE = 1;
        private static final int TYPE_ITEM = 2;
        private static final int TYPE_ITEM_IN_STORE = 3;
        private final SparseArray mItems;
        private final ArrayList mList;
        private OnSecondaryActionClickListener mOnSecondaryActionClickListener;

        public boolean areAllItemsEnabled()
        {
            return false;
        }

        public int getCount()
        {
            return mList.size();
        }

        public Object getItem(int i)
        {
            return mItems.get(i);
        }

        public long getItemId(int i)
        {
            return 0L;
        }

        public int getItemViewType(int i)
        {
            return ((Integer)mList.get(i)).intValue();
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            Object obj;
            obj = view;
            view = ((View) (obj));
            if (obj != null) goto _L2; else goto _L1
_L1:
            int j = ((Integer)mList.get(i)).intValue();
            if (j != 0) goto _L4; else goto _L3
_L3:
            view = ViewUtil.inflate(viewgroup.getContext(), 0x7f040043, viewgroup);
_L2:
            viewgroup = (DrawerItem)mItems.get(i);
            if (viewgroup != null)
            {
                ViewUtil.setText(0x7f10004f, view, ((DrawerItem) (viewgroup)).title);
                obj = (TextView)ViewUtil.findViewById(view, 0x7f1000e5);
                if (obj != null)
                {
                    if (TextUtils.isEmpty(((DrawerItem) (viewgroup)).subtitle))
                    {
                        ((TextView) (obj)).setVisibility(8);
                    } else
                    {
                        ((TextView) (obj)).setText(((DrawerItem) (viewgroup)).subtitle);
                        ((TextView) (obj)).setVisibility(0);
                    }
                }
                obj = (TextView)ViewUtil.findViewById(view, 0x7f1000e4);
                if (obj != null)
                {
                    if (!TextUtils.isEmpty(((DrawerItem) (viewgroup)).secondaryActionText))
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    ((TextView) (obj)).setVisibility(8);
                }
            }
            return view;
_L4:
            if (j == 1)
            {
                view = ViewUtil.inflate(viewgroup.getContext(), 0x7f040044, viewgroup);
                ((TextView)ViewUtil.findViewById(view, 0x7f10004f)).setTypeface(Typefaces.create(viewgroup.getContext(), com.walmart.android.wmui.Typefaces.Family.MEDIUM));
                ((TextView)ViewUtil.findViewById(view, 0x7f1000e5)).setTypeface(Typefaces.create(viewgroup.getContext(), com.walmart.android.wmui.Typefaces.Family.MEDIUM));
            } else
            if (j == 2)
            {
                view = ViewUtil.inflate(viewgroup.getContext(), 0x7f040045, viewgroup);
            } else
            {
                view = ((View) (obj));
                if (j == 3)
                {
                    view = ViewUtil.inflate(viewgroup.getContext(), 0x7f040045, viewgroup);
                    view.setBackgroundResource(0x7f0200f7);
                }
            }
            if (true) goto _L2; else goto _L5
_L5:
            ((TextView) (obj)).setVisibility(0);
            ((TextView) (obj)).setText(((DrawerItem) (viewgroup)).secondaryActionText);
            ((TextView) (obj)).setOnClickListener(viewgroup. new android.view.View.OnClickListener() {

                final DrawerAdapter this$0;
                final DrawerAdapter.DrawerItem val$drawerItem;

                public void onClick(View view)
                {
                    if (mOnSecondaryActionClickListener != null)
                    {
                        mOnSecondaryActionClickListener.onSecondaryActionClick(drawerItem);
                    }
                }

            
            {
                this$0 = final_draweradapter;
                drawerItem = DrawerAdapter.DrawerItem.this;
                super();
            }
            });
            return view;
        }

        public int getViewTypeCount()
        {
            return 4;
        }

        public boolean isEnabled(int i)
        {
            return ((Integer)mList.get(i)).intValue() == 2 || ((Integer)mList.get(i)).intValue() == 3;
        }

        public void setItems(List list)
        {
            mItems.clear();
            mList.clear();
            for (int i = 0; i < list.size(); i++)
            {
                DrawerItem draweritem = (DrawerItem)list.get(i);
                mItems.put(mList.size(), draweritem);
                mList.add(Integer.valueOf(draweritem.type));
            }

            notifyDataSetChanged();
        }

        public void setOnSecondaryActionClickedListener(OnSecondaryActionClickListener onsecondaryactionclicklistener)
        {
            mOnSecondaryActionClickListener = onsecondaryactionclicklistener;
            notifyDataSetChanged();
        }


        private DrawerAdapter()
        {
            mList = new ArrayList();
            mItems = new SparseArray();
        }

    }

    public static class DrawerAdapter.DrawerItem
    {

        private String secondaryActionText;
        private String subtitle;
        private int title;
        private int type;



/*
        static String access$3002(DrawerAdapter.DrawerItem draweritem, String s)
        {
            draweritem.secondaryActionText = s;
            return s;
        }

*/



/*
        static String access$3102(DrawerAdapter.DrawerItem draweritem, String s)
        {
            draweritem.subtitle = s;
            return s;
        }

*/



/*
        static int access$3202(DrawerAdapter.DrawerItem draweritem, int i)
        {
            draweritem.title = i;
            return i;
        }

*/


        public DrawerAdapter.DrawerItem(int i, int j)
        {
            type = i;
            title = j;
        }
    }

    public static interface DrawerAdapter.OnSecondaryActionClickListener
    {

        public abstract void onSecondaryActionClick(DrawerAdapter.DrawerItem draweritem);
    }


    private static final DrawerAdapter.DrawerItem ABOUT = new DrawerAdapter.DrawerItem(2, 0x7f09026a);
    private static final DrawerAdapter.DrawerItem ERECEIPTS = new DrawerAdapter.DrawerItem(2, 0x7f09026b);
    private static final DrawerAdapter.DrawerItem FEEDBACK = new DrawerAdapter.DrawerItem(2, 0x7f09026c);
    private static final DrawerAdapter.DrawerItem HELP = new DrawerAdapter.DrawerItem(2, 0x7f09026d);
    private static final DrawerAdapter.DrawerItem HOME = new DrawerAdapter.DrawerItem(2, 0x7f09026e);
    private static final DrawerAdapter.DrawerItem IN_STORE = new DrawerAdapter.DrawerItem(1, 0x7f090262);
    private static final DrawerAdapter.DrawerItem IN_STORE_FTR = new DrawerAdapter.DrawerItem(3, 0x7f09026f);
    private static final DrawerAdapter.DrawerItem MOBILE_PAY = new DrawerAdapter.DrawerItem(2, 0x7f090270);
    private static final DrawerAdapter.DrawerItem MORE = new DrawerAdapter.DrawerItem(0, 0x7f090264);
    private static final DrawerAdapter.DrawerItem MY_ACCOUNT = new DrawerAdapter.DrawerItem(0, 0x7f090265);
    private static final DrawerAdapter.DrawerItem PAYMENT = new DrawerAdapter.DrawerItem(2, 0x7f090272);
    private static final DrawerAdapter.DrawerItem PHARMACY = new DrawerAdapter.DrawerItem(2, 0x7f090273);
    private static final DrawerAdapter.DrawerItem PHARMACY_HYBRID = new DrawerAdapter.DrawerItem(2, 0x7f090274);
    private static final DrawerAdapter.DrawerItem PHOTO = new DrawerAdapter.DrawerItem(2, 0x7f090275);
    private static final DrawerAdapter.DrawerItem REGISTRY = new DrawerAdapter.DrawerItem(2, 0x7f090276);
    private static final DrawerAdapter.DrawerItem SAVINGS_SHOWCASE = new DrawerAdapter.DrawerItem(2, 0x7f090277);
    private static final DrawerAdapter.DrawerItem SERVICES = new DrawerAdapter.DrawerItem(0, 0x7f090268);
    private static final DrawerAdapter.DrawerItem SETTINGS = new DrawerAdapter.DrawerItem(2, 0x7f090279);
    private static final DrawerAdapter.DrawerItem SHOP = new DrawerAdapter.DrawerItem(0, 0x7f090269);
    private static final DrawerAdapter.DrawerItem SHOP_BY_DEPT = new DrawerAdapter.DrawerItem(2, 0x7f09027a);
    private static final DrawerAdapter.DrawerItem STORE_FINDER = new DrawerAdapter.DrawerItem(2, 0x7f09027b);
    private static final String TAG = com/walmart/android/app/main/DrawerController.getSimpleName();
    private static final DrawerAdapter.DrawerItem TRACK = new DrawerAdapter.DrawerItem(2, 0x7f09027c);
    private static final DrawerAdapter.DrawerItem WEEKLY_AD = new DrawerAdapter.DrawerItem(2, 0x7f09027d);
    private static final DrawerAdapter.DrawerItem WISHLIST = new DrawerAdapter.DrawerItem(2, 0x7f09027e);
    private static final DrawerAdapter.DrawerItem YOUR_STORE = new DrawerAdapter.DrawerItem(2, 0x7f09027f);
    private AppCompatActivity mActivity;
    private DrawerAdapter mAdapter;
    private String mCustomerId;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private ListView mLeftDrawerList;
    private com.walmartlabs.anivia.AniviaEventAsJson.Builder mPageViewEvent;

    public DrawerController(AppCompatActivity appcompatactivity)
    {
        mActivity = appcompatactivity;
        createPageViewEvent(null);
    }

    private List createDrawerItems()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(SHOP);
        arraylist.add(HOME);
        arraylist.add(SHOP_BY_DEPT);
        arraylist.add(SAVINGS_SHOWCASE);
        arraylist.add(WEEKLY_AD);
        arraylist.add(SERVICES);
        if (MobilePayManager.get().isMobilePayAvailable())
        {
            arraylist.add(MOBILE_PAY);
        }
        arraylist.add(STORE_FINDER);
        arraylist.add(WISHLIST);
        arraylist.add(REGISTRY);
        arraylist.add(PHOTO);
        arraylist.add(PHARMACY);
        if (PharmacyHybridSettingsActivity.isHybridPharmacyEnabled(mActivity))
        {
            arraylist.add(PHARMACY_HYBRID);
        }
        arraylist.add(MY_ACCOUNT);
        arraylist.add(YOUR_STORE);
        arraylist.add(ERECEIPTS);
        arraylist.add(PAYMENT);
        arraylist.add(TRACK);
        arraylist.add(MORE);
        arraylist.add(SETTINGS);
        arraylist.add(FEEDBACK);
        arraylist.add(HELP);
        arraylist.add(ABOUT);
        return arraylist;
    }

    private void createPageViewEvent(String s)
    {
        mPageViewEvent = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Navigation").putString("section", "Home").putString("subCategory", "Homepage").putString("storeId", s);
    }

    private void trackActionTapped(String s)
    {
        s = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("navigationAction")).putString("actionTapped", s);
        MessageBus.getBus().post(s);
    }

    public boolean closeDrawer()
    {
        boolean flag = mDrawerLayout.isDrawerOpen(mLeftDrawerList);
        if (flag)
        {
            mDrawerLayout.closeDrawer(mLeftDrawerList);
        }
        return flag;
    }

    public void destroy()
    {
        MessageBus.getBus().unregister(this);
    }

    public void enable(boolean flag)
    {
        enable(flag, flag);
    }

    public void enable(boolean flag, boolean flag1)
    {
        WLog.d(TAG, (new StringBuilder()).append("enable(): drawer = ").append(flag).append(", showIndicator = ").append(flag1).toString());
        mDrawerToggle.setDrawerIndicatorEnabled(flag);
        Object obj = mDrawerLayout;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        ((DrawerLayout) (obj)).setDrawerLockMode(i);
        obj = mActivity.getSupportActionBar();
        ((ActionBar) (obj)).setHomeButtonEnabled(flag1);
        ((ActionBar) (obj)).setDisplayHomeAsUpEnabled(flag1);
    }

    public void init()
    {
        mDrawerLayout = (DrawerLayout)mActivity.findViewById(0x7f100208);
        mLeftDrawerList = (ListView)ViewUtil.findViewById(mDrawerLayout, 0x7f10020a);
        mAdapter = new DrawerAdapter();
        mAdapter.setItems(createDrawerItems());
        mAdapter.setOnSecondaryActionClickedListener(new DrawerAdapter.OnSecondaryActionClickListener() {

            final DrawerController this$0;

            public void onSecondaryActionClick(DrawerAdapter.DrawerItem draweritem)
            {
                if (!DrawerController.MY_ACCOUNT.equals(draweritem)) goto _L2; else goto _L1
_L1:
                draweritem = Services.get().getAuthentication();
                if (draweritem.hasCredentials())
                {
                    draweritem.logout(new com.walmart.android.wmservice.Authentication.AuthCallback() {

                        final _cls1 this$1;

                        public void onFailure(int i)
                        {
                        }

                        public void onSuccess()
                        {
                            MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("signOut")).putString("name", "Navigation"));
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    }, true);
                    trackActionTapped("sign out");
                } else
                {
                    draweritem = new Intent(mActivity, com/walmart/android/app/account/AccountActivity);
                    draweritem.putExtra("from", "Nav");
                    mActivity.startActivityForResult(draweritem, 0);
                    mActivity.overridePendingTransition(0x7f05002c, 0x7f050033);
                    MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("signInTap")).putString("name", "Navigation"));
                    trackActionTapped("sign in");
                }
_L4:
                mDrawerLayout.closeDrawer(mLeftDrawerList);
                return;
_L2:
                if (DrawerController.YOUR_STORE.equals(draweritem))
                {
                    draweritem = new Intent(mActivity, com/walmart/android/app/main/MiscActivity);
                    draweritem.putExtra("show", 4).putExtra("EXTRA_STORE_PICKER_OPENED_FROM", "change store");
                    mActivity.startActivity(draweritem);
                    trackActionTapped("change store");
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = DrawerController.this;
                super();
            }
        });
        mLeftDrawerList.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final DrawerController this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = (DrawerAdapter.DrawerItem)adapterview.getItemAtPosition(i);
                if (DrawerController.HOME.equals(adapterview))
                {
                    MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.HOME, null, false));
                    MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Navigation").putString("section", "Home").putString("subCategory", "Homepage"));
                    trackActionTapped("home");
                } else
                if (DrawerController.SHOP_BY_DEPT.equals(adapterview))
                {
                    adapterview = new Bundle();
                    adapterview.putString("start_mode", "root");
                    MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.SHOP, adapterview, false));
                    trackActionTapped("shop by department");
                } else
                if (DrawerController.SAVINGS_SHOWCASE.equals(adapterview))
                {
                    adapterview = new Bundle();
                    adapterview.putString("start_mode", "savings_showcase");
                    MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.SHOP, adapterview, false));
                } else
                if (DrawerController.WEEKLY_AD.equals(adapterview))
                {
                    MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.LOCAL_AD, null, false));
                    trackActionTapped("weekly ad");
                } else
                if (DrawerController.MOBILE_PAY.equals(adapterview))
                {
                    MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.MOBILE_PAY, null, false));
                    trackActionTapped("mobile pay");
                } else
                if (DrawerController.STORE_FINDER.equals(adapterview))
                {
                    MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.STORE_FINDER, null, false));
                    trackActionTapped("store finder");
                } else
                if (DrawerController.TRACK.equals(adapterview))
                {
                    MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.TRACK_ORDER, null, false));
                    trackActionTapped("track your order");
                } else
                if (DrawerController.ERECEIPTS.equals(adapterview))
                {
                    adapterview = new Bundle();
                    adapterview.putBoolean("START_SYNC", true);
                    MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.SAVER_DASHBOARD, adapterview, false));
                    MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("eReceiptsection")).putString("customerId", mCustomerId));
                    trackActionTapped("savings catcher");
                } else
                if (DrawerController.PAYMENT.equals(adapterview))
                {
                    MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.PAYMENT, null, false));
                } else
                if (DrawerController.PHARMACY.equals(adapterview))
                {
                    PharmacyActivity.launch(mActivity);
                    trackActionTapped("pharmacy");
                } else
                if (DrawerController.PHARMACY_HYBRID.equals(adapterview))
                {
                    MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.PHARMACY_HYBRID, null, true));
                } else
                if (DrawerController.PHOTO.equals(adapterview))
                {
                    MainActivity.launch(mActivity, com/walmart/android/app/photo/WalmartIntegrationProvider.getName());
                    trackActionTapped("1-hour photo");
                } else
                if (DrawerController.REGISTRY.equals(adapterview))
                {
                    adapterview = new Bundle();
                    adapterview.putBoolean("reload", true);
                    MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.REGISTRY, adapterview, true));
                } else
                if (DrawerController.WISHLIST.equals(adapterview))
                {
                    MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.WISHLIST, null, true));
                } else
                if (DrawerController.YOUR_STORE.equals(adapterview))
                {
                    adapterview = new Intent(mActivity, com/walmart/android/app/main/MiscActivity);
                    if (SharedPreferencesUtil.getSavedLocalAdJsonStore(mActivity) != null)
                    {
                        adapterview.putExtra("show", 3);
                        trackActionTapped("your store");
                    } else
                    {
                        adapterview.putExtra("show", 4).putExtra("EXTRA_STORE_PICKER_OPENED_FROM", "set your store");
                        trackActionTapped("set your store");
                    }
                    mActivity.startActivity(adapterview);
                } else
                if (DrawerController.SETTINGS.equals(adapterview))
                {
                    adapterview = new Intent(mActivity, com/walmart/android/app/main/MiscActivity);
                    adapterview.putExtra("show", 2);
                    mActivity.startActivity(adapterview);
                    trackActionTapped("settings");
                } else
                if (DrawerController.FEEDBACK.equals(adapterview))
                {
                    UserVoiceUtils.launchFeedback(mActivity);
                    trackActionTapped("give feedback");
                } else
                if (DrawerController.HELP.equals(adapterview))
                {
                    adapterview = Uri.parse("https://help.walmart.com/app/home/incidents.c$client_source/Androidapp");
                    try
                    {
                        view = new Intent("android.intent.action.VIEW", adapterview);
                        if (view.resolveActivity(mActivity.getPackageManager()) != null)
                        {
                            mActivity.startActivity(view);
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        WLog.e(DrawerController.TAG, (new StringBuilder()).append("Could not launch activity for: ").append(adapterview).toString());
                    }
                    trackActionTapped("help");
                } else
                if (DrawerController.ABOUT.equals(adapterview))
                {
                    adapterview = new Intent(mActivity, com/walmart/android/app/main/MiscActivity);
                    adapterview.putExtra("show", 1);
                    mActivity.startActivity(adapterview);
                    trackActionTapped("about");
                } else
                if (!DrawerController.IN_STORE_FTR.equals(adapterview));
                mDrawerLayout.closeDrawer(mLeftDrawerList);
            }

            
            {
                this$0 = DrawerController.this;
                super();
            }
        });
        mDrawerToggle = new ActionBarDrawerToggle(mActivity, mDrawerLayout, 0x7f090001, 0x7f090001);
        mDrawerLayout.setDrawerListener(new android.support.v4.widget.DrawerLayout.DrawerListener() {

            final DrawerController this$0;

            public void onDrawerClosed(View view)
            {
                mDrawerToggle.onDrawerClosed(view);
                mLeftDrawerList.setSelection(0);
            }

            public void onDrawerOpened(View view)
            {
                if (view != null)
                {
                    ViewUtil.hideKeyboard(view);
                }
                mDrawerToggle.onDrawerOpened(view);
                MessageBus.getBus().post(mPageViewEvent);
                MessageBus.getBus().post(new ScreenStateEvent(0));
            }

            public void onDrawerSlide(View view, float f)
            {
                mDrawerToggle.onDrawerSlide(view, f);
            }

            public void onDrawerStateChanged(int i)
            {
                mDrawerToggle.onDrawerStateChanged(i);
            }

            
            {
                this$0 = DrawerController.this;
                super();
            }
        });
        ActionBar actionbar = mActivity.getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setDisplayShowTitleEnabled(true);
        onStoreUpdateEvent(new com.walmart.android.util.SharedPreferencesUtil.StoreUpdateEvent(SharedPreferencesUtil.getSavedLocalAdJsonStore(mActivity)));
        MessageBus.getBus().register(this);
        mLeftDrawerList.setAdapter(mAdapter);
    }

    public void onAuthenticationStatusChanged(AuthenticationStatusEvent authenticationstatusevent)
    {
        if (authenticationstatusevent.hasCredentials)
        {
            MY_ACCOUNT.secondaryActionText = mActivity.getString(0x7f090267);
            mCustomerId = authenticationstatusevent.customerId;
        } else
        {
            MY_ACCOUNT.secondaryActionText = mActivity.getString(0x7f090266);
            mCustomerId = "";
        }
        if (mAdapter != null)
        {
            mAdapter.notifyDataSetChanged();
        }
    }

    public boolean onBackPressed()
    {
        if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(mLeftDrawerList))
        {
            mDrawerLayout.closeDrawer(mLeftDrawerList);
            return true;
        } else
        {
            return false;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (mDrawerToggle != null)
        {
            mDrawerToggle.onConfigurationChanged(configuration);
        }
    }

    public void onMobilePayEvent(MobilePayEvent mobilepayevent)
    {
        closeDrawer();
        mAdapter.setItems(createDrawerItems());
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return mDrawerToggle != null && mDrawerToggle.onOptionsItemSelected(menuitem);
    }

    public void onStoreUpdateEvent(com.walmart.android.util.SharedPreferencesUtil.StoreUpdateEvent storeupdateevent)
    {
        String s = null;
        if (storeupdateevent.hasStoreSet())
        {
            com.walmart.android.data.WalmartStore.Address address = storeupdateevent.store.getAddress();
            if (address != null)
            {
                storeupdateevent = address.getCity();
            } else
            {
                storeupdateevent = null;
            }
            if (address != null)
            {
                s = address.getZip();
            }
            if (!TextUtils.isEmpty(storeupdateevent) && !TextUtils.isEmpty(s))
            {
                YOUR_STORE.subtitle = mActivity.getString(0x7f090281, new Object[] {
                    storeupdateevent, s
                });
            } else
            {
                YOUR_STORE.subtitle = "";
            }
        } else
        {
            YOUR_STORE.subtitle = "";
        }
        if (TextUtils.isEmpty(YOUR_STORE.subtitle))
        {
            YOUR_STORE.title = 0x7f090278;
            YOUR_STORE.secondaryActionText = "";
        } else
        {
            YOUR_STORE.title = 0x7f09027f;
            YOUR_STORE.secondaryActionText = mActivity.getString(0x7f090280);
        }
        if (mAdapter != null)
        {
            mAdapter.notifyDataSetChanged();
        }
    }

    public void syncState()
    {
        if (mDrawerToggle != null)
        {
            mDrawerToggle.syncState();
        }
    }

    public void update(boolean flag, int i)
    {
        enable(flag, true);
        mActivity.getSupportActionBar().setHomeAsUpIndicator(i);
    }






























}
