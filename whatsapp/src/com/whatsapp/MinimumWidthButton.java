// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.Button;

// Referenced classes of package com.whatsapp:
//            App, a1g

public class MinimumWidthButton extends Button
{

    static int a;
    private static final String z;
    private Context b;

    public MinimumWidthButton(Context context, AttributeSet attributeset)
    {
        int j = App.am;
        super(context, attributeset);
        b = context;
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
                a = (int)((float)Integer.parseInt(context.substring(0, context.indexOf("."))) * a1g.a().g);
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
        i = 0;
        int k = App.am;
        TextPaint textpaint = new TextPaint();
        textpaint.setTextSize(getResources().getDimension(0x7f0a0035));
        textpaint.setTypeface(Typeface.DEFAULT_BOLD);
        float f = 0.0F;
        float af[] = new float[getText().length()];
        textpaint.getTextWidths(getText(), 0, getText().length(), af);
        float f1;
        do
        {
            f1 = f;
            if (i >= af.length)
            {
                break;
            }
            f1 = f + af[i];
            i++;
            f = f1;
        } while (k == 0);
        f = f1 + a1g.a().k;
        if (a > getSuggestedMinimumWidth())
        {
            i = a;
        } else
        {
            i = getSuggestedMinimumWidth();
        }
        j = resolveSize(getSuggestedMinimumHeight(), j);
        if ((float)i > f)
        {
            f = i;
        }
        setMeasuredDimension((int)f, j);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "7\025E\005\177".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            a = 0;
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
        byte byte0 = 23;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 64;
          goto _L8
_L3:
        byte0 = 124;
          goto _L8
_L4:
        byte0 = 33;
          goto _L8
        byte0 = 113;
          goto _L8
    }
}
