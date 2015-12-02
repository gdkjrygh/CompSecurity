// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.whatsapp.gallerypicker:
//            GalleryPicker

class ak
    implements android.widget.AdapterView.OnItemClickListener
{

    final GalleryPicker a;

    ak(GalleryPicker gallerypicker)
    {
        a = gallerypicker;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        GalleryPicker.b(a, i);
    }
}
