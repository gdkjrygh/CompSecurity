// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.io;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpMessage;
import ch.boye.httpclientandroidlib.ParseException;
import ch.boye.httpclientandroidlib.ProtocolException;
import ch.boye.httpclientandroidlib.io.HttpMessageParser;
import ch.boye.httpclientandroidlib.io.SessionInputBuffer;
import ch.boye.httpclientandroidlib.message.BasicLineParser;
import ch.boye.httpclientandroidlib.message.LineParser;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.util.CharArrayBuffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMessageParser
    implements HttpMessageParser
{

    private static final int HEADERS = 1;
    private static final int HEAD_LINE = 0;
    private final List headerLines = new ArrayList();
    protected final LineParser lineParser;
    private final int maxHeaderCount;
    private final int maxLineLen;
    private HttpMessage message;
    private final SessionInputBuffer sessionBuffer;
    private int state;

    public AbstractMessageParser(SessionInputBuffer sessioninputbuffer, LineParser lineparser, HttpParams httpparams)
    {
        if (sessioninputbuffer == null)
        {
            throw new IllegalArgumentException("Session input buffer may not be null");
        }
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        sessionBuffer = sessioninputbuffer;
        maxHeaderCount = httpparams.getIntParameter("http.connection.max-header-count", -1);
        maxLineLen = httpparams.getIntParameter("http.connection.max-line-length", -1);
        if (lineparser == null)
        {
            lineparser = BasicLineParser.DEFAULT;
        }
        lineParser = lineparser;
        state = 0;
    }

    public static Header[] parseHeaders(SessionInputBuffer sessioninputbuffer, int i, int j, LineParser lineparser)
        throws HttpException, IOException
    {
        Object obj = lineparser;
        if (lineparser == null)
        {
            obj = BasicLineParser.DEFAULT;
        }
        return parseHeaders(sessioninputbuffer, i, j, ((LineParser) (obj)), ((List) (new ArrayList())));
    }

    public static Header[] parseHeaders(SessionInputBuffer sessioninputbuffer, int i, int j, LineParser lineparser, List list)
        throws HttpException, IOException
    {
        CharArrayBuffer chararraybuffer1;
        CharArrayBuffer chararraybuffer2;
        if (sessioninputbuffer == null)
        {
            throw new IllegalArgumentException("Session input buffer may not be null");
        }
        if (lineparser == null)
        {
            throw new IllegalArgumentException("Line parser may not be null");
        }
        if (list == null)
        {
            throw new IllegalArgumentException("Header line list may not be null");
        }
        chararraybuffer1 = null;
        chararraybuffer2 = null;
_L2:
        CharArrayBuffer chararraybuffer;
        if (chararraybuffer1 == null)
        {
            chararraybuffer = new CharArrayBuffer(64);
        } else
        {
            chararraybuffer1.clear();
            chararraybuffer = chararraybuffer1;
        }
        if (sessioninputbuffer.readLine(chararraybuffer) == -1 || chararraybuffer.length() < 1)
        {
            sessioninputbuffer = new Header[list.size()];
            i = 0;
            while (i < list.size()) 
            {
                chararraybuffer = (CharArrayBuffer)list.get(i);
                CharArrayBuffer chararraybuffer3;
                int k;
                char c;
                try
                {
                    sessioninputbuffer[i] = lineparser.parseHeader(chararraybuffer);
                }
                // Misplaced declaration of an exception variable
                catch (SessionInputBuffer sessioninputbuffer)
                {
                    throw new ProtocolException(sessioninputbuffer.getMessage());
                }
                i++;
            }
            break MISSING_BLOCK_LABEL_361;
        }
        if (chararraybuffer.charAt(0) != ' ' && chararraybuffer.charAt(0) != '\t' || chararraybuffer2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        k = 0;
label0:
        do
        {
label1:
            {
                if (k < chararraybuffer.length())
                {
                    c = chararraybuffer.charAt(k);
                    if (c == ' ' || c == '\t')
                    {
                        break label1;
                    }
                }
                if (j > 0 && (chararraybuffer2.length() + 1 + chararraybuffer.length()) - k > j)
                {
                    throw new IOException("Maximum line length limit exceeded");
                }
                break label0;
            }
            k++;
        } while (true);
        chararraybuffer2.append(' ');
        chararraybuffer2.append(chararraybuffer, k, chararraybuffer.length() - k);
        chararraybuffer3 = chararraybuffer2;
_L3:
        chararraybuffer1 = chararraybuffer;
        chararraybuffer2 = chararraybuffer3;
        if (i > 0)
        {
            chararraybuffer1 = chararraybuffer;
            chararraybuffer2 = chararraybuffer3;
            if (list.size() >= i)
            {
                throw new IOException("Maximum header count exceeded");
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        list.add(chararraybuffer);
        chararraybuffer3 = chararraybuffer;
        chararraybuffer = null;
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        return sessioninputbuffer;
    }

    public HttpMessage parse()
        throws IOException, HttpException
    {
        switch (state)
        {
        default:
            throw new IllegalStateException("Inconsistent parser state");

        case 0: // '\0'
            Header aheader[];
            HttpMessage httpmessage;
            try
            {
                message = parseHead(sessionBuffer);
            }
            catch (ParseException parseexception)
            {
                throw new ProtocolException(parseexception.getMessage(), parseexception);
            }
            state = 1;
            // fall through

        case 1: // '\001'
            aheader = parseHeaders(sessionBuffer, maxHeaderCount, maxLineLen, lineParser, headerLines);
            message.setHeaders(aheader);
            httpmessage = message;
            message = null;
            headerLines.clear();
            state = 0;
            return httpmessage;
        }
    }

    protected abstract HttpMessage parseHead(SessionInputBuffer sessioninputbuffer)
        throws IOException, HttpException, ParseException;
}
