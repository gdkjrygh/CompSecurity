// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.squareup.otto.Bus;
import com.walmart.android.app.ereceipt.EReceiptRegisterInputPresenter;
import com.walmart.android.app.ereceipt.GCMIntentService;
import com.walmart.android.app.pharmacy.PharmacyActivity;
import com.walmart.android.app.settings.CXOHybridSettingsActivity;
import com.walmart.android.app.settings.PharmacyHybridSettingsActivity;
import com.walmart.android.app.settings.RegistrySettingsActivity;
import com.walmart.android.config.EReceiptServiceSettings;
import com.walmart.android.config.SaverServiceSettings;
import com.walmart.android.config.ServiceConfigChangedEvent;
import com.walmart.android.config.WalmartNetServiceSettings;
import com.walmart.android.data.AppConfig;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.dialog.AlertDialog;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.ereceipt.service.EReceiptManager;
import com.walmartlabs.ereceipt.service.EReceiptsContractUtil;
import com.walmartlabs.payment.service.mpay.MobilePayManager;
import com.walmartlabs.payment.service.pin.PinPreferences;
import com.walmartlabs.utils.WLog;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Debug
{

    private static final int DEBUG_ANALYTICS_QA_SERVER_DEFAULT = 2;
    public static final String DEBUG_ANALYTICS_QA_SERVER_SETTING = "analytics_qa_server_setting";
    public static final String DEBUG_IN_STORE_SEARCH_SETTING = "in_store_search_setting";
    private static final boolean DEBUG_IN_STORE_SEARCH_SETTING_DEFAULT = false;
    public static final int DEBUG_ONBOARDING_FORCE = 1;
    public static final String DEBUG_ONBOARDING_SETTING = "onboarding_debug_status";
    public static final int DEBUG_ONBOARDING_USE_ACTUAL = 0;
    public static final String DEBUG_PHARMACY_SCREENSHOT_SETTING = "pharmacy_screenshot_setting";
    private static final boolean DEBUG_PHARMACY_SCREENSHOT_SETTING_DEFAULT = false;
    public static final int DEBUG_SHIPPING_PASS_ELIGIBLE = 1;
    public static final int DEBUG_SHIPPING_PASS_MEMBER = 2;
    public static final String DEBUG_SHIPPING_PASS_SETTING = "shipping_pass_debug_status";
    public static final int DEBUG_SHIPPING_PASS_USE_ACTUAL = 0;
    public static final int DEBUG_WEEKLY_AD_SERVER_PRODUCTION = 0;
    public static final String DEBUG_WEEKLY_AD_SERVER_SETTING = "weekly_ad_server";
    public static final int DEBUG_WEEKLY_AD_SERVER_STAGING = 1;
    private static final String SHARED_PREF = "debug_prefs";
    private static final String TAG = com/walmart/android/app/Debug.getSimpleName();

    public Debug()
    {
    }

    public static AlertDialog buildEReceiptDialog(Context context)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
        builder.setTitle("EReceipt Settings");
        context = new android.content.DialogInterface.OnClickListener(context) {

            final Context val$context;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                switch (i)
                {
                default:
                    return;

                case 0: // '\0'
                    EReceiptServiceSettings.showEReceiptServerSelectDialog(context);
                    return;

                case 1: // '\001'
                    EReceiptManager.get().clearAllReceipts(null);
                    return;

                case 2: // '\002'
                    SharedPreferencesUtil.clearStates(context, true);
                    break;
                }
                try
                {
                    dialoginterface = com/walmart/android/app/ereceipt/EReceiptRegisterInputPresenter.getDeclaredField("sTryTimestamps");
                    dialoginterface.setAccessible(true);
                    dialoginterface.set(null, new long[3]);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (DialogInterface dialoginterface)
                {
                    dialoginterface.printStackTrace();
                }
            }

            
            {
                context = context1;
                super();
            }
        };
        builder.setItems(new String[] {
            "Select server", "Clear receipts", "Clear registration state"
        }, context);
        return builder.create();
    }

    public static AlertDialog buildSaverDialog(Context context)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
        builder.setTitle("Saver Settings");
        context = new android.content.DialogInterface.OnClickListener(context) {

            final Context val$context;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                switch (i)
                {
                default:
                    return;

                case 0: // '\0'
                    SaverServiceSettings.showSaverServerSelectDialog(context);
                    return;

                case 1: // '\001'
                    Debug.showSaverScannedDialog(context);
                    return;

                case 2: // '\002'
                    SharedPreferencesUtil.clearSaverShowCelebration(context);
                    return;

                case 3: // '\003'
                    Debug.showSaverResultDialog(context, 1);
                    return;

                case 4: // '\004'
                    Debug.showSaverResultDialog(context, 0);
                    return;

                case 5: // '\005'
                    Debug.showEReceiptSubmittedDialog(context);
                    return;

                case 6: // '\006'
                    Debug.showAllowSaverDialog(context);
                    return;

                case 7: // '\007'
                    Debug.showSetSaverPilotProgram(context);
                    return;

                case 8: // '\b'
                    Debug.showBluebirdDisabledDialog(context);
                    break;
                }
            }

            
            {
                context = context1;
                super();
            }
        };
        builder.setItems(new String[] {
            "Select server", "Saver Receipt Scanned state", "Clear Saver Show Celebration state", "Mock Saver money back result", "Mock Saver no lower prices result", "Mock eReceipt submitted notification", "Allow Saver without eReceipt", "Set Saver pilot program date", "Bluebird enabled"
        }, context);
        return builder.create();
    }

    public static int getAnalyticsQAServer(Context context)
    {
        return context.getSharedPreferences("debug_prefs", 0).getInt("analytics_qa_server_setting", 2);
    }

    private static int getOnboardingDebugStatus(Context context)
    {
        return context.getSharedPreferences("debug_prefs", 0).getInt("onboarding_debug_status", 0);
    }

    public static boolean getPharmacyScreenshotSetting(Context context)
    {
        return context.getSharedPreferences("debug_prefs", 0).getBoolean("pharmacy_screenshot_setting", false);
    }

    private static int getShippingPassDebugStatus(Context context)
    {
        return context.getSharedPreferences("debug_prefs", 0).getInt("shipping_pass_debug_status", 0);
    }

    private static int getWeeklyAdServer(Context context)
    {
        return context.getSharedPreferences("debug_prefs", 0).getInt("weekly_ad_server", 0);
    }

    public static boolean hasOnboardingDebugOverride(Context context)
    {
        return getOnboardingDebugStatus(context) == 1;
    }

    public static boolean hasShippingPassOverride(Context context)
    {
        return getShippingPassDebugStatus(context) != 0;
    }

    public static boolean isInstoreSearchEnabled(Context context)
    {
        return context.getSharedPreferences("debug_prefs", 0).getBoolean("in_store_search_setting", false);
    }

    public static boolean isShippingPassDebugEligible(Context context)
    {
        return isShippingPassDebugMember(context) || getShippingPassDebugStatus(context) == 1;
    }

    public static boolean isShippingPassDebugMember(Context context)
    {
        return getShippingPassDebugStatus(context) == 2;
    }

    public static void logIntent(String s, String s1, Intent intent)
    {
    }

    private static void setOnboardingDebugStatus(Context context, int i)
    {
        WLog.d(TAG, (new StringBuilder()).append("setOnboardingDebugStatus(").append(i).append(")").toString());
        context.getSharedPreferences("debug_prefs", 0).edit().putInt("onboarding_debug_status", i).apply();
    }

    private static void setShippingPassDebugStatus(Context context, int i)
    {
        WLog.d(TAG, (new StringBuilder()).append("setShippingPassDebugStatus(").append(i).append(")").toString());
        context.getSharedPreferences("debug_prefs", 0).edit().putInt("shipping_pass_debug_status", i).apply();
    }

    private static void setWeeklyAdServer(Context context, int i)
    {
        String s1 = TAG;
        StringBuilder stringbuilder = (new StringBuilder()).append("setWeeklyAdServer(): ");
        String s;
        if (i == 0)
        {
            s = "Production";
        } else
        {
            s = "Staging";
        }
        WLog.d(s1, stringbuilder.append(s).toString());
        context.getSharedPreferences("debug_prefs", 0).edit().putInt("weekly_ad_server", i).apply();
    }

    public static void showAllowPharmacyScreenshot(Activity activity)
    {
        int i = 1;
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(activity);
        builder.setTitle("Allow Pharmacy Screenshots");
        SharedPreferences sharedpreferences = activity.getSharedPreferences("debug_prefs", 0);
        if (!sharedpreferences.getBoolean("pharmacy_screenshot_setting", false))
        {
            i = 0;
        }
        activity = new android.content.DialogInterface.OnClickListener(i, sharedpreferences, activity) {

            final Activity val$activity;
            final SharedPreferences val$debugSettings;
            final int val$selectedIndex;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                if (j != selectedIndex)
                {
                    android.content.SharedPreferences.Editor editor = debugSettings.edit();
                    boolean flag;
                    if (j != 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (editor.putBoolean("pharmacy_screenshot_setting", flag).commit())
                    {
                        PharmacyActivity.close(activity);
                    }
                }
                dialoginterface.dismiss();
            }

            
            {
                selectedIndex = i;
                debugSettings = sharedpreferences;
                activity = activity1;
                super();
            }
        };
        builder.setSingleChoiceItems(new String[] {
            "Disallow", "Allow"
        }, i, activity);
        builder.show();
    }

    private static void showAllowSaverDialog(Context context)
    {
        AppConfig appconfig = AppConfigManager.get().getAppConfig();
        if (appconfig != null)
        {
            com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
            LinearLayout linearlayout = new LinearLayout(context);
            context = new CheckBox(context);
            context.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
            context.setText("Allow Saver without eReceipt");
            context.setChecked(appconfig.allowSaverWithoutEReceipt);
            linearlayout.setPadding(0, 20, 0, 20);
            linearlayout.addView(context);
            builder.setView(linearlayout);
            builder.setNeutralButton(0x7f090292, new android.content.DialogInterface.OnClickListener(appconfig, context) {

                final AppConfig val$appConfig;
                final CheckBox val$box;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    appConfig.allowSaverWithoutEReceipt = box.isChecked();
                }

            
            {
                appConfig = appconfig;
                box = checkbox;
                super();
            }
            });
            builder.show();
        }
    }

    public static void showAnalyticsQADialog(Context context)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
        builder.setTitle("Set Analytics QA Server");
        context = context.getSharedPreferences("debug_prefs", 0);
        int i = context.getInt("analytics_qa_server_setting", 2);
        context = new android.content.DialogInterface.OnClickListener(i, context) {

            final SharedPreferences val$debugSettings;
            final int val$server;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                if (j != server)
                {
                    debugSettings.edit().putInt("analytics_qa_server_setting", j).apply();
                    MessageBus.getBus().post(new ServiceConfigChangedEvent());
                }
                dialoginterface.dismiss();
            }

            
            {
                server = i;
                debugSettings = sharedpreferences;
                super();
            }
        };
        builder.setSingleChoiceItems(new String[] {
            "analytics-qa", "stg0", "stg1", "stg2", "stg3"
        }, i, context);
        builder.show();
    }

    public static void showAuthInfo(Activity activity)
    {
        Authentication authentication = Services.get().getAuthentication();
        String s = (new StringBuilder()).append(authentication.getFirstAndLastNames()).append("\n").append(authentication.getUsername()).append("\n\nCustomer id: ").append(authentication.getCustomerId()).append("\nCID: ").append(authentication.getCid()).toString();
        WLog.d(TAG, (new StringBuilder()).append("Customer id: ").append(authentication.getCustomerId()).append(", CID: ").append(authentication.getCid()).toString());
        (new com.walmart.android.ui.dialog.AlertDialog.Builder(activity)).setMessage(s).show();
    }

    private static void showBluebirdDisabledDialog(Context context)
    {
        AppConfig appconfig = AppConfigManager.get().getAppConfig();
        if (appconfig != null)
        {
            com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
            LinearLayout linearlayout = new LinearLayout(context);
            context = new CheckBox(context);
            context.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
            context.setText("Bluebird enabled");
            context.setChecked(appconfig.bluebirdEnabled);
            linearlayout.setPadding(0, 20, 0, 20);
            linearlayout.addView(context);
            builder.setView(linearlayout);
            builder.setNeutralButton(0x7f090292, new android.content.DialogInterface.OnClickListener(appconfig, context) {

                final AppConfig val$appConfig;
                final CheckBox val$box;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    appConfig.bluebirdEnabled = box.isChecked();
                }

            
            {
                appConfig = appconfig;
                box = checkbox;
                super();
            }
            });
            builder.show();
        }
    }

    private static void showEReceiptSubmittedDialog(Context context)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
        LinearLayout linearlayout = new LinearLayout(context);
        linearlayout.setOrientation(1);
        EditText edittext = new EditText(context);
        edittext.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        edittext.setHint("RUID - not TC");
        edittext.setPadding(0, 20, 0, 20);
        linearlayout.addView(edittext);
        EditText edittext1 = new EditText(context);
        edittext1.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        edittext1.setHint("Store id");
        edittext1.setPadding(0, 20, 0, 20);
        linearlayout.addView(edittext1);
        CheckBox checkbox = new CheckBox(context);
        checkbox.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        checkbox.setText("eReceipt was submitted to SC");
        checkbox.setChecked(true);
        linearlayout.setPadding(0, 20, 0, 20);
        linearlayout.addView(checkbox);
        builder.setView(linearlayout);
        builder.setNeutralButton(0x7f090292, new android.content.DialogInterface.OnClickListener(edittext, edittext1, checkbox, context) {

            final CheckBox val$box;
            final Context val$context;
            final EditText val$input;
            final EditText val$input2;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface = new Intent("com.google.android.c2dm.intent.RECEIVE");
                dialoginterface.putExtra("url", "walmart://ereceipts");
                dialoginterface.putExtra("receipt", (new StringBuilder()).append("{\"uuid\":\"").append(input.getText()).append("\", \"store\":{\"id\":\"").append(input2.getText()).append("\"}}").toString());
                dialoginterface.putExtra("submittedToSC", box.isChecked());
                dialoginterface.setClass(context, com/walmart/android/app/ereceipt/GCMIntentService);
                context.startService(dialoginterface);
            }

            
            {
                input = edittext;
                input2 = edittext1;
                box = checkbox;
                context = context1;
                super();
            }
        });
        builder.show();
    }

    public static void showHybridSettingsDialog(Activity activity)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(activity);
        builder.setTitle("Hybrid Settings");
        activity = new android.content.DialogInterface.OnClickListener(activity) {

            final Activity val$activity;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                switch (i)
                {
                default:
                    return;

                case 0: // '\0'
                    dialoginterface = new Intent(activity, com/walmart/android/app/settings/CXOHybridSettingsActivity);
                    activity.startActivity(dialoginterface);
                    return;

                case 1: // '\001'
                    dialoginterface = new Intent(activity, com/walmart/android/app/settings/RegistrySettingsActivity);
                    activity.startActivity(dialoginterface);
                    return;

                case 2: // '\002'
                    dialoginterface = new Intent(activity, com/walmart/android/app/settings/PharmacyHybridSettingsActivity);
                    activity.startActivity(dialoginterface);
                    return;

                case 3: // '\003'
                    (new WebView(activity)).clearCache(true);
                    break;
                }
            }

            
            {
                activity = activity1;
                super();
            }
        };
        builder.setItems(new String[] {
            "Cart & Checkout", "Registry", "Pharmacy", "Clear Cache"
        }, activity);
        builder.show();
    }

    public static void showInstoreSearch(Activity activity)
    {
        int i = 0;
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(activity);
        builder.setTitle("Enable In Store Search");
        activity = activity.getSharedPreferences("debug_prefs", 0);
        if (!activity.getBoolean("in_store_search_setting", false))
        {
            i = 1;
        }
        activity = new android.content.DialogInterface.OnClickListener(i, activity) {

            final SharedPreferences val$debugSettings;
            final int val$selectedIndex;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                if (j != selectedIndex)
                {
                    android.content.SharedPreferences.Editor editor = debugSettings.edit();
                    boolean flag;
                    if (j == 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    editor.putBoolean("in_store_search_setting", flag).apply();
                }
                dialoginterface.dismiss();
            }

            
            {
                selectedIndex = i;
                debugSettings = sharedpreferences;
                super();
            }
        };
        builder.setSingleChoiceItems(new String[] {
            "Yes", "No"
        }, i, activity);
        builder.show();
    }

    public static void showMobilePayDialog(Activity activity)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(activity);
        builder.setTitle("Mobile Pay Settings");
        activity = new android.content.DialogInterface.OnClickListener(activity) {

            final Activity val$activity;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                switch (i)
                {
                default:
                    return;

                case 0: // '\0'
                    WalmartNetServiceSettings.showMobilePayServerSelectDialog(activity);
                    return;

                case 1: // '\001'
                    Debug.showMobilePayManuallyEnabledDialog(activity);
                    return;

                case 2: // '\002'
                    PinPreferences.resetPin(activity, Services.get().getAuthentication().getCid());
                    break;
                }
                Toast.makeText(activity, "PIN reset", 0).show();
            }

            
            {
                activity = activity1;
                super();
            }
        };
        builder.setItems(new String[] {
            "Mobile pay server", "Manually enabled", "Reset PIN (current user)"
        }, activity);
        builder.show();
    }

    private static void showMobilePayManuallyEnabledDialog(Context context)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
        LinearLayout linearlayout = new LinearLayout(context);
        context = new CheckBox(context);
        context.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        context.setText("Mobile pay manually enabled");
        context.setChecked(MobilePayManager.get().isManuallyEnabled());
        linearlayout.setPadding(0, 20, 0, 20);
        linearlayout.addView(context);
        builder.setView(linearlayout);
        builder.setNeutralButton(0x7f090292, new android.content.DialogInterface.OnClickListener(context) {

            final CheckBox val$box;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                MobilePayManager.get().setManuallyEnabled(box.isChecked());
            }

            
            {
                box = checkbox;
                super();
            }
        });
        builder.show();
    }

    public static void showOnboardingDialog(Context context)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
        builder.setTitle("Onboarding Screen");
        int i = getOnboardingDebugStatus(context);
        context = new android.content.DialogInterface.OnClickListener(i, context) {

            final Context val$context;
            final int val$selectedIndex;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                if (j != selectedIndex)
                {
                    Debug.setOnboardingDebugStatus(context, j);
                }
                dialoginterface.dismiss();
            }

            
            {
                selectedIndex = i;
                context = context1;
                super();
            }
        };
        builder.setSingleChoiceItems(new String[] {
            "Use Original Onboarding", "Force Onboarding Screen"
        }, i, context);
        builder.show();
    }

    public static void showOpenItemDialog(Activity activity)
    {
        EditText edittext = new EditText(activity);
        edittext.setHint("Item id");
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(activity);
        builder.setView(edittext);
        builder.setPositiveButton("Open", new android.content.DialogInterface.OnClickListener(edittext, activity) {

            final Activity val$activity;
            final EditText val$editText;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                if (!TextUtils.isEmpty(editText.getText()))
                {
                    dialoginterface = new Bundle();
                    dialoginterface.putString("item_id", editText.getText().toString());
                    MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.PRODUCT_DETAILS, dialoginterface));
                    activity.finish();
                }
            }

            
            {
                editText = edittext;
                activity = activity1;
                super();
            }
        });
        builder.show();
    }

    public static void showPushDialog(Context context)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
        builder.setTitle("Push Notifications");
        Intent intent = new Intent();
        intent.setAction("com.google.android.c2dm.intent.RECEIVE");
        intent.addCategory("com.walmart.android");
        context = new android.content.DialogInterface.OnClickListener(intent, context) {

            final Context val$context;
            final Intent val$intent;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                i;
                JVM INSTR tableswitch 0 2: default 28
            //                           0 41
            //                           1 80
            //                           2 107;
                   goto _L1 _L2 _L3 _L4
_L1:
                context.sendOrderedBroadcast(intent, null);
                return;
_L2:
                intent.putExtra("title", "Push It");
                intent.putExtra("text", "This notification should open a browser at http://www.google.com");
                intent.putExtra("url", "http://www.google.com");
                continue; /* Loop/switch isn't completed */
_L3:
                intent.putExtra("com.urbanairship.actions", "{\"^d\":\"walmart://savingscatcher\"}");
                intent.putExtra("com.urbanairship.push.ALERT", "This notification should go to the Savings Catcher page.");
                continue; /* Loop/switch isn't completed */
_L4:
                intent.putExtra("com.urbanairship.push.ALERT", "UA push without a specified action. Should just open the app.");
                if (true) goto _L1; else goto _L5
_L5:
            }

            
            {
                intent = intent1;
                context = context1;
                super();
            }
        };
        builder.setItems(new String[] {
            "URL", "Savings Catcher Deeplink", "No Action"
        }, context);
        builder.show();
    }

    private static void showSaverResultDialog(Context context, int i)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
        LinearLayout linearlayout = new LinearLayout(context);
        EditText edittext = new EditText(context);
        edittext.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        edittext.setHint("TC - not RUID");
        linearlayout.addView(edittext);
        builder.setView(linearlayout);
        builder.setNeutralButton(0x7f090292, new android.content.DialogInterface.OnClickListener(edittext, i, context) {

            final Context val$context;
            final EditText val$input;
            final int val$moneyBack;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                dialoginterface = new Intent("com.google.android.c2dm.intent.RECEIVE");
                dialoginterface.putExtra("url", (new StringBuilder()).append("walmart://savingscatcher/").append(input.getText()).toString());
                dialoginterface.putExtra("amount-saved", String.valueOf(moneyBack));
                dialoginterface.setClass(context, com/walmart/android/app/ereceipt/GCMIntentService);
                context.startService(dialoginterface);
            }

            
            {
                input = edittext;
                moneyBack = i;
                context = context1;
                super();
            }
        });
        builder.show();
    }

    private static void showSaverScannedDialog(Context context)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
        LinearLayout linearlayout = new LinearLayout(context);
        CheckBox checkbox = new CheckBox(context);
        checkbox.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        checkbox.setText("Is receipt scanned?");
        checkbox.setChecked(SharedPreferencesUtil.isSaverReceiptScanned(context));
        linearlayout.setPadding(0, 20, 0, 20);
        linearlayout.addView(checkbox);
        builder.setView(linearlayout);
        builder.setNeutralButton(0x7f090292, new android.content.DialogInterface.OnClickListener(context, checkbox) {

            final CheckBox val$box;
            final Context val$context;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                SharedPreferencesUtil.setSaverReceiptScanned(context, box.isChecked());
            }

            
            {
                context = context1;
                box = checkbox;
                super();
            }
        });
        builder.show();
    }

    private static void showSetSaverPilotProgram(Context context)
    {
        AppConfig appconfig = AppConfigManager.get().getAppConfig();
        if (appconfig != null)
        {
            com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
            LinearLayout linearlayout = new LinearLayout(context);
            TextView textview = new TextView(context);
            textview.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
            textview.setText("Saver pilot program end date");
            textview.setOnClickListener(new android.view.View.OnClickListener(context, textview) {

                final Context val$context;
                final TextView val$dateView;

                public void onClick(View view)
                {
                    view = Calendar.getInstance();
                    (new DatePickerDialog(context, new android.app.DatePickerDialog.OnDateSetListener() {

                        final _cls8 this$0;

                        public void onDateSet(DatePicker datepicker, int i, int j, int k)
                        {
                            datepicker = Calendar.getInstance();
                            datepicker.set(i, j, k);
                            dateView.setText(EReceiptsContractUtil.LOCAL_DATE_FORMAT.format(datepicker.getTime()));
                        }

            
            {
                this$0 = _cls8.this;
                super();
            }
                    }, view.get(1), view.get(2), view.get(5))).show();
                }

            
            {
                context = context1;
                dateView = textview;
                super();
            }
            });
            textview.setPadding(0, 20, 0, 20);
            linearlayout.addView(textview);
            builder.setView(linearlayout);
            builder.setNeutralButton(0x7f090292, new android.content.DialogInterface.OnClickListener(appconfig, textview) {

                final AppConfig val$appConfig;
                final TextView val$dateView;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    appConfig.saverPilotEndDate = dateView.getText().toString();
                }

            
            {
                appConfig = appconfig;
                dateView = textview;
                super();
            }
            });
            builder.show();
        }
    }

    public static void showShippingPassDialog(Context context)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
        builder.setTitle("ShippingPass");
        int i = getShippingPassDebugStatus(context);
        context = new android.content.DialogInterface.OnClickListener(i, context) {

            final Context val$context;
            final int val$selectedIndex;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                if (j != selectedIndex)
                {
                    Debug.setShippingPassDebugStatus(context, j);
                }
                dialoginterface.dismiss();
            }

            
            {
                selectedIndex = i;
                context = context1;
                super();
            }
        };
        builder.setSingleChoiceItems(new String[] {
            "Use actual status", "Force eligible status", "Force member status"
        }, i, context);
        builder.show();
    }

    public static void showWeeklyAdDialog(Context context)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
        builder.setTitle("Weekly Ad Server");
        int i = getWeeklyAdServer(context);
        context = new android.content.DialogInterface.OnClickListener(i, context) {

            final Context val$context;
            final int val$selectedIndex;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                if (j != selectedIndex)
                {
                    Debug.setWeeklyAdServer(context, j);
                }
                dialoginterface.dismiss();
            }

            
            {
                selectedIndex = i;
                context = context1;
                super();
            }
        };
        builder.setSingleChoiceItems(new String[] {
            "Production", "Staging"
        }, i, context);
        builder.show();
    }

    public static boolean useWeeklyAdStagingServer(Context context)
    {
        return getWeeklyAdServer(context) == 1;
    }











}
