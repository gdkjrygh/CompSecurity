// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Intent;
import android.os.Bundle;
import android.os.Messenger;
import android.util.Log;

// Referenced classes of package android.support.v7.media:
//            x, MediaRouteProviderService, o

final class n extends x
{

    final o a;
    final int b;
    final Intent c;
    final Messenger d;
    final int e;
    final MediaRouteProviderService f;

    n(MediaRouteProviderService mediarouteproviderservice, o o, int i, Intent intent, Messenger messenger, int j)
    {
        f = mediarouteproviderservice;
        a = o;
        b = i;
        c = intent;
        d = messenger;
        e = j;
        super();
    }

    public final void a(Bundle bundle)
    {
        if (MediaRouteProviderService.b())
        {
            Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(a).append(": Route control request succeeded, controllerId=").append(b).append(", intent=").append(c).append(", data=").append(bundle).toString());
        }
        if (MediaRouteProviderService.a(f, d) >= 0)
        {
            MediaRouteProviderService.a(d, 3, e, 0, bundle, null);
        }
    }

    public final void a(String s, Bundle bundle)
    {
label0:
        {
            if (MediaRouteProviderService.b())
            {
                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(a).append(": Route control request failed, controllerId=").append(b).append(", intent=").append(c).append(", error=").append(s).append(", data=").append(bundle).toString());
            }
            if (MediaRouteProviderService.a(f, d) >= 0)
            {
                if (s == null)
                {
                    break label0;
                }
                Bundle bundle1 = new Bundle();
                bundle1.putString("error", s);
                MediaRouteProviderService.a(d, 4, e, 0, bundle, bundle1);
            }
            return;
        }
        MediaRouteProviderService.a(d, 4, e, 0, bundle, null);
    }
}
