// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.kofax.kmc.kut.utilities.AppContextProvider;
import com.kofax.kmc.kut.utilities.appstats.greendao.DaoMaster;
import com.kofax.kmc.kut.utilities.appstats.greendao.DaoSession;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.io.File;
import java.util.UUID;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats:
//            AppStatsDataStore

public class AppStatsGreenDaoDs extends AppStatsDataStore
{

    private static final String a = "AppStatsGreenDaoDs";
    private DaoMaster b;
    private SQLiteDatabase c;
    private com.kofax.kmc.kut.utilities.appstats.greendao.DaoMaster.OpenHelper d;
    private DaoSession e;

    private AppStatsGreenDaoDs()
    {
        b = null;
        c = null;
        d = null;
        e = null;
    }

    AppStatsGreenDaoDs(_cls1 _pcls1)
    {
        this();
    }

    public static AppStatsGreenDaoDs getInstance()
    {
        return a.a;
    }

    public void close()
    {
        if (c == null)
        {
            throw new UnsupportedOperationException("Attempt to close AppStatsGreenDaoDs when it's not open");
        } else
        {
            c.close();
            b = null;
            e = null;
            c = null;
            dsUniqueId = "";
            d = null;
            return;
        }
    }

    protected void finalize()
    {
        close();
    }

    public Object getDsHandle()
    {
        if (e == null)
        {
            throw new NullPointerException("getDsHandle: daoSession is null");
        } else
        {
            return e;
        }
    }

    public boolean isOpen()
    {
        return c != null;
    }

    public void open()
    {
        if (super.getDsFilePath().isEmpty())
        {
            throw new UnsupportedOperationException("Attempt to open AppStatsGreenDaoDs with no datastore path specified");
        }
        if (c != null)
        {
            return;
        }
        if (d == null)
        {
            throw new NullPointerException("open(): DevOpenHelper helper is null");
        }
        if (b != null || e != null)
        {
            throw new UnsupportedOperationException("open(): daoMaster or daoSession is already instantiated; null value expected");
        } else
        {
            c = d.getWritableDatabase();
            super.setDsFilePath(c.getPath());
            b = new DaoMaster(c);
            e = b.newSession();
            return;
        }
    }

    public void open(String s)
    {
        if (d == null)
        {
            d = new com.kofax.kmc.kut.utilities.appstats.greendao.DaoMaster.DevOpenHelper(AppContextProvider.getContext(), (new File(s)).getName(), null);
        }
        super.setDsFilePath(s);
        c = null;
        b = null;
        e = null;
        open();
        dsUniqueId = UUID.randomUUID().toString();
    }

    public void remove()
    {
        if (c != null)
        {
            throw new UnsupportedOperationException("Attempt to remove AppStatsGreenDaoDs when it's still open");
        }
        String s = super.getDsFilePath();
        if (s == null || s.isEmpty())
        {
            throw new IllegalThreadStateException("Attempt to remove AppStatsGreenDaoDs when no database path exists");
        } else
        {
            boolean flag = AppContextProvider.getContext().deleteDatabase(s);
            Log.d("AppStatsGreenDaoDs", (new StringBuilder()).append("delete database: ").append(s).append(" = ").append(flag).toString());
            super.remove(new String[] {
                (new StringBuilder()).append(s).append("-journal").toString()
            });
            c = null;
            return;
        }
    }

    public void upgrade(String s)
    {
        try
        {
            File file = AppContextProvider.getContext().getDatabasePath(s);
            if (file.isFile() && file.exists())
            {
                open(s);
                close();
                return;
            }
        }
        catch (KmcRuntimeException kmcruntimeexception)
        {
            if (kmcruntimeexception.getErrorInfo() == ErrorInfo.KMC_UT_STATS_DATASTORE_OUT_OF_DATE)
            {
                d = new com.kofax.kmc.kut.utilities.appstats.greendao.DaoMaster.DaoMasterUpgradeHelper(AppContextProvider.getContext(), (new File(s)).getName(), null);
                open(s);
                close();
                return;
            } else
            {
                throw kmcruntimeexception;
            }
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_DATASTORE_UPGRADE_MISSING_FILE);
    }

    private class a
    {

        public static final AppStatsGreenDaoDs a = new AppStatsGreenDaoDs(null);


        private a()
        {
        }
    }

}
