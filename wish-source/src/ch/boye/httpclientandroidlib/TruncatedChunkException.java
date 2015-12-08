// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib;


// Referenced classes of package ch.boye.httpclientandroidlib:
//            MalformedChunkCodingException

public class TruncatedChunkException extends MalformedChunkCodingException
{

    private static final long serialVersionUID = 0xffac7d2d707069dcL;

    public TruncatedChunkException(String s)
    {
        super(s);
    }
}
