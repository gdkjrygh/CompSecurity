// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.c;

import a.a.a.b.b;
import a.a.a.b.c;
import a.a.a.d;
import a.a.a.g;
import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package a.a.a.c:
//            f

public final class a
    implements Cloneable
{

    public final SQLiteDatabase a;
    public final String b;
    public final g c[];
    public final String d[];
    public final String e[];
    public final String f[];
    public final g g;
    public final boolean h;
    public final f i;
    private a.a.a.b.a j;

    public a(a a1)
    {
        a = a1.a;
        b = a1.b;
        c = a1.c;
        d = a1.d;
        e = a1.e;
        f = a1.f;
        g = a1.g;
        i = a1.i;
        h = a1.h;
    }

    public a(SQLiteDatabase sqlitedatabase, Class class1)
    {
        int k;
        boolean flag;
        a = sqlitedatabase;
        g g1;
        g ag[];
        ArrayList arraylist;
        ArrayList arraylist1;
        String s;
        try
        {
            b = (String)class1.getField("TABLENAME").get(null);
            ag = a(class1);
            c = ag;
            d = new String[ag.length];
            arraylist = new ArrayList();
            arraylist1 = new ArrayList();
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            throw new d("Could not init DAOConfig", sqlitedatabase);
        }
        k = 0;
        class1 = null;
_L2:
        if (k < ag.length)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        f = (String[])arraylist1.toArray(new String[arraylist1.size()]);
        e = (String[])arraylist.toArray(new String[arraylist.size()]);
        if (e.length != 1)
        {
            class1 = null;
        }
        g = class1;
        i = new f(sqlitedatabase, b, d, e);
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        sqlitedatabase = g.b;
        if (!sqlitedatabase.equals(Long.TYPE) && !sqlitedatabase.equals(java/lang/Long) && !sqlitedatabase.equals(Integer.TYPE) && !sqlitedatabase.equals(java/lang/Integer) && !sqlitedatabase.equals(Short.TYPE) && !sqlitedatabase.equals(java/lang/Short) && !sqlitedatabase.equals(Byte.TYPE) && !sqlitedatabase.equals(java/lang/Byte))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        h = flag;
        return;
        g1 = ag[k];
        s = g1.e;
        d[k] = s;
        if (!g1.d)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        arraylist.add(s);
        class1 = g1;
        break MISSING_BLOCK_LABEL_340;
        arraylist1.add(s);
        break MISSING_BLOCK_LABEL_340;
        h = false;
        return;
        k++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static g[] a(Class class1)
    {
        Object aobj[];
        int k;
        int l;
        aobj = Class.forName((new StringBuilder(String.valueOf(class1.getName()))).append("$Properties").toString()).getDeclaredFields();
        class1 = new ArrayList();
        l = aobj.length;
        k = 0;
_L3:
        if (k < l) goto _L2; else goto _L1
_L1:
        aobj = new g[class1.size()];
        class1 = class1.iterator();
_L4:
        if (!class1.hasNext())
        {
            return ((g []) (aobj));
        }
        break MISSING_BLOCK_LABEL_118;
_L2:
        Object obj = aobj[k];
        if ((((Field) (obj)).getModifiers() & 9) == 9)
        {
            obj = ((Field) (obj)).get(null);
            if (obj instanceof g)
            {
                class1.add((g)obj);
            }
        }
        k++;
          goto _L3
        g g1 = (g)class1.next();
        if (aobj[g1.a] != null)
        {
            throw new d("Duplicate property ordinals");
        }
        aobj[g1.a] = g1;
          goto _L4
    }

    public a a()
    {
        return new a(this);
    }

    public void a(a.a.a.b.d d1)
    {
        if (d1 == a.a.a.b.d.b)
        {
            j = null;
            return;
        }
        if (d1 == a.a.a.b.d.a)
        {
            if (h)
            {
                j = new b();
                return;
            } else
            {
                j = new c();
                return;
            }
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Unsupported type: ")).append(d1).toString());
        }
    }

    public a.a.a.b.a b()
    {
        return j;
    }

    public Object clone()
    {
        return a();
    }
}
