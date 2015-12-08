// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.api.service.GetLatestAppVersionService;
import com.contextlogic.wish.user.UserPreferences;

public class RootActivityUpdateAppPrompt
{

    private static final long APP_VERSION_QUITE_TIME = 0x493e0L;
    private static final String APP_VERSION_QUITE_TIME_KEY = "AppUpdateQuiteTime";
    private static final String IGNORE_APP_VERSION_KEY = "IgnoreAppVersion";
    private GetLatestAppVersionService getLatestAppVersionService;
    private SharedPreferences preferences;
    private boolean promptBeingShown;

    public RootActivityUpdateAppPrompt()
    {
        preferences = UserPreferences.getPreferences();
        promptBeingShown = false;
        getLatestAppVersionService = new GetLatestAppVersionService();
    }

    public void cancelAllRequests()
    {
        getLatestAppVersionService.cancelAllRequests();
    }

    public void onForegrounded(final Activity activity)
    {
        if (getLatestAppVersionService.isPending() || promptBeingShown)
        {
            return;
        } else
        {
            getLatestAppVersionService.requestService(true, new com.contextlogic.wish.api.service.GetLatestAppVersionService.SuccessCallback() {

                final RootActivityUpdateAppPrompt this$0;
                final Activity val$activity;

                public void onServiceSucceeded(String s, boolean flag)
                {
                    if (flag)
                    {
                        showPrompt(s, activity);
                    }
                }

            
            {
                this$0 = RootActivityUpdateAppPrompt.this;
                activity = activity1;
                super();
            }
            }, null);
            return;
        }
    }

    public void showPrompt(String s, final Activity activity)
    {
        if (!promptBeingShown)
        {
            boolean flag2 = false;
            long l = preferences.getLong("AppUpdateQuiteTime", 0L);
            boolean flag1 = flag2;
            if (System.currentTimeMillis() > l)
            {
                final Dialog dialog = preferences.getString("IgnoreAppVersion", null);
                boolean flag;
                if (s != null && dialog != null && dialog.equals(s))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                flag1 = flag2;
                if (!flag)
                {
                    flag1 = true;
                }
            }
            if (flag1)
            {
                Analytics.getInstance().trackPageView(com.contextlogic.wish.analytics.Analytics.PageViewType.UpdateAppPrompt);
                promptBeingShown = true;
                dialog = new Dialog(activity, 0x7f0b00ff);
                dialog.requestWindowFeature(1);
                dialog.setContentView(0x7f03003c);
                ((TextView)dialog.findViewById(0x7f0d015e)).setText(activity.getString(0x7f060455));
                ((TextView)dialog.findViewById(0x7f0d015f)).setText(String.format(activity.getString(0x7f060454), new Object[] {
                    WishApplication.getAppInstance().getAppName(), s
                }));
                s = (Button)dialog.findViewById(0x7f0d0160);
                s.setText(activity.getString(0x7f060453));
                s.setOnClickListener(new android.view.View.OnClickListener() {

                    final RootActivityUpdateAppPrompt this$0;
                    final Activity val$activity;
                    final Dialog val$dialog;

                    public void onClick(View view)
                    {
                        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.UpdateApp, com.contextlogic.wish.analytics.Analytics.PageViewType.UpdateAppPrompt, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
                        WishApplication.getAppInstance().goToMarketListing(activity);
                        dialog.dismiss();
                    }

            
            {
                this$0 = RootActivityUpdateAppPrompt.this;
                activity = activity1;
                dialog = dialog1;
                super();
            }
                });
                s = (Button)dialog.findViewById(0x7f0d0161);
                s.setText(activity.getString(0x7f06036d));
                s.setOnClickListener(new android.view.View.OnClickListener() {

                    final RootActivityUpdateAppPrompt this$0;
                    final Dialog val$dialog;

                    public void onClick(View view)
                    {
                        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.RemindMeLater, com.contextlogic.wish.analytics.Analytics.PageViewType.UpdateAppPrompt, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
                        long l1 = System.currentTimeMillis();
                        preferences.edit().putLong("AppUpdateQuiteTime", l1 + 0x493e0L).commit();
                        dialog.dismiss();
                    }

            
            {
                this$0 = RootActivityUpdateAppPrompt.this;
                dialog = dialog1;
                super();
            }
                });
                dialog.findViewById(0x7f0d0162).setVisibility(8);
                dialog.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                    final RootActivityUpdateAppPrompt this$0;

                    public void onDismiss(DialogInterface dialoginterface)
                    {
                        promptBeingShown = false;
                    }

            
            {
                this$0 = RootActivityUpdateAppPrompt.this;
                super();
            }
                });
                try
                {
                    dialog.show();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return;
                }
            }
        }
    }



/*
    static boolean access$102(RootActivityUpdateAppPrompt rootactivityupdateappprompt, boolean flag)
    {
        rootactivityupdateappprompt.promptBeingShown = flag;
        return flag;
    }

*/
}
