// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.DisplayMetrics;
import com.ubercab.rds.core.model.SupportFormContent;
import com.ubercab.rds.core.model.SupportIssue;
import com.ubercab.rds.core.model.SupportNode;
import com.ubercab.rds.core.model.SupportTree;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public final class hcr
{

    private static final long a;
    private static final long b;
    private static final long c;
    private static final long d;
    private static final long e;
    private static final long f;
    private static final long g;
    private static final long h;
    private static final DateFormat i = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    private static final DateFormat j;

    public static int a(Resources resources)
    {
        return resources.getDisplayMetrics().widthPixels;
    }

    public static int a(Resources resources, float f1, boolean flag)
    {
        int k;
        if (flag)
        {
            k = Math.round(resources.getDimension(hbi.ub__padding_small) * 2.0F);
        } else
        {
            k = 0;
        }
        return Math.round((float)(a(resources) - k) / f1);
    }

    public static int a(Resources resources, int k)
    {
        k = Math.round(resources.getDimension(k) * 2.0F);
        return Math.round((float)(a(resources) - k) / 2.7F);
    }

    public static int a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return -1;
        }
        s.hashCode();
        JVM INSTR lookupswitch 7: default 80
    //                   -1335157162: 158
    //                   -1177318867: 130
    //                   -786681338: 186
    //                   114147: 144
    //                   342069036: 214
    //                   1054424210: 172
    //                   1100650276: 200;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        byte byte0 = -1;
_L10:
        switch (byte0)
        {
        default:
            return -1;

        case 0: // '\0'
            return hbj.ub__icon_support_account;

        case 1: // '\001'
            return hbj.ub__icon_support_business;

        case 2: // '\002'
            return hbj.ub__icon_support_device;

        case 3: // '\003'
            return hbj.ub__icon_support_how;

        case 4: // '\004'
            return hbj.ub__icon_support_payment;

        case 5: // '\005'
            return hbj.ub__icon_support_rewards;

        case 6: // '\006'
            return hbj.ub__icon_support_vehicles;
        }
_L3:
        if (!s.equals("account")) goto _L1; else goto _L9
_L9:
        byte0 = 0;
          goto _L10
_L5:
        if (!s.equals("u4b")) goto _L1; else goto _L11
_L11:
        byte0 = 1;
          goto _L10
_L2:
        if (!s.equals("device")) goto _L1; else goto _L12
_L12:
        byte0 = 2;
          goto _L10
_L7:
        if (!s.equals("how_to_use")) goto _L1; else goto _L13
_L13:
        byte0 = 3;
          goto _L10
_L4:
        if (!s.equals("payment")) goto _L1; else goto _L14
_L14:
        byte0 = 4;
          goto _L10
_L8:
        if (!s.equals("rewards")) goto _L1; else goto _L15
_L15:
        byte0 = 5;
          goto _L10
_L6:
        if (!s.equals("vehicle")) goto _L1; else goto _L16
