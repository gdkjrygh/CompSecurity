// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.whatsapp.App;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.notification:
//            PopupNotification, PopupNotificationLocked

final class h
    implements Runnable
{

    private static final String z[];
    private final int a;
    private final Context b;

    h(Context context, int i)
    {
        b = context;
        a = i;
    }

    public void run()
    {
label0:
        {
            Object obj = (KeyguardManager)b.getSystemService(z[3]);
            PowerManager powermanager = (PowerManager)b.getSystemService(z[1]);
            if (!App.O() || ((KeyguardManager) (obj)).inKeyguardRestrictedInputMode() || !powermanager.isScreenOn())
            {
                Log.i(z[2]);
                if ((((KeyguardManager) (obj)).inKeyguardRestrictedInputMode() || !powermanager.isScreenOn()) && (a == 2 || a == 3))
                {
                    if (PopupNotification.s != null && !(PopupNotification.s instanceof PopupNotificationLocked))
                    {
                        PopupNotification.s.finish();
                        PopupNotification.s = null;
                    }
                    obj = new Intent(b, com/whatsapp/notification/PopupNotificationLocked);
                } else
                if (!App.O() && a != 3)
                {
                    if (PopupNotification.s != null && (PopupNotification.s instanceof PopupNotificationLocked))
                    {
                        PopupNotification.s.finish();
                        PopupNotification.s = null;
                    }
                    obj = new Intent(b, com/whatsapp/notification/PopupNotification);
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    ((Intent) (obj)).setFlags(0x10040000);
                    b.startActivity(((Intent) (obj)));
                }
                if (PopupNotification.s != null)
                {
                    PopupNotification.s.k();
                }
                if (!PopupNotification.q)
                {
                    break label0;
                }
            }
            if (PopupNotification.s != null && PopupNotification.s.i())
            {
                Log.i(z[0]);
                PopupNotification.s.k();
            }
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = ",t\r\031\024&t\020\005\001(w\027\t\0245x\021\004Z1~\016\037\005/~\n\003\023(r\037\036\034.\177Q\f\0323t\031\030\0324\177\032";
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
                obj = "1~\t\017\007";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ",t\r\031\024&t\020\005\001(w\027\t\0245x\021\004Z1~\016\037\005/~\n\003\023(r\037\036\034.\177Q\b\024\"z\031\030\0324\177\032";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "*t\007\r\000 c\032";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 117;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 65;
          goto _L9
_L5:
        byte0 = 17;
          goto _L9
_L6:
        byte0 = 126;
          goto _L9
        byte0 = 106;
          goto _L9
    }
}
