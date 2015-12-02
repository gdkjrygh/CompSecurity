// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.whatsapp.App;
import com.whatsapp.ConversationRowDivider;
import com.whatsapp.k;
import com.whatsapp.k4;
import com.whatsapp.mk;
import com.whatsapp.og;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.whatsapp.notification:
//            PopupNotification, q, d, k

public final class p
{

    public static HashMap a;
    public static HashMap b;
    private static final String z[];

    public static q a(Context context, c4 c4_1, og og1)
    {
        boolean flag;
        flag = PopupNotification.q;
        if (c4_1 == null)
        {
            return new q("", "");
        }
        if (c4_1.w == 0)
        {
            String s2 = c4_1.e();
            String s = s2;
            if (s2 != null)
            {
                s = s2;
                if ((long)s2.length() > 1024L)
                {
                    s = c(s2);
                }
            }
            if (!og1.k())
            {
                return new q(og1.a(context), s);
            }
            if (c4_1.M == 6)
            {
                return new q(og1.a(context), ConversationRowDivider.c(c4_1));
            }
            if (c4_1.G != null)
            {
                c4_1 = App.az.e(c4_1.G).a(context);
                return new q((new StringBuilder()).append(c4_1).append(z[1]).append(og1.a(context)).toString(), s);
            } else
            {
                return new q(og1.a(context), s);
            }
        }
        c4_1.w;
        JVM INSTR tableswitch 1 8: default 236
    //                   1 275
    //                   2 284
    //                   3 301
    //                   4 310
    //                   5 319
    //                   6 236
    //                   7 236
    //                   8 328;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L1 _L7
_L1:
        int i = 0x7f0e00ff;
_L8:
        String s1 = context.getString(i);
        if (!og1.k() || c4_1.G == null)
        {
            return new q(og1.a(context), s1);
        } else
        {
            c4_1 = App.az.e(c4_1.G).a(context);
            return new q((new StringBuilder()).append(c4_1).append(z[0]).append(og1.a(context)).toString(), s1);
        }
_L2:
        i = 0x7f0e00fd;
        if (!flag) goto _L8; else goto _L3
_L3:
        if (c4_1.n == 1)
        {
            i = 0x7f0e0101;
        } else
        {
            i = 0x7f0e00f7;
        }
        if (!flag) goto _L8; else goto _L4
_L4:
        i = 0x7f0e0100;
        if (!flag) goto _L8; else goto _L5
_L5:
        i = 0x7f0e00fc;
        if (!flag) goto _L8; else goto _L6
_L6:
        i = 0x7f0e00fe;
        if (!flag) goto _L8; else goto _L7
_L7:
        i = 0x7f0e00f8;
        if (!flag) goto _L8; else goto _L1
    }

