// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.accountsync.PerformSyncManager;
import com.whatsapp.contact.b;
import com.whatsapp.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            og, k, br, App, 
//            Conversation

class a extends Thread
{

    private static final String z[];
    final k a;
    private final og b;

    public a(k k1, og og1)
    {
        a = k1;
        super();
        b = og1;
        setPriority(1);
    }

    public void run()
    {
        ArrayList arraylist;
        com.whatsapp.contact.b.a(b);
        arraylist = new ArrayList();
        boolean flag;
        arraylist.add(b);
        if (b.a == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        flag = k.a(a).b(b.a);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        k.a(a).c(arraylist);
        if (b.t)
        {
            PerformSyncManager.a(App.au, b);
            App.S.sendEmptyMessage(1);
            Conversation.h(b.a);
        }
        if (!com.whatsapp.contact.b.c())
        {
            Log.w(z[0]);
        }
_L2:
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        Log.a(((Throwable) (obj)));
        if (com.whatsapp.contact.b.c()) goto _L2; else goto _L1
_L1:
        Log.w(z[2]);
        return;
        obj;
        throw obj;
        obj;
        try
        {
            if (!com.whatsapp.contact.b.c())
            {
                Log.w(z[1]);
            }
        }
        catch (Exception exception)
        {
            throw exception;
        }
        throw obj;
        obj;
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
        int l;
        as1 = as;
        obj = "X0@%FX+q<FU>I4U\024<F4DP\000O?Cd>J5xX0@%FX+q%OI:O5\bH&@2xZ3\\4F_&q4I_:J".toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
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
    //                   3 187;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_187;
_L3:
        byte byte0 = 39;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 59;
          goto _L9
_L5:
        byte0 = 95;
          goto _L9
_L6:
        byte0 = 46;
          goto _L9
        byte0 = 81;
          goto _L9
    }
}
