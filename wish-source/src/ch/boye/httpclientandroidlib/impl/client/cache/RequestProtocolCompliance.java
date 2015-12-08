// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.HttpEntity;
import ch.boye.httpclientandroidlib.HttpEntityEnclosingRequest;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.HttpVersion;
import ch.boye.httpclientandroidlib.ProtocolException;
import ch.boye.httpclientandroidlib.ProtocolVersion;
import ch.boye.httpclientandroidlib.RequestLine;
import ch.boye.httpclientandroidlib.client.ClientProtocolException;
import ch.boye.httpclientandroidlib.entity.AbstractHttpEntity;
import ch.boye.httpclientandroidlib.entity.ContentType;
import ch.boye.httpclientandroidlib.impl.client.RequestWrapper;
import ch.boye.httpclientandroidlib.message.BasicHeader;
import ch.boye.httpclientandroidlib.message.BasicHttpResponse;
import ch.boye.httpclientandroidlib.message.BasicStatusLine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client.cache:
//            RequestProtocolError

class RequestProtocolCompliance
{

    private static final List disallowedWithNoCache = Arrays.asList(new String[] {
        "min-fresh", "max-stale", "max-age"
    });

    RequestProtocolCompliance()
    {
    }

    private void add100ContinueHeaderIfMissing(HttpRequest httprequest)
    {
        boolean flag = false;
        Header aheader[] = httprequest.getHeaders("Expect");
        int k = aheader.length;
        for (int i = 0; i < k; i++)
        {
            HeaderElement aheaderelement[] = aheader[i].getElements();
            int l = aheaderelement.length;
            for (int j = 0; j < l; j++)
            {
                if ("100-continue".equalsIgnoreCase(aheaderelement[j].getName()))
                {
                    flag = true;
                }
            }

        }

        if (!flag)
        {
            httprequest.addHeader("Expect", "100-continue");
        }
    }

    private void addContentTypeHeaderIfMissing(HttpEntityEnclosingRequest httpentityenclosingrequest)
    {
        if (httpentityenclosingrequest.getEntity().getContentType() == null)
        {
            ((AbstractHttpEntity)httpentityenclosingrequest.getEntity()).setContentType(ContentType.APPLICATION_OCTET_STREAM.getMimeType());
        }
    }

    private String buildHeaderFromElements(List list)
    {
        StringBuilder stringbuilder = new StringBuilder("");
        boolean flag = true;
        list = list.iterator();
        while (list.hasNext()) 
        {
            HeaderElement headerelement = (HeaderElement)list.next();
            if (!flag)
            {
                stringbuilder.append(",");
            } else
            {
                flag = false;
            }
            stringbuilder.append(headerelement.toString());
        }
        return stringbuilder.toString();
    }

    private void decrementOPTIONSMaxForwardsIfGreaterThen0(HttpRequest httprequest)
    {
        Header header;
        if ("OPTIONS".equals(httprequest.getRequestLine().getMethod()))
        {
            if ((header = httprequest.getFirstHeader("Max-Forwards")) != null)
            {
                httprequest.removeHeaders("Max-Forwards");
                httprequest.setHeader("Max-Forwards", Integer.toString(Integer.parseInt(header.getValue()) - 1));
                return;
            }
        }
    }

    private HttpRequest downgradeRequestTo(HttpRequest httprequest, ProtocolVersion protocolversion)
        throws ClientProtocolException
    {
        try
        {
            httprequest = new RequestWrapper(httprequest);
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequest httprequest)
        {
            throw new ClientProtocolException(httprequest);
        }
        httprequest.setProtocolVersion(protocolversion);
        return httprequest;
    }

