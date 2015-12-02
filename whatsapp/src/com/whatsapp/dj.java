// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.util.Pair;
import com.whatsapp.notification.p;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.b2;
import com.whatsapp.protocol.c4;
import com.whatsapp.protocol.cf;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

// Referenced classes of package com.whatsapp:
//            App, u5, aoz, tn, 
//            mk, og

class dj
    implements Runnable
{

    private static final String z[];
    final String a;
    final cf b;
    final String c;
    final tn d;
    final int e;

    dj(tn tn1, cf cf1, String s, int i, String s1)
    {
        d = tn1;
        b = cf1;
        a = s;
        e = i;
        c = s1;
        super();
    }

    public void run()
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        Object obj2;
        Iterator iterator;
        int j;
        j = App.am;
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        obj2 = new HashSet(u5.d());
        iterator = b.h.iterator();
_L2:
        Object obj;
        boolean flag;
label0:
        {
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj1 = (b2)iterator.next();
            Object obj3 = ((b2) (obj1)).d;
            boolean flag1 = ((b2) (obj1)).b;
            String s = ((b2) (obj1)).c;
            long l = ((b2) (obj1)).f;
            int k = ((b2) (obj1)).e;
            boolean flag2 = ((b2) (obj1)).g;
            if (((HashSet) (obj2)).contains(s))
            {
                obj = App.ah.t(s);
                long l1;
                long l2;
                boolean flag3;
                if (App.ah.B(s) != ((b2) (obj1)).h)
                {
                    obj = com.whatsapp.tn.a(s, 1);
                    obj3 = App.ah.c(s, tn.b(((cf) (obj)).i, ((b2) (obj1)).a));
                    if (obj3 != null)
                    {
                        arraylist1.add(Pair.create(s, ((c4) (obj3)).y));
                        obj.b = true;
                    }
                    Log.i((new StringBuilder()).append(z[4]).append(s).append(z[1]).append(tn.b(((cf) (obj)).i, ((b2) (obj1)).a)).toString());
                } else
                if (obj != null)
                {
                    if (((c4) (obj)).y.equals(obj3))
                    {
                        break label0;
                    }
                    if (App.ah.a(((a) (obj3))) != null)
                    {
                        obj = com.whatsapp.tn.a(s, 0);
                        arraylist1.add(Pair.create(s, obj3));
                        obj.b = true;
                        Log.i((new StringBuilder()).append(z[0]).append(s).toString());
                    } else
                    {
                        obj = com.whatsapp.tn.a(s, 3);
                        obj3 = App.ah.c(s, tn.b(((cf) (obj)).i, ((b2) (obj1)).a));
                        if (obj3 != null)
                        {
                            arraylist1.add(Pair.create(s, ((c4) (obj3)).y));
                            obj.b = true;
                        }
                        Log.i((new StringBuilder()).append(z[2]).append(s).append(z[7]).append(tn.b(((cf) (obj)).i, ((b2) (obj1)).a)).toString());
                    }
                } else
                {
                    if (obj3 == null)
                    {
                        break label0;
                    }
                    obj = com.whatsapp.tn.a(s, 1);
                    Log.i((new StringBuilder()).append(z[5]).append(s).toString());
                }
            } else
            {
                obj = new cf();
                obj.f = s;
                obj.m = 2;
                Log.i((new StringBuilder()).append(z[3]).append(s).toString());
            }
        }
_L3:
label1:
        {
            ((HashSet) (obj2)).remove(s);
            flag3 = App.ah.y(s);
            l1 = p.c(App.au, s);
            l2 = l1 / 1000L;
            int i;
            if (mk.h(s))
            {
                if (!mk.c(s))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = false;
            }
            obj3 = u5.d(s);
            if (obj3 != null)
            {
                i = ((og) (obj3)).c;
            } else
            {
                i = 0;
            }
            obj1 = obj;
            if (obj != null)
            {
                break label1;
            }
            if (flag3 == flag1 && l2 * 1000L == l && flag == flag2)
            {
                obj1 = obj;
                if (obj3 == null)
                {
                    break label1;
                }
                obj1 = obj;
                if (k == i)
                {
                    break label1;
                }
            }
            obj1 = new cf();
            obj1.f = s;
        }
        if (obj1 != null)
        {
            obj1.l = flag3;
            obj1.a = l1;
            obj1.q = flag;
            obj1.j = i;
            arraylist.add(obj1);
        }
        if (j == 0) goto _L2; else goto _L1
_L1:
        obj = ((HashSet) (obj2)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            obj1 = (String)((Iterator) (obj)).next();
            obj2 = com.whatsapp.tn.a(((String) (obj1)), 0);
            obj2.l = App.ah.y(((String) (obj1)));
            obj2.a = p.c(App.au, ((String) (obj1)));
            if (mk.h(((String) (obj1))))
            {
                if (!mk.c(((String) (obj1))))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = false;
            }
            obj2.q = flag;
            arraylist.add(obj2);
            arraylist1.add(Pair.create(obj1, (a)null));
            if (App.ah.t(((String) (obj1))) != null)
            {
                obj2.b = true;
            }
        } while (j == 0);
        com.whatsapp.App.a(a, arraylist, e);
        App.d(a, c, z[6]);
        obj = arraylist1.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            obj1 = (Pair)((Iterator) (obj)).next();
            obj1 = App.ah.a((String)((Pair) (obj1)).first, (a)((Pair) (obj1)).second);
            if (obj1 != null)
            {
                com.whatsapp.App.a(2, ((List) (obj1)), false, false, null, null);
            }
        } while (j == 0);
        return;
        obj = null;
          goto _L3
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "?+D`?++b>8+*n|/a:t\177<++hp>'6ube";
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
                obj = "n:td$:c";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "?+D`?++b>8+*n|/a8st+*v";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "?+D`?++b>8+*n|/a=~}/:<4";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "?+D`?++b>8+*n|/a:wt+<vv~.:8|>";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "?+D`?++b>8+*n|/a:wt+<v";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "9<y";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "n:td$:c";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 256
    //                   0 279
    //                   1 286
    //                   2 293
    //                   3 300;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_300;
_L3:
        byte byte1 = 74;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 78;
          goto _L9
_L5:
        byte1 = 89;
          goto _L9
_L6:
        byte1 = 27;
          goto _L9
        byte1 = 17;
          goto _L9
    }
}
