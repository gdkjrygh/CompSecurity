// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.utils;

import ch.boye.httpclientandroidlib.Consts;
import ch.boye.httpclientandroidlib.NameValuePair;
import ch.boye.httpclientandroidlib.conn.util.InetAddressUtils;
import ch.boye.httpclientandroidlib.message.BasicNameValuePair;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package ch.boye.httpclientandroidlib.client.utils:
//            URLEncodedUtils

public class URIBuilder
{

    private String encodedAuthority;
    private String encodedFragment;
    private String encodedPath;
    private String encodedQuery;
    private String encodedSchemeSpecificPart;
    private String encodedUserInfo;
    private String fragment;
    private String host;
    private String path;
    private int port;
    private List queryParams;
    private String scheme;
    private String userInfo;

    public URIBuilder()
    {
        port = -1;
    }

    public URIBuilder(String s)
        throws URISyntaxException
    {
        digestURI(new URI(s));
    }

    public URIBuilder(URI uri)
    {
        digestURI(uri);
    }

    private String buildString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (scheme != null)
        {
            stringbuilder.append(scheme).append(':');
        }
        if (encodedSchemeSpecificPart != null)
        {
            stringbuilder.append(encodedSchemeSpecificPart);
        } else
        {
            if (encodedAuthority != null)
            {
                stringbuilder.append("//").append(encodedAuthority);
            } else
            if (host != null)
            {
                stringbuilder.append("//");
                if (encodedUserInfo != null)
                {
                    stringbuilder.append(encodedUserInfo).append("@");
                } else
                if (userInfo != null)
                {
                    stringbuilder.append(encodeUserInfo(userInfo)).append("@");
                }
                if (InetAddressUtils.isIPv6Address(host))
                {
                    stringbuilder.append("[").append(host).append("]");
                } else
                {
                    stringbuilder.append(host);
                }
                if (port >= 0)
                {
                    stringbuilder.append(":").append(port);
                }
            }
            if (encodedPath != null)
            {
                stringbuilder.append(normalizePath(encodedPath));
            } else
            if (path != null)
            {
                stringbuilder.append(encodePath(normalizePath(path)));
            }
            if (encodedQuery != null)
            {
                stringbuilder.append("?").append(encodedQuery);
            } else
            if (queryParams != null)
            {
                stringbuilder.append("?").append(encodeQuery(queryParams));
            }
        }
        if (encodedFragment != null)
        {
            stringbuilder.append("#").append(encodedFragment);
        } else
        if (fragment != null)
        {
            stringbuilder.append("#").append(encodeFragment(fragment));
        }
        return stringbuilder.toString();
    }

    private void digestURI(URI uri)
    {
        scheme = uri.getScheme();
        encodedSchemeSpecificPart = uri.getRawSchemeSpecificPart();
        encodedAuthority = uri.getRawAuthority();
        host = uri.getHost();
        port = uri.getPort();
        encodedUserInfo = uri.getRawUserInfo();
        userInfo = uri.getUserInfo();
        encodedPath = uri.getRawPath();
        path = uri.getPath();
        encodedQuery = uri.getRawQuery();
        queryParams = parseQuery(uri.getRawQuery(), Consts.UTF_8);
        encodedFragment = uri.getRawFragment();
        fragment = uri.getFragment();
    }

    private String encodeFragment(String s)
    {
        return URLEncodedUtils.encFragment(s, Consts.UTF_8);
    }

    private String encodePath(String s)
    {
        return URLEncodedUtils.encPath(s, Consts.UTF_8);
    }

    private String encodeQuery(List list)
    {
        return URLEncodedUtils.format(list, Consts.UTF_8);
    }

    private String encodeUserInfo(String s)
    {
        return URLEncodedUtils.encUserInfo(s, Consts.UTF_8);
    }

    private static String normalizePath(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
label0:
            {
                for (int i = 0; i < s.length() && s.charAt(i) == '/'; i++)
                {
                    break label0;
                }

                s1 = s;
                if (i > 1)
                {
                    return s.substring(i - 1);
                }
            }
        }
        return s1;
    }

    private List parseQuery(String s, Charset charset)
    {
        if (s != null && s.length() > 0)
        {
            return URLEncodedUtils.parse(s, charset);
        } else
        {
            return null;
        }
    }

    public URIBuilder addParameter(String s, String s1)
    {
        if (queryParams == null)
        {
            queryParams = new ArrayList();
        }
        queryParams.add(new BasicNameValuePair(s, s1));
        encodedQuery = null;
        encodedSchemeSpecificPart = null;
        return this;
    }

    public URI build()
        throws URISyntaxException
    {
        return new URI(buildString());
    }

    public String getFragment()
    {
        return fragment;
    }

    public String getHost()
    {
        return host;
    }

    public String getPath()
    {
        return path;
    }

    public int getPort()
    {
        return port;
    }

    public List getQueryParams()
    {
        if (queryParams != null)
        {
            return new ArrayList(queryParams);
        } else
        {
            return new ArrayList();
        }
    }

    public String getScheme()
    {
        return scheme;
    }

    public String getUserInfo()
    {
        return userInfo;
    }

    public URIBuilder removeQuery()
    {
        queryParams = null;
        encodedQuery = null;
        encodedSchemeSpecificPart = null;
        return this;
    }

    public URIBuilder setFragment(String s)
    {
        fragment = s;
        encodedFragment = null;
        return this;
    }

    public URIBuilder setHost(String s)
    {
        host = s;
        encodedSchemeSpecificPart = null;
        encodedAuthority = null;
        return this;
    }

    public URIBuilder setParameter(String s, String s1)
    {
        if (queryParams == null)
        {
            queryParams = new ArrayList();
        }
        if (!queryParams.isEmpty())
        {
            Iterator iterator = queryParams.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((NameValuePair)iterator.next()).getName().equals(s))
                {
                    iterator.remove();
                }
            } while (true);
        }
        queryParams.add(new BasicNameValuePair(s, s1));
        encodedQuery = null;
        encodedSchemeSpecificPart = null;
        return this;
    }

    public URIBuilder setPath(String s)
    {
        path = s;
        encodedSchemeSpecificPart = null;
        encodedPath = null;
        return this;
    }

    public URIBuilder setPort(int i)
    {
        int j = i;
        if (i < 0)
        {
            j = -1;
        }
        port = j;
        encodedSchemeSpecificPart = null;
        encodedAuthority = null;
        return this;
    }

    public URIBuilder setQuery(String s)
    {
        queryParams = parseQuery(s, Consts.UTF_8);
        encodedQuery = null;
        encodedSchemeSpecificPart = null;
        return this;
    }

    public URIBuilder setScheme(String s)
    {
        scheme = s;
        return this;
    }

    public URIBuilder setUserInfo(String s)
    {
        userInfo = s;
        encodedSchemeSpecificPart = null;
        encodedAuthority = null;
        encodedUserInfo = null;
        return this;
    }

    public URIBuilder setUserInfo(String s, String s1)
    {
        return setUserInfo((new StringBuilder()).append(s).append(':').append(s1).toString());
    }

    public String toString()
    {
        return buildString();
    }
}
