// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.bv;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, yj, CallLogActivity, og, 
//            a88, CallsFragment

class a_a extends bv
{

    private static final String z[];
    final CallsFragment b;

    a_a(CallsFragment callsfragment)
    {
        b = callsfragment;
        super();
    }

    public void a(View view)
    {
        int i = App.am;
        Object obj = (yj)(yj)view.getTag();
        view = new Intent(App.au.getApplicationContext(), com/whatsapp/CallLogActivity);
        view.putExtra(z[1], ((yj) (obj)).e().a);
        ArrayList arraylist = new ArrayList();
        obj = yj.a(((yj) (obj))).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            arraylist.add(new a88(((c4)((Iterator) (obj)).next()).y));
        } while (i == 0);
        view.putExtra(z[0], arraylist);
        b.startActivity(view);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "7\000w'F";
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
                obj = ">\b\177";
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
        byte byte0 = 53;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 84;
          goto _L9
_L5:
        byte0 = 97;
          goto _L9
_L6:
        byte0 = 27;
          goto _L9
        byte0 = 75;
          goto _L9
    }
}
