// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gyo
{

    private gst a;
    private gyi b;

    private gyo()
    {
    }

    gyo(byte byte0)
    {
        this();
    }

    static gst a(gyo gyo1)
    {
        return gyo1.a;
    }

    static gyi b(gyo gyo1)
    {
        return gyo1.b;
    }

    public final gyg a()
    {
        if (a == null)
        {
            throw new IllegalStateException("paymentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("creditCardModule must be set");
        } else
        {
            return new gyn(this, (byte)0);
        }
    }

    public final gyo a(gst gst)
    {
        a = gst;
        return this;
    }

    public final gyo a(gyi gyi)
    {
        b = gyi;
        return this;
    }
}
