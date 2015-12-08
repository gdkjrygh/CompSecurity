// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.dao;

import com.kofax.kmc.kut.utilities.appstats.AppStatsDaoField;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.greendao.AppStatsGreenDaoClassifyEventAlt;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.dao:
//            AppStatsDao

public class ImgClassificationEventAltDao extends AppStatsDao
    implements Cloneable
{

    private static final String a = "ImgClassificationEventAltDao";
    private static AppStatsGreenDaoClassifyEventAlt f = null;
    private static Integer g = null;
    private static Integer h = Integer.valueOf(0);
    private String b;
    private String c;
    private String d;
    private float e;

    public ImgClassificationEventAltDao()
    {
        b = "";
        c = "";
        d = "";
        e = -5000F;
        b = super.generateNewUniqueID();
    }

    public static long countRows()
    {
        return f.dsCountRows();
    }

    public static void export(String s, AppStatsDsExportHandler appstatsdsexporthandler)
    {
        f.dsExport(s, appstatsdsexporthandler);
    }

    public volatile AppStatsDao clone()
    {
        return clone();
    }

    public ImgClassificationEventAltDao clone()
    {
        return (ImgClassificationEventAltDao)super.clone();
    }

    public volatile Object clone()
    {
        return clone();
    }

    protected AppStatsDao createDaoSampleSizingObj()
    {
        ImgClassificationEventAltDao imgclassificationeventaltdao = new ImgClassificationEventAltDao();
        imgclassificationeventaltdao.b = UUID.randomUUID().toString();
        imgclassificationeventaltdao.c = UUID.randomUUID().toString();
        imgclassificationeventaltdao.d = new String(d.getBytes());
        imgclassificationeventaltdao.e = e;
        return imgclassificationeventaltdao;
    }

    public float getAltClassificationConfidence()
    {
        return e;
    }

    public String getAltClassificationResult()
    {
        return d;
    }

    protected Integer getAppStatsDaoObjSize()
    {
        this;
        JVM INSTR monitorenter ;
        Integer integer = g;
        this;
        JVM INSTR monitorexit ;
        return integer;
        Exception exception;
        exception;
        throw exception;
    }

    protected Integer getAppStatsDaoObjSizeInstCnt()
    {
        this;
        JVM INSTR monitorenter ;
        Integer integer = h;
        this;
        JVM INSTR monitorexit ;
        return integer;
        Exception exception;
        exception;
        throw exception;
    }

    public String getClassificationEventID()
    {
        return c;
    }

    public String getID()
    {
        return b;
    }

    public void setAltClassificationConfidence(float f1)
    {
        e = f1;
    }

    public void setAltClassificationResult(String s)
    {
        d = s;
    }

    protected void setAppStatsDaoObjSize(Integer integer)
    {
        this;
        JVM INSTR monitorenter ;
        g = integer;
        this;
        JVM INSTR monitorexit ;
        return;
        integer;
        throw integer;
    }

    protected void setAppStatsDaoObjSizeInstCnt(Integer integer)
    {
        this;
        JVM INSTR monitorenter ;
        h = integer;
        this;
        JVM INSTR monitorexit ;
        return;
        integer;
        throw integer;
    }

    public void setClassificationEventID(String s)
    {
        c = s;
    }

    public void setID(String s)
    {
        b = s;
    }

    public void writeToDb()
    {
        daoFields.add(new AppStatsDaoField("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, b));
        daoFields.add(new AppStatsDaoField("ClassificationEventID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, c));
        daoFields.add(new AppStatsDaoField("AlternativeResult", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, d));
        daoFields.add(new AppStatsDaoField("AlternativeConfidence", AppStatsDsFieldType.DS_FIELD_TYPE_FLOAT, AppStatsDbFieldType.DB_FIELD_TYPE_FLOAT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Float.valueOf(e)));
        switch (_cls1.a[getDsOperation().ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("writeToDb(): unsupported db operation type - ").append(getDsOperation().toString()).toString());

        case 1: // '\001'
            f.dsInsert((AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()]));
            return;

        case 2: // '\002'
            f.dsUpdate((AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()]));
            break;
        }
    }

    static 
    {
        f = new AppStatsGreenDaoClassifyEventAlt();
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
