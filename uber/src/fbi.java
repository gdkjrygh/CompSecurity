// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fbi
{

    private fbk a;

    private fbi()
    {
    }

    fbi(byte byte0)
    {
        this();
    }

    static fbk a(fbi fbi1)
    {
        return fbi1.a;
    }

    public final fbj a()
    {
        if (a == null)
        {
            a = new fbk();
        }
        return new fbh(this, (byte)0);
    }
}
