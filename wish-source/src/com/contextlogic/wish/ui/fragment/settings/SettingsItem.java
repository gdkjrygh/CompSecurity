// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.settings;

import com.contextlogic.wish.user.UserStatusManager;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class SettingsItem extends Enum
{

    private static final SettingsItem $VALUES[];
    public static final SettingsItem APP_VERSION;
    public static final SettingsItem CHANGE_PASSWORD;
    public static final SettingsItem DATA_CONTROL;
    public static Set DELETABLE_ACCOUNT;
    public static final SettingsItem DELETE_ACCOUNT;
    public static Set DEVELOPER;
    public static final SettingsItem DEVELOPER_SETTINGS;
    public static final SettingsItem EMAILS;
    public static final SettingsItem LOGOUT;
    public static Set NORMAL;
    public static final SettingsItem PRIVACY_POLICY;
    public static final SettingsItem PUSH_NOTIFICATIONS;
    public static final SettingsItem RATE_APP;
    public static final SettingsItem RETURN_POLICY;
    public static final SettingsItem SETTINGS_GENERAL;
    public static final SettingsItem TERMS_OF_SERVICE;
    public static final SettingsItem UPDATE_PROFILE;
    public static Set VERSION;

    private SettingsItem(String s, int i)
    {
        super(s, i);
    }

    public static SettingsItem resolveIndexForSet(int i, EnumSet enumset)
    {
        java.util.ArrayList arraylist = UserStatusManager.getInstance().getSettings();
        if (i >= arraylist.size()) goto _L2; else goto _L1
_L1:
        enumset = SETTINGS_GENERAL;
_L4:
        return enumset;
_L2:
        Iterator iterator = enumset.iterator();
        int j = arraylist.size();
label0:
        do
        {
label1:
            {
                if (!iterator.hasNext())
                {
                    break label1;
                }
                enumset = (SettingsItem)iterator.next();
                if (j == i)
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    public static SettingsItem valueOf(String s)
    {
        return (SettingsItem)Enum.valueOf(com/contextlogic/wish/ui/fragment/settings/SettingsItem, s);
    }

    public static SettingsItem[] values()
    {
        return (SettingsItem[])$VALUES.clone();
    }

    static 
    {
        RATE_APP = new SettingsItem("RATE_APP", 0);
        EMAILS = new SettingsItem("EMAILS", 1);
        PUSH_NOTIFICATIONS = new SettingsItem("PUSH_NOTIFICATIONS", 2);
        DATA_CONTROL = new SettingsItem("DATA_CONTROL", 3);
        TERMS_OF_SERVICE = new SettingsItem("TERMS_OF_SERVICE", 4);
        PRIVACY_POLICY = new SettingsItem("PRIVACY_POLICY", 5);
        RETURN_POLICY = new SettingsItem("RETURN_POLICY", 6);
        UPDATE_PROFILE = new SettingsItem("UPDATE_PROFILE", 7);
        CHANGE_PASSWORD = new SettingsItem("CHANGE_PASSWORD", 8);
        LOGOUT = new SettingsItem("LOGOUT", 9);
        DELETE_ACCOUNT = new SettingsItem("DELETE_ACCOUNT", 10);
        DEVELOPER_SETTINGS = new SettingsItem("DEVELOPER_SETTINGS", 11);
        SETTINGS_GENERAL = new SettingsItem("SETTINGS_GENERAL", 12);
        APP_VERSION = new SettingsItem("APP_VERSION", 13);
        $VALUES = (new SettingsItem[] {
            RATE_APP, EMAILS, PUSH_NOTIFICATIONS, DATA_CONTROL, TERMS_OF_SERVICE, PRIVACY_POLICY, RETURN_POLICY, UPDATE_PROFILE, CHANGE_PASSWORD, LOGOUT, 
            DELETE_ACCOUNT, DEVELOPER_SETTINGS, SETTINGS_GENERAL, APP_VERSION
        });
        NORMAL = Collections.unmodifiableSet(EnumSet.of(LOGOUT));
        DEVELOPER = Collections.unmodifiableSet(EnumSet.of(DEVELOPER_SETTINGS));
        DELETABLE_ACCOUNT = Collections.unmodifiableSet(EnumSet.of(DELETE_ACCOUNT));
        VERSION = Collections.unmodifiableSet(EnumSet.of(APP_VERSION));
    }
}
