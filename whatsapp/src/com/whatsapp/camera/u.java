// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;


// Referenced classes of package com.whatsapp.camera:
//            AutofocusOverlay

class u
    implements Runnable
{

    final AutofocusOverlay a;

    u(AutofocusOverlay autofocusoverlay)
    {
        a = autofocusoverlay;
        super();
    }

    public void run()
    {
        a.setVisibility(8);
    }
}
