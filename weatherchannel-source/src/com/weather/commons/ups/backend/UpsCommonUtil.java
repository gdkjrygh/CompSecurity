// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.util.Log;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.common.base.Supplier;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.weather.beacons.analytics.Analytics;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.ups.LocalyticsUpsSupport;
import com.weather.commons.ups.facade.DsxAccount;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.device.LocaleUtil;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.weather.commons.ups.backend:
//            UpsConstants, AccountManager, AbnormalHttpResponseException, GooglePlusTaskRunner, 
//            GooglePlusConnectionManager

public final class UpsCommonUtil
{
    public static class AbstractWPDialogListener
        implements WPDialogListener
    {

        public void onCancel()
        {
        }

        public void onClickNegative()
        {
        }

        public void onClickNeutral()
        {
        }

        public void onClickPositive()
        {
        }

        public AbstractWPDialogListener()
        {
        }
    }

    public static class DeleteAccountTask extends AsyncTask
    {

        private boolean accountDeleted;
        private final AccountManager accountManager = AccountManager.getInstance();
        private final Activity activity;
        private final boolean isProfileCompletionFragment;
        private boolean permissionsRevoked;
        private final ProgressDialog progressDialog;

        private void cleanup()
        {
            if (accountDeleted && permissionsRevoked)
            {
                activity.onBackPressed();
                if (isProfileCompletionFragment)
                {
                    activity.onBackPressed();
                }
            }
        }

        protected transient Boolean doInBackground(Void avoid[])
        {
            accountManager.deleteAccount();
            accountManager.logout(true);
            LocalyticsUpsSupport.recordAccountDeleted(LocalyticsHandler.getInstance());
            return Boolean.valueOf(true);
            avoid;
            Log.e("UpsCommonUtil", "network issue! Failed to delete account.");
_L2:
            return Boolean.valueOf(false);
            avoid;
            Log.e("UpsCommonUtil", "User login incorrect. Failed to delete account.");
            continue; /* Loop/switch isn't completed */
            avoid;
            Log.e("UpsCommonUtil", "Unknown error occurred while trying to delete account");
            if (true) goto _L2; else goto _L1
_L1:
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected void onPostExecute(Boolean boolean1)
        {
            if (progressDialog != null && progressDialog.isShowing())
            {
                progressDialog.dismiss();
            }
            if (boolean1.booleanValue() && activity != null)
            {
                accountDeleted = true;
                cleanup();
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Boolean)obj);
        }

        protected void onPreExecute()
        {
            super.onPreExecute();
            if (accountManager.getLoginType() == com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_GOOGLE_PLUS)
            {
                (new GooglePlusTaskRunner(new Runnable() {

                    final DeleteAccountTask this$0;

                    public void run()
                    {
                        GooglePlusConnectionManager.getInstance().disconnectAndRevoke();
                        permissionsRevoked = true;
                        cleanup();
                    }

            
            {
                this$0 = DeleteAccountTask.this;
                super();
            }
                }, GooglePlusConnectionManager.getInstance(), new Supplier() {

                    final DeleteAccountTask this$0;

                    public Activity get()
                    {
                        return activity;
                    }

                    public volatile Object get()
                    {
                        return get();
                    }

            
            {
                this$0 = DeleteAccountTask.this;
                super();
            }
                })).execute();
                return;
            } else
            {
                permissionsRevoked = true;
                return;
            }
        }


/*
        static boolean access$002(DeleteAccountTask deleteaccounttask, boolean flag)
        {
            deleteaccounttask.permissionsRevoked = flag;
            return flag;
        }

*/



        public DeleteAccountTask(Activity activity1, boolean flag, ProgressDialog progressdialog)
        {
            activity = activity1;
            isProfileCompletionFragment = flag;
            progressDialog = progressdialog;
        }
    }

    public static final class LocFieldType extends Enum
    {

        private static final LocFieldType $VALUES[];
        public static final LocFieldType KEY_TYPE;
        public static final LocFieldType LAT_LONG;
        public static final LocFieldType UNKNOWN;

        public static LocFieldType valueOf(String s)
        {
            return (LocFieldType)Enum.valueOf(com/weather/commons/ups/backend/UpsCommonUtil$LocFieldType, s);
        }

        public static LocFieldType[] values()
        {
            return (LocFieldType[])$VALUES.clone();
        }

