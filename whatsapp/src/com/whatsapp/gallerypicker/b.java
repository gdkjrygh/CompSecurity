// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageButton;
import com.whatsapp.ConversationTextEntry;
import com.whatsapp.cq;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview, a5

class b
    implements android.view.View.OnClickListener
{

    final ConversationTextEntry a;
    final ImageButton b;
    final a5 c;

    b(a5 a5_1, ImageButton imagebutton, ConversationTextEntry conversationtextentry)
    {
        c = a5_1;
        b = imagebutton;
        a = conversationtextentry;
        super();
    }

    public void onClick(View view)
    {
        int j = ImagePreview.B;
        if (!ImagePreview.d(c.a).isShowing()) goto _L2; else goto _L1
_L1:
        ImagePreview.d(c.a).dismiss();
        if (j == 0) goto _L3; else goto _L2
_L2:
        int i;
        int k;
        ImagePreview.d(c.a).a(b, b, b, a);
        k = ImagePreview.t(c.a).getChildCount();
        i = 0;
_L7:
        if (i >= k) goto _L3; else goto _L4
_L4:
        view = (ImageButton)ImagePreview.t(c.a).getChildAt(i).findViewById(0x7f0b0167);
        if (view != null)
        {
            view.setImageResource(0x7f0204d6);
        }
        if (j == 0) goto _L5; else goto _L3
_L3:
        return;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
