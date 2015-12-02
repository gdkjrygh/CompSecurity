// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.res.Resources;
import android.view.ViewTreeObserver;
import android.widget.ListView;

// Referenced classes of package com.whatsapp:
//            MessageDetailsActivity

class jg
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final MessageDetailsActivity a;

    jg(MessageDetailsActivity messagedetailsactivity)
    {
        a = messagedetailsactivity;
        super();
    }

    public void onGlobalLayout()
    {
        MessageDetailsActivity.e(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        MessageDetailsActivity.e(a).setSelectionFromTop(1, a.getResources().getDimensionPixelSize(0x7f0a0000) * 3);
    }
}
