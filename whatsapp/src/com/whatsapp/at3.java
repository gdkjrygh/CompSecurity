// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import com.whatsapp.util.bv;

// Referenced classes of package com.whatsapp:
//            QuickContactActivity

public class at3 extends bv
{

    private static final String z;
    private String b;
    private Context c;

    public at3(String s, Context context)
    {
        b = s;
        c = context;
    }

    public void a(View view)
    {
        Intent intent = new Intent(c, com/whatsapp/QuickContactActivity);
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        Rect rect = new Rect();
        rect.left = (int)((float)ai[0] * 1.0F + 0.5F);
        rect.top = (int)((float)ai[1] * 1.0F + 0.5F);
        rect.right = (int)((float)(ai[0] + view.getWidth()) * 1.0F + 0.5F);
        rect.bottom = (int)((float)(ai[1] + view.getHeight()) * 1.0F + 0.5F);
        intent.setSourceBounds(rect);
        intent.putExtra(z, b);
        c.startActivity(intent);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = ".\021&".toCharArray();
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
        byte byte0 = 105;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 68;
          goto _L8
_L3:
        byte0 = 120;
          goto _L8
_L4:
        byte0 = 66;
          goto _L8
        byte0 = 48;
          goto _L8
    }
}
