// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appinvite;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class AppInviteReferral
{

    private AppInviteReferral()
    {
    }

    public static Intent addPlayStoreReferrerToIntent(Intent intent, Intent intent1)
    {
        intent = zzh(intent);
        if (intent != null && intent1 != null)
        {
            intent1.putExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE", intent);
        }
        return intent1;
    }

    public static Intent addReferralDataToIntent(String s, String s1, Intent intent)
    {
        if (intent == null)
        {
            return null;
        } else
        {
            return intent.putExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE", zza(s, s1, false));
        }
    }

    public static String getDeepLink(Intent intent)
    {
        if (intent != null)
        {
            intent = intent.getBundleExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE");
            if (intent != null)
            {
                return intent.getString("com.google.android.gms.appinvite.DEEP_LINK");
            }
        }
        return null;
    }

    public static String getInvitationId(Intent intent)
    {
        if (intent != null)
        {
            intent = intent.getBundleExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE");
            if (intent != null)
            {
                return intent.getString("com.google.android.gms.appinvite.INVITATION_ID");
            }
        }
        return null;
    }

    public static boolean hasReferral(Intent intent)
    {
        return intent != null && intent.getBundleExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE") != null;
    }

    public static boolean isOpenedFromPlayStore(Intent intent)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (hasReferral(intent))
        {
            flag = flag1;
            if (intent.getBundleExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE").getBoolean("com.google.android.gms.appinvite.OPENED_FROM_PLAY_STORE", false))
            {
                flag = true;
            }
        }
        return flag;
    }

    private static Bundle zza(String s, String s1, boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.gms.appinvite.INVITATION_ID", s);
        bundle.putString("com.google.android.gms.appinvite.DEEP_LINK", s1);
        bundle.putBoolean("com.google.android.gms.appinvite.OPENED_FROM_PLAY_STORE", flag);
        return bundle;
    }

    private static Bundle zzh(Intent intent)
    {
        if (intent == null || !intent.getAction().equals("com.android.vending.INSTALL_REFERRER") || intent.getStringExtra("referrer") == null)
        {
            return null;
        }
        String s = intent.getStringExtra("referrer");
        Object obj;
        try
        {
            intent = URLDecoder.decode(s, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.e("AppInviteReferral", (new StringBuilder()).append("Error parsing Play Store referrer URL: ").append(s).toString());
            return null;
        }
        obj = Uri.parse((new StringBuilder()).append("s://a.b.c?").append(intent).toString());
        s = ((Uri) (obj)).getQueryParameter("invitation_id");
        obj = ((Uri) (obj)).getQueryParameter("deep_link_id");
        if (s == null && obj == null)
        {
            Log.w("AppInviteReferral", (new StringBuilder()).append("Missing  Referrer query params: ").append(intent).toString());
            return null;
        } else
        {
            return zza(s, ((String) (obj)), true);
        }
    }
}
