// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.cookie;

import ch.boye.httpclientandroidlib.FormattedHeader;
import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.cookie.Cookie;
import ch.boye.httpclientandroidlib.cookie.CookieOrigin;
import ch.boye.httpclientandroidlib.cookie.MalformedCookieException;
import ch.boye.httpclientandroidlib.message.BufferedHeader;
import ch.boye.httpclientandroidlib.message.ParserCursor;
import ch.boye.httpclientandroidlib.util.CharArrayBuffer;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.cookie:
//            CookieSpecBase, BasicPathHandler, NetscapeDomainHandler, BasicMaxAgeHandler, 
//            BasicSecureHandler, BasicCommentHandler, BasicExpiresHandler, NetscapeDraftHeaderParser

public class NetscapeDraftSpec extends CookieSpecBase
{

    protected static final String EXPIRES_PATTERN = "EEE, dd-MMM-yy HH:mm:ss z";
    private final String datepatterns[];

    public NetscapeDraftSpec()
    {
        this(null);
    }

    public NetscapeDraftSpec(String as[])
    {
        if (as != null)
        {
            datepatterns = (String[])as.clone();
        } else
        {
            datepatterns = (new String[] {
                "EEE, dd-MMM-yy HH:mm:ss z"
            });
        }
        registerAttribHandler("path", new BasicPathHandler());
        registerAttribHandler("domain", new NetscapeDomainHandler());
        registerAttribHandler("max-age", new BasicMaxAgeHandler());
        registerAttribHandler("secure", new BasicSecureHandler());
        registerAttribHandler("comment", new BasicCommentHandler());
        registerAttribHandler("expires", new BasicExpiresHandler(datepatterns));
    }

    public List formatCookies(List list)
    {
        if (list == null)
        {
            throw new IllegalArgumentException("List of cookies may not be null");
        }
        if (list.isEmpty())
        {
            throw new IllegalArgumentException("List of cookies may not be empty");
        }
        CharArrayBuffer chararraybuffer = new CharArrayBuffer(list.size() * 20);
        chararraybuffer.append("Cookie");
        chararraybuffer.append(": ");
        for (int i = 0; i < list.size(); i++)
        {
            Object obj = (Cookie)list.get(i);
            if (i > 0)
            {
                chararraybuffer.append("; ");
            }
            chararraybuffer.append(((Cookie) (obj)).getName());
            obj = ((Cookie) (obj)).getValue();
            if (obj != null)
            {
                chararraybuffer.append("=");
                chararraybuffer.append(((String) (obj)));
            }
        }

        list = new ArrayList(1);
        list.add(new BufferedHeader(chararraybuffer));
        return list;
    }

    public int getVersion()
    {
        return 0;
    }

    public Header getVersionHeader()
    {
        return null;
    }

    public List parse(Header header, CookieOrigin cookieorigin)
        throws MalformedCookieException
    {
        if (header == null)
        {
            throw new IllegalArgumentException("Header may not be null");
        }
        if (cookieorigin == null)
        {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        if (!header.getName().equalsIgnoreCase("Set-Cookie"))
        {
            throw new MalformedCookieException((new StringBuilder()).append("Unrecognized cookie header '").append(header.toString()).append("'").toString());
        }
        NetscapeDraftHeaderParser netscapedraftheaderparser = NetscapeDraftHeaderParser.DEFAULT;
        Object obj;
        if (header instanceof FormattedHeader)
        {
            CharArrayBuffer chararraybuffer = ((FormattedHeader)header).getBuffer();
            obj = new ParserCursor(((FormattedHeader)header).getValuePos(), chararraybuffer.length());
            header = chararraybuffer;
        } else
        {
            obj = header.getValue();
            if (obj == null)
            {
                throw new MalformedCookieException("Header value is null");
            }
            header = new CharArrayBuffer(((String) (obj)).length());
            header.append(((String) (obj)));
            obj = new ParserCursor(0, header.length());
        }
        return parse(new HeaderElement[] {
            netscapedraftheaderparser.parseHeader(header, ((ParserCursor) (obj)))
        }, cookieorigin);
    }

    public String toString()
    {
        return "netscape";
    }
}
