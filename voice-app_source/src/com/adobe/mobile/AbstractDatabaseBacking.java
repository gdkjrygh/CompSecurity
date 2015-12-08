// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods

abstract class AbstractDatabaseBacking
{
    protected static class CorruptedDatabaseException extends Exception
    {

        public CorruptedDatabaseException(String s)
        {
            super(s);
        }
    }


    private File _dbFile;
    protected SQLiteDatabase database;
    protected final Object dbMutex = new Object();

    AbstractDatabaseBacking()
    {
        _dbFile = null;
    }

    private void createDatabase()
    {
        try
        {
            database = SQLiteDatabase.openDatabase(_dbFile.getPath(), null, 0x10000010);
            return;
        }
        catch (SQLException sqlexception)
        {
            StaticMethods.logErrorFormat("Analytics - Unable to open database(%s).", new Object[] {
                sqlexception.getLocalizedMessage()
            });
        }
    }

    protected void initDatabaseBacking(File file)
    {
        _dbFile = file;
        synchronized (dbMutex)
        {
            preMigrate();
            createDatabase();
            if (database != null)
            {
                postMigrate();
                initializeDatabase();
                prepareStatements();
            }
        }
        return;
        exception;
        file;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected abstract void initializeDatabase();

    protected void postMigrate()
    {
    }

    protected void postReset()
    {
    }

    protected void preMigrate()
    {
    }

    protected abstract void prepareStatements();

    protected final void resetDatabase(Exception exception)
    {
        StaticMethods.logErrorFormat("Analytics - Database in unrecoverable state(%s), resetting.", new Object[] {
            exception.getLocalizedMessage()
        });
        exception = ((Exception) (dbMutex));
        exception;
        JVM INSTR monitorenter ;
        if (_dbFile.delete())
        {
            break MISSING_BLOCK_LABEL_71;
        }
        StaticMethods.logDebugFormat("Analytics - Database file(%s) was not found.", new Object[] {
            _dbFile.getAbsolutePath()
        });
_L2:
        createDatabase();
        initializeDatabase();
        prepareStatements();
        postReset();
        return;
        StaticMethods.logDebugFormat("Analytics - Database file(%s) was corrupt and had to be deleted.", new Object[] {
            _dbFile.getAbsolutePath()
        });
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception1;
        exception1;
        exception;
        JVM INSTR monitorexit ;
        throw exception1;
    }
}
