// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.utils;

import ch.boye.httpclientandroidlib.HttpHost;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Stack;

// Referenced classes of package ch.boye.httpclientandroidlib.client.utils:
//            URIBuilder

public class URIUtils
{

    private URIUtils()
    {
    }

    public static URI createURI(String s, String s1, int i, String s2, String s3, String s4)
        throws URISyntaxException
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (s1 != null)
        {
            if (s != null)
            {
                stringbuilder.append(s);
                stringbuilder.append("://");
            }
            stringbuilder.append(s1);
            if (i > 0)
            {
                stringbuilder.append(':');
                stringbuilder.append(i);
            }
        }
        if (s2 == null || !s2.startsWith("/"))
        {
            stringbuilder.append('/');
        }
        if (s2 != null)
        {
            stringbuilder.append(s2);
        }
        if (s3 != null)
        {
            stringbuilder.append('?');
            stringbuilder.append(s3);
        }
        if (s4 != null)
        {
            stringbuilder.append('#');
            stringbuilder.append(s4);
        }
        return new URI(stringbuilder.toString());
    }

    public static HttpHost extractHost(URI uri)
    {
        if (uri != null && uri.isAbsolute())
        {
            int j = uri.getPort();
            String s1 = uri.getHost();
            String s = s1;
            int i = j;
            if (s1 == null)
            {
                String s3 = uri.getAuthority();
                s = s3;
                i = j;
                if (s3 != null)
                {
                    i = s3.indexOf('@');
                    String s2 = s3;
                    if (i >= 0)
                    {
                        if (s3.length() > i + 1)
                        {
                            s2 = s3.substring(i + 1);
                        } else
                        {
                            s2 = null;
                        }
                    }
                    s = s2;
                    i = j;
                    if (s2 != null)
                    {
                        int i1 = s2.indexOf(':');
                        s = s2;
                        i = j;
                        if (i1 >= 0)
                        {
                            int l = i1 + 1;
                            int k = 0;
                            for (i = l; i < s2.length() && Character.isDigit(s2.charAt(i)); i++)
                            {
                                k++;
                            }

                            i = j;
                            if (k > 0)
                            {
                                try
                                {
                                    i = Integer.parseInt(s2.substring(l, l + k));
                                }
                                catch (NumberFormatException numberformatexception)
                                {
                                    i = j;
                                }
                            }
                            s = s2.substring(0, i1);
                        }
                    }
                }
            }
            uri = uri.getScheme();
            if (s != null)
            {
                return new HttpHost(s, i, uri);
            }
        }
        return null;
    }

    private static URI removeDotSegments(URI uri)
    {
        Object obj = uri.getPath();
        if (obj == null || ((String) (obj)).indexOf("/.") == -1)
        {
            return uri;
        }
        String as[] = ((String) (obj)).split("/");
        Object obj1 = new Stack();
        int i = 0;
        while (i < as.length) 
        {
            if (as[i].length() != 0 && !".".equals(as[i]))
            {
                if ("..".equals(as[i]))
                {
                    if (!((Stack) (obj1)).isEmpty())
                    {
                        ((Stack) (obj1)).pop();
                    }
                } else
                {
                    ((Stack) (obj1)).push(as[i]);
                }
            }
            i++;
        }
        as = new StringBuilder();
        String s;
        for (obj1 = ((Stack) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); as.append('/').append(s))
        {
            s = (String)((Iterator) (obj1)).next();
        }

        try
        {
            uri = new URI(uri.getScheme(), uri.getAuthority(), as.toString(), uri.getQuery(), uri.getFragment());
        }
        // Misplaced declaration of an exception variable
        catch (URI uri)
        {
            throw new IllegalArgumentException(uri);
        }
        return uri;
    }

    public static URI resolve(URI uri, String s)
    {
        return resolve(uri, URI.create(s));
    }

    public static URI resolve(URI uri, URI uri1)
    {
        if (uri == null)
        {
            throw new IllegalArgumentException("Base URI may nor be null");
        }
        if (uri1 == null)
        {
            throw new IllegalArgumentException("Reference URI may nor be null");
        }
        String s = uri1.toString();
        if (s.startsWith("?"))
        {
            return resolveReferenceStartingWithQueryString(uri, uri1);
        }
        boolean flag;
        if (s.length() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            uri1 = URI.create("#");
        }
        uri1 = uri.resolve(uri1);
        uri = uri1;
        if (flag)
        {
            uri = uri1.toString();
            uri = URI.create(uri.substring(0, uri.indexOf('#')));
        }
        return removeDotSegments(uri);
    }

    private static URI resolveReferenceStartingWithQueryString(URI uri, URI uri1)
    {
        String s = uri.toString();
        uri = s;
        if (s.indexOf('?') > -1)
        {
            uri = s.substring(0, s.indexOf('?'));
        }
        return URI.create((new StringBuilder()).append(uri).append(uri1.toString()).toString());
    }

    public static URI rewriteURI(URI uri)
        throws URISyntaxException
    {
        URI uri1;
label0:
        {
            if (uri == null)
            {
                throw new IllegalArgumentException("URI may not be null");
            }
            if (uri.getFragment() == null)
            {
                uri1 = uri;
                if (uri.getUserInfo() == null)
                {
                    break label0;
                }
            }
            uri1 = (new URIBuilder(uri)).setFragment(null).setUserInfo(null).build();
        }
        return uri1;
    }

    public static URI rewriteURI(URI uri, HttpHost httphost)
        throws URISyntaxException
    {
        return rewriteURI(uri, httphost, false);
    }

    public static URI rewriteURI(URI uri, HttpHost httphost, boolean flag)
        throws URISyntaxException
    {
        if (uri == null)
        {
            throw new IllegalArgumentException("URI may not be null");
        }
        uri = new URIBuilder(uri);
        if (httphost != null)
        {
            uri.setScheme(httphost.getSchemeName());
            uri.setHost(httphost.getHostName());
            uri.setPort(httphost.getPort());
        } else
        {
            uri.setScheme(null);
            uri.setHost(null);
            uri.setPort(-1);
        }
        if (flag)
        {
            uri.setFragment(null);
        }
        return uri.build();
    }
}
