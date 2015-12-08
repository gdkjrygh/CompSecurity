// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.a;

import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package org.a.a.a.a:
//            c, j, t, g, 
//            i, q, o, r, 
//            m, n, k, l, 
//            d, h, f, s, 
//            p, e

public class b extends Format
{

    private static final t a = new c();
    private static ConcurrentMap b = new ConcurrentHashMap(7);
    private final String c;
    private final TimeZone d;
    private final Locale e;
    private transient g f[];
    private transient int g;

    protected b(String s1, TimeZone timezone, Locale locale)
    {
        c = s1;
        d = timezone;
        e = locale;
        b();
    }

    static String a(TimeZone timezone, boolean flag, int i1, Locale locale)
    {
label0:
        {
            j j1 = new j(timezone, flag, i1, locale);
            String s2 = (String)b.get(j1);
            String s1 = s2;
            if (s2 == null)
            {
                timezone = timezone.getDisplayName(flag, i1, locale);
                s1 = (String)b.putIfAbsent(j1, timezone);
                if (s1 == null)
                {
                    break label0;
                }
            }
            return s1;
        }
        return timezone;
    }

    public static b a(String s1)
    {
        return (b)a.c(s1, null, null);
    }

    public static b a(String s1, Locale locale)
    {
        return (b)a.c(s1, null, locale);
    }

    private void b()
    {
        List list = a();
        f = (g[])list.toArray(new g[list.size()]);
        int i1 = 0;
        int j1 = f.length;
        do
        {
            j1--;
            if (j1 >= 0)
            {
                i1 += f[j1].a();
            } else
            {
                g = i1;
                return;
            }
        } while (true);
    }

    protected String a(String s1, int ai[])
    {
        char c1;
        StringBuilder stringbuilder;
        int i1;
        int l1;
        stringbuilder = new StringBuilder();
        i1 = ai[0];
        l1 = s1.length();
        c1 = s1.charAt(i1);
        if ((c1 < 'A' || c1 > 'Z') && (c1 < 'a' || c1 > 'z')) goto _L2; else goto _L1
_L1:
        int j1;
        stringbuilder.append(c1);
        do
        {
            j1 = i1;
            if (i1 + 1 >= l1)
            {
                break;
            }
            j1 = i1;
            if (s1.charAt(i1 + 1) != c1)
            {
                break;
            }
            stringbuilder.append(c1);
            i1++;
        } while (true);
          goto _L3
_L2:
        int k1;
        stringbuilder.append('\'');
        k1 = 0;
_L7:
        j1 = i1;
        if (i1 >= l1) goto _L3; else goto _L4
_L4:
        c1 = s1.charAt(i1);
        if (c1 != '\'') goto _L6; else goto _L5
_L5:
        if (i1 + 1 < l1 && s1.charAt(i1 + 1) == '\'')
        {
            i1++;
            stringbuilder.append(c1);
            j1 = k1;
        } else
        if (k1 == 0)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
_L8:
        i1++;
        k1 = j1;
          goto _L7
_L6:
        if (k1 != 0 || (c1 < 'A' || c1 > 'Z') && (c1 < 'a' || c1 > 'z'))
        {
            break MISSING_BLOCK_LABEL_253;
        }
        j1 = i1 - 1;
_L3:
        ai[0] = j1;
        return stringbuilder.toString();
        stringbuilder.append(c1);
        j1 = k1;
          goto _L8
    }

    public String a(Date date)
    {
        GregorianCalendar gregoriancalendar = new GregorianCalendar(d, e);
        gregoriancalendar.setTime(date);
        return b(gregoriancalendar, new StringBuffer(g)).toString();
    }

    public StringBuffer a(long l1, StringBuffer stringbuffer)
    {
        return a(new Date(l1), stringbuffer);
    }

    public StringBuffer a(Calendar calendar, StringBuffer stringbuffer)
    {
        return b(calendar, stringbuffer);
    }

    public StringBuffer a(Date date, StringBuffer stringbuffer)
    {
        GregorianCalendar gregoriancalendar = new GregorianCalendar(d, e);
        gregoriancalendar.setTime(date);
        return b(gregoriancalendar, stringbuffer);
    }

