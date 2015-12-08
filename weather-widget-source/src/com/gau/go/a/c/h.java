// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a.c;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.gau.go.a.a.a;
import com.gau.go.a.a.c;
import com.gau.go.a.b;
import com.gau.go.a.f.e;
import com.gau.go.launcherex.gowidget.weatherwidget.StaticDataContentProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.gau.go.a.c:
//            a, i, j

public class h
{

    private Context a;
    private com.gau.go.a.c.a b;
    private boolean c;
    private ExecutorService d;

    public h(Context context)
    {
        c = false;
        a = context;
        d = Executors.newSingleThreadExecutor();
    }

    static Context a(h h1)
    {
        return h1.a;
    }

    static boolean a(h h1, boolean flag)
    {
        h1.c = flag;
        return flag;
    }

    static com.gau.go.a.c.a b(h h1)
    {
        return h1.f();
    }

    private com.gau.go.a.c.a f()
    {
        this;
        JVM INSTR monitorenter ;
        com.gau.go.a.c.a a1;
        if (b == null)
        {
            b = new com.gau.go.a.c.a(a);
        }
        a1 = b;
        this;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    public LinkedList a(String s)
    {
        Cursor cursor = null;
        Object obj = a.getContentResolver().query(StaticDataContentProvider.a, null, (new StringBuilder()).append("funid IN (").append(s).append(")").toString(), null, (new StringBuilder()).append(com.gau.go.a.c.a.e).append(" DESC limit ").append(300).toString());
        cursor = ((Cursor) (obj));
        if (cursor != null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        com.gau.go.a.f.e.a((new StringBuilder()).append("Query Post Data In funid:").append(s).append(" and data Count:").append(cursor.getCount()).toString());
        obj = new LinkedList();
        cursor.moveToPosition(-1);
_L4:
        s = ((String) (obj));
        if (!cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = new c();
        s.a(cursor);
        ((LinkedList) (obj)).add(s);
        if (true) goto _L4; else goto _L3
        s;
        s = ((String) (obj));
_L10:
        com.gau.go.a.f.e.a("contentProvider exception");
        obj = s;
        if (cursor != null)
        {
            cursor.close();
            obj = s;
        }
_L6:
        return ((LinkedList) (obj));
_L2:
        if (c && cursor == null)
        {
            try
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unknown URL").append(StaticDataContentProvider.a).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s = null;
            }
            finally { }
            continue; /* Loop/switch isn't completed */
        }
        s = null;
_L3:
        obj = s;
        if (cursor == null) goto _L6; else goto _L5
_L5:
        cursor.close();
        return s;
        s;
        cursor = null;
_L8:
        if (cursor != null)
        {
            cursor.close();
        }
        throw s;
        s;
        if (true) goto _L8; else goto _L7
_L7:
        s;
        s = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public LinkedList a(HashSet hashset)
    {
        Object obj = new LinkedList();
        Object obj1;
        Object obj2;
        Cursor cursor;
        Exception exception;
        if (hashset != null && hashset.size() > 0)
        {
            obj2 = new StringBuffer("funid IN (");
            String s;
            for (hashset = hashset.iterator(); hashset.hasNext(); ((StringBuffer) (obj2)).append((new StringBuilder()).append(s).append(",").toString()))
            {
                s = (String)hashset.next();
            }

            ((StringBuffer) (obj2)).deleteCharAt(((StringBuffer) (obj2)).length() - 1);
            ((StringBuffer) (obj2)).append(")");
        } else
        {
            obj2 = null;
        }
        if (obj2 == null)
        {
            return ((LinkedList) (obj));
        }
        hashset = a.getContentResolver().query(StaticDataContentProvider.a, null, ((StringBuffer) (obj2)).toString(), null, (new StringBuilder()).append(com.gau.go.a.c.a.e).append(" DESC limit ").append(300).toString());
        if (hashset == null) goto _L2; else goto _L1
_L1:
        hashset.moveToPosition(-1);
        for (; hashset.moveToNext(); ((LinkedList) (obj)).add(obj1))
        {
            obj1 = new c();
            ((c) (obj1)).a(hashset);
        }

          goto _L3
        exception;
        obj1 = hashset;
_L16:
        cursor = f().a(com.gau.go.a.c.a.a, null, ((StringBuffer) (obj2)).toString(), null, (new StringBuilder()).append(com.gau.go.a.c.a.e).append(" DESC limit ").append(300).toString());
        hashset = ((HashSet) (obj));
        if (cursor == null) goto _L5; else goto _L4
_L4:
        hashset = ((HashSet) (obj));
        obj1 = cursor;
        obj2 = obj;
        if (cursor.getCount() <= 0) goto _L5; else goto _L6
_L6:
        obj1 = cursor;
        obj2 = obj;
        hashset = new LinkedList();
        obj1 = cursor;
        cursor.moveToPosition(-1);
_L7:
        obj1 = cursor;
        if (!cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = cursor;
        obj = new c();
        obj1 = cursor;
        ((c) (obj)).a(cursor);
        obj1 = cursor;
        hashset.add(obj);
        if (true) goto _L7; else goto _L5
        obj;
        obj2 = hashset;
        hashset = ((HashSet) (obj));
_L14:
        obj1 = cursor;
        com.gau.go.a.f.e.a(hashset);
        hashset = ((HashSet) (obj2));
_L11:
        obj = hashset;
        if (cursor != null)
        {
            cursor.close();
            obj = hashset;
        }
_L8:
        return ((LinkedList) (obj));
_L3:
        com.gau.go.a.f.e.a((new StringBuilder()).append("Query post data:").append(((StringBuffer) (obj2)).toString()).append(",data count:").append(hashset.getCount()).toString());
_L10:
        if (hashset != null)
        {
            hashset.close();
        }
        if (true) goto _L8; else goto _L2
_L2:
        if (!c || hashset != null) goto _L10; else goto _L9
_L9:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown URL").append(StaticDataContentProvider.a).toString());
        obj1;
        obj = hashset;
        hashset = ((HashSet) (obj1));
_L12:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw hashset;
_L5:
        obj1 = cursor;
        obj2 = hashset;
        com.gau.go.a.f.e.a(exception);
          goto _L11
        hashset;
        obj = null;
          goto _L12
        hashset;
        obj = obj1;
          goto _L12
        hashset;
        if (true) goto _L14; else goto _L13
_L13:
        exception;
        obj1 = null;
        if (true) goto _L16; else goto _L15
_L15:
    }

    public Map a()
    {
        Object obj;
        HashMap hashmap;
        obj = null;
        hashmap = new HashMap();
        Cursor cursor = a.getContentResolver().query(StaticDataContentProvider.c, null, null, null, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        obj = cursor;
        if (cursor.getCount() <= 0) goto _L2; else goto _L3
_L3:
        obj = cursor;
        cursor.moveToPosition(-1);
_L6:
        obj = cursor;
        if (!cursor.moveToNext()) goto _L2; else goto _L4
_L4:
        obj = cursor;
        a a1 = new a(cursor.getLong(cursor.getColumnIndex(a.z)), cursor.getLong(cursor.getColumnIndex(a.A)), cursor.getString(cursor.getColumnIndex(a.B)), cursor.getString(cursor.getColumnIndex(a.C)), cursor.getInt(cursor.getColumnIndex(a.x)), cursor.getLong(cursor.getColumnIndex(a.y)), cursor.getInt(cursor.getColumnIndex(a.D)), cursor.getInt(cursor.getColumnIndex(a.E)));
        obj = cursor;
        hashmap.put(String.valueOf(a1.e()), a1);
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        obj = cursor;
_L16:
        cursor = f().a(com.gau.go.a.c.a.b, null, null, null, null);
        if (cursor == null) goto _L8; else goto _L7
_L7:
        obj = cursor;
        if (cursor.getCount() <= 0) goto _L8; else goto _L9
_L9:
        obj = cursor;
        cursor.moveToPosition(-1);
_L10:
        obj = cursor;
        if (!cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = cursor;
        a1 = new a(cursor.getLong(cursor.getColumnIndex(a.z)), cursor.getLong(cursor.getColumnIndex(a.A)), cursor.getString(cursor.getColumnIndex(a.B)), cursor.getString(cursor.getColumnIndex(a.C)), cursor.getInt(cursor.getColumnIndex(a.x)), cursor.getLong(cursor.getColumnIndex(a.y)), cursor.getInt(cursor.getColumnIndex(a.D)), cursor.getInt(cursor.getColumnIndex(a.E)));
        obj = cursor;
        hashmap.put(String.valueOf(a1.e()), a1);
        if (true) goto _L10; else goto _L8
        Exception exception;
        exception;
        obj = cursor;
        exception.printStackTrace();
_L8:
        if (cursor != null)
        {
            cursor.close();
        }
_L12:
        return hashmap;
_L2:
        if (cursor == null) goto _L12; else goto _L11
_L11:
        cursor.close();
        return hashmap;
        Object obj1;
        obj1;
        obj = null;
_L14:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw obj1;
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L14; else goto _L13
_L13:
        obj1;
        if (true) goto _L16; else goto _L15
_L15:
    }

    public void a(c c1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("(");
        int k = 0;
        for (c c2 = c1; c2 != null; c2 = c2.o)
        {
            k++;
            stringbuilder.append("'");
            stringbuilder.append(c2.b);
            stringbuilder.append("'");
            if (c2.o != null)
            {
                stringbuilder.append(",");
            }
        }

        stringbuilder.append(")");
        if (k > 1)
        {
            c1 = (new StringBuilder()).append("funid=").append(c1.a).append(" and ").append(com.gau.go.a.c.a.e).append(" IN ").append(stringbuilder.toString()).toString();
        } else
        {
            c1 = (new StringBuilder()).append("funid=").append(c1.a).append(" and ").append(com.gau.go.a.c.a.e).append("='").append(c1.b).append("'").toString();
        }
        try
        {
            int l = a.getContentResolver().delete(StaticDataContentProvider.a, c1, null);
            com.gau.go.a.f.e.a(null, (new StringBuilder()).append("deletePushData from db count:").append(l).append(",where:").append(c1).toString());
            return;
        }
        catch (Exception exception) { }
        try
        {
            f().a(com.gau.go.a.c.a.a, c1, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            com.gau.go.a.f.e.a(c1);
        }
    }

    public void a(c c1, b b1)
    {
        com.gau.go.a.a a1 = new com.gau.go.a.a();
        a1.(b1);
        a1.(new i(this, c1));
        try
        {
            if (!d.isShutdown())
            {
                d.execute(a1);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            com.gau.go.a.f.e.a(c1);
        }
    }

    public void a(Map map, b b1)
    {
        com.gau.go.a.a a1 = new com.gau.go.a.a();
        a1.(b1);
        a1.(new j(this, map));
        try
        {
            if (!d.isShutdown())
            {
                d.execute(a1);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            com.gau.go.a.f.e.a(map);
        }
    }

    public c b(String s)
    {
        Cursor cursor = null;
        Object obj = a.getContentResolver().query(StaticDataContentProvider.a, null, (new StringBuilder()).append("id IN ('").append(s).append("')").toString(), null, null);
        cursor = ((Cursor) (obj));
        if (cursor != null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        com.gau.go.a.f.e.a("cursor is null");
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (cursor.getCount() <= 0) goto _L2; else goto _L3
_L3:
        com.gau.go.a.f.e.a((new StringBuilder()).append("Query Post Data In id:").append(s).append(" and data Count:").append(cursor.getCount()).toString());
        cursor.moveToPosition(0);
        s = new c();
        s.a(cursor);
        com.gau.go.a.f.e.a((new StringBuilder()).append("beanData:").append(((c) (s)).h).toString());
_L10:
        obj = s;
        if (cursor != null)
        {
            cursor.close();
            obj = s;
        }
_L5:
        return ((c) (obj));
_L2:
        if (!c || cursor != null)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        try
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown URL").append(StaticDataContentProvider.a).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = null;
        }
        finally { }
_L8:
        com.gau.go.a.f.e.a("contentProvider exception");
        obj = s;
        if (cursor == null) goto _L5; else goto _L4
_L4:
        cursor.close();
        return s;
        s;
        cursor = null;
_L7:
        if (cursor != null)
        {
            cursor.close();
        }
        throw s;
        s;
        if (true) goto _L7; else goto _L6
_L6:
        s;
        s = null;
          goto _L8
        Exception exception;
        exception;
          goto _L8
        s = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public LinkedList b()
    {
        Cursor cursor;
        LinkedList linkedlist;
        cursor = null;
        linkedlist = new LinkedList();
        Cursor cursor1 = a.getContentResolver().query(StaticDataContentProvider.a, null, "isold=1", null, (new StringBuilder()).append(com.gau.go.a.c.a.e).append(" DESC limit ").append(300).toString());
        cursor = cursor1;
        if (cursor == null) goto _L2; else goto _L1
_L1:
        Object obj;
        com.gau.go.a.f.e.a((new StringBuilder()).append("Query all old data, data count:").append(cursor.getCount()).toString());
        cursor.moveToPosition(-1);
        c c1;
        for (; cursor.moveToNext(); linkedlist.add(c1))
        {
            c1 = new c();
            c1.a(cursor);
        }

          goto _L3
_L8:
        if (cursor != null)
        {
            cursor.close();
        }
_L5:
        return linkedlist;
_L2:
        if (c && cursor == null)
        {
            try
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unknown URL").append(StaticDataContentProvider.a).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            finally { }
            continue; /* Loop/switch isn't completed */
        }
          goto _L3
_L6:
        if (cursor != null)
        {
            cursor.close();
        }
        throw obj;
_L3:
        if (cursor == null) goto _L5; else goto _L4
_L4:
        cursor.close();
        return linkedlist;
        obj;
          goto _L6
        Exception exception;
        exception;
        exception = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void b(c c1)
    {
        Object obj = c1.o;
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append((new StringBuilder()).append("'").append(c1.b).append("',").toString());
        for (c1 = ((c) (obj)); c1 != null; c1 = c1.o)
        {
            stringbuffer.append((new StringBuilder()).append("'").append(c1.b).append("',").toString());
        }

        stringbuffer.deleteCharAt(stringbuffer.length() - 1);
        c1 = stringbuffer.toString();
        obj = new ContentValues();
        ((ContentValues) (obj)).put(a.w, Boolean.valueOf(true));
        try
        {
            int k = a.getContentResolver().update(StaticDataContentProvider.a, ((ContentValues) (obj)), (new StringBuilder()).append("id IN (").append(c1).append(")").toString(), null);
            com.gau.go.a.f.e.a(null, (new StringBuilder()).append("setDataOld in db count:").append(k).toString());
            return;
        }
        catch (Exception exception) { }
        try
        {
            f().a(com.gau.go.a.c.a.a, ((ContentValues) (obj)), (new StringBuilder()).append("id IN (").append(c1).append(")").toString(), null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            com.gau.go.a.f.e.a(c1);
        }
    }

    public int c()
    {
        Cursor cursor = a.getContentResolver().query(StaticDataContentProvider.a, null, null, null, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        int k = cursor.getCount();
_L5:
        if (cursor != null)
        {
            cursor.close();
        }
        return k;
_L2:
        if (!c || cursor != null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        Exception exception2;
        try
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown URL").append(StaticDataContentProvider.a).toString());
        }
        catch (Exception exception1) { }
        finally { }
_L3:
        Exception exception;
        if (cursor != null)
        {
            cursor.close();
            return 0;
        } else
        {
            return 0;
        }
        exception2;
        cursor = null;
        if (cursor != null)
        {
            cursor.close();
        }
        throw exception2;
        exception;
        exception = null;
          goto _L3
        k = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public int d()
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(a.w, Boolean.valueOf(true));
        int k = 0;
        int l;
        try
        {
            l = a.getContentResolver().update(StaticDataContentProvider.a, contentvalues, "isold=0", null);
        }
        catch (Exception exception1)
        {
            int i1;
            try
            {
                i1 = f().a(com.gau.go.a.c.a.a, contentvalues, null, null);
            }
            catch (Exception exception)
            {
                com.gau.go.a.f.e.a(exception);
                return k;
            }
            return i1;
        }
        k = l;
        com.gau.go.a.f.e.a((new StringBuilder()).append("Set Data new to old,success count:").append(l).toString());
        return l;
    }

    public int e()
    {
        int k = a.getContentResolver().delete(StaticDataContentProvider.c, null, null);
        com.gau.go.a.f.e.a((new StringBuilder()).append("Delete old ctrlInfo from db, ctrlInfo count:").append(k).toString());
        return k;
        Exception exception;
        exception;
        k = 0;
_L2:
        com.gau.go.a.f.e.a(exception);
        int l;
        try
        {
            l = f().a(com.gau.go.a.c.a.b, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            com.gau.go.a.f.e.a(exception);
            return k;
        }
        return l;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
