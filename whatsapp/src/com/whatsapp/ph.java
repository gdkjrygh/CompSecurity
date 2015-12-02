// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.File;

// Referenced classes of package com.whatsapp:
//            App, DbBackupAlarmBroadcastReceiver, s0

class ph
    implements Runnable
{

    private static final String z[];
    final DbBackupAlarmBroadcastReceiver a;

    ph(DbBackupAlarmBroadcastReceiver dbbackupalarmbroadcastreceiver)
    {
        a = dbbackupalarmbroadcastreceiver;
        super();
    }

    public void run()
    {
        int j = App.am;
        DbBackupAlarmBroadcastReceiver.a(a, DbBackupAlarmBroadcastReceiver.a(a));
        File afile[] = s0.e().listFiles();
        if (afile != null)
        {
            int k = afile.length;
            int i = 0;
            do
            {
                if (i >= k)
                {
                    break;
                }
                File file = afile[i];
                Log.i((new StringBuilder()).append(z[1]).append(file.getName()).append(":").append(System.currentTimeMillis()).append(z[0]).append(file.lastModified()).toString());
                if (System.currentTimeMillis() - file.lastModified() > 0x5265c00L)
                {
                    file.delete();
                }
                i++;
            } while (j == 0);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "y\036[";
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
                obj = ":_\036cr,C$qt8A\036f3";
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
        byte byte0 = 28;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 89;
          goto _L9
_L5:
        byte0 = 51;
          goto _L9
_L6:
        byte0 = 123;
          goto _L9
        byte0 = 2;
          goto _L9
    }
}
