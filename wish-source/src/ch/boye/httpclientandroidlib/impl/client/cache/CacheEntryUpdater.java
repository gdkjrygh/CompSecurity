// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.client.cache.HttpCacheEntry;
import ch.boye.httpclientandroidlib.client.cache.ResourceFactory;
import ch.boye.httpclientandroidlib.impl.cookie.DateParseException;
import ch.boye.httpclientandroidlib.impl.cookie.DateUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client.cache:
//            HeapResourceFactory

class CacheEntryUpdater
{

    private final ResourceFactory resourceFactory;

    CacheEntryUpdater()
    {
        this(((ResourceFactory) (new HeapResourceFactory())));
    }

    CacheEntryUpdater(ResourceFactory resourcefactory)
    {
        resourceFactory = resourcefactory;
    }

    private boolean entryAndResponseHaveDateHeader(HttpCacheEntry httpcacheentry, HttpResponse httpresponse)
    {
        return httpcacheentry.getFirstHeader("Date") != null && httpresponse.getFirstHeader("Date") != null;
    }

    private boolean entryDateHeaderNewerThenResponse(HttpCacheEntry httpcacheentry, HttpResponse httpresponse)
    {
        boolean flag;
        try
        {
            flag = DateUtils.parseDate(httpcacheentry.getFirstHeader("Date").getValue()).after(DateUtils.parseDate(httpresponse.getFirstHeader("Date").getValue()));
        }
        // Misplaced declaration of an exception variable
        catch (HttpCacheEntry httpcacheentry)
        {
            return false;
        }
        return flag;
    }

    private void removeCacheEntry1xxWarnings(List list, HttpCacheEntry httpcacheentry)
    {
        list = list.listIterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            if ("Warning".equals(((Header)list.next()).getName()))
            {
                Header aheader[] = httpcacheentry.getHeaders("Warning");
                int j = aheader.length;
                int i = 0;
                while (i < j) 
                {
                    if (aheader[i].getValue().startsWith("1"))
                    {
                        list.remove();
                    }
                    i++;
                }
            }
        } while (true);
    }

    private void removeCacheHeadersThatMatchResponse(List list, HttpResponse httpresponse)
    {
        httpresponse = httpresponse.getAllHeaders();
        int j = httpresponse.length;
label0:
        for (int i = 0; i < j; i++)
        {
            Header header = httpresponse[i];
            ListIterator listiterator = list.listIterator();
            do
            {
                if (!listiterator.hasNext())
                {
                    continue label0;
                }
                if (((Header)listiterator.next()).getName().equals(header.getName()))
                {
                    listiterator.remove();
                }
            } while (true);
        }

    }

    protected Header[] mergeHeaders(HttpCacheEntry httpcacheentry, HttpResponse httpresponse)
    {
        if (entryAndResponseHaveDateHeader(httpcacheentry, httpresponse) && entryDateHeaderNewerThenResponse(httpcacheentry, httpresponse))
        {
            return httpcacheentry.getAllHeaders();
        } else
        {
            ArrayList arraylist = new ArrayList(Arrays.asList(httpcacheentry.getAllHeaders()));
            removeCacheHeadersThatMatchResponse(arraylist, httpresponse);
            removeCacheEntry1xxWarnings(arraylist, httpcacheentry);
            arraylist.addAll(Arrays.asList(httpresponse.getAllHeaders()));
            return (Header[])arraylist.toArray(new Header[arraylist.size()]);
        }
    }

    public HttpCacheEntry updateCacheEntry(String s, HttpCacheEntry httpcacheentry, Date date, Date date1, HttpResponse httpresponse)
        throws IOException
    {
        if (httpresponse.getStatusLine().getStatusCode() != 304)
        {
            throw new IllegalArgumentException("Response must have 304 status code");
        } else
        {
            httpresponse = mergeHeaders(httpcacheentry, httpresponse);
            s = resourceFactory.copy(s, httpcacheentry.getResource());
            return new HttpCacheEntry(date, date1, httpcacheentry.getStatusLine(), httpresponse, s);
        }
    }
}
