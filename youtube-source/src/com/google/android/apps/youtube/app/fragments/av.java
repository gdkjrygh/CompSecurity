// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.net.Uri;
import com.google.android.apps.youtube.app.ui.ha;
import com.google.android.apps.youtube.common.fromguava.d;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

final class av
    implements d
{

    private final Video a;

    av(Video video)
    {
        a = video;
    }

    public final boolean a(Object obj)
    {
        obj = (ha)obj;
        return obj != null && ((ha) (obj)).a() && ((ha) (obj)).a.editUri != null && ((ha) (obj)).a.editUri.equals(a.editUri);
    }
}
