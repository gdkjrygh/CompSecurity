// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            e

final class f extends e
{

    public f(View view, ViewGroup viewgroup)
    {
        super(view, viewgroup);
    }

    protected final volatile boolean a(Object obj)
    {
        return ((Video)obj).is3d;
    }

    protected final boolean b(Object obj)
    {
        return ((Video)obj).isLive();
    }
}
