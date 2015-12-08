// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.datalib.legacy.model.BatchEntry;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.youtube.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            ba, ax, RemoteControl

final class az extends ba
{

    final ax a;

    private az(ax ax1, RemoteControl remotecontrol, int i, boolean flag)
    {
        a = ax1;
        super(ax1, remotecontrol, i, flag, (byte)0);
    }

    az(ax ax1, RemoteControl remotecontrol, int i, boolean flag, byte byte0)
    {
        this(ax1, remotecontrol, i, true);
    }

    public final void a(Object obj, Exception exception)
    {
        ax.b(a).a(ax.b(a).a(exception));
    }

    public final void a(Object obj, Object obj1)
    {
label0:
        {
            Object obj2 = (List)obj1;
            obj = new ArrayList();
            obj1 = new ArrayList();
            int i = c;
            obj2 = ((List) (obj2)).iterator();
            boolean flag = false;
            do
            {
                if (!((Iterator) (obj2)).hasNext())
                {
                    break;
                }
                BatchEntry batchentry = (BatchEntry)((Iterator) (obj2)).next();
                if (batchentry.b == 200 && b.a((Video)batchentry.a))
                {
                    ((ArrayList) (obj)).add(((Video)batchentry.a).id);
                    ((ArrayList) (obj1)).add(ax.a(a));
                } else
                if (i >= ((ArrayList) (obj)).size())
                {
                    i--;
                    flag = true;
                }
            } while (true);
            if (flag)
            {
                ax.b(a).a(p.dP);
            }
            if (!((ArrayList) (obj)).isEmpty())
            {
                if (!d)
                {
                    break label0;
                }
                ax.a(a, ((List) (obj)), ((List) (obj1)), i, b, false);
            }
            return;
        }
        b.b(((List) (obj)));
    }
}
