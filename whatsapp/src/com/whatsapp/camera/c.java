// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.content.res.Resources;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.ConversationTextEntry;
import com.whatsapp.PhotoView;
import com.whatsapp.a1g;
import com.whatsapp.cq;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.camera:
//            CameraActivity

class c
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    private static final String z;
    final CameraActivity a;
    boolean b;

    c(CameraActivity cameraactivity)
    {
        a = cameraactivity;
        super();
    }

    public void onGlobalLayout()
    {
label0:
        {
label1:
            {
                if (CameraActivity.h(a) == null)
                {
                    break label0;
                }
                Object obj = a.getWindowManager().getDefaultDisplay();
                a1g a1g1 = a1g.a();
                boolean flag;
                if ((float)(((Display) (obj)).getHeight() - CameraActivity.h(a).getRootView().getHeight()) > a1g1.g * 128F)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (b == flag)
                {
                    break label1;
                }
                Log.i((new StringBuilder()).append(z).append(flag).toString());
                b = flag;
                obj = new AlphaAnimation(0.0F, 1.0F);
                ((Animation) (obj)).setDuration(a.getResources().getInteger(0x10e0001));
                if (flag)
                {
                    ((Animation) (obj)).setInterpolator(new DecelerateInterpolator());
                    a.findViewById(0x7f0b022a).setVisibility(0);
                    a.findViewById(0x7f0b00f1).setVisibility(8);
                    a.findViewById(0x7f0b00f2).setVisibility(8);
                    a.findViewById(0x7f0b00f0).setVisibility(8);
                    a.findViewById(0x7f0b00eb).setVisibility(8);
                    a.findViewById(0x7f0b00e7).startAnimation(((Animation) (obj)));
                    a.findViewById(0x7f0b00ef).startAnimation(((Animation) (obj)));
                    if (CameraActivity.n == 0)
                    {
                        break label1;
                    }
                }
                a.findViewById(0x7f0b00e7).startAnimation(((Animation) (obj)));
                a.findViewById(0x7f0b022a).setVisibility(8);
                a.findViewById(0x7f0b00f1).setVisibility(0);
                a.findViewById(0x7f0b00f2).setVisibility(0);
                a.findViewById(0x7f0b00f1).startAnimation(((Animation) (obj)));
                a.findViewById(0x7f0b00f2).startAnimation(((Animation) (obj)));
                a.findViewById(0x7f0b00f0).setVisibility(0);
                a.findViewById(0x7f0b00eb).setVisibility(0);
                a.findViewById(0x7f0b00eb).startAnimation(((Animation) (obj)));
                CameraActivity.d(a).dismiss();
                CameraActivity.q(a).clearFocus();
            }
            if (!flag && CameraActivity.b(a) != null)
            {
                CameraActivity.b(a).setHeightForInitialScaleCalculation(CameraActivity.h(a).getHeight());
            }
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "I\000ew1K\000kf*\\\b|klA\003lM0B\016\177|c".toCharArray();
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
        byte byte0 = 67;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 42;
          goto _L8
_L3:
        byte0 = 97;
          goto _L8
_L4:
        byte0 = 8;
          goto _L8
        byte0 = 18;
          goto _L8
    }
}
