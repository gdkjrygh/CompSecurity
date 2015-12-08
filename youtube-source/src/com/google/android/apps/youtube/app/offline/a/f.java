// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.a;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.offline.OfflineStreamQuality;
import com.google.android.apps.youtube.app.offline.p;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.ce;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.offline.store.i;
import com.google.android.apps.youtube.core.player.a.l;
import com.google.android.apps.youtube.core.transfer.h;
import com.google.android.apps.youtube.core.transfer.k;
import com.google.android.apps.youtube.core.utils.w;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.legacy.model.OfflineMediaStatus;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.s;
import com.google.android.apps.youtube.datalib.legacy.model.u;
import com.google.android.apps.youtube.datalib.legacy.model.v;
import com.google.android.apps.youtube.datalib.legacy.model.x;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.youtube.app.offline.a:
//            x, af, p, c, 
//            e, w, i, q, 
//            ag, t, g, k, 
//            j, u, l, m, 
//            o, n, h, aa, 
//            ab, ae, ac, ad, 
//            r, v, s

public final class f
    implements OfflineStoreInterface
{

    private final ax a;
    private final com.google.android.apps.youtube.app.offline.c b;
    private final Executor c;
    private final a d;
    private final l e;
    private final String f;
    private final Account g;
    private final b h;
    private final p i;
    private final w j;
    private final com.google.android.apps.youtube.app.offline.a.x k = new com.google.android.apps.youtube.app.offline.a.x(this, (byte)0);
    private final i l;
    private final com.google.android.apps.youtube.core.offline.store.l m;
    private com.google.android.apps.youtube.app.offline.a.c n;
    private HandlerThread o;
    private Handler p;
    private com.google.android.exoplayer.upstream.cache.a q;
    private com.google.android.exoplayer.upstream.cache.a r;
    private e s;
    private final af t = new af(this, (byte)0);
    private final HashMap u = new HashMap();

    public f(ax ax1, a a1, l l1, ce ce, w w1, p p1, String s1, 
            Account account)
    {
        a = (ax)com.google.android.apps.youtube.common.fromguava.c.a(ax1);
        d = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        e = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        com.google.android.apps.youtube.common.fromguava.c.a(ce);
        f = com.google.android.apps.youtube.common.fromguava.c.a(s1);
        j = (w)com.google.android.apps.youtube.common.fromguava.c.a(w1);
        i = (p)com.google.android.apps.youtube.common.fromguava.c.a(p1);
        g = (Account)com.google.android.apps.youtube.common.fromguava.c.a(account);
        c = ax1.aJ();
        h = ax1.aG();
        b = new com.google.android.apps.youtube.app.offline.c(ax1.af(), a1, ax1.aw());
        m = new com.google.android.apps.youtube.core.offline.store.l(ax1.af(), s1, ax1.aw(), ce);
        l = new i(ax1.af(), TextUtils.join(".", new String[] {
            "offline", s1, "db"
        }), m, new com.google.android.apps.youtube.app.offline.a.p(this, (byte)0));
        l.a();
        n = new com.google.android.apps.youtube.app.offline.a.c(ax1.ag(), l, h);
        o = new HandlerThread(getClass().getName());
        o.start();
        s = new e(ax1.af(), m, ax1.f(), ce, this);
        p = new Handler(o.getLooper(), s);
    }

    private PlayerResponse A(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        Object obj = a(s1);
        if (obj == null)
        {
            throw new com.google.android.apps.youtube.core.offline.exception.OfflinePlaybackException.OfflineNoMediaException();
        }
        if (((x) (obj)).p())
        {
            throw new com.google.android.apps.youtube.core.offline.exception.OfflinePlaybackException.OfflineMediaUnplayableException();
        }
        if (((x) (obj)).r())
        {
            if (((x) (obj)).f().f())
            {
                throw new com.google.android.apps.youtube.core.offline.exception.OfflinePolicyException.OfflineVideoExpiredPolicyException();
            } else
            {
                throw new com.google.android.apps.youtube.core.offline.exception.OfflinePolicyException.OfflineVideoDisabledPolicyException();
            }
        }
        if (!((x) (obj)).n())
        {
            throw new com.google.android.apps.youtube.core.offline.exception.OfflinePlaybackException.OfflineMediaIncompleteException();
        }
        PlayerResponse playerresponse = l.g(s1);
        obj = playerresponse;
        if (playerresponse != null)
        {
            obj = playerresponse;
            if (playerresponse.getVideoStreamingData() != null)
            {
                s1 = l.a(s1, new com.google.android.apps.youtube.app.offline.a.w(this, h.b() + 0x112a880L, (byte)0));
                obj = playerresponse;
                if (!s1.e())
                {
                    try
                    {
                        obj = playerresponse.cloneAndMergeOfflineStreams(s1.c(), s1.d(), h.b(), TimeUnit.SECONDS.convert(0x112a880L, TimeUnit.MILLISECONDS));
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s1)
                    {
                        return playerresponse;
                    }
                }
            }
        }
        return ((PlayerResponse) (obj));
    }

    private String B(String s1)
    {
        return String.format(Locale.US, "%s:%s:ad", new Object[] {
            f, s1
        });
    }

    private String C(String s1)
    {
        return String.format(Locale.US, "%s:%s", new Object[] {
            f, s1
        });
    }

    static i a(f f1)
    {
        return f1.l;
    }

    static String a(f f1, String s1)
    {
        return f1.C(s1);
    }

    private static void a(Account account)
    {
        ContentResolver.setIsSyncable(account, "com.google.android.youtube.provider", 1);
        ContentResolver.setSyncAutomatically(account, "com.google.android.youtube.provider", true);
    }

    private static void a(Account account, long l1)
    {
        ContentResolver.addPeriodicSync(account, "com.google.android.youtube.provider", new Bundle(), l1);
    }

    private void a(String s1, com.google.android.apps.youtube.datalib.model.transfer.a a1)
    {
        ((k)j.a()).a(f, s1, "fake_source", a1);
    }

    static l b(f f1)
    {
        return f1.e;
    }

    static String b(f f1, String s1)
    {
        return f1.B(s1);
    }

    private static void b(Account account)
    {
        ContentResolver.setIsSyncable(account, "com.google.android.youtube.provider", 0);
        ContentResolver.setSyncAutomatically(account, "com.google.android.youtube.provider", false);
        ContentResolver.removePeriodicSync(account, "com.google.android.youtube.provider", new Bundle());
    }

    static Handler c(f f1)
    {
        return f1.p;
    }

    static af d(f f1)
    {
        return f1.t;
    }

    static Executor e(f f1)
    {
        return f1.c;
    }

    static com.google.android.apps.youtube.app.offline.c f(f f1)
    {
        return f1.b;
    }

    static com.google.android.apps.youtube.core.offline.store.l g(f f1)
    {
        return f1.m;
    }

    static HashMap h(f f1)
    {
        return f1.u;
    }

    static com.google.android.exoplayer.upstream.cache.a i(f f1)
    {
        return f1.q;
    }

    static com.google.android.exoplayer.upstream.cache.a j(f f1)
    {
        return f1.r;
    }

    static ax k(f f1)
    {
        return f1.a;
    }

    public final com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult a(String s1, com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format.Type type)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        com.google.android.apps.youtube.common.fromguava.c.a(type);
        x x1 = a(s1);
        if (x1 != null)
        {
            if (x1.t() && (x1.u() || x1.q()))
            {
                p.sendMessage(p.obtainMessage(6, s1));
                return com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult.ADDING;
            }
            if (!x1.d())
            {
                p.sendMessage(p.obtainMessage(3, s1));
                return com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult.ADDING;
            } else
            {
                return com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult.ALREADY_ADDED;
            }
        } else
        {
            p.sendMessage(p.obtainMessage(2, new Pair(s1, OfflineStreamQuality.getOfflineStreamQualityForFormatType(type))));
            return com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult.ADDING;
        }
    }

    public final com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult a(String s1, String s2)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s2);
        if (s1 != null)
        {
            if (l.i(s1) == null || !l.a(s2, s1))
            {
                return com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult.CANNOT_ADD;
            }
            s1 = a(s2);
            if (s1 == null || s1.t() && (s1.u() || s1.q()))
            {
                p.sendMessage(p.obtainMessage(6, s2));
                return com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult.ADDING;
            } else
            {
                return com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult.ALREADY_ADDED;
            }
        } else
        {
            return a(s2, i.c().getFormatType());
        }
    }

    public final x a(String s1)
    {
        return l.h(s1);
    }

    public final void a()
    {
        q = a.bn();
        r = a.bo();
        l.a(new com.google.android.exoplayer.upstream.cache.a[] {
            q, r
        });
        e.a(q, r);
        if (g != null)
        {
            L.e("PUDL account found, making it syncable");
            long l1 = i();
            if (l1 > 0L)
            {
                a(g);
                a(g, l1);
            }
        }
    }

    public final void a(long l1)
    {
        String s1;
        boolean flag;
        if (l1 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag);
        if (l1 > 0L)
        {
            if (i() == 0L)
            {
                a(g);
            }
            a(g, l1);
        } else
        {
            b(g);
        }
        s1 = String.format("offline_resync_interval_%s", new Object[] {
            f
        });
        a.aP().edit().putLong(s1, l1).apply();
    }

    public final void a(com.google.android.apps.youtube.common.a.b b1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(b1);
        c.execute(new com.google.android.apps.youtube.app.offline.a.i(this, b1));
    }

    final void a(Playlist playlist, Collection collection)
    {
        collection = com.google.android.apps.youtube.app.offline.a.af.a(t, playlist, collection);
        if (collection != null)
        {
            L.d((new StringBuilder("pudl event playlist ")).append(playlist.id).append(" add").toString());
            d.c(new q(com.google.android.apps.youtube.app.offline.a.ag.a(collection), (byte)0));
            if (com.google.android.apps.youtube.app.offline.a.ag.b(collection) == 0)
            {
                com.google.android.apps.youtube.app.offline.a.af.b(t, playlist.id);
                return;
            }
        }
    }

    final void a(s s1)
    {
        a(s1, 1);
    }

    final void a(s s1, int i1)
    {
        L.d((new StringBuilder("pudl event playlist ")).append(s1.a()).append(" progress: ").append(s1.c()).append("/").append(s1.d()).toString());
        if (i1 == 0)
        {
            return;
        }
        a a1 = d;
        boolean flag;
        if (i1 == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a1.c(new t(s1, flag, (byte)0));
    }

    final void a(x x1)
    {
        x1 = x1.f();
        if (x1 != null)
        {
            long l1 = Math.max(x1.h() - System.currentTimeMillis(), 0L);
            p.sendMessageDelayed(p.obtainMessage(8, x1.a()), l1 + 500L);
        }
    }

    public final void a(String s1, long l1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        c.execute(new g(this, s1, l1));
    }

    final void a(String s1, OfflineStreamQuality offlinestreamquality)
    {
        s1 = n.a(s1);
        if (s1 != null)
        {
            com.google.android.apps.youtube.common.fromguava.c.a(offlinestreamquality);
            com.google.android.apps.youtube.datalib.model.transfer.a a1 = new com.google.android.apps.youtube.datalib.model.transfer.a();
            a1.a("stream_quality", offlinestreamquality.getQualityValue());
            a1.a("video_id", s1);
            a1.a("ad", true);
            a(B(s1), a1);
        }
    }

    public final void a(String s1, com.google.android.apps.youtube.common.a.b b1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        c.execute(new com.google.android.apps.youtube.app.offline.a.k(this, b1, s1));
    }

    final void a(String s1, String s2, OfflineStreamQuality offlinestreamquality)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(offlinestreamquality);
        com.google.android.apps.youtube.datalib.model.transfer.a a1 = new com.google.android.apps.youtube.datalib.model.transfer.a();
        a1.a("stream_quality", offlinestreamquality.getQualityValue());
        a1.a("video_id", s2);
        if (s1 != null)
        {
            a1.a("playlist_id", s1);
        }
        a(C(s2), a1);
    }

    public final void a(Collection collection)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        String s1;
        for (collection = collection.iterator(); collection.hasNext(); a(s1, OfflineStreamQuality.getOfflineStreamQualityForQualityValue(l.e(s1))))
        {
            s1 = (String)collection.next();
            l.w(s1);
        }

    }

    public final boolean a(Playlist playlist)
    {
        s s1 = b(playlist.id);
        if (s1 == null || !s1.a(playlist))
        {
            return false;
        } else
        {
            p.sendMessage(p.obtainMessage(10, playlist.id));
            return true;
        }
    }

    public final boolean a(v v1)
    {
        boolean flag = false;
        com.google.android.apps.youtube.common.fromguava.c.b();
        String s1 = v1.a();
        PlayerResponse playerresponse = l.g(s1);
        if (playerresponse != null)
        {
            boolean flag1;
            try
            {
                playerresponse = playerresponse.cloneAndReplaceOfflineState(v1.b());
            }
            // Misplaced declaration of an exception variable
            catch (v v1)
            {
                return false;
            }
            flag1 = l.a(s1, playerresponse, v1.d());
            flag = flag1;
            if (flag1)
            {
                u(v1.a());
                flag = flag1;
            }
        }
        return flag;
    }

    public final com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult b(String s1, com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format.Type type)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        com.google.android.apps.youtube.common.fromguava.c.a(type);
        if (l.i(s1) != null)
        {
            return com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult.ALREADY_ADDED;
        } else
        {
            p.sendMessage(p.obtainMessage(9, new Pair(s1, OfflineStreamQuality.getOfflineStreamQualityForFormatType(type))));
            return com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult.ADDING;
        }
    }

    public final VastAd b(String s1, String s2)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        return l.b((String)com.google.android.apps.youtube.common.fromguava.c.a(s1), (String)com.google.android.apps.youtube.common.fromguava.c.a(s2));
    }

    public final s b(String s1)
    {
        ag ag1 = com.google.android.apps.youtube.app.offline.a.af.a(t, s1);
        if (ag1 != null)
        {
            return com.google.android.apps.youtube.app.offline.a.ag.a(ag1);
        }
        HashMap hashmap = u;
        hashmap;
        JVM INSTR monitorenter ;
        s s3 = (s)u.get(s1);
        s s2;
        s2 = s3;
        if (s3 != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        Playlist playlist = l.i(s1);
        s2 = s3;
        if (playlist == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        s2 = new s(playlist);
        u.put(s1, s2);
        hashmap;
        JVM INSTR monitorexit ;
        return s2;
        s1;
        throw s1;
    }

    public final u b(String s1, long l1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        return l.a(s1, new com.google.android.apps.youtube.app.offline.a.w(this, l1, (byte)0));
    }

    public final void b()
    {
        L.e((new StringBuilder("PUDL account close: ")).append(f).toString());
        if (o != null)
        {
            o.quit();
            o = null;
        }
        if (g != null)
        {
            L.e("Offline Found account, making it non-syncable");
            b(g);
        }
    }

    public final void b(com.google.android.apps.youtube.common.a.b b1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(b1);
        c.execute(new j(this, b1));
    }

    final void b(Playlist playlist, Collection collection)
    {
        collection = com.google.android.apps.youtube.app.offline.a.af.a(t, playlist, collection);
        if (collection != null)
        {
            L.d((new StringBuilder("pudl event playlist ")).append(playlist.id).append(" sync").toString());
            d.c(new com.google.android.apps.youtube.app.offline.a.u(com.google.android.apps.youtube.app.offline.a.ag.a(collection), (byte)0));
            if (com.google.android.apps.youtube.app.offline.a.ag.b(collection) == 0)
            {
                com.google.android.apps.youtube.app.offline.a.af.b(t, playlist.id);
                return;
            }
        }
    }

    public final void b(String s1, com.google.android.apps.youtube.common.a.b b1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        com.google.android.apps.youtube.common.fromguava.c.a(b1);
        c.execute(new com.google.android.apps.youtube.app.offline.a.l(this, s1, b1));
    }

    public final h c()
    {
        return k;
    }

    public final v c(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        return l.k(s1);
    }

    public final void c(String s1, com.google.android.apps.youtube.common.a.b b1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        com.google.android.apps.youtube.common.fromguava.c.a(b1);
        c.execute(new m(this, s1, b1));
    }

    public final void c(String s1, String s2)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        com.google.android.apps.youtube.common.fromguava.c.a(s2);
        c.execute(new o(this, s1, s2));
    }

    public final int d(String s1, String s2)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        com.google.android.apps.youtube.common.fromguava.c.a(s2);
        return l.f(s1, s2);
    }

    public final i d()
    {
        return l;
    }

    public final List d(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        return l.l(s1);
    }

    public final Collection e()
    {
        return l.d();
    }

    public final void e(String s1)
    {
        x x1 = l.h(s1);
        if (x1 == null || !x1.k())
        {
            return;
        } else
        {
            p.sendMessage(p.obtainMessage(4, s1));
            return;
        }
    }

    public final void f()
    {
        p.sendEmptyMessage(12);
    }

    public final void f(String s1)
    {
        x x1 = l.h(s1);
        if (x1 == null || !x1.m())
        {
            return;
        } else
        {
            p.sendMessage(p.obtainMessage(5, s1));
            return;
        }
    }

    public final Map g()
    {
        return n.a();
    }

    public final void g(String s1)
    {
        p.sendMessage(p.obtainMessage(7, s1));
    }

    final void h()
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        if (f.equals(((k)j.a()).c())) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Iterator iterator1 = ((k)j.a()).a().values().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            Transfer transfer = (Transfer)iterator1.next();
            String s1 = com.google.android.apps.youtube.core.utils.p.c(transfer);
            if (!l.a(s1, null).e() || !l.a(s1, transfer) || !transfer.a())
            {
                continue;
            }
            u(s1);
            Iterator iterator2 = l.j(s1).iterator();
