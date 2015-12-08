// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.settings;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.data.WishSettingsSpec;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserPreferences;
import com.contextlogic.wish.user.UserStatusManager;
import java.util.ArrayList;
import java.util.EnumSet;

// Referenced classes of package com.contextlogic.wish.ui.fragment.settings:
//            SettingsItem

public class SettingsAdapter extends BaseAdapter
{
    static class ItemRowHolder
    {

        TextView rowText;
        TextView rowText2;
        TextView rowText3;
        TextView rowText4;

        ItemRowHolder()
        {
        }
    }


    private Context context;
    private EnumSet currentSet;

    public SettingsAdapter(Context context1)
    {
        updateCurrentSet();
        context = context1;
    }

    private String formattedAppVersionString()
    {
        return getContext().getString(0x7f060483, new Object[] {
            WishApplication.getAppInstance().getAppName(), WishApplication.getAppInstance().getVersionNumber()
        });
    }

    private String formattedEmailString()
    {
        String s = LoggedInUser.getInstance().getCurrentUser().getEmail();
        if (s != null)
        {
            return String.format(getContext().getString(0x7f06013e), new Object[] {
                s
            });
        } else
        {
            return null;
        }
    }

    private String formattedLoginMethodString()
    {
        return String.format(getContext().getString(0x7f060286), new Object[] {
            LoggedInUser.getInstance().getLoginMethodName(getContext())
        });
    }

    private String formattedUIDString()
    {
        return String.format(getContext().getString(0x7f060462), new Object[] {
            LoggedInUser.getInstance().getCurrentUser().getUserId()
        });
    }

    private void updateCurrentSet()
    {
        currentSet = EnumSet.copyOf(SettingsItem.NORMAL);
        if (WishApplication.getAppInstance().isDeveloperBuild() || LoggedInUser.getInstance().isLoggedIn() && LoggedInUser.getInstance().getCurrentUser().isAdmin())
        {
            currentSet.addAll(SettingsItem.DEVELOPER);
        }
        if (GooglePlusManager.getInstance().isLoggedIn() || UserPreferences.getLoginMode().equals("LoginModeEmail"))
        {
            currentSet.addAll(SettingsItem.DELETABLE_ACCOUNT);
        }
        currentSet.addAll(SettingsItem.VERSION);
    }

    public Context getContext()
    {
        return context;
    }

    public int getCount()
    {
        return currentSet.size() + UserStatusManager.getInstance().getSettings().size();
    }

    public EnumSet getCurrentMenuSet()
    {
        return currentSet;
    }

    public Object getItem(int i)
    {
        return null;
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        return SettingsItem.resolveIndexForSet(i, currentSet) != SettingsItem.APP_VERSION ? 1 : 0;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj = view;
        SettingsItem settingsitem = SettingsItem.resolveIndexForSet(i, currentSet);
        if (obj == null)
        {
            view = ((Activity)getContext()).getLayoutInflater();
            obj = new ItemRowHolder();
            static class _cls1
            {

                static final int $SwitchMap$com$contextlogic$wish$ui$fragment$settings$SettingsItem[];

                static 
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$settings$SettingsItem = new int[SettingsItem.values().length];
                    try
                    {
                        $SwitchMap$com$contextlogic$wish$ui$fragment$settings$SettingsItem[SettingsItem.SETTINGS_GENERAL.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        $SwitchMap$com$contextlogic$wish$ui$fragment$settings$SettingsItem[SettingsItem.DELETE_ACCOUNT.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        $SwitchMap$com$contextlogic$wish$ui$fragment$settings$SettingsItem[SettingsItem.LOGOUT.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$contextlogic$wish$ui$fragment$settings$SettingsItem[SettingsItem.DEVELOPER_SETTINGS.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$contextlogic$wish$ui$fragment$settings$SettingsItem[SettingsItem.UPDATE_PROFILE.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$contextlogic$wish$ui$fragment$settings$SettingsItem[SettingsItem.APP_VERSION.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            if (getItemViewType(i) == 0)
            {
                view = view.inflate(0x7f03009c, viewgroup, false);
                obj.rowText = (TextView)view.findViewById(0x7f0d030b);
                obj.rowText2 = (TextView)view.findViewById(0x7f0d030c);
                obj.rowText3 = (TextView)view.findViewById(0x7f0d030d);
                obj.rowText4 = (TextView)view.findViewById(0x7f0d030e);
            } else
            {
                view = view.inflate(0x7f03009a, viewgroup, false);
                obj.rowText = (TextView)view.findViewById(0x7f0d0309);
            }
            view.setTag(obj);
            viewgroup = view;
            view = ((View) (obj));
        } else
        {
            view = (ItemRowHolder)((View) (obj)).getTag();
            viewgroup = ((ViewGroup) (obj));
        }
        _cls1..SwitchMap.com.contextlogic.wish.ui.fragment.settings.SettingsItem[settingsitem.ordinal()];
        JVM INSTR tableswitch 1 6: default 168
    //                   1 211
    //                   2 240
    //                   3 258
    //                   4 276
    //                   5 294
    //                   6 312;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        return viewgroup;
_L2:
        ArrayList arraylist = UserStatusManager.getInstance().getSettings();
        ((ItemRowHolder) (view)).rowText.setText(((WishSettingsSpec)arraylist.get(i)).getName());
        return viewgroup;
_L3:
        ((ItemRowHolder) (view)).rowText.setText(getContext().getString(0x7f060110));
        return viewgroup;
_L4:
        ((ItemRowHolder) (view)).rowText.setText(getContext().getString(0x7f060289));
        return viewgroup;
_L5:
        ((ItemRowHolder) (view)).rowText.setText(getContext().getString(0x7f060125));
        return viewgroup;
_L6:
        ((ItemRowHolder) (view)).rowText.setText(getContext().getString(0x7f060457));
        return viewgroup;
_L7:
        if (LoggedInUser.getInstance().isLoggedIn())
        {
            ((ItemRowHolder) (view)).rowText.setText(formattedLoginMethodString());
            String s = formattedEmailString();
            if (s != null)
            {
                ((ItemRowHolder) (view)).rowText2.setVisibility(0);
                ((ItemRowHolder) (view)).rowText2.setText(s);
            } else
            {
                ((ItemRowHolder) (view)).rowText2.setVisibility(8);
            }
            ((ItemRowHolder) (view)).rowText3.setText(formattedUIDString());
            ((ItemRowHolder) (view)).rowText4.setText(formattedAppVersionString());
            return viewgroup;
        }
        if (true) goto _L1; else goto _L8
_L8:
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    public boolean isEnabled(int i)
    {
        return SettingsItem.resolveIndexForSet(i, currentSet) != SettingsItem.APP_VERSION;
    }
}
