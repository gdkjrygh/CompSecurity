// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.weather.Weather.settings.testmode.TestModeFragment;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.config.ConfigPrefs;
import com.weather.commons.locations.SQSLocationUpdateUtil;
import com.weather.util.app.FragmentHelper;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;

public class AboutFragment extends Fragment
{
    private static final class URLSpanNoUnderline extends URLSpan
    {

        public void updateDrawState(TextPaint textpaint)
        {
            super.updateDrawState(textpaint);
            textpaint.setUnderlineText(false);
        }

        URLSpanNoUnderline(String s)
        {
            super(s);
        }
    }


    private static final int COMPOUND_DRAWABLE_PADDING = 15;
    private static final String TAG = "AboutFragment";
    private View testModeSettings;
    private Toast toast;

    public AboutFragment()
    {
    }

    private void openWebPage(String s)
    {
        s = new Intent("android.intent.action.VIEW", Uri.parse(s));
        Activity activity = getActivity();
        if (activity != null)
        {
            activity.startActivity(s);
        }
    }

    private void setupCrashTrigger(View view)
    {
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final AboutFragment this$0;

            public void onClick(View view1)
            {
                getFragmentManager().beginTransaction().addToBackStack(getClass().getName()).commit();
                FragmentHelper.switchToNewFragment(getFragmentManager(), new TestModeFragment());
            }

            
            {
                this$0 = AboutFragment.this;
                super();
            }
        });
    }

    private void setupTestModeTrigger(TextView textview)
    {
        textview.setOnClickListener(new android.view.View.OnClickListener() {

            static final int CLICKS_TO_ACTIVATE = 7;
            static final int CLICKS_TO_REVEAL = 3;
            private int onClickCount;
            final AboutFragment this$0;

            public void onClick(View view)
            {
                onClickCount = onClickCount + 1;
                view = getActivity();
                if (onClickCount > 3 && onClickCount < 7 && view != null)
                {
                    if (toast != null)
                    {
                        toast.cancel();
                    }
                    toast = Toast.makeText(view, (new StringBuilder()).append(7 - onClickCount).append(" clicks away from test mode").toString(), 0);
                    toast.show();
                }
                if (onClickCount >= 7)
                {
                    if (testModeSettings != null)
                    {
                        testModeSettings.setVisibility(0);
                    }
                    if (view != null)
                    {
                        if (toast != null)
                        {
                            toast.cancel();
                        }
                        toast = Toast.makeText(view, "Test Mode Activated, now restart the app", 1);
                        toast.show();
                    }
                    TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.TEST_MODE, true);
                    ConfigPrefs.clearAll();
                }
            }

            
            {
                this$0 = AboutFragment.this;
                super();
            }
        });
        textview.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            final AboutFragment this$0;

            public boolean onLongClick(View view)
            {
                if (testModeSettings != null)
                {
                    testModeSettings.setVisibility(8);
                }
                view = getActivity();
                if (view != null)
                {
                    Toast.makeText(view, "Production Mode Activated, now restart the app", 1).show();
                }
                TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.TEST_MODE, false);
                TwcPrefs.getInstance().remove(com.weather.util.prefs.TwcPrefs.Keys.DSX_SERVER);
                TwcPrefs.getInstance().remove(com.weather.util.prefs.TwcPrefs.Keys.DSX_SERVER_SECURE);
                TwcPrefs.getInstance().remove(com.weather.util.prefs.TwcPrefs.Keys.AD_TEST_ENABLED);
                TwcPrefs.getInstance().remove(com.weather.util.prefs.TwcPrefs.Keys.QA_CONFIG_ENABLED);
                SQSLocationUpdateUtil.cancelAlarm();
                TwcPrefs.getInstance().remove(com.weather.util.prefs.TwcPrefs.Keys.LOCATION_UPDATE_LOG);
                ConfigPrefs.clearAll();
                return true;
            }

            
            {
                this$0 = AboutFragment.this;
                super();
            }
        });
    }

    private static void stripUnderlines(TextView textview)
    {
        Spannable spannable = (Spannable)textview.getText();
        URLSpan aurlspan[] = (URLSpan[])spannable.getSpans(0, spannable.length(), android/text/style/URLSpan);
        int j = aurlspan.length;
        for (int i = 0; i < j; i++)
        {
            URLSpan urlspan = aurlspan[i];
            int k = spannable.getSpanStart(urlspan);
            int l = spannable.getSpanEnd(urlspan);
            spannable.removeSpan(urlspan);
            spannable.setSpan(new URLSpanNoUnderline(urlspan.getURL()), k, l, 0);
        }

        textview.setText(spannable);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        Object obj;
        super.onCreateView(layoutinflater, viewgroup, bundle);
        bundle = getActivity();
        if (bundle == null)
        {
            return null;
        }
        Object obj1 = bundle.getActionBar();
        obj = bundle.getResources();
        if (obj1 != null && obj != null)
        {
            ((ActionBar) (obj1)).setTitle(((Resources) (obj)).getString(0x7f070273));
        }
        layoutinflater = layoutinflater.inflate(0x7f030000, viewgroup, false);
        viewgroup = (TextView)layoutinflater.findViewById(0x7f0d0021);
        obj1 = (TextView)layoutinflater.findViewById(0x7f0d0022);
        viewgroup.setCompoundDrawablePadding(15);
        Linkify.addLinks(viewgroup, 1);
        stripUnderlines(viewgroup);
        if (obj1 != null && obj != null)
        {
            ((TextView) (obj1)).setText(String.format("%s%s", new Object[] {
                ((Resources) (obj)).getString(0x7f070021), ((Resources) (obj)).getString(0x7f07048b)
            }));
        }
        layoutinflater.findViewById(0x7f0d0023).setOnClickListener(new android.view.View.OnClickListener() {

            final AboutFragment this$0;

            public void onClick(View view)
            {
                openWebPage("http://www.bom.gov.au/data-access/3rd-party-attribution.shtml");
            }

            
            {
                this$0 = AboutFragment.this;
                super();
            }
        });
        viewgroup = (TextView)layoutinflater.findViewById(0x7f0d001e);
        obj = (TextView)layoutinflater.findViewById(0x7f0d001f);
        bundle = bundle.getPackageManager().getPackageInfo(bundle.getPackageName(), 0);
        bundle = (new StringBuilder()).append(((PackageInfo) (bundle)).versionName).append(' ').append(((PackageInfo) (bundle)).versionCode).append(" (").append("bd0761b").append(' ').append("release").append(')').toString();
        if ("debug".equals("release"))
        {
            ((TextView) (obj)).setText("androidadmin 1447108154315");
            ((TextView) (obj)).setVisibility(0);
        }
        viewgroup.setText((new StringBuilder()).append(getString(0x7f070023)).append(bundle).toString());
        testModeSettings = layoutinflater.findViewById(0x7f0d0024);
        if (testModeSettings == null)
        {
            break MISSING_BLOCK_LABEL_354;
        }
        bundle = testModeSettings;
        int i;
        if (TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.TEST_MODE, false))
        {
            i = 0;
        } else
        {
            i = 8;
        }
        bundle.setVisibility(i);
        setupCrashTrigger(testModeSettings);
        setupTestModeTrigger(viewgroup);
        return layoutinflater;
        viewgroup;
        Log.w("AboutFragment", (new StringBuilder()).append("onCreate ex=").append(viewgroup).toString());
        return layoutinflater;
    }

    public void onResume()
    {
        super.onResume();
        LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.ABOUT_THIS_APP);
    }




/*
    static Toast access$102(AboutFragment aboutfragment, Toast toast1)
    {
        aboutfragment.toast = toast1;
        return toast1;
    }

*/

}
