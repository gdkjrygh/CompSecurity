// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gsf;


public final class  extends Enum
{

    private static final TooManyRedirects $VALUES[];
    public static final TooManyRedirects HttpError;
    public static final TooManyRedirects TooManyRedirects;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gsf/WebLoginView$Error, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        HttpError = new <init>("HttpError", 0);
        TooManyRedirects = new <init>("TooManyRedirects", 1);
        $VALUES = (new .VALUES[] {
            HttpError, TooManyRedirects
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
