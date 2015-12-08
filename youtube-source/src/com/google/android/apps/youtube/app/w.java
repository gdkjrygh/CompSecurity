// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.view.View;
import android.widget.CheckBox;
import com.google.android.apps.youtube.core.client.p;
import com.google.android.apps.youtube.core.utils.ah;

// Referenced classes of package com.google.android.apps.youtube.app:
//            DebugOnlineAdActivity

final class w
    implements android.view.View.OnClickListener
{

    final DebugOnlineAdActivity a;

    w(DebugOnlineAdActivity debugonlineadactivity)
    {
        a = debugonlineadactivity;
        super();
    }

    public final void onClick(View view)
    {
        DebugOnlineAdActivity.b(a).a(DebugOnlineAdActivity.a(a).isChecked());
        DebugOnlineAdActivity.c(a);
        if (DebugOnlineAdActivity.a(a).isChecked() && !DebugOnlineAdActivity.d(a))
        {
            ah.b(a, "Restart YouTube app for changes to take effect", 1);
        }
    }
}
