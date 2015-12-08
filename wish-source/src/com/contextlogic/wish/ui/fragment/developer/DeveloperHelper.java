// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.developer;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiConfig;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.cache.PersistedCache;
import com.contextlogic.wish.cache.TransientCache;
import com.contextlogic.wish.facebook.FacebookManager;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.contextlogic.wish.ui.activity.login.LoginActivity;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserPreferences;
import com.contextlogic.wish.util.AddressUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.contextlogic.wish.ui.fragment.developer:
//            ExperimentItem, ExperimentsAdapter, ExperimentsFragment, LoginExperimentsFragment

public class DeveloperHelper
{

    private static String serverItems[] = {
        WishApplication.getAppInstance().getString(0x7f0600de), "www.wish.com", "testing.wish.com", "sandbox.wish.com", "tarek.corp.contextlogic.com", "nop-ubuntu.corp.contextlogic.com", "alireza-ubuntu.corp.contextlogic.com", "jfang.corp.contextlogic.com", "wan.corp.contextlogic.com", "adam-desktop.corp.contextlogic.com", 
        "josh.corp.contextlogic.com", "jim.corp.contextlogic.com", "cluster8.corp.contextlogic.com"
    };

    public DeveloperHelper()
    {
    }

    private static ExperimentItem getExperiment(String s, String as[])
    {
        ExperimentItem experimentitem = new ExperimentItem();
        experimentitem.name = s;
        experimentitem.options = new String[as.length + 2];
        experimentitem.options[0] = "default";
        experimentitem.options[1] = "ignore";
        for (int i = 0; i < as.length; i++)
        {
            experimentitem.options[i + 2] = as[i];
        }

        return experimentitem;
    }

