// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import com.ubercab.client.core.vendor.google.GoogleWalletActivity;
import java.lang.ref.WeakReference;

public final class dwo extends Handler
{

    private WeakReference a;

    public dwo(GoogleWalletActivity googlewalletactivity)
    {
        a = new WeakReference(googlewalletactivity);
    }

    public final void handleMessage(Message message)
    {
        if (message.what == 400)
        {
            message = (GoogleWalletActivity)a.get();
            if (message != null)
            {
                GoogleWalletActivity.a(message).b();
            }
        }
    }
}
