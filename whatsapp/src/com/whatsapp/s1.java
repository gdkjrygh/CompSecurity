// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;
import d;

// Referenced classes of package com.whatsapp:
//            ViewSharedContactActivity

class s1
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final ViewSharedContactActivity a;

    s1(ViewSharedContactActivity viewsharedcontactactivity)
    {
        a = viewsharedcontactactivity;
        super();
    }

    public void onClick(View view)
    {
        if (ViewSharedContactActivity.a(a))
        {
            ViewSharedContactActivity.a(a, view);
            return;
        } else
        {
            view = ((d)(d)view.getTag()).a;
            Intent intent = new Intent(z[1]);
            intent.setType(z[0]);
            intent.putExtra(z[2], new String[] {
                view
            });
            a.startActivity(intent);
            return;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "m\f{\nQ2\024\177\033K";
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
                obj = "|\016~\021Pt\0044\nQi\005t\027\021|\003n\nPsNI&qY";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "|\016~\021Pt\0044\nQi\005t\027\021x\030n\021^3%W\"vQ";
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
        byte byte0 = 63;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 29;
          goto _L9
_L5:
        byte0 = 96;
          goto _L9
_L6:
        byte0 = 26;
          goto _L9
        byte0 = 99;
          goto _L9
    }
}
