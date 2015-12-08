// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.UAirship;
import com.urbanairship.js.UAJavascriptInterface;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.impl.auth.BasicScheme;

// Referenced classes of package com.urbanairship.widget:
//            UAWebView

public class LandingPageWebView extends UAWebView
{

    public LandingPageWebView(Context context)
    {
        super(context);
    }

    public LandingPageWebView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public LandingPageWebView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void setClientAuthRequest(String s)
    {
        AirshipConfigOptions airshipconfigoptions = UAirship.shared().getAirshipConfigOptions();
        setClientAuthRequest(s, airshipconfigoptions.getAppKey(), airshipconfigoptions.getAppSecret());
    }

    void init()
    {
        super.init();
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            addJavascriptInterface(new UAJavascriptInterface(this), "_UAirship");
        }
    }

    protected void initializeView()
    {
        super.initializeView();
    }

    public void loadUrl(String s)
    {
        onPreLoad();
        if (s == null || !s.startsWith(UAirship.shared().getAirshipConfigOptions().landingPageContentURL))
        {
            super.loadUrl(s);
            return;
        }
        setClientAuthRequest(s);
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            Object obj = UAirship.shared().getAirshipConfigOptions();
            obj = BasicScheme.authenticate(new UsernamePasswordCredentials(((AirshipConfigOptions) (obj)).getAppKey(), ((AirshipConfigOptions) (obj)).getAppSecret()), "UTF-8", false);
            HashMap hashmap = new HashMap();
            hashmap.put(((Header) (obj)).getName(), ((Header) (obj)).getValue());
            super.loadUrl(s, hashmap);
            return;
        } else
        {
            super.loadUrl(s);
            return;
        }
    }

    public void loadUrl(String s, Map map)
    {
        onPreLoad();
        if (s != null && s.startsWith(UAirship.shared().getAirshipConfigOptions().landingPageContentURL))
        {
            setClientAuthRequest(s);
        }
        super.loadUrl(s, map);
    }
}
