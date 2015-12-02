// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles.model;

import hny;

public class <init> extends Enum
    implements hny
{

    private static final PROFILE_UUID $VALUES[];
    public static final PROFILE_UUID COLORS;
    public static final PROFILE_UUID ICONS;
    public static final PROFILE_UUID INITIALS;
    public static final PROFILE_UUID INT_COLORS;
    public static final PROFILE_UUID LOGOS;
    public static final PROFILE_UUID PROFILE_UUID;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/ubercab/client/feature/profiles/model/Shape_ProfileThemeOption$Property, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    static 
    {
        COLORS = new Shape_ProfileThemeOption.Property("COLORS", 0) {

            public final String toString()
            {
                return "colors";
            }

        };
        ICONS = new Shape_ProfileThemeOption.Property("ICONS", 1) {

            public final String toString()
            {
                return "icons";
            }

        };
        INITIALS = new Shape_ProfileThemeOption.Property("INITIALS", 2) {

            public final String toString()
            {
                return "initials";
            }

        };
        INT_COLORS = new Shape_ProfileThemeOption.Property("INT_COLORS", 3) {

            public final String toString()
            {
                return "intColors";
            }

        };
        LOGOS = new Shape_ProfileThemeOption.Property("LOGOS", 4) {

            public final String toString()
            {
                return "logos";
            }

        };
        PROFILE_UUID = new Shape_ProfileThemeOption.Property("PROFILE_UUID", 5) {

            public final String toString()
            {
                return "profileUuid";
            }

        };
        $VALUES = (new .VALUES[] {
            COLORS, ICONS, INITIALS, INT_COLORS, LOGOS, PROFILE_UUID
        });
    }

    private _cls6(String s, int i)
    {
        super(s, i);
    }

    _cls6(String s, int i, _cls6 _pcls6)
    {
        this(s, i);
    }
}
