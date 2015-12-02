// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.crash.model.CrashFingerprint;
import com.ubercab.crash.model.Shape_CrashFingerprint;

public final class gll
    implements glq
{

    private final gla a;

    public gll(gla gla1)
    {
        a = gla1;
    }

    private CrashFingerprint d()
    {
        return a.a();
    }

    public final String a()
    {
        return "crash_fingerprint";
    }

    public final Class b()
    {
        return com/ubercab/crash/model/Shape_CrashFingerprint;
    }

    public final Object c()
    {
        return d();
    }
}
