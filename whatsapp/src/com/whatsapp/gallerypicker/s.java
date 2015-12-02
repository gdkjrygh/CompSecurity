// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.view.View;

// Referenced classes of package com.whatsapp.gallerypicker:
//            GalleryPicker

class s
    implements android.view.View.OnClickListener
{

    final GalleryPicker a;
    final View b;
    final View c;

    s(GalleryPicker gallerypicker, View view, View view1)
    {
        a = gallerypicker;
        c = view;
        b = view1;
        super();
    }

    public void onClick(View view)
    {
        c.setSelected(false);
        b.setSelected(true);
        if (GalleryPicker.d(a) != 4)
        {
            GalleryPicker.a(a, 4);
            GalleryPicker.a(a, GalleryPicker.i(a), GalleryPicker.b(a), true);
            a.invalidateOptionsMenu();
        }
    }
}
