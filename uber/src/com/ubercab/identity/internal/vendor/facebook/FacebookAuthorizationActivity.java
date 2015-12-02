// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.identity.internal.vendor.facebook;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.ubercab.identity.internal.activity.IdentityActivity;
import cxb;
import gjw;
import god;

public class FacebookAuthorizationActivity extends IdentityActivity
{

    public FacebookAuthorizationActivity()
    {
    }

    private String c()
    {
        Object obj;
        obj = getPackageManager().getApplicationInfo(getPackageName(), 128);
        if (((ApplicationInfo) (obj)).metaData == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj = ((ApplicationInfo) (obj)).metaData.getString("com.facebook.API_KEY");
        return ((String) (obj));
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        return null;
    }

    private static String d()
    {
        return gjw.a(",").a("email", "public_profile", new Object[] {
            "user_friends"
        });
    }

    private boolean e()
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

    protected void onActivityResult(int i, int j, Intent intent)
    {
        String s1 = null;
        super.onActivityResult(i, j, intent);
        if (i == 1001)
        {
            String s;
            long l;
            if (intent != null)
            {
                s = intent.getStringExtra("access_token");
            } else
            {
                s = null;
            }
            if (intent != null)
            {
                s1 = intent.getStringExtra("expires_in");
            }
            l = cxb.b(s1);
            setResult(-1, (new Intent()).putExtra("token", s).putExtra("tokenExpiry", l));
            finish();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(god.ub__auth_activity_facebook);
        if (bundle != null || !e() || TextUtils.isEmpty(c()))
        {
            break MISSING_BLOCK_LABEL_71;
        }
        startActivityForResult((new Intent()).setClassName("com.facebook.katana", "com.facebook.katana.ProxyAuth").putExtra("client_id", c()).putExtra("scope", d()), 1001);
        return;
        bundle;
    }
}
