// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


abstract class ihi extends igq
{

    private static final Integer e = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    protected final int d;

    public ihi(int i)
    {
        super(i);
        d = Math.min(i / 4, e.intValue());
    }

}
