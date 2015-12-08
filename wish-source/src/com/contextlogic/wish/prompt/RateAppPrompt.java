// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.prompt;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.user.UserPreferences;

// Referenced classes of package com.contextlogic.wish.prompt:
//            Prompt

public class RateAppPrompt
    implements Prompt
{

    private static final int PROMPT_AFTER_FOREGROUND_COUNT = 5;
    private static final String PROMPT_FOREGROUND_COUNT = "RatePromptForegroundCount";
    private static final String PROMPT_SHOWN_KEY = "RatePromptShown";
    private SharedPreferences preferences;
    private boolean promptBeingShown;
    private boolean shouldShowPrompt;

    public RateAppPrompt()
    {
    }

    public static void markPromptShown()
    {
        UserPreferences.getPreferences().edit().putBoolean("RatePromptShown", true).commit();
    }

    private void resetPromptCount(long l)
    {
        preferences.edit().putLong("RatePromptForegroundCount", 5L + l).commit();
    }

    public static boolean wasPromptShown()
    {
        return UserPreferences.getPreferences().getBoolean("RatePromptShown", false);
    }

    public boolean canShowPrompt(long l)
    {
        return !promptBeingShown && shouldShowPrompt;
    }

    public void initialize(long l)
    {
        preferences = UserPreferences.getPreferences();
        shouldShowPrompt = false;
        promptBeingShown = false;
        boolean flag = preferences.getBoolean("RatePromptShown", false);
        long l1 = preferences.getLong("RatePromptForegroundCount", -1L);
        if (!flag && l1 == -1L)
        {
            resetPromptCount(l);
        }
    }

    public void onLoggedInAppForeground(long l)
    {
        if (!promptBeingShown)
        {
            boolean flag = preferences.getBoolean("RatePromptShown", false);
            long l1 = preferences.getLong("RatePromptForegroundCount", -1L);
            if (!flag && l1 != -1L && l1 <= l)
            {
                shouldShowPrompt = true;
                return;
            }
        }
    }

    public void showPrompt(final RootActivity activity, final long foregroundCount)
    {
        Analytics.getInstance().trackPageView(com.contextlogic.wish.analytics.Analytics.PageViewType.RateAppPrompt);
        shouldShowPrompt = false;
        promptBeingShown = true;
        final Dialog dialog = new Dialog(activity, 0x7f0b00ff);
        dialog.requestWindowFeature(1);
        dialog.setContentView(0x7f03003c);
        ((TextView)dialog.findViewById(0x7f0d015e)).setText(activity.getString(0x7f06035e, new Object[] {
            WishApplication.getAppInstance().getAppName()
        }));
        ((TextView)dialog.findViewById(0x7f0d015f)).setText(activity.getString(0x7f06035d, new Object[] {
            WishApplication.getAppInstance().getAppName()
        }));
        Button button = (Button)dialog.findViewById(0x7f0d0160);
        button.setText(0x7f06035c);
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final RateAppPrompt this$0;
            final RootActivity val$activity;
            final Dialog val$dialog;

            public void onClick(View view)
            {
                Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.RateAppSelect, com.contextlogic.wish.analytics.Analytics.PageViewType.RateAppPrompt, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
                RateAppPrompt.markPromptShown();
                WishApplication.getAppInstance().goToMarketListing(activity);
                dialog.dismiss();
            }

            
            {
                this$0 = RateAppPrompt.this;
                activity = rootactivity;
                dialog = dialog1;
                super();
            }
        });
        activity = (Button)dialog.findViewById(0x7f0d0161);
        activity.setText(0x7f0602ea);
        activity.setOnClickListener(new android.view.View.OnClickListener() {

            final RateAppPrompt this$0;
            final Dialog val$dialog;

            public void onClick(View view)
            {
                Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.Skip, com.contextlogic.wish.analytics.Analytics.PageViewType.RateAppPrompt, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
                RateAppPrompt.markPromptShown();
                dialog.dismiss();
            }

            
            {
                this$0 = RateAppPrompt.this;
                dialog = dialog1;
                super();
            }
        });
        activity = (Button)dialog.findViewById(0x7f0d0162);
        activity.setText(0x7f06036d);
        activity.setOnClickListener(new android.view.View.OnClickListener() {

            final RateAppPrompt this$0;
            final Dialog val$dialog;
            final long val$foregroundCount;

            public void onClick(View view)
            {
                Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.RemindMeLater, com.contextlogic.wish.analytics.Analytics.PageViewType.RateAppPrompt, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
                resetPromptCount(foregroundCount);
                dialog.dismiss();
            }

            
            {
                this$0 = RateAppPrompt.this;
                foregroundCount = l;
                dialog = dialog1;
                super();
            }
        });
        dialog.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final RateAppPrompt this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
                promptBeingShown = false;
            }

            
            {
                this$0 = RateAppPrompt.this;
                super();
            }
        });
        dialog.show();
    }



/*
    static boolean access$102(RateAppPrompt rateappprompt, boolean flag)
    {
        rateappprompt.promptBeingShown = flag;
        return flag;
    }

*/
}
