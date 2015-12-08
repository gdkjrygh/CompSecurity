// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.mrdc;

import com.wf.wellsfargomobile.BaseWebViewActivity;

// Referenced classes of package com.wf.wellsfargomobile.mrdc:
//            b, ImageModeType

final class f
    implements Runnable
{

    final BaseWebViewActivity a;
    final ImageModeType b;

    f(BaseWebViewActivity basewebviewactivity, ImageModeType imagemodetype)
    {
        a = basewebviewactivity;
        b = imagemodetype;
        super();
    }

    public void run()
    {
        (new b(a, b)).execute(new Void[0]);
    }
}
