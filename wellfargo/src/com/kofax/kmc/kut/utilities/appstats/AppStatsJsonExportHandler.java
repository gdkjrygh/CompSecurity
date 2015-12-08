// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.MemoryHelper;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.a.a.a.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats:
//            AppStatsDsExportHandler, AppStatsExportListener, AppStatistics, AppStatsExportEvent, 
//            AppStatsDaoField

public class AppStatsJsonExportHandler
    implements AppStatsDsExportHandler, AppStatsExportListener
{

    private static final String a = "AppStatsJsonExportHandler";
    private static AppStatistics h;
    private static AppStatistics.FriendAS i;
    private final String b = "AppStatisticsVersion";
    private final String c = "AppStatisticsTables";
    private final String d = ".json";
    private final float e = 0.1F;
    private final String f = (new StringBuilder()).append(",").append(System.getProperty("line.separator")).toString();
    private final String g = System.getProperty("line.separator");
    private JSONObject j;
    private JSONObject k;
    private File l;
    private Map m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private boolean t;
    private boolean u;

    public AppStatsJsonExportHandler()
    {
        j = new JSONObject();
        k = new JSONObject();
        l = null;
        m = new HashMap();
        n = "";
        o = "";
        p = "";
        q = "";
        r = "";
        s = "";
        t = false;
        u = false;
        try
        {
            j.put("AppStatisticsVersion", SdkVersion.getSdkVersion());
            j.put("AppStatisticsTables", k);
            String s1 = j.toString(2);
            int i1 = s1.indexOf("{", 1);
            n = (new StringBuilder()).append(s1.substring(0, i1 + 1)).append(g).toString();
            i.addAppStatsExportListener(this, 0);
            return;
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            KmcRuntimeException kmcruntimeexception = new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_INVALID_JSON);
            kmcruntimeexception.getErrorInfo().setErrCause(jsonexception.getMessage());
            throw kmcruntimeexception;
        }
    }

    private String a(boolean flag)
    {
        Object obj;
        try
        {
            obj = new StringBuilder(j.toString(2));
            String s1 = (new StringBuilder()).append("[").append(g).toString();
            int i1 = ((StringBuilder) (obj)).indexOf(s1);
            ((StringBuilder) (obj)).delete(0, s1.length() + i1);
            ((StringBuilder) (obj)).delete(((StringBuilder) (obj)).lastIndexOf("]"), ((StringBuilder) (obj)).length());
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            KmcRuntimeException kmcruntimeexception = new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_INVALID_JSON);
            kmcruntimeexception.getErrorInfo().setErrCause(jsonexception.getMessage());
            throw kmcruntimeexception;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        ((StringBuilder) (obj)).insert(0, (new StringBuilder()).append(",").append(g).toString());
        ((StringBuilder) (obj)).trimToSize();
        obj = org.a.a.a.b.a(((StringBuilder) (obj)).toString(), (new StringBuilder()).append(" ").append(g).toString());
        return ((String) (obj));
    }

    private void a()
    {
        for (Iterator iterator = k.keys(); iterator.hasNext(); iterator.remove())
        {
            iterator.next();
        }

    }

    private void a(String s1, File file)
    {
        a(s1, file, false);
    }

    private void a(String s1, File file, boolean flag)
    {
        try
        {
            file = new FileOutputStream(file, flag);
            OutputStreamWriter outputstreamwriter = new OutputStreamWriter(file);
            outputstreamwriter.write(s1);
            outputstreamwriter.close();
            file.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            file = new KmcRuntimeException(ErrorInfo.KMC_GN_FILE_NOT_FOUND);
            file.getErrorInfo().setErrCause(s1.getMessage());
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
        }
        file = new KmcRuntimeException(ErrorInfo.KMC_GN_IO_EXCEPTION);
        file.getErrorInfo().setErrCause(s1.getMessage());
        throw file;
    }

    private void a(String s1, boolean flag)
    {
        a(q, l, true);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        k.put(s1, new JSONArray());
        return;
        s1;
        s1.printStackTrace();
        KmcRuntimeException kmcruntimeexception = new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_INVALID_JSON);
        kmcruntimeexception.getErrorInfo().setErrCause(s1.getMessage());
        throw kmcruntimeexception;
    }

    private void b()
    {
        try
        {
            if (!t)
            {
                c();
                String s1 = j.toString(2);
                o = s1.substring(s1.lastIndexOf("]") + 2, s1.length());
            }
            c(false);
            a();
            return;
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            KmcRuntimeException kmcruntimeexception = new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_INVALID_JSON);
            kmcruntimeexception.getErrorInfo().setErrCause(jsonexception.getMessage());
            throw kmcruntimeexception;
        }
    }

    private void b(boolean flag)
    {
        String s1;
        if (!flag)
        {
            s1 = (new StringBuilder()).append(org.a.a.a.b.a(r, g)).append(f).toString();
        } else
        {
            s1 = r;
        }
        a(s1, l, true);
    }

    private void c()
    {
        t = true;
        a(n, l, false);
    }

    private void c(boolean flag)
    {
        StringBuilder stringbuilder;
        try
        {
            stringbuilder = new StringBuilder(k.toString(4));
            stringbuilder.replace(0, stringbuilder.indexOf(" "), "");
            stringbuilder.deleteCharAt(stringbuilder.lastIndexOf("}"));
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            KmcRuntimeException kmcruntimeexception = new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_INVALID_JSON);
            kmcruntimeexception.getErrorInfo().setErrCause(jsonexception.getMessage());
            throw kmcruntimeexception;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        stringbuilder.insert(stringbuilder.lastIndexOf("]") + 1, ",");
        a(stringbuilder.toString(), l, true);
        return;
    }

    private void d()
    {
        a(o, l, true);
    }

    private void e()
    {
        u = true;
        a(p, l, true);
    }

    public void configDsExpFilePath(String s1)
    {
        String s2 = s1;
        if (!s1.endsWith(".json"))
        {
            s2 = (new StringBuilder()).append(s1).append(".json").toString();
        }
        l = new File(s2);
    }

    public void exportStatusEvent(AppStatsExportEvent appstatsexportevent)
    {
        if (appstatsexportevent.getPercentComplete() != 100) goto _L2; else goto _L1
_L1:
        if (t) goto _L4; else goto _L3
_L3:
        a(j.toString(2), l);
_L6:
        h.removeAppStatsExportListener(this);
_L2:
        return;
_L4:
        KmcRuntimeException kmcruntimeexception;
        if (!s.isEmpty())
        {
            q = a(false);
            a(s, true);
            b(true);
            d();
            s = "";
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            c(true);
            d();
        }
        // Misplaced declaration of an exception variable
        catch (AppStatsExportEvent appstatsexportevent)
        {
            appstatsexportevent.printStackTrace();
            kmcruntimeexception = new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_INVALID_JSON);
            kmcruntimeexception.getErrorInfo().setErrCause(appstatsexportevent.getMessage());
            throw kmcruntimeexception;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onExportAppStatsRowEvent(String s1, AppStatsDaoField aappstatsdaofield[])
    {
        int i1;
        i1 = 0;
        s1 = (new StringBuilder()).append(s1).append("s").toString();
        if (k.has(s1)) goto _L2; else goto _L1
_L1:
        if (!s.isEmpty())
        {
            q = a(false);
            a(s, true);
            b(false);
            k.remove(s);
            s = "";
        }
        if (k.length() > 0 && MemoryHelper.getTotalFreeMemoryAsPctOfMax() < 0.1F)
        {
            b();
        }
        u = false;
        k.put(s1, new JSONArray());
_L4:
        int j1;
        s1 = k.getJSONArray(s1);
        m.clear();
        j1 = aappstatsdaofield.length;
        while (i1 < j1) 
        {
            Object obj = aappstatsdaofield[i1];
            int k1;
            try
            {
                m.put(((AppStatsDaoField) (obj)).getDsFieldName(), ((AppStatsDaoField) (obj)).getDsValueString());
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s1.printStackTrace();
                aappstatsdaofield = new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_INVALID_JSON);
                aappstatsdaofield.getErrorInfo().setErrCause(s1.getMessage());
                throw aappstatsdaofield;
            }
            i1++;
        }
        break MISSING_BLOCK_LABEL_485;
_L2:
        if (MemoryHelper.getTotalFreeMemoryAsPctOfMax() >= 0.1F) goto _L4; else goto _L3
_L3:
        if (u)
        {
            break MISSING_BLOCK_LABEL_467;
        }
        obj = k.getJSONArray(s1);
        k.remove(s1);
        b();
        k.put(s1, obj);
        obj = new StringBuilder(j.toString(2));
        ((StringBuilder) (obj)).delete(0, n.length());
        ((StringBuilder) (obj)).delete(((StringBuilder) (obj)).length() - o.length(), ((StringBuilder) (obj)).length());
        k1 = ((StringBuilder) (obj)).indexOf("[", 0);
        p = (new StringBuilder()).append(((StringBuilder) (obj)).substring(0, k1 + 1)).append(g).toString();
        q = a(true);
        obj = new StringBuilder(j.toString(2));
        ((StringBuilder) (obj)).delete(0, n.length());
        ((StringBuilder) (obj)).delete(0, p.length());
        ((StringBuilder) (obj)).delete(0, q.length());
        ((StringBuilder) (obj)).delete(((StringBuilder) (obj)).indexOf(o), ((StringBuilder) (obj)).length());
        r = ((StringBuilder) (obj)).toString();
        e();
        a(s1, false);
        s = s1;
          goto _L4
        q = a(false);
        a(s1, false);
          goto _L4
        s1.put(new JSONObject(m));
        return;
    }

    static 
    {
        h = AppStatistics.getInstance();
        AppStatistics appstatistics = h;
        appstatistics.getClass();
        i = new AppStatistics.FriendAS(appstatistics, "com.kofax.kmc.kut.utilities.appstats");
    }
}
