// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.view.View;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, DelayedRegistrationBroadcastReceiver, EULA

class a32
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final EULA a;

    a32(EULA eula)
    {
        a = eula;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            int i = App.am;
            int j = App.z.getNetworkType();
            view = App.aI.getActiveNetworkInfo();
            boolean flag;
            if (view != null && view.isConnected())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            App.au.aG.a(a);
            if (App.z == null)
            {
                Log.e(z[0]);
                a.showDialog(2);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (j == 0 && !flag)
            {
                Log.e(z[1]);
                a.showDialog(2);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (App.z.getDeviceId() == null)
            {
                a.showDialog(3);
                if (i == 0)
                {
                    break label0;
                }
            }
            EULA.a(a);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "|\0052\033\fz\0252\026Vu\021,WM|\004)\025QrP0\017Ou";
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
                obj = "|\0052\033\fz\0252\026Vu\021,WM|\004)\025QrP+\024Hw\037)\024";
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
        byte byte0 = 35;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 25;
          goto _L9
_L5:
        byte0 = 112;
          goto _L9
_L6:
        byte0 = 94;
          goto _L9
        byte0 = 122;
          goto _L9
    }
}
