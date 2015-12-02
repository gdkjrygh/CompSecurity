// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.ImageButton;

// Referenced classes of package com.whatsapp:
//            VideoPreviewActivity, cq, App

class abr
    implements android.view.View.OnClickListener
{

    final VideoPreviewActivity a;

    abr(VideoPreviewActivity videopreviewactivity)
    {
        a = videopreviewactivity;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            if (VideoPreviewActivity.m(a).isShowing())
            {
                VideoPreviewActivity.m(a).dismiss();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            VideoPreviewActivity.m(a).a(VideoPreviewActivity.g(a), VideoPreviewActivity.g(a), VideoPreviewActivity.g(a), VideoPreviewActivity.j(a));
            VideoPreviewActivity.g(a).setImageResource(0x7f0204d6);
        }
    }
}
