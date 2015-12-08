// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.io;

import ch.boye.httpclientandroidlib.HttpMessage;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.io.SessionOutputBuffer;
import ch.boye.httpclientandroidlib.message.LineFormatter;
import ch.boye.httpclientandroidlib.params.HttpParams;
import java.io.IOException;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.io:
//            AbstractMessageWriter

public class HttpResponseWriter extends AbstractMessageWriter
{

    public HttpResponseWriter(SessionOutputBuffer sessionoutputbuffer, LineFormatter lineformatter, HttpParams httpparams)
    {
        super(sessionoutputbuffer, lineformatter, httpparams);
    }

    protected volatile void writeHeadLine(HttpMessage httpmessage)
        throws IOException
    {
        writeHeadLine((HttpResponse)httpmessage);
    }

    protected void writeHeadLine(HttpResponse httpresponse)
        throws IOException
    {
        lineFormatter.formatStatusLine(lineBuf, httpresponse.getStatusLine());
        sessionBuffer.writeLine(lineBuf);
    }
}