        static 
        {
            LAT_LONG = new LocFieldType("LAT_LONG", 0);
            KEY_TYPE = new LocFieldType("KEY_TYPE", 1);
            UNKNOWN = new LocFieldType("UNKNOWN", 2);
            $VALUES = (new LocFieldType[] {
                LAT_LONG, KEY_TYPE, UNKNOWN
            });
        }

        private LocFieldType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class LoginResponse extends Enum
    {

        private static final LoginResponse $VALUES[];
        public static final LoginResponse AUTHENTICATION_ERROR;
        public static final LoginResponse CONFLICT;
        public static final LoginResponse GENERIC_ERROR;
        public static final LoginResponse JSON_ERROR;
        public static final LoginResponse NETWORK_ERROR;
        public static final LoginResponse SUCCESS;

        public static LoginResponse valueOf(String s)
        {
            return (LoginResponse)Enum.valueOf(com/weather/commons/ups/backend/UpsCommonUtil$LoginResponse, s);
        }

        public static LoginResponse[] values()
        {
            return (LoginResponse[])$VALUES.clone();
        }

        static 
        {
            SUCCESS = new LoginResponse("SUCCESS", 0);
            NETWORK_ERROR = new LoginResponse("NETWORK_ERROR", 1);
            JSON_ERROR = new LoginResponse("JSON_ERROR", 2);
            AUTHENTICATION_ERROR = new LoginResponse("AUTHENTICATION_ERROR", 3);
            CONFLICT = new LoginResponse("CONFLICT", 4);
            GENERIC_ERROR = new LoginResponse("GENERIC_ERROR", 5);
            $VALUES = (new LoginResponse[] {
                SUCCESS, NETWORK_ERROR, JSON_ERROR, AUTHENTICATION_ERROR, CONFLICT, GENERIC_ERROR
            });
        }

        private LoginResponse(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class LoginStatus extends Enum
    {

        private static final LoginStatus $VALUES[];
        public static final LoginStatus LOGGED_IN_TO_ANON_ACCOUNT;
        public static final LoginStatus LOGGED_IN_TO_NAMED_ACCOUNT;
        public static final LoginStatus LOGGED_OUT;
        public static final LoginStatus TOKEN_EXPIRED;
        public static final LoginStatus UNKNOWN;
        private final int value;

        public static LoginStatus valueOf(String s)
        {
            return (LoginStatus)Enum.valueOf(com/weather/commons/ups/backend/UpsCommonUtil$LoginStatus, s);
        }

        public static LoginStatus[] values()
        {
            return (LoginStatus[])$VALUES.clone();
        }

        public int getValue()
        {
            return value;
        }

        static 
        {
            LOGGED_IN_TO_NAMED_ACCOUNT = new LoginStatus("LOGGED_IN_TO_NAMED_ACCOUNT", 0, 1);
            LOGGED_IN_TO_ANON_ACCOUNT = new LoginStatus("LOGGED_IN_TO_ANON_ACCOUNT", 1, 2);
            LOGGED_OUT = new LoginStatus("LOGGED_OUT", 2, 3);
            TOKEN_EXPIRED = new LoginStatus("TOKEN_EXPIRED", 3, 4);
            UNKNOWN = new LoginStatus("UNKNOWN", 4, 5);
            $VALUES = (new LoginStatus[] {
                LOGGED_IN_TO_NAMED_ACCOUNT, LOGGED_IN_TO_ANON_ACCOUNT, LOGGED_OUT, TOKEN_EXPIRED, UNKNOWN
            });
        }

        private LoginStatus(String s, int i, int j)
        {
            super(s, i);
            value = j;
        }
    }

    public static interface WPDialogListener
    {

        public abstract void onCancel();

        public abstract void onClickNegative();

        public abstract void onClickNeutral();

        public abstract void onClickPositive();
    }


    private static final Pattern KEY_TYPE_PATTERN = Pattern.compile(".*:.*:.*");
    private static final Pattern LAT_LONG_PATTERN = Pattern.compile(".*,.*");
    private static final String TAG = "UpsCommonUtil";

    private UpsCommonUtil()
    {
    }

    public static void displayConfirmationDialog(Activity activity, String s, String s1)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        activity = LayoutInflater.from(activity).inflate(com.weather.commons.R.layout.alert_dialog, (ViewGroup)activity.findViewById(com.weather.commons.R.id.layout_alert_dialog));
        builder.setView(activity);
        ((TextView)activity.findViewById(com.weather.commons.R.id.tvTitle)).setText(s);
        ((TextView)activity.findViewById(com.weather.commons.R.id.tvDescription)).setText(s1);
        builder.setNeutralButton(com.weather.commons.R.string.ok, new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
            }

        });
        builder.create().show();
    }

