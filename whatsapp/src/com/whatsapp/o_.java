// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            App, MultipleContactPicker, abl

class o_
    implements android.view.View.OnClickListener
{

    private static final String z;
    final MultipleContactPicker a;

    o_(MultipleContactPicker multiplecontactpicker)
    {
        a = multiplecontactpicker;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            int i = App.am;
            if (!MultipleContactPicker.d(a).isEmpty() || MultipleContactPicker.c(a))
            {
                view = new Intent();
                StringBuilder stringbuilder = new StringBuilder();
                Iterator iterator = MultipleContactPicker.d(a).iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    String s = (String)iterator.next();
                    if (stringbuilder.length() != 0)
                    {
                        stringbuilder.append(",");
                    }
                    stringbuilder.append(s);
                } while (i == 0);
                view.putExtra(z, stringbuilder.toString());
                a.setResult(-1, view);
                a.finish();
                if (i == 0)
                {
                    break label0;
                }
            }
            App.b(a.getBaseContext(), String.format(App.j.a(0x7f0d001d, 1), new Object[] {
                Integer.valueOf(1)
            }), 0);
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "g\005\"K".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 66;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 13;
          goto _L8
_L3:
        byte0 = 108;
          goto _L8
_L4:
        byte0 = 70;
          goto _L8
        byte0 = 56;
          goto _L8
    }
}
