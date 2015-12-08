// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.a;

import android.content.Context;
import android.os.Message;
import android.util.Pair;
import com.google.android.apps.youtube.app.offline.OfflineStreamQuality;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.ce;
import com.google.android.apps.youtube.core.identity.UserProfile;
import com.google.android.apps.youtube.core.offline.store.i;
import com.google.android.apps.youtube.core.offline.store.l;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.apps.youtube.datalib.legacy.model.OfflineMediaStatus;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import com.google.android.apps.youtube.datalib.legacy.model.v;
import com.google.android.apps.youtube.datalib.legacy.model.x;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.apps.youtube.app.offline.a:
//            f

final class e
    implements android.os.Handler.Callback
{

    private final Context a;
    private final l b;
    private final bc c;
    private final ce d;
    private final f e;
    private final i f;

    e(Context context, l l1, bc bc1, ce ce1, f f1)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        c = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        d = (ce)com.google.android.apps.youtube.common.fromguava.c.a(ce1);
        e = (f)com.google.android.apps.youtube.common.fromguava.c.a(f1);
        f = (i)com.google.android.apps.youtube.common.fromguava.c.a(f1.d());
    }

    private void a(Playlist playlist, List list)
    {
        b.h(playlist.id);
        playlist = playlist.author;
        if (playlist != null && !f.a(playlist))
        {
            b.c(playlist);
        }
        for (playlist = list.iterator(); playlist.hasNext(); b((Video)playlist.next())) { }
    }

    private void a(Video video)
    {
        try
        {
            Object obj = video.id;
            com.google.android.apps.youtube.common.a.c c1 = com.google.android.apps.youtube.common.a.c.a();
            d.a(((String) (obj)), c1);
            obj = (List)c1.get();
            if (!((List) (obj)).isEmpty())
            {
                SubtitleTrack subtitletrack;
                String s;
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); f.a(Collections.singletonList(subtitletrack.createForOffline(s))))
                {
                    subtitletrack = (SubtitleTrack)((Iterator) (obj)).next();
                    s = b.a(video.id, subtitletrack);
                }

            }
        }
        catch (Exception exception)
        {
            L.b((new StringBuilder("Failed saving video subtitles ")).append(video.id).toString(), exception);
        }
        try
        {
            b.a(video);
        }
        catch (Exception exception1)
        {
            L.b((new StringBuilder("Failed saving video thumbnails for ")).append(video.id).toString(), exception1);
        }
        try
        {
            e(video.owner);
            return;
        }
        catch (Exception exception2)
        {
            L.b((new StringBuilder("Failed saving avatar for ")).append(video.owner).toString(), exception2);
        }
    }

    private void a(String s)
    {
        if (f.o(s))
        {
            d(s);
            return;
        } else
        {
            L.b((new StringBuilder("Failed removing video ")).append(s).append(" from database").toString());
            return;
        }
    }

    private void a(String s, OfflineStreamQuality offlinestreamquality)
    {
        if (f.i(s) == null)
        {
            Object obj;
            Object obj1;
            Object obj2;
            LinkedList linkedlist;
            try
            {
                obj1 = g(s);
            }
            // Misplaced declaration of an exception variable
            catch (OfflineStreamQuality offlinestreamquality)
            {
                L.a((new StringBuilder("Failed requesting playlist ")).append(s).append(" for offline").toString(), offlinestreamquality);
                e.x(s);
                return;
            }
            obj = (Playlist)((Pair) (obj1)).first;
            obj1 = (List)((Pair) (obj1)).second;
            if (((Playlist) (obj)).size != ((List) (obj1)).size())
            {
                L.c("Playlist size doesn't match number of playlist videos");
                obj = ((Playlist) (obj)).buildUpon().size(((List) (obj1)).size()).build();
            }
            try
            {
                b.a(((Playlist) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                L.b((new StringBuilder("Failed saving playlist thumbnail for ")).append(((Playlist) (obj)).id).toString(), ((Throwable) (obj2)));
            }
            try
            {
                e(((Playlist) (obj)).author);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                L.b((new StringBuilder("Failed saving avatar for ")).append(((Playlist) (obj)).author).toString(), ((Throwable) (obj2)));
            }
            linkedlist = new LinkedList();
            obj2 = new HashSet();
            a(((List) (obj1)), ((List) (linkedlist)), ((HashSet) (obj2)));
            if (!f.a(((Playlist) (obj)), ((List) (obj1)), offlinestreamquality.getQualityValue()))
            {
                L.b((new StringBuilder("Failed inserting playlist ")).append(s).append(" to database").toString());
                a(((Playlist) (obj)), ((List) (linkedlist)));
                e.x(s);
                return;
            }
            e.a(((Playlist) (obj)), ((java.util.Collection) (obj2)));
            obj = ((List) (obj1)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                Video video = (Video)((Iterator) (obj)).next();
                if (((HashSet) (obj2)).remove(video.id))
                {
                    a(s, video, offlinestreamquality);
                }
            }
        }
    }

    private void a(String s, Video video, OfflineStreamQuality offlinestreamquality)
    {
        e.a(s, video.id, offlinestreamquality);
        if (video.isMonetized(Util.a(a)))
        {
            e.a(video.id, offlinestreamquality);
        }
    }

    private void a(List list, List list1, HashSet hashset)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Video video = (Video)list.next();
            boolean flag;
            if (video.state == com.google.android.apps.youtube.datalib.model.gdata.Video.State.PLAYABLE)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && !f.q(video.id))
            {
                x x1 = e.a(video.id);
                if (x1 == null || x1.t() && x1.u())
                {
                    hashset.add(video.id);
                }
            }
            if (f.b(video.id) == null && flag)
            {
                a(video);
                list1.add(video);
            }
        } while (true);
    }

    private void b(Video video)
    {
        b.f(video.id);
        f.p(video.id);
        video = video.owner;
        if (video != null && !f.a(video))
        {
            b.c(video);
        }
    }

    private void b(String s)
    {
        if (f.i(s) == null)
        {
            e.y(s);
        } else
        {
            OfflineStreamQuality offlinestreamquality = OfflineStreamQuality.getOfflineStreamQualityForQualityValue(f.f(s));
            Object obj;
            Object obj1;
            Object obj2;
            Object obj3;
            LinkedList linkedlist;
            try
            {
                obj1 = g(s);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                L.a((new StringBuilder("Failed requesting playlist ")).append(s).append(" for offline").toString(), ((Throwable) (obj)));
                e.y(s);
                return;
            }
            obj = (Playlist)((Pair) (obj1)).first;
            obj1 = (List)((Pair) (obj1)).second;
            if (((Playlist) (obj)).size != ((List) (obj1)).size())
            {
                L.c("Playlist size doesn't match number of playlist videos");
                obj = ((Playlist) (obj)).buildUpon().size(((List) (obj1)).size()).build();
            }
            try
            {
                b.a(((Playlist) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                L.b((new StringBuilder("Failed saving playlist thumbnail for ")).append(((Playlist) (obj)).id).toString(), ((Throwable) (obj2)));
            }
            obj3 = new LinkedList();
            obj2 = new HashSet();
            a(((List) (obj1)), ((List) (obj3)), ((HashSet) (obj2)));
            linkedlist = new LinkedList();
            if (f.a(((Playlist) (obj)), ((List) (obj1)), linkedlist))
            {
                for (obj3 = linkedlist.iterator(); ((Iterator) (obj3)).hasNext(); d((String)((Iterator) (obj3)).next())) { }
            } else
            {
                L.b((new StringBuilder("Failed syncing playlist ")).append(s).append(" to database").toString());
                a(((Playlist) (obj)), ((List) (obj3)));
                e.y(s);
                return;
            }
            e.b(((Playlist) (obj)), ((java.util.Collection) (obj2)));
            obj = ((List) (obj1)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                Video video = (Video)((Iterator) (obj)).next();
                if (((HashSet) (obj2)).remove(video.id))
                {
                    a(s, video, offlinestreamquality);
                }
            }
        }
    }

    private void c(String s)
    {
        LinkedList linkedlist = new LinkedList();
        if (f.a(s, linkedlist))
        {
            e.z(s);
            for (s = linkedlist.iterator(); s.hasNext(); d((String)s.next())) { }
        } else
        {
            L.b((new StringBuilder("Failed removing playlist ")).append(s).append(" from database").toString());
        }
    }

    private void d(String s)
    {
        e.w(s);
        f.w(s);
    }

    private void e(String s)
    {
        if (s != null && !b.a(s))
        {
            Object obj = com.google.android.apps.youtube.common.a.c.a();
            c.h(s, ((com.google.android.apps.youtube.common.a.b) (obj)));
            obj = (UserProfile)((com.google.android.apps.youtube.common.a.c) (obj)).get();
            if (((UserProfile) (obj)).thumbnailUri != null)
            {
                b.a(s, ((UserProfile) (obj)).thumbnailUri);
                return;
            }
        }
    }

    private void f(String s)
    {
        OfflineStreamQuality offlinestreamquality = OfflineStreamQuality.getOfflineStreamQualityForQualityValue(f.e(s));
        e.a(null, s, offlinestreamquality);
    }

    private Pair g(String s)
    {
        com.google.android.apps.youtube.common.a.c c1 = com.google.android.apps.youtube.common.a.c.a();
        c.e(s, c1);
        return (Pair)c1.get();
    }

    public final boolean handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 12: default 68
    //                   1 70
    //                   2 79
    //                   3 373
    //                   4 412
    //                   5 450
    //                   6 485
    //                   7 550
    //                   8 563
    //                   9 621
    //                   10 649
    //                   11 662
    //                   12 675;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
        return false;
_L2:
        e.h();
        return false;
_L3:
        String s;
        OfflineStreamQuality offlinestreamquality;
        message = (Pair)message.obj;
        s = (String)((Pair) (message)).first;
        offlinestreamquality = (OfflineStreamQuality)((Pair) (message)).second;
        boolean flag;
        if (e.a(s) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f.h(s) != null)
        {
            e.s(s);
            return false;
        }
        message = f.b(s);
        if (message == null) goto _L15; else goto _L14
_L14:
        f.a(s, OfflineMediaStatus.ACTIVE, offlinestreamquality.getQualityValue());
        f.n(s);
_L17:
        e.s(s);
        a(((String) (null)), message, offlinestreamquality);
        return false;
_L15:
        Video video;
        try
        {
            message = com.google.android.apps.youtube.common.a.c.a();
            c.a(s, message);
            video = (Video)message.get();
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            L.a((new StringBuilder("Failed requesting video ")).append(s).append(" for offline").toString(), message);
            e.t(s);
            return false;
        }
        if (video.state != com.google.android.apps.youtube.datalib.model.gdata.Video.State.PLAYABLE)
        {
            L.b((new StringBuilder("Failed to offline video because video is not in PLAYABLE state: ")).append(video.state).toString());
            e.t(s);
            return false;
        }
        a(video);
        message = video;
        if (f.a(video, offlinestreamquality.getQualityValue())) goto _L17; else goto _L16
_L16:
        L.b((new StringBuilder("Failed inserting video ")).append(s).append(" to database").toString());
        b(video);
        e.t(s);
        return false;
_L4:
        message = (String)message.obj;
        if (f.n(message))
        {
            e.s(message);
            return false;
        } else
        {
            e.t(message);
            return false;
        }
_L5:
        message = (String)message.obj;
        f.a(message, OfflineMediaStatus.PAUSED);
        e.q(message);
        e.u(message);
        return false;
_L6:
        message = (String)message.obj;
        f.a(message, OfflineMediaStatus.ACTIVE);
        f(message);
        e.u(message);
        return false;
_L7:
        message = (String)message.obj;
        if (e.j(message) != null)
        {
            if (e.a(message) == null)
            {
                f.a(message, OfflineMediaStatus.ACTIVE, f.e(message));
                e.s(message);
            }
            f(message);
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        a((String)message.obj);
        return false;
_L9:
        message = (String)message.obj;
        x x1 = e.a(message);
        if (x1 != null && x1.f() != null)
        {
            if (x1.f().f())
            {
                e.u(message);
                return false;
            } else
            {
                e.a(x1);
                return false;
            }
        }
        continue; /* Loop/switch isn't completed */
_L10:
        message = (Pair)message.obj;
        a((String)((Pair) (message)).first, (OfflineStreamQuality)((Pair) (message)).second);
        return false;
_L11:
        b((String)message.obj);
        return false;
_L12:
        c((String)message.obj);
        return false;
_L13:
        for (message = f.c().iterator(); message.hasNext(); c(((Playlist)message.next()).id)) { }
        message = f.d().iterator();
        while (message.hasNext()) 
        {
            a(((x)message.next()).a());
        }
        if (true) goto _L1; else goto _L18
_L18:
    }
}
