// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.survey.model;


public final class  extends Enum
{

    private static final FINISH $VALUES[];
    public static final FINISH FINISH;
    public static final FINISH LIST;
    public static final FINISH POSITIVE_NEGATIVE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/ubercab/client/feature/survey/model/Question$TYPE, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        POSITIVE_NEGATIVE = new <init>("POSITIVE_NEGATIVE", 0);
        LIST = new <init>("LIST", 1);
        FINISH = new <init>("FINISH", 2);
        $VALUES = (new .VALUES[] {
            POSITIVE_NEGATIVE, LIST, FINISH
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
