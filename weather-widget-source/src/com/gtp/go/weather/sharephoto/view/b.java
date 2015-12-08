// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.view;

import android.view.View;
import com.a.a.s;

// Referenced classes of package com.gtp.go.weather.sharephoto.view:
//            PropertyHeightAnimWrapper, c, d

public class b
{

    public static void a(d d, View view)
    {
        view = s.a(new PropertyHeightAnimWrapper(view), "height", new int[] {
            view.getHeight(), 0
        });
        view.b(500L);
        if (d != null)
        {
            view.a(new c(d));
        }
        view.a();
    }
}
