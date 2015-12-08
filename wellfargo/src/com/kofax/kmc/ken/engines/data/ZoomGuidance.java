// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;


public final class ZoomGuidance extends Enum
{

    private static final ZoomGuidance $VALUES[];
    public static final ZoomGuidance ZOOM_IN;
    public static final ZoomGuidance ZOOM_OK;
    public static final ZoomGuidance ZOOM_OUT;

    private ZoomGuidance(String s, int i)
    {
        super(s, i);
    }

    public static ZoomGuidance valueOf(String s)
    {
        return (ZoomGuidance)Enum.valueOf(com/kofax/kmc/ken/engines/data/ZoomGuidance, s);
    }

    public static ZoomGuidance[] values()
    {
        return (ZoomGuidance[])$VALUES.clone();
    }

    static 
    {
        ZOOM_IN = new ZoomGuidance("ZOOM_IN", 0);
        ZOOM_OUT = new ZoomGuidance("ZOOM_OUT", 1);
        ZOOM_OK = new ZoomGuidance("ZOOM_OK", 2);
        $VALUES = (new ZoomGuidance[] {
            ZOOM_IN, ZOOM_OUT, ZOOM_OK
        });
    }
}
