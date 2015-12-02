// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.PhotoView;
import com.whatsapp.a1g;
import com.whatsapp.cq;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview

class a2
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    private static final String z;
    final ImagePreview a;

    a2(ImagePreview imagepreview)
    {
        a = imagepreview;
        super();
    }

    public void onGlobalLayout()
    {
        int k = ImagePreview.B;
        if (ImagePreview.l(a) == null) goto _L2; else goto _L1
_L1:
        int i;
        Object obj = new Rect();
        ImagePreview.l(a).getWindowVisibleDisplayFrame(((Rect) (obj)));
        Object obj1 = a1g.a();
        int l;
        boolean flag;
        if ((float)(ImagePreview.l(a).getRootView().getHeight() - (((Rect) (obj)).bottom - ((Rect) (obj)).top)) > ((a1g) (obj1)).g * 128F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag == ImagePreview.f(a)) goto _L4; else goto _L3
_L3:
        ImagePreview.a(a, flag);
        Log.i((new StringBuilder()).append(z).append(flag).toString());
        l = ImagePreview.t(a).getChildCount();
        i = 0;
_L9:
        if (i >= l) goto _L6; else goto _L5
_L5:
        obj = ImagePreview.t(a).getChildAt(i);
        obj1 = ((View) (obj)).findViewById(0x7f0b022a);
        int j;
        if (obj1 != null)
        {
            if (flag)
            {
                j = 0;
            } else
            {
                j = 8;
            }
            ((View) (obj1)).setVisibility(j);
        }
        obj = (PhotoView)((View) (obj)).findViewById(0x7f0b00e7);
        if (obj != null)
        {
            if (flag)
            {
                j = ImagePreview.g(a);
            } else
            {
                j = 0;
            }
            ((PhotoView) (obj)).setHeightForInitialScaleCalculation(j);
        }
        if (k == 0) goto _L7; else goto _L6
_L6:
label0:
        {
            obj = new AlphaAnimation(0.0F, 1.0F);
            ((Animation) (obj)).setInterpolator(new DecelerateInterpolator());
            ((Animation) (obj)).setDuration(a.getResources().getInteger(0x10e0001));
            if (flag)
            {
                a.findViewById(0x7f0b0214).setVisibility(8);
                a.findViewById(0x7f0b0162).setVisibility(8);
                if (k == 0)
                {
                    break label0;
                }
            }
            a.findViewById(0x7f0b0214).setVisibility(0);
            a.findViewById(0x7f0b0162).setVisibility(0);
            ImagePreview.d(a).dismiss();
            a.findViewById(0x7f0b0214).startAnimation(((Animation) (obj)));
            a.findViewById(0x7f0b0162).startAnimation(((Animation) (obj)));
        }
        ImagePreview.t(a).startAnimation(((Animation) (obj)));
_L4:
        if (!flag)
        {
            ImagePreview.b(a, ImagePreview.t(a).getHeight());
        }
_L2:
        return;
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "hJ\033ypqU\037h|dPUuwex\tvzvIZ".toCharArray();
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
    //                   1 91
    //                   2 97
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 21;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 1;
          goto _L8
_L3:
        byte0 = 39;
          goto _L8
_L4:
        byte0 = 122;
          goto _L8
        byte0 = 30;
          goto _L8
    }
}
