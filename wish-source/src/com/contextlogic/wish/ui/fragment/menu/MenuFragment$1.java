// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.menu;

import android.view.View;
import android.widget.AdapterView;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;

// Referenced classes of package com.contextlogic.wish.ui.fragment.menu:
//            MenuFragment, MenuFragmentAdapter, MainMenuItem

class this._cls0
    implements android.widget.temClickListener
{

    final MenuFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = MainMenuItem.resolveIndexForSet(i, MenuFragment.access$000(MenuFragment.this).getCurrentMenuSet());
        if (adapterview == null)
        {
            return;
        }
        switch (.SwitchMap.com.contextlogic.wish.ui.fragment.menu.MainMenuItem[adapterview.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_NAV_PROFILE);
            MenuFragment.access$100(MenuFragment.this);
            return;

        case 2: // '\002'
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_HOME);
            MenuFragment.access$200(MenuFragment.this);
            return;

        case 3: // '\003'
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_NAV_SEARCH);
            MenuFragment.access$300(MenuFragment.this);
            return;

        case 4: // '\004'
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_NAV_UPCOMMING_BIRTHDAY);
            MenuFragment.access$400(MenuFragment.this);
            return;

        case 5: // '\005'
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_NAV_NOTIFICATIONS);
            MenuFragment.access$500(MenuFragment.this);
            return;

        case 6: // '\006'
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_NAV_WALLET);
            MenuFragment.access$600(MenuFragment.this);
            return;

        case 7: // '\007'
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_NAV_CART);
            MenuFragment.access$700(MenuFragment.this);
            return;

        case 8: // '\b'
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_NAV_INVITE);
            MenuFragment.access$800(MenuFragment.this);
            return;

        case 9: // '\t'
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_NAV_ORDER_HISTORY);
            MenuFragment.access$900(MenuFragment.this);
            return;

        case 10: // '\n'
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_NAV_OTHER_APPS);
            MenuFragment.access$1000(MenuFragment.this);
            return;

        case 11: // '\013'
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_NAV_HELP);
            MenuFragment.access$1100(MenuFragment.this);
            return;

        case 12: // '\f'
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_FAQ);
            MenuFragment.access$1200(MenuFragment.this);
            return;

        case 13: // '\r'
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIDE_NAV_SETTINGS);
            break;
        }
        MenuFragment.access$1300(MenuFragment.this);
    }

    pter()
    {
        this$0 = MenuFragment.this;
        super();
    }
}
