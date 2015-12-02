// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.crash.model.Crash;
import com.ubercab.crash.model.MetaData;
import java.util.Map;

public abstract class gky
{

    private final gkx a;

    protected gky(gkx gkx1)
    {
        a = gkx1;
    }

    public final gkx a()
    {
        return a;
    }

    public final void a(Crash crash, gkz gkz)
    {
        a(a().a(crash.getCrashId()), a().b(crash.getCrashId()), crash, gkz);
    }

    protected abstract void a(MetaData metadata, Map map, Crash crash, gkz gkz);
}
