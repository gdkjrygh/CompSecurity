// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.contact;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.whatsapp.App;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.whatsapp.contact:
//            e, b, g

public class i
{

    private static final String z[];

    public static e a(String s)
    {
        Cursor cursor;
        Object obj;
        obj = null;
        cursor = null;
        if (s != null) goto _L2; else goto _L1
_L1:
        obj = cursor;
_L4:
        return ((e) (obj));
_L2:
        cursor = e.a(s, z[7]);
        s = ((String) (obj));
        if (cursor.moveToNext())
        {
            s = e.a(cursor);
        }
        obj = s;
        if (cursor == null) goto _L4; else goto _L3
_L3:
        cursor.close();
        return s;
        s;
        cursor = null;
_L6:
        if (cursor != null)
        {
            cursor.close();
        }
        throw s;
        s;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static Map a(Set set)
    {
        boolean flag = b.b;
        HashMap hashmap = new HashMap();
        set = set.iterator();
        do
        {
            if (!set.hasNext())
            {
                break;
            }
            e e1 = (e)set.next();
            if (!hashmap.containsKey(e1.a()))
            {
                hashmap.put(e1.a(), new ArrayList());
            }
            ((List)hashmap.get(e1.a())).add(e1);
        } while (!flag);
        return hashmap;
    }

    private static Set a(Context context)
    {
        HashSet hashset;
        boolean flag;
        flag = b.b;
        hashset = new HashSet();
        if (!Build.MANUFACTURER.equalsIgnoreCase(z[5]))
        {
            break MISSING_BLOCK_LABEL_168;
        }
        Log.i(z[3]);
        Cursor cursor1 = App.d.query(Uri.parse(z[6]), null, null, null, null);
        Cursor cursor = cursor1;
        int j = cursor1.getColumnIndex(z[2]);
        cursor = cursor1;
        int k = cursor1.getColumnIndex(z[4]);
_L2:
        cursor = cursor1;
        if (!cursor1.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        cursor = cursor1;
        Object obj = cursor1.getString(j);
        cursor = cursor1;
        String s = cursor1.getString(k);
        if (s == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        cursor = cursor1;
        obj = e.a(context, ((String) (obj)), s);
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        cursor = cursor1;
        hashset.add(obj);
        if (!flag) goto _L2; else goto _L1
_L1:
        if (cursor1 != null)
        {
            try
            {
                cursor1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        return hashset;
        context;
        cursor = cursor1;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        finally { }
_L4:
        cursor = cursor1;
        Log.w((new StringBuilder()).append(z[1]).append(context).toString());
        if (cursor1 != null)
        {
            cursor1.close();
            return hashset;
        } else
        {
            break MISSING_BLOCK_LABEL_168;
        }
        context;
        cursor = null;
        if (cursor != null)
        {
            try
            {
                cursor.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        throw context;
        context;
        cursor1 = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Set a(g g1)
    {
        g g2;
        HashSet hashset;
        boolean flag;
        flag = b.b;
        hashset = new HashSet();
        g2 = null;
        g1 = e.a(g1, z[0]);
        if (g1 == null) goto _L2; else goto _L1
_L1:
        g2 = g1;
        if (!g1.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        g2 = g1;
        e e1 = e.a(g1);
        if (e1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        g2 = g1;
        hashset.add(e1);
        if (!flag) goto _L1; else goto _L2
_L2:
        if (g1 != null)
        {
            g1.close();
        }
        return hashset;
        g1;
        if (g2 != null)
        {
            g2.close();
        }
        throw g1;
    }

    public static Integer b(g g1)
    {
        Object obj = null;
        g1 = e.a(g1, z[8]);
        if (g1 != null) goto _L2; else goto _L1
_L1:
        if (g1 != null)
        {
            g1.close();
        }
        return ((Integer) (obj));
_L2:
        int j = g1.getCount();
        obj = Integer.valueOf(j);
        if (true) goto _L1; else goto _L3
_L3:
        g1;
        g g2;
        g2 = null;
        obj = g1;
_L5:
        if (g2 != null)
        {
            g2.close();
        }
        throw obj;
        obj;
        g2 = g1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static Set b(Context context)
    {
        if (App.u(context))
        {
            context = g.BOTH;
        } else
        {
            context = g.VISIBLE_ONLY;
        }
        return a(context);
    }

    public static Map c(Context context)
    {
        HashSet hashset = new HashSet();
        hashset.addAll(b(context));
        hashset.addAll(a(context));
        return a(hashset);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int j;
        as = new String[9];
        obj = "\024\\\017\033~\006[\017\0364\003Q\024*k\f[\016\020hK";
        byte0 = -1;
        j = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[j] = ((String) (obj));
                obj = "\001L\003\020k\020]\017\033;\023\\\t\031~DF\005\001i\rQ\026\034u\003\024\023\034vDW\001\007\177DW\017\033o\005W\024\0067DC\t\031wDW\017\033o\rZ\025\020;\023]\024\035t\021@@\001s\001Y@";
                j = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                obj = "\nU\r\020";
                j = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[j] = ((String) (obj));
                obj = "\024\\\017\033~\006[\017\0364\003Q\024*h\rY?\026z\026P?\005s\013Z\005\0064\bS\005";
                j = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[j] = ((String) (obj));
                obj = "\nA\r\027~\026";
                j = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[j] = ((String) (obj));
                j = 5;
                obj = "\bS\005";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[j] = ((String) (obj));
                j = 6;
                obj = "\007[\016\001~\n@ZZ4\rW\003Zz\000Z";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[j] = ((String) (obj));
                j = 7;
                obj = "\024\\\017\033~\006[\017\0364\b[\017\036n\024\033";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[j] = ((String) (obj));
                j = 8;
                obj = "\024\\\017\033~\006[\017\0364\003Q\024*x\013A\016\0014";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[j] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 280
    //                   0 303
    //                   1 310
    //                   2 317
    //                   3 324;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_324;
_L3:
        byte byte1 = 27;
_L9:
        obj[k] = (char)(byte1 ^ c1);
        k++;
          goto _L8
_L4:
        byte1 = 100;
          goto _L9
_L5:
        byte1 = 52;
          goto _L9
_L6:
        byte1 = 96;
          goto _L9
        byte1 = 117;
          goto _L9
    }
}
