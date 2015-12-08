// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.browserchannel;

import com.google.android.apps.ytremote.fork.net.async.l;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.apps.ytremote.backend.browserchannel:
//            HttpClientConnection

final class f
    implements com.google.android.apps.ytremote.fork.net.async.f
{

    final HttpClientConnection a;

    f(HttpClientConnection httpclientconnection)
    {
        a = httpclientconnection;
        super();
    }

    public final void a()
    {
        HttpClientConnection.b(a).offer(new HttpClientConnection.IncomingItem());
    }

    public final void a(int i)
    {
        try
        {
            InputStream inputstream = HttpClientConnection.a(a).b();
            i = inputstream.available();
            ByteBuffer bytebuffer = ByteBuffer.allocate(i);
            inputstream.read(bytebuffer.array(), 0, i);
            HttpClientConnection.b(a).offer(new HttpClientConnection.IncomingItem(bytebuffer));
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    public final void a(int i, boolean flag)
    {
    }

    public final void a(Exception exception)
    {
        HttpClientConnection.b(a).offer(new HttpClientConnection.IncomingItem(exception));
    }
}
