// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.entity;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpMessage;
import ch.boye.httpclientandroidlib.ParseException;
import ch.boye.httpclientandroidlib.ProtocolException;
import ch.boye.httpclientandroidlib.entity.ContentLengthStrategy;
import ch.boye.httpclientandroidlib.params.HttpParams;

public class LaxContentLengthStrategy
    implements ContentLengthStrategy
{

    private final int implicitLen;

    public LaxContentLengthStrategy()
    {
        this(-1);
    }

    public LaxContentLengthStrategy(int i)
    {
        implicitLen = i;
    }

    public long determineLength(HttpMessage httpmessage)
        throws HttpException
    {
        Header header;
        boolean flag;
        if (httpmessage == null)
        {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
        flag = httpmessage.getParams().isParameterTrue("http.protocol.strict-transfer-encoding");
        header = httpmessage.getFirstHeader("Transfer-Encoding");
        if (header == null) goto _L2; else goto _L1
_L1:
        int j;
        try
        {
            httpmessage = header.getElements();
        }
        // Misplaced declaration of an exception variable
        catch (HttpMessage httpmessage)
        {
            throw new ProtocolException((new StringBuilder()).append("Invalid Transfer-Encoding header value: ").append(header).toString(), httpmessage);
        }
        if (flag)
        {
            for (int i = 0; i < httpmessage.length; i++)
            {
                String s = httpmessage[i].getName();
                if (s != null && s.length() > 0 && !s.equalsIgnoreCase("chunked") && !s.equalsIgnoreCase("identity"))
                {
                    throw new ProtocolException((new StringBuilder()).append("Unsupported transfer encoding: ").append(s).toString());
                }
            }

        }
        j = httpmessage.length;
        if (!"identity".equalsIgnoreCase(header.getValue())) goto _L4; else goto _L3
_L3:
        long l1 = -1L;
_L9:
        return l1;
_L4:
        if (j > 0 && "chunked".equalsIgnoreCase(httpmessage[j - 1].getName()))
        {
            return -2L;
        }
        if (flag)
        {
            throw new ProtocolException("Chunk-encoding must be the last one applied");
        } else
        {
            return -1L;
        }
_L2:
        if (httpmessage.getFirstHeader("Content-Length") == null) goto _L6; else goto _L5
_L5:
        l1 = -1L;
        httpmessage = httpmessage.getHeaders("Content-Length");
        if (flag && httpmessage.length > 1)
        {
            throw new ProtocolException("Multiple content length headers");
        }
        j = httpmessage.length - 1;
_L7:
        long l;
        l = l1;
        if (j < 0)
        {
            break MISSING_BLOCK_LABEL_318;
        }
        header = httpmessage[j];
        l = Long.parseLong(header.getValue());
        l1 = l;
        if (l < 0L)
        {
            return -1L;
        }
        continue; /* Loop/switch isn't completed */
        NumberFormatException numberformatexception;
        numberformatexception;
        if (flag)
        {
            throw new ProtocolException((new StringBuilder()).append("Invalid content length: ").append(header.getValue()).toString());
        }
        j--;
        if (true) goto _L7; else goto _L6
_L6:
        return (long)implicitLen;
        if (true) goto _L9; else goto _L8
_L8:
    }
}
