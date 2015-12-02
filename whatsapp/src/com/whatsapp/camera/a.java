// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;


// Referenced classes of package com.whatsapp.camera:
//            ZoomOverlay

class a
    implements Runnable
{

    final ZoomOverlay a;

    a(ZoomOverlay zoomoverlay)
    {
        a = zoomoverlay;
        super();
    }

    public void run()
    {
        a.setVisibility(8);
    }
}
