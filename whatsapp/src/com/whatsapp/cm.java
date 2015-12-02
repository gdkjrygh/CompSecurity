// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            MultipleContactsSelector, App, MultipleContactPicker

class cm
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final MultipleContactsSelector a;

    cm(MultipleContactsSelector multiplecontactsselector)
    {
        a = multiplecontactsselector;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            if (a.h() > 0 && a.j.size() >= a.h())
            {
                a.f(String.format(a.getString(a.e()), new Object[] {
                    Integer.valueOf(a.h())
                }));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            view = new Intent(a, com/whatsapp/MultipleContactPicker);
            view.putExtra(z[0], a.h());
            view.putExtra(z[2], a.e());
            view.putExtra(z[1], a.g());
            view.putExtra(z[3], a.c());
            a.startActivityForResult(view, 1);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "I)Uu\017";
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
                obj = "V%Ty\030Q%\\";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "I)Uu\017z7Yn\025L._C\t@3Wi\tF%go\017W";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "Q)Lp\036";
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
        byte byte0 = 123;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 37;
          goto _L9
_L5:
        byte0 = 64;
          goto _L9
_L6:
        byte0 = 56;
          goto _L9
        byte0 = 28;
          goto _L9
    }
}
