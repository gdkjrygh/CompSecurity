// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.a;

import android.util.Log;
import com.google.android.apps.ytremote.a.d.a;
import com.google.android.apps.ytremote.backend.logic.d;
import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.LoungeToken;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.google.android.apps.ytremote.backend.a:
//            h, k

public class j
    implements d
{

    private static final String a = com/google/android/apps/ytremote/backend/a/j.getCanonicalName();
    private final DefaultHttpClient b = com.google.android.apps.ytremote.a.d.a.a();

    public j()
    {
    }

    static String a()
    {
        return a;
    }

    private Map a(Set set)
    {
        HttpResponse httpresponse;
        Object obj1;
        HttpPost httppost;
        httppost = com.google.android.apps.ytremote.backend.a.h.a(set);
        obj1 = null;
        set = null;
        httpresponse = null;
        HttpResponse httpresponse1 = b.execute(httppost);
        httpresponse = httpresponse1;
        obj1 = httpresponse1;
        set = httpresponse1;
        int i = httpresponse1.getStatusLine().getStatusCode();
        if (i == 200)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        httpresponse = httpresponse1;
        obj1 = httpresponse1;
        set = httpresponse1;
        Log.w(a, (new StringBuilder("POST ")).append(httppost.getURI()).append(" failed. Response code is: ").append(i).toString());
        httpresponse = httpresponse1;
        obj1 = httpresponse1;
        set = httpresponse1;
        Object obj2 = new ByteArrayOutputStream();
        httpresponse = httpresponse1;
        obj1 = httpresponse1;
        set = httpresponse1;
        httpresponse1.getEntity().writeTo(((java.io.OutputStream) (obj2)));
        httpresponse = httpresponse1;
        obj1 = httpresponse1;
        set = httpresponse1;
        obj2 = Collections.emptyMap();
        com.google.android.apps.ytremote.a.c.a.a(httpresponse1);
        return ((Map) (obj2));
        httpresponse = httpresponse1;
        obj1 = httpresponse1;
        set = httpresponse1;
        obj2 = (new k(this, com.google.android.apps.ytremote.util.d.a(httpresponse1.getEntity().getContent()))).a();
        com.google.android.apps.ytremote.a.c.a.a(httpresponse1);
        return ((Map) (obj2));
        obj1;
        set = httpresponse;
        Log.e(a, String.format("Error loading from %s, %s", new Object[] {
            httppost.getURI(), ((IOException) (obj1)).getMessage()
        }));
        com.google.android.apps.ytremote.a.c.a.a(httpresponse);
_L2:
        return Collections.emptyMap();
        Object obj;
        obj;
        set = ((Set) (obj1));
        Log.e(a, "Error loading screen status.", ((Throwable) (obj)));
        com.google.android.apps.ytremote.a.c.a.a(((HttpResponse) (obj1)));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        com.google.android.apps.ytremote.a.c.a.a(set);
        throw obj;
    }

    public final Map a(Collection collection)
    {
        if (collection == null || collection.isEmpty())
        {
            return Collections.emptyMap();
        }
        HashMap hashmap = new HashMap();
        CloudScreen cloudscreen;
        for (collection = collection.iterator(); collection.hasNext(); hashmap.put(cloudscreen.getLoungeToken(), cloudscreen))
        {
            cloudscreen = (CloudScreen)collection.next();
        }

        collection = a(hashmap.keySet());
        HashMap hashmap1 = new HashMap();
        LoungeToken loungetoken;
        for (Iterator iterator = collection.keySet().iterator(); iterator.hasNext(); hashmap1.put(hashmap.get(loungetoken), collection.get(loungetoken)))
        {
            loungetoken = (LoungeToken)iterator.next();
        }

        return hashmap1;
    }

}
