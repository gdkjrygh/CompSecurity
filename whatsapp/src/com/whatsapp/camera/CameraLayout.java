// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.whatsapp.DialogToastActivity;

// Referenced classes of package com.whatsapp.camera:
//            CameraActivity

public class CameraLayout extends FrameLayout
{

    private static final String z;

    public CameraLayout(Context context)
    {
        super(context);
    }

    public CameraLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public CameraLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int i1;
label0:
        {
            i1 = CameraActivity.n;
            super.onLayout(flag, i, j, k, l);
            View view = findViewById(0x7f0b00e3);
            View view1 = findViewById(0x7f0b00e5);
            View view2 = findViewById(0x7f0b00e4);
            int j1 = view.getMeasuredWidth();
            int k2 = view.getMeasuredHeight();
            int k1 = view1.getMeasuredWidth();
            int l1 = view1.getMeasuredHeight();
            int i2 = view2.getMeasuredWidth();
            int j2 = view2.getMeasuredHeight();
            if (l - j > k - i)
            {
                view.layout(((i + k) - j1) / 2, l - k2, (i + k + j1) / 2, l);
                int l2 = (k - i - j1) / 4;
                view2.layout(k - l2 - i2 / 2, l - k2 / 2 - j2 / 2, (k - l2) + i2 / 2, (l - k2 / 2) + j2 / 2);
                view1.layout((i + l2) - k1 / 2, l - k2 / 2 - l1 / 2, l2 + i + k1 / 2, (l - k2 / 2) + l1 / 2);
                if (i1 == 0)
                {
                    break label0;
                }
            }
            int i3 = ((WindowManager)getContext().getSystemService(z)).getDefaultDisplay().getOrientation();
            j = findViewById(0x7f0b00f3).getMeasuredHeight() + j;
            if (i3 == 0 || i3 == 1)
            {
                view.layout(k - j1, ((j + l) - k2) / 2, k, (j + l + k2) / 2);
                i3 = (l - j - k2) / 4;
                view2.layout(k - j1 / 2 - i2 / 2, (j + i3) - j2 / 2, (k - j1 / 2) + i2 / 2, j + i3 + j2 / 2);
                view1.layout(k - j1 / 2 - k1 / 2, l - i3 - l1 / 2, (k - j1 / 2) + k1 / 2, (l - i3) + l1 / 2);
                if (i1 == 0)
                {
                    break label0;
                }
            }
            view.layout(i, ((j + l) - k2) / 2, i + j1, (j + l + k2) / 2);
            k = (l - j - k2) / 4;
            k2 = j1 / 2;
            i3 = i2 / 2;
            int j3 = j2 / 2;
            int k3 = j1 / 2;
            view2.layout((k2 + i) - i3, (j + k) - j3, i2 / 2 + (k3 + i), j2 / 2 + (j + k));
            view1.layout((j1 / 2 + i) - k1 / 2, l - k - l1 / 2, j1 / 2 + i + k1 / 2, (l - k) + l1 / 2);
        }
        if (DialogToastActivity.g != 0)
        {
            CameraActivity.n = i1 + 1;
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "OHQ|\006O".toCharArray();
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
        byte byte0 = 105;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 56;
          goto _L8
_L3:
        byte0 = 33;
          goto _L8
_L4:
        byte0 = 63;
          goto _L8
        byte0 = 24;
          goto _L8
    }
}
