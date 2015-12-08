// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.media:
//            m, MediaRouteProviderService, e

final class r extends Handler
{

    private final WeakReference a;

    public r(MediaRouteProviderService mediarouteproviderservice)
    {
        a = new WeakReference(mediarouteproviderservice);
    }

    public final void handleMessage(Message message)
    {
        android.os.Messenger messenger = message.replyTo;
        if (!m.a(messenger)) goto _L2; else goto _L1
_L1:
        Object obj;
        Bundle bundle;
        MediaRouteProviderService mediarouteproviderservice;
        int i;
        int j;
        int k;
        i = message.what;
        j = message.arg1;
        k = message.arg2;
        obj = message.obj;
        bundle = message.peekData();
        mediarouteproviderservice = (MediaRouteProviderService)a.get();
        if (mediarouteproviderservice == null) goto _L4; else goto _L3
_L3:
        i;
        JVM INSTR tableswitch 1 10: default 116
    //                   1 209
    //                   2 224
    //                   3 237
    //                   4 265
    //                   5 280
    //                   6 295
    //                   7 310
    //                   8 342
    //                   9 374
    //                   10 400;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L4:
        boolean flag = false;
_L15:
        if (!flag)
        {
            if (MediaRouteProviderService.b())
            {
                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(MediaRouteProviderService.a(messenger)).append(": Message failed, what=").append(i).append(", requestId=").append(j).append(", arg=").append(k).append(", obj=").append(obj).append(", data=").append(bundle).toString());
            }
            MediaRouteProviderService.a(messenger, j);
        }
_L22:
        return;
_L5:
        flag = MediaRouteProviderService.a(mediarouteproviderservice, messenger, j, k);
          goto _L15
_L6:
        flag = MediaRouteProviderService.a(mediarouteproviderservice, messenger, j);
          goto _L15
_L7:
        message = bundle.getString("routeId");
        if (message == null) goto _L4; else goto _L16
_L16:
        flag = MediaRouteProviderService.a(mediarouteproviderservice, messenger, j, k, message);
          goto _L15
_L8:
        flag = MediaRouteProviderService.b(mediarouteproviderservice, messenger, j, k);
          goto _L15
_L9:
        flag = MediaRouteProviderService.c(mediarouteproviderservice, messenger, j, k);
          goto _L15
_L10:
        flag = MediaRouteProviderService.d(mediarouteproviderservice, messenger, j, k);
          goto _L15
_L11:
        int l = bundle.getInt("volume", -1);
        if (l < 0) goto _L4; else goto _L17
_L17:
        flag = MediaRouteProviderService.a(mediarouteproviderservice, messenger, j, k, l);
          goto _L15
_L12:
        l = bundle.getInt("volume", 0);
        if (l == 0) goto _L4; else goto _L18
_L18:
        flag = MediaRouteProviderService.b(mediarouteproviderservice, messenger, j, k, l);
          goto _L15
_L13:
        if (!(obj instanceof Intent)) goto _L4; else goto _L19
_L19:
        flag = MediaRouteProviderService.a(mediarouteproviderservice, messenger, j, k, (Intent)obj);
          goto _L15
_L14:
        if (obj != null && !(obj instanceof Bundle)) goto _L4; else goto _L20
_L20:
        message = e.a((Bundle)obj);
        if (message == null || !message.c())
        {
            message = null;
        }
        flag = MediaRouteProviderService.a(mediarouteproviderservice, messenger, j, message);
          goto _L15
_L2:
        if (!MediaRouteProviderService.b()) goto _L22; else goto _L21
_L21:
        Log.d("MediaRouteProviderSrv", "Ignoring message without valid reply messenger.");
        return;
          goto _L15
    }
}