    private void remove100ContinueHeaderIfExists(HttpRequest httprequest)
    {
        boolean flag = false;
        Header aheader[] = httprequest.getHeaders("Expect");
        Object obj = new ArrayList();
        int k = aheader.length;
        int i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            Header header = aheader[i];
            HeaderElement aheaderelement[] = header.getElements();
            int l = aheaderelement.length;
            int j = 0;
            while (j < l) 
            {
                HeaderElement headerelement = aheaderelement[j];
                if (!"100-continue".equalsIgnoreCase(headerelement.getName()))
                {
                    ((List) (obj)).add(headerelement);
                } else
                {
                    flag = true;
                }
                j++;
            }
            if (flag)
            {
                httprequest.removeHeader(header);
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); httprequest.addHeader(new BasicHeader("Expect", ((HeaderElement)((Iterator) (obj)).next()).getName()))) { }
                break;
            }
            obj = new ArrayList();
            i++;
        } while (true);
    }

    private RequestProtocolError requestContainsNoCacheDirectiveWithFieldName(HttpRequest httprequest)
    {
        httprequest = httprequest.getHeaders("Cache-Control");
        int k = httprequest.length;
        for (int i = 0; i < k; i++)
        {
            HeaderElement aheaderelement[] = httprequest[i].getElements();
            int l = aheaderelement.length;
            for (int j = 0; j < l; j++)
            {
                HeaderElement headerelement = aheaderelement[j];
                if ("no-cache".equalsIgnoreCase(headerelement.getName()) && headerelement.getValue() != null)
                {
                    return RequestProtocolError.NO_CACHE_DIRECTIVE_WITH_FIELD_NAME;
                }
            }

        }

        return null;
    }

    private RequestProtocolError requestHasWeakETagAndRange(HttpRequest httprequest)
    {
        if ("GET".equals(httprequest.getRequestLine().getMethod()) && httprequest.getFirstHeader("Range") != null)
        {
            httprequest = httprequest.getFirstHeader("If-Range");
            if (httprequest != null && httprequest.getValue().startsWith("W/"))
            {
                return RequestProtocolError.WEAK_ETAG_AND_RANGE_ERROR;
            }
        }
        return null;
    }

    private RequestProtocolError requestHasWeekETagForPUTOrDELETEIfMatch(HttpRequest httprequest)
    {
        String s = httprequest.getRequestLine().getMethod();
        if ("PUT".equals(s) || "DELETE".equals(s)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Header header = httprequest.getFirstHeader("If-Match");
        if (header == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (header.getValue().startsWith("W/"))
        {
            return RequestProtocolError.WEAK_ETAG_ON_PUTDELETE_METHOD_ERROR;
        }
        if (true) goto _L1; else goto _L3
_L3:
        httprequest = httprequest.getFirstHeader("If-None-Match");
        if (httprequest != null && httprequest.getValue().startsWith("W/"))
        {
            return RequestProtocolError.WEAK_ETAG_ON_PUTDELETE_METHOD_ERROR;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private boolean requestMustNotHaveEntity(HttpRequest httprequest)
    {
        return "TRACE".equals(httprequest.getRequestLine().getMethod()) && (httprequest instanceof HttpEntityEnclosingRequest);
    }

    private void stripOtherFreshnessDirectivesWithNoCache(HttpRequest httprequest)
    {
        ArrayList arraylist = new ArrayList();
        boolean flag = false;
        Header aheader[] = httprequest.getHeaders("Cache-Control");
        int k = aheader.length;
        for (int i = 0; i < k; i++)
        {
            HeaderElement aheaderelement[] = aheader[i].getElements();
            int l = aheaderelement.length;
            for (int j = 0; j < l; j++)
            {
                HeaderElement headerelement = aheaderelement[j];
                if (!disallowedWithNoCache.contains(headerelement.getName()))
                {
                    arraylist.add(headerelement);
                }
                if ("no-cache".equals(headerelement.getName()))
                {
                    flag = true;
                }
            }

        }

        if (!flag)
        {
            return;
        } else
        {
            httprequest.removeHeaders("Cache-Control");
            httprequest.setHeader("Cache-Control", buildHeaderFromElements(arraylist));
            return;
        }
    }

    private HttpRequest upgradeRequestTo(HttpRequest httprequest, ProtocolVersion protocolversion)
        throws ClientProtocolException
    {
        try
        {
            httprequest = new RequestWrapper(httprequest);
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequest httprequest)
        {
            throw new ClientProtocolException(httprequest);
        }
        httprequest.setProtocolVersion(protocolversion);
        return httprequest;
    }

    private void verifyOPTIONSRequestWithBodyHasContentType(HttpRequest httprequest)
    {
        while (!"OPTIONS".equals(httprequest.getRequestLine().getMethod()) || !(httprequest instanceof HttpEntityEnclosingRequest)) 
        {
            return;
        }
        addContentTypeHeaderIfMissing((HttpEntityEnclosingRequest)httprequest);
    }

    private void verifyRequestWithExpectContinueFlagHas100continueHeader(HttpRequest httprequest)
    {
        if (httprequest instanceof HttpEntityEnclosingRequest)
        {
            if (((HttpEntityEnclosingRequest)httprequest).expectContinue() && ((HttpEntityEnclosingRequest)httprequest).getEntity() != null)
            {
                add100ContinueHeaderIfMissing(httprequest);
                return;
            } else
            {
                remove100ContinueHeaderIfExists(httprequest);
                return;
            }
        } else
        {
            remove100ContinueHeaderIfExists(httprequest);
            return;
        }
    }

    public HttpResponse getErrorForRequest(RequestProtocolError requestprotocolerror)
    {
        static class _cls1
        {

            static final int $SwitchMap$ch$boye$httpclientandroidlib$impl$client$cache$RequestProtocolError[];

            static 
            {
                $SwitchMap$ch$boye$httpclientandroidlib$impl$client$cache$RequestProtocolError = new int[RequestProtocolError.values().length];
                try
                {
                    $SwitchMap$ch$boye$httpclientandroidlib$impl$client$cache$RequestProtocolError[RequestProtocolError.BODY_BUT_NO_LENGTH_ERROR.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$ch$boye$httpclientandroidlib$impl$client$cache$RequestProtocolError[RequestProtocolError.WEAK_ETAG_AND_RANGE_ERROR.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$ch$boye$httpclientandroidlib$impl$client$cache$RequestProtocolError[RequestProtocolError.WEAK_ETAG_ON_PUTDELETE_METHOD_ERROR.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$ch$boye$httpclientandroidlib$impl$client$cache$RequestProtocolError[RequestProtocolError.NO_CACHE_DIRECTIVE_WITH_FIELD_NAME.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.ch.boye.httpclientandroidlib.impl.client.cache.RequestProtocolError[requestprotocolerror.ordinal()])
        {
        default:
            throw new IllegalStateException("The request was compliant, therefore no error can be generated for it.");

        case 1: // '\001'
            return new BasicHttpResponse(new BasicStatusLine(HttpVersion.HTTP_1_1, 411, ""));

        case 2: // '\002'
            return new BasicHttpResponse(new BasicStatusLine(HttpVersion.HTTP_1_1, 400, "Weak eTag not compatible with byte range"));

        case 3: // '\003'
            return new BasicHttpResponse(new BasicStatusLine(HttpVersion.HTTP_1_1, 400, "Weak eTag not compatible with PUT or DELETE requests"));

        case 4: // '\004'
            return new BasicHttpResponse(new BasicStatusLine(HttpVersion.HTTP_1_1, 400, "No-Cache directive MUST NOT include a field name"));
        }
    }

    public HttpRequest makeRequestCompliant(HttpRequest httprequest)
        throws ClientProtocolException
    {
        if (requestMustNotHaveEntity(httprequest))
        {
            ((HttpEntityEnclosingRequest)httprequest).setEntity(null);
        }
        verifyRequestWithExpectContinueFlagHas100continueHeader(httprequest);
        verifyOPTIONSRequestWithBodyHasContentType(httprequest);
        decrementOPTIONSMaxForwardsIfGreaterThen0(httprequest);
        stripOtherFreshnessDirectivesWithNoCache(httprequest);
        HttpRequest httprequest1;
        if (requestVersionIsTooLow(httprequest))
        {
            httprequest1 = upgradeRequestTo(httprequest, HttpVersion.HTTP_1_1);
        } else
        {
            httprequest1 = httprequest;
            if (requestMinorVersionIsTooHighMajorVersionsMatch(httprequest))
            {
                return downgradeRequestTo(httprequest, HttpVersion.HTTP_1_1);
            }
        }
        return httprequest1;
    }

    public List requestIsFatallyNonCompliant(HttpRequest httprequest)
    {
        ArrayList arraylist = new ArrayList();
        RequestProtocolError requestprotocolerror = requestHasWeakETagAndRange(httprequest);
        if (requestprotocolerror != null)
        {
            arraylist.add(requestprotocolerror);
        }
        requestprotocolerror = requestHasWeekETagForPUTOrDELETEIfMatch(httprequest);
        if (requestprotocolerror != null)
        {
            arraylist.add(requestprotocolerror);
        }
        httprequest = requestContainsNoCacheDirectiveWithFieldName(httprequest);
        if (httprequest != null)
        {
            arraylist.add(httprequest);
        }
        return arraylist;
    }

    protected boolean requestMinorVersionIsTooHighMajorVersionsMatch(HttpRequest httprequest)
    {
        for (httprequest = httprequest.getProtocolVersion(); httprequest.getMajor() != HttpVersion.HTTP_1_1.getMajor() || httprequest.getMinor() <= HttpVersion.HTTP_1_1.getMinor();)
        {
            return false;
        }

        return true;
    }

    protected boolean requestVersionIsTooLow(HttpRequest httprequest)
    {
        return httprequest.getProtocolVersion().compareToVersion(HttpVersion.HTTP_1_1) < 0;
    }

}
