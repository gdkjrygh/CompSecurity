// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.aw;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.fragments.navigation.WatchDescriptor;
import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.app.remote.an;
import com.google.android.apps.youtube.app.ui.YouTubeDialogFragment;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.player.fetcher.PlayerFetcher;
import com.google.android.apps.youtube.core.player.model.PlaybackStartDescriptor;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.innertube.model.w;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.youtube.g;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            bi, bj, bh, bk, 
//            be, bg, bl, bf

public class RemoteWatchDialogFragment extends YouTubeDialogFragment
{

    private static final Pattern Y = Pattern.compile("(PL|RD).*");
    private static final Pattern Z = Pattern.compile("RD.*");
    private int aA;
    private List aB;
    private WatchFeature aC;
    private com.google.android.apps.youtube.core.aw aD;
    private Activity aE;
    private View aa;
    private View ab;
    private View ac;
    private View ad;
    private View ae;
    private TextView af;
    private View ag;
    private View ah;
    private TextView ai;
    private TextView aj;
    private TextView ak;
    private TextView al;
    private TextView am;
    private TextView an;
    private ImageView ao;
    private View ap;
    private View aq;
    private PlayerFetcher ar;
    private bc as;
    private d at;
    private d au;
    private bl av;
    private RemoteControl aw;
    private PlaybackPair ax;
    private String ay;
    private PlaybackStartDescriptor az;

    public RemoteWatchDialogFragment()
    {
    }

    private void E()
    {
        Object obj = ((YouTubeApplication)i().getApplication()).d();
        com.google.android.apps.youtube.core.Analytics analytics = ((ax) (obj)).ba();
        obj = new com.google.android.apps.youtube.app.remote.ax(i(), ((ax) (obj)).f(), ((ax) (obj)).W(), ((ax) (obj)).aO(), ((YouTubeActivity)i()).N(), ((ax) (obj)).aT(), ((ax) (obj)).b().k());
        ((com.google.android.apps.youtube.app.remote.ax) (obj)).a(aC);
        PlayerResponse playerresponse = ax.getPlayerResponse();
        if (playerresponse.getPlayabilityStatus().c())
        {
            ad.setVisibility(0);
            ag.setOnClickListener(new bi(this, analytics, ((com.google.android.apps.youtube.app.remote.ax) (obj)), playerresponse));
            ah.setOnClickListener(new com.google.android.apps.youtube.app.fragments.bj(this, analytics, ((com.google.android.apps.youtube.app.remote.ax) (obj)), playerresponse));
            return;
        } else
        {
            af.setVisibility(0);
            af.setText(playerresponse.getPlayabilityStatus().b());
            return;
        }
    }

    private RemoteControl F()
    {
        return ((YouTubeApplication)i().getApplication()).p().e();
    }

    private static Spannable a(String s, String s1)
    {
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        spannablestringbuilder.append((new StringBuilder()).append(s).append(" \267 ").append(s1).toString());
        spannablestringbuilder.setSpan(new ForegroundColorSpan(Color.rgb(51, 51, 51)), 0, (s.length() + 3) - 1, 33);
        return spannablestringbuilder;
    }

    static TextView a(RemoteWatchDialogFragment remotewatchdialogfragment)
    {
        return remotewatchdialogfragment.aj;
    }

    static void a(RemoteWatchDialogFragment remotewatchdialogfragment, Bitmap bitmap)
    {
        remotewatchdialogfragment.ao.setImageBitmap(bitmap);
    }

    static void a(RemoteWatchDialogFragment remotewatchdialogfragment, com.google.android.apps.youtube.app.remote.RemoteControl.State state)
    {
        remotewatchdialogfragment.a(state);
    }

