// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.widget.ImageButton;

// Referenced classes of package com.whatsapp:
//            cq, VideoPreviewActivity

class ci extends cq
{

    final VideoPreviewActivity k;

    ci(VideoPreviewActivity videopreviewactivity, Activity activity)
    {
        k = videopreviewactivity;
        super(activity);
    }

    public void dismiss()
    {
        super.dismiss();
        VideoPreviewActivity.g(k).setImageResource(0x7f0204cf);
    }
}
