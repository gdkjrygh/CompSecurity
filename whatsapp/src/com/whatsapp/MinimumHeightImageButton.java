// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageButton;

// Referenced classes of package com.whatsapp:
//            App, a1g

public class MinimumHeightImageButton extends ImageButton
{

    static int b;
    private static final String z;
    private Context a;

    public MinimumHeightImageButton(Context context, AttributeSet attributeset)
    {
        int j = App.am;
        super(context, attributeset);
        a = context;
        int i = 0;
        do
        {
            if (i >= attributeset.getAttributeCount())
            {
                break;
            }
            if (attributeset.getAttributeName(i).equals(z))
            {
                context = attributeset.getAttributeValue(i);
                b = (int)((float)Integer.parseInt(context.substring(0, context.indexOf("."))) * a1g.a().g);
                if (j == 0)
                {
                    break;
                }
            }
            i++;
        } while (j == 0);
    }

    protected void onMeasure(int i, int j)
    {
        float f1 = (float)getDrawable().getIntrinsicHeight() + a1g.a().m;
        i = (int)((float)getDrawable().getIntrinsicWidth() + a1g.a().m);
        float f = f1;
        if (f1 < (float)b)
        {
            f = b;
        }
        setMeasuredDimension(i, (int)f);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "s*J\006Co".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            b = 0;
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 72
    //                   0 90
    //                   1 96
    //                   2 102
    //                   3 108;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_108;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 43;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 27;
          goto _L8
_L3:
        byte0 = 79;
          goto _L8
_L4:
        byte0 = 35;
          goto _L8
        byte0 = 97;
          goto _L8
    }
}