    public static CharSequence a(Context context, c4 c4_1, og og1, boolean flag, boolean flag1)
    {
        boolean flag2 = PopupNotification.q;
        if (c4_1 != null) goto _L2; else goto _L1
_L1:
        String s1 = "";
_L4:
        return s1;
_L2:
        byte byte0;
        byte0 = c4_1.w;
        if (byte0 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = c4_1.e();
        String s = s1;
        if (s1 != null)
        {
            s = s1;
            if ((long)s1.length() > 1024L)
            {
                s = c(s1);
            }
        }
        if (og1.k())
        {
            if (c4_1.M == 6)
            {
                return ConversationRowDivider.c(c4_1);
            }
            if (flag)
            {
                if (!c4_1.y.b)
                {
                    return (new StringBuilder()).append(a(c4_1.G, context)).append(z[14]).append(og1.a(context)).append(z[10]).append(s).toString();
                } else
                {
                    return (new StringBuilder()).append(og1.a(context)).append(z[22]).append(s).toString();
                }
            }
            if (flag1)
            {
                if (!c4_1.y.b)
                {
                    return TextUtils.concat(new CharSequence[] {
                        b(com.whatsapp.util.c.b((new StringBuilder()).append(a(c4_1.G, context)).append(" ").toString())), com.whatsapp.util.c.b(s)
                    });
                } else
                {
                    return TextUtils.concat(new CharSequence[] {
                        b((new StringBuilder()).append(context.getString(0x7f0e04b8)).append(" ").toString()), com.whatsapp.util.c.b(s)
                    });
                }
            }
            if (!c4_1.y.b)
            {
                return Html.fromHtml((new StringBuilder()).append(z[11]).append(a(c4_1.G, context)).append(z[20]).append(s).toString());
            } else
            {
                Log.e((new StringBuilder()).append(z[23]).append(Log.a(c4_1)).toString());
                return (new StringBuilder()).append(context.getString(0x7f0e00c7)).append(z[16]).append(s).toString();
            }
        }
        if (flag)
        {
            return (new StringBuilder()).append(og1.a(context)).append(z[13]).append(s).toString();
        }
        s1 = s;
        if (flag1)
        {
            if (!c4_1.y.b)
            {
                return TextUtils.concat(new CharSequence[] {
                    b((new StringBuilder()).append(com.whatsapp.util.c.b(og1.a(context))).append(" ").toString()), com.whatsapp.util.c.b(s)
                });
            } else
            {
                return TextUtils.concat(new CharSequence[] {
                    b((new StringBuilder()).append(context.getString(0x7f0e04b8)).append(" ").toString()), com.whatsapp.util.c.b(s)
                });
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        int i;
label0:
        {
            if (byte0 == 1)
            {
                i = 0x7f0e00fd;
                if (!flag2)
                {
                    break label0;
                }
            }
            if (byte0 == 2)
            {
                if (c4_1.n == 1)
                {
                    i = 0x7f0e0101;
                    if (!flag2)
                    {
                        break label0;
                    }
                }
                i = 0x7f0e00f7;
                if (!flag2)
                {
                    break label0;
                }
            }
            if (byte0 == 3)
            {
                i = 0x7f0e0100;
                if (!flag2)
                {
                    break label0;
                }
            }
            if (byte0 == 4)
            {
                i = 0x7f0e00fc;
                if (!flag2)
                {
                    break label0;
                }
            }
            if (byte0 == 5)
            {
                i = 0x7f0e00fe;
                if (!flag2)
                {
                    break label0;
                }
            }
            if (byte0 == 8)
            {
                i = 0x7f0e00f8;
                if (!flag2)
                {
                    break label0;
                }
            }
            i = 0x7f0e00ff;
        }
        if (og1.k())
        {
            if (flag)
            {
                if (!c4_1.y.b)
                {
                    return (new StringBuilder()).append(a(c4_1.G, context)).append(z[12]).append(og1.a(context)).append(z[18]).append(context.getString(i)).toString();
                } else
                {
                    return (new StringBuilder()).append(og1.a(context)).append(z[17]).append(context.getString(i)).toString();
                }
            }
            if (flag1)
            {
                if (!c4_1.y.b)
                {
                    return TextUtils.concat(new CharSequence[] {
                        b(com.whatsapp.util.c.b((new StringBuilder()).append(a(c4_1.G, context)).append(" ").toString())), com.whatsapp.util.c.b(context.getString(i))
                    });
                } else
                {
                    return TextUtils.concat(new CharSequence[] {
                        b((new StringBuilder()).append(context.getString(0x7f0e04b8)).append(" ").toString()), com.whatsapp.util.c.b(context.getString(i))
                    });
                }
            } else
            {
                return Html.fromHtml((new StringBuilder()).append(z[19]).append(a(c4_1.G, context)).append(z[15]).append(context.getString(i)).toString());
            }
        }
        if (flag)
        {
            return (new StringBuilder()).append(og1.a(context)).append(z[21]).append(context.getString(i)).toString();
        }
        if (flag1)
        {
            if (!c4_1.y.b)
            {
                return TextUtils.concat(new CharSequence[] {
                    b(com.whatsapp.util.c.b((new StringBuilder()).append(og1.a(context)).append(" ").toString())), com.whatsapp.util.c.b(context.getString(i))
                });
            } else
            {
                return TextUtils.concat(new CharSequence[] {
                    b((new StringBuilder()).append(context.getString(0x7f0e04b8)).append(" ").toString()), com.whatsapp.util.c.b(context.getString(i))
                });
            }
        } else
        {
            return context.getString(i);
        }
    }

    private static String a(String s, Context context)
    {
        if (s == null)
        {
            Log.w(z[35]);
            return "";
        } else
        {
            return App.az.e(s).a(context);
        }
    }

    public static void a()
    {
        b.clear();
    }

    private static void a(Context context)
    {
        String s;
        boolean flag2;
        flag2 = PopupNotification.q;
        a = new HashMap();
        context = context.getSharedPreferences(z[31], 0);
        s = context.getString(z[25], "");
        Log.i((new StringBuilder()).append(z[29]).append(s).toString());
        if (s.length() <= 0) goto _L2; else goto _L1
_L1:
        String as[];
        boolean flag1;
        int i;
        as = s.split(",");
        i = as.length - 1;
        flag1 = false;
_L4:
        boolean flag;
label0:
        {
            flag = flag1;
            if (i < 0)
            {
                break; /* Loop/switch isn't completed */
            }
            String s2 = as[i];
            flag = flag1;
            if (s2.length() <= 1)
            {
                break label0;
            }
            String as1[] = s2.split("#");
            if (App.az.c(as1[0]) != null)
            {
                if (a.containsKey(as1[0]))
                {
                    Log.e(z[27]);
                    if (!flag2)
                    {
                        break MISSING_BLOCK_LABEL_355;
                    }
                    flag1 = true;
                }
                if (as1.length >= 3)
                {
                    a.put(as1[0], new d(Long.parseLong(as1[1]), Boolean.parseBoolean(as1[2])));
                    flag = flag1;
                    if (!flag2)
                    {
                        break label0;
                    }
                }
                a.put(as1[0], new d(Long.parseLong(as1[1]), true));
                flag = flag1;
                if (!flag2)
                {
                    break label0;
                }
            }
            flag = true;
        }
_L5:
        i--;
        flag1 = flag;
        if (!flag2) goto _L4; else goto _L3
_L3:
        if (flag)
        {
            String s1;
label1:
            {
                context = context.edit();
                s1 = b();
                if (a.isEmpty())
                {
                    context.remove(z[24]);
                    if (!flag2)
                    {
                        break label1;
                    }
                }
                context.putString(z[26], s1);
            }
            Log.e((new StringBuilder()).append(z[30]).append(s1).toString());
            if (!context.commit())
            {
                Log.e(z[28]);
            }
        }
_L2:
        return;
        flag = true;
          goto _L5
    }

    public static void a(Context context, String s, long l, boolean flag)
    {
        a(context, s, l, flag, true);
    }

    public static void a(Context context, String s, long l, boolean flag, boolean flag1)
    {
        if (a == null)
        {
            a(context);
        }
        a.put(s, new d(l, flag));
        context = context.getSharedPreferences(z[9], 0).edit();
        context.putString(z[8], b());
        if (!context.commit())
        {
            Log.e(z[7]);
        }
        App.B(s);
        if (flag1)
        {
            App.a(5, s, l);
        }
    }

    public static void a(Context context, String s, boolean flag)
    {
        if (a == null)
        {
            a(context);
        }
        if ((d)a.remove(s) != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        android.content.SharedPreferences.Editor editor;
        String s1;
label0:
        {
            editor = context.getSharedPreferences(z[6], 0).edit();
            s1 = b();
            if (a.isEmpty())
            {
                editor.remove(z[2]);
                if (!PopupNotification.q)
                {
                    break label0;
                }
            }
            editor.putString(z[3], s1);
        }
        Log.i((new StringBuilder()).append(z[4]).append(s1).toString());
        if (!editor.commit())
        {
            Log.e(z[5]);
        }
        (new Handler(context.getMainLooper())).post(new com.whatsapp.notification.k(s));
        if (flag)
        {
            App.a(6, s);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static void a(String s)
    {
        long l = System.currentTimeMillis();
        long l1 = Math.min((30000L + 5000L * (long)mk.a(s).g()) - 1L, 0x1d4c0L);
        b.put(s, Long.valueOf(l + l1));
    }

    public static boolean a(Context context, String s)
    {
        if (a == null)
        {
            a(context);
        }
        if (a.containsKey(s))
        {
            if (((d)a.get(s)).a > System.currentTimeMillis())
            {
                return ((d)a.get(s)).b;
            }
            d(context, s);
        }
        return true;
    }

    private static CharSequence b(String s)
    {
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        spannablestringbuilder.append(s);
        spannablestringbuilder.setSpan(new StyleSpan(1), 0, s.length(), 0);
        return spannablestringbuilder;
    }

    private static String b()
    {
        boolean flag = PopupNotification.q;
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = a.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)iterator.next();
            String s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = (d)((java.util.Map.Entry) (obj)).getValue();
            if (stringbuilder.length() != 0)
            {
                stringbuilder.append(',');
            }
            stringbuilder.append(s).append('#').append(((d) (obj)).a);
            if (!((d) (obj)).b)
            {
                stringbuilder.append('#').append(Boolean.toString(false));
            }
        } while (!flag);
        return stringbuilder.toString();
    }

    public static String b(Context context, c4 c4_1, og og1)
    {
        String s;
label0:
        {
label1:
            {
                boolean flag = PopupNotification.q;
                if (!og1.k())
                {
                    s = context.getString(0x7f0e02b9, new Object[] {
                        og1.a(context)
                    });
                    if (!flag)
                    {
                        break label0;
                    }
                }
                if (c4_1.M == 6)
                {
                    s = ConversationRowDivider.c(c4_1);
                    if (!flag)
                    {
                        break label0;
                    }
                }
                if (c4_1.G != null)
                {
                    s = (new StringBuilder()).append(App.az.e(c4_1.G).a(context)).append(z[32]).append(og1.a(context)).toString();
                    if (!flag)
                    {
                        break label1;
                    }
                }
                Log.e((new StringBuilder()).append(z[34]).append(Log.a(c4_1)).toString());
                s = (new StringBuilder()).append(context.getString(0x7f0e00c7)).append(z[33]).append(og1.a(context)).toString();
            }
            s = context.getString(0x7f0e02b9, new Object[] {
                s
            });
        }
        return com.whatsapp.util.c.b(s);
    }

    public static boolean b(Context context, String s)
    {
        return c(context, s) != 0L;
    }

    public static long c(Context context, String s)
    {
        if (a == null)
        {
            a(context);
        }
        if (a.containsKey(s))
        {
            long l = ((d)a.get(s)).a;
            if (l > System.currentTimeMillis())
            {
                return l;
            }
            d(context, s);
        }
        return 0L;
    }

    private static String c(String s)
    {
        return (new StringBuilder()).append(s.subSequence(0, 1020)).append("\u2026").toString();
    }

    public static void d(Context context, String s)
    {
        a(context, s, true);
    }

    public static boolean d(String s)
    {
        Long long1 = (Long)b.get(s);
        if (long1 == null)
        {
            return false;
        }
        if (long1.longValue() <= System.currentTimeMillis())
        {
            b.remove(s);
            return false;
        } else
        {
            return true;
        }
    }

    public static boolean e(Context context, String s)
    {
        return b(context, s) || d(s);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[36];
        obj = "Cvu";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "Cvu";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\016C!\0278\nX3\035";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\016C!\0278\nX3\035";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\rY!\033\001\nU4\006\016\fXz\000\002\020S!-\n\026B0-\016\rP:H";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\rY!\033\001\nU4\006\016\fXz\007\027\007W!\0278\016C!\0278\nX3\035H\005W<\036\002\007";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\000Y8\\\020\013W!\001\006\023F\n\002\025\006P0\000\002\rU0\001";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\rY!\033\001\nU4\006\016\fXz\001\002\027i8\007\023\006i<\034\001\f\0313\023\016\017S1";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\016C!\0278\nX3\035";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\000Y8\\\020\013W!\001\006\023F\n\002\025\006P0\000\002\rU0\001";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "Y\026";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "_Tk";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "Cvu";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "Y\026";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "Cvu";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "Y\026i]\005]";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "Y\026";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "Y\026";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "Y\026";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "_Tk";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "Y\026i]\005]";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "Y\026";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "Y\026";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "\016S&\001\006\004S\005\000\002\025_0\005H\016_&\001\016\rQ\n\000\n\027i&\000\004Y";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "\016C!\0278\nX3\035";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "\016C!\0278\nX3\035";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "\016C!\0278\nX3\035";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "&d\007=5CC%\026\006\027S1R\023\013Su\037\006\023\0267\027\001\fD0";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "\rY!\033\001\nU4\006\016\fXz\007\027\007W!\0278\016C!\0278\nX3\035H\005W<\036\002\007";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "\rY!\033\001\nU4\006\016\fXz\033\t\nB\n\037\022\027S\n\033\t\005Yo";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "\026R%\023\023\006\026<\034\001\f\f";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "\000Y8\\\020\013W!\001\006\023F\n\002\025\006P0\000\002\rU0\001";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "Cvu";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "Cvu";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 34;
                obj = "\004S!<\b\027_3\033\004\002B<\035\t7_6\031\002\021\0318\033\024\020_;\0258\021[!-\024\021Uo";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "\rY!\033\001\nU4\006\016\fXz\037\002\020E4\025\002\023D0\004\016\006Az\025\002\027X4\037\002CD0\037\b\027S\n\000\002\020Y \000\004\006\026;\007\013\017";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i] = ((String) (obj));
                z = as;
                b = new HashMap();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 884
    //                   0 907
    //                   1 914
    //                   2 921
    //                   3 928;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_928;
_L3:
        byte byte1 = 103;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 99;
          goto _L9
_L5:
        byte1 = 54;
          goto _L9
_L6:
        byte1 = 85;
          goto _L9
        byte1 = 114;
          goto _L9
    }
}
