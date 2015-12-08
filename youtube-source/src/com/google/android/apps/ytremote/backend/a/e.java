// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.a;

import android.util.Log;
import com.google.android.apps.ytremote.a.d.a;
import com.google.android.apps.ytremote.backend.logic.b;
import com.google.android.apps.ytremote.util.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.google.android.apps.ytremote.backend.a:
//            h, f

public class e
    implements b
{

    private static final String a = com/google/android/apps/ytremote/backend/a/e.getCanonicalName();
    private final DefaultHttpClient b = com.google.android.apps.ytremote.a.d.a.a();

    public e()
    {
    }

    static String a()
    {
        return a;
    }

    public final volatile Object a(Object obj)
    {
        return a((Collection)obj);
    }

    public final Map a(Collection collection)
    {
        HttpResponse httpresponse;
        Object obj1;
        HttpPost httppost;
        if (collection == null || collection.isEmpty())
        {
            return Collections.emptyMap();
        }
        httppost = com.google.android.apps.ytremote.backend.a.h.b(collection);
        obj1 = null;
        collection = null;
        httpresponse = null;
        HttpResponse httpresponse1 = b.execute(httppost);
        httpresponse = httpresponse1;
        obj1 = httpresponse1;
        collection = httpresponse1;
        int i = httpresponse1.getStatusLine().getStatusCode();
        if (i == 200)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        httpresponse = httpresponse1;
        obj1 = httpresponse1;
        collection = httpresponse1;
        Log.w(a, (new StringBuilder("POST ")).append(httppost.getURI()).append(" failed. Response code is: ").append(i).toString());
        httpresponse = httpresponse1;
        obj1 = httpresponse1;
        collection = httpresponse1;
        Object obj2 = new ByteArrayOutputStream();
        httpresponse = httpresponse1;
        obj1 = httpresponse1;
        collection = httpresponse1;
        httpresponse1.getEntity().writeTo(((java.io.OutputStream) (obj2)));
        httpresponse = httpresponse1;
        obj1 = httpresponse1;
        collection = httpresponse1;
        Log.w(a, (new StringBuilder("Error from server: ")).append(obj2).toString());
        httpresponse = httpresponse1;
        obj1 = httpresponse1;
        collection = httpresponse1;
        obj2 = Collections.emptyMap();
        com.google.android.apps.ytremote.a.c.a.a(httpresponse1);
        return ((Map) (obj2));
        httpresponse = httpresponse1;
        obj1 = httpresponse1;
        collection = httpresponse1;
        obj2 = (new f(this, d.a(httpresponse1.getEntity().getContent()))).a();
        com.google.android.apps.ytremote.a.c.a.a(httpresponse1);
        return ((Map) (obj2));
        obj1;
        collection = httpresponse;
        Log.e(a, (new StringBuilder("Error posting to ")).append(httppost.getURI()).toString(), ((Throwable) (obj1)));
        com.google.android.apps.ytremote.a.c.a.a(httpresponse);
_L2:
        return Collections.emptyMap();
        Object obj;
        obj;
        collection = ((Collection) (obj1));
        Log.e(a, "Error loading screen status.", ((Throwable) (obj)));
        com.google.android.apps.ytremote.a.c.a.a(((HttpResponse) (obj1)));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        com.google.android.apps.ytremote.a.c.a.a(collection);
        throw obj;
    }

}
