// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.accountsync.PerformSyncManager;
import com.whatsapp.contact.b;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, og, k

class it extends Thread
{

    private static final String z[];
    private final og a;
    final k b;

    public it(k k, og og)
    {
        b = k;
        super();
        a = og;
        setPriority(1);
    }

    public void run()
    {
        com.whatsapp.contact.b.a(a);
        PerformSyncManager.a(App.au, a);
        App.S.sendEmptyMessage(1);
        if (!com.whatsapp.contact.b.c())
        {
            Log.w(z[1]);
        }
_L2:
        return;
        Object obj;
        obj;
        Log.a(((Throwable) (obj)));
        if (com.whatsapp.contact.b.c()) goto _L2; else goto _L1
_L1:
        Log.w(z[0]);
        return;
        obj;
        try
        {
            if (!com.whatsapp.contact.b.c())
            {
                Log.w(z[2]);
            }
        }
        catch (Exception exception)
        {
            throw exception;
        }
        throw obj;
    }

    static 
    {
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        Object obj;
        int j;
        int k;
        as1 = as;
        obj = "mul\t mn]\020 `{e\0303!or\031 z\177]\025.b~m\b5Qym\0235oyv\"5fhg\034%!i{\023\"Q{n\017$o~{\"$`~g\031".toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 148
    //                   0 169
    //                   1 175
    //                   2 181
    //                   3 186;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_186;
_L3:
        byte byte0 = 65;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 14;
          goto _L9
_L5:
        byte0 = 26;
          goto _L9
_L6:
        byte0 = 2;
          goto _L9
        byte0 = 125;
          goto _L9
    }
}
