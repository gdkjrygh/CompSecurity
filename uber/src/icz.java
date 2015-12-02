// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class icz extends RuntimeException
{

    private static final long serialVersionUID = 0xa895f6ec1a8e9594L;

    public icz(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public icz(Throwable throwable)
    {
        super(throwable.getMessage(), throwable);
    }
}