    protected List a()
    {
        String as[];
        String as1[];
        ArrayList arraylist;
        String as2[];
        String as3[];
        String as4[];
        String as5[];
        int ai[];
        int i1;
        int l1;
        DateFormatSymbols dateformatsymbols = new DateFormatSymbols(e);
        arraylist = new ArrayList();
        as2 = dateformatsymbols.getEras();
        as3 = dateformatsymbols.getMonths();
        as4 = dateformatsymbols.getShortMonths();
        as = dateformatsymbols.getWeekdays();
        as1 = dateformatsymbols.getShortWeekdays();
        as5 = dateformatsymbols.getAmPmStrings();
        l1 = c.length();
        ai = new int[1];
        i1 = 0;
_L23:
        Object obj;
        int k1;
        int i2;
label0:
        {
            if (i1 < l1)
            {
                ai[0] = i1;
                obj = a(c, ai);
                i2 = ai[0];
                k1 = ((String) (obj)).length();
                if (k1 != 0)
                {
                    break label0;
                }
            }
            return arraylist;
        }
        ((String) (obj)).charAt(0);
        JVM INSTR lookupswitch 20: default 292
    //                   39: 708
    //                   68: 550
    //                   69: 523
    //                   70: 562
    //                   71: 319
    //                   72: 475
    //                   75: 630
    //                   77: 385
    //                   83: 511
    //                   87: 585
    //                   90: 688
    //                   97: 596
    //                   100: 445
    //                   104: 456
    //                   107: 611
    //                   109: 487
    //                   115: 499
    //                   119: 574
    //                   121: 348
    //                   122: 642;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21
_L2:
        break MISSING_BLOCK_LABEL_708;
_L20:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Illegal pattern component: ").append(((String) (obj))).toString());
_L6:
        obj = new i(0, as2);
_L24:
        arraylist.add(obj);
        i1 = i2 + 1;
        if (true) goto _L23; else goto _L22
_L22:
        if (k1 == 2)
        {
            obj = q.a;
        } else
        {
            int j1 = k1;
            if (k1 < 4)
            {
                j1 = 4;
            }
            obj = a(1, j1);
        }
          goto _L24
_L9:
        if (k1 >= 4)
        {
            obj = new i(2, as3);
        } else
        if (k1 == 3)
        {
            obj = new i(2, as4);
        } else
        if (k1 == 2)
        {
            obj = o.a;
        } else
        {
            obj = r.a;
        }
          goto _L24
_L14:
        obj = a(5, k1);
          goto _L24
_L15:
        obj = new m(a(10, k1));
          goto _L24
_L7:
        obj = a(11, k1);
          goto _L24
_L17:
        obj = a(12, k1);
          goto _L24
_L18:
        obj = a(13, k1);
          goto _L24
_L10:
        obj = a(14, k1);
          goto _L24
_L4:
        if (k1 < 4)
        {
            obj = as1;
        } else
        {
            obj = as;
        }
        obj = new i(7, ((String []) (obj)));
          goto _L24
_L3:
        obj = a(6, k1);
          goto _L24
_L5:
        obj = a(8, k1);
          goto _L24
_L19:
        obj = a(3, k1);
          goto _L24
_L11:
        obj = a(4, k1);
          goto _L24
_L13:
        obj = new i(9, as5);
          goto _L24
_L16:
        obj = new n(a(11, k1));
          goto _L24
_L8:
        obj = a(10, k1);
          goto _L24
_L21:
        if (k1 >= 4)
        {
            obj = new k(d, e, 1);
        } else
        {
            obj = new k(d, e, 0);
        }
          goto _L24
_L12:
        if (k1 == 1)
        {
            obj = l.b;
        } else
        {
            obj = l.a;
        }
          goto _L24
        obj = ((String) (obj)).substring(1);
        if (((String) (obj)).length() == 1)
        {
            obj = new d(((String) (obj)).charAt(0));
        } else
        {
            obj = new h(((String) (obj)));
        }
          goto _L24
    }

    protected e a(int i1, int j1)
    {
        switch (j1)
        {
        default:
            return new f(i1, j1);

        case 1: // '\001'
            return new s(i1);

        case 2: // '\002'
            return new p(i1);
        }
    }

    protected StringBuffer b(Calendar calendar, StringBuffer stringbuffer)
    {
        g ag[] = f;
        int j1 = ag.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            ag[i1].a(stringbuffer, calendar);
        }

        return stringbuffer;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof b)
        {
            if (c.equals(((b) (obj = (b)obj)).c) && d.equals(((b) (obj)).d) && e.equals(((b) (obj)).e))
            {
                return true;
            }
        }
        return false;
    }

    public StringBuffer format(Object obj, StringBuffer stringbuffer, FieldPosition fieldposition)
    {
        if (obj instanceof Date)
        {
            return a((Date)obj, stringbuffer);
        }
        if (obj instanceof Calendar)
        {
            return a((Calendar)obj, stringbuffer);
        }
        if (obj instanceof Long)
        {
            return a(((Long)obj).longValue(), stringbuffer);
        }
        stringbuffer = (new StringBuilder()).append("Unknown class: ");
        if (obj == null)
        {
            obj = "<null>";
        } else
        {
            obj = obj.getClass().getName();
        }
        throw new IllegalArgumentException(stringbuffer.append(((String) (obj))).toString());
    }

    public int hashCode()
    {
        return c.hashCode() + (d.hashCode() + e.hashCode() * 13) * 13;
    }

    public Object parseObject(String s1, ParsePosition parseposition)
    {
        parseposition.setIndex(0);
        parseposition.setErrorIndex(0);
        return null;
    }

    public String toString()
    {
        return (new StringBuilder()).append("FastDateFormat[").append(c).append("]").toString();
    }

}
