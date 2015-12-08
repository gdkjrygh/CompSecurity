// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.http;

import android.os.Bundle;
import java.net.HttpURLConnection;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

final class a extends BasicHttpResponse
{

    private static final StatusLine e;
    Bundle a;
    long b;
    long c;
    HttpURLConnection d;

    a()
    {
        super(e, null, null);
    }

    static 
    {
        e = new BasicStatusLine(HttpVersion.HTTP_1_1, 500, "Unknown error");
    }
}
