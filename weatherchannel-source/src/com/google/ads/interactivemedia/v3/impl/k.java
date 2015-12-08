// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import java.util.List;
import java.util.Set;

public class k
    implements AdsRenderingSettings
{

    private int a;
    private List b;
    private Set c;
    private int d;

    public k()
    {
        a = -1;
        b = null;
        d = -1;
    }

    public int getBitrateKbps()
    {
        return a;
    }

    public List getMimeTypes()
    {
        return b;
    }

    public void setBitrateKbps(int i)
    {
        a = i;
    }

    public void setMimeTypes(List list)
    {
        b = list;
    }

    public void setUiElements(Set set)
    {
        c = set;
    }

    public String toString()
    {
        int i = a;
        String s = String.valueOf(b);
        String s1 = String.valueOf(c);
        return (new StringBuilder(String.valueOf(s).length() + 67 + String.valueOf(s1).length())).append("AdsRenderingSettings [bitrate=").append(i).append(", mimeTypes=").append(s).append(", uiElements=").append(s1).append("]").toString();
    }
}
