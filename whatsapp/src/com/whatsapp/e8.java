// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.whatsapp:
//            adj, CountryPicker

class e8
    implements android.widget.AdapterView.OnItemClickListener
{

    private static final String z[];
    final CountryPicker a;

    e8(CountryPicker countrypicker)
    {
        a = countrypicker;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        try
        {
            adapterview = (adj)adapterview.getItemAtPosition(i);
        }
        // Misplaced declaration of an exception variable
        catch (AdapterView adapterview)
        {
            return;
        }
        view = new Intent();
        view.putExtra(z[1], ((adj) (adapterview)).c);
        view.putExtra(z[2], ((adj) (adapterview)).a);
        view.putExtra(z[0], ((adj) (adapterview)).d);
        a.setResult(-1, view);
        a.finish();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = ".)V";
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
                obj = "$5L!R5#f!G*?";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "$9";
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
        byte byte0 = 38;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 71;
          goto _L9
_L5:
        byte0 = 90;
          goto _L9
_L6:
        byte0 = 57;
          goto _L9
        byte0 = 79;
          goto _L9
    }
}
