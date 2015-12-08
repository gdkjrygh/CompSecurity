// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.entity;

import ch.boye.httpclientandroidlib.Consts;
import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.HttpEntity;
import ch.boye.httpclientandroidlib.NameValuePair;
import ch.boye.httpclientandroidlib.ParseException;
import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Locale;

public final class ContentType
{

    public static final ContentType APPLICATION_ATOM_XML;
    public static final ContentType APPLICATION_FORM_URLENCODED;
    public static final ContentType APPLICATION_JSON;
    public static final ContentType APPLICATION_OCTET_STREAM;
    public static final ContentType APPLICATION_SVG_XML;
    public static final ContentType APPLICATION_XHTML_XML;
    public static final ContentType APPLICATION_XML;
    public static final ContentType DEFAULT_BINARY;
    public static final ContentType DEFAULT_TEXT;
    public static final ContentType MULTIPART_FORM_DATA;
    public static final ContentType TEXT_HTML;
    public static final ContentType TEXT_PLAIN;
    public static final ContentType TEXT_XML;
    public static final ContentType WILDCARD = create("*/*", (Charset)null);
    private final Charset charset;
    private final String mimeType;

    ContentType(String s, Charset charset1)
    {
        mimeType = s;
        charset = charset1;
    }

    private static ContentType create(HeaderElement headerelement)
    {
        String s = headerelement.getName();
        Object obj = null;
        NameValuePair namevaluepair = headerelement.getParameterByName("charset");
        headerelement = obj;
        if (namevaluepair != null)
        {
            headerelement = namevaluepair.getValue();
        }
        return create(s, ((String) (headerelement)));
    }

    public static ContentType create(String s)
    {
        return new ContentType(s, (Charset)null);
    }

    public static ContentType create(String s, String s1)
        throws UnsupportedCharsetException
    {
        if (s1 != null)
        {
            s1 = Charset.forName(s1);
        } else
        {
            s1 = null;
        }
        return create(s, ((Charset) (s1)));
    }

    public static ContentType create(String s, Charset charset1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("MIME type may not be null");
        }
        s = s.trim().toLowerCase(Locale.US);
        if (s.length() == 0)
        {
            throw new IllegalArgumentException("MIME type may not be empty");
        }
        if (!valid(s))
        {
            throw new IllegalArgumentException("MIME type may not contain reserved characters");
        } else
        {
            return new ContentType(s, charset1);
        }
    }

    public static ContentType get(HttpEntity httpentity)
        throws ParseException, UnsupportedCharsetException
    {
        if (httpentity != null)
        {
            if ((httpentity = httpentity.getContentType()) != null && (httpentity = httpentity.getElements()).length > 0)
            {
                return create(httpentity[0]);
            }
        }
        return null;
    }

    public static ContentType getOrDefault(HttpEntity httpentity)
        throws ParseException
    {
        httpentity = get(httpentity);
        if (httpentity != null)
        {
            return httpentity;
        } else
        {
            return DEFAULT_TEXT;
        }
    }

    public static ContentType parse(String s)
        throws ParseException, UnsupportedCharsetException
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Content type may not be null");
        }
        HeaderElement aheaderelement[] = BasicHeaderValueParser.parseElements(s, null);
        if (aheaderelement.length > 0)
        {
            return create(aheaderelement[0]);
        } else
        {
            throw new ParseException((new StringBuilder()).append("Invalid content type: ").append(s).toString());
        }
    }

    private static boolean valid(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (c == '"' || c == ',' || c == ';')
            {
                return false;
            }
        }

        return true;
    }

    public Charset getCharset()
    {
        return charset;
    }

    public String getMimeType()
    {
        return mimeType;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(mimeType);
        if (charset != null)
        {
            stringbuilder.append("; charset=");
            stringbuilder.append(charset.name());
        }
        return stringbuilder.toString();
    }

    static 
    {
        APPLICATION_ATOM_XML = create("application/atom+xml", Consts.ISO_8859_1);
        APPLICATION_FORM_URLENCODED = create("application/x-www-form-urlencoded", Consts.ISO_8859_1);
        APPLICATION_JSON = create("application/json", Consts.UTF_8);
        APPLICATION_OCTET_STREAM = create("application/octet-stream", (Charset)null);
        APPLICATION_SVG_XML = create("application/svg+xml", Consts.ISO_8859_1);
        APPLICATION_XHTML_XML = create("application/xhtml+xml", Consts.ISO_8859_1);
        APPLICATION_XML = create("application/xml", Consts.ISO_8859_1);
        MULTIPART_FORM_DATA = create("multipart/form-data", Consts.ISO_8859_1);
        TEXT_HTML = create("text/html", Consts.ISO_8859_1);
        TEXT_PLAIN = create("text/plain", Consts.ISO_8859_1);
        TEXT_XML = create("text/xml", Consts.ISO_8859_1);
        DEFAULT_TEXT = TEXT_PLAIN;
        DEFAULT_BINARY = APPLICATION_OCTET_STREAM;
    }
}
