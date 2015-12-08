// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.gcm;

import android.content.Context;
import android.content.SharedPreferences;
import com.wf.wellsfargomobile.BaseWebViewActivity;

public class a
{

    private final Context a;
    private final BaseWebViewActivity b;

    public a(Context context)
    {
        a = context;
        b = (BaseWebViewActivity)context;
    }

    public boolean getGcmFirstTimeOfferHasDisplayedFlagV2(String s)
    {
        SharedPreferences sharedpreferences;
        if (b.validNonce(s))
        {
            if (!(sharedpreferences = a.getSharedPreferences("WF_PREFERENCES", 0)).getString("gcm_registration_id_pref", "").isEmpty())
            {
                s = Boolean.valueOf(false);
                if (sharedpreferences.contains("gcm_first_time_experience_pref_v2"))
                {
                    s = Boolean.valueOf(sharedpreferences.getBoolean("gcm_first_time_experience_pref_v2", false));
                }
                return s.booleanValue();
            }
        }
        return true;
    }

    public void setGcmFirstTimeOfferHasDisplayedFlagV2(String s, boolean flag)
    {
        if (!b.validNonce(s))
        {
            return;
        }
        s = a.getSharedPreferences("WF_PREFERENCES", 0).edit();
        if (flag)
        {
            s.putBoolean("gcm_first_time_experience_pref_v2", flag);
        } else
        {
            s.remove("gcm_first_time_experience_pref_v2");
        }
        s.apply();
    }
}
