// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, RegisterPhone, EnterPhoneNumber, VerifySms

class rd
    implements android.content.DialogInterface.OnClickListener
{

    private static final String z[];
    final RegisterPhone a;

    rd(RegisterPhone registerphone)
    {
        a = registerphone;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
label0:
        {
label1:
            {
label2:
                {
                    i = App.am;
                    a.removeDialog(21);
                    dialoginterface = a.getSharedPreferences(z[5], 0).edit();
                    dialoginterface.putString(z[7], EnterPhoneNumber.t);
                    dialoginterface.putString(z[0], EnterPhoneNumber.z);
                    if (!dialoginterface.commit())
                    {
                        Log.e(z[6]);
                    }
                    if (!a.g())
                    {
                        break label1;
                    }
                    if (a.c())
                    {
                        EnterPhoneNumber.y = 14;
                        if (i == 0)
                        {
                            break label2;
                        }
                    }
                    EnterPhoneNumber.y = 0;
                }
                a.f();
                App.d(a, 4);
                dialoginterface = new Intent(a, com/whatsapp/VerifySms);
                dialoginterface.putExtra(z[4], a.x);
                dialoginterface.putExtra(z[3], a.n);
                if (i == 0)
                {
                    break label0;
                }
            }
            EnterPhoneNumber.y = 0;
            a.f();
            Log.i(z[1]);
            App.d(a, 4);
            dialoginterface = new Intent(a, com/whatsapp/VerifySms);
            dialoginterface.putExtra(z[2], a.n);
        }
        a.startActivity(dialoginterface);
        a.finish();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "Z\033";
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
                obj = "X\026-y[^\0268`@E\035/?KE\035,yZG\\<\177AI\026";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "I\034'>_B\022>cIZ\003dFMX\032,i{G\000dbGK\036#~O";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "I\034'>_B\022>cIZ\003dFMX\032,i{G\000dbGK\036#~O";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "I\034'>_B\022>cIZ\003dFMX\032,i{G\000dcMX\005/b[O\035.";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "I\034'>_B\022>cIZ\003\025`ZO\025/bMD\020/c";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "X\026-y[^\0268`@E\035/?[O\007)sXB\034$uF_\036evIC\037/t";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "I\020";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 256
    //                   0 279
    //                   1 286
    //                   2 293
    //                   3 300;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_300;
_L3:
        byte byte1 = 40;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 42;
          goto _L9
_L5:
        byte1 = 115;
          goto _L9
_L6:
        byte1 = 74;
          goto _L9
        byte1 = 16;
          goto _L9
    }
}
