// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.youtube.p;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            ba, ax, RemoteControl

final class ay extends ba
{

    final ax a;

    private ay(ax ax1, RemoteControl remotecontrol, int i, boolean flag)
    {
        a = ax1;
        super(ax1, remotecontrol, i, flag, (byte)0);
    }

    ay(ax ax1, RemoteControl remotecontrol, int i, boolean flag, byte byte0)
    {
        this(ax1, remotecontrol, i, flag);
    }

    public final void a(Object obj, Exception exception)
    {
        ax.b(a).a(ax.b(a).a(exception));
    }

    public final void a(Object obj, Object obj1)
    {
label0:
        {
            Object obj2 = (Page)obj1;
            obj = new ArrayList();
            obj1 = new ArrayList();
            int i = c;
            obj2 = ((Page) (obj2)).iterator();
            boolean flag = false;
            do
            {
                if (!((Iterator) (obj2)).hasNext())
                {
                    break;
                }
                Video video = (Video)((Iterator) (obj2)).next();
                if (b.a(video))
                {
                    ((ArrayList) (obj)).add(video.id);
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
                ax.a(a, ((java.util.List) (obj)), ((java.util.List) (obj1)), i, b, true);
            }
            return;
        }
        b.b(((java.util.List) (obj)));
    }
}
