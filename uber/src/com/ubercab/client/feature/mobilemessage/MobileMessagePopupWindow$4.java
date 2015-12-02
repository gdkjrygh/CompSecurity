// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.mobilemessage;

import cev;
import efn;

// Referenced classes of package com.ubercab.client.feature.mobilemessage:
//            MobileMessagePopupWindow

final class a
    implements Runnable
{

    final MobileMessagePopupWindow a;

    public final void run()
    {
        MobileMessagePopupWindow.e(a);
        MobileMessagePopupWindow.f(a).c(new efn());
    }

    I(MobileMessagePopupWindow mobilemessagepopupwindow)
    {
        a = mobilemessagepopupwindow;
        super();
    }
}
