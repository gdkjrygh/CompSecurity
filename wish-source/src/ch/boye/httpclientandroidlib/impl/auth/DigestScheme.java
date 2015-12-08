// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.auth;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpEntity;
import ch.boye.httpclientandroidlib.HttpEntityEnclosingRequest;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.RequestLine;
import ch.boye.httpclientandroidlib.auth.AuthenticationException;
import ch.boye.httpclientandroidlib.auth.ChallengeState;
import ch.boye.httpclientandroidlib.auth.Credentials;
import ch.boye.httpclientandroidlib.auth.MalformedChallengeException;
import ch.boye.httpclientandroidlib.auth.params.AuthParams;
import ch.boye.httpclientandroidlib.message.BasicHeaderValueFormatter;
import ch.boye.httpclientandroidlib.message.BasicNameValuePair;
import ch.boye.httpclientandroidlib.message.BufferedHeader;
import ch.boye.httpclientandroidlib.protocol.BasicHttpContext;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import ch.boye.httpclientandroidlib.util.CharArrayBuffer;
import ch.boye.httpclientandroidlib.util.EncodingUtils;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.Principal;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.auth:
//            RFC2617Scheme, UnsupportedDigestAlgorithmException, HttpEntityDigester

public class DigestScheme extends RFC2617Scheme
{

