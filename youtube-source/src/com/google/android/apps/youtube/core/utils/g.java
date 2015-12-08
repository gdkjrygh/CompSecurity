// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.fromguava.d;
import com.google.android.apps.youtube.core.async.GDataRequest;
import java.util.List;

public final class g
    implements d
{

    private final String a;

    public g(String s)
    {
        a = c.a(s, "pathSegment can't be empty");
    }

    public final boolean a(Object obj)
    {
        return ((GDataRequest)obj).a.getPathSegments().contains(a);
    }
}