    static void a(RemoteWatchDialogFragment remotewatchdialogfragment, PlaybackPair playbackpair)
    {
        remotewatchdialogfragment.ax = playbackpair;
        remotewatchdialogfragment.aa.setVisibility(8);
        remotewatchdialogfragment.ab.setVisibility(8);
        remotewatchdialogfragment.ac.setVisibility(0);
        Object obj = remotewatchdialogfragment.F();
        YouTubeApplication youtubeapplication = (YouTubeApplication)remotewatchdialogfragment.i().getApplication();
        remotewatchdialogfragment.a(((RemoteControl) (obj)).b());
        if (((RemoteControl) (obj)).b() == com.google.android.apps.youtube.app.remote.RemoteControl.State.CONNECTED)
        {
            remotewatchdialogfragment.E();
        }
        Video video = playbackpair.getVideo();
        if (!d(remotewatchdialogfragment.ay))
        {
            remotewatchdialogfragment.aj.setText(playbackpair.getPlayerResponse().getTitle());
            playbackpair = remotewatchdialogfragment.i().getString(p.hb, new Object[] {
                Long.valueOf(video.viewCount)
            });
            if (!TextUtils.isEmpty(video.ownerDisplayName))
            {
                remotewatchdialogfragment.al.setText(a(video.ownerDisplayName, ((String) (playbackpair))));
            }
        }
        long l1 = video.likesCount;
        long l2 = video.dislikesCount;
        remotewatchdialogfragment.am.setText(String.format("%1$,d", new Object[] {
            Long.valueOf(l1)
        }));
        remotewatchdialogfragment.an.setText(String.format("%1$,d", new Object[] {
            Long.valueOf(l2)
        }));
        if (video.uploadedDate != null)
        {
            playbackpair = DateFormat.getLongDateFormat(remotewatchdialogfragment.i()).format(video.uploadedDate);
        } else
        {
            playbackpair = "";
        }
        if (video.description != null)
        {
            obj = video.description;
        } else
        {
            obj = "";
        }
        remotewatchdialogfragment.ak.setText(a(((String) (playbackpair)), ((String) (obj))));
        obj = youtubeapplication.i();
        if (video.hqThumbnailUri != null)
        {
            playbackpair = video.hqThumbnailUri;
        } else
        if (video.mqThumbnailUri != null)
        {
            playbackpair = video.mqThumbnailUri;
        } else
        {
            playbackpair = video.defaultThumbnailUri;
        }
        if (playbackpair != null)
        {
            ((bj) (obj)).b(playbackpair, com.google.android.apps.youtube.common.a.a.a(remotewatchdialogfragment.i(), new bh(remotewatchdialogfragment)));
        }
    }

    static void a(RemoteWatchDialogFragment remotewatchdialogfragment, String s)
    {
        remotewatchdialogfragment.b(s);
    }

