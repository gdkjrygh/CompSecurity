// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageButton;
import com.whatsapp.cq;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview

class j extends cq
{

    final ImagePreview k;

    j(ImagePreview imagepreview, Activity activity)
    {
        k = imagepreview;
        super(activity);
    }

    public void dismiss()
    {
        int l = ImagePreview.B;
        super.dismiss();
        int i1 = ImagePreview.t(k).getChildCount();
        int i = 0;
        do
        {
label0:
            {
                if (i < i1)
                {
                    ImageButton imagebutton = (ImageButton)ImagePreview.t(k).getChildAt(i).findViewById(0x7f0b0167);
                    if (imagebutton != null)
                    {
                        imagebutton.setImageResource(0x7f0204cf);
                    }
                    if (l == 0)
                    {
                        break label0;
                    }
                }
                return;
            }
            i++;
        } while (true);
    }
}
