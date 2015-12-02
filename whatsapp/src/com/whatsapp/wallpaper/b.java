// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.wallpaper;

import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.whatsapp.wallpaper:
//            WallpaperPicker

class b
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final WallpaperPicker b;

    b(WallpaperPicker wallpaperpicker, String s)
    {
        b = wallpaperpicker;
        a = s;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        b.startActivity(new Intent(a));
    }
}
