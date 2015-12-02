// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package de.greenrobot.event:
//            h, i, k, g

class j
{

    private static final Map b;
    private static final String z[];
    private final Map a = new ConcurrentHashMap();

    j(List list)
    {
        if (list != null)
        {
            Class class1;
            for (list = list.iterator(); list.hasNext(); a.put(class1, class1))
            {
                class1 = (Class)list.next();
            }

        }
    }

    List a(Class class1)
    {
        String s1;
        s1 = class1.getName();
        List list;
        synchronized (b)
        {
            list = (List)b.get(s1);
        }
        if (list != null)
        {
            return list;
        }
        break MISSING_BLOCK_LABEL_39;
        class1;
        map;
        JVM INSTR monitorexit ;
        throw class1;
        Class class2;
        ArrayList arraylist;
        HashSet hashset;
        StringBuilder stringbuilder;
        arraylist = new ArrayList();
        hashset = new HashSet();
        stringbuilder = new StringBuilder();
        class2 = class1;
_L16:
        {
            if (class2 == null)
            {
                break MISSING_BLOCK_LABEL_123;
            }
            String s = class2.getName();
            boolean flag;
            try
            {
                if (s.startsWith(z[7]))
                {
                    break MISSING_BLOCK_LABEL_123;
                }
                flag = s.startsWith(z[5]);
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                try
                {
                    throw class1;
                }
                // Misplaced declaration of an exception variable
                catch (Class class1) { }
                try
                {
                    throw class1;
                }
                // Misplaced declaration of an exception variable
                catch (Class class1)
                {
                    throw class1;
                }
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        flag = s.startsWith(z[11]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        try
        {
            if (arraylist.isEmpty())
            {
                throw new h((new StringBuilder()).append(z[10]).append(class1).append(z[9]).append(z[3]).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw class1;
        }
        break; /* Loop/switch isn't completed */
        Method amethod[];
        int l;
        int i1;
_L8:
        Method method;
        String s2;
        if (l >= i1)
        {
            break MISSING_BLOCK_LABEL_557;
        }
        method = amethod[l];
        s2 = method.getName();
        if (!s2.startsWith(z[1])) goto _L2; else goto _L1
_L1:
        int j1 = method.getModifiers();
        if ((j1 & 1) == 0 || (j1 & 0x1448) != 0) goto _L4; else goto _L3
_L3:
        Class aclass[] = method.getParameterTypes();
        if (aclass.length != 1) goto _L2; else goto _L5
_L5:
        Object obj = s2.substring(z[4].length());
        if (((String) (obj)).length() != 0) goto _L7; else goto _L6
_L6:
        obj = i.PostThread;
_L10:
        Class class3 = aclass[0];
        stringbuilder.setLength(0);
        stringbuilder.append(s2);
        stringbuilder.append('>').append(class3.getName());
        s2 = stringbuilder.toString();
        boolean flag1;
        try
        {
            if (hashset.add(s2))
            {
                arraylist.add(new k(method, ((i) (obj)), class3));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw class1;
        }
_L2:
        l++;
          goto _L8
_L7:
label0:
        {
            if (!((String) (obj)).equals(z[0]))
            {
                break label0;
            }
            obj = i.MainThread;
        }
        if (true) goto _L10; else goto _L9
_L9:
label1:
        {
            if (!((String) (obj)).equals(z[12]))
            {
                break label1;
            }
            obj = i.BackgroundThread;
        }
        if (true) goto _L10; else goto _L11
_L11:
label2:
        {
            if (!((String) (obj)).equals(z[8]))
            {
                break label2;
            }
            obj = i.Async;
        }
        if (true) goto _L10; else goto _L12
_L12:
        try
        {
            flag1 = a.containsKey(class2);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw class1;
        }
        if (flag1) goto _L2; else goto _L13
_L13:
        throw new h((new StringBuilder()).append(z[6]).append(method).toString());
_L4:
        if (a.containsKey(class2)) goto _L2; else goto _L14
_L14:
        Log.d(g.m, (new StringBuilder()).append(z[2]).append(class2).append(".").append(s2).toString());
          goto _L2
        class1;
        throw class1;
        class2 = class2.getSuperclass();
        if (true) goto _L16; else goto _L15
_L15:
        synchronized (b)
        {
            b.put(s1, arraylist);
        }
        return arraylist;
        exception;
        class1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int l;
        as = new String[13];
        obj = ";jP.v\036y\\!F";
        byte0 = -1;
        l = 0;
_L2:
        String as1[];
        int i1;
        int j1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        j1 = obj.length;
        i1 = 0;
_L8:
label0:
        {
            if (j1 > i1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[l] = ((String) (obj));
                obj = "\031e|6G\030\177";
                l = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[l] = ((String) (obj));
                obj = "%`P0R\037e^`O\023\177Q/FV#W/VV{L\"N\037h\025`Q\002jM)AVdK`C\024xM2C\025\177\020z\002";
                l = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[l] = ((String) (obj));
                obj = "\031e|6G\030\177";
                l = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[l] = ((String) (obj));
                l = 4;
                obj = "\031e|6G\030\177";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[l] = ((String) (obj));
                l = 5;
                obj = "\034jO!ZX";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[l] = ((String) (obj));
                l = 6;
                obj = "?gU%E\027g\031/L3}\\.VVf\\4J\031o\025`A\036nZ+\002\020dK`V\017{V3\030V";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[l] = ((String) (obj));
                l = 7;
                obj = "\034jO!\f";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[l] = ((String) (obj));
                l = 8;
                obj = "7x@.A";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[l] = ((String) (obj));
                l = 9;
                obj = "VcX3\002\030d\0310W\024gP#\002\033nM(M\022x\031#C\032g\\$\002";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[l] = ((String) (obj));
                l = 10;
                obj = "%~[3A\004b[%PV";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[l] = ((String) (obj));
                obj = "\027e]2M\037o\027";
                byte0 = 10;
                l = 11;
                break;

            case 10: // '\n'
                as1[l] = ((String) (obj));
                l = 12;
                obj = "4jZ+E\004dL.F\"cK%C\022";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[l] = ((String) (obj));
                z = as;
                b = new HashMap();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 376
    //                   0 399
    //                   1 406
    //                   2 413
    //                   3 420;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_420;
_L3:
        byte byte1 = 34;
_L9:
        obj[i1] = (char)(byte1 ^ c);
        i1++;
          goto _L8
_L4:
        byte1 = 118;
          goto _L9
_L5:
        byte1 = 11;
          goto _L9
_L6:
        byte1 = 57;
          goto _L9
        byte1 = 64;
          goto _L9
    }
}
