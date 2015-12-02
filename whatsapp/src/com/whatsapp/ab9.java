// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            VideoPreviewActivity

class ab9
    implements android.view.View.OnClickListener
{

    final VideoPreviewActivity a;

    ab9(VideoPreviewActivity videopreviewactivity)
    {
        a = videopreviewactivity;
        super();
    }

    public void onClick(View view)
    {
        a.setResult(2);
        a.finish();
    }
}
