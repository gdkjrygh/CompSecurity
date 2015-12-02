// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Pair;

public abstract class gmj
{

    public static final gmj a = a(null, null, null);

    public gmj()
    {
    }

    public static gmj a(String s, Pair pair, String s1)
    {
        return (new gmu()).a(s).a(pair).b(s1);
    }

    abstract gmj a(Pair pair);

    abstract gmj a(String s);

    public abstract String a();

    public abstract Pair b();

    abstract gmj b(String s);

    public abstract String c();

}
