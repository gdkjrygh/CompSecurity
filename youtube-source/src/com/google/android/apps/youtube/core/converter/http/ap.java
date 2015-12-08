// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.core.async.GDataResponseException;
import com.google.android.apps.youtube.core.converter.e;
import com.google.android.apps.youtube.core.converter.f;
import com.google.android.apps.youtube.core.converter.n;
import java.util.ArrayList;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            gz, av, au, at, 
//            as, ar, aq, aw

public abstract class ap extends gz
{

    private static final e c = (new f()).a("/errors", new av()).a("/errors/error", new au()).a("/errors/error/domain", new at()).a("/errors/error/code", new as()).a("/errors/error/location", new ar()).a("/errors/error/internalReason", new aq()).a();

    public ap(n n1)
    {
        super(n1);
    }

    public static ap a(n n1)
    {
        return new aw(n1);
    }

    protected final HttpResponseException a(HttpResponse httpresponse)
    {
        Object obj;
        int i;
        obj = httpresponse.getStatusLine();
        i = ((StatusLine) (obj)).getStatusCode();
        obj = ((StatusLine) (obj)).getReasonPhrase();
        Object obj1 = httpresponse.getFirstHeader("Content-Type");
        boolean flag;
        if ((i == 400 || i == 401 || i == 403 || i == 503) && obj1 != null && ((Header) (obj1)).getValue().contains("xml"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        obj1 = httpresponse.getEntity().getContent();
        obj1 = (ArrayList)a.a(((java.io.InputStream) (obj1)), c);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        if (((ArrayList) (obj1)).size() == 0)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        obj1 = new GDataResponseException(i, ((String) (obj)), ((java.util.List) (obj1)));
        return ((HttpResponseException) (obj1));
        Exception exception;
        exception;
        if (i == 401 && "NoLinkedYouTubeAccount".equals(obj))
        {
            return GDataResponseException.createYouTubeSignupRequired(i, ((String) (obj)));
        } else
        {
            return super.a(httpresponse);
        }
    }

}
