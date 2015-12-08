// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.youtube.app.ac;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bp;
import com.google.android.apps.youtube.core.identity.a;
import com.google.android.apps.youtube.core.identity.aj;
import com.google.android.apps.youtube.core.identity.ak;
import com.google.android.apps.youtube.core.identity.b;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.player.overlay.SubtitlesPreferences;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitlesStyle;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.apps.ytremote.b.d;
import com.google.android.apps.ytremote.backend.a.e;
import com.google.android.apps.ytremote.backend.a.j;
import com.google.android.apps.ytremote.backend.browserchannel.k;
import com.google.android.apps.ytremote.backend.browserchannel.t;
import com.google.android.apps.ytremote.backend.model.DeviceType;
import com.google.android.apps.ytremote.backend.model.Method;
import com.google.android.apps.ytremote.backend.model.Params;
import com.google.android.apps.ytremote.model.AppStatus;
import com.google.android.apps.ytremote.model.ClientName;
import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.LoungeToken;
import com.google.android.apps.ytremote.model.ScreenId;
import com.google.android.apps.ytremote.model.SsdpId;
import com.google.android.apps.ytremote.model.YouTubeDevice;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            e, br, bo, bs, 
//            bu, at, bj, bn, 
//            bl, YouTubeTvScreen, bm, bq, 
//            as, bg

