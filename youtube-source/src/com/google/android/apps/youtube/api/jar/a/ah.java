// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.core.player.overlay.g;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ae

final class ah
    implements Runnable
{

    final String a;
    final String b;
    final ae c;

    ah(ae ae1, String s, String s1)
    {
        c = ae1;
        a = s;
        b = s1;
        super();
    }

    public final void run()
    {
        ae.b(c).setCallToActionText(a, b);
    }
}
