// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.p;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import com.google.android.apps.youtube.datalib.legacy.model.OfflineMediaStatus;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.t;
import com.google.android.apps.youtube.datalib.legacy.model.u;
import com.google.android.apps.youtube.datalib.legacy.model.v;
import com.google.android.apps.youtube.datalib.legacy.model.x;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import com.google.android.exoplayer.upstream.cache.a;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;

// Referenced classes of package com.google.android.apps.youtube.core.offline.store:
//            s, l, j, x, 
//            aa, u, f, m, 
//            v, c, d, k, 
//            z, g, y, e, 
//            t

public final class i
    implements s
{

    com.google.android.apps.youtube.core.offline.store.c a;
    f b;
    d c;
    final com.google.android.apps.youtube.core.offline.store.x d = new com.google.android.apps.youtube.core.offline.store.x();
    private final Context e;
    private final String f;
    private SQLiteDatabase g;
    private final l h;
    private final j i;
    private com.google.android.apps.youtube.core.offline.store.u j;
    private aa k;
    private com.google.android.apps.youtube.core.offline.store.v l;

    public i(Context context, String s1, l l1, j j1)
    {
        e = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        f = com.google.android.apps.youtube.common.fromguava.c.a(s1);
        h = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        i = (j)com.google.android.apps.youtube.common.fromguava.c.a(j1);
    }

    private void a(OfflineMediaStatus offlinemediastatus, OfflineMediaStatus offlinemediastatus1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("media_status", Integer.valueOf(offlinemediastatus1.value()));
        g.update("videos", contentvalues, "media_status = ?", new String[] {
            Integer.toString(offlinemediastatus.value())
        });
    }

    private void a(Video video)
    {
        p(video.id);
        k.m(video.id);
        i.a(video.id);
        if (!k.p(video.owner))
        {
            i.c(video.owner);
        }
    }

    private void a(Video video, List list)
    {
        String s1 = video.id;
        if (!d.f(s1) && !k.d(s1))
        {
            if (video != null)
            {
                a(video);
            }
            if (!y(s1))
            {
                x(s1);
            }
            list.add(s1);
        }
    }

    private void a(String s1, List list, int i1, HashSet hashset)
    {
        int k1 = list.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            Video video = (Video)list.get(j1);
            String s2 = video.id;
            k.a(s1, s2, j1);
            if (!k.b(s2))
            {
                k.a(video, i1);
                hashset.add(video.id);
            }
        }

    }

    private void x(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        j.a(s1);
        i.d(s1);
        return;
        Object obj;
        obj;
        L.a("Error deleting streams", ((Throwable) (obj)));
        i.d(s1);
        return;
        obj;
        i.d(s1);
        throw obj;
    }

    private boolean y(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        return b.b(s1) > 0;
    }

    public final u a(String s1, com.google.android.apps.youtube.core.offline.store.t t1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        return j.a(s1, t1);
    }

    public final void a()
    {
        if (g == null || !g.isOpen())
        {
            g = (new m(e, f, i)).getWritableDatabase();
            a(OfflineMediaStatus.ACTIVE, OfflineMediaStatus.FAILED_UNKNOWN);
            j = new com.google.android.apps.youtube.core.offline.store.u(g);
            k = new aa(g, h);
            l = new com.google.android.apps.youtube.core.offline.store.v(g);
            a = new com.google.android.apps.youtube.core.offline.store.c(g);
            b = new f(g);
            c = new d(g);
        }
    }

    public final transient void a(a aa1[])
    {
        Object obj;
        d.b();
        a(OfflineMediaStatus.ACTIVE, OfflineMediaStatus.FAILED_UNKNOWN);
        obj = g.query("videos", null, "media_status != ?", new String[] {
            Integer.toString(OfflineMediaStatus.DELETED.value())
        }, null, null, null);
        com.google.android.apps.youtube.core.offline.store.k.a(new k(this, ((Cursor) (obj)), h, (byte)0), d);
        ((Cursor) (obj)).close();
        Video video;
        for (obj = k.a().iterator(); ((Iterator) (obj)).hasNext(); d.e(video.id))
        {
            video = (Video)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_131;
        aa1;
        ((Cursor) (obj)).close();
        throw aa1;
        Playlist playlist;
        for (obj = k.b().iterator(); ((Iterator) (obj)).hasNext(); d.a(playlist))
        {
            playlist = (Playlist)((Iterator) (obj)).next();
        }

        obj = g.query("playlist_video", new String[] {
            "playlist_id", "video_id"
        }, "playlist_id IS NOT NULL", null, null, null, null);
        int i1 = ((Cursor) (obj)).getColumnIndexOrThrow("playlist_id");
        int k1 = ((Cursor) (obj)).getColumnIndexOrThrow("video_id");
        for (; ((Cursor) (obj)).moveToNext(); d.a(((Cursor) (obj)).getString(i1), ((Cursor) (obj)).getString(k1))) { }
        break MISSING_BLOCK_LABEL_274;
        aa1;
        ((Cursor) (obj)).close();
        throw aa1;
        Iterator iterator;
        ((Cursor) (obj)).close();
        iterator = d.c().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        z z1 = (z)iterator.next();
        if (z1.c() != OfflineMediaStatus.COMPLETE) goto _L4; else goto _L3
_L3:
        int j1;
        int l1;
        u u1 = j.a(z1.a().id, null);
        t t1 = u1.a();
        obj = t1;
        if (t1 == null)
        {
            obj = u1.b();
        }
        obj = com.google.android.apps.youtube.core.utils.p.a(z1.a().id, ((t) (obj)).c(), ((t) (obj)).a().getLastModified());
        l1 = aa1.length;
        j1 = 0;
_L7:
        a a1;
        if (j1 >= l1)
        {
            break MISSING_BLOCK_LABEL_447;
        }
        a1 = aa1[j1];
        if (a1 == null || !a1.a().contains(obj)) goto _L6; else goto _L5
_L5:
        boolean flag = true;
_L8:
        z1.a(flag);
          goto _L4
_L6:
        j1++;
          goto _L7
_L2:
        return;
        flag = false;
          goto _L8
    }

    public final boolean a(Playlist playlist, List list, int i1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(playlist);
        com.google.android.apps.youtube.common.fromguava.c.a(list);
        g.beginTransaction();
        try
        {
            String s1 = playlist.id;
            k.a(playlist, i1);
            HashSet hashset = new HashSet();
            a(s1, list, i1, hashset);
            d.a(playlist);
            Video video;
            for (list = list.iterator(); list.hasNext(); d.a(playlist.id, video.id))
            {
                video = (Video)list.next();
                if (hashset.contains(video.id))
                {
                    d.a(video);
                }
            }

            break MISSING_BLOCK_LABEL_144;
        }
        // Misplaced declaration of an exception variable
        catch (Playlist playlist) { }
        finally
        {
            g.endTransaction();
            throw playlist;
        }
        L.a("Error inserting playlist", playlist);
        g.endTransaction();
        return false;
        g.setTransactionSuccessful();
        g.endTransaction();
        return true;
    }

    public final boolean a(Playlist playlist, List list, List list1)
    {
        String s1;
        com.google.android.apps.youtube.common.fromguava.c.a(playlist);
        com.google.android.apps.youtube.common.fromguava.c.a(list);
        g.beginTransaction();
        s1 = playlist.id;
        Object obj;
        int i1;
        Object obj1 = k.e(s1);
        i1 = k.i(s1);
        k.n(s1);
        k.o(s1);
        obj = new HashMap();
        Video video;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((HashMap) (obj)).put(video.id, video))
        {
            video = (Video)((Iterator) (obj1)).next();
        }

          goto _L1
_L3:
        L.a("Error syncing playlist", playlist);
        g.endTransaction();
        return false;
_L1:
        try
        {
            for (Iterator iterator = list.iterator(); iterator.hasNext(); ((HashMap) (obj)).remove(((Video)iterator.next()).id)) { }
            break MISSING_BLOCK_LABEL_186;
        }
        // Misplaced declaration of an exception variable
        catch (Playlist playlist) { }
        finally
        {
            g.endTransaction();
            throw playlist;
        }
        if (true) goto _L3; else goto _L2
_L2:
        for (obj = ((HashMap) (obj)).values().iterator(); ((Iterator) (obj)).hasNext(); a((Video)((Iterator) (obj)).next(), list1)) { }
        k.a(playlist, i1);
        obj = new HashSet();
        a(s1, list, i1, ((HashSet) (obj)));
        String s2;
        for (list1 = list1.iterator(); list1.hasNext(); d.b(s2))
        {
            s2 = (String)list1.next();
        }

        d.d(s1);
        d.a(playlist);
        for (list = list.iterator(); list.hasNext(); d.a(playlist.id, ((Video) (list1)).id))
        {
            list1 = (Video)list.next();
            if (((HashSet) (obj)).contains(((Video) (list1)).id))
            {
                d.a(list1);
            }
        }

        g.setTransactionSuccessful();
        g.endTransaction();
        return true;
    }

    public final boolean a(Video video, int i1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(video);
        g.beginTransaction();
        k.a(video, i1);
        k.k(video.id);
        d.a(video);
        d.e(video.id);
        g.setTransactionSuccessful();
        g.endTransaction();
        return true;
        video;
        L.a("Error inserting single video", video);
        g.endTransaction();
        return false;
        video;
        g.endTransaction();
        throw video;
    }

    public final boolean a(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        return k.p(s1);
    }

    public final boolean a(String s1, int i1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        try
        {
            j.a(s1, i1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            L.a("Error deleting stream", s1);
            return false;
        }
        return true;
    }

    public final boolean a(String s1, int i1, long l1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        try
        {
            j.a(s1, i1, l1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            L.a("Error updating stream progress", s1);
            return false;
        }
        return true;
    }

    public final boolean a(String s1, long l1)
    {
        z z1;
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        z1 = d.a(s1);
        if (z1 == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        k.a(s1, l1);
        z1.a(l1);
        return true;
        s1;
        L.a("Error updating last playback timestamp", s1);
        return false;
    }

    public final boolean a(String s1, long l1, long l2)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        boolean flag;
        if (l1 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag);
        if (l2 > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag);
        if (l1 <= l2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag);
        s1 = d.a(s1);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        s1.a(l1, l2);
        return true;
        s1;
        L.a("Error updating media progress", s1);
        return false;
    }

    public final boolean a(String s1, PlayerResponse playerresponse, long l1)
    {
        z z1;
        com.google.android.apps.youtube.common.fromguava.c.a(playerresponse);
        z1 = d.a(s1);
        if (z1 == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        playerresponse = playerresponse.sanitizeForOffline();
        k.a(s1, playerresponse, l1, l1);
        z1.a(playerresponse, l1, l1);
        i.a(playerresponse);
        return true;
        s1;
        L.a("Error updating player response for offline", s1);
_L2:
        return false;
        s1;
        L.a("Error inserting player response", s1);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final boolean a(String s1, FormatStream formatstream, boolean flag)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        com.google.android.apps.youtube.common.fromguava.c.a(formatstream);
        try
        {
            j.a(formatstream, flag);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            L.a("Error inserting stream", s1);
            return false;
        }
        return true;
    }

    public final boolean a(String s1, OfflineMediaStatus offlinemediastatus)
    {
        z z1;
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        com.google.android.apps.youtube.common.fromguava.c.a(offlinemediastatus);
        z1 = d.a(s1);
        if (z1 == null || z1.c() == offlinemediastatus)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        k.a(s1, offlinemediastatus);
        z1.a(offlinemediastatus);
        return true;
        s1;
        L.a("Error updating media status", s1);
        return false;
    }

    public final boolean a(String s1, OfflineMediaStatus offlinemediastatus, int i1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        com.google.android.apps.youtube.common.fromguava.c.a(offlinemediastatus);
        if (d.a(s1) == null)
        {
            Video video = b(s1);
            if (video != null)
            {
                try
                {
                    k.a(s1, offlinemediastatus);
                    k.a(s1, i1);
                    d.a(video);
                    d.a(s1).a(offlinemediastatus);
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    L.a("Error undeleting video", s1);
                }
            }
        }
        return false;
    }

    public final boolean a(String s1, Transfer transfer)
    {
        z z1;
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        com.google.android.apps.youtube.common.fromguava.c.a(transfer);
        z1 = d.a(s1);
        if (z1 == null) goto _L2; else goto _L1
_L1:
        OfflineMediaStatus offlinemediastatus = null;
        if (!transfer.a()) goto _L4; else goto _L3
_L3:
        offlinemediastatus = OfflineMediaStatus.ACTIVE;
_L5:
        if (offlinemediastatus != null)
        {
            a(s1, offlinemediastatus);
        }
        z1.a(transfer);
        return true;
_L4:
        if (transfer.c == com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.COMPLETED)
        {
            offlinemediastatus = OfflineMediaStatus.COMPLETE;
        }
        if (true) goto _L5; else goto _L2
_L2:
        return false;
    }

    public final boolean a(String s1, String s2)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        com.google.android.apps.youtube.common.fromguava.c.a(s2);
        return d.g(s2).contains(s1);
    }

    public final boolean a(String s1, String s2, VastAd vastad)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        com.google.android.apps.youtube.common.fromguava.c.a(s2);
        com.google.android.apps.youtube.common.fromguava.c.a(vastad);
        g.beginTransaction();
        boolean flag;
        if (!k.a(s1))
        {
            break MISSING_BLOCK_LABEL_48;
        }
        flag = a.b(s1);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        g.endTransaction();
        return false;
        b.a(s1, s2, vastad);
        if (vastad.getAdVideoId() != null)
        {
            s1 = vastad.getAdVideoId();
            if (!c.c(s1))
            {
                c.a(s1);
            }
        }
        g.setTransactionSuccessful();
        g.endTransaction();
        return true;
        s1;
        g.endTransaction();
        throw s1;
    }

    public final boolean a(String s1, List list)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        g.beginTransaction();
        Playlist playlist = k.h(s1);
        List list1 = k.e(s1);
        k.n(s1);
        k.o(s1);
        i.b(s1);
        if (!k.p(playlist.author))
        {
            i.c(playlist.author);
        }
        for (Iterator iterator = (new HashSet(list1)).iterator(); iterator.hasNext(); a((Video)iterator.next(), list)) { }
          goto _L1
_L3:
        L.a("Error deleting playlist", s1);
        g.endTransaction();
        return false;
_L1:
        try
        {
            String s2;
            for (list = list.iterator(); list.hasNext(); d.b(s2))
            {
                s2 = (String)list.next();
            }

            break MISSING_BLOCK_LABEL_187;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        finally
        {
            g.endTransaction();
            throw s1;
        }
        if (true) goto _L3; else goto _L2
_L2:
        if (d.a().size() == 0)
        {
            i.a();
        }
        d.d(s1);
        g.setTransactionSuccessful();
        g.endTransaction();
        return true;
    }

    public final boolean a(List list)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(list);
        if (list.isEmpty())
        {
            return true;
        }
        g.beginTransaction();
        try
        {
            SubtitleTrack subtitletrack;
            for (list = list.iterator(); list.hasNext(); l.a(subtitletrack))
            {
                subtitletrack = (SubtitleTrack)list.next();
            }

            break MISSING_BLOCK_LABEL_77;
        }
        // Misplaced declaration of an exception variable
        catch (List list) { }
        finally
        {
            g.endTransaction();
            throw list;
        }
        L.a("Error inserting subtitle tracks", list);
        g.endTransaction();
        return false;
        g.setTransactionSuccessful();
        g.endTransaction();
        return true;
    }

    public final VastAd b(String s1, String s2)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        com.google.android.apps.youtube.common.fromguava.c.a(s2);
        try
        {
            s2 = b.a(s1, s2);
        }
        // Misplaced declaration of an exception variable
        catch (String s2)
        {
            L.a((new StringBuilder("Error loading ad [originalVideoId=")).append(s1).append("]").toString(), s2);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s2)
        {
            L.a((new StringBuilder("Error loading ad [originalVideoId=")).append(s1).append("]").toString(), s2);
            return null;
        }
        return s2;
    }

    public final Video b(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        return k.f(s1);
    }

    public final List b()
    {
        return k.a();
    }

    public final void b(String s1, OfflineMediaStatus offlinemediastatus)
    {
        if (c.c(s1))
        {
            c.a(s1, offlinemediastatus);
        }
    }

    public final boolean b(String s1, String s2, VastAd vastad)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        com.google.android.apps.youtube.common.fromguava.c.a(s2);
        com.google.android.apps.youtube.common.fromguava.c.a(vastad);
        g.beginTransaction();
        boolean flag;
        if (!k.a(s1))
        {
            break MISSING_BLOCK_LABEL_48;
        }
        flag = a.b(s1);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        g.endTransaction();
        return false;
        b.b(s1, s2, vastad);
        g.setTransactionSuccessful();
        g.endTransaction();
        return true;
        s1;
        g.endTransaction();
        throw s1;
    }

    public final boolean b(String s1, List list)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        com.google.android.apps.youtube.common.fromguava.c.a(list);
        g.beginTransaction();
        boolean flag = k.a(s1);
        if (!flag)
        {
            g.endTransaction();
            return false;
        }
        a.a(s1, list);
        g.setTransactionSuccessful();
        g.endTransaction();
        return true;
        s1;
        g.endTransaction();
        throw s1;
    }

    public final List c()
    {
        return k.b();
    }

    public final List c(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        return k.e(s1);
    }

    public final boolean c(String s1, String s2)
    {
        return b.c(s1, s2);
    }

    public final Playlist d(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        return k.h(s1);
    }

    public final List d()
    {
        return d.a();
    }

    public final void d(String s1, String s2)
    {
        b.d(s1, s2);
    }

    public final int e(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        return k.g(s1);
    }

    public final List e()
    {
        return b.a();
    }

    public final void e(String s1, String s2)
    {
        b.e(s1, s2);
    }

    public final int f(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        return k.i(s1);
    }

    public final int f(String s1, String s2)
    {
        s1 = b.b(s1, s2);
        if (s1 == null)
        {
            return 0;
        } else
        {
            return ((g) (s1)).g;
        }
    }

    public final PlayerResponse g(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        s1 = d.a(s1);
        if (s1 != null)
        {
            return s1.b();
        } else
        {
            return null;
        }
    }

    public final x h(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        s1 = d.a(s1);
        if (s1 != null)
        {
            return s1.f();
        } else
        {
            return null;
        }
    }

    public final Playlist i(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        s1 = d.c(s1);
        if (s1 != null)
        {
            return s1.a();
        } else
        {
            return null;
        }
    }

    public final Set j(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        return d.h(s1);
    }

    public final v k(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        s1 = d.a(s1);
        if (s1 != null)
        {
            return s1.e();
        } else
        {
            return null;
        }
    }

    public final List l(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        s1 = k.j(s1);
        return d.a(s1);
    }

    public final List m(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        return l.a(s1);
    }

    public final boolean n(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        z z1 = d.a(s1);
        if (z1 == null || d.f(s1) || z1.c() == OfflineMediaStatus.DELETED)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        k.k(s1);
        d.e(s1);
        return true;
        s1;
        L.a("Error inserting existing video as single video", s1);
        return false;
    }

    public final boolean o(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        g.beginTransaction();
        Video video = k.f(s1);
        if (video == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        if (!k.d(s1))
        {
            break MISSING_BLOCK_LABEL_105;
        }
        k.l(s1);
_L1:
        if (!y(s1))
        {
            x(s1);
        }
        d.b(s1);
        if (d.a().size() == 0)
        {
            i.a();
        }
        g.setTransactionSuccessful();
        g.endTransaction();
        return true;
        a(video);
          goto _L1
        s1;
        L.a("Error deleting video", s1);
        g.endTransaction();
        return false;
        s1;
        g.endTransaction();
        throw s1;
    }

    public final boolean p(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        try
        {
            l.b(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            L.a("Error deleting subtitle tracks", s1);
            return false;
        }
        return true;
    }

    public final boolean q(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        return k.c(s1);
    }

    public final List r(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        List list;
        try
        {
            list = a.a(s1);
        }
        catch (JSONException jsonexception)
        {
            L.a((new StringBuilder("Error loading ad breaks [originalVideoId=")).append(s1).append("]").toString(), jsonexception);
            return null;
        }
        catch (IOException ioexception)
        {
            L.a((new StringBuilder("Error loading ad breaks [originalVideoId=")).append(s1).append("]").toString(), ioexception);
            return null;
        }
        return list;
    }

    public final void s(String s1)
    {
        c.e(s1);
    }

    public final void t(String s1)
    {
        c.f(s1);
    }

    public final int u(String s1)
    {
        s1 = c.d(s1);
        if (s1 == null)
        {
            return 0;
        } else
        {
            return ((e) (s1)).b;
        }
    }

    public final OfflineMediaStatus v(String s1)
    {
        s1 = c.d(s1);
        if (s1 == null)
        {
            return OfflineMediaStatus.DELETED;
        } else
        {
            return ((e) (s1)).c;
        }
    }

    public final void w(String s1)
    {
        g.beginTransaction();
        Iterator iterator = b.a(s1).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s2 = (String)iterator.next();
            if (b.b(s2) <= 1)
            {
                c.b(s2);
                com.google.android.apps.youtube.common.fromguava.c.a(s2);
                if (!k.a(s2))
                {
                    x(s2);
                }
            }
        } while (true);
        break MISSING_BLOCK_LABEL_94;
        s1;
        g.endTransaction();
        throw s1;
        b.c(s1);
        a.c(s1);
        g.setTransactionSuccessful();
        g.endTransaction();
        return;
    }
}
