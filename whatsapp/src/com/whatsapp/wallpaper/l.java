// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.wallpaper;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp.wallpaper:
//            WallpaperPicker

class l
    implements android.content.DialogInterface.OnClickListener
{

    final WallpaperPicker a;

    l(WallpaperPicker wallpaperpicker)
    {
        a = wallpaperpicker;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.removeDialog(1);
        a.finish();
    }
}
