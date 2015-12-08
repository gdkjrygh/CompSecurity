// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import android.net.Uri;
import com.google.android.apps.youtube.core.converter.http.ab;
import org.apache.http.client.methods.HttpUriRequest;

final class al extends ab
{

    private al()
    {
    }

    al(byte byte0)
    {
        this();
    }

    public final volatile Object a(Object obj)
    {
        return a((Uri)obj);
    }

    public final HttpUriRequest a(Uri uri)
    {
        return super.a(uri.buildUpon().appendQueryParameter("pseudo_head", "1").build());
    }
}
