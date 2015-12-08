// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.provider;

import android.content.ContentProvider;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.jiubang.core.b.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.provider:
//            a

public class WeatherContentProvider extends ContentProvider
{

    public static final Uri A;
    public static final Uri B;
    public static final Uri C;
    public static final Uri D;
    public static final Uri E;
    public static final Uri F;
    public static final Uri G;
    public static final Uri H;
    public static final Uri I;
    public static final Uri J;
    private static final Uri K;
    private static final UriMatcher L;
    private static volatile com.gau.go.launcherex.gowidget.weather.provider.a M;
    public static final Uri a;
    public static final Uri b;
    public static final Uri c;
    public static final Uri d;
    public static final Uri e;
    public static final Uri f;
    public static final Uri g;
    public static final Uri h;
    public static final Uri i;
    public static final Uri j;
    public static final Uri k;
    public static final Uri l;
    public static final Uri m;
    public static final Uri n;
    public static final Uri o;
    public static final Uri p;
    public static final Uri q;
    public static final Uri r;
    public static final Uri s;
    public static final Uri t;
    public static final Uri u;
    public static final Uri v;
    public static final Uri w;
    public static final Uri x;
    public static final Uri y;
    public static final Uri z;

    public WeatherContentProvider()
    {
    }

    public ContentProviderResult[] applyBatch(ArrayList arraylist)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = M.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        arraylist = super.applyBatch(arraylist);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return arraylist;
        Exception exception;
        exception;
        arraylist = null;
_L4:
        exception.printStackTrace();
        sqlitedatabase.endTransaction();
        return arraylist;
        exception;
_L2:
        exception.printStackTrace();
        return arraylist;
        arraylist;
        try
        {
            sqlitedatabase.endTransaction();
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        throw arraylist;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int delete(Uri uri, String s1, String as[])
    {
        String s2;
        String s3;
        int i1;
        i1 = L.match(uri);
        s3 = "";
        s2 = s3;
        i1;
        JVM INSTR tableswitch 101 136: default 180
    //                   101 227
    //                   102 234
    //                   103 241
    //                   104 184
    //                   105 248
    //                   106 255
    //                   107 262
    //                   108 269
    //                   109 276
    //                   110 184
    //                   111 283
    //                   112 290
    //                   113 297
    //                   114 304
    //                   115 184
    //                   116 311
    //                   117 318
    //                   118 325
    //                   119 332
    //                   120 339
    //                   121 346
    //                   122 353
    //                   123 360
    //                   124 367
    //                   125 374
    //                   126 381
    //                   127 388
    //                   128 395
    //                   129 402
    //                   130 409
    //                   131 416
    //                   132 423
    //                   133 430
    //                   134 437
    //                   135 184
    //                   136 444;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L5 _L11 _L12 _L13 _L14 _L5 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L5 _L34
_L34:
        break MISSING_BLOCK_LABEL_444;
_L5:
        break; /* Loop/switch isn't completed */
_L1:
        s2 = s3;
_L35:
        if (!"".equals(s2))
        {
            int j1 = M.a(s2, s1, as);
            if (j1 > 0)
            {
                getContext().getContentResolver().notifyChange(uri, null);
            }
            return j1;
        } else
        {
            return 0;
        }
_L2:
        s2 = "citynow";
          goto _L35
_L3:
        s2 = "forecast";
          goto _L35
_L4:
        s2 = "weather11_city";
          goto _L35
_L6:
        s2 = "hourly";
          goto _L35
_L7:
        s2 = "alarm";
          goto _L35
_L8:
        s2 = "common_setting_table";
          goto _L35
_L9:
        s2 = "app_widget_theme_table";
          goto _L35
_L10:
        s2 = "gowidget_theme_table";
          goto _L35
_L11:
        s2 = "extreme";
          goto _L35
_L12:
        s2 = "go_widget_binding_city_table";
          goto _L35
_L13:
        s2 = "recommended_apps";
          goto _L35
_L14:
        s2 = "msg_center";
          goto _L35
_L15:
        s2 = "messagecenter";
          goto _L35
_L16:
        s2 = "featured_theme_table";
          goto _L35
_L17:
        s2 = "featured_theme_tab_table";
          goto _L35
_L18:
        s2 = "ad_info_table";
          goto _L35
_L19:
        s2 = "next_widget_binding_city_table";
          goto _L35
_L20:
        s2 = "coupon_table";
          goto _L35
_L21:
        s2 = "promo_table";
          goto _L35
_L22:
        s2 = "appwidget_info_table";
          goto _L35
_L23:
        s2 = "user_table";
          goto _L35
_L24:
        s2 = "photo_table";
          goto _L35
_L25:
        s2 = "my_photo_table";
          goto _L35
_L26:
        s2 = "photo_upload_table";
          goto _L35
_L27:
        s2 = "my_award_table";
          goto _L35
_L28:
        s2 = "award_table";
          goto _L35
_L29:
        s2 = "prompt_table";
          goto _L35
_L30:
        s2 = "pollenIndex";
          goto _L35
_L31:
        s2 = "pollensource";
          goto _L35
_L32:
        s2 = "coupons_hot_table";
          goto _L35
_L33:
        s2 = "coupons_collect_table";
          goto _L35
        s2 = "message_center_table";
          goto _L35
    }

    public String getType(Uri uri)
    {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        String s1;
        String s2;
        int i1;
        i1 = L.match(uri);
        s2 = "";
        s1 = s2;
        i1;
        JVM INSTR tableswitch 101 136: default 176
    //                   101 229
    //                   102 235
    //                   103 241
    //                   104 179
    //                   105 247
    //                   106 253
    //                   107 259
    //                   108 265
    //                   109 271
    //                   110 179
    //                   111 277
    //                   112 283
    //                   113 289
    //                   114 295
    //                   115 179
    //                   116 301
    //                   117 307
    //                   118 313
    //                   119 319
    //                   120 325
    //                   121 331
    //                   122 337
    //                   123 343
    //                   124 349
    //                   125 355
    //                   126 361
    //                   127 367
    //                   128 373
    //                   129 379
    //                   130 385
    //                   131 391
    //                   132 397
    //                   133 403
    //                   134 409
    //                   135 179
    //                   136 415;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L5 _L11 _L12 _L13 _L14 _L5 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L5 _L34
_L1:
        s1 = s2;
_L5:
        if (!"".equals(s1))
        {
            long l1 = M.a(s1, contentvalues);
            if (l1 > 0L)
            {
                contentvalues = ContentUris.withAppendedId(K, l1);
                getContext().getContentResolver().notifyChange(uri, null);
                return contentvalues;
            }
        }
        break; /* Loop/switch isn't completed */
_L2:
        s1 = "citynow";
        continue; /* Loop/switch isn't completed */
_L3:
        s1 = "forecast";
        continue; /* Loop/switch isn't completed */
_L4:
        s1 = "weather11_city";
        continue; /* Loop/switch isn't completed */
_L6:
        s1 = "hourly";
        continue; /* Loop/switch isn't completed */
_L7:
        s1 = "alarm";
        continue; /* Loop/switch isn't completed */
_L8:
        s1 = "common_setting_table";
        continue; /* Loop/switch isn't completed */
_L9:
        s1 = "app_widget_theme_table";
        continue; /* Loop/switch isn't completed */
_L10:
        s1 = "gowidget_theme_table";
        continue; /* Loop/switch isn't completed */
_L11:
        s1 = "extreme";
        continue; /* Loop/switch isn't completed */
_L12:
        s1 = "go_widget_binding_city_table";
        continue; /* Loop/switch isn't completed */
_L13:
        s1 = "recommended_apps";
        continue; /* Loop/switch isn't completed */
_L14:
        s1 = "msg_center";
        continue; /* Loop/switch isn't completed */
_L15:
        s1 = "messagecenter";
        continue; /* Loop/switch isn't completed */
_L16:
        s1 = "featured_theme_table";
        continue; /* Loop/switch isn't completed */
_L17:
        s1 = "featured_theme_tab_table";
        continue; /* Loop/switch isn't completed */
_L18:
        s1 = "ad_info_table";
        continue; /* Loop/switch isn't completed */
_L19:
        s1 = "next_widget_binding_city_table";
        continue; /* Loop/switch isn't completed */
_L20:
        s1 = "coupon_table";
        continue; /* Loop/switch isn't completed */
_L21:
        s1 = "promo_table";
        continue; /* Loop/switch isn't completed */
_L22:
        s1 = "appwidget_info_table";
        continue; /* Loop/switch isn't completed */
_L23:
        s1 = "user_table";
        continue; /* Loop/switch isn't completed */
_L24:
        s1 = "photo_table";
        continue; /* Loop/switch isn't completed */
_L25:
        s1 = "my_photo_table";
        continue; /* Loop/switch isn't completed */
_L26:
        s1 = "photo_upload_table";
        continue; /* Loop/switch isn't completed */
_L27:
        s1 = "my_award_table";
        continue; /* Loop/switch isn't completed */
_L28:
        s1 = "award_table";
        continue; /* Loop/switch isn't completed */
_L29:
        s1 = "prompt_table";
        continue; /* Loop/switch isn't completed */
_L30:
        s1 = "pollenIndex";
        continue; /* Loop/switch isn't completed */
_L31:
        s1 = "pollensource";
        continue; /* Loop/switch isn't completed */
_L32:
        s1 = "coupons_hot_table";
        continue; /* Loop/switch isn't completed */
_L33:
        s1 = "coupons_collect_table";
        continue; /* Loop/switch isn't completed */
_L34:
        s1 = "message_center_table";
        if (true) goto _L5; else goto _L35
_L35:
        return null;
    }

    public boolean onCreate()
    {
        if (M == null)
        {
            M = com.gau.go.launcherex.gowidget.weather.provider.a.a(getContext(), "weather.db", 59);
        }
        return true;
    }

    public Cursor query(Uri uri, String as[], String s1, String as1[], String s2)
    {
        Cursor cursor;
        byte byte0;
        int i1;
        boolean flag;
        byte0 = 2;
        cursor = null;
        flag = true;
        i1 = 0;
        L.match(uri);
        JVM INSTR tableswitch 101 136: default 176
    //                   101 211
    //                   102 217
    //                   103 223
    //                   104 229
    //                   105 236
    //                   106 242
    //                   107 248
    //                   108 254
    //                   109 260
    //                   110 290
    //                   111 266
    //                   112 272
    //                   113 278
    //                   114 284
    //                   115 376
    //                   116 352
    //                   117 358
    //                   118 364
    //                   119 370
    //                   120 492
    //                   121 498
    //                   122 504
    //                   123 510
    //                   124 516
    //                   125 522
    //                   126 528
    //                   127 534
    //                   128 540
    //                   129 546
    //                   130 552
    //                   131 558
    //                   132 564
    //                   133 570
    //                   134 576
    //                   135 582
    //                   136 687;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37
_L1:
        uri = "";
_L38:
        if (!"".equals(uri))
        {
            cursor = M.a(uri, as, s1, as1, null, null, s2, null);
        }
        return cursor;
_L2:
        uri = "citynow";
          goto _L38
_L3:
        uri = "forecast";
          goto _L38
_L4:
        uri = "weather11_city";
          goto _L38
_L5:
        uri = "weather11_city, citynow";
          goto _L38
_L6:
        uri = "hourly";
          goto _L38
_L7:
        uri = "alarm";
          goto _L38
_L8:
        uri = "common_setting_table";
          goto _L38
_L9:
        uri = "app_widget_theme_table";
          goto _L38
_L10:
        uri = "gowidget_theme_table";
          goto _L38
_L12:
        uri = "extreme";
          goto _L38
_L13:
        uri = "go_widget_binding_city_table";
          goto _L38
_L14:
        uri = "recommended_apps";
          goto _L38
_L15:
        uri = "msg_center";
          goto _L38
_L11:
        uri = new MatrixCursor(new String[] {
            "purchase_state"
        });
        if (GoWidgetApplication.b(getContext().getApplicationContext()).b())
        {
            byte0 = flag;
        } else
        {
            byte0 = 0;
        }
        uri.addRow(new Integer[] {
            Integer.valueOf(byte0)
        });
        return uri;
_L17:
        uri = "messagecenter";
          goto _L38
_L18:
        uri = "featured_theme_table";
          goto _L38
_L19:
        uri = "featured_theme_tab_table";
          goto _L38
_L20:
        uri = "ad_info_table";
          goto _L38
_L16:
        uri = GoWidgetApplication.c(getContext().getApplicationContext());
        if (uri != null)
        {
            uri = uri.a();
            as = new MatrixCursor(new String[] {
                "flag_new_theme", "flag_nextlite_notification"
            });
            boolean flag1 = uri.getBoolean("new_theme", false);
            boolean flag3 = uri.getBoolean("key_show_nextlite_notification", false);
            if (flag1)
            {
                byte0 = 1;
            } else
            {
                byte0 = 0;
            }
            if (flag3)
            {
                i1 = 1;
            }
            as.addRow(new Integer[] {
                Integer.valueOf(byte0), Integer.valueOf(i1)
            });
            return as;
        }
          goto _L1
_L21:
        uri = "next_widget_binding_city_table";
          goto _L38
_L22:
        uri = "coupon_table";
          goto _L38
_L23:
        uri = "promo_table";
          goto _L38
_L24:
        uri = "appwidget_info_table";
          goto _L38
_L25:
        uri = "user_table";
          goto _L38
_L26:
        uri = "photo_table";
          goto _L38
_L27:
        uri = "my_photo_table";
          goto _L38
_L28:
        uri = "photo_upload_table";
          goto _L38
_L29:
        uri = "my_award_table";
          goto _L38
_L30:
        uri = "award_table";
          goto _L38
_L31:
        uri = "prompt_table";
          goto _L38
_L32:
        uri = "pollenIndex";
          goto _L38
_L33:
        uri = "pollensource";
          goto _L38
_L34:
        uri = "coupons_hot_table";
          goto _L38
_L35:
        uri = "coupons_collect_table";
          goto _L38
_L36:
        uri = GoWidgetApplication.b(getContext().getApplicationContext());
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_693;
        }
        if (uri.d())
        {
            byte0 = 1;
        } else
        {
            boolean flag2 = uri.c();
            boolean flag4 = uri.b();
            if (flag2 && flag4)
            {
                byte0 = 4;
            } else
            if (!flag2)
            {
                if (!flag4)
                {
                    break MISSING_BLOCK_LABEL_693;
                }
                byte0 = 3;
            }
        }
_L39:
        uri = new MatrixCursor(new String[] {
            "purchase_state"
        });
        uri.addRow(new Integer[] {
            Integer.valueOf(byte0)
        });
        return uri;
_L37:
        uri = "message_center_table";
          goto _L38
        byte0 = 0;
          goto _L39
    }

