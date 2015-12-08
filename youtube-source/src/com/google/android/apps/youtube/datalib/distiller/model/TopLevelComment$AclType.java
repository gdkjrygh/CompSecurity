// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.distiller.model;


public final class  extends Enum
{

    private static final DOMAIN $VALUES[];
    public static final DOMAIN DOMAIN;
    public static final DOMAIN EXTENDED_CIRCLES;
    public static final DOMAIN OTHER;
    public static final DOMAIN PRIVATE;
    public static final DOMAIN PUBLIC;
    public static final DOMAIN SQUARE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/datalib/distiller/model/TopLevelComment$AclType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        OTHER = new <init>("OTHER", 0);
        PRIVATE = new <init>("PRIVATE", 1);
        PUBLIC = new <init>("PUBLIC", 2);
        EXTENDED_CIRCLES = new <init>("EXTENDED_CIRCLES", 3);
        SQUARE = new <init>("SQUARE", 4);
        DOMAIN = new <init>("DOMAIN", 5);
        $VALUES = (new .VALUES[] {
            OTHER, PRIVATE, PUBLIC, EXTENDED_CIRCLES, SQUARE, DOMAIN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
