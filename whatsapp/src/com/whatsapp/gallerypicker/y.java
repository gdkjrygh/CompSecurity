// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.view.ContextMenu;
import android.view.View;

// Referenced classes of package com.whatsapp.gallerypicker:
//            GalleryPicker

class y
    implements android.view.View.OnCreateContextMenuListener
{

    final GalleryPicker a;

    y(GalleryPicker gallerypicker)
    {
        a = gallerypicker;
        super();
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        GalleryPicker.a(a, contextmenu, contextmenuinfo);
    }
}
