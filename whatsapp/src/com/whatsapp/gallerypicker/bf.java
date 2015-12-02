// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.support.v4.view.ViewPager;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview

class bf
    implements android.view.View.OnClickListener
{

    final ImagePreview a;
    final ImagePreview.ThumbImageView b;

    bf(ImagePreview.ThumbImageView thumbimageview, ImagePreview imagepreview)
    {
        b = thumbimageview;
        a = imagepreview;
        super();
    }

    public void onClick(View view)
    {
        ImagePreview.t(b.z).setCurrentItem(ImagePreview.s(b.z).indexOf(ImagePreview.ThumbImageView.a(b)));
    }
}
