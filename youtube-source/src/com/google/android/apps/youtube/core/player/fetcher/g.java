// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.fetcher;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.google.a.a.a.a.af;
import com.google.a.a.a.a.ag;
import com.google.a.a.a.a.fk;
import com.google.a.a.a.a.it;
import com.google.a.a.a.a.iv;
import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.me;
import com.google.a.a.a.a.ol;
import com.google.a.a.a.a.om;
import com.google.a.a.a.a.oo;
import com.google.a.a.a.a.qq;
import com.google.a.a.a.a.qt;
import com.google.a.a.a.a.rp;
import com.google.a.a.a.a.rq;
import com.google.a.a.a.a.rs;
import com.google.a.a.a.a.rt;
import com.google.a.a.a.a.sc;
import com.google.a.a.a.a.sx;
import com.google.a.a.a.a.sy;
import com.google.a.a.a.a.uv;
import com.google.a.a.a.a.uw;
import com.google.a.a.a.a.wb;
import com.google.a.a.a.a.wg;
import com.google.a.a.a.a.wk;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;
import com.google.android.apps.youtube.datalib.innertube.model.WatchNextResponse;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.youtube.p;
import java.util.List;

public final class g
{

    private static ag a(Playlist playlist, List list, int i, int j, boolean flag)
    {
        kz kz1;
        boolean flag1;
        if (i < list.size() && i >= 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        c.a(flag1);
        if (i < list.size() - 1)
        {
            int k = i + 1;
            kz1 = a(((Video)list.get(k)).id, playlist.id, k, flag);
        } else
        if (i == list.size() - 1 && j == 3)
        {
            kz1 = a(((Video)list.get(0)).id, playlist.id, 0, flag);
        } else
        {
            kz1 = null;
        }
        if (i > 0)
        {
            i--;
            playlist = a(((Video)list.get(i)).id, playlist.id, i, flag);
        } else
        {
            playlist = null;
        }
        list = new ag();
        list.b = j;
        if (kz1 != null)
        {
            list.d = kz1;
            list.c = kz1;
        }
        if (playlist != null)
        {
            list.e = playlist;
        }
        return list;
    }

    private static fk a(Video video)
    {
        fk fk1 = new fk();
        if (video.title != null)
        {
            sc sc1 = new sc();
            sc1.b = video.title;
            fk1.b = (new sc[] {
                sc1
            });
        }
        return fk1;
    }

    private static kz a(String s, String s1, int i)
    {
        me me1 = new me();
        if (!TextUtils.isEmpty(s))
        {
            me1.b = s;
        }
        if (!TextUtils.isEmpty(s1))
        {
            me1.c = s1;
        }
        if (i != -1)
        {
            me1.d = i;
        }
        s = new kz();
        s.w = me1;
        return s;
    }

    private static kz a(String s, String s1, int i, boolean flag)
    {
        if (flag)
        {
            return a(s, s1, i);
        }
        wb wb1 = new wb();
        if (!TextUtils.isEmpty(s))
        {
            wb1.b = s;
        }
        if (!TextUtils.isEmpty(s1))
        {
            wb1.c = s1;
        }
        if (i != -1)
        {
            wb1.d = i;
        }
        s = new kz();
        s.i = wb1;
        return s;
    }

    private static wg a(Context context, kz kz1, Video video)
    {
        wg wg1 = new wg();
        wg1.j = kz1;
        wg1.h = new wk();
        wg1.h.b = new rp();
        wg1.h.b.b = new rt();
        wg1.h.b.b.b = new qq();
        wg1.h.b.b.b.b = (new qt[] {
            new qt()
        });
        qt qt1 = wg1.h.b.b.b.b[0];
        it it1 = new it();
        fk fk1 = b(video);
        kz1 = null;
        if (video.offlineChannelAvatarThumbnailUrl != null)
        {
            kz1 = video.offlineChannelAvatarThumbnailUrl;
        }
        Object obj = new uw();
        obj.c = fk1;
        obj.b = new sx();
        ((uw) (obj)).b.b = (new sy[] {
            new sy()
        });
        ((uw) (obj)).b.b[0].b = kz1;
        kz1 = new iv();
        kz1.q = ((uw) (obj));
        fk1 = a(video);
        obj = new fk();
        Object obj1 = new sc();
        obj1.b = context.getResources().getString(p.hb, new Object[] {
            Long.valueOf(video.viewCount)
        });
        obj.b = (new sc[] {
            obj1
        });
        obj1 = com.google.android.apps.youtube.datalib.innertube.a.b.a(video.likesCount);
        fk fk2 = com.google.android.apps.youtube.datalib.innertube.a.b.a(video.likesCount + 1L);
        fk fk3 = com.google.android.apps.youtube.datalib.innertube.a.b.a(video.dislikesCount);
        fk fk4 = com.google.android.apps.youtube.datalib.innertube.a.b.a(video.dislikesCount + 1L);
        fk fk5 = new fk();
        if (video.description != null)
        {
            sc sc1 = new sc();
            sc1.b = video.description.trim();
            fk5.b = (new sc[] {
                sc1
            });
        }
        fk fk6 = new fk();
        if (video.uploadedDate != null)
        {
            sc sc2 = new sc();
            sc2.c = true;
            sc2.b = DateFormat.getLongDateFormat(context).format(video.uploadedDate);
            fk6.b = (new sc[] {
                sc2
            });
        }
        context = new iv();
        context.r = new uv();
        ((iv) (context)).r.j = video.isActionable();
        ((iv) (context)).r.i = video.isActionable();
        ((iv) (context)).r.f = fk5;
        ((iv) (context)).r.k = fk6;
        ((iv) (context)).r.c = ((fk) (obj));
        ((iv) (context)).r.b = fk1;
        ((iv) (context)).r.e = fk3;
        ((iv) (context)).r.h = fk4;
        ((iv) (context)).r.d = ((fk) (obj1));
        ((iv) (context)).r.g = fk2;
        it1.b = (new iv[] {
            kz1, context
        });
        qt1.b = it1;
        return wg1;
    }

    public static wg a(Context context, wg wg1, Playlist playlist, List list, int i)
    {
        return a(context, wg1, playlist, list, i, true);
    }

    private static wg a(Context context, wg wg1, Playlist playlist, List list, int i, boolean flag)
    {
        c.a(context);
        c.a(playlist);
        c.a(list);
        rp rp1 = wg1.h.b;
        ol ol1 = new ol();
        ol1.e = playlist.id;
        ol1.b = playlist.title;
        ol1.d = i;
        ol1.f = list.size();
        ol1.c = new om[list.size()];
        int j = 0;
        while (j < list.size()) 
        {
            Video video;
            oo oo1;
            fk fk1;
            sc sc1;
            boolean flag1;
            boolean flag2;
            if (j == i)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            video = (Video)list.get(j);
            oo1 = new oo();
            oo1.g = flag2;
            oo1.b = a(video);
            oo1.l = b(video);
            oo1.f = com.google.android.apps.youtube.datalib.innertube.a.b.a(j + 1);
            fk1 = new fk();
            sc1 = new sc();
            sc1.b = m.a(video.duration, 3);
            fk1.b = (new sc[] {
                sc1
            });
            oo1.e = fk1;
            oo1.h = a(video.id, playlist.id, j, flag);
            if (video.state == com.google.android.apps.youtube.datalib.model.gdata.Video.State.PLAYABLE || video.state == com.google.android.apps.youtube.datalib.model.gdata.Video.State.PROCESSING && video.isLive())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                oo1.d = new sx();
                oo1.d.b = (new sy[] {
                    new sy()
                });
                oo1.d.b[0].b = video.mqThumbnailUri.toString();
            } else
            {
                fk fk2 = new fk();
                sc sc2 = new sc();
                sc2.b = context.getString(video.state.explanationId);
                fk2.b = (new sc[] {
                    sc2
                });
                oo1.j = fk2;
            }
            ol1.c[j] = new om();
            ol1.c[j].b = oo1;
            j++;
        }
        context = new rs();
        context.b = ol1;
        rp1.c = context;
        context = new rq();
        context.b = new af();
        ((rq) (context)).b.b = (new ag[] {
            a(playlist, list, i, 1, flag), a(playlist, list, i, 3, flag), a(playlist, list, i, 2, flag), a(playlist, list, i, 4, flag)
        });
        rp1.d = context;
        return wg1;
    }

    public static WatchNextResponse a(Context context, Playlist playlist, List list, int i)
    {
        c.a(context);
        c.a(playlist);
        c.a(list);
        c.a(context);
        c.a(playlist);
        c.a(list);
        i = Math.max(0, Math.min(list.size() - 1, i));
        Video video = (Video)list.get(i);
        return new WatchNextResponse(a(context, a(context, a(video.id, playlist.id, i, true), video), playlist, list, i, true));
    }

    public static WatchNextResponse a(Context context, Video video)
    {
        c.a(context);
        c.a(video);
        return new WatchNextResponse(a(context, a(video.id, ((String) (null)), -1), video));
    }

    private static fk b(Video video)
    {
        fk fk1 = new fk();
        sc sc1 = new sc();
        sc1.b = video.ownerDisplayName;
        fk1.b = (new sc[] {
            sc1
        });
        return fk1;
    }
}
