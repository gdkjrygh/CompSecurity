// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.google.now;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ijg;

// Referenced classes of package com.ubercab.client.core.vendor.google.now:
//            NowAuthIntentService

public class NowBroadcastReceiver extends BroadcastReceiver
{

    public NowBroadcastReceiver()
    {
    }

    private static Intent a(Context context, Intent intent)
    {
        String s;
        byte byte0;
        s = intent.getStringExtra("method");
        if (s == null)
        {
            ijg.c("Method is required", new Object[0]);
            return null;
        }
        ijg.a("Received Broadcast Intent: %s", new Object[] {
            s
        });
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 4: default 84
    //                   -1192954173: 182
    //                   -1115697737: 140
    //                   -580402224: 168
    //                   882561291: 154;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_182;
_L6:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown method: ")).append(s).toString());

        case 0: // '\0'
            int i = intent.getIntExtra("statusCode", 0);
            switch (i)
            {
            default:
                ijg.c("Error occurred while checking credentials: %d", new Object[] {
                    Integer.valueOf(i)
                });
                return null;

            case 204: 
                ijg.a("Server has valid credentials.", new Object[0]);
                return null;

            case 400: 
                ijg.c("Server credentials invalid. Getting new auth code...", new Object[0]);
                break;
            }
            return NowAuthIntentService.b(context);

        case 1: // '\001'
            String s1 = intent.getStringExtra("authCode");
            intent = intent.getStringExtra("accessToken");
            if (intent != null)
            {
                ijg.a((new StringBuilder("Already have existing token. Revoking existing access token: ")).append(intent).toString(), new Object[0]);
                return NowAuthIntentService.a(context, intent);
            }
            if (s1 != null)
            {
                return NowAuthIntentService.b(context, s1);
            } else
            {
                ijg.c("Unexpected error occurred while getting the auth code.", new Object[0]);
                return null;
            }

        case 2: // '\002'
            if (intent.getIntExtra("statusCode", 0) == 202)
            {
                ijg.a("Successfully posted credentials to the server.", new Object[0]);
                return null;
            } else
            {
                ijg.c("An error occurred posting user credentials.", new Object[0]);
                return null;
            }

        case 3: // '\003'
            break;
        }
        break MISSING_BLOCK_LABEL_378;
_L3:
        if (s.equals("check-credentials"))
        {
            byte0 = 0;
        }
          goto _L6
_L5:
        if (s.equals("GetAuthCode"))
        {
            byte0 = 1;
        }
          goto _L6
_L4:
        if (s.equals("add-credentials"))
        {
            byte0 = 2;
        }
          goto _L6
        if (s.equals("revoke_credentials"))
        {
            byte0 = 3;
        }
          goto _L6
        if (intent.getIntExtra("statusCode", 0) == 200)
        {
            ijg.a("Token revoked successfully. Getting new auth code...", new Object[0]);
            return NowAuthIntentService.b(context);
        } else
        {
            ijg.c("There was an error revoking the token.", new Object[0]);
            return null;
        }
    }

    static Intent a(Context context, Bundle bundle, int i)
    {
        Intent intent = new Intent("com.ubercab.client.core.vendor.google.now.BROADCAST");
        intent.putExtras(bundle);
        intent.putExtra("statusCode", i);
        intent.setPackage(context.getPackageName());
        return intent;
    }

    public void onReceive(Context context, Intent intent)
    {
        intent = a(context, intent);
        if (intent != null)
        {
            context.startService(intent);
        }
    }
}
