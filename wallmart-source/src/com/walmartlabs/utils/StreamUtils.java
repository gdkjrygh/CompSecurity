// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.utils;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamUtils
{

    public StreamUtils()
    {
    }

    public static void closeQuietly(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
        closeable.printStackTrace();
        return;
    }

    public static String inputStreamToString(InputStream inputstream)
    {
        return inputStreamToString(inputstream, "ISO-8859-1");
    }

    public static String inputStreamToString(InputStream inputstream, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        inputstream = new BufferedReader(new InputStreamReader(inputstream, s));
_L1:
        s = inputstream.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        stringbuilder.append(s);
          goto _L1
        inputstream;
        return stringbuilder.toString();
    }
}
