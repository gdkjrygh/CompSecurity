// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            AppStatsGreenDaoUpgradeBase, EnvironmentDao, InstanceDao, CaptureEventDao, 
//            FieldChangeEventDao, DocumentDao, ImageDao, ImageProcessorEventDao, 
//            SessionEventDao, OCREventDao, AppStatsGreenDaoUpgrade

public class  extends AppStatsGreenDaoUpgradeBase
{

    public AppStatsGreenDaoUpgrade getPrevGreenDaoUpgradeObject()
    {
        return null;
    }

    public int getVersionICanUpgradeFrom()
    {
        return 1;
    }

    public int getVersionICanUpgradeTo()
    {
        return 2;
    }

    public int upgradeOldToNewSchema(SQLiteDatabase sqlitedatabase, int i)
    {
        prepareUpgrade(sqlitedatabase, i);
        sqlitedatabase.execSQL("ALTER TABLE ENVIRONMENT RENAME TO Environment_V1");
        EnvironmentDao.createTable(sqlitedatabase, false);
        sqlitedatabase.execSQL("INSERT INTO Environment(ID, EnvTime, DeviceID, Manufacturer, Model, Memory, OSVersion, Language, SDKVersion, TimeZone, Carrier, OSName) SELECT ID, EnvTime, DeviceID, Manufacturer, Model, Memory, Recommendation, Language, SDKVersion, TimeZone, Carrier, OSName FROM Environment_V1");
        sqlitedatabase.execSQL("DROP TABLE Environment_V1");
        sqlitedatabase.execSQL("ALTER TABLE ERROR_LOG RENAME TO ErrorLog");
        sqlitedatabase.execSQL("ALTER TABLE ErrorLog ADD COLUMN SessionKey TEXT");
        sqlitedatabase.execSQL("ALTER TABLE INSTANCE RENAME TO Instance_V1");
        InstanceDao.createTable(sqlitedatabase, false);
        sqlitedatabase.execSQL("INSERT INTO Instance(InstanceID, EnvironmentID, CreationTime, DismissalTime, InstanceType) SELECT InstanceID, EnvironmentID, CreationTime, DismissalTime, InstanceType FROM Instance_V1");
        sqlitedatabase.execSQL("DROP TABLE Instance_V1");
        sqlitedatabase.execSQL("ALTER TABLE CLASSIFICATION_EVENT RENAME TO ClassificationEvent");
        sqlitedatabase.execSQL("ALTER TABLE ClassificationEvent ADD COLUMN ImageID TEXT");
        sqlitedatabase.execSQL("ALTER TABLE ClassificationEvent ADD COLUMN DocumentID TEXT");
        sqlitedatabase.execSQL("ALTER TABLE ClassificationEvent ADD COLUMN SessionKey TEXT");
        sqlitedatabase.execSQL("ALTER TABLE CLASSIFICATION_EVENT_ALTERNATIVE RENAME TO ClassificationEventAlternative");
        sqlitedatabase.execSQL("ALTER TABLE CAPTURE_EVENT RENAME TO CaptureEvent");
        sqlitedatabase.execSQL("ALTER TABLE CaptureEvent RENAME TO CaptureEvent_V1");
        CaptureEventDao.createTable(sqlitedatabase, false);
        sqlitedatabase.execSQL("INSERT INTO CaptureEvent(ID, InstanceID, EventTime, EventType, Value) SELECT ID, InstanceID, EventTime, EventType, ResultCode FROM CaptureEvent_V1");
        sqlitedatabase.execSQL("DROP TABLE CaptureEvent_V1");
        sqlitedatabase.execSQL("ALTER TABLE FIELD_CHANGE_EVENT RENAME TO FieldChangeEvent");
        sqlitedatabase.execSQL("ALTER TABLE FieldChangeEvent RENAME TO FieldChangeEvent_V1");
        FieldChangeEventDao.createTable(sqlitedatabase, false);
        sqlitedatabase.execSQL("INSERT INTO FieldChangeEvent(ID, DocumentID, EventTime, OriginalValue, ChangedValue, FieldName, IsValid) SELECT ID, EnvironmentID, EventTime, OriginalValue, ChangedValue, FieldName, IsValid FROM FieldChangeEvent_V1");
        sqlitedatabase.execSQL("DROP TABLE FieldChangeEvent_V1");
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("DocumentID", (String)null);
        contentvalues.put("ErrorDescription", "");
        sqlitedatabase.update("FieldChangeEvent", contentvalues, null, null);
        sqlitedatabase.execSQL("ALTER TABLE PropertyChangeEvent ADD COLUMN SessionKey TEXT");
        DocumentDao.createTable(sqlitedatabase, false);
        ImageDao.createTable(sqlitedatabase, false);
        ImageProcessorEventDao.createTable(sqlitedatabase, false);
        SessionEventDao.createTable(sqlitedatabase, false);
        OCREventDao.createTable(sqlitedatabase, false);
        return getVersionICanUpgradeTo();
    }

    protected ()
    {
    }
}
