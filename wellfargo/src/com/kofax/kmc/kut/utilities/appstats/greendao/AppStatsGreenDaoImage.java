// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.a;
import a.a.a.d.c;
import a.a.a.d.e;
import a.a.a.d.g;
import android.util.Log;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDaoField;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsImageSourceType;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            AppStatsGreenDao, Image, ImageDao, DaoSession

public class AppStatsGreenDaoImage extends AppStatsGreenDao
{

    private static final String c = "AppStatsGreenDaoImage";
    private static final String d = "Image";
    private static ImageDao e = null;

    public AppStatsGreenDaoImage()
    {
    }

    protected Image createGreenDaoOrmTblObject(AppStatsDaoField aappstatsdaofield[])
    {
        Image image;
        int i;
        int j;
        image = new Image();
        j = aappstatsdaofield.length;
        i = 0;
_L11:
        AppStatsDaoField appstatsdaofield;
        Image.a a;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_263;
        }
        appstatsdaofield = aappstatsdaofield[i];
        a = Image.a.valueOf(appstatsdaofield.getDsFieldName().toUpperCase());
        com.kofax.kmc.kut.utilities.appstats.greendao._cls1.a[a.ordinal()];
        JVM INSTR tableswitch 1 8: default 96
    //                   1 141
    //                   2 158
    //                   3 169
    //                   4 180
    //                   5 219
    //                   6 230
    //                   7 241
    //                   8 252;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_252;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new TypeNotPresentException("daoField: unknown field name", new Throwable((new StringBuilder()).append("dataMember: ").append(a.name()).append(" specified by daoField does not exist").toString()));
_L2:
        image.setID(appstatsdaofield.getDsValueString());
_L12:
        i++;
        if (true) goto _L11; else goto _L10
_L10:
        image.setEnvironmentID(appstatsdaofield.getDsValueString());
          goto _L12
_L4:
        image.setCreationTime(appstatsdaofield.getDsValueLong());
          goto _L12
_L5:
        image.setFileSize(appstatsdaofield.getDsValueLong());
        Log.i("AppStatsGreenDaoImage", (new StringBuilder()).append("FileSize of image = ").append(image.getFileSize()).toString());
          goto _L12
_L6:
        image.setSource(appstatsdaofield.getDsValueInt());
          goto _L12
_L7:
        image.setDocumentID(appstatsdaofield.getDsValueString());
          goto _L12
_L8:
        image.setStoragePath(appstatsdaofield.getDsValueString());
          goto _L12
        image.setSessionKey(appstatsdaofield.getDsValueString());
          goto _L12
        return image;
    }

    protected volatile Object createGreenDaoOrmTblObject(AppStatsDaoField aappstatsdaofield[])
    {
        return createGreenDaoOrmTblObject(aappstatsdaofield);
    }

    public void dsExport(String s, AppStatsDsExportHandler appstatsdsexporthandler)
    {
        initializeGreenDaoObjects(e);
        s = e.queryBuilder();
        s.a(50);
        s.a().a(50);
        for (int i = 0; (long)i < countQuery.b().c(); i += 50)
        {
            s.b(i);
            for (Iterator iterator = s.a().c().iterator(); iterator.hasNext(); appstatsdsexporthandler.onExportAppStatsRowEvent("Image", (AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()])))
            {
                Image image = (Image)iterator.next();
                daoFields.clear();
                daoFields.add(new AppStatsDaoField("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, image.getID()));
                daoFields.add(new AppStatsDaoField("EnvironmentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, image.getEnvironmentID()));
                daoFields.add(new AppStatsDaoField("CreationTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, new Date(image.getCreationTime().longValue())));
                daoFields.add(new AppStatsDaoField("FileSize", AppStatsDsFieldType.DS_FIELD_TYPE_LONG, AppStatsDbFieldType.DB_FIELD_TYPE_FLOAT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, image.getFileSize()));
                AppStatsImageSourceType appstatsimagesourcetype = AppStatsImageSourceType.values()[image.getSource().intValue()];
                daoFields.add(new AppStatsDaoField("Source", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, appstatsimagesourcetype.getImageSourceDescription()));
                daoFields.add(new AppStatsDaoField("DocumentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, image.getDocumentID()));
                daoFields.add(new AppStatsDaoField("StoragePath", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, ""));
                daoFields.add(new AppStatsDaoField("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, image.getSessionKey()));
            }

        }

    }

    public void dsInsert(AppStatsDaoField aappstatsdaofield[])
    {
        initializeGreenDaoObjects(e);
        if (e == null)
        {
            throw new NullPointerException("dsInsert: imageEventDao cannot be null");
        } else
        {
            aappstatsdaofield = createGreenDaoOrmTblObject(aappstatsdaofield);
            e.insert(aappstatsdaofield);
            return;
        }
    }

    public void dsUpdate(AppStatsDaoField aappstatsdaofield[])
    {
        initializeGreenDaoObjects(e);
        if (e == null)
        {
            throw new NullPointerException("dsUpdate: imageEventDao cannot be null");
        } else
        {
            aappstatsdaofield = createGreenDaoOrmTblObject(aappstatsdaofield);
            e.update(aappstatsdaofield);
            return;
        }
    }

    protected boolean initializeGreenDaoObjects(a a)
    {
        Object obj = a;
        if (a == null)
        {
            obj = e;
        }
        boolean flag = super.initializeGreenDaoObjects(((a) (obj)));
        if (flag)
        {
            e = a.getImageDao();
            countQuery = e.queryBuilder().b();
        }
        return flag;
    }


    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[Image.a.values().length];
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.Image.a.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                a[Image.a.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                a[Image.a.d.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[Image.a.f.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.Image.a.e.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.Image.a.c.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.Image.a.g.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[Image.a.h.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
