// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.database.ContentObserver;
import android.os.Handler;

// Referenced classes of package com.whatsapp.gallerypicker:
//            GalleryPicker, ac

class a8 extends ContentObserver
{

    final GalleryPicker a;

    a8(GalleryPicker gallerypicker, Handler handler)
    {
        a = gallerypicker;
        super(handler);
    }

    public void onChange(boolean flag)
    {
        GalleryPicker.a(a, false, ac.a(a.getContentResolver()));
    }
}
