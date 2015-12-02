// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.mobilemessage;

import android.view.animation.Animation;
import dru;

// Referenced classes of package com.ubercab.client.feature.mobilemessage:
//            MobileMessagePopupWindow

final class a extends dru
{

    final MobileMessagePopupWindow a;

    public final void onAnimationEnd(Animation animation)
    {
        MobileMessagePopupWindow.c(a);
        MobileMessagePopupWindow.d(a);
        a.e();
    }

    I(MobileMessagePopupWindow mobilemessagepopupwindow)
    {
        a = mobilemessagepopupwindow;
        super();
    }
}
