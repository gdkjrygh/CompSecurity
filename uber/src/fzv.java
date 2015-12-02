// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.Context;
import com.squareup.okhttp.OkHttpClient;

public final class fzv
{

    private final cjn a;
    private final eer b;
    private final Context c;
    private final boolean d;

    public fzv(cjn cjn, eer eer, Context context, boolean flag)
    {
        a = cjn;
        b = eer;
        c = context;
        d = flag;
    }

    static dwt a(cev cev, OkHttpClient okhttpclient)
    {
        return new dwt(cev, okhttpclient);
    }

    static eel a(Application application)
    {
        return eel.a(application);
    }

    static gbc a(fte fte, evt evt, hsq hsq, hsq hsq1, hsq hsq2)
    {
        return new gbc(fte, evt, hsq1, hsq, hsq2);
    }

    static gbf a(fte fte)
    {
        return new gbf(fte);
    }

    static gbi a(cjf cjf1, Context context, cjn cjn)
    {
        return new gbi(cjf1, context, cjn);
    }

    static cjz b()
    {
        return new cjz();
    }

    static eel b(Application application)
    {
        return eel.b(application);
    }

    static gbe b(fte fte)
    {
        return new gbe(fte);
    }

    static cjf e()
    {
        return new cjf();
    }

    static gau f()
    {
        return new gau();
    }

    static gbd g()
    {
        return new gbd();
    }

    final Context a()
    {
        return c;
    }

    final gbo a(chp chp, cjf cjf1, cev cev, hkr hkr, hku hku, gmg gmg, fqg fqg, 
            dpg dpg, dak dak, dal dal, fte fte, ewm ewm)
    {
        return new gbo(chp, cjf1, cev, c, hkr, hku, gmg, a, fqg, dpg, dak, dal, fte, ewm, d);
    }

    final cjn c()
    {
        return a;
    }

    final eer d()
    {
        return b;
    }
}
