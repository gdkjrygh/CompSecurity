// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, Advanced, k, og

class rt
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final Advanced a;

    rt(Advanced advanced)
    {
        a = advanced;
        super();
    }

    public void onClick(View view)
    {
        int i;
label0:
        {
            i = App.am;
            App.q(z[0]);
            String s = ((EditText)a.findViewById(0x7f0b008c)).getText().toString();
            if (s != null && s.length() > 0 && s.contains("-"))
            {
                view = App.az.b();
                if (i == 0)
                {
                    break label0;
                }
            }
            if (s != null && s.length() > 0)
            {
                view = App.az.b((new StringBuilder()).append(s).append(z[1]).toString());
                if (i == 0)
                {
                    break label0;
                }
            }
            view = App.az.i();
        }
        if (view != null && view.size() > 0)
        {
            view = view.iterator();
            do
            {
                if (!view.hasNext())
                {
                    break;
                }
                og og1 = (og)view.next();
            } while (i == 0);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\rTXu4\nN[qu\nUF";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = ")R\033r|\bUFdd\031\017[``";
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
        byte byte0 = 20;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 105;
          goto _L9
_L5:
        byte0 = 33;
          goto _L9
_L6:
        byte0 = 53;
          goto _L9
        byte0 = 5;
          goto _L9
    }
}
