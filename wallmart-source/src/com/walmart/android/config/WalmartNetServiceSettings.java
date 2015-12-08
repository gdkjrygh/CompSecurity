// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.config;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Patterns;
import android.widget.EditText;
import android.widget.Toast;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.dialog.AlertDialog;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.WalmartNetService;
import com.walmartlabs.kangaroo.service.Header;
import com.walmartlabs.kangaroo.service.SharedHttpClient;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.walmart.android.config:
//            ServiceConfigChangedEvent

public class WalmartNetServiceSettings
{
    private static class ServerOption
    {

        public final List cookiesAsHeaders;
        public final String host;
        public final String name;

        public ServerOption(String s, String s1)
        {
            this(s, s1, Collections.emptyList());
        }

        public ServerOption(String s, String s1, List list)
        {
            name = s;
            host = s1;
            cookiesAsHeaders = list;
        }

        public ServerOption(String s, String s1, Header aheader[])
        {
            this(s, s1, ((List) (new ArrayList(Arrays.asList(aheader)))));
        }
    }


    public static final boolean DEBUG = false;
    public static final String DEBUG_FAST_PICKUP_SERVER_SETTING = "fast_pickup_server_setting";
    public static final String DEBUG_HAPI_SERVER_SETTING = "hapi_server_setting";
    public static final String DEBUG_IRS_SERVER_SETTING = "irs_server_setting";
    public static final String DEBUG_MOBILE_PAY_SERVER_SETTING = "mobile_pay_server_setting";
    public static final String DEBUG_SERVER_MANUAL_BASE_URL = "manual_baseurl";
    public static final String DEBUG_SERVER_MANUAL_PHOENIX_URL = "manual_phoenixurl";
    public static final String DEBUG_SERVER_MANUAL_SECURE_BASE_URL = "manual_securebaseurl";
    public static final String DEBUG_SERVER_SETTING = "server_setting";
    public static final String DEBUG_STORE_SEARCH_SERVER_SETTING = "store_search_server_setting";
    public static final String DEBUG_WWW_SERVER_HOST = "www_server_host";
    public static final int DEFAULT_HAPI_SERVICE_MODE = 0;
    private static final int DEFAULT_IRS_SERVICE_MODE = 0;
    public static final int DEFAULT_SERVICE_MODE = 0;
    private static final int DEFAULT_STORE_SEARCH_SERVICE_MODE = 0;
    private static final int DEFAULT_WWW_HOST_SERVICE = 0;
    private static final String HAPI_SERVER_OPTIONS_STRING_ARRAY[] = {
        "Production", "Staging", "E5", "E7", "E8"
    };
    public static final int HAPI_SERVICE_MODE_E_5 = 2;
    public static final int HAPI_SERVICE_MODE_E_7 = 3;
    public static final int HAPI_SERVICE_MODE_E_8 = 4;
    public static final int HAPI_SERVICE_MODE_PRODUCTION = 0;
    public static final int HAPI_SERVICE_MODE_STAGING = 1;
    private static final String IRS_HOST_PRODUCTION = "irsws.atlas.walmart.com";
    private static final String IRS_HOST_QA = "irs-ws.qa-cdc.glb.qa.walmart.com";
    private static final String IRS_HOST_STAGING = "irs-ws.stg-sdc.glb.qa.walmart.com";
    private static final String IRS_SERVER_OPTIONS_STRING_ARRAY[] = {
        "Production", "Staging", "QA"
    };
    private static final int IRS_SERVICE_MODE_PRODUCTION = 0;
    private static final int IRS_SERVICE_MODE_QA = 2;
    private static final int IRS_SERVICE_MODE_STAGING = 1;
    private static final String ITEM_REVIEW_SERVICE_PRODUCTION = "walmart.ugc.bazaarvoice.com";
    private static final Header PROD_B_COOKIE_AS_HEADER = new Header("Set-Cookie", "SENV=prodb; path=/; domain=.walmart.com");
    private static final Header PROD_C_COOKIE_AS_HEADER = new Header("Set-Cookie", "SENV=prodc; path=/; domain=.walmart.com");
    private static final Header PROD_D_COOKIE_AS_HEADER = new Header("Set-Cookie", "SENV=prodd; path=/; domain=.walmart.com");
    private static final Header PROD_P_COOKIE_AS_HEADER = new Header("Set-Cookie", "SENV=prodp; path=/; domain=.walmart.com");
    private static final List SERVER_OPTIONS_LIST = new ArrayList() {

            
            {
                add(new ServerOption("Production", "www.walmart.com"));
                add(new ServerOption("Production-B", "www.walmart.com", new Header[] {
                    WalmartNetServiceSettings.PROD_B_COOKIE_AS_HEADER
                }));
                add(new ServerOption("Production-C", "www.walmart.com", new Header[] {
                    WalmartNetServiceSettings.PROD_C_COOKIE_AS_HEADER
                }));
                add(new ServerOption("Production-D", "www.walmart.com", new Header[] {
                    WalmartNetServiceSettings.PROD_D_COOKIE_AS_HEADER
                }));
                add(new ServerOption("Production-P", "www.walmart.com", new Header[] {
                    WalmartNetServiceSettings.PROD_P_COOKIE_AS_HEADER
                }));
                add(new ServerOption("E16", "www-e16.walmart.com"));
                add(new ServerOption("E16 - Stage 2", "www-e16.walmart.com", new Header[] {
                    WalmartNetServiceSettings.STAGE_2_COOKIE_AS_HEADER
                }));
            }
    };
    private static final String SERVER_OPTIONS_STRING_ARRAY[] = {
        "Production", "E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", 
        "E10", "E11", "E12", "Stage", "Manual"
    };
    public static final int SERVICE_MODE_E_1 = 1;
    public static final int SERVICE_MODE_E_10 = 10;
    public static final int SERVICE_MODE_E_11 = 11;
    public static final int SERVICE_MODE_E_12 = 12;
    public static final int SERVICE_MODE_E_2 = 2;
    public static final int SERVICE_MODE_E_3 = 3;
    public static final int SERVICE_MODE_E_4 = 4;
    public static final int SERVICE_MODE_E_5 = 5;
    public static final int SERVICE_MODE_E_6 = 6;
    public static final int SERVICE_MODE_E_7 = 7;
    public static final int SERVICE_MODE_E_8 = 8;
    public static final int SERVICE_MODE_E_9 = 9;
    public static final int SERVICE_MODE_MANUAL = 14;
    public static final int SERVICE_MODE_PRODUCTION = 0;
    public static final int SERVICE_MODE_STAGE = 13;
    private static final String SHARED_PREF = "debug_prefs";
    private static final Header STAGE_2_COOKIE_AS_HEADER = new Header("Set-Cookie", "SENV=stage2; path=/; domain=.walmart.com");
    private static final String STORE_SEARCH_OPTIONS_STRING_ARRAY[] = {
        "Production", "Staging 2"
    };
    private static final String STORE_SEARCH_PRODUCTION = "search.mobile.walmart.com";
    private static final int STORE_SEARCH_SERVICE_MODE_PRODUCTION = 0;
    private static final int STORE_SEARCH_SERVICE_MODE_STG2_EXT = 1;
    private static final String STORE_SEARCH_STG2_EXTERNAL = "dfw-origin-search-stg2.mobile.walmart.com";
    private static final String WEEKLY_AD_HOST = "api.flyertown.com";
    private static final String WWW_HOST_PRODUCTION = "www.walmart.com";
    private static final int WWW_HOST_SERVICE_E16 = 5;
    private static final int WWW_HOST_SERVICE_E16_STAGE_2 = 6;
    private static final int WWW_HOST_SERVICE_PRODUCTION = 0;
    private static final int WWW_HOST_SERVICE_PROD_B = 1;
    private static final int WWW_HOST_SERVICE_PROD_C = 2;
    private static final int WWW_HOST_SERVICE_PROD_D = 3;
    private static final int WWW_HOST_SERVICE_PROD_P = 4;
    public static android.graphics.BitmapFactory.Options bitmapOptions;
    private final String mBaseUrl;
    private final String mFastPickupUrl;
    private final Uri mHapiBaseUrl;
    private final int mHapiServiceMode = 0;
    private final String mIrsHost = "irsws.atlas.walmart.com";
    private final int mIrsServiceMode;
    private final String mMobilePayHost;
    private final String mPhoenixUrl;
    private final String mSecureBaseUrl;
    private final int mServiceMode;
    private final String mStoreSearchHost = "search.mobile.walmart.com";
    private final String mWwwHost;

