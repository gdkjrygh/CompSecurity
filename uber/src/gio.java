// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gio
{

    private djb a;
    private dfp b;

    private gio()
    {
    }

    gio(byte byte0)
    {
        this();
    }

    static dfp a(gio gio1)
    {
        return gio1.b;
    }

    static djb b(gio gio1)
    {
        return gio1.a;
    }

    public final gio a(dfp dfp)
    {
        if (dfp == null)
        {
            throw new NullPointerException("riderApplicationComponent");
        } else
        {
            b = dfp;
            return this;
        }
    }

    public final gio a(djb djb)
    {
        a = djb;
        return this;
    }

    public final gjg a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new gin(this, (byte)0);
        }
    }
}
