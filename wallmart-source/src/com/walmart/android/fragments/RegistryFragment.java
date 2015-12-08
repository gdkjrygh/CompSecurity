// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.webkit.WebView;
import com.walmart.android.app.registry.RegistryDisabledPresenter;
import com.walmart.android.app.registry.RegistryStatus;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.fragments:
//            WebFragment

public class RegistryFragment extends WebFragment
{

    public static final String DEFAULT_URL = "https://www.walmart.com/lists/registry-homepage";
    private static final String TAG = com/walmart/android/fragments/RegistryFragment.getSimpleName();

    public RegistryFragment()
    {
    }

    private void setProdCookies()
    {
    }

    protected WebFragment.ActionBarState getInitialActionBarState()
    {
        return new WebFragment.ActionBarState(this, getString(0x7f090473), false, false);
    }

    protected String getUrl()
    {
        Object obj = getActivity();
        String s = PreferenceManager.getDefaultSharedPreferences(((android.content.Context) (obj))).getString(((FragmentActivity) (obj)).getString(0x7f090474), "https://www.walmart.com/lists/registry-homepage");
        Object obj1 = getDynamicArguments();
        obj = s;
        if (obj1 != null)
        {
            obj1 = ((Bundle) (obj1)).getString("registry_add_path");
            obj = s;
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                obj = Uri.parse(s);
                obj = (new StringBuilder()).append(((Uri) (obj)).getScheme()).append("://").append(((Uri) (obj)).getAuthority()).append(((String) (obj1))).toString();
            }
            setDynamicArguments(null);
        }
        return ((String) (obj));
    }

    protected void onCookiesCleared(WebView webview)
    {
        super.onCookiesCleared(webview);
        setProdCookies();
    }

    public Presenter onCreatePresenter()
    {
        RegistryStatus registrystatus = RegistryStatus.get(getActivity());
        static class _cls1
        {

            static final int $SwitchMap$com$walmart$android$app$registry$RegistryStatus[];

            static 
            {
                $SwitchMap$com$walmart$android$app$registry$RegistryStatus = new int[RegistryStatus.values().length];
                try
                {
                    $SwitchMap$com$walmart$android$app$registry$RegistryStatus[RegistryStatus.DISABLED_MAINTENANCE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$walmart$android$app$registry$RegistryStatus[RegistryStatus.DISABLED_NEEDS_APP_UPDATE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$walmart$android$app$registry$RegistryStatus[RegistryStatus.ENABLED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.walmart.android.app.registry.RegistryStatus[registrystatus.ordinal()])
        {
        default:
            return super.onCreatePresenter();

        case 1: // '\001'
        case 2: // '\002'
            return new RegistryDisabledPresenter(getActivity(), registrystatus);
        }
    }

    public void onStart()
    {
        setLockPortrait(true);
        setProdCookies();
        super.onStart();
    }

}
