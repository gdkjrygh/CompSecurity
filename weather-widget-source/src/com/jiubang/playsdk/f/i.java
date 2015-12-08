// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.f;

import java.util.HashMap;
import java.util.Map;

public class i
{

    private Map a;
    private Map b;

    public i()
    {
        a = new HashMap();
        b = new HashMap();
        a.put("com.jb.gokeyboard", "http://godfs.3g.cn/dynamic/gokeyboard_v2.05_release.apk");
        a.put("com.jb.gosms", "http://godfs.3g.cn/soft/gosms/channel/GOSmsPro_132.apk");
        a.put("com.gau.go.launcherex.gowidget.weatherwidget", "http://godfs.3g.cn/soft/3GHeart/golauncher/widget/qudao/goweatherex/goweatherex_204.apk");
        a.put("com.jiubang.goscreenlock", "http://godfs.3g.cn/soft/golocker/GOLocker(China543).apk");
        a.put("com.gau.go.launcherex", "http://godfs.3g.cn/gosoft/go_launcher/qudao/go_launcher_ex_555.apk");
    }

    private Map a(int j)
    {
        HashMap hashmap = new HashMap();
        if (j == 80)
        {
            hashmap.put("com.jb.gokeyboard", "market://details?id=com.jb.gokeyboard&referrer=utm_source%3DGOKEYBOARD%26utm_medium%3Dhyperlink%26utm_campaign%3DNewStoreSMS");
            hashmap.put("com.gau.go.launcherex.gowidget.weatherwidget", "market://details?id=com.gau.go.launcherex.gowidget.weatherwidget&referrer=utm_source%3Dsms_store%26utm_medium%3DHyperlink%26utm_campaign%3Dthemestore");
            hashmap.put("com.jiubang.goscreenlock", "market://details?id=com.jiubang.goscreenlock&referrer=utm_source%3DGOSMSStore%26utm_medium%3Dbanner%26utm_campaign%3DGOthemeStore");
            hashmap.put("com.gau.go.launcherex", "market://details?id=com.gau.go.launcherex&referrer=utm_source%3Dsms_store%26utm_medium%3DHyperlink%26utm_campaign%3Dgolauncher");
        } else
        if (j == 81)
        {
            hashmap.put("com.jb.gosms", "market://details?id=com.jb.gosms&referrer=utm_source%3DGOSMS%26utm_medium%3Dhyperlink%26utm_campaign%3DNewStoreKeybo");
            hashmap.put("com.gau.go.launcherex.gowidget.weatherwidget", "market://details?id=com.gau.go.launcherex.gowidget.weatherwidget&referrer=utm_source%3Dkeyboard_store%26utm_medium%3DHyperlink%26utm_campaign%3Dthemestore");
            hashmap.put("com.jiubang.goscreenlock", "market://details?id=com.jiubang.goscreenlock&referrer=utm_source%3DGOKeyboardStore%26utm_medium%3Dbanner%26utm_campaign%3DGOthemeStore");
            hashmap.put("com.gau.go.launcherex", "market://details?id=com.gau.go.launcherex&referrer=utm_source%3Dkeyboard_store%26utm_medium%3DHyperlink%26utm_campaign%3Dgolauncher");
            return hashmap;
        }
        return hashmap;
    }

    public String a(int j, String s)
    {
        if (!b.containsKey(Integer.valueOf(j)))
        {
            Map map = a(j);
            b.put(Integer.valueOf(j), map);
        }
        Map map1 = (Map)b.get(Integer.valueOf(j));
        if (map1 != null)
        {
            return (String)map1.get(s);
        } else
        {
            return "";
        }
    }

    public String a(String s)
    {
        return (String)a.get(s);
    }
}
