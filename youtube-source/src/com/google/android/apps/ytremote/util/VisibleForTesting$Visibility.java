// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.util;


public final class  extends Enum
{

    private static final PROTECTED $VALUES[];
    public static final PROTECTED PACKAGE_PRIVATE;
    public static final PROTECTED PRIVATE;
    public static final PROTECTED PROTECTED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/ytremote/util/VisibleForTesting$Visibility, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PACKAGE_PRIVATE = new <init>("PACKAGE_PRIVATE", 0);
        PRIVATE = new <init>("PRIVATE", 1);
        PROTECTED = new <init>("PROTECTED", 2);
        $VALUES = (new .VALUES[] {
            PACKAGE_PRIVATE, PRIVATE, PROTECTED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
