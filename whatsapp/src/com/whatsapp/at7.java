// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            vk, App, ContactInfo

class at7
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final ContactInfo a;
    final vk b;

    at7(ContactInfo contactinfo, vk vk1)
    {
        a = contactinfo;
        b = vk1;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            int i;
            try
            {
                if (vk.b(b) == null)
                {
                    break label0;
                }
                App.b(vk.b(b), a);
                i = App.am;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_86;
            }
        }
        view = (new StringBuilder()).append(z[1]).append(vk.a(b)).toString();
        view = new Intent(z[0], Uri.parse(view));
        a.startActivity(view);
        return;
        view;
        Log.w(z[2]);
        App.aO();
        return;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "YA>\001)QKt\032(LJ4\007hYL.\032)V\001\036:\007t";
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
                obj = "LJ6I";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "[@4\007'[[\005\032(^@u\027/YCz\027/YC?\001fY_*S(W[z\025)MA>";
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
        byte byte0 = 70;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 56;
          goto _L9
_L5:
        byte0 = 47;
          goto _L9
_L6:
        byte0 = 90;
          goto _L9
        byte0 = 115;
          goto _L9
    }
}
