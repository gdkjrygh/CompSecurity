// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.widget.BaseAdapter;
import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.app.remote.an;
import com.google.android.apps.youtube.app.remote.ap;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ea, ee, dy, ec, 
//            eh, v

public final class RemoteControlContextualMenuController
    implements ap
{

    private final an a;
    private v b;
    private BaseAdapter c;
    private final eh d;
    private final Action e;
    private int f;
    private boolean g;

    private RemoteControlContextualMenuController(an an1, v v1, BaseAdapter baseadapter, eh eh1, Action action)
    {
        a = (an)com.google.android.apps.youtube.common.fromguava.c.a(an1);
        b = v1;
        c = baseadapter;
        d = eh1;
        e = action;
        an1.a(this);
    }

    public static RemoteControlContextualMenuController a(Activity activity, an an1, aw aw1, WatchFeature watchfeature, Analytics analytics, bc bc)
    {
        return new RemoteControlContextualMenuController(an1, null, null, new ea(activity, analytics, watchfeature, aw1, bc), Action.ADD);
    }

    public static RemoteControlContextualMenuController a(an an1, v v1, BaseAdapter baseadapter, aw aw1, Analytics analytics)
    {
        return new RemoteControlContextualMenuController(an1, v1, baseadapter, new ee(aw1, analytics), Action.ADD);
    }

    public static RemoteControlContextualMenuController a(an an1, v v1, BaseAdapter baseadapter, aw aw1, WatchFeature watchfeature, Analytics analytics)
    {
        return new RemoteControlContextualMenuController(an1, v1, baseadapter, new dy(watchfeature, aw1, analytics), Action.ADD);
    }

    public static RemoteControlContextualMenuController a(an an1, aw aw1, WatchFeature watchfeature, Analytics analytics, bc bc)
    {
        return new RemoteControlContextualMenuController(an1, null, null, new ec(analytics), Action.REMOVE);
    }

    private void a(RemoteControl remotecontrol)
    {
        boolean flag = true;
        if (b != null)
        {
            int i;
            if (remotecontrol != null)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (!g && i != 0)
            {
                if (e == Action.ADD)
                {
                    i = p.cB;
                } else
                {
                    i = p.eZ;
                }
                f = b.a(0, i, d.a(remotecontrol));
                g = true;
            } else
            if (g && i == 0)
            {
                b.c(f);
                g = false;
            }
            remotecontrol = b;
            if (b.a() <= 0)
            {
                flag = false;
            }
            remotecontrol.a(flag);
            if (c != null)
            {
                c.notifyDataSetChanged();
                return;
            }
        }
    }

    static void a(RemoteControl remotecontrol, Video video, WatchFeature watchfeature, aw aw1, Analytics analytics)
    {
        if (remotecontrol.a(video))
        {
            analytics.b("AddToTvQueueFromOverflowMenu");
            remotecontrol.c(video.id);
            return;
        } else
        {
            aw1.a(p.bn);
            return;
        }
    }

    static void a(RemoteControl remotecontrol, String s, Analytics analytics)
    {
        if (remotecontrol.p() != null && remotecontrol.p().equals(s))
        {
            remotecontrol.g();
        }
        remotecontrol.d(s);
        analytics.b("RemoteQueueDelete");
    }

    public final void a()
    {
        a.b(this);
    }

    public final void a(RemoteControl remotecontrol, boolean flag)
    {
        a(remotecontrol);
    }

    public final void a(v v1, BaseAdapter baseadapter)
    {
        if (g && b != null)
        {
            b.c(f);
            g = false;
        }
        b = (v)com.google.android.apps.youtube.common.fromguava.c.a(v1);
        c = (BaseAdapter)com.google.android.apps.youtube.common.fromguava.c.a(baseadapter);
        c();
    }

    public final void b()
    {
        c();
    }

    public final void c()
    {
        a(a.e());
    }

    private class Action extends Enum
    {

        private static final Action $VALUES[];
        public static final Action ADD;
        public static final Action REMOVE;

        public static Action valueOf(String s)
        {
            return (Action)Enum.valueOf(com/google/android/apps/youtube/app/ui/RemoteControlContextualMenuController$Action, s);
        }

        public static Action[] values()
        {
            return (Action[])$VALUES.clone();
        }

        static 
        {
            ADD = new Action("ADD", 0);
            REMOVE = new Action("REMOVE", 1);
            $VALUES = (new Action[] {
                ADD, REMOVE
            });
        }

        private Action(String s, int i)
        {
            super(s, i);
        }
    }

}
