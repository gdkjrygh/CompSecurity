// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.EditText;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            ProfilePhotoReminder, App

class q1
    implements android.view.View.OnClickListener
{

    private static final String z;
    final ProfilePhotoReminder a;

    q1(ProfilePhotoReminder profilephotoreminder)
    {
        a = profilephotoreminder;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            view = ProfilePhotoReminder.b(a).getText().toString().trim();
            if (view.length() == 0)
            {
                Log.w(z);
                App.b(a, 0x7f0e031e, 0);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (!view.equals(App.x(a)))
            {
                App.au.z(view);
                App.t(view);
            }
        }
        a.finish();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "I\rLN,O\rYI>V\r\004I0\026\030^T7U\tFB".toCharArray();
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
        byte byte0 = 95;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 59;
          goto _L8
_L3:
        byte0 = 104;
          goto _L8
_L4:
        byte0 = 43;
          goto _L8
        byte0 = 39;
          goto _L8
    }
}
