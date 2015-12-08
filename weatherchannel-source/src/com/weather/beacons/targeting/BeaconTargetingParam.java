// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.beacons.targeting;


public final class BeaconTargetingParam extends Enum
{

    private static final BeaconTargetingParam $VALUES[];
    public static final BeaconTargetingParam ACTION_NAME;
    public static final BeaconTargetingParam APP_GUID;
    public static final BeaconTargetingParam CARD_POSITION;
    public static final BeaconTargetingParam CURRENT_LOCATION;
    public static final BeaconTargetingParam DEEP_LINK_LANDING;
    public static final BeaconTargetingParam DEEP_LINK_URI;
    public static final BeaconTargetingParam LAUNCH_PARTNER;
    public static final BeaconTargetingParam LAUNCH_SOURCE;
    public static final BeaconTargetingParam NEWS_ARTICLE;
    public static final BeaconTargetingParam PARTNER;
    public static final BeaconTargetingParam PPID;
    public static final BeaconTargetingParam PRELOAD_PARTNER;
    public static final BeaconTargetingParam RADAR_LAYER;
    public static final BeaconTargetingParam TAB_NAME;
    public static final BeaconTargetingParam UNITS;
    public static final BeaconTargetingParam VIDEO;
    public static final BeaconTargetingParam VIDEO_ID;
    public static final BeaconTargetingParam WIDGET_TYPE;
    private final String parameterKey;

    private BeaconTargetingParam(String s, int i, String s1)
    {
        super(s, i);
        parameterKey = s1;
    }

    public static boolean contains(String s)
    {
        boolean flag1 = false;
        BeaconTargetingParam abeacontargetingparam[] = values();
        int j = abeacontargetingparam.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!abeacontargetingparam[i].getParameterKey().equals(s))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public static BeaconTargetingParam valueOf(String s)
    {
        return (BeaconTargetingParam)Enum.valueOf(com/weather/beacons/targeting/BeaconTargetingParam, s);
    }

    public static BeaconTargetingParam[] values()
    {
        return (BeaconTargetingParam[])$VALUES.clone();
    }

    public String getParameterKey()
    {
        return parameterKey;
    }

    static 
    {
        ACTION_NAME = new BeaconTargetingParam("ACTION_NAME", 0, "ActionName");
        APP_GUID = new BeaconTargetingParam("APP_GUID", 1, "Vid");
        CARD_POSITION = new BeaconTargetingParam("CARD_POSITION", 2, "CardPosition");
        PPID = new BeaconTargetingParam("PPID", 3, "ppid");
        VIDEO = new BeaconTargetingParam("VIDEO", 4, "Video");
        VIDEO_ID = new BeaconTargetingParam("VIDEO_ID", 5, "VideoID");
        TAB_NAME = new BeaconTargetingParam("TAB_NAME", 6, "TabName");
        UNITS = new BeaconTargetingParam("UNITS", 7, "Units");
        LAUNCH_SOURCE = new BeaconTargetingParam("LAUNCH_SOURCE", 8, "Source");
        CURRENT_LOCATION = new BeaconTargetingParam("CURRENT_LOCATION", 9, "CurrentLocation");
        RADAR_LAYER = new BeaconTargetingParam("RADAR_LAYER", 10, "map_layer");
        WIDGET_TYPE = new BeaconTargetingParam("WIDGET_TYPE", 11, "WidgetType");
        NEWS_ARTICLE = new BeaconTargetingParam("NEWS_ARTICLE", 12, "ArticleName");
        DEEP_LINK_URI = new BeaconTargetingParam("DEEP_LINK_URI", 13, "DeepLinkUri");
        DEEP_LINK_LANDING = new BeaconTargetingParam("DEEP_LINK_LANDING", 14, "DeepLinkLanding");
        PARTNER = new BeaconTargetingParam("PARTNER", 15, "Partner");
        PRELOAD_PARTNER = new BeaconTargetingParam("PRELOAD_PARTNER", 16, "PreloadPartner");
        LAUNCH_PARTNER = new BeaconTargetingParam("LAUNCH_PARTNER", 17, "LaunchPartner");
        $VALUES = (new BeaconTargetingParam[] {
            ACTION_NAME, APP_GUID, CARD_POSITION, PPID, VIDEO, VIDEO_ID, TAB_NAME, UNITS, LAUNCH_SOURCE, CURRENT_LOCATION, 
            RADAR_LAYER, WIDGET_TYPE, NEWS_ARTICLE, DEEP_LINK_URI, DEEP_LINK_LANDING, PARTNER, PRELOAD_PARTNER, LAUNCH_PARTNER
        });
    }
}
