// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.common.a.e;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.ce;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            ap

public final class ao
    implements b
{

    private final Handler a;
    private final SharedPreferences b;
    private final ap c;
    private final ce d;
    private final String e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private String k;
    private List l;
    private String m;
    private d n;

    public ao(Handler handler, SharedPreferences sharedpreferences, ap ap1, ce ce1, String s)
    {
        a = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler);
        b = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        d = (ce)com.google.android.apps.youtube.common.fromguava.c.a(ce1);
        c = (ap)com.google.android.apps.youtube.common.fromguava.c.a(ap1);
        e = s;
    }

    private void c()
    {
label0:
        {
            if (!h)
            {
                if (l == null)
                {
                    break label0;
                }
                f();
            }
            return;
        }
        h = true;
        n = com.google.android.apps.youtube.common.a.d.a(this);
        d.a(m, com.google.android.apps.youtube.common.a.e.a(a, n));
    }

    private void d()
    {
        if (!i)
        {
            i = true;
            c.a();
        }
    }

    private void e()
    {
        if (i)
        {
            i = false;
            c.b();
        }
    }

    private void f()
    {
        Object obj = l;
        if (!j && !TextUtils.isEmpty(e))
        {
            obj = new ArrayList(((java.util.Collection) (obj)));
            ((List) (obj)).add(0, SubtitleTrack.createDisableSubtitleOption(e));
        }
        c.a(((List) (obj)));
    }

    private void g()
    {
        h = false;
        e();
        if (g)
        {
            c.c();
        }
    }

    public final void a()
    {
        if (TextUtils.isEmpty(m))
        {
            return;
        } else
        {
            g = true;
            c();
            return;
        }
    }

    public final void a(PlayerResponse playerresponse)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(playerresponse);
        String s = playerresponse.getVideoId();
        playerresponse = playerresponse.getCaptionTracksUri();
        b();
        m = s;
        j = false;
        k = b.getString("subtitles_language_code", null);
        if (!TextUtils.isEmpty(s) && playerresponse != null)
        {
            d();
            if (!TextUtils.isEmpty(k))
            {
                f = true;
                c();
            }
        }
    }

    public final void a(SubtitleTrack subtitletrack)
    {
        if (subtitletrack == null || subtitletrack.isDisableOption())
        {
            b.edit().remove("subtitles_language_code").apply();
            b.edit().putBoolean("subtitles_enabled", false).apply();
            return;
        } else
        {
            b.edit().putString("subtitles_language_code", subtitletrack.languageCode).apply();
            b.edit().putBoolean("subtitles_enabled", true).apply();
            return;
        }
    }

    public final void a(Object obj, Exception exception)
    {
        L.a("error retrieving subtitle tracks", exception);
        g();
    }

    public final void a(Object obj, Object obj1)
    {
        Object obj2 = null;
        obj = (List)obj1;
        h = false;
        if (((List) (obj)).isEmpty())
        {
            L.c("SubtitleTrack response was empty");
            g();
        } else
        {
            if (!j || ((List) (obj)).size() > 1)
            {
                d();
            }
            l = ((List) (obj));
            if (f)
            {
                f = false;
                Iterator iterator = l.iterator();
                obj = null;
                obj1 = obj2;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    SubtitleTrack subtitletrack = (SubtitleTrack)iterator.next();
                    if (subtitletrack.languageCode.equals(k))
                    {
                        obj = subtitletrack;
                    } else
                    if (obj1 == null && "en".equals(subtitletrack.languageCode))
                    {
                        obj1 = subtitletrack;
                    }
                } while (true);
                obj1 = obj;
                if (obj == null)
                {
                    obj1 = obj;
                    if (j)
                    {
                        obj1 = (SubtitleTrack)l.get(0);
                    }
                }
                if (obj1 != null)
                {
                    c.a(((SubtitleTrack) (obj1)));
                }
            }
            if (g)
            {
                g = false;
                f();
                return;
            }
        }
    }

    public final void b()
    {
        m = null;
        l = null;
        g = false;
        f = false;
        h = false;
        e();
        if (n != null)
        {
            n.a();
            n = null;
        }
    }
}
