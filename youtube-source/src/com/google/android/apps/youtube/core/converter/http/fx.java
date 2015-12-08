// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.core.converter.o;
import org.xml.sax.Attributes;

final class fx extends o
{

    fx()
    {
    }

    public final void a(l l1, Attributes attributes)
    {
        l1 = (com.google.android.apps.youtube.datalib.model.gdata.Video.Builder)l1.a(com/google/android/apps/youtube/datalib/model/gdata/Video$Builder);
        l1.likesCount(m.a(attributes.getValue("numLikes"), 0L));
        l1.dislikesCount(m.a(attributes.getValue("numDislikes"), 0L));
    }
}
