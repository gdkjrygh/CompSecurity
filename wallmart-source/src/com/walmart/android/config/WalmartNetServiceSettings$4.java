// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.config;

import android.app.Activity;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.config:
//            WalmartNetServiceSettings, ServiceConfigChangedEvent

static final class val.phoenixUrlEditText
    implements android.content.ner
{

    final Activity val$activity;
    final EditText val$baseUrlEditText;
    final EditText val$phoenixUrlEditText;
    final EditText val$secureBaseUrlEditText;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        boolean flag = WalmartNetServiceSettings.access$700(val$activity, "manual_baseurl", val$baseUrlEditText.getText().toString());
        boolean flag1 = WalmartNetServiceSettings.access$700(val$activity, "manual_securebaseurl", val$secureBaseUrlEditText.getText().toString());
        boolean flag2 = WalmartNetServiceSettings.access$700(val$activity, "manual_phoenixurl", val$phoenixUrlEditText.getText().toString());
        if (flag && flag1 && flag2)
        {
            WalmartNetServiceSettings.access$600(val$activity, "server_setting", 14);
            MessageBus.getBus().post(new ServiceConfigChangedEvent());
            dialoginterface = "Successfully set manual URLs";
        } else
        {
            String s;
            String s1;
            if (flag)
            {
                dialoginterface = "valid";
            } else
            {
                dialoginterface = "invalid";
            }
            if (flag1)
            {
                s = "valid";
            } else
            {
                s = "invalid";
            }
            if (flag2)
            {
                s1 = "valid";
            } else
            {
                s1 = "invalid";
            }
            dialoginterface = String.format("All URLs weren't valid. Manual URLs not used.\nBase URL %s\nSecure Base URL %s\nPhoenix URL %s", new Object[] {
                dialoginterface, s, s1
            });
        }
        Toast.makeText(val$activity, dialoginterface, 1).show();
    }

    (Activity activity1, EditText edittext, EditText edittext1, EditText edittext2)
    {
        val$activity = activity1;
        val$baseUrlEditText = edittext;
        val$secureBaseUrlEditText = edittext1;
        val$phoenixUrlEditText = edittext2;
        super();
    }
}
