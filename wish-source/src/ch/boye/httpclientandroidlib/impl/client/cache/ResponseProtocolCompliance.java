// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.HttpEntityEnclosingRequest;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.HttpVersion;
import ch.boye.httpclientandroidlib.ProtocolVersion;
import ch.boye.httpclientandroidlib.RequestLine;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.client.ClientProtocolException;
import ch.boye.httpclientandroidlib.impl.client.RequestWrapper;
import ch.boye.httpclientandroidlib.impl.cookie.DateParseException;
import ch.boye.httpclientandroidlib.impl.cookie.DateUtils;
import ch.boye.httpclientandroidlib.message.BasicHeader;
import ch.boye.httpclientandroidlib.util.EntityUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client.cache:
//            WarningValue

class ResponseProtocolCompliance
{

    private static final String UNEXPECTED_100_CONTINUE = "The incoming request did not contain a 100-continue header, but the response was a Status 100, continue.";
    private static final String UNEXPECTED_PARTIAL_CONTENT = "partial content was returned for a request that did not ask for it";

    ResponseProtocolCompliance()
    {
    }

    private boolean backendResponseMustNotHaveBody(HttpRequest httprequest, HttpResponse httpresponse)
    {
        return "HEAD".equals(httprequest.getRequestLine().getMethod()) || httpresponse.getStatusLine().getStatusCode() == 204 || httpresponse.getStatusLine().getStatusCode() == 205 || httpresponse.getStatusLine().getStatusCode() == 304;
    }

    private void consumeBody(HttpResponse httpresponse)
        throws IOException
    {
        httpresponse = httpresponse.getEntity();
        if (httpresponse != null)
        {
            EntityUtils.consume(httpresponse);
        }
    }

    private void ensure200ForOPTIONSRequestWithNoBodyHasContentLengthZero(HttpRequest httprequest, HttpResponse httpresponse)
    {
        while (!httprequest.getRequestLine().getMethod().equalsIgnoreCase("OPTIONS") || httpresponse.getStatusLine().getStatusCode() != 200 || httpresponse.getFirstHeader("Content-Length") != null) 
        {
            return;
        }
        httpresponse.addHeader("Content-Length", "0");
    }

    private void ensure206ContainsDateHeader(HttpResponse httpresponse)
    {
        if (httpresponse.getFirstHeader("Date") == null)
        {
            httpresponse.addHeader("Date", DateUtils.formatDate(new Date()));
        }
    }

