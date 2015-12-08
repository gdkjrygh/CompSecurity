// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.events;

import android.net.Uri;
import com.google.android.gms.appindexing.AndroidAppUri;

public class AppIndexEvent
{

    public final String actionType = "http://schema.org/ViewAction";
    public final Uri appUrl;
    public final Object source;
    public final String title;
    public final Uri webUrl;

    public AppIndexEvent(Object obj, String s, Uri uri, Uri uri1)
    {
        source = obj;
        title = s;
        webUrl = uri;
        appUrl = AndroidAppUri.newAndroidAppUri("com.walmart.android", uri1).toUri();
    }
}
