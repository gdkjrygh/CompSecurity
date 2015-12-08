// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.dao;

import com.kofax.kmc.kut.utilities.appstats.AppStatsDaoField;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.greendao.AppStatsGreenDaoImage;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.dao:
//            AppStatsDao

public class ImageDao extends AppStatsDao
    implements Cloneable
{

    private static final String b = "ImageDao";
    private static AppStatsGreenDaoImage i = null;
    private static Integer j = null;
    private static Integer k = Integer.valueOf(0);
    long a;
    private String c;
    private long d;
    private int e;
    private String f;
    private String g;
    private String h;

    public ImageDao()
    {
        c = new String();
        d = 0L;
        e = 0;
        f = null;
        g = new String();
        h = null;
    }

    private long c()
    {
        return a;
    }

    public static long countRows()
    {
        return i.dsCountRows();
    }

    private int d()
    {
        return e;
    }

    private String e()
    {
        return f;
    }

    public static void export(String s, AppStatsDsExportHandler appstatsdsexporthandler)
    {
        i.dsExport(s, appstatsdsexporthandler);
    }

    private String f()
    {
        return c;
    }

    protected AppStatsDao createDaoSampleSizingObj()
    {
        ImageDao imagedao = new ImageDao();
        imagedao.c = UUID.randomUUID().toString();
        imagedao.g = UUID.randomUUID().toString();
        imagedao.d = d;
        imagedao.f = f;
        imagedao.a = a;
        imagedao.e = e;
        return imagedao;
    }

    protected Integer getAppStatsDaoObjSize()
    {
        return j;
    }

    protected Integer getAppStatsDaoObjSizeInstCnt()
    {
        return k;
    }

    public String getEnvironmentId()
    {
        return g;
    }

    public long getEventTime()
    {
        return d;
    }

    public String getSessionKey()
    {
        return h;
    }

    protected void setAppStatsDaoObjSize(Integer integer)
    {
        j = integer;
    }

    protected void setAppStatsDaoObjSizeInstCnt(Integer integer)
    {
        k = integer;
    }

    public void setDocumentId(String s)
    {
        f = s;
    }

    public void setEnvironmentId(String s)
    {
        g = s;
    }

    public void setEventTime(long l)
    {
        d = l;
    }

    public void setFileSize(int l)
    {
        a = l;
    }

    public void setId(String s)
    {
        c = s;
    }

    public void setSessionKey(String s)
    {
        h = s;
    }

    public void setSource(int l)
    {
        e = l;
    }

    public void writeToDb()
    {
        daoFields.add(new AppStatsDaoField("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, f()));
        daoFields.add(new AppStatsDaoField("EnvironmentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, getEnvironmentId()));
        daoFields.add(new AppStatsDaoField("CreationTime", AppStatsDsFieldType.DS_FIELD_TYPE_LONG, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Long.valueOf(getEventTime())));
        daoFields.add(new AppStatsDaoField("FileSize", AppStatsDsFieldType.DS_FIELD_TYPE_LONG, AppStatsDbFieldType.DB_FIELD_TYPE_FLOAT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Long.valueOf(c())));
        daoFields.add(new AppStatsDaoField("Source", AppStatsDsFieldType.DS_FIELD_TYPE_INTEGER, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Integer.valueOf(d())));
        daoFields.add(new AppStatsDaoField("DocumentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, e()));
        daoFields.add(new AppStatsDaoField("StoragePath", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, ""));
        daoFields.add(new AppStatsDaoField("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, h));
        switch (_cls1.a[dsOperation.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("writeToDb(): unsupported db operation type - ").append(dsOperation.toString()).toString());

        case 1: // '\001'
            i.dsInsert((AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()]));
            return;

        case 2: // '\002'
            i.dsUpdate((AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()]));
            break;
        }
    }

    static 
    {
        i = new AppStatsGreenDaoImage();
    }

    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[AppStatsDsOpType.values().length];
            try
            {
                a[AppStatsDsOpType.APP_STATS_DS_INSERT.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[AppStatsDsOpType.APP_STATS_DS_UPDATE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
