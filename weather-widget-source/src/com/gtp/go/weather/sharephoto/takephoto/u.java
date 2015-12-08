// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.content.DialogInterface;
import android.view.KeyEvent;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            PublishPhotoActivity

class u
    implements android.content.DialogInterface.OnKeyListener
{

    final PublishPhotoActivity a;

    u(PublishPhotoActivity publishphotoactivity)
    {
        a = publishphotoactivity;
        super();
    }

    public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        return i == 4 && keyevent.getRepeatCount() == 0;
    }
}
