// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import com.squareup.otto.Bus;
import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.UserVoice;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.dialog.AlertDialog;
import com.walmart.android.utils.StringHasher;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.utils.WLog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.walmart.android.util:
//            UserVoiceIntegrationProvider, GooglePlay

public class UserVoiceUtils
{

    private static final String APPKEY = "wucbUSKFWqQ7x3RqnSkIA";
    private static final String APPSECRET = "K3HbojJKFL3yCdj0cRgUHHtTcUXRAI7qm4aG1tMYA";
    private static final String SITE = "walmart.uservoice.com";
    private static final String TAG = com/walmart/android/util/UserVoiceUtils.getSimpleName();

    public UserVoiceUtils()
    {
    }

    private static boolean checkCanRateApp(Context context)
    {
        boolean flag1 = false;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse((new StringBuilder()).append("market://details?id=").append(context.getPackageName()).toString()));
        context = context.getPackageManager().queryIntentActivities(intent, 0);
        boolean flag = flag1;
        if (context != null)
        {
            flag = flag1;
            if (!context.isEmpty())
            {
                flag = true;
            }
        }
        return flag;
    }

    private static Config getUserVoiceConfig(Context context)
    {
        Config config = new Config("walmart.uservoice.com", "wucbUSKFWqQ7x3RqnSkIA", "K3HbojJKFL3yCdj0cRgUHHtTcUXRAI7qm4aG1tMYA");
        config.setShowForum(false);
        config.setShowPostIdea(false);
        config.setShowKnowledgeBase(true);
        config.setAllowAnonymousFeedback(true);
        config.setProvider(new UserVoiceIntegrationProvider());
        HashMap hashmap = new HashMap();
        int i = android.os.Build.VERSION.SDK_INT;
        String s = Build.MODEL;
        String as[];
        String as1[];
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = "Unknown";
        }
        as = new String[3];
        as[0] = "Device Type";
        as[1] = "OS Version";
        as[2] = "App Version";
        as1 = new String[3];
        as1[0] = s;
        as1[1] = String.valueOf(i);
        as1[2] = context;
        for (int j = 0; j < as.length && j < as1.length; j++)
        {
            hashmap.put(as[j], as1[j]);
        }

        config.setCustomFields(hashmap);
        return config;
    }

    public static boolean initUserVoice(Context context)
    {
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = flag2;
        Config config;
        Authentication authentication;
        try
        {
            config = getUserVoiceConfig(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            WLog.e(TAG, "Error initiating UserVoice", context);
            return flag;
        }
        flag = flag2;
        authentication = Services.get().getAuthentication();
        flag = flag2;
        if (!authentication.hasCredentials())
        {
            break MISSING_BLOCK_LABEL_67;
        }
        flag = true;
        flag1 = true;
        config.identifyUser((new StringHasher("MD5")).createHashedString(authentication.getCustomerId()), authentication.getFirstAndLastNames(), authentication.getUsername());
        flag = flag1;
        UserVoice.init(config, context);
        return flag1;
    }

    public static void launchFeedback(Context context)
    {
        boolean flag = initUserVoice(context);
        UserVoice.launchContactUs(context);
        context = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "question and feedback").putString("section", "user feedback").putString("isSignedIn", Boolean.toString(flag));
        MessageBus.getBus().post(context);
    }

    public static void showFeedbackDialog(Context context)
    {
        String s = context.getString(0x7f090122);
        (new com.walmart.android.ui.CustomAlertDialog.Builder(context)).setMessage(s).setPositiveButton(0x7f090123, new android.content.DialogInterface.OnClickListener(context) {

            final Context val$context;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("enjoyUsingApp")).putString("enjoyResponse", "yes");
                MessageBus.getBus().post(dialoginterface);
                UserVoiceUtils.showRateAppDialog(context);
            }

            
            {
                context = context1;
                super();
            }
        }).setNegativeButton(0x7f090121, new android.content.DialogInterface.OnClickListener(context) {

            final Context val$context;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("enjoyUsingApp")).putString("enjoyResponse", "no");
                MessageBus.getBus().post(dialoginterface);
                UserVoiceUtils.showUserVoiceFeedbackDialog(context);
            }

            
            {
                context = context1;
                super();
            }
        }).create().show();
        boolean flag = Services.get().getAuthentication().hasCredentials();
        context = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "did you enjoy using this app overlay").putString("isSignedIn", Boolean.toString(flag)).putString("section", "user feedback");
        MessageBus.getBus().post(context);
    }

    private static void showRateAppDialog(Context context)
    {
        if (checkCanRateApp(context))
        {
            String s = context.getString(0x7f090124);
            (new com.walmart.android.ui.CustomAlertDialog.Builder(context)).setMessage(s).setPositiveButton(0x7f090126, new android.content.DialogInterface.OnClickListener(context) {

                final Context val$context;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    GooglePlay.launchIfAvailable((Activity)context);
                    dialoginterface = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("popUpModal")).putString("modalType", context.getString(0x7f090124)).putString("modalAction", context.getString(0x7f090126));
                    MessageBus.getBus().post(dialoginterface);
                }

            
            {
                context = context1;
                super();
            }
            }).setNegativeButton(0x7f090125, new android.content.DialogInterface.OnClickListener(context) {

                final Context val$context;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("popUpModal")).putString("modalType", context.getString(0x7f090124)).putString("modalAction", context.getString(0x7f090125));
                    MessageBus.getBus().post(dialoginterface);
                }

            
            {
                context = context1;
                super();
            }
            }).create().show();
            return;
        } else
        {
            showUserVoiceFeedbackDialog(context);
            return;
        }
    }

    private static void showUserVoiceFeedbackDialog(Context context)
    {
        String s = context.getString(0x7f09011e);
        (new com.walmart.android.ui.CustomAlertDialog.Builder(context)).setMessage(s).setPositiveButton(0x7f09011d, new android.content.DialogInterface.OnClickListener(context) {

            final Context val$context;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                UserVoiceUtils.launchFeedback(context);
                dialoginterface = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("popUpModal")).putString("modalType", context.getString(0x7f09011e)).putString("modalAction", context.getString(0x7f09011d));
                MessageBus.getBus().post(dialoginterface);
            }

            
            {
                context = context1;
                super();
            }
        }).setNegativeButton(0x7f09011f, new android.content.DialogInterface.OnClickListener(context) {

            final Context val$context;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("popUpModal")).putString("modalType", context.getString(0x7f09011e)).putString("modalAction", context.getString(0x7f09011f));
                MessageBus.getBus().post(dialoginterface);
            }

            
            {
                context = context1;
                super();
            }
        }).create().show();
    }



}