    public static void displaySignUpPromptDialog(Activity activity, int i, int j, WPDialogListener wpdialoglistener, Class class1, Class class2)
    {
        if (activity == null || !LocaleUtil.isDeviceInUS())
        {
            if (wpdialoglistener != null)
            {
                wpdialoglistener.onCancel();
            }
            return;
        }
        View view = LayoutInflater.from(activity).inflate(com.weather.commons.R.layout.alert_dialog, (ViewGroup)activity.findViewById(com.weather.commons.R.id.layout_alert_dialog));
        TextView textview = (TextView)view.findViewById(com.weather.commons.R.id.tvTitle);
        TextView textview1 = (TextView)view.findViewById(com.weather.commons.R.id.tvDescription);
        textview.setText(activity.getString(i));
        textview1.setText(activity.getString(j));
        class1 = (new android.app.AlertDialog.Builder(activity)).setView(view).setPositiveButton(com.weather.commons.R.string.alert_dialog_positive_button_text, new android.content.DialogInterface.OnClickListener(activity, class1, wpdialoglistener) {

            final Activity val$activity;
            final WPDialogListener val$listener;
            final Class val$signUpActivityClass;

            public void onClick(DialogInterface dialoginterface, int k)
            {
                Analytics.trackAction(activity.getString(com.weather.commons.R.string.beacon_ups_pitch_signup), null);
                activity.startActivity(new Intent(activity, signUpActivityClass));
                if (listener != null)
                {
                    listener.onClickPositive();
                }
                dialoginterface.dismiss();
            }

            
            {
                activity = activity1;
                signUpActivityClass = class1;
                listener = wpdialoglistener;
                super();
            }
        }).setNegativeButton(com.weather.commons.R.string.alert_dialog_negative_button_text, new android.content.DialogInterface.OnClickListener(activity, wpdialoglistener) {

            final Activity val$activity;
            final WPDialogListener val$listener;

            public void onClick(DialogInterface dialoginterface, int k)
            {
                Analytics.trackAction(activity.getString(com.weather.commons.R.string.beacon_ups_pitch_later), null);
                if (listener != null)
                {
                    listener.onClickNegative();
                }
            }

            
            {
                activity = activity1;
                listener = wpdialoglistener;
                super();
            }
        }).setOnCancelListener(new android.content.DialogInterface.OnCancelListener(activity, wpdialoglistener) {

            final Activity val$activity;
            final WPDialogListener val$listener;

            public void onCancel(DialogInterface dialoginterface)
            {
                Analytics.trackAction(activity.getString(com.weather.commons.R.string.beacon_ups_pitch_later), null);
                if (listener != null)
                {
                    listener.onCancel();
                }
            }

            
            {
                activity = activity1;
                listener = wpdialoglistener;
                super();
            }
        });
        if (class2 != null)
        {
            class1.setNeutralButton(com.weather.commons.R.string.alert_dialog_login_button_text, new android.content.DialogInterface.OnClickListener(activity, class2, wpdialoglistener) {

                final Activity val$activity;
                final WPDialogListener val$listener;
                final Class val$loginActivityClass;

                public void onClick(DialogInterface dialoginterface, int k)
                {
                    activity.startActivity(new Intent(activity, loginActivityClass));
                    if (listener != null)
                    {
                        listener.onClickNeutral();
                    }
                    dialoginterface.dismiss();
                }

            
            {
                activity = activity1;
                loginActivityClass = class1;
                listener = wpdialoglistener;
                super();
            }
            });
        }
        class1.create().show();
    }

    public static boolean fixedLocationsChanged(List list, List list1)
    {
        if (list.size() == list1.size()) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        int i = 0;
_L6:
        Object obj;
        SavedLocation savedlocation;
        if (i >= list.size())
        {
            break MISSING_BLOCK_LABEL_367;
        }
        obj = (SavedLocation)list.get(i);
        savedlocation = (SavedLocation)list1.get(i);
        if (!((SavedLocation) (obj)).equals(savedlocation) || ((SavedLocation) (obj)).hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.pollen) != savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.pollen) || ((SavedLocation) (obj)).hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.heavy_rain) != savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.heavy_rain) || ((SavedLocation) (obj)).hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.thunderstorm) != savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.thunderstorm) || ((SavedLocation) (obj)).hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.extreme_heat) != savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.extreme_heat) || ((SavedLocation) (obj)).hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.high_wind) != savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.high_wind) || ((SavedLocation) (obj)).hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.dense_fog) != savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.dense_fog) || ((SavedLocation) (obj)).hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.extreme_cold) != savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.extreme_cold) || ((SavedLocation) (obj)).hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.heavy_snowfall) != savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.heavy_snowfall) || ((SavedLocation) (obj)).hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.ice) != savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.ice) || ((SavedLocation) (obj)).hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.severe) != savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.severe) || ((SavedLocation) (obj)).hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.rainSnow) != savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.rainSnow)) goto _L1; else goto _L3