    private void ensure304DoesNotContainExtraEntityHeaders(HttpResponse httpresponse)
    {
        String as[] = new String[8];
        as[0] = "Allow";
        as[1] = "Content-Encoding";
        as[2] = "Content-Language";
        as[3] = "Content-Length";
        as[4] = "Content-MD5";
        as[5] = "Content-Range";
        as[6] = "Content-Type";
        as[7] = "Last-Modified";
        if (httpresponse.getStatusLine().getStatusCode() == 304)
        {
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                httpresponse.removeHeaders(as[i]);
            }

        }
    }

    private void ensurePartialContentIsNotSentToAClientThatDidNotRequestIt(HttpRequest httprequest, HttpResponse httpresponse)
        throws IOException
    {
        if (httprequest.getFirstHeader("Range") != null || httpresponse.getStatusLine().getStatusCode() != 206)
        {
            return;
        } else
        {
            consumeBody(httpresponse);
            throw new ClientProtocolException("partial content was returned for a request that did not ask for it");
        }
    }

    private ProtocolVersion getOriginalRequestProtocol(RequestWrapper requestwrapper)
    {
        return requestwrapper.getOriginal().getProtocolVersion();
    }

    private void identityIsNotUsedInContentEncoding(HttpResponse httpresponse)
    {
        Header aheader[] = httpresponse.getHeaders("Content-Encoding");
        if (aheader != null && aheader.length != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ArrayList arraylist = new ArrayList();
        boolean flag = false;
        int k = aheader.length;
        for (int i = 0; i < k; i++)
        {
            Header header = aheader[i];
            Object obj = new StringBuilder();
            boolean flag1 = true;
            HeaderElement aheaderelement[] = header.getElements();
            int l = aheaderelement.length;
            int j = 0;
            while (j < l) 
            {
                HeaderElement headerelement = aheaderelement[j];
                if ("identity".equalsIgnoreCase(headerelement.getName()))
                {
                    flag = true;
                } else
                {
                    if (!flag1)
                    {
                        ((StringBuilder) (obj)).append(",");
                    }
                    ((StringBuilder) (obj)).append(headerelement.toString());
                    flag1 = false;
                }
                j++;
            }
            obj = ((StringBuilder) (obj)).toString();
            if (!"".equals(obj))
            {
                arraylist.add(new BasicHeader("Content-Encoding", ((String) (obj))));
            }
        }

        if (flag)
        {
            httpresponse.removeHeaders("Content-Encoding");
            Iterator iterator = arraylist.iterator();
            while (iterator.hasNext()) 
            {
                httpresponse.addHeader((Header)iterator.next());
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void removeResponseTransferEncoding(HttpResponse httpresponse)
    {
        httpresponse.removeHeaders("TE");
        httpresponse.removeHeaders("Transfer-Encoding");
    }

    private void requestDidNotExpect100ContinueButResponseIsOne(HttpRequest httprequest, HttpResponse httpresponse)
        throws IOException
    {
        if (httpresponse.getStatusLine().getStatusCode() == 100)
        {
            if (requestWasWrapped(httprequest))
            {
                httprequest = ((RequestWrapper)httprequest).getOriginal();
            }
            if (!(httprequest instanceof HttpEntityEnclosingRequest) || !((HttpEntityEnclosingRequest)httprequest).expectContinue())
            {
                consumeBody(httpresponse);
                throw new ClientProtocolException("The incoming request did not contain a 100-continue header, but the response was a Status 100, continue.");
            }
        }
    }

    private boolean requestWasWrapped(HttpRequest httprequest)
    {
        return httprequest instanceof RequestWrapper;
    }

    private void transferEncodingIsNotReturnedTo1_0Client(HttpRequest httprequest, HttpResponse httpresponse)
    {
        while (!requestWasWrapped(httprequest) || getOriginalRequestProtocol((RequestWrapper)httprequest).compareToVersion(HttpVersion.HTTP_1_1) >= 0) 
        {
            return;
        }
        removeResponseTransferEncoding(httpresponse);
    }

    private void warningsWithNonMatchingWarnDatesAreRemoved(HttpResponse httpresponse)
    {
        Date date = null;
        Date date1 = DateUtils.parseDate(httpresponse.getFirstHeader("Date").getValue());
        date = date1;
_L5:
        if (date != null) goto _L2; else goto _L1
_L1:
        Header aheader[];
        return;
_L2:
        if ((aheader = httpresponse.getHeaders("Warning")) != null && aheader.length != 0)
        {
            ArrayList arraylist = new ArrayList();
            boolean flag = false;
            int k = aheader.length;
            for (int i = 0; i < k; i++)
            {
                WarningValue awarningvalue[] = WarningValue.getWarningValues(aheader[i]);
                int l = awarningvalue.length;
                int j = 0;
                while (j < l) 
                {
                    WarningValue warningvalue = awarningvalue[j];
                    Date date2 = warningvalue.getWarnDate();
                    if (date2 == null || date2.equals(date))
                    {
                        arraylist.add(new BasicHeader("Warning", warningvalue.toString()));
                    } else
                    {
                        flag = true;
                    }
                    j++;
                }
            }

            if (flag)
            {
                httpresponse.removeHeaders("Warning");
                Iterator iterator = arraylist.iterator();
                while (iterator.hasNext()) 
                {
                    httpresponse.addHeader((Header)iterator.next());
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        DateParseException dateparseexception;
        dateparseexception;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void ensureProtocolCompliance(HttpRequest httprequest, HttpResponse httpresponse)
        throws IOException
    {
        if (backendResponseMustNotHaveBody(httprequest, httpresponse))
        {
            consumeBody(httpresponse);
            httpresponse.setEntity(null);
        }
        requestDidNotExpect100ContinueButResponseIsOne(httprequest, httpresponse);
        transferEncodingIsNotReturnedTo1_0Client(httprequest, httpresponse);
        ensurePartialContentIsNotSentToAClientThatDidNotRequestIt(httprequest, httpresponse);
        ensure200ForOPTIONSRequestWithNoBodyHasContentLengthZero(httprequest, httpresponse);
        ensure206ContainsDateHeader(httpresponse);
        ensure304DoesNotContainExtraEntityHeaders(httpresponse);
        identityIsNotUsedInContentEncoding(httpresponse);
        warningsWithNonMatchingWarnDatesAreRemoved(httpresponse);
    }
}
