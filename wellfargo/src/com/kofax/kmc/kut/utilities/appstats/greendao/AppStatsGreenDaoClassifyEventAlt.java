// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.a;
import a.a.a.d.c;
import a.a.a.d.e;
import a.a.a.d.g;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDaoField;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            AppStatsGreenDao, ClassificationEventAlternative, ClassificationEventAlternativeDao, DaoSession

public class AppStatsGreenDaoClassifyEventAlt extends AppStatsGreenDao
{

    private static final String c = "AppStatsGreenDaoClassifyEventAlt";
    private static final String d = "ClassificationEventAlternative";
    private static ClassificationEventAlternativeDao e = null;

    public AppStatsGreenDaoClassifyEventAlt()
    {
    }

    protected ClassificationEventAlternative createGreenDaoOrmTblObject(AppStatsDaoField aappstatsdaofield[])
    {
        ClassificationEventAlternative classificationeventalternative;
        int i;
        int j;
        classificationeventalternative = new ClassificationEventAlternative();
        j = aappstatsdaofield.length;
        i = 0;
_L7:
        AppStatsDaoField appstatsdaofield;
        ClassificationEventAlternative.a a;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        appstatsdaofield = aappstatsdaofield[i];
        a = ClassificationEventAlternative.a.valueOf(appstatsdaofield.getDsFieldName().toUpperCase());
        com.kofax.kmc.kut.utilities.appstats.greendao._cls1.a[a.ordinal()];
        JVM INSTR tableswitch 1 4: default 80
    //                   1 125
    //                   2 142
    //                   3 153
    //                   4 164;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_164;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new TypeNotPresentException("daoField: unknown field name", new Throwable((new StringBuilder()).append("dataMember: ").append(a.name()).append(" specified by daoField does not exist").toString()));
_L2:
        classificationeventalternative.setID(appstatsdaofield.getDsValueString());
_L8:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        classificationeventalternative.setClassificationEventID(appstatsdaofield.getDsValueString());
          goto _L8
_L4:
        classificationeventalternative.setAlternativeResult(appstatsdaofield.getDsValueString());
          goto _L8
        classificationeventalternative.setAlternativeConfidence(appstatsdaofield.getDsValueFloat());
          goto _L8
        return classificationeventalternative;
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
            for (Iterator iterator = s.a().c().iterator(); iterator.hasNext(); appstatsdsexporthandler.onExportAppStatsRowEvent("ClassificationEventAlternative", (AppStatsDaoField[])(AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()])))
            {
                ClassificationEventAlternative classificationeventalternative = (ClassificationEventAlternative)iterator.next();
                daoFields.clear();
                daoFields.add(new AppStatsDaoField("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, classificationeventalternative.getID()));
                daoFields.add(new AppStatsDaoField("ClassificationEventID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, classificationeventalternative.getClassificationEventID()));
                daoFields.add(new AppStatsDaoField("AlternativeResult", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, classificationeventalternative.getAlternativeResult()));
                daoFields.add(new AppStatsDaoField("AlternativeConfidence", AppStatsDsFieldType.DS_FIELD_TYPE_FLOAT, AppStatsDbFieldType.DB_FIELD_TYPE_FLOAT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, classificationeventalternative.getAlternativeConfidence()));
            }

        }

    }

    public void dsInsert(AppStatsDaoField aappstatsdaofield[])
    {
        initializeGreenDaoObjects(e);
        if (e == null)
        {
            throw new NullPointerException("dsInsert: classifyEventAltDao cannot be null");
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
            throw new NullPointerException("dsUpdate: instanceDao cannot be null");
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
            e = a.getClassificationEventAlternativeDao();
            countQuery = e.queryBuilder().b();
        }
        return flag;
    }


    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[ClassificationEventAlternative.a.values().length];
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.ClassificationEventAlternative.a.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[ClassificationEventAlternative.a.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.ClassificationEventAlternative.a.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[ClassificationEventAlternative.a.d.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
