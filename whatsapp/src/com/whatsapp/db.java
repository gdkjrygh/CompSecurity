// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.util.Log;
import com.whatsapp.util.q;
import java.util.Date;
import java.util.TimeZone;

// Referenced classes of package com.whatsapp:
//            du, App, a1k

final class db extends du
{

    private static final String z;
    final Activity c;

    db(Activity activity, int i, Activity activity1)
    {
        c = activity1;
        super(activity, i);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = new Date();
        Log.w((new StringBuilder()).append(z).append(bundle.toString()).toString());
        long l;
        if (App.J == null)
        {
            l = bundle.getTime();
        } else
        {
            l = App.J.getTime();
        }
        bundle = c.getString(0x7f0e0097, new Object[] {
            q.l(App.au, l), TimeZone.getDefault().getDisplayName()
        });
        ((TextView)findViewById(0x7f0b0104)).setText(bundle);
        findViewById(0x7f0b0105).setOnClickListener(new a1k(this));
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = ".\\jR<?@eP0\"]w\013:!\\gOt:AkJ>`GmI<m".toCharArray();
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
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 89;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 77;
          goto _L8
_L3:
        byte0 = 51;
          goto _L8
_L4:
        byte0 = 4;
          goto _L8
        byte0 = 36;
          goto _L8
    }
}
