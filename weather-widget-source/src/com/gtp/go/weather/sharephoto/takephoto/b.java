// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import com.gau.go.launcherex.gowidget.weather.service.a.a;
import com.gau.go.launcherex.gowidget.weather.service.a.g;
import com.gtp.go.weather.sharephoto.b.e;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            EditPhotoActivity

class b extends g
{

    final EditPhotoActivity a;

    b(EditPhotoActivity editphotoactivity)
    {
        a = editphotoactivity;
        super();
    }

    public void b(a a1)
    {
        if ((a1 instanceof com.gtp.go.weather.sharephoto.c.b) && -1L != ((com.gtp.go.weather.sharephoto.c.b)a1).c().f())
        {
            a.finish();
        }
    }
}