    public WalmartNetServiceSettings(Context context)
    {
        mServiceMode = 0;
        mServiceMode;
        JVM INSTR tableswitch 1 14: default 84
    //                   1 290
    //                   2 314
    //                   3 338
    //                   4 362
    //                   5 386
    //                   6 410
    //                   7 434
    //                   8 458
    //                   9 482
    //                   10 506
    //                   11 530
    //                   12 554
    //                   13 578
    //                   14 602;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        mBaseUrl = "http://mobile.walmart.com/m/j?e=1&";
        mSecureBaseUrl = "https://mobile.walmart.com/m/j?e=1&";
        mPhoenixUrl = "https://mobile.walmart.com/r/phoenix/android/index.html";
_L26:
        mHapiServiceMode;
        JVM INSTR tableswitch 1 4: default 144
    //                   1 629
    //                   2 639
    //                   3 649
    //                   4 659;
           goto _L16 _L17 _L18 _L19 _L20
_L16:
        mHapiBaseUrl = WalmartNetService.HAPI_BASE_URL_PRODUCTION;
_L27:
        context = (ServerOption)SERVER_OPTIONS_LIST.get(0);
        mWwwHost = ((ServerOption) (context)).host;
        try
        {
            SharedHttpClient.get().getCookieHandler().put(URI.create((new StringBuilder()).append("http://").append(mWwwHost).toString()), headersToMultiMap(((ServerOption) (context)).cookiesAsHeaders));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        mFastPickupUrl = "https://checkin.mobile.walmart.com";
        mIrsServiceMode = 0;
        mIrsServiceMode;
        JVM INSTR tableswitch 1 2: default 252
    //                   1 677
    //                   2 686;
           goto _L21 _L22 _L23
_L21:
_L28:
        0;
        JVM INSTR tableswitch 1 1: default 276
    //                   1 695;
           goto _L24 _L25
_L24:
_L29:
        mMobilePayHost = "pay.edge.walmart.com";
        return;
_L2:
        mBaseUrl = "http://mobile-e1.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mSecureBaseUrl = "https://mobile-e1.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mPhoenixUrl = "https://mobile-e1.walmart.com/r/phoenix/android/index.html";
          goto _L26
_L3:
        mBaseUrl = "http://mobile-e2.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mSecureBaseUrl = "https://mobile-e2.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mPhoenixUrl = "https://mobile-e2.walmart.com/r/phoenix/android/index.html";
          goto _L26
_L4:
        mBaseUrl = "http://mobile-e3.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mSecureBaseUrl = "https://mobile-e3.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mPhoenixUrl = "https://mobile-e3.walmart.com/r/phoenix/android/index.html";
          goto _L26
_L5:
        mBaseUrl = "http://mobile-e4.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mSecureBaseUrl = "https://mobile-e4.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mPhoenixUrl = "https://mobile-e4.walmart.com/r/phoenix/android/index.html";
          goto _L26
_L6:
        mBaseUrl = "http://mobile-e5.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mSecureBaseUrl = "https://mobile-e5.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mPhoenixUrl = "https://mobile-e5.walmart.com/r/phoenix/android/index.html";
          goto _L26
_L7:
        mBaseUrl = "http://mobile-e6.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mSecureBaseUrl = "https://mobile-e6.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mPhoenixUrl = "https://mobile-e6.walmart.com/r/phoenix/android/index.html";
          goto _L26
_L8:
        mBaseUrl = "http://mobile-e7.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mSecureBaseUrl = "https://mobile-e7.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mPhoenixUrl = "https://mobile-e7.walmart.com/r/phoenix/android/index.html";
          goto _L26
_L9:
        mBaseUrl = "http://mobile-e8.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mSecureBaseUrl = "https://mobile-e8.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mPhoenixUrl = "https://mobile-e8.walmart.com/r/phoenix/android/index.html";
          goto _L26
_L10:
        mBaseUrl = "http://mobile-e9.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mSecureBaseUrl = "https://mobile-e9.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mPhoenixUrl = "https://mobile-e9.walmart.com/r/phoenix/android/index.html";
          goto _L26
_L11:
        mBaseUrl = "http://mobile-e10.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mSecureBaseUrl = "https://mobile-e10.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mPhoenixUrl = "https://mobile-e10.walmart.com/r/phoenix/android/index.html";
          goto _L26
_L12:
        mBaseUrl = "http://mobile-e11.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mSecureBaseUrl = "https://mobile-e11.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mPhoenixUrl = "https://mobile-e11.walmart.com/r/phoenix/android/index.html";
          goto _L26
_L13:
        mBaseUrl = "http://mobile-e12.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mSecureBaseUrl = "https://mobile-e12.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mPhoenixUrl = "https://mobile-e12.walmart.com/r/phoenix/android/index.html";
          goto _L26
_L14:
        mBaseUrl = "http://mobile-stage.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mSecureBaseUrl = "https://mobile-stage.walmart.com/m/j?username=mobile&password=1111&e=1&";
        mPhoenixUrl = "https://mobile-stage.walmart.com/r/phoenix/android/index.html";
          goto _L26
_L15:
        mBaseUrl = getManualBaseUrl(context);
        mSecureBaseUrl = getManualSecureBaseUrl(context);
        mPhoenixUrl = getManualPhoenixUrl(context);
          goto _L26
_L17:
        mHapiBaseUrl = WalmartNetService.HAPI_BASE_URL_STAGE;
          goto _L27
_L18:
        mHapiBaseUrl = WalmartNetService.HAPI_BASE_URL_E_5;
          goto _L27
_L19:
        mHapiBaseUrl = WalmartNetService.HAPI_BASE_URL_E_7;
          goto _L27
_L20:
        mHapiBaseUrl = WalmartNetService.HAPI_BASE_URL_E_8;
          goto _L27
_L22:
        mIrsHost = "irs-ws.stg-sdc.glb.qa.walmart.com";
          goto _L28
_L23:
        mIrsHost = "irs-ws.qa-cdc.glb.qa.walmart.com";
          goto _L28
_L25:
        mStoreSearchHost = "dfw-origin-search-stg2.mobile.walmart.com";
          goto _L29
    }

    private static String getManualBaseUrl(Context context)
    {
        return context.getSharedPreferences("debug_prefs", 0).getString("manual_baseurl", "http://mobile.walmart.com/m/j?e=1&");
    }

    private static String getManualPhoenixUrl(Context context)
    {
        return context.getSharedPreferences("debug_prefs", 0).getString("manual_phoenixurl", "https://mobile.walmart.com/r/phoenix/android/index.html");
    }

    private static String getManualSecureBaseUrl(Context context)
    {
        return context.getSharedPreferences("debug_prefs", 0).getString("manual_securebaseurl", "https://mobile.walmart.com/m/j?e=1&");
    }

    private static Map headersToMultiMap(List list)
    {
        HashMap hashmap = new HashMap();
        for (list = list.iterator(); list.hasNext();)
        {
            Header header = (Header)list.next();
            if (hashmap.get(header.name()) == null)
            {
                hashmap.put(header.name(), new ArrayList(Collections.singletonList(header.value())));
            } else
            {
                ((List)hashmap.get(header.name())).add(header.value());
            }
        }

        return hashmap;
    }

    private static String loadFastPickupBaseUrl(Context context)
    {
        try
        {
            context = context.getSharedPreferences("debug_prefs", 0).getString("fast_pickup_server_setting", "https://checkin.mobile.walmart.com");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return "https://checkin.mobile.walmart.com";
        }
        return context;
    }

    private static int loadHapiServiceMode(Context context)
    {
        return context.getSharedPreferences("debug_prefs", 0).getInt("hapi_server_setting", 0);
    }

    private static int loadIRSServiceMode(Context context)
    {
        return context.getSharedPreferences("debug_prefs", 0).getInt("irs_server_setting", 0);
    }

    private static String loadMobilePayBaseUrl(Context context)
    {
        return context.getSharedPreferences("debug_prefs", 0).getString("mobile_pay_server_setting", "pay.edge.walmart.com");
    }

    private static int loadServiceMode(Context context)
    {
        return context.getSharedPreferences("debug_prefs", 0).getInt("server_setting", 0);
    }

    private static int loadStoreSearchServiceMode(Context context)
    {
        return context.getSharedPreferences("debug_prefs", 0).getInt("store_search_server_setting", 0);
    }

    private static int loadWwwServiceHost(Context context)
    {
        return context.getSharedPreferences("debug_prefs", 0).getInt("www_server_host", 0);
    }

    public static void showDeviceId(Context context)
    {
        String s = (new StringBuilder()).append("Installation id: ").append(SharedPreferencesUtil.getInstallationId(context)).toString();
        (new com.walmart.android.ui.dialog.AlertDialog.Builder(context)).setMessage(s).create().show();
    }

    private static void showEditManualServiceDialog(Activity activity)
    {
        com.walmart.android.ui.CustomAlertDialog.Builder builder = new com.walmart.android.ui.CustomAlertDialog.Builder(activity);
        Object obj = ViewUtil.inflate(activity, 0x7f040039);
        builder.setView(((android.view.View) (obj)));
        Object obj1 = getManualBaseUrl(activity);
        EditText edittext = (EditText)ViewUtil.findViewById(((android.view.View) (obj)), 0x7f1000d2);
        edittext.setText(((CharSequence) (obj1)));
        String s = getManualSecureBaseUrl(activity);
        obj1 = (EditText)ViewUtil.findViewById(((android.view.View) (obj)), 0x7f1000d3);
        ((EditText) (obj1)).setText(s);
        s = getManualPhoenixUrl(activity);
        obj = (EditText)ViewUtil.findViewById(((android.view.View) (obj)), 0x7f1000d4);
        ((EditText) (obj)).setText(s);
        builder.setPositiveButton(0x7f090292, new android.content.DialogInterface.OnClickListener(activity, edittext, ((EditText) (obj1)), ((EditText) (obj))) {

            final Activity val$activity;
            final EditText val$baseUrlEditText;
            final EditText val$phoenixUrlEditText;
            final EditText val$secureBaseUrlEditText;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                boolean flag = WalmartNetServiceSettings.storeManualUrlIfValid(activity, "manual_baseurl", baseUrlEditText.getText().toString());
                boolean flag1 = WalmartNetServiceSettings.storeManualUrlIfValid(activity, "manual_securebaseurl", secureBaseUrlEditText.getText().toString());
                boolean flag2 = WalmartNetServiceSettings.storeManualUrlIfValid(activity, "manual_phoenixurl", phoenixUrlEditText.getText().toString());
                if (flag && flag1 && flag2)
                {
                    WalmartNetServiceSettings.storeValue(activity, "server_setting", 14);
                    MessageBus.getBus().post(new ServiceConfigChangedEvent());
                    dialoginterface = "Successfully set manual URLs";
                } else
                {
                    String s1;
                    String s2;
                    if (flag)
                    {
                        dialoginterface = "valid";
                    } else
                    {
                        dialoginterface = "invalid";
                    }
                    if (flag1)
                    {
                        s1 = "valid";
                    } else
                    {
                        s1 = "invalid";
                    }
                    if (flag2)
                    {
                        s2 = "valid";
                    } else
                    {
                        s2 = "invalid";
                    }
                    dialoginterface = String.format("All URLs weren't valid. Manual URLs not used.\nBase URL %s\nSecure Base URL %s\nPhoenix URL %s", new Object[] {
                        dialoginterface, s1, s2
                    });
                }
                Toast.makeText(activity, dialoginterface, 1).show();
            }

            
            {
                activity = activity1;
                baseUrlEditText = edittext;
                secureBaseUrlEditText = edittext1;
                phoenixUrlEditText = edittext2;
                super();
            }
        });
        builder.show();
    }

