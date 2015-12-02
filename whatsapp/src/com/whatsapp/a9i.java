// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, VerifySms, abk, asw, 
//            yc

class a9i
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final VerifySms a;

    a9i(VerifySms verifysms)
    {
        a = verifysms;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
label1:
            {
                int i;
label2:
                {
                    i = App.am;
                    if (VerifySms.s() != 11)
                    {
                        break label1;
                    }
                    Log.i(z[1]);
                    view = VerifySms.p(a).getText().toString().replace(Character.toString('\240'), "").replace(Character.toString('-'), "");
                    if (VerifySms.b(a, view))
                    {
                        VerifySms.o(a).setText(a.getString(0x7f0e0469));
                        asw.a(new abk(a), new String[] {
                            view
                        });
                        if (i == 0)
                        {
                            break label2;
                        }
                    }
                    if (!a.isFinishing())
                    {
                        a.showDialog(33);
                    }
                }
                if (i == 0)
                {
                    break label0;
                }
            }
            Log.i((new StringBuilder()).append(z[2]).append(VerifySms.a(a)).append(z[0]).append(VerifySms.m(a)).toString());
            asw.a(new yc(a), new String[0]);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "m4\000aH'(H";
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
                obj = "4?\007eL;,\032eI'u\007i^0#\003iX+<\f";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "4?\007eL;,\032eI'u\007i[7?\006x\005!9H";
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
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 42;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 66;
          goto _L9
_L5:
        byte0 = 90;
          goto _L9
_L6:
        byte0 = 117;
          goto _L9
        byte0 = 12;
          goto _L9
    }
}
