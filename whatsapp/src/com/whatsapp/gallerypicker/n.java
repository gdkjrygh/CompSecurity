// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImageGallery, ai

class n
    implements android.widget.AdapterView.OnItemClickListener
{

    final ImageGallery a;

    n(ImageGallery imagegallery)
    {
        a = imagegallery;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ImageGallery.a(a).a(i);
        ImageGallery.a(a, adapterview);
    }
}
