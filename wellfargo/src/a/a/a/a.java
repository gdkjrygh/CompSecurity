// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a;

import a.a.a.b.b;
import a.a.a.c.f;
import a.a.a.d.e;
import a.a.a.d.g;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package a.a.a:
//            g, d, e, c

public abstract class a
{

    protected final a.a.a.c.a config;
    protected final SQLiteDatabase db;
    protected a.a.a.b.a identityScope;
    protected b identityScopeLong;
    protected final int pkOrdinal;
    protected final c session;
    protected f statements;

    public a(a.a.a.c.a a1)
    {
        this(a1, null);
    }

    public a(a.a.a.c.a a1, c c)
    {
        config = a1;
        session = c;
        db = a1.a;
        identityScope = a1.b();
        if (identityScope instanceof b)
        {
            identityScopeLong = (b)identityScope;
        }
        statements = a1.i;
        int i;
        if (a1.g != null)
        {
            i = a1.g.a;
        } else
        {
            i = -1;
        }
        pkOrdinal = i;
    }

    private void deleteByKeyInsideSynchronized(Object obj, SQLiteStatement sqlitestatement)
    {
        if (obj instanceof Long)
        {
            sqlitestatement.bindLong(1, ((Long)obj).longValue());
        } else
        {
            if (obj == null)
            {
                throw new d("Cannot delete entity, key is null");
            }
            sqlitestatement.bindString(1, obj.toString());
        }
        sqlitestatement.execute();
    }

