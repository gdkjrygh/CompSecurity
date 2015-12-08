// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

class zzgj
{

    private int zzBv;
    private final String zzDK;
    private final List zzEg;
    private final List zzEh;
    private final String zzEi;
    private final String zzEj;
    private final String zzEk;
    private final String zzEl;
    private final boolean zzEm;
    private String zzF;

    public zzgj(int i, Map map)
    {
        zzF = (String)map.get("url");
        zzEj = (String)map.get("base_uri");
        zzEk = (String)map.get("post_parameters");
        zzEm = parseBoolean((String)map.get("drt_include"));
        zzEi = (String)map.get("activation_overlay_url");
        zzEh = zzan((String)map.get("check_packages"));
        zzDK = (String)map.get("request_id");
        zzEl = (String)map.get("type");
        zzEg = zzan((String)map.get("errors"));
        zzBv = i;
    }

    private static boolean parseBoolean(String s)
    {
        return s != null && (s.equals("1") || s.equals("true"));
    }

    private List zzan(String s)
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
        return zzBv;
    }

    public String getRequestId()
    {
        return zzDK;
    }

    public String getType()
    {
        return zzEl;
    }

    public String getUrl()
    {
        return zzF;
    }

    public void setUrl(String s)
    {
        zzF = s;
    }

    public List zzfG()
    {
        return zzEg;
    }

    public String zzfH()
    {
        return zzEk;
    }

    public boolean zzfI()
    {
        return zzEm;
    }
}
