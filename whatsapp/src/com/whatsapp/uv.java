// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.preference.CheckBoxPreference;
import android.preference.Preference;

// Referenced classes of package com.whatsapp:
//            Conversation, App, SettingsChat

class uv
    implements android.preference.Preference.OnPreferenceClickListener
{

    final CheckBoxPreference a;
    final SettingsChat b;

    uv(SettingsChat settingschat, CheckBoxPreference checkboxpreference)
    {
        b = settingschat;
        a = checkboxpreference;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
label0:
        {
            if (a.isChecked())
            {
                Conversation.aJ = true;
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Conversation.aJ = false;
        }
        return true;
    }
}
