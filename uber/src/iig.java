// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executor;

final class iig extends ici
{

    final Executor a;

    public iig(Executor executor)
    {
        a = executor;
    }

    public final icj a()
    {
        return new iih(a);
    }
}
