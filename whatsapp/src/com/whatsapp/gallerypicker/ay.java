// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.PhotoView;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ae, ImagePreview

class ay
    implements ae
{

    final Uri a;
    final PhotoView b;
    final ImagePreview c;

    ay(ImagePreview imagepreview, PhotoView photoview, Uri uri)
    {
        c = imagepreview;
        b = photoview;
        a = uri;
        super();
    }

    public void a()
    {
    }

    public void a(Bitmap bitmap, boolean flag)
    {
        if (b.getTag() == a)
        {
            b.a(bitmap);
        }
    }
}
