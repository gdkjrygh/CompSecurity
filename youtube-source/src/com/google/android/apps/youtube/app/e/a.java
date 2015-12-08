// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.e;

import android.graphics.Bitmap;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

public final class a
{

    public final Video a;
    public final Bitmap b;
    public final int c;

    public a(Video video, Bitmap bitmap, int i)
    {
        a = (Video)com.google.android.apps.youtube.common.fromguava.c.a(video);
        b = (Bitmap)com.google.android.apps.youtube.common.fromguava.c.a(bitmap);
        c = i;
    }
}
