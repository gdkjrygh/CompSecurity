// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import android.util.Log;
import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.walmart.android.utils:
//            UrlUtils

public class RequestPrinter
{

    public static final String TAG = com/walmart/android/utils/RequestPrinter.getSimpleName();

    public RequestPrinter()
    {
    }

    public static void printRequest(HttpUriRequest httpurirequest)
    {
        printRequest(httpurirequest, null);
    }

    public static void printRequest(HttpUriRequest httpurirequest, String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        if (httpurirequest.getMethod().equals("POST") || httpurirequest.getMethod().equals("PUT"))
        {
            s = UrlUtils.reconstructAsGetUrl((HttpEntityEnclosingRequestBase)httpurirequest);
            Log.i(TAG, (new StringBuilder()).append(httpurirequest.getMethod()).append(s1).append(": ").append(s).toString());
            return;
        } else
        {
            Log.v(TAG, (new StringBuilder()).append(httpurirequest.getMethod()).append(s1).append(": ").append(httpurirequest.getURI()).toString());
            return;
        }
    }

    public static void printResponse(HttpUriRequest httpurirequest, String s, int i)
    {
        com/walmart/android/utils/RequestPrinter;
        JVM INSTR monitorenter ;
        if (!httpurirequest.getMethod().equals("POST") && !httpurirequest.getMethod().equals("PUT")) goto _L2; else goto _L1
_L1:
        httpurirequest = UrlUtils.reconstructAsGetUrl((HttpEntityEnclosingRequestBase)httpurirequest);
_L8:
        if (i >= 0) goto _L4; else goto _L3
_L3:
        Log.v(TAG, (new StringBuilder()).append("<RESULT_BEGIN> ").append(httpurirequest).toString());
        break MISSING_BLOCK_LABEL_183;
_L7:
        if (i >= s.length()) goto _L6; else goto _L5
_L5:
        Log.v(TAG, s.substring(i, Math.min(i + 2000, s.length())));
        i += 2000;
          goto _L7
_L2:
        httpurirequest = httpurirequest.getURI().toString();
          goto _L8
_L4:
        Log.v(TAG, (new StringBuilder()).append("<RESULT_BEGIN><HTTP_").append(i).append(">").append(httpurirequest).toString());
        break MISSING_BLOCK_LABEL_183;
        httpurirequest;
        throw httpurirequest;
_L6:
        Log.v(TAG, "<RESULT_END>");
        com/walmart/android/utils/RequestPrinter;
        JVM INSTR monitorexit ;
        return;
        i = 0;
          goto _L7
    }

}
