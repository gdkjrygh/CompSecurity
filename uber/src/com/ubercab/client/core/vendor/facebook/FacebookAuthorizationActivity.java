// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.facebook;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import czj;
import dfe;
import dfp;
import dug;
import dvz;
import dwa;
import dwd;
import dwg;
import gjw;

// Referenced classes of package com.ubercab.client.core.vendor.facebook:
//            FacebookAuthorizationFragment

public class FacebookAuthorizationActivity extends RiderActivity
{

    public FacebookAuthorizationActivity()
    {
    }

    private void a(dwd dwd1)
    {
        dwd1.a(this);
    }

    private dwd b(dfp dfp)
    {
        return dvz.a().a(new dfe(this)).a(dfp).a();
    }

    private String f()
    {
        return getResources().getString(0x7f070773);
    }

    private boolean g()
    {
        try
        {
            getPackageManager().getApplicationInfo("com.facebook.katana", 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return false;
        }
        return true;
    }

    private void h()
    {
        if (a(com/ubercab/client/core/vendor/facebook/FacebookAuthorizationFragment) == null)
        {
            a(0x7f0e00a6, FacebookAuthorizationFragment.a(j()), false);
        }
    }

    private static String i()
    {
        return gjw.a(",").a("email", "public_profile", new Object[] {
            "user_friends"
        });
    }

    private String j()
    {
        return (new android.net.Uri.Builder()).scheme("https").authority("www.facebook.com").appendPath("v2.2").appendPath("dialog").appendPath("oauth").appendQueryParameter("client_id", f()).appendQueryParameter("redirect_uri", "https://www.facebook.com/connect/login_success.html").appendQueryParameter("response_type", "token").appendQueryParameter("scope", i()).build().toString();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((dwd)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030036);
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        if (!g())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        startActivityForResult((new Intent()).setClassName("com.facebook.katana", "com.facebook.katana.ProxyAuth").putExtra("client_id", f()).putExtra("scope", i()), 1);
        return;
        bundle;
        h();
        return;
        h();
        return;
    }

    protected void onActivityResult(int k, int l, Intent intent)
    {
        boolean flag;
        flag = true;
        super.onActivityResult(k, l, intent);
        if (k != 1) goto _L2; else goto _L1
_L1:
        if (intent == null) goto _L4; else goto _L3
_L3:
        String s1 = intent.getStringExtra("access_token");
        if (TextUtils.isEmpty(s1)) goto _L4; else goto _L5
_L5:
        onFacebookTokenEvent(new dwg(s1, dug.a(intent.getStringExtra("expires_in"), 0L)));
        k = ((flag) ? 1 : 0);
_L7:
        if (k == 0)
        {
            onFacebookTokenEvent(new dwg());
        }
_L2:
        return;
_L4:
        k = 0;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void onFacebookTokenEvent(dwg dwg1)
    {
        setResult(-1, (new Intent()).putExtra("token", dwg1.a()).putExtra("tokenExpiry", dwg1.b()));
        finish();
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
