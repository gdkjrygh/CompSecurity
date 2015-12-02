// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import hny;

public class <init> extends Enum
    implements hny
{

    private static final NAME $VALUES[];
    public static final NAME ID;
    public static final NAME IMAGES;
    public static final NAME NAME;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/ubercab/client/core/model/Shape_Artist$Property, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    static 
    {
        ID = new Shape_Artist.Property("ID", 0) {

            public final String toString()
            {
                return "id";
            }

        };
        IMAGES = new Shape_Artist.Property("IMAGES", 1) {

            public final String toString()
            {
                return "images";
            }

        };
        NAME = new Shape_Artist.Property("NAME", 2) {

            public final String toString()
            {
                return "name";
            }

        };
        $VALUES = (new .VALUES[] {
            ID, IMAGES, NAME
        });
    }

    private _cls3(String s, int i)
    {
        super(s, i);
    }

    _cls3(String s, int i, _cls3 _pcls3)
    {
        this(s, i);
    }
}
