// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

class zzgq
{

    private final String zzBm;
    private int zzCI;
    private String zzF;
    private final boolean zzFA;
    private final List zzFu;
    private final List zzFv;
    private final String zzFw;
    private final String zzFx;
    private final String zzFy;
    private final String zzFz;

    public zzgq(int i, Map map)
    {
        zzF = (String)map.get("url");
        zzFx = (String)map.get("base_uri");
        zzFy = (String)map.get("post_parameters");
        zzFA = parseBoolean((String)map.get("drt_include"));
        zzFw = (String)map.get("activation_overlay_url");
        zzFv = zzaq((String)map.get("check_packages"));
        zzBm = (String)map.get("request_id");
        zzFz = (String)map.get("type");
        zzFu = zzaq((String)map.get("errors"));
        zzCI = i;
    }

    private static boolean parseBoolean(String s)
    {
        return s != null && (s.equals("1") || s.equals("true"));
    }

    private List zzaq(String s)
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
        return zzCI;
    }

    public String getRequestId()
    {
        return zzBm;
    }

    public String getType()
    {
        return zzFz;
    }

    public String getUrl()
    {
        return zzF;
    }

    public void setUrl(String s)
    {
        zzF = s;
    }

    public List zzfK()
    {
        return zzFu;
    }

    public String zzfL()
    {
        return zzFy;
    }

    public boolean zzfM()
    {
        return zzFA;
    }
}
