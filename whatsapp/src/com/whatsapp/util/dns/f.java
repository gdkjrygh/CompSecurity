// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util.dns;

import android.content.Context;
import com.whatsapp.afw;
import com.whatsapp.au;
import com.whatsapp.util.Log;
import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.whatsapp.util.dns:
//            DnsCacheEntrySerializable, c, a

public final class f
{

    public static int a;
    private static final String z[];
    private final File b;
    private final HashMap c = new HashMap();

    public f(Context context)
    {
        b = new File(context.getCacheDir(), z[0]);
    }

    private void a(String s, Iterable iterable)
    {
        ArrayList arraylist;
        int i = a;
        long l = System.currentTimeMillis();
        arraylist = new ArrayList();
        iterable = iterable.iterator();
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            arraylist.add(new DnsCacheEntrySerializable(Long.valueOf(l + 0x36ee80L), (InetAddress)iterable.next()));
        } while (i == 0);
        this;
        JVM INSTR monitorenter ;
        c.put(s, arraylist);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    private List b(String s)
    {
        int j = a;
        a aa[] = com.whatsapp.util.dns.c.a(s, 20000);
        InetAddress ainetaddress[] = new InetAddress[aa.length];
        int i = 0;
        do
        {
            if (i >= aa.length)
            {
                break;
            }
            ainetaddress[i] = aa[i].a;
            i++;
        } while (j == 0);
        List list = Arrays.asList(ainetaddress);
        a(s, list);
        return list;
    }

    private List c(String s)
    {
        this;
        JVM INSTR monitorenter ;
        List list;
        int i;
        i = a;
        list = (List)c.get(s);
        if (list != null) goto _L2; else goto _L1
_L1:
        s = null;
_L8:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        ArrayList arraylist;
        HashSet hashset;
        Iterator iterator;
        arraylist = new ArrayList();
        hashset = new HashSet();
        iterator = list.iterator();
_L9:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        DnsCacheEntrySerializable dnscacheentryserializable = (DnsCacheEntrySerializable)iterator.next();
        if (!dnscacheentryserializable.isExpired()) goto _L6; else goto _L5
_L5:
        hashset.add(dnscacheentryserializable);
        if (i == 0) goto _L7; else goto _L6
_L6:
        arraylist.add(dnscacheentryserializable.getInetAddress());
          goto _L7
_L4:
        list.removeAll(hashset);
        if (list.isEmpty())
        {
            c.remove(s);
        }
        s = arraylist;
          goto _L8
        s;
        throw s;
_L7:
        if (i == 0) goto _L9; else goto _L4
    }

    private List d(String s)
    {
        List list = (List)afw.a.get(s);
        if (list == null || list.isEmpty())
        {
            throw new UnknownHostException((new StringBuilder()).append(z[1]).append(s).toString());
        } else
        {
            a(s, list);
            return list;
        }
    }

    private List e(String s)
    {
        List list = Arrays.asList(InetAddress.getAllByName(s));
        a(s, list);
        return list;
    }

    public List a(String s)
    {
        Log.i((new StringBuilder()).append(z[2]).append(s).toString());
        List list = c(s);
        if (list != null)
        {
            boolean flag;
            try
            {
                flag = list.isEmpty();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                try
                {
                    throw s;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
            }
            if (!flag)
            {
                return list;
            }
        }
        try
        {
            list = e(s);
        }
        catch (UnknownHostException unknownhostexception)
        {
            Log.w((new StringBuilder()).append(z[4]).append(s).append(' ').append(unknownhostexception).toString());
            List list1;
            try
            {
                list1 = b(s);
            }
            catch (UnknownHostException unknownhostexception1)
            {
                Log.w((new StringBuilder()).append(z[5]).append(s).append(' ').append(unknownhostexception1).toString());
                List list2;
                try
                {
                    list2 = d(s);
                }
                catch (UnknownHostException unknownhostexception2)
                {
                    Log.w((new StringBuilder()).append(z[3]).append(s).append(' ').append(unknownhostexception2).toString());
                    throw unknownhostexception;
                }
                return list2;
            }
            return list1;
        }
        return list;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        c.clear();
        b.delete();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void onEvent(au au)
    {
        a();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "\030x\000r$\035u\033H";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\022ySE&\016r\020B#\031rSD7\0176\025B2\022rSK(\0166";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\016s\000B+\n\177\035Jg";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\024w\001I$\023r\026Ig\025fS_\"\017y\037X3\025y\035\r!\035\177\037H#\\p\034_g";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\fd\032@&\016oSI)\0176\001H4\023z\006Y.\023xSK&\025z\026Ig\032y\001\r";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\017s\020B)\030w\001Tg\030x\000\r5\031e\034A2\b\177\034Cg\032w\032A\"\0306\025B5\\";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 239
    //                   1 246
    //                   2 253
    //                   3 260;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_260;
_L3:
        byte byte1 = 71;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 124;
          goto _L9
_L5:
        byte1 = 22;
          goto _L9
_L6:
        byte1 = 115;
          goto _L9
        byte1 = 45;
          goto _L9
    }
}
