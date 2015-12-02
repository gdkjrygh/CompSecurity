// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            App, ak8

class up
    implements android.view.View.OnTouchListener
{

    final ak8 a;
    final TextView b;
    final View c;
    final TextView d;
    final int e;
    private float f;

    up(ak8 ak8_1, TextView textview, TextView textview1, int i, View view)
    {
        a = ak8_1;
        b = textview;
        d = textview1;
        e = i;
        c = view;
        super();
        f = 0.0F;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        int i = App.am;
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 40
    //                   0 42
    //                   1 119
    //                   2 178
    //                   3 119;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        return false;
_L2:
        if (!TextUtils.isEmpty(b.getText().toString().trim())) goto _L1; else goto _L5
_L5:
        a.b();
        f = motionevent.getX();
        if (!App.aR())
        {
            break; /* Loop/switch isn't completed */
        }
        d.setPadding(0, 0, e, 0);
        if (i == 0) goto _L1; else goto _L6
_L6:
        d.setPadding(e, 0, 0, 0);
        return false;
_L3:
        if (TextUtils.isEmpty(b.getText().toString().trim()))
        {
            break; /* Loop/switch isn't completed */
        }
        a.b(false);
        c.playSoundEffect(0);
        a.c();
        if (i == 0) goto _L1; else goto _L7
_L7:
        a.b(true);
        return false;
_L4:
label0:
        {
            float f1 = Math.abs(motionevent.getX() / (float)b.getWidth());
            if (f1 > 0.5F)
            {
                a.b(false);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (f1 > 0.1F)
            {
                ak8.a(a, Math.max(0.0F, 1.1F - f1 * 2.0F));
                if (i == 0)
                {
                    break label0;
                }
            }
            ak8.a(a, 1.0F);
        }
        if (!App.aR())
        {
            break; /* Loop/switch isn't completed */
        }
        int k = Math.max(e, (int)(((float)(e / 2) + f) - motionevent.getX()));
        d.setPadding(0, 0, k, 0);
        if (i == 0) goto _L1; else goto _L8
_L8:
        int j = Math.max(e, (int)(((float)(e / 2) - f) + motionevent.getX()));
        d.setPadding(j, 0, 0, 0);
        return false;
    }
}
