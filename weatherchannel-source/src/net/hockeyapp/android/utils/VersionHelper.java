// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import net.hockeyapp.android.UpdateInfoListener;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class VersionHelper
{

    private int currentVersionCode;
    private UpdateInfoListener listener;
    private JSONObject newest;
    private ArrayList sortedVersions;

    public VersionHelper(Context context, String s, UpdateInfoListener updateinfolistener)
    {
        listener = updateinfolistener;
        loadVersions(context, s);
        sortVersions();
    }

    public static int compareVersionStrings(String s, String s1)
    {
        byte byte0 = -1;
        if (s != null && s1 != null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L6:
        return i;
_L2:
        s = new Scanner(s.replaceAll("\\-.*", ""));
        s1 = new Scanner(s1.replaceAll("\\-.*", ""));
        s.useDelimiter("\\.");
        s1.useDelimiter("\\.");
_L4:
        int j;
        int k;
        if (!s.hasNextInt() || !s1.hasNextInt())
        {
            break MISSING_BLOCK_LABEL_104;
        }
        j = s.nextInt();
        k = s1.nextInt();
        i = byte0;
        if (j < k)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (j <= k) goto _L4; else goto _L3
_L3:
        return 1;
        if (s.hasNextInt())
        {
            return 1;
        }
        boolean flag;
        try
        {
            flag = s1.hasNextInt();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0;
        }
        i = byte0;
        if (!flag)
        {
            return 0;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static long failSafeGetLongFromJSON(JSONObject jsonobject, String s, long l)
    {
        long l1;
        try
        {
            l1 = jsonobject.getLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return l;
        }
        return l1;
    }

    private static String failSafeGetStringFromJSON(JSONObject jsonobject, String s, String s1)
    {
        try
        {
            jsonobject = jsonobject.getString(s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return s1;
        }
        return jsonobject;
    }

    private String getRestoreButton(int i, JSONObject jsonobject)
    {
        StringBuilder stringbuilder = new StringBuilder();
        jsonobject = getVersionID(jsonobject);
        if (jsonobject.length() > 0)
        {
            stringbuilder.append((new StringBuilder()).append("<a href='restore:").append(jsonobject).append("'  style='background: #c8c8c8; color: #000; display: block; float: right; padding: 7px; margin: 0px 10px 10px; text-decoration: none;'>Restore</a>").toString());
        }
        return stringbuilder.toString();
    }

    private Object getSeparator()
    {
        return "<hr style='border-top: 1px solid #c8c8c8; border-bottom: 0px; margin: 40px 10px 0px 10px;' />";
    }

    private int getVersionCode(JSONObject jsonobject)
    {
        int i;
        try
        {
            i = jsonobject.getInt("version");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return 0;
        }
        return i;
    }

    private String getVersionID(JSONObject jsonobject)
    {
        try
        {
            jsonobject = jsonobject.getString("id");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return "";
        }
        return jsonobject;
    }

    private String getVersionLine(int i, JSONObject jsonobject)
    {
        StringBuilder stringbuilder;
        int j;
        int k;
        stringbuilder = new StringBuilder();
        j = getVersionCode(newest);
        k = getVersionCode(jsonobject);
        jsonobject = getVersionName(jsonobject);
        stringbuilder.append("<div style='padding: 20px 10px 10px;'><strong>");
        if (i != 0) goto _L2; else goto _L1
_L1:
        stringbuilder.append("Newest version:");
_L4:
        stringbuilder.append("</strong></div>");
        return stringbuilder.toString();
_L2:
        stringbuilder.append((new StringBuilder()).append("Version ").append(jsonobject).append(" (").append(k).append("): ").toString());
        if (k != j && k == currentVersionCode)
        {
            currentVersionCode = -1;
            stringbuilder.append("[INSTALLED]");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private String getVersionName(JSONObject jsonobject)
    {
        try
        {
            jsonobject = jsonobject.getString("shortversion");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return "";
        }
        return jsonobject;
    }

    private String getVersionNotes(int i, JSONObject jsonobject)
    {
        StringBuilder stringbuilder = new StringBuilder();
        jsonobject = failSafeGetStringFromJSON(jsonobject, "notes", "");
        stringbuilder.append("<div style='padding: 0px 10px;'>");
        if (jsonobject.trim().length() == 0)
        {
            stringbuilder.append("<em>No information.</em>");
        } else
        {
            stringbuilder.append(jsonobject);
        }
        stringbuilder.append("</div>");
        return stringbuilder.toString();
    }

    public static boolean isNewerThanLastUpdateTime(Context context, long l)
    {
        if (context != null) goto _L2; else goto _L1
_L1:
        long l1;
        return false;
_L2:
        if (l <= (l1 = (new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir)).lastModified() / 1000L) + 1800L) goto _L1; else goto _L3
_L3:
        return true;
        context;
        context.printStackTrace();
        return false;
    }

    private void loadVersions(Context context, String s)
    {
        newest = new JSONObject();
        sortedVersions = new ArrayList();
        currentVersionCode = listener.getCurrentVersionCode();
        int j;
        s = new JSONArray(s);
        j = listener.getCurrentVersionCode();
        int i = 0;
_L4:
        if (i >= s.length()) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject = s.getJSONObject(i);
        boolean flag;
        boolean flag1;
        if (jsonobject.getInt("version") > j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (jsonobject.getInt("version") == j && isNewerThanLastUpdateTime(context, jsonobject.getLong("timestamp")))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
          goto _L3
_L5:
        newest = jsonobject;
        j = jsonobject.getInt("version");
_L6:
        sortedVersions.add(jsonobject);
        i++;
          goto _L4
        context;
_L2:
        return;
        context;
        return;
_L3:
        if (!flag && !flag1) goto _L6; else goto _L5
    }

    public static String mapGoogleVersion(String s)
    {
        String s1;
label0:
        {
            if (s != null)
            {
                s1 = s;
                if (!s.equalsIgnoreCase("L"))
                {
                    break label0;
                }
            }
            s1 = "5.0";
        }
        return s1;
    }

    private void sortVersions()
    {
        Collections.sort(sortedVersions, new Comparator() {

            final VersionHelper this$0;

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((JSONObject)obj, (JSONObject)obj1);
            }

            public int compare(JSONObject jsonobject, JSONObject jsonobject1)
            {
                int i;
                int j;
                try
                {
                    i = jsonobject.getInt("version");
                    j = jsonobject1.getInt("version");
                }
                // Misplaced declaration of an exception variable
                catch (JSONObject jsonobject)
                {
                    return 0;
                }
                // Misplaced declaration of an exception variable
                catch (JSONObject jsonobject)
                {
                    return 0;
                }
                if (i <= j);
                return 0;
            }

            
            {
                this$0 = VersionHelper.this;
                super();
            }
        });
    }

    public String getFileDateString()
    {
        Date date = new Date(1000L * failSafeGetLongFromJSON(newest, "timestamp", 0L));
        return (new SimpleDateFormat("dd.MM.yyyy")).format(date);
    }

    public long getFileSizeBytes()
    {
        boolean flag = Boolean.valueOf(failSafeGetStringFromJSON(newest, "external", "false")).booleanValue();
        long l1 = failSafeGetLongFromJSON(newest, "appsize", 0L);
        long l = l1;
        if (flag)
        {
            l = l1;
            if (l1 == 0L)
            {
                l = -1L;
            }
        }
        return l;
    }

    public String getReleaseNotes(boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<html>");
        stringbuilder.append("<body style='padding: 0px 0px 20px 0px'>");
        int i = 0;
        for (Iterator iterator = sortedVersions.iterator(); iterator.hasNext();)
        {
            JSONObject jsonobject = (JSONObject)iterator.next();
            if (i > 0)
            {
                stringbuilder.append(getSeparator());
                if (flag)
                {
                    stringbuilder.append(getRestoreButton(i, jsonobject));
                }
            }
            stringbuilder.append(getVersionLine(i, jsonobject));
            stringbuilder.append(getVersionNotes(i, jsonobject));
            i++;
        }

        stringbuilder.append("</body>");
        stringbuilder.append("</html>");
        return stringbuilder.toString();
    }

    public String getVersionString()
    {
        return (new StringBuilder()).append(failSafeGetStringFromJSON(newest, "shortversion", "")).append(" (").append(failSafeGetStringFromJSON(newest, "version", "")).append(")").toString();
    }
}
