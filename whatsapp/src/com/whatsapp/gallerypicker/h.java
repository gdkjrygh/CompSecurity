// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.view.View;

// Referenced classes of package com.whatsapp.gallerypicker:
//            GalleryPicker

class h
    implements android.view.View.OnClickListener
{

    final View a;
    final View b;
    final GalleryPicker c;

    h(GalleryPicker gallerypicker, View view, View view1)
    {
        c = gallerypicker;
        b = view;
        a = view1;
        super();
    }

    public void onClick(View view)
    {
        b.setSelected(true);
        a.setSelected(false);
        if (GalleryPicker.d(c) != 1)
        {
            GalleryPicker.a(c, 1);
            GalleryPicker.a(c, GalleryPicker.i(c), GalleryPicker.b(c), true);
            c.invalidateOptionsMenu();
        }
    }
}