    private void a(com.google.android.apps.youtube.app.remote.RemoteControl.State state)
    {
        com.google.android.apps.youtube.app.fragments.bk.a[state.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 37
    //                   2 58
    //                   3 63;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        ae.setVisibility(8);
        if (ax != null)
        {
            E();
            return;
        }
          goto _L1
_L3:
        a();
        return;
_L4:
        ae.setVisibility(0);
        return;
    }

    private void a(String s)
    {
        b(s);
        ab.findViewById(j.ek).setOnClickListener(new be(this, s));
    }

    static TextView b(RemoteWatchDialogFragment remotewatchdialogfragment)
    {
        return remotewatchdialogfragment.al;
    }

    private void b(String s)
    {
        aa.setVisibility(0);
        ab.setVisibility(8);
        ac.setVisibility(8);
        at = com.google.android.apps.youtube.common.a.d.a(new bg(this));
        ar.a(s, az.getClickTrackingParams(), az.getPlayerParams(), "", -1, -1, com.google.android.apps.youtube.common.a.a.a(i(), at));
    }

    static boolean b(RemoteWatchDialogFragment remotewatchdialogfragment, String s)
    {
        return c(s);
    }

    static void c(RemoteWatchDialogFragment remotewatchdialogfragment)
    {
        remotewatchdialogfragment.aa.setVisibility(8);
        remotewatchdialogfragment.ab.setVisibility(0);
        remotewatchdialogfragment.ac.setVisibility(8);
    }

    static boolean c(RemoteWatchDialogFragment remotewatchdialogfragment, String s)
    {
        return d(s);
    }

    private static boolean c(String s)
    {
        return !TextUtils.isEmpty(s) && Y.matcher(s).matches();
    }

    static String d(RemoteWatchDialogFragment remotewatchdialogfragment)
    {
        return remotewatchdialogfragment.ay;
    }

    private static boolean d(String s)
    {
        return !TextUtils.isEmpty(s) && Z.matcher(s).matches();
    }

    static int e(RemoteWatchDialogFragment remotewatchdialogfragment)
    {
        return remotewatchdialogfragment.aA;
    }

    static List f(RemoteWatchDialogFragment remotewatchdialogfragment)
    {
        return remotewatchdialogfragment.aB;
    }

    static RemoteControl g(RemoteWatchDialogFragment remotewatchdialogfragment)
    {
        return remotewatchdialogfragment.F();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(l.aU, viewgroup, true);
        aa = layoutinflater.findViewById(j.cj);
        ab = layoutinflater.findViewById(j.aV);
        ac = layoutinflater.findViewById(j.aB);
        ae = layoutinflater.findViewById(j.aA);
        ad = layoutinflater.findViewById(j.ed);
        af = (TextView)layoutinflater.findViewById(j.dp);
        ag = layoutinflater.findViewById(j.dk);
        ai = (TextView)layoutinflater.findViewById(j._flddo);
        ah = layoutinflater.findViewById(j.dV);
        aj = (TextView)layoutinflater.findViewById(j.fF);
        ak = (TextView)layoutinflater.findViewById(j.aH);
        al = (TextView)layoutinflater.findViewById(j.db);
        am = (TextView)layoutinflater.findViewById(j.cg);
        an = (TextView)layoutinflater.findViewById(j.aM);
        ao = (ImageView)layoutinflater.findViewById(j.fy);
        ap = layoutinflater.findViewById(j.ck);
        aq = layoutinflater.findViewById(j.cf);
        return layoutinflater;
    }

    public final void a(Activity activity)
    {
        super.a(activity);
        aE = activity;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = ((YouTubeApplication)aE.getApplication()).d();
        ar = bundle.ap();
        as = bundle.f();
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = super.c(bundle);
        bundle.getWindow().requestFeature(1);
        return bundle;
    }

    public final void d()
    {
        super.d();
        com.google.android.apps.youtube.common.fromguava.c.b(h().containsKey("watch"));
        aw = F();
        if (aw == null)
        {
            a();
        } else
        {
            av = new bl(this, (byte)0);
            aw.a(av);
            aD = ((YouTubeApplication)i().getApplication()).A();
            Object obj = (WatchDescriptor)h().getParcelable("watch");
            aA = ((WatchDescriptor) (obj)).getPlaybackStartDescriptor().getPlaylistIndex();
            az = ((WatchDescriptor) (obj)).getPlaybackStartDescriptor();
            ay = ((WatchDescriptor) (obj)).getPlaybackStartDescriptor().getPlaylistId();
            aB = ((WatchDescriptor) (obj)).getPlaybackStartDescriptor().getVideoIds();
            aC = ((WatchDescriptor) (obj)).getPlaybackStartDescriptor().getWatchFeature();
            obj = ((WatchDescriptor)h().getParcelable("watch")).getPlaybackStartDescriptor().getVideoId();
            if (aB != null)
            {
                if (!aB.isEmpty() && aA < aB.size() && aA >= 0)
                {
                    a((String)aB.get(aA));
                } else
                {
                    L.b((new StringBuilder("Nothing to play. Parsed videoIds are ")).append(aB).append(" and playlistStartPosition is ").append(aA).toString());
                    aD.a(p.bn);
                }
            } else
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                aB = new ArrayList();
                aB.add(obj);
                aA = 0;
                a(((String) (obj)));
            } else
            {
                L.b("No video_id. No idea what to play.");
                aD.a(p.bn);
            }
            if (d(ay))
            {
                au = com.google.android.apps.youtube.common.a.d.a(new bf(this));
                as.d(ay, com.google.android.apps.youtube.common.a.a.a(i(), au));
            }
            obj = ay;
            if (c(((String) (obj))))
            {
                ai.setText(p.dL);
            } else
            {
                ai.setText(p.dM);
            }
            if (d(((String) (obj))))
            {
                ak.setVisibility(8);
                aq.setVisibility(8);
                int i = j().getDimensionPixelSize(g.ab);
                int k = j().getDimensionPixelSize(g.aa);
                ap.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i, k));
                ac.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i, k));
                ab.setLayoutParams(new android.widget.LinearLayout.LayoutParams(i, k));
                return;
            }
        }
    }

    public final void e()
    {
        super.e();
        if (at != null)
        {
            at.a();
            at = null;
        }
        if (au != null)
        {
            au.a();
            au = null;
        }
        if (aw != null)
        {
            aw.b(av);
            aw = null;
            av = null;
        }
    }

}