_L3:
        Object obj1;
        Object obj2;
        obj2 = ((SavedLocation) (obj)).getTags();
        obj1 = savedlocation.getTags();
        if (((Set) (obj2)).size() != ((Set) (obj1)).size()) goto _L1; else goto _L4
_L4:
        for (obj2 = ((Set) (obj2)).iterator(); ((Iterator) (obj2)).hasNext();)
        {
            if (!((Set) (obj1)).contains((String)((Iterator) (obj2)).next()))
            {
                return true;
            }
        }

        obj1 = ((SavedLocation) (obj)).getAddress();
        obj = obj1;
        if (obj1 == null)
        {
            obj = "";
        }
        if (!((String) (obj)).equals(savedlocation.getAddress())) goto _L1; else goto _L5
_L5:
        i++;
          goto _L6
        return false;
    }

    public static DsxAccount getAnonAccount()
    {
        return new DsxAccount(UpsConstants.getAndroidDeviceId(), "", com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_ANONYMOUS);
    }

    public static String getCurrentLocaleStringInLowerCase(Context context)
    {
        context = context.getResources().getConfiguration().locale;
        return String.format("%s-%s", new Object[] {
            context.getLanguage(), context.getCountry()
        }).toLowerCase(Locale.US);
    }

    public static LocFieldType getFieldType(CharSequence charsequence)
    {
        if (LAT_LONG_PATTERN.matcher(charsequence).matches())
        {
            return LocFieldType.LAT_LONG;
        }
        if (KEY_TYPE_PATTERN.matcher(charsequence).matches())
        {
            return LocFieldType.KEY_TYPE;
        } else
        {
            return LocFieldType.UNKNOWN;
        }
    }

    public static Double[] getLatLong(String s)
    {
        Object obj = null;
        String as[] = s.split(",");
        s = obj;
        if (as.length == 2)
        {
            s = new Double[2];
            try
            {
                s[0] = Double.valueOf(Double.parseDouble(as[0]));
                s[1] = Double.valueOf(Double.parseDouble(as[1]));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
        }
        return s;
    }

    public static Long getUnixTimestampFromCookie(String s)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("EEE, dd-MMM-yyyy HH:mm:ss z", Locale.ENGLISH);
        long l;
        try
        {
            s = s.split(";");
            l = simpledateformat.parse(s[s.length - 1].split("=")[1]).getTime();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("UpsCommonUtil", s.getMessage(), s);
            return null;
        }
        return Long.valueOf(l);
    }

    public static boolean isEmail(CharSequence charsequence)
    {
        return Patterns.EMAIL_ADDRESS.matcher(charsequence).matches();
    }

    public static boolean isLoggedIntoNamedAccount()
    {
        return TwcPrefs.getInstance().getInt(com.weather.util.prefs.TwcPrefs.Keys.USER_LOGIN_STATUS, LoginStatus.LOGGED_OUT.getValue()) == LoginStatus.LOGGED_IN_TO_NAMED_ACCOUNT.getValue();
    }

    public static Multimap parseAccountIds(String s)
    {
        HashMultimap hashmultimap;
        JSONArray jsonarray;
        hashmultimap = HashMultimap.create();
        jsonarray = new JSONArray(s);
        int i = 0;
        int j = jsonarray.length();
_L2:
        s = hashmultimap;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        int k;
        s = jsonarray.getString(i);
        k = s.indexOf('/');
        if (k < 0)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        if (k > s.length() - 1)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        com.weather.commons.ups.facade.DsxAccount.AccountProvider accountprovider = com.weather.commons.ups.facade.DsxAccount.AccountProvider.STATIC.convert(s.substring(0, k));
        if (accountprovider == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        try
        {
            hashmultimap.put(accountprovider, s.substring(k + 1));
            break MISSING_BLOCK_LABEL_119;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("UpsCommonUtil", "Got malformed account list", s);
            s = HashMultimap.create();
        }
        return s;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
