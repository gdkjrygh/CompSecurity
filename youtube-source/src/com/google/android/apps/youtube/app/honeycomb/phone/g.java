// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            EditVideoActivity

final class g
    implements android.view.View.OnClickListener
{

    final EditVideoActivity a;

    g(EditVideoActivity editvideoactivity)
    {
        a = editvideoactivity;
        super();
    }

    public final void onClick(View view)
    {
        EditVideoActivity.a(a);
    }
}
