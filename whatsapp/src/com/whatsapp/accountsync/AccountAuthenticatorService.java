// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.accountsync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

// Referenced classes of package com.whatsapp.accountsync:
//            b

public class AccountAuthenticatorService extends Service
{

    private static b a;
    private static final String z;

    public AccountAuthenticatorService()
    {
    }

    private b a()
    {
        if (a == null)
        {
            a = new b(this);
        }
        return a;
    }

    public IBinder onBind(Intent intent)
    {
        IBinder ibinder = null;
        if (intent.getAction().equals(z))
        {
            ibinder = a().getIBinder();
        }
        return ibinder;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "+[}o\036#Q7|\022)Zls\0059\033X~\022%@wi0?Aqx\037>\\z|\005%G".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            a = null;
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 72
    //                   0 90
    //                   1 96
    //                   2 102
    //                   3 108;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_108;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 113;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 74;
          goto _L8
_L3:
        byte0 = 53;
          goto _L8
_L4:
        byte0 = 25;
          goto _L8
        byte0 = 29;
          goto _L8
    }
}
