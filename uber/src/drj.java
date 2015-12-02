// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class drj
{

    private final Context a;

    public drj(Context context)
    {
        a = context;
    }

    protected final dri a(gju gju, cys cys)
    {
        gju = new dri(a, gju, cys);
        gju.a(new gjd(a));
        return gju;
    }

    protected final giz a(cev cev, hkr hkr)
    {
        return new giz(cev, a, hkr);
    }
}
