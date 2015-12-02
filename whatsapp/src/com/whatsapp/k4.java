// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.backport.util.Base64;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.whatsapp:
//            App, as_, mk, aoz

public class k4
{

    private static final String z[];
    private String a;
    private final String b;
    private Map c;

    public k4(String s)
    {
        c = new ConcurrentHashMap();
        b = s;
    }

    static String a(k4 k4_1)
    {
        return k4_1.b;
    }

    public static String a(Collection collection)
    {
        int k = App.am;
        Object obj = new ArrayList(collection);
        Collections.sort(((List) (obj)));
        byte abyte0[];
        try
        {
            collection = MessageDigest.getInstance(z[4]);
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            throw new RuntimeException(collection);
        }
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            collection.update(((String)((Iterator) (obj)).next()).getBytes());
        } while (k == 0);
        collection = collection.digest();
        abyte0 = new byte[6];
        System.arraycopy(collection, 0, abyte0, 0, abyte0.length);
        return (new StringBuilder()).append(z[3]).append(Base64.encodeToString(abyte0, 2)).toString();
    }

    private void e()
    {
        a = a(b());
    }

    public as_ a(String s)
    {
        s = (as_)c.remove(s);
        if (s != null)
        {
            try
            {
                e();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        return s;
    }

    public as_ a(String s, boolean flag, boolean flag1)
    {
label0:
        {
            as_ as_1 = (as_)c.get(s);
            if (as_1 != null)
            {
                int k;
                try
                {
                    as_1.d = flag;
                    as_1.a = flag1;
                    k = App.am;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
                if (k == 0)
                {
                    break label0;
                }
            }
            as_1 = new as_(s, flag, flag1);
            as_1.c = mk.e()[c.size() % mk.e().length];
            c.put(s, as_1);
            e();
        }
        return as_1;
    }

    public String a()
    {
        return a;
    }

    public boolean a(Hashtable hashtable, boolean flag)
    {
        int k = App.am;
        Vector vector = new Vector();
        Object obj = hashtable.keySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (String)((Iterator) (obj)).next();
            String s;
            try
            {
                if (!c.containsKey(obj1))
                {
                    Log.i((new StringBuilder()).append(z[1]).append(((String) (obj1))).toString());
                    vector.add(obj1);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Hashtable hashtable)
            {
                throw hashtable;
            }
            a(((String) (obj1)), z[2].equals(hashtable.get(obj1)), false);
        } while (k == 0);
        obj = new Vector();
        obj1 = c.keySet().iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            s = (String)((Iterator) (obj1)).next();
            try
            {
                if (!hashtable.containsKey(s))
                {
                    Log.i((new StringBuilder()).append(z[0]).append(s).toString());
                    ((Vector) (obj)).add(s);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Hashtable hashtable)
            {
                throw hashtable;
            }
        } while (k == 0);
        hashtable = ((Vector) (obj)).iterator();
        do
        {
            if (!hashtable.hasNext())
            {
                break;
            }
            a((String)hashtable.next());
        } while (k == 0);
        if (!flag) goto _L2; else goto _L1
_L1:
        hashtable = d();
        try
        {
            flag = vector.isEmpty();
        }
        // Misplaced declaration of an exception variable
        catch (Hashtable hashtable)
        {
            try
            {
                throw hashtable;
            }
            // Misplaced declaration of an exception variable
            catch (Hashtable hashtable)
            {
                throw hashtable;
            }
        }
        if (flag) goto _L4; else goto _L3
_L3:
        obj1 = b;
        if (hashtable.size() != 1) goto _L6; else goto _L5
_L5:
        hashtable = ((as_)hashtable.get(0)).b;
_L7:
        mk.a(1, mk.a(12, null, ((String) (obj1)), hashtable, vector, this));
_L4:
        try
        {
            if (!((Vector) (obj)).isEmpty())
            {
                mk.a(1, mk.a(13, null, b, null, ((Vector) (obj))));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Hashtable hashtable)
        {
            throw hashtable;
        }
_L8:
        flag = vector.isEmpty();
        if (flag)
        {
            try
            {
                flag = ((Vector) (obj)).isEmpty();
            }
            // Misplaced declaration of an exception variable
            catch (Hashtable hashtable)
            {
                throw hashtable;
            }
            if (flag)
            {
                break MISSING_BLOCK_LABEL_415;
            }
        }
        flag = true;
_L9:
        if (flag)
        {
            try
            {
                e();
            }
            // Misplaced declaration of an exception variable
            catch (Hashtable hashtable)
            {
                throw hashtable;
            }
        }
        return flag;
_L6:
        hashtable = null;
          goto _L7
_L2:
        hashtable = new ArrayList(1);
        hashtable.add(this);
        App.ah.b(hashtable);
          goto _L8
        hashtable;
        throw hashtable;
        flag = false;
          goto _L9
    }

    public as_ b(String s)
    {
        return (as_)c.get(s);
    }

    public Set b()
    {
        return c.keySet();
    }

    public void c()
    {
        int l = App.am;
        c = App.ah.u(b);
        e();
        Iterator iterator = c.values().iterator();
        int k = 0;
        do
        {
label0:
            {
                if (iterator.hasNext())
                {
                    ((as_)iterator.next()).c = mk.e()[k % mk.e().length];
                    if (l == 0)
                    {
                        break label0;
                    }
                }
                return;
            }
            k++;
        } while (true);
    }

    public boolean c(String s)
    {
        s = b(s);
        if (s != null)
        {
            boolean flag;
            try
            {
                flag = ((as_) (s)).d;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public ArrayList d()
    {
        int k = App.am;
        ArrayList arraylist = new ArrayList();
        Iterator iterator = c.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            as_ as_1 = (as_)iterator.next();
            try
            {
                if (as_1.d)
                {
                    arraylist.add(as_1);
                }
            }
            catch (RuntimeException runtimeexception)
            {
                throw runtimeexception;
            }
        } while (k == 0);
        return arraylist;
    }

    public boolean f()
    {
        int k = App.am;
        Iterator iterator = c.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            as_ as_1 = (as_)iterator.next();
            boolean flag;
            try
            {
                flag = as_1.a();
            }
            catch (RuntimeException runtimeexception)
            {
                throw runtimeexception;
            }
            if (flag)
            {
                return true;
            }
        } while (k == 0);
        return false;
    }

    public int g()
    {
        return c.size();
    }

    public String h()
    {
        return b;
    }

    public Collection i()
    {
        return c.values();
    }

    public boolean j()
    {
        int k = App.am;
        Iterator iterator = c.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            as_ as_1 = (as_)iterator.next();
            boolean flag;
            try
            {
                if (!as_1.a())
                {
                    continue;
                }
                flag = as_1.d;
            }
            catch (RuntimeException runtimeexception)
            {
                throw runtimeexception;
            }
            return flag;
        } while (k == 0);
        return false;
    }

    public String toString()
    {
        return (new StringBuilder()).append(b).append(" ").append(Arrays.deepToString(Collections.list(Collections.enumeration(c.values())).toArray())).append(z[5]).append(a).toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int k;
        as = new String[6];
        obj = "\013\034\022\030N\001\t\017BM\025\000\036@L\t\003\022\033[A\036\034\037J\005\r\024\035_\002\032G";
        byte0 = -1;
        k = 0;
_L2:
        String as1[];
        int l;
        int i1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        l = 0;
_L8:
label0:
        {
            if (i1 > l)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[k] = ((String) (obj));
                obj = "\013\034\022\030N\001\t\017BM\025\000\036@_\b\nP\035_\036\032\024\016W\034\017\023\031\004";
                k = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[k] = ((String) (obj));
                obj = "\r\n\020\004P";
                k = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[k] = ((String) (obj));
                obj = "]T";
                k = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[k] = ((String) (obj));
                obj = "?&<\\";
                k = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[k] = ((String) (obj));
                k = 5;
                obj = "L\036\025\fM\004T";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[k] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[l];
        l % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 239
    //                   1 246
    //                   2 253
    //                   3 260;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_260;
_L3:
        byte byte1 = 62;
_L9:
        obj[l] = (char)(byte1 ^ c1);
        l++;
          goto _L8
_L4:
        byte1 = 108;
          goto _L9
_L5:
        byte1 = 110;
          goto _L9
_L6:
        byte1 = 125;
          goto _L9
        byte1 = 109;
          goto _L9
    }
}
