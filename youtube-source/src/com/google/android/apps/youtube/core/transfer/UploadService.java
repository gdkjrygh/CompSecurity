// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.core.BaseApplication;
import com.google.android.apps.youtube.core.a;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.converter.http.fo;
import com.google.android.apps.youtube.core.identity.ak;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.utils.w;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import java.util.concurrent.Executor;
import org.apache.http.client.HttpClient;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            TransferService, aa, h, m, 
//            l

public class UploadService extends TransferService
{

    private Executor b;
    private HttpClient c;
    private bc d;
    private ak e;
    private l f;
    private fo g;

    public UploadService()
    {
    }

    public static Intent a(Context context)
    {
        return com.google.android.apps.youtube.core.transfer.TransferService.a(context, com/google/android/apps/youtube/core/transfer/UploadService);
    }

    public static w a(Context context, h h)
    {
        return com.google.android.apps.youtube.core.transfer.TransferService.a(context, com/google/android/apps/youtube/core/transfer/UploadService, h);
    }

    public final com.google.android.apps.youtube.core.transfer.l a(Transfer transfer, m m)
    {
        return new aa(this, b, c, d, e, f, ((BaseApplication)getApplication()).D(), g, transfer, m);
    }

    public final Runnable a(Transfer transfer)
    {
        return null;
    }

    protected final String d()
    {
        return "uploads.db";
    }

    protected final String e()
    {
        return "upload_policy";
    }

    protected final String f()
    {
        return null;
    }

    protected final String g()
    {
        return null;
    }

    protected final String i()
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        BaseApplication baseapplication = (BaseApplication)getApplication();
        a a1 = baseapplication.y();
        b = a1.aJ();
        c = a1.aL();
        e = a1.aV();
        f = a1.aT();
        g = new fo(a1.aN());
        d = baseapplication.f();
    }
}
