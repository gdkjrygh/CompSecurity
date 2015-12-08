// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceGroup;
import android.preference.PreferenceScreen;
import android.preference.SwitchPreference;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Adapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.sessionm.api.SessionM;
import com.weather.Weather.locations.FindMeUtil;
import com.weather.Weather.locations.adapters.LocationListAdapter;
import com.weather.Weather.locations.adapters.policy.AllLocationsInclusionPolicy;
import com.weather.Weather.locations.adapters.policy.FollowMePolicy;
import com.weather.Weather.locations.adapters.policy.ListOrderPolicy;
import com.weather.Weather.locations.adapters.policy.NoLocationSelectedOnInitPolicy;
import com.weather.Weather.locations.adapters.policy.OmnitureBeaconConfig;
import com.weather.Weather.push.GcmService;
import com.weather.Weather.settings.alerts.WeatherAlertsSettingsFragment;
import com.weather.Weather.ups.ui.LoginActivity;
import com.weather.Weather.ups.ui.SignUpActivity;
import com.weather.beacons.analytics.Analytics;
import com.weather.beacons.targeting.BeaconTargetingParam;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.settings.LocalyticsGeneralSettingsAttribute;
import com.weather.commons.analytics.settings.LocalyticsGeneralSettingsAttributeValue;
import com.weather.commons.analytics.settings.LocalyticsGeneralSettingsSummaryRecorder;
import com.weather.commons.analytics.ups.LocalyticsUpsSignupSource;
import com.weather.commons.analytics.ups.LocalyticsUpsSupport;
import com.weather.commons.service.AbstractNotificationService;
import com.weather.commons.ups.backend.AccountManager;
import com.weather.commons.ups.ui.AccountSettingsFragment;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.locations.FixedLocationsSnapshot;
import com.weather.dal2.locations.FollowMe;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.locations.SavedLocationsSnapshot;
import com.weather.dal2.system.TwcBus;
import com.weather.util.DataUnits;
import com.weather.util.UnitType;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.app.FragmentHelper;
import com.weather.util.device.DeviceUtils;
import com.weather.util.device.LocaleUtil;
import com.weather.util.lbs.LbsUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import com.weather.util.sessionm.SessionMUtils;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.weather.Weather.settings:
//            AboutFragment, OnGoingTemperatureSettingsFragment

public class SettingsFragment extends PreferenceFragment
{

    private static final String TAG = "SettingsFragment";
    private static boolean unitsChanged;
    private final AccountManager accountManager;
    private Preference accountSetting;
    private PreferenceCategory accountSettingSection;
    private Activity activity;
    private final LocalyticsHandler localyticsHandler;
    private Preference login;
    private PreferenceGroup prefGroup;
    private Preference signUp;
    private Preference temperatureNotifications;
    private ListPreference units;
    private SwitchPreference useLBS;
    private SwitchPreference useSessionM;

    public SettingsFragment()
    {
        this(LocalyticsHandler.getInstance());
    }

    SettingsFragment(LocalyticsHandler localyticshandler)
    {
        accountManager = AccountManager.getInstance();
        localyticsHandler = localyticshandler;
    }

    private void changePreference()
    {
        int i = TwcPrefs.getInstance().getInt(com.weather.util.prefs.TwcPrefs.Keys.USER_LOGIN_STATUS, com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.LOGGED_OUT.getValue());
        LogUtil.d("SettingsFragment", LoggingMetaTags.TWC_UPS, "loginStatus=%s", new Object[] {
            Integer.valueOf(i)
        });
        if (!DeviceUtils.isNetworkAvailable(AbstractTwcApplication.getRootContext()) || i == com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.UNKNOWN.getValue())
        {
            if (accountSettingSection != null)
            {
                getPreferenceScreen().removePreference(accountSettingSection);
            }
            LogUtil.d("SettingsFragment", LoggingMetaTags.TWC_UPS, "account settings removed, locale=%s", new Object[] {
                LocaleUtil.getLocale()
            });
        } else
        {
            if (i == com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.LOGGED_IN_TO_NAMED_ACCOUNT.getValue())
            {
                if (accountSettingSection != null)
                {
                    getPreferenceScreen().addPreference(accountSettingSection);
                    prefGroup.removePreference(login);
                    prefGroup.removePreference(signUp);
                    prefGroup.addPreference(accountSetting);
                }
                if (accountSetting != null)
                {
                    com.weather.commons.ups.facade.DsxAccount.AccountProvider accountprovider = accountManager.getLoginType();
                    String s = "";
                    if (accountprovider != null)
                    {
                        s = accountprovider.getProviderName(getActivity());
                    }
                    accountSetting.setSummary(s);
                }
                LogUtil.d("SettingsFragment", LoggingMetaTags.TWC_UPS, "account settings added - logout and edit", new Object[0]);
                return;
            }
            if (accountSettingSection != null)
            {
                getPreferenceScreen().addPreference(accountSettingSection);
                prefGroup.removePreference(accountSetting);
                prefGroup.addPreference(login);
                prefGroup.addPreference(signUp);
                LogUtil.d("SettingsFragment", LoggingMetaTags.TWC_UPS, "account settings added - login and signup", new Object[0]);
                return;
            }
        }
    }