    private static ArrayList getExperiments()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(getExperiment("mobile_wishlist_v2", new String[] {
            "control", "show"
        }));
        arraylist.add(getExperiment("mobile_simple_feed_tile", new String[] {
            "control", "show", "show-v2"
        }));
        arraylist.add(getExperiment("mobile_future_paypal_checkout", new String[] {
            "control", "show"
        }));
        arraylist.add(getExperiment("mobile_klarna_banner_details", new String[] {
            "control", "show"
        }));
        arraylist.add(getExperiment("mobile_default_google_wallet", new String[] {
            "control", "show"
        }));
        arraylist.add(getExperiment("mobile_native_paypal", new String[] {
            "control", "show"
        }));
        arraylist.add(getExperiment("mobile_hide_paypal", new String[] {
            "control", "hide"
        }));
        arraylist.add(getExperiment("mobile_google_checkout", new String[] {
            "control", "show"
        }));
        arraylist.add(getExperiment("mobile_boleto_checkout", new String[] {
            "control", "show"
        }));
        arraylist.add(getExperiment("mobile_klarna_checkout", new String[] {
            "control", "show", "show-v2"
        }));
        arraylist.add(getExperiment("mobile_hide_cc_checkout", new String[] {
            "control", "hide"
        }));
        arraylist.add(getExperiment("mobile_localized_currency", new String[] {
            "control", "show"
        }));
        arraylist.add(getExperiment("mobile_psuedo_localized_currency", new String[] {
            "control", "show"
        }));
        arraylist.add(getExperiment("mobile_klarna_checkout_GB_improvement", new String[] {
            "control", "show"
        }));
        return arraylist;
    }

    static List getServerItems()
    {
        return Arrays.asList(serverItems);
    }

    private static void handleCacheClean(Activity activity)
    {
        PersistedCache.getInstance().clearCache();
        TransientCache.getInstance().clearCache();
        PopupAlertDialog.showSuccess(activity, null, activity.getString(0x7f0600e4));
    }

    private static void handleDone(Activity activity, String s, Boolean boolean1)
    {
        WishApi.getInstance().getConfig().setApiBaseUrlString(s);
        GooglePlusManager.getInstance().resetWalletClient();
        if (LoggedInUser.getInstance().isLoggedIn())
        {
            WishApplication.getAppInstance().logout(activity, false, false, true);
        }
        FacebookManager.getInstance().setUseFacebookDevMode(boolean1.booleanValue());
        if (activity instanceof RootActivity)
        {
            ((RootActivity)activity).dismissModal();
            return;
        } else
        {
            ((LoginActivity)activity).dismissModal();
            return;
        }
    }

    private static void handleWebviewCacheClean(Activity activity)
    {
        try
        {
            (new WebView(activity)).clearCache(true);
        }
        catch (Throwable throwable2) { }
        try
        {
            activity.deleteDatabase("webview.db");
        }
        catch (Throwable throwable1) { }
        try
        {
            activity.deleteDatabase("webviewCache.db");
        }
        catch (Throwable throwable) { }
        PopupAlertDialog.showSuccess(activity, null, activity.getString(0x7f0600e4));
    }

    static void initDeveloperSettingsFragment(Activity activity, View view)
    {
        EditText edittext = (EditText)view.findViewById(0x7f0d01b3);
        edittext.setText(WishApi.getInstance().getConfig().getApiBaseUrlString());
        Object obj = new ArrayAdapter(activity, 0x1090008, getServerItems());
        ((ArrayAdapter) (obj)).setDropDownViewResource(0x1090009);
        Object obj1 = (Spinner)view.findViewById(0x7f0d01b4);
        ((Spinner) (obj1)).setAdapter(((android.widget.SpinnerAdapter) (obj)));
        ((Spinner) (obj1)).setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener(edittext) {

            final EditText val$serverPathText;

            public void onItemSelected(AdapterView adapterview, View view1, int i, long l)
            {
                if (i > 0)
                {
                    serverPathText.setText((CharSequence)DeveloperHelper.getServerItems().get(i));
                }
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                serverPathText = edittext;
                super();
            }
        });
        obj = AddressUtil.getCountries();
        obj1 = new ArrayList();
        ((ArrayList) (obj1)).add("default");
        ((ArrayList) (obj1)).addAll(((HashMap) (obj)).values());
        ArrayAdapter arrayadapter = new ArrayAdapter(activity, 0x1090008, ((List) (obj1)));
        arrayadapter.setDropDownViewResource(0x1090009);
        obj1 = (Spinner)view.findViewById(0x7f0d01b5);
        ((Spinner) (obj1)).setAdapter(arrayadapter);
        String s = WishApi.getInstance().getConfig().getApiCountryCode();
        if (s != null && ((HashMap) (obj)).containsKey(s))
        {
            ((Spinner) (obj1)).setSelection(arrayadapter.getPosition(((HashMap) (obj)).get(s)));
        }
        ((Spinner) (obj1)).setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener(arrayadapter, ((HashMap) (obj))) {

            final ArrayAdapter val$countriesAdapter;
            final HashMap val$countryData;

            public void onItemSelected(AdapterView adapterview, View view1, int i, long l)
            {
                String s1 = (String)countriesAdapter.getItem(i);
                Object obj2 = null;
                adapterview = null;
                view1 = obj2;
                if (s1 != null)
                {
                    view1 = obj2;
                    if (!s1.equals("default"))
                    {
                        Iterator iterator = countryData.entrySet().iterator();
                        do
                        {
                            view1 = adapterview;
                            if (!iterator.hasNext())
                            {
                                break;
                            }
                            view1 = (java.util.Map.Entry)iterator.next();
                            if (((String)view1.getValue()).equals(s1))
                            {
                                adapterview = (String)view1.getKey();
                            }
                        } while (true);
                    }
                }
                WishApi.getInstance().getConfig().setApiCountryCode(view1);
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                countriesAdapter = arrayadapter;
                countryData = hashmap;
                super();
            }
        });
        obj = (CheckBox)view.findViewById(0x7f0d01b8);
        ((CheckBox) (obj)).setChecked(UserPreferences.getUseFbDevMode());
        ((Button)view.findViewById(0x7f0d01ba)).setOnClickListener(new android.view.View.OnClickListener(activity) {

            final Activity val$activity;

            public void onClick(View view1)
            {
                DeveloperHelper.handleCacheClean(activity);
            }

            
            {
                activity = activity1;
                super();
            }
        });
        ((Button)view.findViewById(0x7f0d01bb)).setOnClickListener(new android.view.View.OnClickListener(activity) {

            final Activity val$activity;

            public void onClick(View view1)
            {
                DeveloperHelper.handleWebviewCacheClean(activity);
            }

            
            {
                activity = activity1;
                super();
            }
        });
        ((Button)view.findViewById(0x7f0d01bc)).setOnClickListener(new android.view.View.OnClickListener(((Spinner) (obj1)), activity, edittext, ((CheckBox) (obj))) {

            final Activity val$activity;
            final Spinner val$countriesSpinner;
            final CheckBox val$devFbAppCheckbox;
            final EditText val$serverPathText;

            public void onClick(View view1)
            {
                countriesSpinner.getSelectedItem().toString();
                DeveloperHelper.handleDone(activity, serverPathText.getText().toString(), Boolean.valueOf(devFbAppCheckbox.isChecked()));
            }

            
            {
                countriesSpinner = spinner;
                activity = activity1;
                serverPathText = edittext;
                devFbAppCheckbox = checkbox;
                super();
            }
        });
        ((Button)view.findViewById(0x7f0d01b9)).setOnClickListener(new android.view.View.OnClickListener(activity) {

            final Activity val$activity;

            public void onClick(View view1)
            {
                if (activity instanceof RootActivity)
                {
                    view1 = new ExperimentsFragment();
                    ((RootActivity)activity).setModalContentFragment(view1, false);
                    return;
                } else
                {
                    view1 = new LoginExperimentsFragment();
                    ((LoginActivity)activity).setModalContentFragment(view1, false);
                    return;
                }
            }

            
            {
                activity = activity1;
                super();
            }
        });
        edittext = (EditText)view.findViewById(0x7f0d01b6);
        view = (Button)view.findViewById(0x7f0d01b7);
        if ((activity instanceof RootActivity) && LoggedInUser.getInstance().isLoggedIn() && LoggedInUser.getInstance().getCurrentUser().isAdmin())
        {
            view.setOnClickListener(new android.view.View.OnClickListener(edittext, activity) {

                final Activity val$activity;
                final EditText val$loginCodeText;

                public void onClick(View view1)
                {
                    UserPreferences.setAdminLoginCode(loginCodeText.getText().toString());
                    WishApplication.getAppInstance().logout(activity, true, false, true);
                    if (activity instanceof RootActivity)
                    {
                        ((RootActivity)activity).dismissModal();
                        return;
                    } else
                    {
                        ((LoginActivity)activity).dismissModal();
                        return;
                    }
                }

            
            {
                loginCodeText = edittext;
                activity = activity1;
                super();
            }
            });
            return;
        } else
        {
            edittext.setVisibility(8);
            view.setVisibility(8);
            return;
        }
    }

    static void initExperimentsFragment(Activity activity, View view)
    {
        ArrayList arraylist = getExperiments();
        view = (ListView)view.findViewById(0x7f0d01c3);
        activity = new ExperimentsAdapter(activity, arraylist);
        view.setAdapter(activity);
        activity.notifyDataSetChanged();
    }




}