label0:
            do
            {
label1:
                {
                    if (!iterator2.hasNext())
                    {
                        break label0;
                    }
                    String s2 = (String)iterator2.next();
                    Object obj = com.google.android.apps.youtube.app.offline.a.af.a(t, s2);
                    if (obj == null)
                    {
                        obj = l.i(s2);
                        if (obj == null)
                        {
                            break label1;
                        }
                        obj = com.google.android.apps.youtube.app.offline.a.af.a(t, ((Playlist) (obj)), null);
                    }
                    com.google.android.apps.youtube.app.offline.a.ag.a(((ag) (obj)), s1);
                    continue;
                }
                L.b("pudl transfer playlist not in database");
            } while (true);
        } while (true);
        com.google.android.apps.youtube.app.offline.a.af.a(t);
        Iterator iterator = l.d().iterator();
        while (iterator.hasNext()) 
        {
            x x1 = (x)iterator.next();
            if (x1.v())
            {
                a(x1);
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void h(String s1)
    {
        p.sendMessage(p.obtainMessage(11, s1));
    }

    public final long i()
    {
        String s1 = String.format("offline_resync_interval_%s", new Object[] {
            f
        });
        return a.aP().getLong(s1, 0L);
    }

    public final Pair i(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        com.google.android.apps.youtube.common.fromguava.c.b();
        Playlist playlist = l.d(s1);
        if (playlist != null)
        {
            if ((s1 = l.c(s1)) != null)
            {
                return new Pair(playlist, s1);
            }
        }
        return null;
    }

    public final Video j(String s1)
    {
        return l.b(s1);
    }

    public final PlaybackPair k(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        PlayerResponse playerresponse = A(s1);
        s1 = l.b(s1);
        if (s1 != null && playerresponse != null)
        {
            return new PlaybackPair(playerresponse, s1);
        } else
        {
            return null;
        }
    }

    public final List l(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        return l.r((String)com.google.android.apps.youtube.common.fromguava.c.a(s1));
    }

    public final void m(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        c.execute(new n(this, s1));
    }

    public final void n(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        c.execute(new com.google.android.apps.youtube.app.offline.a.h(this, s1));
    }

    public final int o(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        return l.u(s1);
    }

    public final OfflineMediaStatus p(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        return l.v(s1);
    }

    final void q(String s1)
    {
        ((k)j.a()).a(C(s1), 128);
    }

    final void r(String s1)
    {
        ((k)j.a()).a(s1);
    }

    final void s(String s1)
    {
        x x1 = a(s1);
        L.d((new StringBuilder("pudl event ")).append(s1).append(" add: ").append(x1.h()).toString());
        a(x1);
        d.c(new aa(x1, (byte)0));
    }

    final void t(String s1)
    {
        L.d((new StringBuilder("pudl event ")).append(s1).append(" add_failed").toString());
        d.c(new ab(s1, (byte)0));
    }

    final void u(String s1)
    {
        x x1 = a(s1);
        if (x1 != null)
        {
            L.d((new StringBuilder("pudl event ")).append(s1).append(" status: ").append(x1.h()).append(", ").append(x1.i()).append("/").append(x1.j()).toString());
            boolean flag;
            if (!x1.d() || x1.n())
            {
                flag = false;
            } else
            if (!x1.t() && !((k)j.a()).d().contains(C(s1)))
            {
                flag = false;
            } else
            {
                flag = true;
            }
            d.c(new ae(x1, flag, (byte)0));
        }
    }

    final void v(String s1)
    {
        x x1 = a(s1);
        if (x1 != null)
        {
            L.d((new StringBuilder("pudl event ")).append(s1).append(" complete: ").append(a(s1).h()).toString());
            d.c(new ac(x1, (byte)0));
        }
    }

    final void w(String s1)
    {
        L.d((new StringBuilder("pudl event ")).append(s1).append(" delete").toString());
        d.c(new ad(s1, (byte)0));
    }

    final void x(String s1)
    {
        L.d((new StringBuilder("pudl event playlist ")).append(s1).append(" add_failed").toString());
        d.c(new r(s1, (byte)0));
    }

    final void y(String s1)
    {
        L.d((new StringBuilder("pudl event playlist ")).append(s1).append(" sync_failed").toString());
        d.c(new com.google.android.apps.youtube.app.offline.a.v(s1, (byte)0));
    }

    final void z(String s1)
    {
        L.d((new StringBuilder("pudl event playlist ")).append(s1).append(" delete").toString());
        d.c(new com.google.android.apps.youtube.app.offline.a.s(s1, (byte)0));
    }
}
