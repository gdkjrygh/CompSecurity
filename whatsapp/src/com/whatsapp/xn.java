// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            OverlayAlert

class xn
    implements android.view.View.OnClickListener
{

    final OverlayAlert a;

    xn(OverlayAlert overlayalert)
    {
        a = overlayalert;
        super();
    }

    public void onClick(View view)
    {
        a.finish();
    }
}
