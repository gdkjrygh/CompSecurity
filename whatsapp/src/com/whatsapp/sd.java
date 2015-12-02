// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.io.File;

// Referenced classes of package com.whatsapp:
//            App, o4, ChangeNumber, EnterPhoneNumber, 
//            VerifySms

class sd
    implements Runnable
{

    private static final String z[];
    final ChangeNumber a;

    sd(ChangeNumber changenumber)
    {
        a = changenumber;
        super();
    }

    public void run()
    {
        Object obj;
label0:
        {
            App.Y();
            App.aF();
            App.Z = null;
            (new File(App.au.getFilesDir(), z[0])).delete();
            o4.o();
            App.e(App.au, null);
            App.d(a, 4);
            obj = a.getSharedPreferences(z[4], 0).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putString(z[5], EnterPhoneNumber.t);
            ((android.content.SharedPreferences.Editor) (obj)).putString(z[1], EnterPhoneNumber.z);
            if (!((android.content.SharedPreferences.Editor) (obj)).commit())
            {
                Log.e(z[7]);
            }
            obj = new Intent(a, com/whatsapp/VerifySms);
            ((Intent) (obj)).putExtra(z[9], a.x);
            ((Intent) (obj)).putExtra(z[6], a.n);
            ((Intent) (obj)).putExtra(z[2], true);
            if (a.g())
            {
                ((Intent) (obj)).putExtra(z[8], a.x);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Log.i(z[3]);
        }
        a.startActivity(((Intent) (obj)));
        a.finish();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[10];
        obj = "0L";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "-A";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ">FR\020\0375HKM\t-Y\021h\r/@YG;0Z\021]\000<GX[\006(D][\032";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = ">A^P\0178GJS\n8[\020H\0074JZ";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = ">FR\020\0375HKM\t-Y`N\0328OZL\r3JZM";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = ">J";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = ">FR\020\0375HKM\t-Y\021h\r/@YG;0Z\021L\007<DVP\017";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = ">A^P\0178GJS\n8[\020M\r)J\\N\0002GZP\0350\006Y_\0011L[";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = ">FR\020\0375HKM\t-Y\021h\r/@YG;0Z\021M\r/_ZL\0338G[";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = ">FR\020\0375HKM\t-Y\021h\r/@YG;0Z\021M\r/_ZL\0338G[";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 300
    //                   0 323
    //                   1 330
    //                   2 337
    //                   3 344;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_344;
_L3:
        byte byte1 = 104;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 93;
          goto _L9
_L5:
        byte1 = 41;
          goto _L9
_L6:
        byte1 = 63;
          goto _L9
        byte1 = 62;
          goto _L9
    }
}
