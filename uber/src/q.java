// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class q
{

    static void a(ClassLoader classloader, List list, File file)
    {
        b(classloader, list, file);
    }

    private static Object[] a(Object obj, ArrayList arraylist, File file, ArrayList arraylist1)
    {
        return (Object[])(Object[])o.a(obj, "makeDexElements", new Class[] {
            java/util/ArrayList, java/io/File, java/util/ArrayList
        }).invoke(obj, new Object[] {
            arraylist, file, arraylist1
        });
    }

    private static void b(ClassLoader classloader, List list, File file)
    {
        Object obj = o.a(classloader, "pathList").get(classloader);
        ArrayList arraylist = new ArrayList();
        o.a(obj, "dexElements", a(obj, new ArrayList(list), file, arraylist));
        if (arraylist.size() > 0)
        {
            for (list = arraylist.iterator(); list.hasNext(); Log.w("MultiDex", "Exception in makeDexElement", (IOException)list.next())) { }
            file = o.a(classloader, "dexElementsSuppressedExceptions");
            IOException aioexception[] = (IOException[])(IOException[])file.get(classloader);
            if (aioexception == null)
            {
                list = (IOException[])arraylist.toArray(new IOException[arraylist.size()]);
            } else
            {
                list = new IOException[arraylist.size() + aioexception.length];
                arraylist.toArray(list);
                System.arraycopy(aioexception, 0, list, arraylist.size(), aioexception.length);
            }
            file.set(classloader, list);
        }
    }
}
