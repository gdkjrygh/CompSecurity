// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.a;

import android.util.Log;
import com.google.android.apps.ytremote.a.d.a;
import com.google.android.apps.ytremote.backend.logic.b;
import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.PairingCode;
import com.google.android.apps.ytremote.util.d;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.ytremote.backend.a:
//            h, m

public class l
    implements b
{

    private static final String a = com/google/android/apps/ytremote/backend/a/l.getCanonicalName();
    private final DefaultHttpClient b = com.google.android.apps.ytremote.a.d.a.a();

    public l()
    {
    }

    public final CloudScreen a(PairingCode pairingcode)
    {
        HttpPost httppost;
        if (pairingcode == null)
        {
            return null;
        }
        httppost = com.google.android.apps.ytremote.backend.a.h.a(pairingcode);
        Object obj = b.execute(httppost);
        pairingcode = ((PairingCode) (obj));
        int i = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        if (i == 200)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        pairingcode = ((PairingCode) (obj));
        if (((HttpResponse) (obj)).getEntity() == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        pairingcode = ((PairingCode) (obj));
        ((HttpResponse) (obj)).getEntity().consumeContent();
        pairingcode = ((PairingCode) (obj));
        Log.w(a, (new StringBuilder("GET ")).append(httppost.getURI()).append(" failed. Response code is: ").append(i).toString());
        com.google.android.apps.ytremote.a.c.a.a(((HttpResponse) (obj)));
        return null;
        pairingcode = ((PairingCode) (obj));
        Object obj1 = (new m((new JSONObject(d.a(((HttpResponse) (obj)).getEntity().getContent()))).getJSONObject("screen"))).a();
        com.google.android.apps.ytremote.a.c.a.a(((HttpResponse) (obj)));
        return ((CloudScreen) (obj1));
        Object obj2;
        obj2;
        obj = null;
_L6:
        pairingcode = ((PairingCode) (obj));
        Log.e(a, (new StringBuilder("Error loading from ")).append(httppost.getURI()).toString(), ((Throwable) (obj2)));
        com.google.android.apps.ytremote.a.c.a.a(((HttpResponse) (obj)));
        return null;
        obj2;
        obj = null;
_L4:
        pairingcode = ((PairingCode) (obj));
        Log.e(a, "Error loading screen info.", ((Throwable) (obj2)));
        com.google.android.apps.ytremote.a.c.a.a(((HttpResponse) (obj)));
        return null;
        pairingcode;
        obj2 = null;
        obj = pairingcode;
_L2:
        com.google.android.apps.ytremote.a.c.a.a(((HttpResponse) (obj2)));
        throw obj;
        obj;
        obj2 = pairingcode;
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final volatile Object a(Object obj)
    {
        return a((PairingCode)obj);
    }

}
