// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.widget.ImageView;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            PublishPhotoActivity

class t
    implements android.widget.PopupWindow.OnDismissListener
{

    final PublishPhotoActivity a;

    t(PublishPhotoActivity publishphotoactivity)
    {
        a = publishphotoactivity;
        super();
    }

    public void onDismiss()
    {
        PublishPhotoActivity.a(a).setImageResource(0x7f020417);
    }
}
