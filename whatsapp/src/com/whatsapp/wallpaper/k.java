// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.wallpaper;

import android.view.View;

// Referenced classes of package com.whatsapp.wallpaper:
//            CropImage

class k
    implements android.view.View.OnClickListener
{

    final CropImage a;

    k(CropImage cropimage)
    {
        a = cropimage;
        super();
    }

    public void onClick(View view)
    {
        CropImage.a(a);
        a.finish();
    }
}
