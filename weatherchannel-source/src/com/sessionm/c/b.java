// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Base64;
import android.util.Log;
import com.sessionm.core.h;
import com.sessionm.net.Request;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.sessionm.c:
//            c

public class b extends SQLiteOpenHelper
    implements c
{

    private static final String TAG = "SessionM.Store";
    private static final int cx = 50000;
    private static final String it = "requests";
    private static final String iu = "CREATE TABLE requests(id INTEGER PRIMARY KEY AUTOINCREMENT, uniqueId TEXT, data BLOB);";
    private static boolean iw;
    private long iv;

    public b(Context context, String s1)
    {
        super(context, s1, null, 1);
        iv = 50000L;
        if (context == null)
        {
            throw new NullPointerException("Store context must not be null.");
        } else
        {
            return;
        }
    }

    public static void i(boolean flag)
    {
        iw = flag;
    }

    public long bF()
    {
        long l1;
        SQLiteDatabase sqlitedatabase = getReadableDatabase();
        File file = new File(sqlitedatabase.getPath());
        sqlitedatabase.close();
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_45;
        }
        l1 = file.length();
        return l1;
        SQLException sqlexception;
        sqlexception;
        Log.e("SessionM.Store", "Error getting db size", sqlexception);
        return -1L;
    }

    public long getSize()
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = getReadableDatabase();
        long l1;
        l1 = DatabaseUtils.queryNumEntries(sqlitedatabase, "requests");
        sqlitedatabase.close();
_L2:
        this;
        JVM INSTR monitorexit ;
        return l1;
        Object obj;
        obj;
        if (Log.isLoggable("SessionM.Store", 6))
        {
            Log.e("SessionM.Store", "error opening db.", ((Throwable) (obj)));
        }
        l1 = -1L;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    public boolean l(Request request)
    {
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = false;
        boolean flag2 = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag3 = iw;
        if (!flag3) goto _L2; else goto _L1
_L1:
        flag = flag2;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (request != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        flag = flag2;
        if (!Log.isLoggable("SessionM", 6)) goto _L4; else goto _L3
_L3:
        Log.d("SessionM", "Attempt to save null request. ");
        flag = flag2;
          goto _L4
        request;
        throw request;
        if (request.bd() == null || request.bd().equals(com.sessionm.net.Request.State.gG))
        {
            break MISSING_BLOCK_LABEL_127;
        }
        flag = flag2;
        if (!Log.isLoggable("SessionM", 5)) goto _L4; else goto _L5
_L5:
        Log.e("SessionM", String.format("Attempt to save in-flight request: %s", new Object[] {
            request
        }));
        flag = flag2;
          goto _L4
        if (request.ba() == null)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        flag = flag2;
        if (!Log.isLoggable("SessionM", 6)) goto _L4; else goto _L6
_L6:
        Log.e("SessionM", (new StringBuilder()).append("Object already in a request store: ").append(request.ba()).toString());
        flag = flag2;
          goto _L4
        if (getSize() + 1L <= iv)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        flag = flag2;
        if (!Log.isLoggable("SessionM", 5)) goto _L4; else goto _L7
_L7:
        Log.w("SessionM", "queue is full dropping this object.");
        flag = flag2;
          goto _L4
        if (Log.isLoggable("SessionM.Store", 3))
        {
            Log.d("SessionM.Store", String.format("Inserting request: %s into store: %s", new Object[] {
                request, this
            }));
        }
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        Object obj2 = new ObjectOutputStream(bytearrayoutputstream);
        Object obj = obj2;
        ((ObjectOutput) (obj2)).writeObject(request);
        obj = obj2;
        String s1 = Base64.encodeToString(bytearrayoutputstream.toByteArray(), 0);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        ((ObjectOutput) (obj2)).close();
        bytearrayoutputstream.close();
        obj = s1;
_L9:
        obj2 = new ContentValues();
        ((ContentValues) (obj2)).put("data", ((String) (obj)));
        ((ContentValues) (obj2)).put("uniqueid", request.getID());
        long l1 = -1L;
        long l2 = sqlitedatabase.insertOrThrow("requests", null, ((ContentValues) (obj2)));
        sqlitedatabase.close();
        l1 = l2;
_L11:
        if (Log.isLoggable("SessionM.Store", 3))
        {
            Log.d("SessionM.Store", String.format("Inserted row with id: %d successfully.", new Object[] {
                Long.valueOf(l1)
            }));
        }
        request.c(this);
          goto _L4
        request;
        flag = flag2;
        if (!Log.isLoggable("SessionM.Store", 6)) goto _L4; else goto _L8
_L8:
        Log.e("SessionM.Store", "error opening db.", request);
        flag = flag2;
          goto _L4
        obj;
        if (sqlitedatabase.isOpen())
        {
            sqlitedatabase.close();
        }
        if (Log.isLoggable("SessionM.Store", 6))
        {
            Log.e("SessionM.Store", "Error closing streams.", ((Throwable) (obj)));
        }
        obj = s1;
          goto _L9
        IOException ioexception;
        ioexception;
        obj2 = null;
_L13:
        obj = obj2;
        if (!Log.isLoggable("SessionM.Store", 6))
        {
            break MISSING_BLOCK_LABEL_510;
        }
        obj = obj2;
        Log.e("SessionM.Store", "Error serializing request.", ioexception);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_520;
        }
        ((ObjectOutput) (obj2)).close();
        bytearrayoutputstream.close();
        flag = false;
        obj = "";
          goto _L9
        obj;
        if (sqlitedatabase.isOpen())
        {
            sqlitedatabase.close();
        }
        if (Log.isLoggable("SessionM.Store", 6))
        {
            Log.e("SessionM.Store", "Error closing streams.", ((Throwable) (obj)));
        }
        flag = false;
        obj = "";
          goto _L9
        request;
        obj = null;
_L12:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_589;
        }
        ((ObjectOutput) (obj)).close();
        bytearrayoutputstream.close();
