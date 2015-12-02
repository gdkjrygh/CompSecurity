// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            ev, App

public class eg extends ev
{

    private static final String z[];
    private boolean a;
    private final String b;
    private long c;

    public eg(String s)
    {
        b = s;
    }

    public boolean a(View view, MotionEvent motionevent)
    {
        boolean flag;
        if (motionevent.getAction() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        view.invalidate();
        if (motionevent.getAction() == 1)
        {
            long l = SystemClock.elapsedRealtime();
            if (l - c > 1000L)
            {
                c = l;
                motionevent = Uri.parse(b);
                view = view.getContext();
                motionevent = new Intent(z[1], motionevent);
                motionevent.putExtra(z[0], view.getPackageName());
                App.a(view, motionevent);
            }
        }
        return false;
    }

    public void updateDrawState(TextPaint textpaint)
    {
label0:
        {
            if (a)
            {
                textpaint.setColor(0xffff0000);
                textpaint.bgColor = 0x660099cc;
                if (App.am == 0)
                {
                    break label0;
                }
            }
            textpaint.setColor(textpaint.linkColor);
            textpaint.bgColor = 0;
        }
        textpaint.setUnderlineText(true);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\rgDy5\000l[8=\n&K%;\031{L%z\017xY;=\ri]>;\000W@3";
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
                obj = "\017fM%;\007l\007>:\032mG#z\017k]>;\000&\177\036\0219";
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
        char c1 = obj[j];
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
        byte byte0 = 84;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 110;
          goto _L9
_L5:
        byte0 = 8;
          goto _L9
_L6:
        byte0 = 41;
          goto _L9
        byte0 = 87;
          goto _L9
    }
}
