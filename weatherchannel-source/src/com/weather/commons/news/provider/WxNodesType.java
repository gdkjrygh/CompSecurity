// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;


public final class WxNodesType extends Enum
{

    private static final WxNodesType $VALUES[];
    public static final WxNodesType WX_CONTENT_WELL;
    public static final WxNodesType WX_IMAGE;
    public static final WxNodesType WX_MAP;
    public static final WxNodesType WX_OTHER;
    public static final WxNodesType WX_SLIDESHOW;
    public static final WxNodesType WX_VIDEO;
    private final String wxNodesType;

    private WxNodesType(String s, int i, String s1)
    {
        super(s, i);
        wxNodesType = s1;
    }

    public static WxNodesType getWxNodeType(String s)
    {
        WxNodesType awxnodestype[] = values();
        int j = awxnodestype.length;
        for (int i = 0; i < j; i++)
        {
            WxNodesType wxnodestype = awxnodestype[i];
            if (wxnodestype.getWxNodesType().equalsIgnoreCase(s))
            {
                return wxnodestype;
            }
        }

        return WX_OTHER;
    }

    public static WxNodesType valueOf(String s)
    {
        return (WxNodesType)Enum.valueOf(com/weather/commons/news/provider/WxNodesType, s);
    }

    public static WxNodesType[] values()
    {
        return (WxNodesType[])$VALUES.clone();
    }

    public String getWxNodesType()
    {
        return wxNodesType;
    }

    static 
    {
        WX_CONTENT_WELL = new WxNodesType("WX_CONTENT_WELL", 0, "wxnode_content_well");
        WX_VIDEO = new WxNodesType("WX_VIDEO", 1, "wxnode_video");
        WX_SLIDESHOW = new WxNodesType("WX_SLIDESHOW", 2, "wxnode_slideshow");
        WX_MAP = new WxNodesType("WX_MAP", 3, "wxnode_map");
        WX_IMAGE = new WxNodesType("WX_IMAGE", 4, "wxnode_internal_image");
        WX_OTHER = new WxNodesType("WX_OTHER", 5, "wxnode_unknown");
        $VALUES = (new WxNodesType[] {
            WX_CONTENT_WELL, WX_VIDEO, WX_SLIDESHOW, WX_MAP, WX_IMAGE, WX_OTHER
        });
    }
}
