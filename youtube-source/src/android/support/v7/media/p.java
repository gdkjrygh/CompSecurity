// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;

// Referenced classes of package android.support.v7.media:
//            MediaRouteProviderService

final class p extends Handler
{

    final MediaRouteProviderService a;

    private p(MediaRouteProviderService mediarouteproviderservice)
    {
        a = mediarouteproviderservice;
        super();
    }

    p(MediaRouteProviderService mediarouteproviderservice, byte byte0)
    {
        this(mediarouteproviderservice);
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            MediaRouteProviderService.b(a, (Messenger)message.obj);
            break;
        }
    }
}
