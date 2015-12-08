// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.kofax.kmc.kut.utilities.AppContextProvider;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.appstats.dao.EnvironmentEventDao;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import org.a.a.a.b;

public class AppStatsEnvSettings
{

    private final String a;
    private final String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;

    public AppStatsEnvSettings(EnvironmentEventDao environmenteventdao)
    {
        a = "unknown memory size";
        b = "Android";
        c = "";
        d = "";
        e = "";
        f = "";
        g = "";
        h = "";
        i = "";
        j = "";
        k = "";
        l = "";
        c = environmenteventdao.getDeviceID();
        d = environmenteventdao.getManufacturer();
        e = environmenteventdao.getModel();
        f = environmenteventdao.getMemory();
        g = environmenteventdao.getOsVersion();
        h = environmenteventdao.getLanguage();
        i = environmenteventdao.getSdkVersion();
        j = environmenteventdao.getTimeZone();
        k = environmenteventdao.getCarrier();
        l = environmenteventdao.getOsName();
    }

    public AppStatsEnvSettings(boolean flag)
    {
        a = "unknown memory size";
        b = "Android";
        c = "";
        d = "";
        e = "";
        f = "";
        g = "";
        h = "";
        i = "";
        j = "";
        k = "";
        l = "";
        if (flag)
        {
            getEnvManufacturer(true);
            getEnvModel(true);
            getEnvMemorySize(true);
            getEnvOsVersion(true);
            getEnvLanguage(true);
            getEnvSdkVersion(true);
            getEnvTimeZone(true);
            getEnvCarrier(true);
            getEnvOsName(true);
        }
    }

    private static String a()
    {
        RandomAccessFile randomaccessfile = new RandomAccessFile("/proc/meminfo", "r");
        Object obj;
        String as[];
        obj = randomaccessfile.readLine();
        as = ((String) (obj)).split("\\s+");
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        String s;
        if (as.length > 1)
        {
            s = as[1];
        } else
        {
            s = as[0];
        }
        obj = s;
        if (as.length <= 2)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        obj = s;
        if (org.a.a.a.b.b(as[2], "kB"))
        {
            obj = (new StringBuilder()).append(s).append(" ").append(as[2]).toString();
        }
        randomaccessfile.close();
        return ((String) (obj));
        Exception exception;
        exception;
        obj = null;
_L2:
        ((RandomAccessFile) (obj)).close();
        throw exception;
        exception;
        obj = randomaccessfile;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean equals(Object obj)
    {
        if (obj != null && getClass() == obj.getClass())
        {
            obj = (AppStatsEnvSettings)obj;
            if (c.equals(((AppStatsEnvSettings) (obj)).getEnvDeviceID(false)) && d.equals(((AppStatsEnvSettings) (obj)).getEnvManufacturer(false)) && e.equals(((AppStatsEnvSettings) (obj)).getEnvModel(false)) && f.equals(((AppStatsEnvSettings) (obj)).getEnvMemorySize(false)) && g.equals(((AppStatsEnvSettings) (obj)).getEnvOsVersion(false)) && h.equals(((AppStatsEnvSettings) (obj)).getEnvLanguage(false)) && i.equals(((AppStatsEnvSettings) (obj)).getEnvSdkVersion(false)) && j.equals(((AppStatsEnvSettings) (obj)).getEnvTimeZone(false)) && k.equals(((AppStatsEnvSettings) (obj)).getEnvCarrier(false)) && l.equals(((AppStatsEnvSettings) (obj)).getEnvOsName(false)))
            {
                return true;
            }
        }
        return false;
    }

    public String getEnvCarrier(boolean flag)
    {
        if (flag)
        {
            k = ((TelephonyManager)AppContextProvider.getContext().getSystemService("phone")).getNetworkOperatorName();
        }
        return k;
    }

    public String getEnvDeviceID(boolean flag)
    {
        if (flag)
        {
            c = UUID.randomUUID().toString();
        }
        return c;
    }

    public String getEnvLanguage(boolean flag)
    {
        if (flag)
        {
            h = Locale.getDefault().toString();
        }
        return h;
    }

    public String getEnvManufacturer(boolean flag)
    {
        if (flag)
        {
            d = (new StringBuilder()).append(Character.toUpperCase(Build.MANUFACTURER.charAt(0))).append(Build.MANUFACTURER.substring(1)).toString();
        }
        return d;
    }

    public String getEnvMemorySize(boolean flag)
    {
        if (flag)
        {
            try
            {
                f = a();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
                e = "unknown memory size";
            }
        }
        return f;
    }

    public String getEnvModel(boolean flag)
    {
        if (flag)
        {
            String s = (new StringBuilder()).append(Character.toUpperCase(Build.MANUFACTURER.charAt(0))).append(Build.MANUFACTURER.substring(1)).toString();
            if (org.a.a.a.b.b(Build.MODEL, s))
            {
                s = Build.MODEL;
            } else
            {
                s = (new StringBuilder()).append(s).append(" ").append(Build.MODEL).toString();
            }
            e = s;
        }
        return e;
    }

    public String getEnvOsName(boolean flag)
    {
        if (flag)
        {
            l = "Android";
        }
        return l;
    }

    public String getEnvOsVersion(boolean flag)
    {
        if (flag)
        {
            g = android.os.Build.VERSION.RELEASE;
        }
        return g;
    }

    public String getEnvSdkVersion(boolean flag)
    {
        if (flag)
        {
            i = SdkVersion.getSdkVersion();
        }
        return i;
    }

    public String getEnvTimeZone(boolean flag)
    {
        if (flag)
        {
            flag = TimeZone.getDefault().inDaylightTime(new Date(System.currentTimeMillis()));
            j = TimeZone.getDefault().getDisplayName(flag, 0);
        }
        return j;
    }

    public void setEnvDeviceID(String s)
    {
        c = s;
    }
}
