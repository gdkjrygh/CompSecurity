// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.core.identity.a;
import com.google.android.apps.youtube.core.identity.b;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            ax

final class ay
    implements Runnable
{

    final ax a;

    ay(ax ax1)
    {
        a = ax1;
        super();
    }

    public final void run()
    {
        HttpPost httppost = new HttpPost("https://googleads.g.doubleclick.net/pagead/drt/m");
        httppost.setHeader("Cache-Control", "no-cache, no-transform");
        httppost.setHeader("X-Wap-Proxy-Cookie", "none");
        httppost.setHeader("X-Mobile-Google-Client", "1");
        httppost.setHeader("Accept-Encoding", "gzip");
        a a1;
        try
        {
            a1 = (a)com.google.android.apps.youtube.core.client.ax.b(a).a(com.google.android.apps.youtube.core.client.ax.a(a)).get();
            if (!a1.a())
            {
                return;
            }
        }
        catch (ClientProtocolException clientprotocolexception)
        {
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
        catch (ExecutionException executionexception)
        {
            return;
        }
        httppost.setHeader("Authorization", (new StringBuilder("OAuth ")).append(a1.c()).toString());
        ax.c(a).execute(httppost);
        return;
    }
}
