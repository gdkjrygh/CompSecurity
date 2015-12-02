// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.view.View;

// Referenced classes of package com.whatsapp.messaging:
//            CaptivePortalActivity

class bu
    implements android.view.View.OnClickListener
{

    final CaptivePortalActivity a;

    bu(CaptivePortalActivity captiveportalactivity)
    {
        a = captiveportalactivity;
        super();
    }

    public void onClick(View view)
    {
        a.finish();
    }
}
