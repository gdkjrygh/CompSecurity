// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.core.identity.l;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            bk, a, bw

public class c extends BroadcastReceiver
{

    private final bw a;
    private final l b;
    private final bk c;

    public static boolean a(Intent intent)
    {
        boolean flag1 = false;
        intent = intent.getExtras();
        boolean flag = flag1;
        if (intent != null)
        {
            intent = intent.getString("sm");
            flag = flag1;
            if (intent != null)
            {
                intent = intent.replace("\\", "");
                boolean flag2;
                try
                {
                    flag2 = "automaticPairing".equals((new JSONObject(intent)).getString("notificationType"));
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent)
                {
                    return false;
                }
                flag = flag1;
                if (flag2)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public void onReceive(Context context, Intent intent)
    {
_L2:
        return;
        if (!b.b() || !a(intent)) goto _L2; else goto _L1
_L1:
        intent = intent.getExtras();
        if (intent == null) goto _L2; else goto _L3
_L3:
        Object obj = intent.getString("sm");
        if (obj == null) goto _L2; else goto _L4
_L4:
        obj = ((String) (obj)).replace("\\", "");
        boolean flag;
        try
        {
            obj = (new JSONObject(((String) (obj)))).getJSONObject("pairingData");
            String s = ((JSONObject) (obj)).getString("pairingCode");
            if (((JSONObject) (obj)).has("tvName"))
            {
                intent.putString("tv_name", ((JSONObject) (obj)).getString("tvName"));
            }
            flag = ((JSONObject) (obj)).getBoolean("isAvailable");
            intent.putString("pairing_code", s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            L.a("Automatic Pairing Notification parsing failed", context);
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        if (a.a(c.b()) || c.c(c.b())) goto _L2; else goto _L5
_L5:
        com.google.android.apps.youtube.app.remote.a.a(context, a, intent);
        return;
        com.google.android.apps.youtube.app.remote.a.b(context, a, intent);
        return;
    }

    public (bw bw, l l1, bk bk1)
    {
        a = bw;
        b = l1;
        c = bk1;
    }
}
