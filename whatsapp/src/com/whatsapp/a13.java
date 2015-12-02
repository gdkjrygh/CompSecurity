// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            VideoPreviewActivity, a1g, cq

class a13
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final VideoPreviewActivity a;

    a13(VideoPreviewActivity videopreviewactivity)
    {
        a = videopreviewactivity;
        super();
    }

    public void onGlobalLayout()
    {
        int i = 0;
        if (VideoPreviewActivity.o(a) != null)
        {
            Object obj = new Rect();
            VideoPreviewActivity.o(a).getWindowVisibleDisplayFrame(((Rect) (obj)));
            a1g a1g1 = a1g.a();
            boolean flag;
            if ((float)(VideoPreviewActivity.o(a).getRootView().getHeight() - (((Rect) (obj)).bottom - ((Rect) (obj)).top)) > a1g1.g * 128F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = a.findViewById(0x7f0b022a);
            if (!flag)
            {
                i = 8;
            }
            ((View) (obj)).setVisibility(i);
            if (!flag)
            {
                VideoPreviewActivity.m(a).dismiss();
            }
        }
    }
}
