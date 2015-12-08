// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore.detail;

import android.view.View;

// Referenced classes of package com.go.weatherex.themestore.detail:
//            f

class l
    implements Runnable
{

    final View a;
    final f b;

    l(f f, View view)
    {
        b = f;
        a = view;
        super();
    }

    public void run()
    {
        a.setClickable(true);
    }
}
