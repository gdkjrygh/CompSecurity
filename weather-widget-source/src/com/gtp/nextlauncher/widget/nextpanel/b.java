// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.nextpanel;

import com.go.gl.view.GLView;

// Referenced classes of package com.gtp.nextlauncher.widget.nextpanel:
//            CityView

class b
    implements com.go.gl.view.GLView.OnClickListener
{

    final CityView a;

    b(CityView cityview)
    {
        a = cityview;
        super();
    }

    public void onClick(GLView glview)
    {
        CityView.access$000(a);
    }
}
