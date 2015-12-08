// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Config
{
    public static final class ServerType extends Enum
    {

        public static final ServerType aB;
        public static final ServerType aC;
        public static final ServerType aD;
        public static final ServerType aE;
        public static final ServerType aF;
        private static final ServerType aG[];

        public static ServerType valueOf(String s)
        {
            return (ServerType)Enum.valueOf(com/sessionm/core/Config$ServerType, s);
        }

        public static ServerType[] values()
        {
            return (ServerType[])aG.clone();
        }

        static 
        {
            aB = new ServerType("PRODUCTION", 0);
            aC = new ServerType("STAGING", 1);
            aD = new ServerType("DEVELOPMENT", 2);
            aE = new ServerType("JAPAN", 3);
            aF = new ServerType("CUSTOM", 4);
            aG = (new ServerType[] {
                aB, aC, aD, aE, aF
            });
        }

        private ServerType(String s, int l)
        {
            super(s, l);
        }
    }


    public static final String Y = "api.server.url";
    public static final String Z = "api.server.url.dev";
    public static final String aa = "api.server.url.staging";
    public static final String ab = "api.server.url.production";
    public static final String ac = "api.server.url.japan";
    public static final String ad = "portal.server.url";
    public static final String ae = "portal.server.url.dev";
    public static final String af = "portal.server.url.staging";
    public static final String ag = "portal.server.url.production";
    public static final String ah = "portal.server.url.japan";
    public static final String ai = "ads.server.url";
    public static final String aj = "ads.server.url.dev";
    public static final String ak = "ads.server.url.staging";
    public static final String al = "ads.server.url.japan";
    public static final String am = "api.version";
    public static final String an = "app.cache.path";
    public static final String ao = "sdk.version";
    public static final String ap = "deviceIDFile";
    public static final String aq = "uuid";
    public static final String ar = "com.sessionm.session.stats";
    public static final String as = "com.sessionm.session.stats.start";
    public static final String at = "com.sessionm.location";
    public static final String au = "com.sessionm.location.collect";
    public static final String av = "com.sessionm.install";
    public static final String aw = "com.sessionm.install.key";
    private static final Config ax = new Config();
    private int aA;
    private final Properties ay = new Properties();
    private ServerType az;

    private Config()
    {
        az = ServerType.aB;
        aA = 14;
        ay.put("sdk.version", "1.10.6");
        ay.put("api.server.url", "https://api.sessionm.com");
        ay.put("api.server.url.dev", "http://api.tb.sessionm.com");
        ay.put("api.server.url.staging", "https://m.s.sessionm.com");
        ay.put("api.server.url.production", "https://api.sessionm.com");
        ay.put("api.server.url.japan", "https://api.reward.rakuten.jp");
        ay.put("portal.server.url", "https://portal.sessionm.com");
        ay.put("portal.server.url.dev", "http://api.tb.sessionm.com");
        ay.put("portal.server.url.staging", "https://m.s.sessionm.com");
        ay.put("portal.server.url.production", "https://portal.sessionm.com");
        ay.put("portal.server.url.japan", "https://portal.reward.rakuten.jp");
        ay.put("ads.server.url", "https://ads.sessionm.com");
        ay.put("ads.server.url.staging", "https://m.s.sessionm.com");
        ay.put("ads.server.url.dev", "http://api.tb.sessionm.com");
        ay.put("ads.server.url.japan", "https://ads.reward.rakuten.jp");
        ay.put("api.version", "6");
    }

    public static Config f()
    {
        return ax;
    }

    private void k()
    {
        com.sessionm.api.ext.Config config = com.sessionm.api.ext.Config.getInstance();
        HashMap hashmap = new HashMap();
        HashMap hashmap1 = new HashMap();
        if (getServerType().equals(ServerType.aE))
        {
            config.setTransitionViewTitle("\u30A2\u30D7\u30EA\u3092\u4F7F\u3063\u3066\u30DD\u30A4\u30F3\u30C8\u3092\u8CAF\u3081\u3088\u3046\uFF01\n Powered by \u697D\u5929\u30EA\u30EF\u30FC\u30C9");
            hashmap.put("Loading", "\u30ED\u30FC\u30C9\u4E2D");
            hashmap.put("Cannot Connect", "\u63A5\u7D9A\u306B\u5931\u6557\u3057\u307E\u3057\u305F");
            hashmap.put("Temporarily Unavailable", "\u73FE\u5728\u3053\u3061\u3089\u306E\u30B5\u30FC\u30D3\u30B9\u306F\u3054\u5229\u7528\u3067\u304D\u307E\u305B\u3093");
            hashmap1.put("Okay", "\u9589\u3058\u308B");
            hashmap1.put("Retry", "\u30EA\u30C8\u30E9\u30A4");
        } else
        {
            config.setTransitionViewTitle("");
            hashmap.put("Loading", "");
            hashmap.put("Cannot Connect", "");
            hashmap.put("Temporarily Unavailable", "");
            hashmap1.put("Okay", "");
            hashmap1.put("Retry", "");
        }
        config.setTransitionMessageMap(hashmap);
        config.setTransitionButtonMap(hashmap1);
    }

    public String a(Context context)
    {
        return (new File(context.getCacheDir(), "sessionmrequestcache")).getPath();
    }

    public String b(Context context)
    {
        return (new File(context.getCacheDir(), "sessionmwebcache")).getPath();
    }

    public String c(Context context)
    {
        return (new File(context.getFilesDir(), "sessionmgeodb")).getPath();
    }

    public void c(int l)
    {
        aA = l;
    }

    public String d(Context context)
    {
        return (new File(context.getFilesDir(), "sessionmwebdb")).getPath();
    }

    public String g()
    {
        return getValue("api.server.url");
    }

    public ServerType getServerType()
    {
        return az;
    }

    public String getValue(String s)
    {
        if (s == null || s.length() == 0)
        {
            return null;
        } else
        {
            return ay.getProperty(s);
        }
    }

    public String h()
    {
        return getValue("ads.server.url");
    }

    public String i()
    {
        return getValue("portal.server.url");
    }

    public int j()
    {
        return aA;
    }

    public transient void setServerType(ServerType servertype, String as1[])
    {
        Object obj;
        Object obj1;
        az = servertype;
        obj1 = "";
        obj = "";
        servertype = "";
        if (az != ServerType.aD) goto _L2; else goto _L1
_L1:
        obj1 = getValue("api.server.url.dev");
        obj = getValue("portal.server.url.dev");
        servertype = getValue("ads.server.url.dev");
_L6:
        if (obj1 != null && ((String) (obj1)).length() != 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        return;
_L2:
        if (az == ServerType.aC)
        {
            obj1 = getValue("api.server.url.staging");
            obj = getValue("portal.server.url.staging");
            servertype = getValue("ads.server.url.staging");
            continue; /* Loop/switch isn't completed */
        }
        if (az == ServerType.aB)
        {
            obj1 = getValue("api.server.url.production");
            obj = getValue("portal.server.url.production");
            servertype = getValue("ads.server.url");
            continue; /* Loop/switch isn't completed */
        }
        if (az == ServerType.aE)
        {
            obj1 = getValue("api.server.url.japan");
            obj = getValue("portal.server.url.japan");
            servertype = getValue("ads.server.url.japan");
            continue; /* Loop/switch isn't completed */
        }
        if (az != ServerType.aF)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (as1 == null || as1.length == 0) goto _L4; else goto _L3
_L3:
        servertype = as1[0];
        obj = servertype;
        obj1 = servertype;
        if (true) goto _L6; else goto _L5
_L5:
        ay.setProperty("api.server.url", ((String) (obj1)));
        ay.setProperty("portal.server.url", ((String) (obj)));
        ay.setProperty("ads.server.url", servertype);
        k();
        return;
    }

}