_L10:
        throw request;
        Object obj1;
        obj1;
        if (sqlitedatabase.isOpen())
        {
            sqlitedatabase.close();
        }
        if (Log.isLoggable("SessionM.Store", 6))
        {
            Log.e("SessionM.Store", "Error closing streams.", ((Throwable) (obj1)));
        }
          goto _L10
        obj1;
        if (Log.isLoggable("SessionM.Store", 6))
        {
            Log.e("SessionM.Store", "Error saving request", ((Throwable) (obj1)));
        }
        sqlitedatabase.close();
        flag = flag1;
          goto _L11
        request;
        sqlitedatabase.close();
        throw request;
        request;
          goto _L12
        ioexception;
          goto _L13
    }

    public boolean m(Request request)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag = iw;
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (request != null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        flag = flag1;
        if (!Log.isLoggable("SessionM.Store", 6)) goto _L4; else goto _L3
_L3:
        Log.e("SessionM.Store", "Attempt to delete null request from store.");
        flag = flag1;
          goto _L4
        request;
        throw request;
        if (request.ba().equals(this))
        {
            break MISSING_BLOCK_LABEL_113;
        }
        flag = flag1;
        if (!Log.isLoggable("SessionM.Store", 6)) goto _L4; else goto _L5
_L5:
        Log.e("SessionM.Store", String.format("Request is saved to a different store. %s", new Object[] {
            request
        }));
        flag = flag1;
          goto _L4
        if (request.bd() == com.sessionm.net.Request.State.gH && Log.isLoggable("SessionM.Store", 6))
        {
            Log.e("SessionM.Store", String.format("Attempting to delete in-flight request. %s", new Object[] {
                request
            }));
        }
        if (Log.isLoggable("SessionM.Store", 3))
        {
            Log.d("SessionM.Store", String.format("Deleting request: %s from store: %s", new Object[] {
                request, this
            }));
        }
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        StringBuilder stringbuilder;
        int k;
        stringbuilder = new StringBuilder();
        stringbuilder.append("uniqueId IN (");
        k = request.bc();
        if (k != 1) goto _L7; else goto _L6
_L6:
        String as[];
        as = new String[1];
        stringbuilder.append("?");
        as[0] = request.getID();
_L12:
        int j;
        stringbuilder.append(")");
        j = sqlitedatabase.delete("requests", stringbuilder.toString(), as);
        if (j == k)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        if (Log.isLoggable("SessionM.Store", 6))
        {
            Log.e("SessionM.Store", String.format(Locale.US, "Deleted wrong number of requests from store. Expected %d actual: %d.", new Object[] {
                Integer.valueOf(k), Integer.valueOf(j)
            }));
        }
        sqlitedatabase.close();
        if (Log.isLoggable("SessionM.Store", 3))
        {
            Log.d("SessionM.Store", String.format(Locale.US, "removed %d rows from the db", new Object[] {
                Integer.valueOf(j)
            }));
        }
        request.c(null);
        flag = true;
          goto _L4
        request;
        flag = flag1;
        if (!Log.isLoggable("SessionM.Store", 6)) goto _L4; else goto _L8
_L8:
        Log.e("SessionM.Store", "error opening db.", request);
        flag = flag1;
          goto _L4
_L7:
        if (k <= 1) goto _L10; else goto _L9
_L9:
        List list;
        list = request.bb();
        as = new String[k];
        j = 0;
_L14:
        if (j >= list.size()) goto _L12; else goto _L11
_L11:
        Request request1 = (Request)list.get(j);
        stringbuilder.append("?");
        as[j] = request1.getID();
        if (j >= k - 1)
        {
            break MISSING_BLOCK_LABEL_536;
        }
        stringbuilder.append(",");
        break MISSING_BLOCK_LABEL_536;
_L10:
        if (k != 0)
        {
            break MISSING_BLOCK_LABEL_531;
        }
        flag = flag1;
        if (!Log.isLoggable("SessionM.Store", 6)) goto _L4; else goto _L13
_L13:
        Log.e("SessionM.Store", String.format(Locale.US, "Request should have at least one linked request: %s", new Object[] {
            request
        }));
        flag = flag1;
          goto _L4
        as = null;
          goto _L12
        j++;
          goto _L14
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        this;
        JVM INSTR monitorenter ;
        sqlitedatabase.execSQL("CREATE TABLE requests(id INTEGER PRIMARY KEY AUTOINCREMENT, uniqueId TEXT, data BLOB);");
        if (Log.isLoggable("SessionM", 3))
        {
            Log.d("SessionM", "SessionM store created successfully");
        }
        this;
        JVM INSTR monitorexit ;
        return;
        sqlitedatabase;
        throw sqlitedatabase;
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public List r(int j)
    {
        Object obj2 = null;
        this;
        JVM INSTR monitorenter ;
        boolean flag = iw;
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L6:
        this;
        JVM INSTR monitorexit ;
        return ((List) (obj));
_L2:
        SQLiteDatabase sqlitedatabase = getReadableDatabase();
        ArrayList arraylist;
        Cursor cursor;
        obj = (new StringBuilder()).append("").append(j).toString();
        cursor = sqlitedatabase.query("requests", new String[] {
            "data"
        }, null, null, null, null, "id", ((String) (obj)));
        arraylist = new ArrayList();
_L5:
        if (!cursor.moveToNext()) goto _L4; else goto _L3
_L3:
        ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(Base64.decode(cursor.getBlob(0), 0));
        Object obj1 = new ObjectInputStream(bytearrayinputstream);
        obj = obj1;
        Request request = (Request)((ObjectInputStream) (obj1)).readObject();
        obj = obj1;
        request.c(this);
        obj = obj1;
        arraylist.add(request);
        h.a(((java.io.Closeable) (obj1)));
        h.a(bytearrayinputstream);
          goto _L5
        obj;
        throw obj;
        obj;
        if (Log.isLoggable("SessionM.Store", 6))
        {
            Log.e("SessionM.Store", "error opening db.", ((Throwable) (obj)));
        }
        obj = null;
          goto _L6
        obj1;
        obj = obj2;
_L9:
        if (Log.isLoggable("SessionM.Store", 6))
        {
            Log.e("SessionM.Store", "Error deserializing request object.", ((Throwable) (obj1)));
        }
        h.a(((java.io.Closeable) (obj)));
        h.a(bytearrayinputstream);
_L4:
        cursor.close();
        sqlitedatabase.close();
        obj = arraylist;
          goto _L6
        Object obj3;
        obj3;
        obj1 = null;
_L8:
        obj = obj1;
        if (!Log.isLoggable("SessionM.Store", 6))
        {
            break MISSING_BLOCK_LABEL_276;
        }
        obj = obj1;
        Log.e("SessionM.Store", "Error finding class for deserialized object.", ((Throwable) (obj3)));
        h.a(((java.io.Closeable) (obj1)));
        h.a(bytearrayinputstream);
          goto _L4
_L7:
        h.a(((java.io.Closeable) (obj)));
        h.a(bytearrayinputstream);
        throw obj1;
        obj1;
          goto _L7
        obj1;
          goto _L7
        obj3;
          goto _L8
        obj3;
        obj = obj1;
        obj1 = obj3;
          goto _L9
        obj1;
        obj = null;
          goto _L7
    }

    public boolean removeAll()
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        sqlitedatabase.delete("requests", null, null);
        sqlitedatabase.close();
        boolean flag = true;
_L2:
        this;
        JVM INSTR monitorexit ;
        return flag;
        Object obj;
        obj;
        if (Log.isLoggable("SessionM.Store", 6))
        {
            Log.e("SessionM.Store", "error opening db.", ((Throwable) (obj)));
        }
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    public void s(int j)
    {
        iv = j;
    }
}
