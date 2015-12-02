// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;

// Referenced classes of package com.whatsapp:
//            ali, App

class jc
    implements android.view.View.OnTouchListener
{

    private static final String z;
    final Activity a;
    final FrameLayout b;
    final ali c;

    jc(ali ali1, FrameLayout framelayout, Activity activity)
    {
        c = ali1;
        b = framelayout;
        a = activity;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 4)
        {
            c.dismiss();
            return true;
        }
        if (App.u == 3)
        {
            Log.i(z);
            a5.a(b, a, true);
        }
        return false;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "jF30KcB(!]{E.?LdEh%Z~\\$0\\b])$\\b^4".toCharArray();
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
        byte byte0 = 40;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 11;
          goto _L8
_L3:
        byte0 = 50;
          goto _L8
_L4:
        byte0 = 71;
          goto _L8
        byte0 = 81;
          goto _L8
    }
}