    private static final char HEXADECIMAL[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    private static final int QOP_AUTH = 2;
    private static final int QOP_AUTH_INT = 1;
    private static final int QOP_MISSING = 0;
    private static final int QOP_UNKNOWN = -1;
    private String a1;
    private String a2;
    private String cnonce;
    private boolean complete;
    private String lastNonce;
    private long nounceCount;

    public DigestScheme()
    {
        this(null);
    }

    public DigestScheme(ChallengeState challengestate)
    {
        super(challengestate);
        complete = false;
    }

    public static String createCnonce()
    {
        SecureRandom securerandom = new SecureRandom();
        byte abyte0[] = new byte[8];
        securerandom.nextBytes(abyte0);
        return encode(abyte0);
    }

    private Header createDigestHeader(Credentials credentials, HttpRequest httprequest)
        throws AuthenticationException
    {
        String s;
        Object obj1;
        String s3;
        String s4;
        String s5;
        String s6;
        String s7;
        HashSet hashset;
        int i;
        s4 = getParameter("uri");
        s5 = getParameter("realm");
        s6 = getParameter("nonce");
        s3 = getParameter("opaque");
        s7 = getParameter("methodname");
        obj1 = getParameter("algorithm");
        hashset = new HashSet(8);
        i = -1;
        s = getParameter("qop");
        if (s == null) goto _L2; else goto _L1
_L1:
        for (StringTokenizer stringtokenizer = new StringTokenizer(s, ","); stringtokenizer.hasMoreTokens(); hashset.add(stringtokenizer.nextToken().trim().toLowerCase(Locale.US))) { }
        if (!(httprequest instanceof HttpEntityEnclosingRequest) || !hashset.contains("auth-int")) goto _L4; else goto _L3
_L3:
        i = 1;
_L6:
        if (i == -1)
        {
            throw new AuthenticationException((new StringBuilder()).append("None of the qop methods is supported: ").append(s).toString());
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (hashset.contains("auth"))
        {
            i = 2;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        i = 0;
        if (true) goto _L6; else goto _L5
_L5:
        String s1;
        StringBuilder stringbuilder1;
        String s8;
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = "MD5";
        }
        s1 = getParameter("charset");
        obj1 = s1;
        if (s1 == null)
        {
            obj1 = "ISO-8859-1";
        }
        String s2 = ((String) (obj));
        s1 = s2;
        if (s2.equalsIgnoreCase("MD5-sess"))
        {
            s1 = "MD5";
        }
        MessageDigest messagedigest;
        try
        {
            messagedigest = createMessageDigest(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Credentials credentials)
        {
            throw new AuthenticationException((new StringBuilder()).append("Unsuppported digest algorithm: ").append(s1).toString());
        }
        s2 = credentials.getUserPrincipal().getName();
        credentials = credentials.getPassword();
        if (s6.equals(lastNonce))
        {
            nounceCount = nounceCount + 1L;
        } else
        {
            nounceCount = 1L;
            cnonce = null;
            lastNonce = s6;
        }
        stringbuilder1 = new StringBuilder(256);
        (new Formatter(stringbuilder1, Locale.US)).format("%08x", new Object[] {
            Long.valueOf(nounceCount)
        });
        s1 = stringbuilder1.toString();
        if (cnonce == null)
        {
            cnonce = createCnonce();
        }
        a1 = null;
        a2 = null;
        if (((String) (obj)).equalsIgnoreCase("MD5-sess"))
        {
            stringbuilder1.setLength(0);
            stringbuilder1.append(s2).append(':').append(s5).append(':').append(credentials);
            credentials = encode(messagedigest.digest(EncodingUtils.getBytes(stringbuilder1.toString(), ((String) (obj1)))));
            stringbuilder1.setLength(0);
            stringbuilder1.append(credentials).append(':').append(s6).append(':').append(cnonce);
            a1 = stringbuilder1.toString();
        } else
        {
            stringbuilder1.setLength(0);
            stringbuilder1.append(s2).append(':').append(s5).append(':').append(credentials);
            a1 = stringbuilder1.toString();
        }
        s8 = encode(messagedigest.digest(EncodingUtils.getBytes(a1, ((String) (obj1)))));
        if (i == 2)
        {
            a2 = (new StringBuilder()).append(s7).append(':').append(s4).toString();
            break MISSING_BLOCK_LABEL_533;
        }
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_1239;
        }
        credentials = null;
        if (httprequest instanceof HttpEntityEnclosingRequest)
        {
            credentials = ((HttpEntityEnclosingRequest)httprequest).getEntity();
        }
        if (credentials != null && !credentials.isRepeatable())
        {
            if (hashset.contains("auth"))
            {
                i = 2;
                a2 = (new StringBuilder()).append(s7).append(':').append(s4).toString();
            } else
            {
                throw new AuthenticationException("Qop auth-int cannot be used with a non-repeatable entity");
            }
            continue;
        }
        httprequest = new HttpEntityDigester(messagedigest);
        if (credentials == null)
        {
            break MISSING_BLOCK_LABEL_1175;
        }
        credentials.writeTo(httprequest);
        httprequest.close();
        a2 = (new StringBuilder()).append(s7).append(':').append(s4).append(':').append(encode(httprequest.getDigest())).toString();
        continue;
        credentials;
        throw new AuthenticationException("I/O error reading entity content", credentials);
        a2 = (new StringBuilder()).append(s7).append(':').append(s4).toString();
        continue;
        do
        {
            httprequest = encode(messagedigest.digest(EncodingUtils.getBytes(a2, ((String) (obj1)))));
            if (i == 0)
            {
                stringbuilder1.setLength(0);
                stringbuilder1.append(s8).append(':').append(s6).append(':').append(httprequest);
                credentials = stringbuilder1.toString();
            } else
            {
                stringbuilder1.setLength(0);
                StringBuilder stringbuilder = stringbuilder1.append(s8).append(':').append(s6).append(':').append(s1).append(':').append(cnonce).append(':');
                if (i == 1)
                {
                    credentials = "auth-int";
                } else
                {
                    credentials = "auth";
                }
                stringbuilder.append(credentials).append(':').append(httprequest);
                credentials = stringbuilder1.toString();
            }
            credentials = encode(messagedigest.digest(EncodingUtils.getAsciiBytes(credentials)));
            httprequest = new CharArrayBuffer(128);
            if (isProxy())
            {
                httprequest.append("Proxy-Authorization");
            } else
            {
                httprequest.append("Authorization");
            }
            httprequest.append(": Digest ");
            obj1 = new ArrayList(20);
            ((List) (obj1)).add(new BasicNameValuePair("username", s2));
            ((List) (obj1)).add(new BasicNameValuePair("realm", s5));
            ((List) (obj1)).add(new BasicNameValuePair("nonce", s6));
            ((List) (obj1)).add(new BasicNameValuePair("uri", s4));
            ((List) (obj1)).add(new BasicNameValuePair("response", credentials));
            if (i != 0)
            {
                if (i == 1)
                {
                    credentials = "auth-int";
                } else
                {
                    credentials = "auth";
                }
                ((List) (obj1)).add(new BasicNameValuePair("qop", credentials));
                ((List) (obj1)).add(new BasicNameValuePair("nc", s1));
                ((List) (obj1)).add(new BasicNameValuePair("cnonce", cnonce));
            }
            if (obj != null)
            {
                ((List) (obj1)).add(new BasicNameValuePair("algorithm", ((String) (obj))));
            }
            if (s3 != null)
            {
                ((List) (obj1)).add(new BasicNameValuePair("opaque", s3));
            }
            i = 0;
            while (i < ((List) (obj1)).size()) 
            {
                credentials = (BasicNameValuePair)((List) (obj1)).get(i);
                if (i > 0)
                {
                    httprequest.append(", ");
                }
                boolean flag;
                boolean flag1;
                if ("nc".equals(credentials.getName()) || "qop".equals(credentials.getName()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj = BasicHeaderValueFormatter.DEFAULT;
                if (!flag)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                ((BasicHeaderValueFormatter) (obj)).formatNameValuePair(httprequest, credentials, flag1);
                i++;
            }
            return new BufferedHeader(httprequest);
        } while (true);
    }

    private static MessageDigest createMessageDigest(String s)
        throws UnsupportedDigestAlgorithmException
    {
        MessageDigest messagedigest;
        try
        {
            messagedigest = MessageDigest.getInstance(s);
        }
        catch (Exception exception)
        {
            throw new UnsupportedDigestAlgorithmException((new StringBuilder()).append("Unsupported algorithm in HTTP Digest authentication: ").append(s).toString());
        }
        return messagedigest;
    }

    static String encode(byte abyte0[])
    {
        int j = abyte0.length;
        char ac[] = new char[j * 2];
        for (int i = 0; i < j; i++)
        {
            byte byte0 = abyte0[i];
            byte byte1 = abyte0[i];
            ac[i * 2] = HEXADECIMAL[(byte1 & 0xf0) >> 4];
            ac[i * 2 + 1] = HEXADECIMAL[byte0 & 0xf];
        }

        return new String(ac);
    }

    public Header authenticate(Credentials credentials, HttpRequest httprequest)
        throws AuthenticationException
    {
        return authenticate(credentials, httprequest, ((HttpContext) (new BasicHttpContext())));
    }

    public Header authenticate(Credentials credentials, HttpRequest httprequest, HttpContext httpcontext)
        throws AuthenticationException
    {
        if (credentials == null)
        {
            throw new IllegalArgumentException("Credentials may not be null");
        }
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (getParameter("realm") == null)
        {
            throw new AuthenticationException("missing realm in challenge");
        }
        if (getParameter("nonce") == null)
        {
            throw new AuthenticationException("missing nonce in challenge");
        }
        getParameters().put("methodname", httprequest.getRequestLine().getMethod());
        getParameters().put("uri", httprequest.getRequestLine().getUri());
        if (getParameter("charset") == null)
        {
            httpcontext = AuthParams.getCredentialCharset(httprequest.getParams());
            getParameters().put("charset", httpcontext);
        }
        return createDigestHeader(credentials, httprequest);
    }

    String getA1()
    {
        return a1;
    }

    String getA2()
    {
        return a2;
    }

    String getCnonce()
    {
        return cnonce;
    }

    public String getSchemeName()
    {
        return "digest";
    }

    public boolean isComplete()
    {
        if ("true".equalsIgnoreCase(getParameter("stale")))
        {
            return false;
        } else
        {
            return complete;
        }
    }

    public boolean isConnectionBased()
    {
        return false;
    }

    public void overrideParamter(String s, String s1)
    {
        getParameters().put(s, s1);
    }

    public void processChallenge(Header header)
        throws MalformedChallengeException
    {
        super.processChallenge(header);
        complete = true;
    }

}
