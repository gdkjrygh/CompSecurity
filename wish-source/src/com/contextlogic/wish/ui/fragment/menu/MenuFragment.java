// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationListener;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiConfig;
import com.contextlogic.wish.cache.RuntimeStateStore;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.list.SectionedListView;
import com.contextlogic.wish.ui.components.view.PoweredByWishLightView;
import com.contextlogic.wish.ui.fragment.apps.AppListFragment;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import com.contextlogic.wish.ui.fragment.base.BaseMenuFragment;
import com.contextlogic.wish.ui.fragment.invite.InviteFriendsByLinkFragment;
import com.contextlogic.wish.ui.fragment.notifications.NotificationsFragment;
import com.contextlogic.wish.ui.fragment.profile.ProfileFragment;
import com.contextlogic.wish.ui.fragment.settings.SettingsFragment;
import com.contextlogic.wish.ui.fragment.wallet.WalletFragment;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserPreferences;
import com.contextlogic.wish.user.UserStatusManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.menu:
//            MenuFragmentAdapter, MainMenuItem

public class MenuFragment extends BaseMenuFragment
    implements ApiDataChangeNotificationListener
{

    private MenuFragmentAdapter adapter;
    private SectionedListView listView;

    public MenuFragment()
    {
    }

    private void handleBirthdayClicked()
    {
        UserPreferences.setLastBrithdayCheckTime(System.currentTimeMillis());
        showUrl(String.format("https://%s/m/upcoming-birthdays", new Object[] {
            WishApi.getInstance().getConfig().getApiBaseUrlString()
        }), true);
        updateListRows();
    }

    private void handleCartClicked()
    {
        ((RootActivity)getActivity()).showCart(null, null, null, 0);
    }

    private void handleFAQClicked()
    {
        showUrl(String.format("https://%s/m/help", new Object[] {
            WishApi.getInstance().getConfig().getApiBaseUrlString()
        }));
    }

    private void handleHelpClicked()
    {
        showUrl(String.format("https://%s/customer-support-center", new Object[] {
            WishApi.getInstance().getConfig().getApiBaseUrlString()
        }));
    }

    private void handleHomeClicked()
    {
        showContentFragment(RootActivity.getTabbedFeedFragment(false, null), true);
    }

    private void handleInviteFriendsClicked()
    {
        RootActivity rootactivity = (RootActivity)getActivity();
        com.contextlogic.wish.api.data.WishInviteLinkSpec wishinvitelinkspec = UserStatusManager.getInstance().getInviteLinkSpec();
        if (wishinvitelinkspec != null)
        {
            InviteFriendsByLinkFragment invitefriendsbylinkfragment = new InviteFriendsByLinkFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("ArgInviteLinkSpec", wishinvitelinkspec);
            invitefriendsbylinkfragment.setArguments(bundle);
            rootactivity.setModalContentFragment(invitefriendsbylinkfragment, true);
        } else
        if (getActivity() != null)
        {
            ((RootActivity)getActivity()).showShareDialog(UserStatusManager.getInstance().getInviteSubject(), UserStatusManager.getInstance().getInviteMessage());
            return;
        }
    }

    private void handleNotificationsClicked()
    {
        NotificationsFragment notificationsfragment = new NotificationsFragment();
        RootActivity rootactivity = (RootActivity)getActivity();
        rootactivity.setContentFragment(notificationsfragment, false);
        rootactivity.closeMenus();
    }

    private void handleOrderHistoryClicked()
    {
        showUrl(String.format("https://%s/m/transaction", new Object[] {
            WishApi.getInstance().getConfig().getApiBaseUrlString()
        }), true);
    }

    private void handleOtherAppsClicked()
    {
        AppListFragment applistfragment = new AppListFragment();
        RootActivity rootactivity = (RootActivity)getActivity();
        rootactivity.setContentFragment(applistfragment, false);
        rootactivity.closeMenus();
    }

    private void handleProfileClicked()
    {
        ProfileFragment profilefragment = new ProfileFragment();
        Object obj = new Bundle();
        ((Bundle) (obj)).putString("ArgUser", RuntimeStateStore.getInstance().storeState(LoggedInUser.getInstance().getCurrentUser(), null));
        profilefragment.setArguments(((Bundle) (obj)));
        obj = (RootActivity)getActivity();
        ((RootActivity) (obj)).setContentFragment(profilefragment, false);
        ((RootActivity) (obj)).closeMenus();
    }

    private void handleSearchMenuItemClicked()
    {
        ((RootActivity)getActivity()).onSearchRequested(true);
    }

    private void handleSettingsClicked()
    {
        showContentFragment(new SettingsFragment(), false);
    }

    private void handleWalletClicked()
    {
        WalletFragment walletfragment = new WalletFragment();
        RootActivity rootactivity = (RootActivity)getActivity();
        rootactivity.setContentFragment(walletfragment, false);
        rootactivity.closeMenus();
    }

    private void updateListRows()
    {
        for (int i = 0; i < listView.getChildCount(); i++)
        {
            adapter.updateRow(listView.getChildAt(i));
        }

    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        return com.contextlogic.wish.analytics.Analytics.PageViewType.Menu;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f03006d;
    }

    protected void initializeUi(View view)
    {
        listView = (SectionedListView)view.findViewById(0x7f0d022e);
        listView.setPinnedHeaderView(LayoutInflater.from(getActivity()).inflate(0x7f030071, listView, false));
        view = new PoweredByWishLightView(getActivity());
        view.setInnerPadding(10);
        listView.addFooterView(view);
        adapter = new MenuFragmentAdapter(getActivity());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final MenuFragment this$0;

            public void onItemClick(AdapterView adapterview, View view1, int i, long l)
            {
                adapterview = MainMenuItem.resolveIndexForSet(i, adapter.getCurrentMenuSet());
                if (adapterview == null)
                {
                    return;
                }
                static class _cls2
                {

                    static final int $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[];

                    static 
                    {
                        $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem = new int[MainMenuItem.values().length];
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.PROFILE.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror12) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.HOME.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror11) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.SEARCH.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror10) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.UPCOMING_BIRTHDAY.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror9) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.NOTIFICATIONS.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror8) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.WALLET.ordinal()] = 6;
                        }
                        catch (NoSuchFieldError nosuchfielderror7) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.SHOPPING_CART.ordinal()] = 7;
                        }
                        catch (NoSuchFieldError nosuchfielderror6) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.INVITE_FRIENDS.ordinal()] = 8;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.ORDER_HISTORY.ordinal()] = 9;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.OTHER_APPS.ordinal()] = 10;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.HELP.ordinal()] = 11;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.FAQ.ordinal()] = 12;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.SETTINGS.ordinal()] = 13;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls2..SwitchMap.com.contextlogic.wish.ui.fragment.menu.MainMenuItem[adapterview.ordinal()])
                {
                default:
                    return;

                case 1: // '\001'
                    trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_NAV_PROFILE);
                    handleProfileClicked();
                    return;

                case 2: // '\002'
                    trackClick(WishAnalyticsEvent.CLICK_MOBILE_HOME);
                    handleHomeClicked();
                    return;

                case 3: // '\003'
                    trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_NAV_SEARCH);
                    handleSearchMenuItemClicked();
                    return;

                case 4: // '\004'
                    trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_NAV_UPCOMMING_BIRTHDAY);
                    handleBirthdayClicked();
                    return;

                case 5: // '\005'
                    trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_NAV_NOTIFICATIONS);
                    handleNotificationsClicked();
                    return;

                case 6: // '\006'
                    trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_NAV_WALLET);
                    handleWalletClicked();
                    return;

                case 7: // '\007'
                    trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_NAV_CART);
                    handleCartClicked();
                    return;

                case 8: // '\b'
                    trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_NAV_INVITE);
                    handleInviteFriendsClicked();
                    return;

                case 9: // '\t'
                    trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_NAV_ORDER_HISTORY);
                    handleOrderHistoryClicked();
                    return;

                case 10: // '\n'
                    trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_NAV_OTHER_APPS);
                    handleOtherAppsClicked();
                    return;

                case 11: // '\013'
                    trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_NAV_HELP);
                    handleHelpClicked();
                    return;

                case 12: // '\f'
                    trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_FAQ);
                    handleFAQClicked();
                    return;

                case 13: // '\r'
                    trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_NAV_SETTINGS);
                    break;
                }
                handleSettingsClicked();
            }

            
            {
                this$0 = MenuFragment.this;
                super();
            }
        });
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.NotificationCount, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.CartCount, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.RemainingCredit, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.Experiment, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UpcomingBirthdayCount, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.WalletCount, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UserUpdated, this);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        super.onDestroy();
        ApiDataChangeNotificationManager.getInstance().removeListener(this);
    }

    public void onNotificationReceived(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType notificationtype, Bundle bundle)
    {
        if (notificationtype == com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.Experiment)
        {
            if (adapter != null)
            {
                adapter.updateCurrentSet();
                adapter.notifyDataSetChanged();
            }
        } else
        if (notificationtype == com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UpcomingBirthdayCount)
        {
            if (adapter != null)
            {
                int i = bundle.getInt("UpcomingBirthdayCount");
                adapter.setUpcomingBirthdayCount(i);
                adapter.notifyDataSetChanged();
                return;
            }
        } else
        {
            updateListRows();
            return;
        }
    }

    public void setSelectedItem(MainMenuItem mainmenuitem)
    {
        if (adapter != null)
        {
            adapter.setSelectedItem(mainmenuitem);
        }
    }

    protected boolean shouldTrackImpression()
    {
        return false;
    }














}
