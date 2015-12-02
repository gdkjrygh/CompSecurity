// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.accountsync;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SyncResult;
import android.os.Bundle;

// Referenced classes of package com.whatsapp.accountsync:
//            ContactsSyncAdapterService

class f extends AbstractThreadedSyncAdapter
{

    private static final String z;
    final ContactsSyncAdapterService a;

    f(ContactsSyncAdapterService contactssyncadapterservice, Context context, boolean flag)
    {
        a = contactssyncadapterservice;
        super(context, flag);
    }

    public void onPerformSync(Account account, Bundle bundle, String s, ContentProviderClient contentproviderclient, SyncResult syncresult)
    {
        getContext().sendBroadcast(new Intent(z));
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\036\001-W\027\025\0174\n\001\r\036n\030\003\036\0015\027\024\016\027.\032N\024\0004\034\016\t@\020<2;!\0224?.7\016:".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 96;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 125;
          goto _L8
_L3:
        byte0 = 110;
          goto _L8
_L4:
        byte0 = 64;
          goto _L8
        byte0 = 121;
          goto _L8
    }
}