_L16:
        byte0 = 6;
          goto _L10
    }

    private static long a(Calendar calendar, int k)
    {
        calendar.add(5, -k);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static hhx a(Resources resources, boolean flag)
    {
        float f1;
        if (flag)
        {
            f1 = resources.getDimension(hbi.ub__rds__trip_card_corner_radius);
        } else
        {
            f1 = 0.0F;
        }
        return new hhx(BitmapFactory.decodeResource(resources, hbj.ub__map_grid_placeholder), f1);
    }

    public static i a(String s, boolean flag)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 40
    //                   101142: 84
    //                   3148996: 98
    //                   50511102: 70;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_98;
_L5:
        switch (byte0)
        {
        default:
            return null;

        case 0: // '\0'
            if (flag)
            {
                return i.D;
            } else
            {
                return i.t;
            }

        case 1: // '\001'
            if (flag)
            {
                return i.E;
            } else
            {
                return i.u;
            }

        case 2: // '\002'
            break;
        }
        break MISSING_BLOCK_LABEL_136;
_L4:
        if (s.equals("category"))
        {
            byte0 = 0;
        }
          goto _L5
_L2:
        if (s.equals("faq"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s.equals("form"))
        {
            byte0 = 2;
        }
          goto _L5
        if (flag)
        {
            return i.F;
        } else
        {
            return i.v;
        }
    }

    private static String a(long l)
    {
        return (new SimpleDateFormat("h:mm a")).format(new Date(l));
    }

    public static String a(Context context, String s)
    {
        long l1 = f(s);
        long l2 = gju.a() - l1;
        if (l1 <= 0L || l2 < h)
        {
            return "";
        }
        int k;
        int l;
        if (l2 < a)
        {
            l = hbo.ub__rds__time_now;
            k = 0;
        } else
        if (l2 < b)
        {
            k = (int)(l2 / a);
            l = hbo.ub__rds__time_second_short;
        } else
        if (l2 < c)
        {
            k = (int)(l2 / b);
            l = hbo.ub__rds__time_minute_short;
        } else
        if (l2 < d)
        {
            k = (int)(l2 / c);
            l = hbo.ub__rds__time_hour_short;
        } else
        if (l2 < e)
        {
            k = (int)(l2 / d);
            l = hbo.ub__rds__time_day;
        } else
        if (l2 < f)
        {
            k = (int)(l2 / e);
            l = hbo.ub__rds__time_week_short;
        } else
        if (l2 < g)
        {
            k = (int)(l2 / f);
            l = hbo.ub__rds__time_month_short;
        } else
        {
            k = (int)(l2 / g);
            l = hbo.ub__rds__time_year_short;
        }
        return context.getString(l, new Object[] {
            Integer.valueOf(k)
        });
    }

    public static String a(Context context, String s, boolean flag)
    {
        long l = f(s);
        if (l < 0L)
        {
            return "";
        }
        int k = 24;
        if (flag)
        {
            k = 0x10018;
        }
        return String.format("%s, %s", new Object[] {
            DateUtils.formatDateTime(context, l, k), DateUtils.formatDateTime(context, l, 2561)
        });
    }

    public static String a(Context context, Calendar calendar, String s)
    {
        long l = d(s);
        if (l < 0L)
        {
            return "";
        }
        s = a(l);
        if (l > a(calendar, 0))
        {
            return context.getString(hbo.ub__rds__trip_time_today, new Object[] {
                s
            });
        }
        if (l > a(calendar, 1))
        {
            return context.getString(hbo.ub__rds__trip_time_yesterday, new Object[] {
                s
            });
        }
        if (l > a(calendar, 3))
        {
            calendar = context.getString(e(b(l)));
            return context.getString(hbo.ub__rds__trip_time_older, new Object[] {
                calendar, s
            });
        }
        if (l > a(calendar, 365))
        {
            return context.getString(hbo.ub__rds__trip_time_older, new Object[] {
                c(l), s
            });
        } else
        {
            return context.getString(hbo.ub__rds__trip_time_older, new Object[] {
                d(l), s
            });
        }
    }

    public static String a(String s, String s1)
    {
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1))
        {
            return (new StringBuilder()).append(s).append(" ").append(s1).toString();
        } else
        {
            return "";
        }
    }

    public static String a(String s, Map map)
    {
        map = (SupportFormContent)gki.a(map.values(), null);
        if (map == null) goto _L2; else goto _L1
_L1:
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 5: default 76
    //                   -1595506739: 180
    //                   -234558140: 120
    //                   -117837359: 165
    //                   12522962: 135
    //                   2078856815: 150;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        byte0;
        JVM INSTR tableswitch 0 4: default 112
    //                   0 195
    //                   1 203
    //                   2 211
    //                   3 219
    //                   4 227;
           goto _L2 _L9 _L10 _L11 _L12 _L13
_L2:
        s = null;
_L14:
        if (s != null)
        {
            return s;
        } else
        {
            return "";
        }
_L5:
        if (s.equals("com.ubercab.rds.FORM_CONTENT_TYPE_CAPTION"))
        {
            byte0 = 0;
        }
          goto _L3
_L7:
        if (s.equals("com.ubercab.rds.FORM_CONTENT_TYPE_LABEL"))
        {
            byte0 = 1;
        }
          goto _L3
_L8:
        if (s.equals("com.ubercab.rds.FORM_CONTENT_TYPE_TEXT"))
        {
            byte0 = 2;
        }
          goto _L3
_L6:
        if (s.equals("com.ubercab.rds.FORM_CONTENT_TYPE_PLACEHOLDER"))
        {
            byte0 = 3;
        }
          goto _L3
_L4:
        if (s.equals("com.ubercab.rds.FORM_CONTENT_TYPE_URL"))
        {
            byte0 = 4;
        }
          goto _L3
_L9:
        s = map.getCaption();
          goto _L14
_L10:
        s = map.getLabel();
          goto _L14
_L11:
        s = map.getText();
          goto _L14
_L12:
        s = map.getPlaceholder();
          goto _L14
_L13:
        s = map.getUrl();
          goto _L14
    }

    private static String a(Map map)
    {
        return (String)gki.a(map.values(), "");
    }

    public static List a(SupportTree supporttree)
    {
        ArrayList arraylist = new ArrayList();
        if (supporttree != null && supporttree.getTrees() != null && supporttree.getTrees().size() == 1)
        {
            SupportNode supportnode;
            for (supporttree = ((SupportNode)supporttree.getTrees().get(0)).getChildren().iterator(); supporttree.hasNext(); arraylist.add(SupportIssue.create().setId(supportnode.getId()).setType(supportnode.getType()).setLabel(a(supportnode.getLabels())).setIcon(supportnode.getIconType())))
            {
                supportnode = (SupportNode)supporttree.next();
            }

        }
        return arraylist;
    }

    public static List a(SupportTree supporttree, String s)
    {
        ArrayList arraylist = new ArrayList();
        supporttree = b(supporttree, s);
        if (supporttree != null)
        {
            for (supporttree = supporttree.iterator(); supporttree.hasNext(); arraylist.add(SupportIssue.create().setId(s.getId()).setType(s.getType()).setLabel(a(s.getLabels())).setIcon(s.getIconType())))
            {
                s = (SupportNode)supporttree.next();
            }

        }
        return arraylist;
    }

    public static void a(Context context)
    {
        context.startActivity(Intent.createChooser(new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", context.getString(hbo.ub__rds__support_email), null)), context.getString(hbo.ub__rds__email_support)));
    }

    public static int b(Resources resources)
    {
        return resources.getDisplayMetrics().heightPixels;
    }

    public static int b(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return -1;
        }
        s.hashCode();
        JVM INSTR lookupswitch 7: default 80
    //                   -1335157162: 158
    //                   -1177318867: 130
    //                   -786681338: 186
    //                   114147: 144
    //                   342069036: 214
    //                   1054424210: 172
    //                   1100650276: 200;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        byte byte0 = -1;
_L10:
        switch (byte0)
        {
        default:
            return -1;

        case 0: // '\0'
            return hbj.ub__help_account;

        case 1: // '\001'
            return hbj.ub__help_business;

        case 2: // '\002'
            return hbj.ub__help_devices;

        case 3: // '\003'
            return hbj.ub__help_how;

        case 4: // '\004'
            return hbj.ub__help_payments;

        case 5: // '\005'
            return hbj.ub__help_rewards;

        case 6: // '\006'
            return hbj.ub__help_vehicles;
        }
_L3:
        if (!s.equals("account")) goto _L1; else goto _L9
_L9:
        byte0 = 0;
          goto _L10
_L5:
        if (!s.equals("u4b")) goto _L1; else goto _L11
_L11:
        byte0 = 1;
          goto _L10
_L2:
        if (!s.equals("device")) goto _L1; else goto _L12
_L12:
        byte0 = 2;
          goto _L10
_L7:
        if (!s.equals("how_to_use")) goto _L1; else goto _L13
_L13:
        byte0 = 3;
          goto _L10
_L4:
        if (!s.equals("payment")) goto _L1; else goto _L14
_L14:
        byte0 = 4;
          goto _L10
_L8:
        if (!s.equals("rewards")) goto _L1; else goto _L15
_L15:
        byte0 = 5;
          goto _L10
_L6:
        if (!s.equals("vehicle")) goto _L1; else goto _L16
_L16:
        byte0 = 6;
          goto _L10
    }

    public static int b(String s, boolean flag)
    {
        if ("client".equals(s))
        {
            if (flag)
            {
                return hbm.ub__unrolled_card_scroll;
            } else
            {
                return hbm.ub__unrolled_card;
            }
        }
        if (flag)
        {
            return hbm.ub__unrolled_flat_scroll;
        } else
        {
            return hbm.ub__unrolled_flat;
        }
    }

    public static Drawable b(Context context, String s)
    {
        byte byte0;
        context = context.getResources();
        if (TextUtils.isEmpty(s))
        {
            return context.getDrawable(hbj.ub__support_payment_type_unknown);
        }
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 8: default 100
    //                   -1688508082: 156
    //                   -335048001: 216
    //                   61994565: 246
    //                   330089203: 186
    //                   433392345: 171
    //                   878900610: 231
    //                   1481302073: 201
    //                   1631926711: 262;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        break; /* Loop/switch isn't completed */
_L9:
        break MISSING_BLOCK_LABEL_262;
_L10:
        switch (byte0)
        {
        default:
            return context.getDrawable(hbj.ub__support_payment_type_unknown);

        case 0: // '\0'
            return context.getDrawable(hbj.ub__support_payment_type_alipay);

        case 1: // '\001'
            return context.getDrawable(hbj.ub__support_payment_profile_cc_amex);

        case 2: // '\002'
            return context.getDrawable(hbj.ub__support_payment_type_delegate);

        case 3: // '\003'
            return context.getDrawable(hbj.ub__support_payment_profile_cc_discover);

        case 4: // '\004'
            return context.getDrawable(hbj.ub__support_payment_type_googlewallet);

        case 5: // '\005'
            return context.getDrawable(hbj.ub__support_payment_profile_cc_mastercard);

        case 6: // '\006'
            return context.getDrawable(hbj.ub__support_payment_type_paypal);

        case 7: // '\007'
            return context.getDrawable(hbj.ub__support_payment_profile_cc_visa);
        }
_L2:
        if (s.equals("alipay_icon"))
        {
            byte0 = 0;
        }
          goto _L10
_L6:
        if (s.equals("amex_icon"))
        {
            byte0 = 1;
        }
          goto _L10
_L5:
        if (s.equals("delegate_icon"))
        {
            byte0 = 2;
        }
          goto _L10
_L8:
        if (s.equals("dc_icon"))
        {
            byte0 = 3;
        }
          goto _L10
_L3:
        if (s.equals("google_icon"))
        {
            byte0 = 4;
        }
          goto _L10
_L7:
        if (s.equals("mc_icon"))
        {
            byte0 = 5;
        }
          goto _L10
_L4:
        if (s.equals("paypal_icon"))
        {
            byte0 = 6;
        }
          goto _L10
        if (s.equals("visa_icon"))
        {
            byte0 = 7;
        }
          goto _L10
    }

    public static him b(Resources resources, boolean flag)
    {
        float f1;
        if (flag)
        {
            f1 = resources.getDimension(hbi.ub__rds__trip_card_corner_radius);
        } else
        {
            f1 = 0.0F;
        }
        return new him(f1);
    }

    private static String b(long l)
    {
        return (new SimpleDateFormat("EEEE", Locale.ENGLISH)).format(new Date(l));
    }

    public static List b(SupportTree supporttree)
    {
        ArrayList arraylist = new ArrayList();
        if (supporttree != null && supporttree.getTrees() != null)
        {
            SupportNode supportnode;
            for (supporttree = supporttree.getTrees().iterator(); supporttree.hasNext(); arraylist.add(SupportIssue.create().setId(supportnode.getId()).setType(supportnode.getType()).setLabel(a(supportnode.getLabels())).setIcon(supportnode.getIconType())))
            {
                supportnode = (SupportNode)supporttree.next();
            }

        }
        return arraylist;
    }

    private static List b(SupportTree supporttree, String s)
    {
        if (supporttree != null && supporttree.getTrees() != null)
        {
            LinkedList linkedlist = new LinkedList();
            supporttree = supporttree.getTrees().iterator();
            do
            {
                if (!supporttree.hasNext())
                {
                    break;
                }
                SupportNode supportnode = (SupportNode)supporttree.next();
                if ("category".equals(supportnode.getType()))
                {
                    linkedlist.add(supportnode);
                }
            } while (true);
            while (!linkedlist.isEmpty()) 
            {
                supporttree = (SupportNode)linkedlist.remove();
                if (supporttree.getChildren() != null)
                {
                    if (s.equals(supporttree.getId()))
                    {
                        return supporttree.getChildren();
                    }
                    supporttree = supporttree.getChildren().iterator();
                    while (supporttree.hasNext()) 
                    {
                        SupportNode supportnode1 = (SupportNode)supporttree.next();
                        if ("category".equals(supportnode1.getType()))
                        {
                            linkedlist.add(supportnode1);
                        }
                    }
                }
            }
        }
        return null;
    }

    private static String c(long l)
    {
        return (new SimpleDateFormat("MM/dd")).format(new Date(l));
    }

    public static String c(String s)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return PhoneNumberUtils.formatNumber(s, Locale.getDefault().getCountry());
        } else
        {
            return PhoneNumberUtils.formatNumber(s);
        }
    }

    private static long d(String s)
    {
        try
        {
            s = i.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ijg.d(s, "Trip date failed to parse", new Object[0]);
            return -1L;
        }
        return s.getTime();
    }

    private static String d(long l)
    {
        return (new SimpleDateFormat("MM/dd/yy")).format(new Date(l));
    }

    private static int e(String s)
    {
        s = s.toLowerCase();
        s.hashCode();
        JVM INSTR lookupswitch 7: default 76
    //                   -2114201671: 212
    //                   -1266285217: 197
    //                   -1068502768: 137
    //                   -977343923: 152
    //                   -891186736: 122
    //                   1393530710: 167
    //                   1572055514: 182;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        byte byte0 = -1;
_L10:
        switch (byte0)
        {
        default:
            return -1;

        case 0: // '\0'
            return hbo.ub__rds__trip_day_sunday;

        case 1: // '\001'
            return hbo.ub__rds__trip_day_monday;

        case 2: // '\002'
            return hbo.ub__rds__trip_day_tuesday;

        case 3: // '\003'
            return hbo.ub__rds__trip_day_wednesday;

        case 4: // '\004'
            return hbo.ub__rds__trip_day_thursday;

        case 5: // '\005'
            return hbo.ub__rds__trip_day_friday;

        case 6: // '\006'
            return hbo.ub__rds__trip_day_saturday;
        }
_L6:
        if (!s.equals("sunday")) goto _L1; else goto _L9
_L9:
        byte0 = 0;
          goto _L10
_L4:
        if (!s.equals("monday")) goto _L1; else goto _L11
_L11:
        byte0 = 1;
          goto _L10
_L5:
        if (!s.equals("tuesday")) goto _L1; else goto _L12
_L12:
        byte0 = 2;
          goto _L10
_L7:
        if (!s.equals("wednesday")) goto _L1; else goto _L13
_L13:
        byte0 = 3;
          goto _L10
_L8:
        if (!s.equals("thursday")) goto _L1; else goto _L14
_L14:
        byte0 = 4;
          goto _L10
_L3:
        if (!s.equals("friday")) goto _L1; else goto _L15
_L15:
        byte0 = 5;
          goto _L10
_L2:
        if (!s.equals("saturday")) goto _L1; else goto _L16
_L16:
        byte0 = 6;
          goto _L10
    }

    private static long f(String s)
    {
        long l = -1L;
        try
        {
            s = j.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ijg.d(s, "Contact timestamp failed to parse", new Object[0]);
            return -1L;
        }
        if (s.getTime() >= 0L)
        {
            l = s.getTime();
        }
        return l;
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(1L);
        b = TimeUnit.MINUTES.toMillis(1L);
        c = TimeUnit.HOURS.toMillis(1L);
        d = TimeUnit.DAYS.toMillis(1L);
        e = TimeUnit.DAYS.toMillis(7L);
        f = TimeUnit.DAYS.toMillis(30L);
        g = TimeUnit.DAYS.toMillis(365L);
        h = b * -5L;
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        j = simpledateformat;
        simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }
}
