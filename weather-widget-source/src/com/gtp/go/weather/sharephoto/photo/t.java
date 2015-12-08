// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import com.jiubang.pla.listview.MultiColumnListView;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            PhotoActivity

class t
    implements Runnable
{

    final PhotoActivity a;

    t(PhotoActivity photoactivity)
    {
        a = photoactivity;
        super();
    }

    public void run()
    {
        PhotoActivity.h(a).C();
    }
}
