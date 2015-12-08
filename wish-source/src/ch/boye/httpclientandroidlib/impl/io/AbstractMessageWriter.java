// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.io;

import ch.boye.httpclientandroidlib.HeaderIterator;
import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpMessage;
import ch.boye.httpclientandroidlib.io.HttpMessageWriter;
import ch.boye.httpclientandroidlib.io.SessionOutputBuffer;
import ch.boye.httpclientandroidlib.message.BasicLineFormatter;
import ch.boye.httpclientandroidlib.message.LineFormatter;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.util.CharArrayBuffer;
import java.io.IOException;

public abstract class AbstractMessageWriter
    implements HttpMessageWriter
{

    protected final CharArrayBuffer lineBuf = new CharArrayBuffer(128);
    protected final LineFormatter lineFormatter;
    protected final SessionOutputBuffer sessionBuffer;

    public AbstractMessageWriter(SessionOutputBuffer sessionoutputbuffer, LineFormatter lineformatter, HttpParams httpparams)
    {
        if (sessionoutputbuffer == null)
        {
            throw new IllegalArgumentException("Session input buffer may not be null");
        }
        sessionBuffer = sessionoutputbuffer;
        if (lineformatter == null)
        {
            lineformatter = BasicLineFormatter.DEFAULT;
        }
        lineFormatter = lineformatter;
    }

    public void write(HttpMessage httpmessage)
        throws IOException, HttpException
    {
        if (httpmessage == null)
        {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
        writeHeadLine(httpmessage);
        ch.boye.httpclientandroidlib.Header header;
        for (httpmessage = httpmessage.headerIterator(); httpmessage.hasNext(); sessionBuffer.writeLine(lineFormatter.formatHeader(lineBuf, header)))
        {
            header = httpmessage.nextHeader();
        }

        lineBuf.clear();
        sessionBuffer.writeLine(lineBuf);
    }

    protected abstract void writeHeadLine(HttpMessage httpmessage)
        throws IOException;
}
