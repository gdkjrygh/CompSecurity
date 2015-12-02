// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.google.now;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ubercab.client.core.app.RiderApplication;
import dfp;
import dwx;
import dxa;
import gmg;
import ijg;
import java.io.IOException;

// Referenced classes of package com.ubercab.client.core.vendor.google.now:
//            NowBroadcastReceiver

public class NowAuthIntentService extends IntentService
{

    public gmg a;
    public dwx b;

    public NowAuthIntentService()
    {
        super("NowAuthIntentService");
    }

    public static Intent a(Context context)
    {
        return (new Intent(context, com/ubercab/client/core/vendor/google/now/NowAuthIntentService)).putExtra("method", "check-credentials");
    }

    static Intent a(Context context, String s)
    {
        return (new Intent(context, com/ubercab/client/core/vendor/google/now/NowAuthIntentService)).putExtra("method", "revoke_credentials").putExtra("accessToken", s);
    }

    private Intent a(Intent intent)
    {
        Object obj;
        byte byte0;
        if (intent == null)
        {
            intent = null;
        } else
        {
            intent = intent.getExtras();
        }
        if (intent == null)
        {
            obj = null;
        } else
        {
            obj = intent.getString("method");
        }
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            ijg.c("Method is required", new Object[0]);
            return null;
        }
        ijg.a("Received Work Intent: %s", new Object[] {
            obj
        });
        byte0 = -1;
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 4: default 108
    //                   -1192954173: 207
    //                   -1115697737: 179
    //                   -580402224: 193
    //                   882561291: 165;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_207;
_L6:
        switch (byte0)
        {
        default:
            ijg.c((new StringBuilder("Unknown method: ")).append(((String) (obj))).toString(), new Object[0]);
            return null;

        case 0: // '\0'
            return d(intent);

        case 1: // '\001'
            return a(((Bundle) (intent)));

        case 2: // '\002'
            return b(intent);

        case 3: // '\003'
            return c(intent);
        }
_L5:
        if (((String) (obj)).equals("GetAuthCode"))
        {
            byte0 = 0;
        }
          goto _L6
_L3:
        if (((String) (obj)).equals("check-credentials"))
        {
            byte0 = 1;
        }
          goto _L6
_L4:
        if (((String) (obj)).equals("add-credentials"))
        {
            byte0 = 2;
        }
          goto _L6
        if (((String) (obj)).equals("revoke_credentials"))
        {
            byte0 = 3;
        }
          goto _L6
    }

    private Intent a(Bundle bundle)
    {
        return NowBroadcastReceiver.a(this, bundle, b.a());
    }

    static Intent b(Context context)
    {
        return (new Intent(context, com/ubercab/client/core/vendor/google/now/NowAuthIntentService)).putExtra("method", "GetAuthCode");
    }

    static Intent b(Context context, String s)
    {
        return (new Intent(context, com/ubercab/client/core/vendor/google/now/NowAuthIntentService)).putExtra("method", "add-credentials").putExtra("authCode", s);
    }

    private Intent b(Bundle bundle)
    {
        String s = bundle.getString("authCode");
        return NowBroadcastReceiver.a(this, bundle, b.a(s));
    }

    private Intent c(Bundle bundle)
    {
        String s = bundle.getString("accessToken");
        return NowBroadcastReceiver.a(this, bundle, b.b(s));
    }

    private Intent d(Bundle bundle)
    {
        Bundle bundle1 = new Bundle(bundle);
        bundle = b.a(this);
        ijg.a("Successfully retrieved auth code", new Object[0]);
        bundle1.putString("authCode", bundle);
        char c1 = '\310';
_L1:
        return NowBroadcastReceiver.a(this, bundle1, c1);
        bundle;
_L2:
        ijg.c(bundle, "Failed to retrieve auth code", new Object[0]);
        c1 = '\0';
          goto _L1
        bundle;
        ijg.c("Already have auth code.", new Object[0]);
        bundle1.putString("accessToken", bundle.getAccessToken());
        c1 = '\u0190';
          goto _L1
        bundle;
          goto _L2
        bundle;
          goto _L2
        bundle;
          goto _L2
    }

    public void onCreate()
    {
        super.onCreate();
        ((RiderApplication)getApplication()).b().a(this);
        if (dxa.a(a))
        {
            break MISSING_BLOCK_LABEL_41;
        }
        b.b(this);
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        ijg.d(runtimeexception, "Unable to unschedule credential check.", new Object[0]);
        return;
    }

    protected void onHandleIntent(Intent intent)
    {
        if (dxa.a(a))
        {
            if ((intent = a(intent)) != null)
            {
                sendBroadcast(intent);
                return;
            }
        }
    }
}
