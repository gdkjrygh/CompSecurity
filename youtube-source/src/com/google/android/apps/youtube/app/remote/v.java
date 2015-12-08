// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.ytremote.backend.a.e;
import com.google.android.apps.ytremote.backend.a.j;
import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.LoungeToken;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            ac, t, bk, YouTubeTvScreen

final class v extends ac
{

    final b a;
    final t b;

    v(t t1, Void void1, b b1, b b2)
    {
        b = t1;
        a = b2;
        super(t1, null, b1);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (List)obj1;
        if (((List) (obj)).isEmpty())
        {
            a.a(null, Collections.emptyList());
            return;
        }
        if (((List) (obj)).size() == 1 && t.d(b).b() == RemoteControl.State.CONNECTED)
        {
            obj1 = t.d(b).x();
            if (((YouTubeTvScreen) (obj1)).hasScreen() && ((CloudScreen)((List) (obj)).get(0)).equals(obj1))
            {
                obj1 = new ArrayList();
                ((List) (obj1)).add(t.d(b).x());
                a.a(null, obj1);
            }
        }
        obj1 = new ArrayList();
        Object obj2 = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break;
            }
            CloudScreen cloudscreen = (CloudScreen)((Iterator) (obj2)).next();
            if (cloudscreen.getAccessType() == com.google.android.apps.ytremote.model.CloudScreen.AccessType.PERMANENT && !com.google.android.apps.youtube.app.remote.t.e(b).containsKey(cloudscreen.getScreenId()))
            {
                ((List) (obj1)).add(cloudscreen.getScreenId());
            }
        } while (true);
        int k = (int)Math.floor(((double)((List) (obj1)).size() - 1.0D) / 6D);
        for (int i = 0; i < k + 1; i++)
        {
            int l = i * 6;
            int i1 = Math.min(((List) (obj1)).size(), l + 6);
            com.google.android.apps.youtube.app.remote.t.e(b).putAll(t.f(b).a(((List) (obj1)).subList(l, i1)));
        }

        obj1 = new ArrayList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            obj2 = (CloudScreen)((Iterator) (obj)).next();
            if (((CloudScreen) (obj2)).getAccessType() == com.google.android.apps.ytremote.model.CloudScreen.AccessType.PERMANENT)
            {
                if (com.google.android.apps.youtube.app.remote.t.e(b).containsKey(((CloudScreen) (obj2)).getScreenId()))
                {
                    ((List) (obj1)).add(((CloudScreen) (obj2)).withLoungeToken((LoungeToken)com.google.android.apps.youtube.app.remote.t.e(b).get(((CloudScreen) (obj2)).getScreenId())));
                }
            } else
            {
                ((List) (obj1)).add(obj2);
            }
        } while (true);
        obj = t.g(b).a(((java.util.Collection) (obj1)));
        obj2 = new ArrayList();
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            CloudScreen cloudscreen1 = (CloudScreen)((Iterator) (obj1)).next();
            if (((Map) (obj)).containsKey(cloudscreen1))
            {
                ((List) (obj2)).add(new YouTubeTvScreen(cloudscreen1));
            }
        } while (true);
        if (t.d(b).b() == RemoteControl.State.CONNECTED && t.d(b).x().hasScreen() && !((List) (obj2)).contains(t.d(b).x()))
        {
            ((List) (obj2)).add(t.d(b).x());
        }
        a.a(null, obj2);
    }
}
