// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.widget.ImageView;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            UserPhotosActivity

class aa
    implements Runnable
{

    final UserPhotosActivity a;

    aa(UserPhotosActivity userphotosactivity)
    {
        a = userphotosactivity;
        super();
    }

    public void run()
    {
        UserPhotosActivity.c(a).setImageResource(0x7f0203cf);
    }
}
