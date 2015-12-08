// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.ComponentName;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

// Referenced classes of package android.support.v7.internal.widget:
//            n, r, o

final class t extends AsyncTask
{

    final n a;

    private t(n n1)
    {
        a = n1;
        super();
    }

    t(n n1, o o)
    {
        this(n1);
    }

    public transient Void a(Object aobj[])
    {
        List list;
        Object obj1;
        int i;
        i = 0;
        list = (List)aobj[0];
        obj1 = (String)aobj[1];
        aobj = n.a(a).openFileOutput(((String) (obj1)), 0);
        obj1 = Xml.newSerializer();
        int j;
        ((XmlSerializer) (obj1)).setOutput(((java.io.OutputStream) (aobj)), null);
        ((XmlSerializer) (obj1)).startDocument("UTF-8", Boolean.valueOf(true));
        ((XmlSerializer) (obj1)).startTag(null, "historical-records");
        j = list.size();
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        r r1 = (r)list.remove(0);
        ((XmlSerializer) (obj1)).startTag(null, "historical-record");
        ((XmlSerializer) (obj1)).attribute(null, "activity", r1.a.flattenToString());
        ((XmlSerializer) (obj1)).attribute(null, "time", String.valueOf(r1.b));
        ((XmlSerializer) (obj1)).attribute(null, "weight", String.valueOf(r1.c));
        ((XmlSerializer) (obj1)).endTag(null, "historical-record");
        i++;
        if (true) goto _L2; else goto _L1
        aobj;
        Log.e(n.c(), (new StringBuilder()).append("Error writing historical recrod file: ").append(((String) (obj1))).toString(), ((Throwable) (aobj)));
_L3:
        return null;
_L1:
        ((XmlSerializer) (obj1)).endTag(null, "historical-records");
        ((XmlSerializer) (obj1)).endDocument();
        n.a(a, true);
        if (aobj != null)
        {
            try
            {
                ((FileOutputStream) (aobj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                return null;
            }
            return null;
        }
          goto _L3
        Object obj;
        obj;
        Log.e(n.c(), (new StringBuilder()).append("Error writing historical recrod file: ").append(n.b(a)).toString(), ((Throwable) (obj)));
        n.a(a, true);
        if (aobj != null)
        {
            try
            {
                ((FileOutputStream) (aobj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                return null;
            }
            return null;
        }
          goto _L3
        obj;
        Log.e(n.c(), (new StringBuilder()).append("Error writing historical recrod file: ").append(n.b(a)).toString(), ((Throwable) (obj)));
        n.a(a, true);
        if (aobj != null)
        {
            try
            {
                ((FileOutputStream) (aobj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                return null;
            }
            return null;
        }
          goto _L3
        obj;
        Log.e(n.c(), (new StringBuilder()).append("Error writing historical recrod file: ").append(n.b(a)).toString(), ((Throwable) (obj)));
        n.a(a, true);
        if (aobj == null) goto _L3; else goto _L4
_L4:
        try
        {
            ((FileOutputStream) (aobj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            return null;
        }
        return null;
        obj;
        n.a(a, true);
        if (aobj != null)
        {
            try
            {
                ((FileOutputStream) (aobj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[]) { }
        }
        throw obj;
    }

    public Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }
}
