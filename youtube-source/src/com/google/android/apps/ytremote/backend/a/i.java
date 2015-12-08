// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.a;

import android.util.Log;
import com.google.android.apps.ytremote.a.d.a;
import com.google.android.apps.ytremote.backend.logic.c;
import com.google.android.apps.ytremote.model.PairingCode;
import com.google.android.apps.ytremote.model.ScreenId;
import com.google.android.apps.ytremote.util.d;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.google.android.apps.ytremote.backend.a:
//            h

public class i
    implements c
{

    private static final String a = com/google/android/apps/ytremote/backend/a/i.getCanonicalName();
    private final DefaultHttpClient b = com.google.android.apps.ytremote.a.d.a.a();

    public i()
    {
    }

    public final boolean a(PairingCode pairingcode, ScreenId screenid, String s)
    {
        HttpPost httppost;
        httppost = com.google.android.apps.ytremote.backend.a.h.a(pairingcode, screenid, s);
        screenid = null;
        pairingcode = null;
        s = b.execute(httppost);
        pairingcode = s;
        screenid = s;
        int j = s.getStatusLine().getStatusCode();
        if (j == 200)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        pairingcode = s;
        screenid = s;
        Log.w(a, (new StringBuilder("POST ")).append(httppost.getURI()).append(" failed. Response code is: ").append(j).append("\n Error message: ").append(d.a(s.getEntity().getContent())).toString());
        com.google.android.apps.ytremote.a.c.a.a(s);
        return true;
        s;
        screenid = pairingcode;
        Log.e(a, "Error registering pairing code ", s);
        com.google.android.apps.ytremote.a.c.a.a(pairingcode);
        return false;
        pairingcode;
        com.google.android.apps.ytremote.a.c.a.a(screenid);
        throw pairingcode;
    }

}
