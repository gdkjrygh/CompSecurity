// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.menu;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public final class MainMenuItem extends Enum
{

    private static final MainMenuItem $VALUES[];
    public static Set BIRTHDAY;
    public static final MainMenuItem FAQ;
    public static final MainMenuItem HELP;
    public static final MainMenuItem HOME;
    public static final MainMenuItem INVITE_FRIENDS;
    public static Set NORMAL;
    public static final MainMenuItem NOTIFICATIONS;
    public static final MainMenuItem ORDER_HISTORY;
    public static final MainMenuItem OTHER_APPS;
    public static final MainMenuItem PROFILE;
    public static final MainMenuItem SEARCH;
    public static final MainMenuItem SETTINGS;
    public static final MainMenuItem SHOPPING_CART;
    public static final MainMenuItem UPCOMING_BIRTHDAY;
    public static final MainMenuItem WALLET;

    private MainMenuItem(String s, int i)
    {
        super(s, i);
    }

    public static int indexForItem(MainMenuItem mainmenuitem, EnumSet enumset)
    {
        enumset = enumset.iterator();
        for (int i = 0; enumset.hasNext(); i++)
        {
            if ((MainMenuItem)enumset.next() == mainmenuitem)
            {
                return i;
            }
        }

        return -1;
    }

    public static MainMenuItem resolveIndexForSet(int i, EnumSet enumset)
    {
        enumset = enumset.iterator();
        for (int j = 0; enumset.hasNext(); j++)
        {
            MainMenuItem mainmenuitem = (MainMenuItem)enumset.next();
            if (j == i)
            {
                return mainmenuitem;
            }
        }

        return null;
    }

    public static MainMenuItem valueOf(String s)
    {
        return (MainMenuItem)Enum.valueOf(com/contextlogic/wish/ui/fragment/menu/MainMenuItem, s);
    }

    public static MainMenuItem[] values()
    {
        return (MainMenuItem[])$VALUES.clone();
    }

    static 
    {
        PROFILE = new MainMenuItem("PROFILE", 0);
        HOME = new MainMenuItem("HOME", 1);
        SEARCH = new MainMenuItem("SEARCH", 2);
        NOTIFICATIONS = new MainMenuItem("NOTIFICATIONS", 3);
        UPCOMING_BIRTHDAY = new MainMenuItem("UPCOMING_BIRTHDAY", 4);
        SHOPPING_CART = new MainMenuItem("SHOPPING_CART", 5);
        ORDER_HISTORY = new MainMenuItem("ORDER_HISTORY", 6);
        WALLET = new MainMenuItem("WALLET", 7);
        OTHER_APPS = new MainMenuItem("OTHER_APPS", 8);
        INVITE_FRIENDS = new MainMenuItem("INVITE_FRIENDS", 9);
        HELP = new MainMenuItem("HELP", 10);
        FAQ = new MainMenuItem("FAQ", 11);
        SETTINGS = new MainMenuItem("SETTINGS", 12);
        $VALUES = (new MainMenuItem[] {
            PROFILE, HOME, SEARCH, NOTIFICATIONS, UPCOMING_BIRTHDAY, SHOPPING_CART, ORDER_HISTORY, WALLET, OTHER_APPS, INVITE_FRIENDS, 
            HELP, FAQ, SETTINGS
        });
        NORMAL = Collections.unmodifiableSet(EnumSet.of(PROFILE, new MainMenuItem[] {
            HOME, SEARCH, NOTIFICATIONS, SHOPPING_CART, ORDER_HISTORY, WALLET, OTHER_APPS, INVITE_FRIENDS, HELP, FAQ, 
            SETTINGS
        }));
        BIRTHDAY = Collections.unmodifiableSet(EnumSet.of(UPCOMING_BIRTHDAY));
    }
}
