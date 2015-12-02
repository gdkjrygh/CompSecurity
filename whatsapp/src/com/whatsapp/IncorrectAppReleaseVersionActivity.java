// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, App, p1

public class IncorrectAppReleaseVersionActivity extends DialogToastActivity
{

    private static final String z[];

    public IncorrectAppReleaseVersionActivity()
    {
    }

    public void onBackPressed()
    {
        Intent intent = new Intent(z[1]);
        intent.addCategory(z[0]);
        intent.setFlags(0x10000000);
        startActivity(intent);
    }

    protected void onCreate(Bundle bundle)
    {
        int i;
        int j;
        i = App.am;
        super.onCreate(bundle);
        setContentView(0x7f03001b);
        bundle = (TextView)findViewById(0x7f0b0084);
        j = getIntent().getExtras().getInt(z[6]);
        bundle.setMovementMethod(LinkMovementMethod.getInstance());
        j;
        JVM INSTR tableswitch 1 2: default 76
    //                   1 110
    //                   2 150;
           goto _L1 _L2 _L3
_L1:
        try
        {
            throw new IllegalArgumentException((new StringBuilder()).append(z[5]).append(j).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
_L2:
        bundle.setText(Html.fromHtml(String.format(getString(0x7f0e0037), new Object[] {
            z[4], z[3]
        })));
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        String s = String.format(getString(0x7f0e01a7), new Object[] {
            z[2]
        });
        bundle.setText(Html.fromHtml(s));
        if (i != 0) goto _L1; else goto _L4
_L4:
        ((Button)findViewById(0x7f0b0082)).setOnClickListener(new p1(this));
        return;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "zN8A\004rDrZ\005oE2GExA(V\ftR%\035#Tm\031";
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
                obj = "zN8A\004rDrZ\005oE2GEzC(Z\004u\016\021r\"U";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "zM&]Q4\017=C\033h\017=]\017iO5WTk\035?\\\0065W4R\037hA,C";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "sT(C\030!\017sD\034l\016+[\noS=C\0335C3^DzN8A\004rD";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "vA.X\016o\032s\034\017~T=Z\007h\0375WVxO1\035\034sA(@\nkP";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "NN7]\004lN|E\nwU9\023\rtR|V\023oR=\023\037bP9\023Q;";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "oY,V";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 107;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 27;
          goto _L9
_L5:
        byte1 = 32;
          goto _L9
_L6:
        byte1 = 92;
          goto _L9
        byte1 = 51;
          goto _L9
    }
}
