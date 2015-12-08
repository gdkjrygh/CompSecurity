// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model.media;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class g
{

    public static final Set a;

    static 
    {
        HashSet hashset = new HashSet();
        hashset.add("video/mp4");
        hashset.add("video/3gpp");
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            hashset.add("application/x-mpegURL");
        }
        a = Collections.unmodifiableSet(hashset);
    }
}
