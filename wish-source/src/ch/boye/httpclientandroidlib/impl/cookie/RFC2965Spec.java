// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.cookie;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.NameValuePair;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import ch.boye.httpclientandroidlib.cookie.Cookie;
import ch.boye.httpclientandroidlib.cookie.CookieAttributeHandler;
import ch.boye.httpclientandroidlib.cookie.CookieOrigin;
import ch.boye.httpclientandroidlib.cookie.MalformedCookieException;
import ch.boye.httpclientandroidlib.message.BufferedHeader;
import ch.boye.httpclientandroidlib.util.CharArrayBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.cookie:
//            RFC2109Spec, RFC2965DomainAttributeHandler, RFC2965PortAttributeHandler, RFC2965CommentUrlAttributeHandler, 
//            RFC2965DiscardAttributeHandler, RFC2965VersionAttributeHandler, BasicClientCookie2

public class RFC2965Spec extends RFC2109Spec
{

    public RFC2965Spec()
    {
        this(null, false);
    }

    public RFC2965Spec(String as[], boolean flag)
    {
        super(as, flag);
        registerAttribHandler("domain", new RFC2965DomainAttributeHandler());
        registerAttribHandler("port", new RFC2965PortAttributeHandler());
        registerAttribHandler("commenturl", new RFC2965CommentUrlAttributeHandler());
        registerAttribHandler("discard", new RFC2965DiscardAttributeHandler());
        registerAttribHandler("version", new RFC2965VersionAttributeHandler());
    }

    private static CookieOrigin adjustEffectiveHost(CookieOrigin cookieorigin)
    {
        String s = cookieorigin.getHost();
        boolean flag = true;
        int i = 0;
        do
        {
label0:
            {
                char c = flag;
                if (i < s.length())
                {
                    c = s.charAt(i);
                    if (c != '.' && c != ':')
                    {
                        break label0;
                    }
                    c = '\0';
                }
                CookieOrigin cookieorigin1 = cookieorigin;
                if (c != 0)
                {
                    cookieorigin1 = new CookieOrigin((new StringBuilder()).append(s).append(".local").toString(), cookieorigin.getPort(), cookieorigin.getPath(), cookieorigin.isSecure());
                }
                return cookieorigin1;
            }
            i++;
        } while (true);
    }

    private List createCookies(HeaderElement aheaderelement[], CookieOrigin cookieorigin)
        throws MalformedCookieException
    {
        ArrayList arraylist = new ArrayList(aheaderelement.length);
        int k = aheaderelement.length;
        for (int i = 0; i < k; i++)
        {
            Object obj1 = aheaderelement[i];
            Object obj = ((HeaderElement) (obj1)).getName();
            Object obj2 = ((HeaderElement) (obj1)).getValue();
            if (obj == null || ((String) (obj)).length() == 0)
            {
                throw new MalformedCookieException("Cookie name may not be empty");
            }
            obj = new BasicClientCookie2(((String) (obj)), ((String) (obj2)));
            ((BasicClientCookie2) (obj)).setPath(getDefaultPath(cookieorigin));
            ((BasicClientCookie2) (obj)).setDomain(getDefaultDomain(cookieorigin));
            ((BasicClientCookie2) (obj)).setPorts(new int[] {
                cookieorigin.getPort()
            });
            NameValuePair anamevaluepair[] = ((HeaderElement) (obj1)).getParameters();
            obj2 = new HashMap(anamevaluepair.length);
            for (int j = anamevaluepair.length - 1; j >= 0; j--)
            {
                NameValuePair namevaluepair1 = anamevaluepair[j];
                ((Map) (obj2)).put(namevaluepair1.getName().toLowerCase(Locale.ENGLISH), namevaluepair1);
            }

            anamevaluepair = ((Map) (obj2)).entrySet().iterator();
            do
            {
                if (!anamevaluepair.hasNext())
                {
                    break;
                }
                NameValuePair namevaluepair = (NameValuePair)((java.util.Map.Entry)anamevaluepair.next()).getValue();
                Object obj3 = namevaluepair.getName().toLowerCase(Locale.ENGLISH);
                ((BasicClientCookie2) (obj)).setAttribute(((String) (obj3)), namevaluepair.getValue());
                obj3 = findAttribHandler(((String) (obj3)));
                if (obj3 != null)
                {
                    ((CookieAttributeHandler) (obj3)).parse(((ch.boye.httpclientandroidlib.cookie.SetCookie) (obj)), namevaluepair.getValue());
                }
            } while (true);
            arraylist.add(obj);
        }

        return arraylist;
    }

    protected void formatCookieAsVer(CharArrayBuffer chararraybuffer, Cookie cookie, int i)
    {
        super.formatCookieAsVer(chararraybuffer, cookie, i);
        if (cookie instanceof ClientCookie)
        {
            String s = ((ClientCookie)cookie).getAttribute("port");
            if (s != null)
            {
                chararraybuffer.append("; $Port");
                chararraybuffer.append("=\"");
                if (s.trim().length() > 0)
                {
                    cookie = cookie.getPorts();
                    if (cookie != null)
                    {
                        i = 0;
                        for (int j = cookie.length; i < j; i++)
                        {
                            if (i > 0)
                            {
                                chararraybuffer.append(",");
                            }
                            chararraybuffer.append(Integer.toString(cookie[i]));
                        }

                    }
                }
                chararraybuffer.append("\"");
            }
        }
    }

    public int getVersion()
    {
        return 1;
    }

    public Header getVersionHeader()
    {
        CharArrayBuffer chararraybuffer = new CharArrayBuffer(40);
        chararraybuffer.append("Cookie2");
        chararraybuffer.append(": ");
        chararraybuffer.append("$Version=");
        chararraybuffer.append(Integer.toString(getVersion()));
        return new BufferedHeader(chararraybuffer);
    }

    public boolean match(Cookie cookie, CookieOrigin cookieorigin)
    {
        if (cookie == null)
        {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (cookieorigin == null)
        {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else
        {
            return super.match(cookie, adjustEffectiveHost(cookieorigin));
        }
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
        if (!header.getName().equalsIgnoreCase("Set-Cookie2"))
        {
            throw new MalformedCookieException((new StringBuilder()).append("Unrecognized cookie header '").append(header.toString()).append("'").toString());
        } else
        {
            cookieorigin = adjustEffectiveHost(cookieorigin);
            return createCookies(header.getElements(), cookieorigin);
        }
    }

    protected List parse(HeaderElement aheaderelement[], CookieOrigin cookieorigin)
        throws MalformedCookieException
    {
        return createCookies(aheaderelement, adjustEffectiveHost(cookieorigin));
    }

    public String toString()
    {
        return "rfc2965";
    }

    public void validate(Cookie cookie, CookieOrigin cookieorigin)
        throws MalformedCookieException
    {
        if (cookie == null)
        {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (cookieorigin == null)
        {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else
        {
            super.validate(cookie, adjustEffectiveHost(cookieorigin));
            return;
        }
    }
}
