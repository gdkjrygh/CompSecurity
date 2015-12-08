// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import android.os.Environment;
import android.util.Log;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import org.a.a.a.b;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats:
//            AppStatsDsExportHandler, AppStatsDaoField

public class AppStatsMsSqlExportHandler
    implements AppStatsDsExportHandler
{

    private static final String a = "AppStatsMsSqlExportHandler";
    private String b;
    private ArrayList c;

    public AppStatsMsSqlExportHandler()
    {
        c = new ArrayList();
    }

    private void a(String s)
    {
        if (s == null || org.a.a.a.b.a(s))
        {
            throw new NullPointerException();
        }
        int i = s.lastIndexOf(File.separator);
        Object obj = s.substring(0, i);
        s = s.substring(i, s.length());
        if (!((String) (obj)).equalsIgnoreCase(Environment.getExternalStorageDirectory().getPath()))
        {
            obj = new File(((String) (obj)));
            if (!((File) (obj)).exists())
            {
                ((File) (obj)).mkdir();
            }
            s = new File(((File) (obj)), s);
            try
            {
                s.createNewFile();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
            return;
        }
        s = new File(((String) (obj)), s);
        try
        {
            s.createNewFile();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    private void a(String s, String s1, AppStatsDaoField aappstatsdaofield[])
    {
        s = new File(s);
        StringBuffer stringbuffer = new StringBuffer();
        StringBuffer stringbuffer1 = new StringBuffer();
        stringbuffer.append((new StringBuilder()).append("INSERT INTO ").append(s1).append(" (").toString());
        stringbuffer1.append("VALUES (");
        if (s.exists())
        {
            int k = aappstatsdaofield.length;
            int i = 0;
            while (i < k) 
            {
                s1 = aappstatsdaofield[i];
                stringbuffer.append((new StringBuilder()).append(s1.getDsFieldName()).append(",").toString());
                if (s1.getDsFieldType() == AppStatsDsFieldType.DS_FIELD_TYPE_FLOAT)
                {
                    if (s1.getDsValueFloat() == null)
                    {
                        stringbuffer1.append((new StringBuilder()).append(s1.getDsValueFloat()).append(", ").toString());
                    } else
                    {
                        stringbuffer1.append((new StringBuilder()).append("'").append(s1.getDsValueFloat()).append("'").append(", ").toString());
                    }
                } else
                if (s1.getDsFieldType() == AppStatsDsFieldType.DS_FIELD_TYPE_INTEGER)
                {
                    if (s1.getDsValueInt() == null)
                    {
                        stringbuffer1.append((new StringBuilder()).append(s1.getDsValueInt()).append(", ").toString());
                    } else
                    {
                        stringbuffer1.append((new StringBuilder()).append("'").append(s1.getDsValueInt()).append("'").append(", ").toString());
                    }
                } else
                if (s1.getDsFieldType() == AppStatsDsFieldType.DS_FIELD_TYPE_LONG)
                {
                    stringbuffer1.append((new StringBuilder()).append("'").append(s1.getDsValueLong()).append("'").append(", ").toString());
                } else
                if (s1.getDbFieldType() == AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME)
                {
                    if (s1.getDsValueString() == "0" || org.a.a.a.b.a(s1.getDsValueString()) || s1.getDsValueString() == null)
                    {
                        stringbuffer1.append("' ', ");
                    } else
                    {
                        stringbuffer1.append((new StringBuilder()).append("'").append(s1.getDsValueString()).append("'").append(", ").toString());
                    }
                } else
                if (s1.getDsFieldType() == AppStatsDsFieldType.DS_FIELD_TYPE_STRING)
                {
                    if (s1.getDsFieldName().contains("ID") || s1.getDsFieldName().contains("Id"))
                    {
                        s1 = s1.getDsValueString();
                        if (org.a.a.a.b.a(s1) || s1 == null)
                        {
                            stringbuffer1.append("NULL, ");
                        } else
                        {
                            stringbuffer1.append((new StringBuilder()).append("'{").append(s1).append("}").append("'").append(", ").toString());
                        }
                    } else
                    if (s1.getDsValueString() == null || org.a.a.a.b.a(s1.getDsValueString()))
                    {
                        stringbuffer1.append("NULL, ");
                    } else
                    {
                        s1 = s1.getDsValueString().replace("'", "");
                        stringbuffer1.append((new StringBuilder()).append("'").append(s1).append("'").append(", ").toString());
                    }
                }
                i++;
            }
            stringbuffer1.deleteCharAt(stringbuffer1.lastIndexOf(","));
            stringbuffer.deleteCharAt(stringbuffer.lastIndexOf(","));
            stringbuffer.append(")");
            stringbuffer1.append(");");
            s1 = (new StringBuilder()).append(stringbuffer.toString()).append(stringbuffer1.toString()).toString();
            Log.i("AppStatsMsSqlExportHandler", (new StringBuilder()).append("insertStatment = ").append(s1).toString());
            c.add(s1);
        }
        s = new FileOutputStream(s);
        s1 = new OutputStreamWriter(s);
        int j = 0;
_L2:
        if (j >= c.size())
        {
            break; /* Loop/switch isn't completed */
        }
        s1.write((new StringBuilder()).append((String)c.get(j)).append("\n").toString());
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            s1.close();
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        return;
    }

    public void configDsExpFilePath(String s)
    {
        b = s;
        if (b.endsWith(".sql"))
        {
            a(b);
            return;
        } else
        {
            b = (new StringBuilder()).append(b).append(".sql").toString();
            a(b);
            return;
        }
    }

    public void onExportAppStatsRowEvent(String s, AppStatsDaoField aappstatsdaofield[])
    {
        a(b, s, aappstatsdaofield);
    }
}
