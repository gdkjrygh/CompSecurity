// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.wallpaper;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp.wallpaper:
//            WallpaperPicker

class j
    implements android.content.DialogInterface.OnCancelListener
{

    final WallpaperPicker a;

    j(WallpaperPicker wallpaperpicker)
    {
        a = wallpaperpicker;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        a.removeDialog(1);
        a.finish();
    }
}
