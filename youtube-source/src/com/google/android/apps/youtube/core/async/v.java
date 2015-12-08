// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.methods.HttpUriRequest;

public final class v
{

    public static String a(HttpUriRequest httpurirequest)
    {
        stringbuilder.append(" -d '");
        if (k != 0)
        {
            stringbuilder.append("$(printf '");
            stringbuilder.append(httpurirequest.toString());
            stringbuilder.append("')");
        } else
        {
            stringbuilder.append(httpurirequest.toString());
        }
        stringbuilder.append("'");
_L2:
        return stringbuilder.toString();
label0:
        {
            int k = 0;
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("curl");
            Header aheader[] = httpurirequest.getAllHeaders();
            int l = aheader.length;
            for (int i = 0; i < l; i++)
            {
                Header header = aheader[i];
                stringbuilder.append(" -H '");
                stringbuilder.append(header.getName().replace("'", "\\'"));
                stringbuilder.append(": ");
                stringbuilder.append(header.getValue().replace("'", "\\'"));
                stringbuilder.append("'");
            }

            stringbuilder.append(" '");
            stringbuilder.append(httpurirequest.getURI());
            stringbuilder.append("'");
            if (httpurirequest instanceof HttpEntityEnclosingRequest)
            {
label1:
                {
                    Object obj = new ByteArrayOutputStream();
                    httpurirequest = ((HttpEntityEnclosingRequest)httpurirequest).getEntity();
                    if (httpurirequest == null)
                    {
                        break label1;
                    }
                    int j;
                    int i1;
                    byte byte0;
                    try
                    {
                        httpurirequest.writeTo(((java.io.OutputStream) (obj)));
                    }
                    // Misplaced declaration of an exception variable
                    catch (HttpUriRequest httpurirequest)
                    {
                        try
                        {
                            ((ByteArrayOutputStream) (obj)).close();
                        }
                        // Misplaced declaration of an exception variable
                        catch (HttpUriRequest httpurirequest) { }
                        break label1;
                    }
                    finally
                    {
                        try
                        {
                            ((ByteArrayOutputStream) (obj)).close();
                        }
                        catch (IOException ioexception) { }
                        throw httpurirequest;
                    }
                    try
                    {
                        ((ByteArrayOutputStream) (obj)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (HttpUriRequest httpurirequest) { }
                }
                httpurirequest = new StringBuilder();
                obj = ((ByteArrayOutputStream) (obj)).toByteArray();
                i1 = obj.length;
                j = 0;
                while (j < i1) 
                {
                    byte0 = obj[j];
                    if (byte0 >= 32 && (char)byte0 != '\'')
                    {
                        httpurirequest.append((char)byte0);
                    } else
                    {
                        k = (byte0 + 256) % 256;
                        httpurirequest.append("\\x");
                        if (k < 16)
                        {
                            httpurirequest.append('0');
                        }
                        httpurirequest.append(Integer.toString(k, 16));
                        k = 1;
                    }
                    j++;
                }
                break label0;
            }
        }
        if (!httpurirequest.getMethod().equals("GET"))
        {
            stringbuilder.append(" -X ");
            stringbuilder.append(httpurirequest.getMethod());
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
