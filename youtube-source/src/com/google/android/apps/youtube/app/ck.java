// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.core.au;
import com.google.android.apps.youtube.core.client.DeviceClassification;
import com.google.android.apps.youtube.core.client.at;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.identity.l;
import java.util.concurrent.Executor;
import org.apache.http.client.HttpClient;

// Referenced classes of package com.google.android.apps.youtube.app:
//            cj, ax

final class ck extends at
{

    final cj a;

    ck(cj cj1, Context context, Executor executor, HttpClient httpclient, b b, SharedPreferences sharedpreferences, bc bc, 
            l l, au au, DeviceClassification deviceclassification, com.google.android.apps.youtube.datalib.e.b b1)
    {
        a = cj1;
        super(context, executor, httpclient, b, sharedpreferences, bc, l, au, deviceclassification, b1);
    }

    protected final boolean a()
    {
        return a.a.aP().getBoolean("dev_retention_enabled", true);
    }
}
