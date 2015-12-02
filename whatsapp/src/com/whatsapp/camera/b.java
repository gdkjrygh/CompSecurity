// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;


// Referenced classes of package com.whatsapp.camera:
//            ShutterOverlay

class b
    implements Runnable
{

    final ShutterOverlay a;

    b(ShutterOverlay shutteroverlay)
    {
        a = shutteroverlay;
        super();
    }

    public void run()
    {
        ShutterOverlay.a(a, false);
        a.invalidate();
    }
}