public final class bk extends com.google.android.apps.youtube.app.remote.e
    implements bp
{

    private static final JSONObject a = new JSONObject();
    private static final Pattern b = Pattern.compile(".*#dial$");
    private static final IntentFilter c;
    private static final IntentFilter d;
    private static final Map e;
    private static final Random f = new SecureRandom();
    private int A;
    private double B;
    private long C;
    private boolean D;
    private SubtitleTrack E;
    private final ak F;
    private final Executor G;
    private final b H;
    private final l I;
    private final com.google.android.apps.ytremote.logic.a J;
    private final Map K;
    private Set L;
    private boolean M;
    private final String N;
    private final ac O;
    private final boolean P;
    private final boolean Q;
    private final boolean R;
    private SubtitleTrack S;
    private final List T;
    private final boolean U;
    private String V;
    private final boolean W;
    private final Context g;
    private final k h;
    private final com.google.android.apps.ytremote.logic.d i;
    private final h j;
    private final bo k;
    private final e l;
    private final com.google.android.apps.ytremote.backend.logic.d m;
    private final Map n;
    private final Map o;
    private final SharedPreferences p;
    private boolean q;
    private RemoteControl.RemotePlayerState r;
    private boolean s;
    private YouTubeTvScreen t;
    private CloudScreen u;
    private String v;
    private String w;
    private final List x;
    private final Set y;
    private final Handler z;

    public bk(Context context, h h1, SharedPreferences sharedpreferences, ak ak1, l l1, b b1, Executor executor, 
            bc bc, boolean flag, boolean flag1, boolean flag2, boolean flag3, ac ac1, boolean flag4)
    {
        this(context, h1, sharedpreferences, ak1, l1, b1, executor, bc, flag, flag1, flag2, flag3, ac1, true, a(sharedpreferences, "remote_id"));
    }

    public bk(Context context, h h1, SharedPreferences sharedpreferences, ak ak1, l l1, b b1, Executor executor, 
            bc bc, boolean flag, boolean flag1, boolean flag2, boolean flag3, ac ac1, boolean flag4, 
            String s1)
    {
        super(context, l1, bc);
        A = 30;
        P = flag;
        Q = flag1;
        R = flag2;
        W = flag3;
        U = flag4;
        O = (ac)com.google.android.apps.youtube.common.fromguava.c.a(ac1);
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        p = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        F = ak1;
        I = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        H = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        G = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        N = (String)com.google.android.apps.youtube.common.fromguava.c.a(s1);
        g = context.getApplicationContext();
        j = h1;
        sharedpreferences = DeviceType.REMOTE_CONTROL;
        b1 = PackageUtil.f(context);
        ak1 = new br(this, (byte)0);
        l1 = (new StringBuilder()).append(Build.MANUFACTURER.toUpperCase()).append(" ").append(Build.MODEL).toString();
        executor = new StringBuilder("android-");
        if (com.google.android.apps.youtube.core.utils.l.a(context))
        {
            h1 = "tablet";
        } else
        {
            h1 = "phone";
        }
        h1 = executor.append(h1).append("-").append(b1).toString();
        b1 = new HashMap();
        b1.put("device", sharedpreferences.name());
        b1.put("id", s1);
        b1.put("name", l1);
        b1.put("app", h1);
        if (W)
        {
            b1.put("mdx-version", "3");
        }
        h = new k(context, new t(context, "www.youtube.com", 80, "/api/lounge/bc/", ak1, Collections.unmodifiableMap(b1)));
        i = new d(new com.google.android.apps.ytremote.backend.a.l());
        J = new com.google.android.apps.ytremote.b.c();
        n = new HashMap();
        o = new HashMap();
        l = new e();
        m = new j();
        k = new bo(this, (byte)0);
        x = new ArrayList();
        y = new HashSet();
        h1 = new HandlerThread(getClass().getName());
        h1.start();
        z = new bs(this, h1.getLooper(), (byte)0);
        r = RemoteControl.RemotePlayerState.UNCONFIRMED;
        K = new HashMap();
        context.registerReceiver(new bu(this, (byte)0), d);
        T = new ArrayList();
    }

    static String A(bk bk1)
    {
        return bk1.v;
    }

    static JSONObject A()
    {
        return a;
    }

    static SubtitleTrack B(bk bk1)
    {
        return bk1.S;
    }

    static Map B()
    {
        return e;
    }

    private String C()
    {
        StringBuilder stringbuilder = new StringBuilder("RQ");
        Object obj;
        if (u != null)
        {
            obj = u.getLoungeToken();
        } else
        {
            obj = "";
        }
        return stringbuilder.append(obj).toString();
    }

    static List C(bk bk1)
    {
        return bk1.x;
    }

    static int D(bk bk1)
    {
        return bk1.A;
    }

    private String D()
    {
label0:
        {
            com.google.android.apps.youtube.common.fromguava.c.b();
            if (!I.b())
            {
                return null;
            }
            Object obj;
            try
            {
                obj = (a)H.a(I).get();
                if (!((a) (obj)).a())
                {
                    break label0;
                }
                obj = ((a) (obj)).c();
            }
            catch (InterruptedException interruptedexception)
            {
                return null;
            }
            catch (ExecutionException executionexception)
            {
                return null;
            }
            return ((String) (obj));
        }
        return null;
    }

    static List E(bk bk1)
    {
        return bk1.T;
    }

    static boolean F(bk bk1)
    {
        return bk1.D;
    }

    static double G(bk bk1)
    {
        return bk1.B;
    }

    static h H(bk bk1)
    {
        return bk1.j;
    }

    static as a(bk bk1, int i1)
    {
        switch (i1)
        {
        default:
            return com.google.android.apps.youtube.app.remote.at.c;

        case 0: // '\0'
            return com.google.android.apps.youtube.app.remote.bj.b;

        case 1: // '\001'
            return com.google.android.apps.youtube.app.remote.bj.d;

        case 2: // '\002'
        case 3: // '\003'
            return com.google.android.apps.youtube.app.remote.bj.c;

        case 4: // '\004'
            return com.google.android.apps.youtube.app.remote.at.a;
        }
    }

    static SubtitleTrack a(bk bk1, SubtitleTrack subtitletrack)
    {
        bk1.E = subtitletrack;
        return subtitletrack;
    }

    static CloudScreen a(bk bk1, CloudScreen cloudscreen)
    {
        bk1.u = cloudscreen;
        return cloudscreen;
    }

    public static String a(SharedPreferences sharedpreferences, String s1)
    {
        if (sharedpreferences.contains(s1))
        {
            return sharedpreferences.getString(s1, "");
        } else
        {
            String s2 = (new BigInteger(130, f)).toString(32);
            sharedpreferences.edit().putString(s1, s2).apply();
            return s2;
        }
    }

    static String a(bk bk1)
    {
        return bk1.D();
    }

    static Set a(bk bk1, Set set)
    {
        bk1.L = set;
        return set;
    }

    private void a(double d1)
    {
        B = d1;
        C = SystemClock.elapsedRealtime();
    }

    static void a(bk bk1, double d1)
    {
        bk1.a(d1);
    }

    static void a(bk bk1, RemoteControl.RemotePlayerState remoteplayerstate)
    {
        com.google.android.apps.youtube.app.remote.bn.a[remoteplayerstate.ordinal()];
        JVM INSTR tableswitch 1 7: default 52
    //                   1 53
    //                   2 86
    //                   3 86
    //                   4 86
    //                   5 86
    //                   6 115
    //                   7 115;
           goto _L1 _L2 _L3 _L3 _L3 _L3 _L4 _L4
_L1:
        return;
_L2:
        if (bk1.r == RemoteControl.RemotePlayerState.ENDED)
        {
            bk1.B = 0.0D;
        }
        if (bk1.r != RemoteControl.RemotePlayerState.PLAYING)
        {
            bk1.C = SystemClock.elapsedRealtime();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (bk1.r == RemoteControl.RemotePlayerState.PLAYING)
        {
            bk1.B = bk1.B + (double)(SystemClock.elapsedRealtime() - bk1.C);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        bk1.B = 0.0D;
        return;
    }

    static void a(bk bk1, Method method, Params params)
    {
        bk1.a(method, params);
    }

    static void a(bk bk1, String s1)
    {
        bk1.e(s1);
    }

    private void a(Method method, Params params)
    {
        e((new StringBuilder("Sending ")).append(method).append(" : ").append(params).toString());
        h.a(method, params);
    }

    static boolean a(bk bk1, boolean flag)
    {
        bk1.D = false;
        return false;
    }

    static int b(bk bk1, int i1)
    {
        bk1.A = i1;
        return i1;
    }

    static Context b(bk bk1)
    {
        return bk1.g;
    }

    static RemoteControl.RemotePlayerState b(bk bk1, RemoteControl.RemotePlayerState remoteplayerstate)
    {
        bk1.r = remoteplayerstate;
        return remoteplayerstate;
    }

    static SubtitleTrack b(bk bk1, SubtitleTrack subtitletrack)
    {
        bk1.S = null;
        return null;
    }

    static String b(bk bk1, String s1)
    {
        bk1.w = s1;
        return s1;
    }

    static boolean b(bk bk1, boolean flag)
    {
        bk1.q = false;
        return false;
    }

    static CloudScreen c(bk bk1)
    {
        return bk1.u;
    }

    static String c(bk bk1, String s1)
    {
        bk1.v = s1;
        return s1;
    }

    static boolean c(bk bk1, boolean flag)
    {
        bk1.s = flag;
        return flag;
    }

    static k d(bk bk1)
    {
        return bk1.h;
    }

    static boolean d(bk bk1, boolean flag)
    {
        bk1.M = flag;
        return flag;
    }

    static com.google.android.apps.ytremote.logic.d e(bk bk1)
    {
        return bk1.i;
    }

    private void e(String s1)
    {
        if (P || "true".equalsIgnoreCase(O.a("enable_mdx_logs", "")))
        {
            Log.d("YouTube MDX", s1);
        }
    }

    static Map f(bk bk1)
    {
        return bk1.K;
    }

    static RemoteControl.RemotePlayerState g(bk bk1)
    {
        return bk1.r;
    }

    static void h(bk bk1)
    {
        bk1.a(Method.GET_NOW_PLAYING, Params.a);
    }

    static boolean i(bk bk1)
    {
        bk1.e((new StringBuilder("Connected remotes are ")).append(bk1.L).toString());
        for (Iterator iterator = bk1.L.iterator(); iterator.hasNext();)
        {
            Object obj = (com.google.android.apps.ytremote.backend.model.c)iterator.next();
            if (!((com.google.android.apps.ytremote.backend.model.c) (obj)).b.equals(bk1.N))
            {
                obj = ((com.google.android.apps.ytremote.backend.model.c) (obj)).b;
                if (!b.matcher(((CharSequence) (obj))).matches())
                {
                    return false;
                }
            }
        }

        return true;
    }

    static com.google.android.apps.ytremote.logic.a j(bk bk1)
    {
        return bk1.J;
    }

    static boolean k(bk bk1)
    {
        return bk1.q;
    }

    static bo l(bk bk1)
    {
        return bk1.k;
    }

    static Set m(bk bk1)
    {
        return bk1.y;
    }

    static boolean n(bk bk1)
    {
        return bk1.W;
    }

    static Map o(bk bk1)
    {
        return bk1.n;
    }

    static SharedPreferences p(bk bk1)
    {
        return bk1.p;
    }

    static com.google.android.apps.ytremote.backend.logic.d q(bk bk1)
    {
        return bk1.m;
    }

    static boolean r(bk bk1)
    {
        return bk1.U;
    }

    static Handler s(bk bk1)
    {
        return bk1.z;
    }

    static void t(bk bk1)
    {
        String s1;
label0:
        {
            if (bk1.U)
            {
                s1 = bk1.F.d();
                if (bk1.I.b() && s1 != null && bk1.b() == RemoteControl.State.CONNECTED)
                {
                    break label0;
                }
            }
            return;
        }
        bk1.G.execute(new bl(bk1, s1));
    }

    static Map u(bk bk1)
    {
        return bk1.o;
    }

    static boolean v(bk bk1)
    {
        return bk1.s;
    }

    static YouTubeTvScreen w(bk bk1)
    {
        return bk1.t;
    }

    static Set x(bk bk1)
    {
        return bk1.L;
    }

    static String y(bk bk1)
    {
        return bk1.w;
    }

    static IntentFilter z()
    {
        return c;
    }

    static SubtitleTrack z(bk bk1)
    {
        return bk1.E;
    }

    public final CloudScreen a(YouTubeDevice youtubedevice)
    {
label0:
        {
            if (n.containsKey(youtubedevice))
            {
                return (CloudScreen)n.get(youtubedevice);
            }
            Object obj;
            LoungeToken loungetoken;
            if (youtubedevice.hasAppStatus())
            {
                obj = youtubedevice.getAppStatus().getScreenId();
            } else
            {
                obj = null;
            }
            if (obj == null)
            {
                obj = youtubedevice.getSsdpId().toString();
                if (!p.contains(((String) (obj))))
                {
                    break label0;
                }
                obj = new ScreenId(p.getString(((String) (obj)), ""));
            }
            loungetoken = (LoungeToken)l.a(Arrays.asList(new ScreenId[] {
                obj
            })).get(obj);
            if (loungetoken == null)
            {
                com.google.android.apps.youtube.common.L.b((new StringBuilder("Unable to retrieve lounge token for screenId ")).append(obj).toString());
                return null;
            } else
            {
                obj = new CloudScreen(((ScreenId) (obj)), youtubedevice.getDeviceName(), null, loungetoken);
                n.put(youtubedevice, obj);
                return ((CloudScreen) (obj));
            }
        }
        return null;
    }

    protected final void a(RemoteControl.State state)
    {
        e((new StringBuilder("Remote control moved to state ")).append(state).toString());
        super.a(state);
    }

    public final void a(YouTubeTvScreen youtubetvscreen, String s1, long l1, String s2, int i1, SubtitleTrack subtitletrack)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(youtubetvscreen);
        if (TextUtils.isEmpty(s2))
        {
            s2 = C();
        }
        a(s1, s2);
        S = subtitletrack;
        if (b() == RemoteControl.State.CONNECTED && youtubetvscreen.equals(t))
        {
            if (!TextUtils.isEmpty(s1))
            {
                a(s1, s2, i1);
            }
            return;
        }
        t = youtubetvscreen;
        x.clear();
        a(RemoteControl.State.CONNECTING);
        L = new HashSet();
        if (l1 < 5000L)
        {
            l1 = 0L;
        }
        G.execute(new bm(this, youtubetvscreen, s1, l1, s2, i1));
    }

    protected final void a(as as)
    {
        e((new StringBuilder("Remote control moved to error state with error ")).append(as).toString());
        super.a(as);
    }

    protected final void a(String s1, String s2)
    {
        V = s2;
        v = s1;
        w = null;
        E = null;
        if (!TextUtils.isEmpty(s1))
        {
            r = RemoteControl.RemotePlayerState.UNCONFIRMED;
            a(r, v);
            z.sendMessageDelayed(Message.obtain(z, 2), 2000L);
        } else
        {
            r = RemoteControl.RemotePlayerState.UNSTARTED;
        }
        b(s1);
    }

    public final void a(String s1, String s2, int i1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        if (TextUtils.isEmpty(s2))
        {
            s2 = C();
        }
        if (b() != RemoteControl.State.ERROR) goto _L2; else goto _L1
_L1:
        a(t, s1, 0L, s2, i1, S);
_L4:
        return;
_L2:
        if (!W)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = V;
        boolean flag;
        if (s2 == null)
        {
            if (obj == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = s2.equals(obj);
        }
        if (!flag && !s1.equals(v))
        {
            obj = new Params();
            ((Params) (obj)).a("listId", s2);
            ((Params) (obj)).a("videoId", s1);
            ((Params) (obj)).a("currentTime", Long.toString(0L));
            ((Params) (obj)).a("currentIndex", Integer.toString(i1));
            a(Method.SET_PLAYLIST, ((Params) (obj)));
            a(s1, s2);
            return;
        }
        if (r != RemoteControl.RemotePlayerState.PLAYING)
        {
            a(Method.PLAY, Params.a);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!x.contains(s1))
        {
            s2 = new Params();
            s2.a("videoId", s1);
            s2.a("videoSources", "XX");
            a(Method.INSERT_VIDEO, ((Params) (s2)));
        }
        if (!s1.equals(v))
        {
            s2 = new Params();
            s2.a("videoId", s1);
            s2.a("currentTime", Long.toString(0L));
            a(Method.SET_VIDEO, ((Params) (s2)));
            a(s1, C());
            return;
        }
        if (r != RemoteControl.RemotePlayerState.PLAYING)
        {
            a(Method.PLAY, Params.a);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final void a(List list, int i1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(list);
        Params params;
        boolean flag;
        if (i1 >= 0 && i1 < list.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag);
        params = new Params();
        params.a("videoId", (String)list.get(i1));
        params.a("currentTime", Long.toString(0L));
        params.a("videoSources", "XX");
        params.a("videoIds", TextUtils.join(",", list));
        a(Method.SET_PLAYLIST, params);
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        RemoteControl.State state;
        RemoteControl.State state1;
        state = b();
        state1 = RemoteControl.State.OFFLINE;
        if (state != state1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Message message = Message.obtain(z, 4, new bq(t, flag));
        x.clear();
        M = false;
        s = false;
        t = null;
        u = null;
        y.clear();
        A = 30;
        T.clear();
        a(RemoteControl.State.OFFLINE);
        z.removeMessages(3);
        z.sendMessage(message);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean a(Video video)
    {
        boolean flag;
        if (video.privacy == com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy.PRIVATE || video.state == com.google.android.apps.youtube.datalib.model.gdata.Video.State.PRIVATE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag || Q)
        {
            if (video.state != com.google.android.apps.youtube.datalib.model.gdata.Video.State.NOT_AVAILABLE_ON_MOBILE)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && (!video.isLive() || R) && !video.adultContent && !y.contains(video.id) && (video.state == com.google.android.apps.youtube.datalib.model.gdata.Video.State.PLAYABLE || video.isLive() && video.state == com.google.android.apps.youtube.datalib.model.gdata.Video.State.PROCESSING))
            {
                return true;
            }
        }
        return false;
    }

    public final void b(int i1)
    {
        A = Math.min(100, Math.max(0, A + i1));
        Params params = new Params();
        params.a("delta", String.valueOf(i1));
        params.a("volume", String.valueOf(A));
        a(Method.SET_VOLUME, params);
        a(A);
        T.add(Integer.valueOf(A));
    }

    public final void b(SubtitleTrack subtitletrack)
    {
        Params params = new Params();
        params.a("format", String.valueOf(subtitletrack.format));
        params.a("kind", "");
        params.a("languageCode", subtitletrack.languageCode);
        params.a("languageName", subtitletrack.languageName);
        params.a("sourceLanguageCode", subtitletrack.sourceLanguageCode);
        params.a("trackName", subtitletrack.trackName);
        params.a("videoId", subtitletrack.videoId);
        subtitletrack = new SubtitlesPreferences(g, p);
        float f1 = subtitletrack.a();
        params.a("style", (new JSONObject(subtitletrack.b().getMdxFormat(f1))).toString());
        a(Method.SET_SUBTITLES_TRACK, params);
    }

    public final void b(List list)
    {
        Params params = new Params();
        params.a("videoIds", TextUtils.join(",", list));
        params.a("videoSources", "XX");
        a(Method.ADD_VIDEOS, params);
    }

    public final void c(int i1)
    {
        D = true;
        z.sendEmptyMessageDelayed(5, 2000L);
        Params params = new Params();
        params.a("newTime", String.valueOf(i1 / 1000));
        a(Method.SEEK_TO, params);
        a(i1);
    }

    public final void c(String s1)
    {
        Params params = new Params();
        params.a("videoId", s1);
        params.a("videoSources", "XX");
        a(Method.ADD_VIDEO, params);
    }

    protected final void d()
    {
label0:
        {
            z.removeMessages(1);
            if (b() == RemoteControl.State.SLEEP)
            {
                if (t != null)
                {
                    break label0;
                }
                com.google.android.apps.youtube.common.L.b("We should reconnect, but we lost the screen");
            }
            return;
        }
        a(RemoteControl.State.CONNECTING);
        if (!q)
        {
            g.registerReceiver(k, c);
        }
        z.sendEmptyMessage(7);
    }

    public final void d(int i1)
    {
        Params params = new Params();
        params.a("volume", String.valueOf(i1));
        A = i1;
        a(Method.SET_VOLUME, params);
        a(i1);
        T.add(Integer.valueOf(i1));
    }

    public final void d(String s1)
    {
        Params params = new Params();
        params.a("videoId", s1);
        a(Method.REMOVE_VIDEO, params);
    }

    public final void e()
    {
        a(Method.PLAY, Params.a);
    }

    public final void f()
    {
        a(Method.PAUSE, Params.a);
    }

    public final void g()
    {
        a(((String) (null)), ((String) (null)));
        a(((String) (null)));
        a(Method.STOP, Params.a);
    }

    public final boolean h()
    {
        while (TextUtils.isEmpty(v) || x.indexOf(v) <= 0) 
        {
            return false;
        }
        return true;
    }

    public final void i()
    {
        if (!h())
        {
            return;
        } else
        {
            String s1 = (String)x.get(x.indexOf(v) - 1);
            a(s1, V);
            Params params = new Params();
            params.a("videoId", s1);
            params.a("currentTime", "0");
            a(Method.SET_VIDEO, params);
            return;
        }
    }

    public final String j()
    {
        if (!h())
        {
            return null;
        } else
        {
            return (String)x.get(x.indexOf(v) - 1);
        }
    }

    public final boolean k()
    {
        while (TextUtils.isEmpty(v) || x.indexOf(v) >= x.size() - 1) 
        {
            return false;
        }
        return true;
    }

    public final String l()
    {
        if (!k())
        {
            return null;
        } else
        {
            return (String)x.get(x.indexOf(v) + 1);
        }
    }

    public final void m()
    {
        if (!k())
        {
            return;
        } else
        {
            String s1 = (String)x.get(x.indexOf(w) + 1);
            a(s1, V);
            Params params = new Params();
            params.a("videoId", s1);
            params.a("currentTime", "0");
            a(Method.SET_VIDEO, params);
            return;
        }
    }

    public final RemoteControl.RemotePlayerState n()
    {
        return r;
    }

    public final volatile bg o()
    {
        return t;
    }

    public final void onSignOut(aj aj)
    {
        if (b() == RemoteControl.State.CONNECTED && U)
        {
            a(Method.UPDATE_USERNAME, Params.a);
        }
    }

    public final String p()
    {
        return v;
    }

    public final int q()
    {
        return x.indexOf(v);
    }

    public final String r()
    {
        if (u != null && u.getLoungeToken() != null)
        {
            return (new StringBuilder("RQ")).append(u.getLoungeToken()).toString();
        } else
        {
            return null;
        }
    }

    public final int s()
    {
        return A;
    }

    public final double t()
    {
        double d1 = B;
        long l1;
        if (r == RemoteControl.RemotePlayerState.PLAYING)
        {
            l1 = SystemClock.elapsedRealtime() - C;
        } else
        {
            l1 = 0L;
        }
        return (double)l1 + d1;
    }

    public final List u()
    {
        return x;
    }

    public final boolean v()
    {
        return M;
    }

    public final SubtitleTrack w()
    {
        return E;
    }

    public final YouTubeTvScreen x()
    {
        return t;
    }

    public final String y()
    {
        if (t != null && t.getScreen() != null)
        {
            ClientName clientname = (ClientName)o.get(t.getScreen().getScreenId());
            if (clientname != null)
            {
                return clientname.toString();
            } else
            {
                return t.getScreen().getClientName().toString();
            }
        } else
        {
            return null;
        }
    }

    static 
    {
        c = new IntentFilter();
        d = new IntentFilter();
        c.addAction(com.google.android.apps.ytremote.intent.Intents.IntentAction.LOUNGE_SERVER_CONNECTION_ERROR.toString());
        c.addAction(com.google.android.apps.ytremote.intent.Intents.IntentAction.CLOUD_SERVICE_NO_NETWORK.toString());
        c.addAction(com.google.android.apps.ytremote.intent.Intents.IntentAction.CLOUD_SERVICE_IPV6_ERROR.toString());
        d.addAction("android.intent.action.SCREEN_OFF");
        d.addAction("android.intent.action.SCREEN_ON");
        HashMap hashmap = new HashMap();
        hashmap.put("LOUNGE_SCREEN", DeviceType.LOUNGE_SCREEN);
        hashmap.put("REMOTE_CONTROL", DeviceType.REMOTE_CONTROL);
        e = Collections.unmodifiableMap(hashmap);
    }
}
