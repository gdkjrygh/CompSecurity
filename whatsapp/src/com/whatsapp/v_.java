// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.messaging.bb;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App

final class v_
    implements ServiceConnection
{

    private static final String z[];

    v_()
    {
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        Log.i(z[1]);
        App.a(false);
        App.a(((bb)ibinder).a());
        App.H().a(App.Z.jabber_id, App.T, App.au);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        Log.i(z[0]);
        App.a(false);
        App.a(null);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = ";\017\031I\035\021\0179_\016\000\003\t_S\003\004\bU\t\030\016";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
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
                obj = ";\017\031I\035\021\0179_\016\000\003\t_S\024\005\037T\030";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 124;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 118;
          goto _L9
_L5:
        byte0 = 106;
          goto _L9
_L6:
        byte0 = 106;
          goto _L9
        byte0 = 58;
          goto _L9
    }
}
