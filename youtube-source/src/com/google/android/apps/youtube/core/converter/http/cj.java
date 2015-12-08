// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import org.xml.sax.Attributes;

final class cj extends o
{

    cj()
    {
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        ((com.google.android.apps.youtube.datalib.legacy.model.Playlist.Builder)l1.a(com/google/android/apps/youtube/datalib/legacy/model/Playlist$Builder)).id(s);
    }
}