    public static void showFastPickupServerSelectDialog(Context context)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
        builder.setTitle("Select server");
        String as[] = new String[2];
        as[0] = "https://checkin.mobile.walmart.com";
        as[1] = "https://checkin-stg2.mobile.walmart.com";
        String s = loadFastPickupBaseUrl(context);
        byte byte0 = -1;
        int i = 0;
        do
        {
label0:
            {
                int j = byte0;
                if (i < as.length)
                {
                    if (!as[i].equals(s))
                    {
                        break label0;
                    }
                    j = i;
                }
                builder.setSingleChoiceItems(as, j, new android.content.DialogInterface.OnClickListener(j, as, context) {

                    final Context val$context;
                    final int val$index;
                    final String val$strings[];

                    public void onClick(DialogInterface dialoginterface, int k)
                    {
                        if (k != index && k < strings.length)
                        {
                            WalmartNetServiceSettings.storeValue(context, "fast_pickup_server_setting", strings[k]);
                            MessageBus.getBus().post(new ServiceConfigChangedEvent());
                        }
                        dialoginterface.dismiss();
                    }

            
            {
                index = i;
                strings = as;
                context = context1;
                super();
            }
                });
                builder.show();
                return;
            }
            i++;
        } while (true);
    }

    public static void showHapiServerSelectDialog(Activity activity)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(activity);
        builder.setTitle("Select server");
        String as[] = HAPI_SERVER_OPTIONS_STRING_ARRAY;
        int i = loadHapiServiceMode(activity);
        builder.setSingleChoiceItems(as, i, new android.content.DialogInterface.OnClickListener(i, activity) {

            final Activity val$activity;
            final int val$selectedIndex;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                if (j != selectedIndex)
                {
                    WalmartNetServiceSettings.storeValue(activity, "hapi_server_setting", j);
                    MessageBus.getBus().post(new ServiceConfigChangedEvent());
                }
                dialoginterface.dismiss();
            }

            
            {
                selectedIndex = i;
                activity = activity1;
                super();
            }
        });
        builder.show();
    }

    public static void showIrsServerSelectDialog(Activity activity)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(activity);
        builder.setTitle("Select server");
        String as[] = IRS_SERVER_OPTIONS_STRING_ARRAY;
        int i = loadIRSServiceMode(activity);
        builder.setSingleChoiceItems(as, i, new android.content.DialogInterface.OnClickListener(i, activity) {

            final Activity val$activity;
            final int val$selectedIndex;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                if (j != selectedIndex)
                {
                    WalmartNetServiceSettings.storeValue(activity, "irs_server_setting", j);
                    MessageBus.getBus().post(new ServiceConfigChangedEvent());
                }
                dialoginterface.dismiss();
            }

            
            {
                selectedIndex = i;
                activity = activity1;
                super();
            }
        });
        builder.show();
    }

    public static void showMobilePayServerSelectDialog(Context context)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
        builder.setTitle("Select server");
        String as[] = new String[3];
        as[0] = "pay.edge.walmart.com";
        as[1] = "pay-stg1.edge.walmart.com";
        as[2] = "pay-stg2.edge.walmart.com";
        String s = loadMobilePayBaseUrl(context);
        byte byte0 = -1;
        int i = 0;
        do
        {
label0:
            {
                int j = byte0;
                if (i < as.length)
                {
                    if (!as[i].equals(s))
                    {
                        break label0;
                    }
                    j = i;
                }
                builder.setSingleChoiceItems(as, j, new android.content.DialogInterface.OnClickListener(j, as, context) {

                    final Context val$context;
                    final int val$index;
                    final String val$strings[];

                    public void onClick(DialogInterface dialoginterface, int k)
                    {
                        if (k != index && k < strings.length)
                        {
                            WalmartNetServiceSettings.storeValue(context, "mobile_pay_server_setting", strings[k]);
                            MessageBus.getBus().post(new ServiceConfigChangedEvent());
                        }
                        dialoginterface.dismiss();
                    }

            
            {
                index = i;
                strings = as;
                context = context1;
                super();
            }
                });
                builder.show();
                return;
            }
            i++;
        } while (true);
    }

    public static void showServerSelectDialog(Activity activity)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(activity);
        builder.setTitle("Select server");
        String as[] = SERVER_OPTIONS_STRING_ARRAY;
        int i = loadServiceMode(activity);
        builder.setSingleChoiceItems(as, i, new android.content.DialogInterface.OnClickListener(i, activity) {

            final Activity val$activity;
            final int val$selectedIndex;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                if (j != selectedIndex)
                {
                    if (j == 14)
                    {
                        WalmartNetServiceSettings.showEditManualServiceDialog(activity);
                    } else
                    {
                        WalmartNetServiceSettings.storeValue(activity, "server_setting", j);
                        MessageBus.getBus().post(new ServiceConfigChangedEvent());
                    }
                }
                dialoginterface.dismiss();
            }

            
            {
                selectedIndex = i;
                activity = activity1;
                super();
            }
        });
        builder.show();
    }

    public static void showStoreSearchServerDialog(Context context)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
        builder.setTitle("Select server");
        String as[] = STORE_SEARCH_OPTIONS_STRING_ARRAY;
        int i = loadStoreSearchServiceMode(context);
        builder.setSingleChoiceItems(as, i, new android.content.DialogInterface.OnClickListener(i, context) {

            final Context val$context;
            final int val$selectedIndex;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                if (j != selectedIndex)
                {
                    WalmartNetServiceSettings.storeValue(context, "store_search_server_setting", j);
                    MessageBus.getBus().post(new ServiceConfigChangedEvent());
                }
                dialoginterface.dismiss();
            }

            
            {
                selectedIndex = i;
                context = context1;
                super();
            }
        });
        builder.show();
    }

    public static void showWwwServerSelectDialog(Activity activity)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(activity);
        builder.setTitle("Select WWW server");
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = SERVER_OPTIONS_LIST.iterator(); iterator.hasNext(); arraylist.add(((ServerOption)iterator.next()).name)) { }
        int i = loadWwwServiceHost(activity);
        if (i >= arraylist.size())
        {
            i = 0;
        }
        builder.setSingleChoiceItems((CharSequence[])arraylist.toArray(new String[arraylist.size()]), i, new android.content.DialogInterface.OnClickListener(i, activity) {

            final Activity val$activity;
            final int val$selectedIndex;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                if (j != selectedIndex)
                {
                    WalmartNetServiceSettings.storeValue(activity, "www_server_host", j);
                    MessageBus.getBus().post(new ServiceConfigChangedEvent());
                }
                dialoginterface.dismiss();
            }

            
            {
                selectedIndex = i;
                activity = activity1;
                super();
            }
        });
        builder.show();
    }

    private static boolean storeManualUrlIfValid(Context context, String s, String s1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (s1 != null)
        {
            flag = flag1;
            if (Patterns.WEB_URL.matcher(s1).matches())
            {
                context.getSharedPreferences("debug_prefs", 0).edit().putString(s, s1).apply();
                flag = true;
            }
        }
        return flag;
    }

    private static void storeValue(Context context, String s, int i)
    {
        context.getSharedPreferences("debug_prefs", 0).edit().putInt(s, i).apply();
    }

    private static void storeValue(Context context, String s, String s1)
    {
        context.getSharedPreferences("debug_prefs", 0).edit().putString(s, s1).apply();
    }

    public String getBaseUrl()
    {
        return mBaseUrl;
    }

    public String getCustomerHost()
    {
        return mMobilePayHost;
    }

    public String getFastPickupBaseUrl()
    {
        return mFastPickupUrl;
    }

    public android.net.Uri.Builder getHapiBaseUrl()
    {
        return mHapiBaseUrl.buildUpon();
    }

    public String getHapiHost()
    {
        return mHapiBaseUrl.getHost();
    }

    public String getIrsHost()
    {
        return mIrsHost;
    }

    public String getItemReviewsHost()
    {
        return "walmart.ugc.bazaarvoice.com";
    }

    public String getPhoenixUrl()
    {
        return mPhoenixUrl;
    }

    public String getSecureBaseUrl()
    {
        return mSecureBaseUrl;
    }

    public android.net.Uri.Builder getSecureHapiBaseUrl()
    {
        return getHapiBaseUrl().scheme("https");
    }

    public String getStoreSearchHost()
    {
        return mStoreSearchHost;
    }

    public String getWeeklyAdHost()
    {
        return "api.flyertown.com";
    }

    public String getWwwHost()
    {
        return mWwwHost;
    }

    public boolean isServiceMode(int i)
    {
        return mServiceMode == i;
    }

    static 
    {
        bitmapOptions = new android.graphics.BitmapFactory.Options();
        bitmapOptions.inDither = false;
    }









}
