// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class drs extends ici
{

    ici a;

    drs()
    {
    }

    public final icj a()
    {
        if (a == null)
        {
            throw new IllegalStateException("Scheduler must be set before creating worker");
        } else
        {
            return a.a();
        }
    }

    public final void a(ici ici1)
    {
        a = ici1;
    }
}
