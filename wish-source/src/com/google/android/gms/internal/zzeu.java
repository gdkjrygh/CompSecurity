// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

class zzeu
{

    private final List zzAQ;
    private final List zzAR;
    private final String zzAS;
    private final String zzAT;
    private final String zzAU;
    private final String zzAV;
    private final boolean zzAW;
    private String zzAX;
    private final String zzAu;
    private int zzyl;

    public zzeu(int i, Map map)
    {
        zzAX = (String)map.get("url");
        zzAT = (String)map.get("base_uri");
        zzAU = (String)map.get("post_parameters");
        zzAW = parseBoolean((String)map.get("drt_include"));
        zzAS = (String)map.get("activation_overlay_url");
        zzAR = zzZ((String)map.get("check_packages"));
        zzAu = (String)map.get("request_id");
        zzAV = (String)map.get("type");
        zzAQ = zzZ((String)map.get("errors"));
        zzyl = i;
    }

    private static boolean parseBoolean(String s)
    {
        return s != null && (s.equals("1") || s.equals("true"));
    }

    private List zzZ(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return Arrays.asList(s.split(","));
        }
    }

    public int getErrorCode()
    {
        return zzyl;
    }

    public String getRequestId()
    {
        return zzAu;
    }

    public String getType()
    {
        return zzAV;
    }

    public String getUrl()
    {
        return zzAX;
    }

    public void setUrl(String s)
    {
        zzAX = s;
    }

    public List zzeA()
    {
        return zzAQ;
    }

    public String zzeB()
    {
        return zzAU;
    }

    public boolean zzeC()
    {
        return zzAW;
    }
}
