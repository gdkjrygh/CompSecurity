// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.hiring.model;


public final class A extends Enum
{

    private static final MULTIPLE_CHOICE $VALUES[];
    public static final MULTIPLE_CHOICE MULTIPLE_CHOICE;
    public static final MULTIPLE_CHOICE TAP_LINE;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/ubercab/client/feature/hiring/model/CodingQuestion$Type, s);
    }

    public static A[] values()
    {
        return (A[])$VALUES.clone();
    }

    static 
    {
        TAP_LINE = new <init>("TAP_LINE", 0);
        MULTIPLE_CHOICE = new <init>("MULTIPLE_CHOICE", 1);
        $VALUES = (new .VALUES[] {
            TAP_LINE, MULTIPLE_CHOICE
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
