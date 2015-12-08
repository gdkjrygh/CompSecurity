// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.model;

import java.util.Locale;

public final class  extends Enum
{

    private static final TEMPORARY $VALUES[];
    public static final TEMPORARY PERMANENT;
    public static final TEMPORARY TEMPORARY;

    public static  fromString(String s)
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            s = valueOf(s.toUpperCase(Locale.US));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static valueOf valueOf(String s)
    {
        return (valueOf)Enum.valueOf(com/google/android/apps/ytremote/model/CloudScreen$AccessType, s);
    }

    public static valueOf[] values()
    {
        return (valueOf[])$VALUES.clone();
    }

    static 
    {
        PERMANENT = new <init>("PERMANENT", 0);
        TEMPORARY = new <init>("TEMPORARY", 1);
        $VALUES = (new .VALUES[] {
            PERMANENT, TEMPORARY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