    public int update(Uri uri, ContentValues contentvalues, String s1, String as[])
    {
        L.match(uri);
        JVM INSTR tableswitch 101 136: default 164
    //                   101 214
    //                   102 221
    //                   103 228
    //                   104 164
    //                   105 235
    //                   106 242
    //                   107 249
    //                   108 256
    //                   109 263
    //                   110 164
    //                   111 270
    //                   112 277
    //                   113 284
    //                   114 291
    //                   115 298
    //                   116 495
    //                   117 502
    //                   118 509
    //                   119 516
    //                   120 523
    //                   121 530
    //                   122 537
    //                   123 544
    //                   124 551
    //                   125 558
    //                   126 565
    //                   127 572
    //                   128 579
    //                   129 586
    //                   130 593
    //                   131 600
    //                   132 607
    //                   133 614
    //                   134 621
    //                   135 164
    //                   136 628;
           goto _L1 _L2 _L3 _L4 _L1 _L5 _L6 _L7 _L8 _L9 _L1 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L1 _L34
_L34:
        break MISSING_BLOCK_LABEL_628;
_L1:
        Object obj = "";
_L35:
        if (!"".equals(obj))
        {
            int i1 = M.a(((String) (obj)), contentvalues, s1, as);
            if (i1 > 0)
            {
                getContext().getContentResolver().notifyChange(uri, null);
            }
            return i1;
        } else
        {
            return 0;
        }
_L2:
        obj = "citynow";
          goto _L35
_L3:
        obj = "forecast";
          goto _L35
_L4:
        obj = "weather11_city";
          goto _L35
_L5:
        obj = "hourly";
          goto _L35
_L6:
        obj = "alarm";
          goto _L35
_L7:
        obj = "common_setting_table";
          goto _L35
_L8:
        obj = "app_widget_theme_table";
          goto _L35
_L9:
        obj = "gowidget_theme_table";
          goto _L35
_L10:
        obj = "extreme";
          goto _L35
_L11:
        obj = "go_widget_binding_city_table";
          goto _L35
_L12:
        obj = "recommended_apps";
          goto _L35
_L13:
        obj = "msg_center";
          goto _L35
_L14:
        obj = GoWidgetApplication.c(getContext().getApplicationContext());
        if (obj != null)
        {
            obj = ((a) (obj)).a().edit();
            Iterator iterator = contentvalues.valueSet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                String s2 = (String)entry.getKey();
                if ("count_gowidget_42".equals(s2) || "count_gowidget_41".equals(s2) || "count_gowidget_21".equals(s2) || "count_gowidget_11".equals(s2))
                {
                    ((android.content.SharedPreferences.Editor) (obj)).putInt(s2, ((Integer)entry.getValue()).intValue());
                } else
                if ("key_maps_select_type".equals(s2))
                {
                    ((android.content.SharedPreferences.Editor) (obj)).putInt(s2, ((Integer)entry.getValue()).intValue());
                }
            } while (true);
            ((android.content.SharedPreferences.Editor) (obj)).commit();
        }
        obj = "";
          goto _L35
_L15:
        obj = "messagecenter";
          goto _L35
_L16:
        obj = "featured_theme_table";
          goto _L35
_L17:
        obj = "featured_theme_tab_table";
          goto _L35
_L18:
        obj = "ad_info_table";
          goto _L35
_L19:
        obj = "next_widget_binding_city_table";
          goto _L35
_L20:
        obj = "coupon_table";
          goto _L35
_L21:
        obj = "promo_table";
          goto _L35
_L22:
        obj = "appwidget_info_table";
          goto _L35
_L23:
        obj = "user_table";
          goto _L35
_L24:
        obj = "photo_table";
          goto _L35
_L25:
        obj = "my_photo_table";
          goto _L35
_L26:
        obj = "photo_upload_table";
          goto _L35
_L27:
        obj = "my_award_table";
          goto _L35
_L28:
        obj = "award_table";
          goto _L35
_L29:
        obj = "prompt_table";
          goto _L35
_L30:
        obj = "pollenIndex";
          goto _L35
_L31:
        obj = "pollensource";
          goto _L35
_L32:
        obj = "coupons_hot_table";
          goto _L35
_L33:
        obj = "coupons_collect_table";
          goto _L35
        obj = "message_center_table";
          goto _L35
    }

    static 
    {
        K = Uri.parse("content://com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider/");
        a = Uri.parse((new StringBuilder()).append(K.toString()).append("citynow").toString());
        b = Uri.parse((new StringBuilder()).append(K.toString()).append("forecast").toString());
        c = Uri.parse((new StringBuilder()).append(K.toString()).append("weather11_city").toString());
        d = Uri.parse((new StringBuilder()).append(K.toString()).append("weather11_city").append("citynow").toString());
        e = Uri.parse((new StringBuilder()).append(K.toString()).append("hourly").toString());
        f = Uri.parse((new StringBuilder()).append(K.toString()).append("alarm").toString());
        g = Uri.parse((new StringBuilder()).append(K.toString()).append("common_setting_table").toString());
        h = Uri.parse((new StringBuilder()).append(K.toString()).append("app_widget_theme_table").toString());
        i = Uri.parse((new StringBuilder()).append(K.toString()).append("gowidget_theme_table").toString());
        j = Uri.parse((new StringBuilder()).append(K.toString()).append("Google_play_billing").toString());
        k = Uri.parse((new StringBuilder()).append(K.toString()).append("extreme").toString());
        l = Uri.parse((new StringBuilder()).append(K.toString()).append("go_widget_binding_city_table").toString());
        m = Uri.parse((new StringBuilder()).append(K.toString()).append("recommended_apps").toString());
        n = Uri.parse((new StringBuilder()).append(K.toString()).append("msg_center").toString());
        o = Uri.parse((new StringBuilder()).append(K.toString()).append("goweatherex_info").toString());
        p = Uri.parse((new StringBuilder()).append(K.toString()).append("messagecenter").toString());
        q = Uri.parse((new StringBuilder()).append(K.toString()).append("message_center_table").toString());
        r = Uri.parse((new StringBuilder()).append(K.toString()).append("featured_theme_table").toString());
        s = Uri.parse((new StringBuilder()).append(K.toString()).append("featured_theme_tab_table").toString());
        t = Uri.parse((new StringBuilder()).append(K.toString()).append("ad_info_table").toString());
        u = Uri.parse((new StringBuilder()).append(K.toString()).append("appwidget_info_table").toString());
        v = Uri.parse((new StringBuilder()).append(K.toString()).append("user_table").toString());
        w = Uri.parse((new StringBuilder()).append(K.toString()).append("photo_table").toString());
        x = Uri.parse((new StringBuilder()).append(K.toString()).append("my_photo_table").toString());
        y = Uri.parse((new StringBuilder()).append(K.toString()).append("photo_upload_table").toString());
        z = Uri.parse((new StringBuilder()).append(K.toString()).append("my_award_table").toString());
        A = Uri.parse((new StringBuilder()).append(K.toString()).append("award_table").toString());
        B = Uri.parse((new StringBuilder()).append(K.toString()).append("prompt_table").toString());
        C = Uri.parse((new StringBuilder()).append(K.toString()).append("coupons_hot_table").toString());
        D = Uri.parse((new StringBuilder()).append(K.toString()).append("coupons_collect_table").toString());
        E = Uri.parse((new StringBuilder()).append(K.toString()).append("next_widget_binding_city_table").toString());
        F = Uri.parse((new StringBuilder()).append(K.toString()).append("coupon_table").toString());
        G = Uri.parse((new StringBuilder()).append(K.toString()).append("promo_table").toString());
        H = Uri.parse((new StringBuilder()).append(K.toString()).append("pollenIndex").toString());
        I = Uri.parse((new StringBuilder()).append(K.toString()).append("pollensource").toString());
        J = Uri.parse((new StringBuilder()).append(K.toString()).append("user_permission").toString());
        L = new UriMatcher(-1);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "citynow", 101);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "forecast", 102);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "weather11_city", 103);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "weather11_citycitynow", 104);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "hourly", 105);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "alarm", 106);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "common_setting_table", 107);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "app_widget_theme_table", 108);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "gowidget_theme_table", 109);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "Google_play_billing", 110);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "extreme", 111);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "go_widget_binding_city_table", 112);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "recommended_apps", 113);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "msg_center", 114);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "goweatherex_info", 115);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "messagecenter", 116);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "featured_theme_table", 117);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "featured_theme_tab_table", 118);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "ad_info_table", 119);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "user_table", 124);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "photo_table", 125);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "my_photo_table", 126);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "photo_upload_table", 127);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "my_award_table", 128);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "award_table", 129);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "prompt_table", 130);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "next_widget_binding_city_table", 120);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "coupon_table", 121);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "promo_table", 122);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "appwidget_info_table", 123);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "pollenIndex", 131);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "pollensource", 132);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "coupons_hot_table", 133);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "coupons_collect_table", 134);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "user_permission", 135);
        L.addURI("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", "message_center_table", 136);
    }
}
