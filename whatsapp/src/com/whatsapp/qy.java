// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.util.c;

// Referenced classes of package com.whatsapp:
//            App, SetStatus, u1, a1q

class qy
    implements Runnable
{

    private static final String z;
    final String a;
    final SetStatus b;

    qy(SetStatus setstatus, String s)
    {
        b = setstatus;
        a = s;
        super();
    }

    public void run()
    {
        if (TextUtils.equals(a, (new StringBuilder()).append(App.k()).append(z).toString()))
        {
            b.p.setText(c.b(App.aJ, b.getBaseContext()));
            b.o.notifyDataSetInvalidated();
            b.findViewById(0x7f0b019c).setVisibility(8);
            b.findViewById(0x7f0b0292).setVisibility(0);
            SetStatus.a(b).setOnClickListener(new a1q(this));
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = ")(Vd'\b/\013r?\031u\026v;".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
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
        byte byte0 = 79;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 105;
          goto _L8
_L3:
        byte0 = 91;
          goto _L8
_L4:
        byte0 = 120;
          goto _L8
        byte0 = 19;
          goto _L8
    }
}
