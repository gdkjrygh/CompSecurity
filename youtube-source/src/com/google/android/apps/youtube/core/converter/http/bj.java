// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.core.converter.ConverterException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpResponseException;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            ay

public abstract class bj extends ay
{

    public bj()
    {
    }

    protected final Object a(InputStream inputstream)
    {
        return super.a(inputstream);
    }

    protected final Object a(HttpEntity httpentity)
    {
        try
        {
            httpentity = ((HttpEntity) (a(new JSONObject(EntityUtils.toString(httpentity)))));
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            throw new ConverterException(httpentity);
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            throw new ConverterException(httpentity);
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            throw new ConverterException(httpentity);
        }
        return httpentity;
    }

    protected abstract Object a(JSONObject jsonobject);

    protected final HttpResponseException a(HttpResponse httpresponse)
    {
        return super.a(httpresponse);
    }

    public final Object a_(Object obj)
    {
        return super.b((HttpResponse)obj);
    }

    public final Object b(HttpResponse httpresponse)
    {
        return super.b(httpresponse);
    }

    protected final boolean d(HttpResponse httpresponse)
    {
        return super.d(httpresponse);
    }
}
