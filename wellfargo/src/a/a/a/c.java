// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a;

import a.a.a.a.e;
import a.a.a.d.g;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

// Referenced classes of package a.a.a:
//            d, a

public class c
{

    private final SQLiteDatabase db;
    private final Map entityToDao = new HashMap();

    public c(SQLiteDatabase sqlitedatabase)
    {
        db = sqlitedatabase;
    }

    public Object callInTx(Callable callable)
    {
        db.beginTransaction();
        callable = ((Callable) (callable.call()));
        db.setTransactionSuccessful();
        db.endTransaction();
        return callable;
        callable;
        db.endTransaction();
        throw callable;
    }

    public Object callInTxNoException(Callable callable)
    {
        db.beginTransaction();
        callable = ((Callable) (callable.call()));
        db.setTransactionSuccessful();
        db.endTransaction();
        return callable;
        callable;
        throw new d("Callable failed", callable);
        callable;
        db.endTransaction();
        throw callable;
    }

    public void delete(Object obj)
    {
        getDao(obj.getClass()).delete(obj);
    }

    public void deleteAll(Class class1)
    {
        getDao(class1).deleteAll();
    }

    public a getDao(Class class1)
    {
        a a1 = (a)entityToDao.get(class1);
        if (a1 == null)
        {
            throw new d((new StringBuilder("No DAO registered for ")).append(class1).toString());
        } else
        {
            return a1;
        }
    }

    public SQLiteDatabase getDatabase()
    {
        return db;
    }

    public long insert(Object obj)
    {
        return getDao(obj.getClass()).insert(obj);
    }

    public long insertOrReplace(Object obj)
    {
        return getDao(obj.getClass()).insertOrReplace(obj);
    }

    public Object load(Class class1, Object obj)
    {
        return getDao(class1).load(obj);
    }

    public List loadAll(Class class1)
    {
        return getDao(class1).loadAll();
    }

    public g queryBuilder(Class class1)
    {
        return getDao(class1).queryBuilder();
    }

    public transient List queryRaw(Class class1, String s, String as[])
    {
        return getDao(class1).queryRaw(s, as);
    }

    public void refresh(Object obj)
    {
        getDao(obj.getClass()).refresh(obj);
    }

    protected void registerDao(Class class1, a a1)
    {
        entityToDao.put(class1, a1);
    }

    public void runInTx(Runnable runnable)
    {
        db.beginTransaction();
        runnable.run();
        db.setTransactionSuccessful();
        db.endTransaction();
        return;
        runnable;
        db.endTransaction();
        throw runnable;
    }

    public e startAsyncSession()
    {
        return new e(this);
    }

    public void update(Object obj)
    {
        getDao(obj.getClass()).update(obj);
    }
}