    private void deleteInTxInternal(Iterable iterable, Iterable iterable1)
    {
        SQLiteStatement sqlitestatement;
        assertSinglePk();
        sqlitestatement = statements.c();
        db.beginTransaction();
        sqlitestatement;
        JVM INSTR monitorenter ;
        if (identityScope == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        identityScope.b();
        arraylist = new ArrayList();
_L14:
        if (iterable == null) goto _L4; else goto _L3
_L3:
        iterable = iterable.iterator();
_L10:
        if (iterable.hasNext()) goto _L5; else goto _L4
_L4:
        if (iterable1 == null) goto _L7; else goto _L6
_L6:
        iterable = iterable1.iterator();
_L12:
        boolean flag = iterable.hasNext();
        if (flag) goto _L8; else goto _L7
_L7:
        if (identityScope != null)
        {
            identityScope.c();
        }
        sqlitestatement;
        JVM INSTR monitorexit ;
        db.setTransactionSuccessful();
        if (arraylist == null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        if (identityScope != null)
        {
            identityScope.a(arraylist);
        }
        db.endTransaction();
        return;
_L5:
        Object obj;
        obj = getKeyVerified((Object)iterable.next());
        deleteByKeyInsideSynchronized(obj, sqlitestatement);
        if (arraylist == null) goto _L10; else goto _L9
_L9:
        arraylist.add(obj);
          goto _L10
        iterable;
        if (identityScope != null)
        {
            identityScope.c();
        }
        throw iterable;
        iterable;
        sqlitestatement;
        JVM INSTR monitorexit ;
        throw iterable;
        iterable;
        db.endTransaction();
        throw iterable;
_L8:
        iterable1 = ((Iterable) ((Object)iterable.next()));
        deleteByKeyInsideSynchronized(iterable1, sqlitestatement);
        if (arraylist == null) goto _L12; else goto _L11
_L11:
        arraylist.add(iterable1);
          goto _L12
_L2:
        arraylist = null;
        if (true) goto _L14; else goto _L13
_L13:
    }

    private long executeInsert(Object obj, SQLiteStatement sqlitestatement)
    {
        if (!db.isDbLockedByCurrentThread()) goto _L2; else goto _L1
_L1:
        sqlitestatement;
        JVM INSTR monitorenter ;
        long l;
        bindValues(sqlitestatement, obj);
        l = sqlitestatement.executeInsert();
        sqlitestatement;
        JVM INSTR monitorexit ;
_L4:
        updateKeyAfterInsertAndAttach(obj, l, true);
        return l;
        obj;
        sqlitestatement;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        db.beginTransaction();
        sqlitestatement;
        JVM INSTR monitorenter ;
        bindValues(sqlitestatement, obj);
        l = sqlitestatement.executeInsert();
        sqlitestatement;
        JVM INSTR monitorexit ;
        db.setTransactionSuccessful();
        db.endTransaction();
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        sqlitestatement;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        db.endTransaction();
        throw obj;
    }

    private void executeInsertInTx(SQLiteStatement sqlitestatement, Iterable iterable, boolean flag)
    {
        db.beginTransaction();
        sqlitestatement;
        JVM INSTR monitorenter ;
        if (identityScope != null)
        {
            identityScope.b();
        }
        iterable = iterable.iterator();
_L1:
        boolean flag1 = iterable.hasNext();
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        if (identityScope != null)
        {
            identityScope.c();
        }
        sqlitestatement;
        JVM INSTR monitorexit ;
        db.setTransactionSuccessful();
        db.endTransaction();
        return;
        Object obj;
        obj = (Object)iterable.next();
        bindValues(sqlitestatement, obj);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        updateKeyAfterInsertAndAttach(obj, sqlitestatement.executeInsert(), false);
          goto _L1
        iterable;
        if (identityScope != null)
        {
            identityScope.c();
        }
        throw iterable;
        iterable;
        sqlitestatement;
        JVM INSTR monitorexit ;
        throw iterable;
        sqlitestatement;
        db.endTransaction();
        throw sqlitestatement;
        sqlitestatement.execute();
          goto _L1
    }

    protected void assertSinglePk()
    {
        if (config.e.length != 1)
        {
            throw new d((new StringBuilder()).append(this).append(" (").append(config.b).append(") does not have a single-column primary key").toString());
        } else
        {
            return;
        }
    }

    protected void attachEntity(Object obj)
    {
    }

    protected final void attachEntity(Object obj, Object obj1, boolean flag)
    {
label0:
        {
            attachEntity(obj1);
            if (identityScope != null && obj != null)
            {
                if (!flag)
                {
                    break label0;
                }
                identityScope.a(obj, obj1);
            }
            return;
        }
        identityScope.b(obj, obj1);
    }

    protected abstract void bindValues(SQLiteStatement sqlitestatement, Object obj);

    public long count()
    {
        return DatabaseUtils.queryNumEntries(db, (new StringBuilder(String.valueOf('\''))).append(config.b).append('\'').toString());
    }

    public void delete(Object obj)
    {
        assertSinglePk();
        deleteByKey(getKeyVerified(obj));
    }

    public void deleteAll()
    {
        db.execSQL((new StringBuilder("DELETE FROM '")).append(config.b).append("'").toString());
        if (identityScope != null)
        {
            identityScope.a();
        }
    }

    public void deleteByKey(Object obj)
    {
        SQLiteStatement sqlitestatement;
        assertSinglePk();
        sqlitestatement = statements.c();
        if (!db.isDbLockedByCurrentThread()) goto _L2; else goto _L1
_L1:
        sqlitestatement;
        JVM INSTR monitorenter ;
        deleteByKeyInsideSynchronized(obj, sqlitestatement);
        sqlitestatement;
        JVM INSTR monitorexit ;
_L4:
        if (identityScope != null)
        {
            identityScope.c(obj);
        }
        return;
        obj;
        sqlitestatement;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        db.beginTransaction();
        sqlitestatement;
        JVM INSTR monitorenter ;
        deleteByKeyInsideSynchronized(obj, sqlitestatement);
        sqlitestatement;
        JVM INSTR monitorexit ;
        db.setTransactionSuccessful();
        db.endTransaction();
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        sqlitestatement;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        db.endTransaction();
        throw obj;
    }

    public void deleteByKeyInTx(Iterable iterable)
    {
        deleteInTxInternal(null, iterable);
    }

    public transient void deleteByKeyInTx(Object aobj[])
    {
        deleteInTxInternal(null, Arrays.asList(aobj));
    }

    public void deleteInTx(Iterable iterable)
    {
        deleteInTxInternal(iterable, null);
    }

    public transient void deleteInTx(Object aobj[])
    {
        deleteInTxInternal(Arrays.asList(aobj), null);
    }

    public boolean detach(Object obj)
    {
        if (identityScope != null)
        {
            Object obj1 = getKeyVerified(obj);
            return identityScope.c(obj1, obj);
        } else
        {
            return false;
        }
    }

    public String[] getAllColumns()
    {
        return config.d;
    }

    public SQLiteDatabase getDatabase()
    {
        return db;
    }

    protected abstract Object getKey(Object obj);

    protected Object getKeyVerified(Object obj)
    {
        Object obj1 = getKey(obj);
        if (obj1 == null)
        {
            if (obj == null)
            {
                throw new NullPointerException("Entity may not be null");
            } else
            {
                throw new d("Entity has no key");
            }
        } else
        {
            return obj1;
        }
    }

    public String[] getNonPkColumns()
    {
        return config.f;
    }

    public String[] getPkColumns()
    {
        return config.e;
    }

    public a.a.a.g getPkProperty()
    {
        return config.g;
    }

    public a.a.a.g[] getProperties()
    {
        return config.c;
    }

    public c getSession()
    {
        return session;
    }

    f getStatements()
    {
        return config.i;
    }

    public String getTablename()
    {
        return config.b;
    }

    public long insert(Object obj)
    {
        return executeInsert(obj, statements.a());
    }

    public void insertInTx(Iterable iterable)
    {
        insertInTx(iterable, isEntityUpdateable());
    }

    public void insertInTx(Iterable iterable, boolean flag)
    {
        executeInsertInTx(statements.a(), iterable, flag);
    }

    public transient void insertInTx(Object aobj[])
    {
        insertInTx(((Iterable) (Arrays.asList(aobj))), isEntityUpdateable());
    }

    public long insertOrReplace(Object obj)
    {
        return executeInsert(obj, statements.b());
    }

    public void insertOrReplaceInTx(Iterable iterable)
    {
        insertOrReplaceInTx(iterable, isEntityUpdateable());
    }

    public void insertOrReplaceInTx(Iterable iterable, boolean flag)
    {
        executeInsertInTx(statements.b(), iterable, flag);
    }

    public transient void insertOrReplaceInTx(Object aobj[])
    {
        insertOrReplaceInTx(((Iterable) (Arrays.asList(aobj))), isEntityUpdateable());
    }

    public long insertWithoutSettingPk(Object obj)
    {
        SQLiteStatement sqlitestatement;
        sqlitestatement = statements.a();
        if (!db.isDbLockedByCurrentThread())
        {
            break MISSING_BLOCK_LABEL_40;
        }
        sqlitestatement;
        JVM INSTR monitorenter ;
        long l;
        bindValues(sqlitestatement, obj);
        l = sqlitestatement.executeInsert();
        sqlitestatement;
        JVM INSTR monitorexit ;
        return l;
        obj;
        sqlitestatement;
        JVM INSTR monitorexit ;
        throw obj;
        db.beginTransaction();
        sqlitestatement;
        JVM INSTR monitorenter ;
        bindValues(sqlitestatement, obj);
        l = sqlitestatement.executeInsert();
        sqlitestatement;
        JVM INSTR monitorexit ;
        db.setTransactionSuccessful();
        db.endTransaction();
        return l;
        obj;
        sqlitestatement;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        db.endTransaction();
        throw obj;
    }

    protected abstract boolean isEntityUpdateable();

    public Object load(Object obj)
    {
        assertSinglePk();
        if (obj != null) goto _L2; else goto _L1
_L1:
        Object obj1 = null;
_L4:
        return obj1;
_L2:
        Object obj2;
        if (identityScope == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = identityScope.a(obj);
        obj1 = obj2;
        if (obj2 != null) goto _L4; else goto _L3
_L3:
        String s = statements.f();
        obj = obj.toString();
        return loadUniqueAndCloseCursor(db.rawQuery(s, new String[] {
            obj
        }));
    }

    public List loadAll()
    {
        return loadAllAndCloseCursor(db.rawQuery(statements.e(), null));
    }

    protected List loadAllAndCloseCursor(Cursor cursor)
    {
        List list = loadAllFromCursor(cursor);
        cursor.close();
        return list;
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    protected List loadAllFromCursor(Cursor cursor)
    {
        int i = cursor.getCount();
        ArrayList arraylist = new ArrayList(i);
        Object obj = cursor;
        if (cursor instanceof CrossProcessCursor)
        {
            CursorWindow cursorwindow = ((CrossProcessCursor)cursor).getWindow();
            obj = cursor;
            boolean flag;
            if (cursorwindow != null)
            {
                if (cursorwindow.getNumRows() == i)
                {
                    obj = new a.a.a.c.b(cursorwindow);
                } else
                {
                    e.a((new StringBuilder("Window vs. result size: ")).append(cursorwindow.getNumRows()).append("/").append(i).toString());
                    obj = cursor;
                }
            }
        }
        if (!((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_144;
        }
        if (identityScope != null)
        {
            identityScope.b();
            identityScope.a(i);
        }
        do
        {
            arraylist.add(loadCurrent(((Cursor) (obj)), 0, false));
            flag = ((Cursor) (obj)).moveToNext();
        } while (flag);
        if (identityScope != null)
        {
            identityScope.c();
        }
        return arraylist;
        cursor;
        if (identityScope != null)
        {
            identityScope.c();
        }
        throw cursor;
    }

    public Object loadByRowId(long l)
    {
        String s = Long.toString(l);
        return loadUniqueAndCloseCursor(db.rawQuery(statements.g(), new String[] {
            s
        }));
    }

    protected final Object loadCurrent(Cursor cursor, int i, boolean flag)
    {
        Object obj = null;
        if (identityScopeLong == null) goto _L2; else goto _L1
_L1:
        if (i == 0 || !cursor.isNull(pkOrdinal + i)) goto _L4; else goto _L3
_L3:
        return obj;
_L4:
        long l;
        l = cursor.getLong(pkOrdinal + i);
        Object obj1;
        if (flag)
        {
            obj1 = identityScopeLong.a(l);
        } else
        {
            obj1 = identityScopeLong.b(l);
        }
        obj = obj1;
        if (obj1 != null) goto _L3; else goto _L5
_L5:
        cursor = ((Cursor) (readEntity(cursor, i)));
        attachEntity(cursor);
        if (flag)
        {
            identityScopeLong.a(l, cursor);
            return cursor;
        } else
        {
            identityScopeLong.b(l, cursor);
            return cursor;
        }
_L2:
        Object obj3;
        if (identityScope == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj3 = readKey(cursor, i);
        if (i != 0 && obj3 == null) goto _L3; else goto _L6
_L6:
        Object obj2;
        if (flag)
        {
            obj2 = identityScope.a(obj3);
        } else
        {
            obj2 = identityScope.b(obj3);
        }
        obj = obj2;
        if (obj2 != null) goto _L3; else goto _L7
_L7:
        cursor = ((Cursor) (readEntity(cursor, i)));
        attachEntity(obj3, cursor, flag);
        return cursor;
        if (i != 0 && readKey(cursor, i) == null) goto _L3; else goto _L8
_L8:
        cursor = ((Cursor) (readEntity(cursor, i)));
        attachEntity(cursor);
        return cursor;
    }

    protected final Object loadCurrentOther(a a1, Cursor cursor, int i)
    {
        return a1.loadCurrent(cursor, i, true);
    }

    protected Object loadUnique(Cursor cursor)
    {
        if (!cursor.moveToFirst())
        {
            return null;
        }
        if (!cursor.isLast())
        {
            throw new d((new StringBuilder("Expected unique result, but count was ")).append(cursor.getCount()).toString());
        } else
        {
            return loadCurrent(cursor, 0, true);
        }
    }

    protected Object loadUniqueAndCloseCursor(Cursor cursor)
    {
        Object obj = loadUnique(cursor);
        cursor.close();
        return obj;
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    public g queryBuilder()
    {
        return g.a(this);
    }

    public transient List queryRaw(String s, String as[])
    {
        return loadAllAndCloseCursor(db.rawQuery((new StringBuilder(String.valueOf(statements.e()))).append(s).toString(), as));
    }

    public transient e queryRawCreate(String s, Object aobj[])
    {
        return queryRawCreateListArgs(s, Arrays.asList(aobj));
    }

    public e queryRawCreateListArgs(String s, Collection collection)
    {
        return e.a(this, (new StringBuilder(String.valueOf(statements.e()))).append(s).toString(), collection.toArray());
    }

    protected abstract Object readEntity(Cursor cursor, int i);

    protected abstract void readEntity(Cursor cursor, Object obj, int i);

    protected abstract Object readKey(Cursor cursor, int i);

    public void refresh(Object obj)
    {
        Object obj1;
        Object obj2;
        assertSinglePk();
        obj1 = getKeyVerified(obj);
        obj2 = statements.f();
        String s = obj1.toString();
        obj2 = db.rawQuery(((String) (obj2)), new String[] {
            s
        });
        if (!((Cursor) (obj2)).moveToFirst())
        {
            throw new d((new StringBuilder("Entity does not exist in the database anymore: ")).append(obj.getClass()).append(" with key ").append(obj1).toString());
        }
        break MISSING_BLOCK_LABEL_98;
        obj;
        ((Cursor) (obj2)).close();
        throw obj;
        if (!((Cursor) (obj2)).isLast())
        {
            throw new d((new StringBuilder("Expected unique result, but count was ")).append(((Cursor) (obj2)).getCount()).toString());
        }
        readEntity(((Cursor) (obj2)), obj, 0);
        attachEntity(obj1, obj, true);
        ((Cursor) (obj2)).close();
        return;
    }

    public void update(Object obj)
    {
        SQLiteStatement sqlitestatement;
        assertSinglePk();
        sqlitestatement = statements.d();
        if (!db.isDbLockedByCurrentThread())
        {
            break MISSING_BLOCK_LABEL_39;
        }
        sqlitestatement;
        JVM INSTR monitorenter ;
        updateInsideSynchronized(obj, sqlitestatement, true);
        sqlitestatement;
        JVM INSTR monitorexit ;
        return;
        obj;
        sqlitestatement;
        JVM INSTR monitorexit ;
        throw obj;
        db.beginTransaction();
        sqlitestatement;
        JVM INSTR monitorenter ;
        updateInsideSynchronized(obj, sqlitestatement, true);
        sqlitestatement;
        JVM INSTR monitorexit ;
        db.setTransactionSuccessful();
        db.endTransaction();
        return;
        obj;
        sqlitestatement;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        db.endTransaction();
        throw obj;
    }

    public void updateInTx(Iterable iterable)
    {
        SQLiteStatement sqlitestatement;
        sqlitestatement = statements.d();
        db.beginTransaction();
        sqlitestatement;
        JVM INSTR monitorenter ;
        if (identityScope != null)
        {
            identityScope.b();
        }
        iterable = iterable.iterator();
_L1:
        boolean flag = iterable.hasNext();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        if (identityScope != null)
        {
            identityScope.c();
        }
        sqlitestatement;
        JVM INSTR monitorexit ;
        db.setTransactionSuccessful();
        db.endTransaction();
        return;
        updateInsideSynchronized((Object)iterable.next(), sqlitestatement, false);
          goto _L1
        iterable;
        if (identityScope != null)
        {
            identityScope.c();
        }
        throw iterable;
        iterable;
        sqlitestatement;
        JVM INSTR monitorexit ;
        throw iterable;
        iterable;
        db.endTransaction();
        throw iterable;
    }

    public transient void updateInTx(Object aobj[])
    {
        updateInTx(((Iterable) (Arrays.asList(aobj))));
    }

    protected void updateInsideSynchronized(Object obj, SQLiteStatement sqlitestatement, boolean flag)
    {
        bindValues(sqlitestatement, obj);
        int i = config.d.length + 1;
        Object obj1 = getKey(obj);
        if (obj1 instanceof Long)
        {
            sqlitestatement.bindLong(i, ((Long)obj1).longValue());
        } else
        {
            if (obj1 == null)
            {
                throw new d("Cannot update entity without key - was it inserted before?");
            }
            sqlitestatement.bindString(i, obj1.toString());
        }
        sqlitestatement.execute();
        attachEntity(obj1, obj, flag);
    }

    protected abstract Object updateKeyAfterInsert(Object obj, long l);

    protected void updateKeyAfterInsertAndAttach(Object obj, long l, boolean flag)
    {
        if (l != -1L)
        {
            attachEntity(updateKeyAfterInsert(obj, l), obj, flag);
            return;
        } else
        {
            e.c("Could not insert row (executeInsert returned -1)");
            return;
        }
    }
}
