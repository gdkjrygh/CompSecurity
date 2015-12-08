// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.net.Uri;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            HttpMethod

final class nit> extends HttpMethod
{

    public final HttpUriRequest createHttpRequest(Uri uri)
    {
        return new HttpPut(uri.toString());
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
