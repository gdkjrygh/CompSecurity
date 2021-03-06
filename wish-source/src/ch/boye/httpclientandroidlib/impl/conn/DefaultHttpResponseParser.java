// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn;

import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpMessage;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.HttpResponseFactory;
import ch.boye.httpclientandroidlib.NoHttpResponseException;
import ch.boye.httpclientandroidlib.ParseException;
import ch.boye.httpclientandroidlib.ProtocolException;
import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.impl.io.AbstractMessageParser;
import ch.boye.httpclientandroidlib.io.SessionInputBuffer;
import ch.boye.httpclientandroidlib.message.LineParser;
import ch.boye.httpclientandroidlib.message.ParserCursor;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.util.CharArrayBuffer;
import java.io.IOException;

public class DefaultHttpResponseParser extends AbstractMessageParser
{

    private final CharArrayBuffer lineBuf;
    public HttpClientAndroidLog log;
    private final HttpResponseFactory responseFactory;

    public DefaultHttpResponseParser(SessionInputBuffer sessioninputbuffer, LineParser lineparser, HttpResponseFactory httpresponsefactory, HttpParams httpparams)
    {
        super(sessioninputbuffer, lineparser, httpparams);
        log = new HttpClientAndroidLog(getClass());
        if (httpresponsefactory == null)
        {
            throw new IllegalArgumentException("Response factory may not be null");
        } else
        {
            responseFactory = httpresponsefactory;
            lineBuf = new CharArrayBuffer(128);
            return;
        }
    }

    protected volatile HttpMessage parseHead(SessionInputBuffer sessioninputbuffer)
        throws IOException, HttpException, ParseException
    {
        return parseHead(sessioninputbuffer);
    }

    protected HttpResponse parseHead(SessionInputBuffer sessioninputbuffer)
        throws IOException, HttpException
    {
        int i = 0;
        do
        {
            lineBuf.clear();
            int j = sessioninputbuffer.readLine(lineBuf);
            if (j == -1 && i == 0)
            {
                throw new NoHttpResponseException("The target server failed to respond");
            }
            ParserCursor parsercursor = new ParserCursor(0, lineBuf.length());
            if (lineParser.hasProtocolVersion(lineBuf, parsercursor))
            {
                sessioninputbuffer = lineParser.parseStatusLine(lineBuf, parsercursor);
                return responseFactory.newHttpResponse(sessioninputbuffer, null);
            }
            if (j == -1 || reject(lineBuf, i))
            {
                throw new ProtocolException("The server failed to respond with a valid HTTP response");
            }
            if (log.isDebugEnabled())
            {
                log.debug((new StringBuilder()).append("Garbage in response: ").append(lineBuf.toString()).toString());
            }
            i++;
        } while (true);
    }

    protected boolean reject(CharArrayBuffer chararraybuffer, int i)
    {
        return false;
    }
}
