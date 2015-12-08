// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo.service;

import android.util.Pair;
import com.walmartlabs.kangaroo.Form;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import okio.BufferedSource;

// Referenced classes of package com.walmartlabs.kangaroo.service:
//            Converter, RequestBuilder

private static class <init>
    implements Converter
{

    public Object from(BufferedSource bufferedsource, Class class1)
        throws IOException
    {
        throw new UnsupportedEncodingException();
    }

    public String getContentType()
    {
        return "application/x-www-form-urlencoded";
    }

    public String toString(Object obj)
        throws IOException
    {
        Object obj1 = (Form)obj;
        obj = new StringBuilder();
        for (obj1 = ((Form) (obj1)).getKeyValuePairs().iterator(); ((Iterator) (obj1)).hasNext();)
        {
            Pair pair = (Pair)((Iterator) (obj1)).next();
            if (((StringBuilder) (obj)).length() > 0)
            {
                ((StringBuilder) (obj)).append('&');
            }
            try
            {
                ((StringBuilder) (obj)).append(URLEncoder.encode((String)pair.first, "UTF-8"));
                ((StringBuilder) (obj)).append('=');
                ((StringBuilder) (obj)).append(URLEncoder.encode((String)pair.second, "UTF-8"));
            }
            catch (UnsupportedEncodingException unsupportedencodingexception) { }
        }

        return ((StringBuilder) (obj)).toString();
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