    private void initFollowMePreference()
    {
        useLBS = (SwitchPreference)findPreference("settings_lbs");
        if (useLBS != null)
        {
            useLBS.setChecked(TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.USE_LBS, false));
            useLBS.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

                final SettingsFragment this$0;

                public boolean onPreferenceChange(Preference preference, Object obj)
                {
                    obj = (Boolean)obj;
                    boolean flag;
                    boolean flag1;
                    if (((Boolean) (obj)).booleanValue())
                    {
                        preference = LocalyticsGeneralSettingsAttributeValue.ON;
                    } else
                    {
                        preference = LocalyticsGeneralSettingsAttributeValue.OFF;
                    }
                    localyticsHandler.getGeneralSettingsSummaryRecorder().putValue(LocalyticsGeneralSettingsAttribute.FOLLOW_ME_FORECAST_CLICKED, preference.getAttributeValue());
                    flag1 = true;
                    if (((Boolean) (obj)).booleanValue())
                    {
                        flag = flag1;
                        if (!LbsUtil.getInstance().isLbsAvailable())
                        {
                            FindMeUtil.showLBSDisabledDialogFragment(activity).show();
                            flag = false;
                        }
                    } else
                    {
                        preference = FollowMe.getInstance().getLocation();
                        flag = flag1;
                        if (preference != null)
                        {
                            flag = flag1;
                            if (preference.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.temperature))
                            {
                                AbstractNotificationService.cancelNotification(getActivity());
                                return true;
                            }
                        }
                    }
                    return flag;
                }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
            });
        }
    }

    private void initPreferenceTouchedForLocalytics(Preference preference, final LocalyticsGeneralSettingsAttribute attribute)
    {
        if (preference != null)
        {
            preference.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

                final SettingsFragment this$0;
                final LocalyticsGeneralSettingsAttribute val$attribute;

                public boolean onPreferenceClick(Preference preference1)
                {
                    localyticsHandler.getGeneralSettingsSummaryRecorder().putValueIfAbsent(attribute, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
                    return false;
                }

            
            {
                this$0 = SettingsFragment.this;
                attribute = localyticsgeneralsettingsattribute;
                super();
            }
            });
        }
    }

    private void initSessionMPreferences()
    {
        boolean flag = false;
        Preference preference = findPreference("settings_sessionm");
        useSessionM = (SwitchPreference)findPreference("settings_sessionm_switch");
        if (SessionMUtils.isActive())
        {
            if (!TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.SESSIONM_OPTED_OUT, false))
            {
                flag = true;
            }
            if (useSessionM != null)
            {
                if (useSessionM.isChecked() != flag)
                {
                    useSessionM.setChecked(flag);
                }
                useSessionM.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

                    final SettingsFragment this$0;

                    public boolean onPreferenceChange(Preference preference1, Object obj)
                    {
                        preference1 = null;
                        if (obj instanceof Boolean)
                        {
                            preference1 = (Boolean)obj;
                        }
                        if (preference1 != null)
                        {
                            com.weather.util.prefs.TwcPrefs.Keys keys;
                            boolean flag1;
                            if (preference1.booleanValue())
                            {
                                obj = LocalyticsGeneralSettingsAttributeValue.ON;
                            } else
                            {
                                obj = LocalyticsGeneralSettingsAttributeValue.OFF;
                            }
                            localyticsHandler.getGeneralSettingsSummaryRecorder().putValue(LocalyticsGeneralSettingsAttribute.SESSION_M_CLICKED, ((LocalyticsGeneralSettingsAttributeValue) (obj)).getAttributeValue());
                            obj = TwcPrefs.getInstance();
                            keys = com.weather.util.prefs.TwcPrefs.Keys.SESSIONM_OPTED_OUT;
                            if (!preference1.booleanValue())
                            {
                                flag1 = true;
                            } else
                            {
                                flag1 = false;
                            }
                            ((Prefs) (obj)).putBoolean(keys, flag1);
                        }
                        return true;
                    }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
                });
            }
            if (preference != null)
            {
                preference.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

                    final SettingsFragment this$0;

                    public boolean onPreferenceClick(Preference preference1)
                    {
                        localyticsHandler.getGeneralSettingsSummaryRecorder().putValueIfAbsent(LocalyticsGeneralSettingsAttribute.VIEW_YOUR_MPOINTS_CLICKED, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
                        Analytics.trackAction(getResources().getString(0x7f0704c8), null);
                        SessionM.getInstance().presentActivity(com.sessionm.api.SessionM.ActivityType.PORTAL);
                        return true;
                    }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
                });
            }
        } else
        {
            PreferenceScreen preferencescreen = (PreferenceScreen)findPreference("preference_screen");
            if (preferencescreen != null)
            {
                PreferenceCategory preferencecategory = (PreferenceCategory)findPreference("settings_weather_rewards");
                if (preferencecategory != null)
                {
                    preferencescreen.removePreference(preferencecategory);
                    return;
                }
            }
        }
    }

    private void initUnitsPreference()
    {
        units = (ListPreference)findPreference("settings_units");
        if (units != null)
        {
            units.setValueIndex(DataUnits.getCurrentUnitType().getIndex());
            Object obj = units.getEntry();
            units.setSummary(((CharSequence) (obj)));
            ListPreference listpreference = units;
            if (obj != null)
            {
                obj = ((CharSequence) (obj)).toString();
            } else
            {
                obj = "";
            }
            listpreference.setValue(((String) (obj)));
            units.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

                final SettingsFragment this$0;

                public boolean onPreferenceClick(Preference preference)
                {
                    localyticsHandler.getGeneralSettingsSummaryRecorder().putValueIfAbsent(LocalyticsGeneralSettingsAttribute.UNITS_OF_MEASURE_CLICKED, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
                    return true;
                }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
            });
            units.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

                final SettingsFragment this$0;

                public boolean onPreferenceChange(Preference preference, Object obj1)
                {
                    units.setSummary(obj1.toString());
                    units.setValue(obj1.toString());
                    preference = units.getValue();
                    preference = DataUnits.getUnitType(units.findIndexOfValue(preference));
                    if (DataUnits.setCurrentUnitType(preference))
                    {
                        DataAccessLayer.BUS.post(preference);
                        SettingsFragment.unitsChanged = true;
                    }
                    return true;
                }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
            });
        }
    }

    private void savePreferences()
    {
        boolean flag2 = true;
        Object obj = TwcPrefs.getInstance();
        if (useLBS != null)
        {
            boolean flag = useLBS.isChecked();
            if (((Prefs) (obj)).getBoolean(com.weather.util.prefs.TwcPrefs.Keys.USE_LBS, true) != flag)
            {
                ((Prefs) (obj)).putBoolean(com.weather.util.prefs.TwcPrefs.Keys.USE_LBS, flag);
                if (!flag)
                {
                    ((Prefs) (obj)).putBoolean(com.weather.util.prefs.TwcPrefs.Keys.REAL_TIME_RAIN_ALERTS, false);
                    ((Prefs) (obj)).putBoolean(com.weather.util.prefs.TwcPrefs.Keys.LIGHTNING_ALERTS, false);
                }
                Object obj1;
                int i;
                boolean flag3;
                if (LbsUtil.getInstance().isLbsEnabledForAppAndDevice())
                {
                    FollowMe.getInstance().activateLbs(-1);
                } else
                {
                    FollowMe.getInstance().removeFollowMe();
                }
            }
        }
        if (useSessionM != null)
        {
            flag3 = useSessionM.isChecked();
            boolean flag1;
            if (!TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.SESSIONM_OPTED_OUT, false))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1 != flag3)
            {
                obj1 = com.weather.util.prefs.TwcPrefs.Keys.SESSIONM_OPTED_OUT;
                if (!flag3)
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
                ((Prefs) (obj)).putBoolean(((Enum) (obj1)), flag1);
            }
        }
        obj = units.getValue();
        i = units.findIndexOfValue(((String) (obj)));
        if (unitsChanged)
        {
            DataAccessLayer.BUS.post(DataUnits.getUnitType(i));
            obj = new EnumMap(com/weather/beacons/targeting/BeaconTargetingParam);
            obj1 = DataUnits.getUnitType(i);
            ((Map) (obj)).put(BeaconTargetingParam.UNITS, ((UnitType) (obj1)).toString());
            Analytics.trackAction(getResources().getString(0x7f0704c9), ((Map) (obj)));
            localyticsHandler.getGeneralSettingsSummaryRecorder().putValueIfAbsent(LocalyticsGeneralSettingsAttribute.UNITS_OF_MEASURE_CHANGED, LocalyticsGeneralSettingsAttributeValue.toLocalyticsUnitType(((UnitType) (obj1))));
            unitsChanged = false;
        }
    }

    private void setTemperatureNotificationsSummary()
    {
label0:
        {
            LocationListAdapter locationlistadapter = new LocationListAdapter(activity, new SavedLocationsSnapshot(), FollowMePolicy.EXCLUDED, ListOrderPolicy.CHANGEABLE, OmnitureBeaconConfig.NULL, new AllLocationsInclusionPolicy(), new NoLocationSelectedOnInitPolicy());
            Object obj = new SavedLocationsSnapshot();
            if (locationlistadapter.getCount() != 0 || LbsUtil.getInstance().isLbsEnabledForAppAndDevice())
            {
                StringBuilder stringbuilder = new StringBuilder();
                SavedLocation savedlocation = ((SavedLocationsSnapshot) (obj)).getFollowMeLocation();
                if (savedlocation != null && savedlocation.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.temperature))
                {
                    stringbuilder.append(savedlocation.getFormattedLocationName());
                    stringbuilder.append(" - ");
                    stringbuilder.append(getString(0x7f070124)).append(", ");
                }
                obj = ((SavedLocationsSnapshot) (obj)).fixed().viewLocations().iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    SavedLocation savedlocation1 = (SavedLocation)((Iterator) (obj)).next();
                    if (savedlocation1.hasAlert(com.weather.dal2.locations.SavedLocation.AlertType.temperature))
                    {
                        stringbuilder.append(savedlocation1.getFormattedLocationName());
                        stringbuilder.append(", ");
                    }
                } while (true);
                if (stringbuilder.length() == 0)
                {
                    break label0;
                }
                stringbuilder.delete(stringbuilder.length() - 2, stringbuilder.length());
                temperatureNotifications.setSummary(stringbuilder);
            }
            return;
        }
        temperatureNotifications.setSummary(0x7f070020);
    }

    public void initializeActionBar(PreferenceScreen preferencescreen)
    {
        final Dialog dialog;
label0:
        {
            ViewParent viewparent;
label1:
            {
                dialog = preferencescreen.getDialog();
                if (dialog != null)
                {
                    preferencescreen = dialog.getActionBar();
                    if (preferencescreen != null)
                    {
                        preferencescreen.setDisplayHomeAsUpEnabled(true);
                        setActionBarColor(preferencescreen);
                    }
                    preferencescreen = dialog.findViewById(0x102002c);
                    if (preferencescreen != null)
                    {
                        dialog = new android.view.View.OnClickListener() {

                            final SettingsFragment this$0;
                            final Dialog val$dialog;

                            public void onClick(View view)
                            {
                                dialog.dismiss();
                            }

            
            {
                this$0 = SettingsFragment.this;
                dialog = dialog1;
                super();
            }
                        };
                        viewparent = preferencescreen.getParent();
                        if (!(viewparent instanceof FrameLayout))
                        {
                            break label0;
                        }
                        preferencescreen = (ViewGroup)viewparent.getParent();
                        if (!(preferencescreen instanceof LinearLayout))
                        {
                            break label1;
                        }
                        preferencescreen.setOnClickListener(dialog);
                    }
                }
                return;
            }
            ((FrameLayout)viewparent).setOnClickListener(dialog);
            return;
        }
        preferencescreen.setOnClickListener(dialog);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        activity = getActivity();
        if (activity == null)
        {
            return;
        }
        if (GcmService.checkPlayServices(activity))
        {
            addPreferencesFromResource(0x7f050002);
        } else
        {
            addPreferencesFromResource(0x7f050001);
        }
        localyticsHandler.getGeneralSettingsSummaryRecorder().putValueIfAbsent(LocalyticsGeneralSettingsAttribute.ACCOUNT_SETTINGS_OPENED, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
        bundle = findPreference("settings_about");
        if (bundle != null)
        {
            bundle.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

                final SettingsFragment this$0;

                public boolean onPreferenceClick(Preference preference)
                {
                    localyticsHandler.getGeneralSettingsSummaryRecorder().putValueIfAbsent(LocalyticsGeneralSettingsAttribute.ABOUT_THIS_APP_CLICKED, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
                    FragmentHelper.switchToNewFragment(getFragmentManager(), new AboutFragment());
                    return true;
                }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
            });
        }
        accountSetting = findPreference("account_settings");
        accountSettingSection = (PreferenceCategory)findPreference("settings_account");
        temperatureNotifications = findPreference("settings_temperature_notifications");
        temperatureNotifications.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

            final SettingsFragment this$0;

            public boolean onPreferenceClick(Preference preference)
            {
                localyticsHandler.getGeneralSettingsSummaryRecorder().putValueIfAbsent(LocalyticsGeneralSettingsAttribute.ONGOING_TEMPERATURE_CLICKED, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
                FragmentHelper.switchToNewFragment(getFragmentManager(), new OnGoingTemperatureSettingsFragment());
                return true;
            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
        });
        initUnitsPreference();
        signUp = findPreference("settings_signup");
        if (signUp != null)
        {
            signUp.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

                final SettingsFragment this$0;

                public boolean onPreferenceClick(Preference preference)
                {
                    LocalyticsUpsSupport.recordSignupStarted(localyticsHandler, LocalyticsUpsSignupSource.SETTINGS);
                    startActivity(new Intent(activity, com/weather/Weather/ups/ui/SignUpActivity));
                    return true;
                }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
            });
        }
        login = findPreference("settings_login");
        if (login != null)
        {
            login.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

                final SettingsFragment this$0;

                public boolean onPreferenceClick(Preference preference)
                {
                    localyticsHandler.getGeneralSettingsSummaryRecorder().putValue(LocalyticsGeneralSettingsAttribute.LOGOUT_LOGIN_CLICKED, LocalyticsGeneralSettingsAttributeValue.LOGIN.getAttributeValue());
                    Analytics.trackAction(getResources().getString(0x7f0704d1), null);
                    startActivity(new Intent(activity, com/weather/Weather/ups/ui/LoginActivity));
                    return true;
                }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
            });
        }
        bundle = findPreference("alert_settings");
        if (bundle != null)
        {
            bundle.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

                final SettingsFragment this$0;

                public boolean onPreferenceClick(Preference preference)
                {
                    localyticsHandler.getGeneralSettingsSummaryRecorder().putValueIfAbsent(LocalyticsGeneralSettingsAttribute.WEATHER_ALERTS_CLICKED, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
                    FragmentHelper.switchToNewFragment(getFragmentManager(), new WeatherAlertsSettingsFragment());
                    return true;
                }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
            });
        }
        initPreferenceTouchedForLocalytics(findPreference("settings_privacy_policy"), LocalyticsGeneralSettingsAttribute.PRIVACY_POLICY_CLICKED);
        initPreferenceTouchedForLocalytics(findPreference("settings_terms"), LocalyticsGeneralSettingsAttribute.TERMS_OF_USE_CLICKED);
        initPreferenceTouchedForLocalytics(findPreference("settings_ad_choices"), LocalyticsGeneralSettingsAttribute.AD_CHOICES_CLICKED);
        if (LocaleUtil.isDeviceInGermanyGerman())
        {
            bundle = findPreference("settings_feedback");
            if (bundle != null)
            {
                bundle.setOnPreferenceClickListener(new android.preference.Preference.OnPreferenceClickListener() {

                    final SettingsFragment this$0;

                    public boolean onPreferenceClick(Preference preference)
                    {
                        localyticsHandler.getGeneralSettingsSummaryRecorder().putValueIfAbsent(com.weather.commons.analytics.LocalyticsTags.Tags.SETTINGS_FEEDBACK, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
                        LogUtil.d("SettingsFragment", LoggingMetaTags.TWC_GENERAL, "sending mail", new Object[0]);
                        preference = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:"));
                        preference.putExtra("android.intent.extra.EMAIL", new String[] {
                            getResources().getString(0x7f07051b)
                        });
                        preference.putExtra("android.intent.extra.SUBJECT", getResources().getString(0x7f07051c));
                        try
                        {
                            startActivity(preference);
                            LogUtil.d("SettingsFragment", LoggingMetaTags.TWC_GENERAL, "Finished sending email", new Object[0]);
                        }
                        // Misplaced declaration of an exception variable
                        catch (Preference preference)
                        {
                            LogUtil.e("SettingsFragment", LoggingMetaTags.TWC_GENERAL, "There is no email client installed.", new Object[] {
                                preference
                            });
                            return true;
                        }
                        return true;
                    }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
                });
            }
        } else
        {
            initPreferenceTouchedForLocalytics(findPreference("settings_feedback"), LocalyticsGeneralSettingsAttribute.FEEDBACK_CLICKED);
        }
        initSessionMPreferences();
        initFollowMePreference();
        prefGroup = (PreferenceGroup)findPreference("settings_account");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (layoutinflater != null)
        {
            ((ViewGroup)((ListView)layoutinflater.findViewById(0x102000a)).getParent()).setPadding(10, 20, 10, 10);
            setTemperatureNotificationsSummary();
        }
        return layoutinflater;
    }

    public void onDestroy()
    {
        if (getActivity().isFinishing())
        {
            LocalyticsHandler.getInstance().tagSummaryEvent(LocalyticsEvent.GENERAL_SETTINGS_SUMMARY);
        }
        super.onDestroy();
    }

    public void onPause()
    {
        savePreferences();
        super.onPause();
    }

    public boolean onPreferenceTreeClick(PreferenceScreen preferencescreen, Preference preference)
    {
        super.onPreferenceTreeClick(preferencescreen, preference);
        if (preference instanceof PreferenceScreen)
        {
            initializeActionBar((PreferenceScreen)preference);
        }
        if (preference == accountSetting)
        {
            Analytics.trackAction(getResources().getString(0x7f0704d3), null);
            try
            {
                FragmentHelper.switchToNewFragment(getFragmentManager(), new AccountSettingsFragment());
            }
            // Misplaced declaration of an exception variable
            catch (PreferenceScreen preferencescreen)
            {
                Log.e("SettingsFragment", preferencescreen.getMessage(), preferencescreen);
            }
        }
        return false;
    }

    public void onResume()
    {
        super.onResume();
        ActionBar actionbar = activity.getActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(0x7f070272);
        }
        changePreference();
    }

    protected void setActionBarColor(final ActionBar actionBar)
    {
        Drawable drawable = getResources().getDrawable(0x7f0b0003);
        actionBar.setBackgroundDrawable(drawable);
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            drawable.setCallback(new android.graphics.drawable.Drawable.Callback() {

                final SettingsFragment this$0;
                final ActionBar val$actionBar;

                public void invalidateDrawable(Drawable drawable1)
                {
                    actionBar.setBackgroundDrawable(drawable1);
                }

                public void scheduleDrawable(Drawable drawable1, Runnable runnable, long l)
                {
                }

                public void unscheduleDrawable(Drawable drawable1, Runnable runnable)
                {
                }

            
            {
                this$0 = SettingsFragment.this;
                actionBar = actionbar;
                super();
            }
            });
        }
    }





/*
    static boolean access$302(boolean flag)
    {
        unitsChanged = flag;
        return flag;
    }

*/
}
