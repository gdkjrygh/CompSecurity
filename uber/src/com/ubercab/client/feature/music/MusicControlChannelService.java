// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import bkd;
import bkg;
import cev;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.model.Track;
import com.ubercab.core.app.CoreService;
import czh;
import czj;
import dbf;
import egr;
import egs;
import eif;
import eih;
import ejp;
import ejq;
import ejw;
import ejx;
import eka;
import eki;
import ekj;
import gmg;
import java.util.concurrent.atomic.AtomicReference;

public class MusicControlChannelService extends CoreService
    implements czh, ejq
{

    private static final String d[] = {
        "client-dPlaying", "client-dState", "client-dStateAck", "client-dTrack"
    };
    private static final AtomicReference e = new AtomicReference();
    private static final AtomicReference f = new AtomicReference();
    public cev a;
    public gmg b;
    public ejp c;
    private Integer g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private String l;
    private String m;
    private czh n;

    public MusicControlChannelService()
    {
    }

    public static Intent a(Application application)
    {
        String s = com/ubercab/client/feature/music/MusicControlChannelService.getName();
        return (new Intent(application, com/ubercab/client/feature/music/MusicControlChannelService)).setComponent(new ComponentName(application.getPackageName(), s));
    }

    public static Intent a(Application application, String s)
    {
        return a(application).putExtra("tripId", s);
    }

    public static Intent a(Application application, String s, String s1, String s2)
    {
        return a(application).putExtra("access_token", s).putExtra("provider_id", s2).putExtra("tripId", s1);
    }

    private void a(bkg bkg1)
    {
        bkd bkd1 = bkg1.a("nextAvailable");
        if (bkd1 != null && !bkd1.j())
        {
            h = bkd1.f();
        }
        bkg1 = bkg1.a("previousAvailable");
        if (bkg1 != null && !bkg1.j())
        {
            j = bkg1.f();
        }
    }

    private void a(eif eif1)
    {
        eif1.a(this);
    }

    private void a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        }
        if (c.a())
        {
            a();
            return;
        } else
        {
            s = String.format("private-trip-%s", new Object[] {
                s
            });
            c.a(s, this, d);
            return;
        }
    }

    private void a(String s, Track track)
    {
        l = s;
        g = Integer.valueOf(track.getIndexInPlaylist());
        m = track.getName();
        s = new bkg();
        s.a("value", l);
        s.a("index", g);
        b("client-rPlayURI", s);
    }

    private void a(String s, String s1)
    {
        l = s;
        m = s1;
        s = new bkg();
        s.a("value", l);
        b("client-rPlayURI", s);
    }

    private static void a(AtomicReference atomicreference, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            atomicreference.set(s);
            return;
        }
    }

    private void a(boolean flag)
    {
        bkg bkg1 = new bkg();
        bkg1.a("value", Boolean.valueOf(flag));
        b("client-rSetPlaying", bkg1);
    }

    private eif b()
    {
        return egr.a().a(eih.a()).a(((RiderApplication)getApplication()).b()).a();
    }

    private static String b(bkg bkg1)
    {
        if (bkg1 != null)
        {
            if ((bkg1 = bkg1.a("name")) != null && !bkg1.j())
            {
                return bkg1.b();
            }
        }
        return null;
    }

    private void b(String s, bkg bkg1)
    {
        c.a(s, bkg1);
    }

    private void d()
    {
        if (c.a() && c.b())
        {
            c.c();
        }
    }

    private void e()
    {
        b("client-rNext", null);
    }

    private void f()
    {
        b("client-rPrev", null);
    }

    private boolean g()
    {
        bkg bkg1;
        boolean flag;
        if (!k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = flag;
        bkg1 = new bkg();
        bkg1.a("value", Boolean.valueOf(k));
        b("client-rSetShuffle", bkg1);
        return k;
    }

    public final void a()
    {
        bkg bkg1 = new bkg();
        if (!TextUtils.isEmpty((CharSequence)f.get()) && !TextUtils.isEmpty((CharSequence)e.get()))
        {
            bkg1.a("token", (String)f.get());
            bkg1.a("providerID", (String)e.get());
        }
        if (!TextUtils.isEmpty(l))
        {
            bkg1.a("playbackURI", l);
        }
        if (g != null)
        {
            bkg1.a("playbackIndex", g);
        }
        b("client-rState", bkg1);
    }

    public final volatile void a(czj czj)
    {
        a((eif)czj);
    }

    public final void a(String s, bkg bkg1)
    {
        byte byte0;
        boolean flag;
        boolean flag2;
        flag2 = true;
        flag = true;
        if (bkg1 == null)
        {
            return;
        }
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 4: default 60
    //                   -1313268017: 132
    //                   -1312404599: 118
    //                   -710329542: 146
    //                   2073400044: 104;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        byte0;
        JVM INSTR tableswitch 0 3: default 92
    //                   0 160
    //                   1 205
    //                   2 227
    //                   3 317;
           goto _L6 _L7 _L8 _L9 _L10
_L6:
        a.c(produceMusicUpdateEvent());
        return;
_L5:
        if (s.equals("client-dPlaying"))
        {
            byte0 = 0;
        }
          goto _L1
_L3:
        if (s.equals("client-dTrack"))
        {
            byte0 = 1;
        }
          goto _L1
_L2:
        if (s.equals("client-dState"))
        {
            byte0 = 2;
        }
          goto _L1
_L4:
        if (s.equals("client-dStateAck"))
        {
            byte0 = 3;
        }
          goto _L1
_L7:
        s = bkg1.a("value");
        if (s == null || s.j() || !s.f())
        {
            flag = false;
        }
        i = flag;
        a(bkg1);
          goto _L6
_L8:
        m = b(bkg1.b("track"));
        a(bkg1);
          goto _L6
_L9:
        s = new bkg();
        s.a("token", (String)f.get());
        s.a("providerID", (String)e.get());
        if (!TextUtils.isEmpty(l))
        {
            s.a("playbackURI", l);
        }
        if (g != null)
        {
            s.a("playbackIndex", g);
        }
        b("client-rStateAck", s);
          goto _L6
_L10:
        s = bkg1.b("currentTrack");
        boolean flag1;
        if (s != null)
        {
            s = s.b("track");
        } else
        {
            s = null;
        }
        m = b(s);
        s = bkg1.a("playing");
        if (s != null && !s.j() && s.f())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        i = flag1;
        s = bkg1.a("shuffling");
        if (s != null && !s.j() && s.f())
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        k = flag1;
        s = bkg1.a("providerID");
        if (s != null)
        {
            s = s.b();
        } else
        {
            s = "spotify";
        }
        a(bkg1);
        if (i)
        {
            e.set(s);
        }
          goto _L6
    }

    public final czj c()
    {
        return b();
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        eif eif1;
        if (n == null)
        {
            eif1 = b();
        } else
        {
            eif1 = (eif)n.c();
        }
        eif1.a(this);
        super.onCreate();
        a.a(this);
    }

    public void onDestroy()
    {
        d();
        c.d();
        a.b(this);
        super.onDestroy();
    }

    public void onMusicControlEvent(ejw ejw1)
    {
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[ejx.a().length];
                try
                {
                    a[ejx.a - 1] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[ejx.b - 1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[ejx.c - 1] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[ejx.d - 1] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ejx.e - 1] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[ejw1.a() - 1])
        {
        default:
            return;

        case 1: // '\001'
            e();
            return;

        case 2: // '\002'
            a(false);
            return;

        case 3: // '\003'
            a(true);
            return;

        case 4: // '\004'
            f();
            return;

        case 5: // '\005'
            g();
            break;
        }
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        String s = intent.getStringExtra("access_token");
        String s1 = intent.getStringExtra("provider_id");
        a(f, s);
        a(e, s1);
        a(intent.getStringExtra("tripId"));
        a.c(produceMusicUpdateEvent());
        return 2;
    }

    public void onStationClickedEvent(eki eki1)
    {
        a(eki1.b(), eki1.a());
    }

    public void onTrackClickedEvent(ekj ekj1)
    {
        a(ekj1.a(), ekj1.b());
    }

    public eka produceMusicUpdateEvent()
    {
        boolean flag1 = true;
        boolean flag;
        if (b.a(dbf.bo))
        {
            flag = h;
            flag1 = j;
        } else
        {
            flag = true;
        }
        return new eka(m, (String)e.get(), i, k, flag, flag1);
    }

}
