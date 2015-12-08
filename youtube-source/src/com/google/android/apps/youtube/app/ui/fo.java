// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.View;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            fm

final class fo
    implements android.view.View.OnClickListener
{

    final Video a;
    final fm b;

    fo(fm fm1, Video video)
    {
        b = fm1;
        a = video;
        super();
    }

    public final void onClick(View view)
    {
        b.a(a.id);
    }
}
