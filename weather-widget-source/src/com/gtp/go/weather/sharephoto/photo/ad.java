// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.app.Activity;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.SparseArray;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.gtp.a.a.b.c;
import com.gtp.go.weather.sharephoto.a.f;
import com.gtp.go.weather.sharephoto.b.a.d;
import com.gtp.go.weather.sharephoto.b.g;
import com.gtp.go.weather.sharephoto.b.o;
import com.gtp.go.weather.sharephoto.d.h;
import com.gtp.go.weather.sharephoto.d.j;
import com.jiubang.core.c.a.a;
import com.jiubang.core.c.a.b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            ak, ac, ai, am, 
//            ae, a, ag, al, 
//            af, ah, aj

public class ad
{

    public static final String a;
    private static SparseArray g = new SparseArray();
    private Context b;
    private boolean c;
    private boolean d;
    private b e;
    private ah f;

    public ad(Context context)
    {
        c = true;
        d = false;
        b = context;
        c = true;
        d = false;
        com.gtp.a.a.b.c.a("delete_photos", (new StringBuilder()).append("mJudgeShouldClearPhotoData = ").append(c).toString());
    }

    private int a(int i, String s, int k, ArrayList arraylist, ArrayList arraylist1)
    {
        Object obj;
        int l;
        int i1;
        int j1;
        int l1;
        int i2;
        int j2;
        long l2;
        l = -1;
        j1 = l;
        try
        {
            s = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (com.gtp.a.a.b.c.a())
            {
                s.printStackTrace();
            }
            return j1;
        }
        j1 = l;
        l1 = s.optInt("pageCount");
        j1 = l1;
        com.gtp.a.a.b.c.a("photo", (new StringBuilder()).append("pageCount --> ").append(l1).toString());
        j1 = l1;
        s = s.optJSONArray("images");
        if (s == null) goto _L2; else goto _L1
_L1:
        j1 = l1;
        i2 = s.length();
        i1 = 0;
_L37:
        if (i1 >= i2) goto _L2; else goto _L3
_L3:
        j1 = l1;
        obj = s.getJSONObject(i1);
        j1 = l1;
        l2 = ((JSONObject) (obj)).optLong("imageId", -1L);
        j1 = l1;
        j2 = ((JSONObject) (obj)).optInt("imageType", -1);
        if (j2 != -1 && l2 != -1L) goto _L5; else goto _L4
_L12:
        if (l == 0) goto _L7; else goto _L6
_L6:
        j1 = l1;
        com.gtp.a.a.b.c.a("photo", "\u7591\u4F3C\u51FA\u73B0\u56FE\u7247\u91CD\u590D\u6570\u636E\u4E0B\u53D1\uFF01");
          goto _L4
_L39:
        j1 = l1;
        Object obj1 = arraylist.iterator();
_L11:
        j1 = l1;
        if (!((Iterator) (obj1)).hasNext()) goto _L9; else goto _L8
_L8:
        j1 = l1;
        if (((g)((Iterator) (obj1)).next()).a() != l2) goto _L11; else goto _L10
_L10:
        l = 1;
          goto _L12
_L40:
        j1 = l1;
        obj1 = arraylist1.iterator();
_L15:
        int k1;
        l = k1;
        j1 = l1;
        if (!((Iterator) (obj1)).hasNext()) goto _L12; else goto _L13
_L13:
        j1 = l1;
        if (((g)((Iterator) (obj1)).next()).a() != l2) goto _L15; else goto _L14
_L14:
        l = 1;
          goto _L12
_L7:
        j1 = l1;
        obj1 = new g();
        j1 = l1;
        ((g) (obj1)).c(k);
        if (i != 0) goto _L17; else goto _L16
_L16:
        if (i2 >= 20) goto _L19; else goto _L18
_L18:
        j1 = l1;
        ((g) (obj1)).d(l1 - 1);
_L32:
        j1 = l1;
        ((g) (obj1)).a(l2);
        j1 = l1;
        ((g) (obj1)).a(((JSONObject) (obj)).getString("userId"));
        j1 = l1;
        ((g) (obj1)).a(((JSONObject) (obj)).getInt("favour"));
        j1 = l1;
        ((g) (obj1)).a(((JSONObject) (obj)).getBoolean("isMyfavourite"));
        j1 = l1;
        ((g) (obj1)).b(((JSONObject) (obj)).getString("cityId"));
        j1 = l1;
        ((g) (obj1)).b(((JSONObject) (obj)).getInt("backCount"));
        j1 = l1;
        ((g) (obj1)).b(((JSONObject) (obj)).getLong("upTimeLong"));
        j1 = l1;
        ((g) (obj1)).c(((JSONObject) (obj)).getString("upTimeDate"));
        j1 = l1;
        ((g) (obj1)).e(j2);
        j1 = l1;
        ((g) (obj1)).d(((JSONObject) (obj)).optString("city"));
        j1 = l1;
        ((g) (obj1)).e(((JSONObject) (obj)).optString("desc"));
        j1 = l1;
        Object obj2 = ((JSONObject) (obj)).optString("addr");
        j1 = l1;
        if (TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            break MISSING_BLOCK_LABEL_565;
        }
        j1 = l1;
        ((g) (obj1)).g(((String) (obj2)));
        Exception exception;
        try
        {
            ((g) (obj1)).f((new JSONObject(((String) (obj2)))).optString("latlng"));
        }
        catch (JSONException jsonexception) { }
        j1 = l1;
        obj = ((JSONObject) (obj)).getJSONArray("images");
        if (obj == null) goto _L21; else goto _L20
_L20:
        j1 = l1;
        l = ((JSONArray) (obj)).length();
          goto _L22
_L29:
        if (k1 >= l) goto _L24; else goto _L23
_L23:
        j1 = l1;
        obj2 = ((JSONArray) (obj)).getJSONObject(k1);
        j1 = l1;
        j2 = ((JSONObject) (obj2)).getInt("type");
        j2;
        JVM INSTR tableswitch 1 3: default 660
    //                   1 729
    //                   2 815
    //                   3 866;
           goto _L25 _L26 _L27 _L28
_L25:
        k1++;
          goto _L29
_L19:
        if (i2 - 10 - i1 <= 0) goto _L31; else goto _L30
_L30:
        j1 = l1;
        ((g) (obj1)).d(l1);
          goto _L32
_L31:
        j1 = l1;
        ((g) (obj1)).d(l1 - 1);
          goto _L32
_L17:
        j1 = l1;
        ((g) (obj1)).d(i);
          goto _L32
_L21:
        l = 0;
          goto _L22
_L26:
        j1 = l1;
        ((g) (obj1)).h(((JSONObject) (obj2)).getString("url"));
        j1 = l1;
        ((g) (obj1)).f(((JSONObject) (obj2)).getInt("width"));
        j1 = l1;
        ((g) (obj1)).g(((JSONObject) (obj2)).getInt("hight"));
          goto _L25
        exception;
        j1 = l1;
        com.gtp.a.a.b.c.a("photo", "\u5C0F\u5FC3\uFF0C\u7591\u4F3C\u6709\u4E0B\u53D1\u4E0D\u80FD\u4E3A\u7A7A\u7684\u53C2\u6570\u4E3A\u7A7A\uFF01");
        j1 = l1;
        if (!com.gtp.a.a.b.c.a()) goto _L4; else goto _L33
_L33:
        j1 = l1;
        exception.printStackTrace();
          goto _L4
_L27:
        j1 = l1;
        ((g) (obj1)).j(((JSONObject) (obj2)).getString("url"));
        j1 = l1;
        ((g) (obj1)).h(((JSONObject) (obj2)).getInt("width"));
        j1 = l1;
        ((g) (obj1)).i(((JSONObject) (obj2)).getInt("hight"));
          goto _L25
_L28:
        j1 = l1;
        ((g) (obj1)).l(((JSONObject) (obj2)).getString("url"));
        j1 = l1;
        ((g) (obj1)).j(((JSONObject) (obj2)).getInt("width"));
        j1 = l1;
        ((g) (obj1)).k(((JSONObject) (obj2)).getInt("hight"));
          goto _L25
_L46:
        j1 = l1;
        if (((g) (obj1)).g() != 1) goto _L35; else goto _L34
_L34:
        j1 = l1;
        arraylist.add(obj1);
          goto _L4
_L35:
        j1 = l1;
        if (((g) (obj1)).g() != 2 || i != 0 || arraylist1 == null) goto _L4; else goto _L36
_L36:
        j1 = l1;
        arraylist1.add(obj1);
          goto _L4
_L44:
        j1 = l1;
        arraylist.add(obj1);
          goto _L4
_L42:
        j1 = l1;
        com.gtp.a.a.b.c.a("photo", "\u5C0F\u5FC3\uFF0C\u56FE\u7247\u4E0B\u8F7D\u5730\u5740\u53EF\u80FD\u4E3A\u7A7A\uFF01");
          goto _L4
_L2:
        return l1;
_L9:
        l = 0;
          goto _L12
_L4:
        i1++;
          goto _L37
_L5:
        k1 = 0;
        j2;
        JVM INSTR tableswitch 1 2: default 1064
    //                   1 185
    //                   2 239;
           goto _L38 _L39 _L40
_L38:
        l = k1;
          goto _L12
_L22:
        if (l < 2) goto _L42; else goto _L41
_L41:
        k1 = 0;
          goto _L29
_L24:
        k;
        JVM INSTR tableswitch 1 3: default 1112
    //                   1 917
    //                   2 917
    //                   3 982;
           goto _L4 _L43 _L43 _L44
_L43:
        if (true) goto _L46; else goto _L45
_L45:
          goto _L29
    }

    static int a(ad ad1, int i, String s, int k, ArrayList arraylist, ArrayList arraylist1)
    {
        return ad1.a(i, s, k, arraylist, arraylist1);
    }

    private ContentValues a(g g1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("photo_type", Integer.valueOf(g1.e()));
        contentvalues.put("photo_id", Long.valueOf(g1.a()));
        contentvalues.put("belong_page", Integer.valueOf(g1.f()));
        contentvalues.put("image_type", Integer.valueOf(g1.g()));
        contentvalues.put("user_id", g1.b());
        contentvalues.put("favour", Integer.valueOf(g1.c()));
        contentvalues.put("backcount", Integer.valueOf(g1.d()));
        contentvalues.put("is_myfavourite", Boolean.valueOf(g1.h()));
        contentvalues.put("city_id", g1.i());
        contentvalues.put("city", g1.l());
        contentvalues.put("up_time_long", Long.valueOf(g1.j()));
        contentvalues.put("up_time_date", g1.k());
        contentvalues.put("desc", g1.m());
        contentvalues.put("addr", g1.o());
        contentvalues.put("latlng", g1.n());
        contentvalues.put("original_url", g1.p());
        String s1 = g1.q();
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = h.a(j.b, g1.p());
            g1.i(s);
        }
        contentvalues.put("original_path", s);
        contentvalues.put("original_w_h", (new StringBuilder()).append(g1.r()).append("*").append(g1.s()).toString());
        contentvalues.put("watermark_url", g1.t());
        s1 = g1.u();
        s = s1;
        if (TextUtils.isEmpty(s1))
        {
            String s2 = g1.t();
            s = s1;
            if (!TextUtils.isEmpty(s2))
            {
                s = h.a(j.c, s2);
                g1.k(s);
            }
        }
        contentvalues.put("watermark_path", s);
        contentvalues.put("watermark_w_h", (new StringBuilder()).append(g1.v()).append("*").append(g1.w()).toString());
        contentvalues.put("compose_url", g1.x());
        s1 = g1.y();
        s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = h.a(j.a, g1.x());
            g1.m(s);
        }
        contentvalues.put("compose_path", s);
        contentvalues.put("compose_w_h", (new StringBuilder()).append(g1.A()).append("*").append(g1.B()).toString());
        return contentvalues;
    }

    static SparseArray a()
    {
        return g;
    }

    private g a(String s, ArrayList arraylist)
    {
        for (arraylist = arraylist.iterator(); arraylist.hasNext();)
        {
            g g1 = (g)arraylist.next();
            if (s.equals(String.valueOf(g1.a())))
            {
                return g1;
            }
        }

        return null;
    }

    static ah a(ad ad1)
    {
        return ad1.f;
    }

    private ArrayList a(int i)
    {
        String s;
        if (i == 0)
        {
            s = (new StringBuilder()).append("photo_type").append("=").append(3).toString();
        } else
        {
            s = (new StringBuilder()).append("photo_type").append("=").append(3).append(" AND ").append("belong_page").append("=").append(i).toString();
        }
        return b(new String[] {
            "photo_id", "user_id", "photo_type", "favour", "backcount", "belong_page", "is_myfavourite", "city_id", "city", "up_time_long", 
            "up_time_date", "desc", "addr", "latlng", "original_url", "original_path", "original_w_h", "watermark_url", "watermark_path", "watermark_w_h", 
            "compose_url", "compose_path", "compose_w_h"
        }, s, null);
    }

    static ArrayList a(ad ad1, int i)
    {
        return ad1.a(i);
    }

    static void a(ad ad1, ArrayList arraylist)
    {
        ad1.f(arraylist);
    }

    static void a(ad ad1, ArrayList arraylist, int i, String s, ArrayList arraylist1)
    {
        ad1.a(arraylist, i, s, arraylist1);
    }

    static void a(ad ad1, ArrayList arraylist, int i, String s, ArrayList arraylist1, ArrayList arraylist2)
    {
        ad1.a(arraylist, i, s, arraylist1, arraylist2);
    }

    static void a(ad ad1, ArrayList arraylist, ArrayList arraylist1)
    {
        ad1.a(arraylist, arraylist1);
    }

    static void a(ad ad1, ArrayList arraylist, HashMap hashmap)
    {
        ad1.a(arraylist, hashmap);
    }

    private void a(ArrayList arraylist, int i, String s, ArrayList arraylist1)
    {
        if (i != 1) goto _L2; else goto _L1
_L1:
        b.getContentResolver().delete(WeatherContentProvider.w, "photo_type=? and image_type=?", new String[] {
            String.valueOf(i), String.valueOf(2)
        });
_L4:
        if (arraylist1 != null && !arraylist1.isEmpty())
        {
            for (s = arraylist1.iterator(); s.hasNext(); arraylist.add(ContentProviderOperation.newInsert(WeatherContentProvider.w).withValues(arraylist1).build()))
            {
                arraylist1 = a((g)s.next());
            }

        }
        break; /* Loop/switch isn't completed */
_L2:
        if (i == 2 && !TextUtils.isEmpty(s))
        {
            b.getContentResolver().delete(WeatherContentProvider.w, "photo_type=? and city_id=? and image_type=?", new String[] {
                String.valueOf(i), s, String.valueOf(2)
            });
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(ArrayList arraylist, int i, String s, ArrayList arraylist1, ArrayList arraylist2)
    {
        if (arraylist1 != null && !arraylist1.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ContentValues contentvalues;
        Iterator iterator;
        s = null;
        if (arraylist2 == null || arraylist2.isEmpty())
        {
            continue; /* Loop/switch isn't completed */
        }
        contentvalues = new ContentValues();
        iterator = arraylist1.iterator();
_L3:
        int k;
        long l1;
        do
        {
            arraylist1 = s;
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            arraylist1 = (g)iterator.next();
            l1 = arraylist1.a();
        } while (l1 == 0L);
        Iterator iterator1 = arraylist2.iterator();
        g g1;
        do
        {
            if (!iterator1.hasNext())
            {
                break MISSING_BLOCK_LABEL_518;
            }
            g1 = (g)iterator1.next();
        } while (g1.a() != l1);
        contentvalues.clear();
        if (g1.h() != arraylist1.h())
        {
            arraylist1.a(g1.h());
            int l = arraylist1.c();
            if (arraylist1.h())
            {
                k = 1;
            } else
            {
                k = -1;
            }
            k += l;
            contentvalues.put("favour", Integer.valueOf(k));
            arraylist1.a(k);
        } else
        if (g1.c() != arraylist1.c())
        {
            contentvalues.put("favour", Integer.valueOf(arraylist1.c()));
            arraylist1.a(arraylist1.c());
        }
        if (g1.d() != arraylist1.d())
        {
            contentvalues.put("backcount", Integer.valueOf(arraylist1.d()));
            arraylist1.b(arraylist1.d());
        }
        if (g1.f() != arraylist1.f())
        {
            contentvalues.put("belong_page", Integer.valueOf(arraylist1.f()));
            arraylist1.d(arraylist1.f());
        }
        if (contentvalues.size() > 0)
        {
            arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.w).withValues(contentvalues).withSelection("photo_id=? and image_type=?", new String[] {
                String.valueOf(arraylist1.a()), String.valueOf(1)
            }).build());
            k = 1;
        } else
        {
            k = 1;
        }
_L5:
        if (k == 0)
        {
            if (s == null)
            {
                s = new ArrayList();
            }
            s.add(arraylist1);
        }
          goto _L3
        if (arraylist1 == null) goto _L1; else goto _L4
_L4:
        for (s = arraylist1.iterator(); s.hasNext(); arraylist.add(ContentProviderOperation.newInsert(WeatherContentProvider.w).withValues(arraylist2).build()))
        {
            arraylist2 = a((g)s.next());
        }

        com.gtp.a.a.b.c.a("photo", (new StringBuilder()).append("\u7C7B\u578B\u662F").append(i).append("\u7684\u65B0\u56FE\u7247\u6709").append(arraylist1.size()).append("\u5F20").toString());
        return;
        k = 0;
          goto _L5
    }

    private void a(ArrayList arraylist, ArrayList arraylist1)
    {
        if (arraylist1 != null && !arraylist1.isEmpty() && arraylist != null && !arraylist.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        arraylist = arraylist.iterator();
label0:
        do
        {
            if (!arraylist.hasNext())
            {
                continue;
            }
            g g1 = (g)arraylist.next();
            Iterator iterator = arraylist1.iterator();
            g g2;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                g2 = (g)iterator.next();
            } while (g2 == null || g1 == null || g2.a() != g1.a());
            if (g2.p().equals(g1.p()))
            {
                String s = g2.q();
                if (!TextUtils.isEmpty(s) && (new File(s)).exists())
                {
                    g1.i(s);
                    g1.b(true);
                }
            }
            if (g2.t().equals(g1.t()))
            {
                String s1 = g2.u();
                if (!TextUtils.isEmpty(s1) && (new File(s1)).exists())
                {
                    g1.k(s1);
                    g1.c(true);
                }
            }
            if (g2.x().equals(g1.x()))
            {
                String s2 = g2.y();
                if (!TextUtils.isEmpty(s2) && (new File(s2)).exists())
                {
                    g1.m(s2);
                    g1.d(true);
                }
            }
            if (g1.h() != g2.h())
            {
                g1.a(g2.h());
                int k = g1.c();
                int i;
                if (g1.h())
                {
                    i = 1;
                } else
                {
                    i = -1;
                }
                g1.a(i + k);
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void a(ArrayList arraylist, HashMap hashmap)
    {
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            g g1 = (g)arraylist.next();
            com.gtp.go.weather.sharephoto.b.j j1 = (com.gtp.go.weather.sharephoto.b.j)hashmap.get(Long.valueOf(g1.a()));
            if (j1 != null)
            {
                int i;
                if (g1.h())
                {
                    i = 1;
                } else
                {
                    i = -1;
                }
                if (i != j1.c())
                {
                    boolean flag;
                    if (j1.c() == 1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    g1.a(flag);
                    i = g1.c();
                    g1.a(j1.c() + i);
                }
            }
        } while (true);
    }

    static boolean a(ad ad1, ak ak1)
    {
        return ad1.a(ak1);
    }

    static boolean a(ad ad1, boolean flag)
    {
        ad1.c = flag;
        return flag;
    }

    private boolean a(ak ak1)
    {
        Object obj = com.gtp.go.weather.sharephoto.a.f.a(b);
        String s = com.gtp.go.weather.sharephoto.a.g.a(b).b().a();
        obj = ((JSONObject) (obj)).toString();
        s = com.gtp.go.weather.sharephoto.photo.ac.a(b, "http://gows.goforandroid.com/goweatherexSns/image/userImageIssued", ((String) (obj)), s, null, ak1.b);
        if (!TextUtils.isEmpty(s))
        {
            ArrayList arraylist = new ArrayList();
            ak1.a = a(ak1.b, s, 3, arraylist, null);
            if (!arraylist.isEmpty() && ak1.a != -1)
            {
                a(arraylist, a(new String[] {
                    "photo_id", "data_type", "data_value"
                }, "data_type=1", ((String []) (null))));
                e(arraylist);
                return true;
            } else
            {
                return false;
            }
        } else
        {
            return false;
        }
    }

    static Context b(ad ad1)
    {
        return ad1.b;
    }

    private void b()
    {
        b.getContentResolver().delete(WeatherContentProvider.w, "photo_type=? or photo_type=?", new String[] {
            String.valueOf(1), String.valueOf(2)
        });
    }

    static void b(ad ad1, ArrayList arraylist)
    {
        ad1.b(arraylist);
    }

    private void b(ArrayList arraylist)
    {
        if (arraylist != null && !arraylist.isEmpty())
        {
            arraylist = arraylist.iterator();
            while (arraylist.hasNext()) 
            {
                Object obj = (g)arraylist.next();
                if (!((g) (obj)).z())
                {
                    com.gtp.a.a.b.c.a("photo_download", "=================\u300B\u5F00\u59CB\u4E0B\u8F7D\u56FE\u7247");
                    obj = new a(((g) (obj)).x(), a, (new StringBuilder()).append(com.jiubang.core.c.a.b.a(((g) (obj)).x())).append(".png").toString());
                    e.a(((a) (obj)));
                }
            }
        }
    }

    static boolean b(ad ad1, boolean flag)
    {
        ad1.d = flag;
        return flag;
    }

    static int c(ad ad1, ArrayList arraylist)
    {
        return ad1.c(arraylist);
    }

    private int c(ArrayList arraylist)
    {
        if (!arraylist.isEmpty()) goto _L2; else goto _L1
_L1:
        int k = 1;
_L4:
        return k;
_L2:
        arraylist = arraylist.iterator();
        int i = 0x7fffffff;
        do
        {
            k = i;
            if (!arraylist.hasNext())
            {
                continue;
            }
            i = Math.min(i, ((g)arraylist.next()).f());
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private List c()
    {
        return com.gtp.go.weather.sharephoto.b.a.d.a(b);
    }

    static boolean c(ad ad1)
    {
        return ad1.c;
    }

    private HashSet d(ArrayList arraylist)
    {
        HashSet hashset = new HashSet();
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); hashset.add(Integer.valueOf(((g)arraylist.next()).f()))) { }
        return hashset;
    }

    static void d(ad ad1)
    {
        ad1.b();
    }

    private boolean d()
    {
        long l = GoWidgetApplication.c(b.getApplicationContext()).a().getLong("key_check_delete_overtime_photo", 0L);
        l = System.currentTimeMillis() - l;
        return l <= 0L || l >= 0x2932e00L;
    }

    private void e(ArrayList arraylist)
    {
        ArrayList arraylist1;
        arraylist1 = new ArrayList();
        Object obj;
        if (!arraylist.isEmpty())
        {
            obj = d(arraylist);
            Integer ainteger[] = (Integer[])((HashSet) (obj)).toArray(new Integer[2]);
            if (((HashSet) (obj)).size() == 1)
            {
                obj = ContentProviderOperation.newDelete(WeatherContentProvider.w).withSelection("photo_type=? AND belong_page=?", new String[] {
                    String.valueOf(3), String.valueOf(ainteger[0])
                });
            } else
            {
                obj = ContentProviderOperation.newDelete(WeatherContentProvider.w).withSelection("photo_type=?", new String[] {
                    String.valueOf(3)
                });
            }
        } else
        {
            obj = ContentProviderOperation.newDelete(WeatherContentProvider.w).withSelection("photo_type = ?", new String[] {
                String.valueOf(3)
            });
        }
        arraylist1.add(((android.content.ContentProviderOperation.Builder) (obj)).build());
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); arraylist1.add(ContentProviderOperation.newInsert(WeatherContentProvider.w).withValues(((ContentValues) (obj))).build()))
        {
            obj = a((g)arraylist.next());
        }

        b.getContentResolver().applyBatch("com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", arraylist1);
_L1:
        return;
        arraylist;
        if (com.gtp.a.a.b.c.a())
        {
            arraylist.printStackTrace();
            return;
        }
          goto _L1
    }

    static boolean e(ad ad1)
    {
        return ad1.d;
    }

    private void f(ArrayList arraylist)
    {
        File file;
        long l1;
        l1 = System.currentTimeMillis();
        file = new File((new StringBuilder()).append(h.a).append("compose").toString());
        if (file == null || !file.exists()) goto _L2; else goto _L1
_L1:
        File afile[];
        int i;
        int l;
        afile = file.listFiles();
        l = afile.length;
        i = 0;
_L4:
        if (i >= l) goto _L2; else goto _L3
_L3:
        File file1;
        int k;
        file1 = afile[i];
        if (file1 == null || !file1.exists() || l1 - file1.lastModified() <= 0xa4cb800L)
        {
            continue; /* Loop/switch isn't completed */
        }
        Iterator iterator = arraylist.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_755;
            }
        } while (!((g)iterator.next()).y().equals(file1.toString()));
        k = 1;
_L5:
        if (k == 0)
        {
            com.gtp.a.a.b.c.a("delete_photos", (new StringBuilder()).append("1\u3001\u5220\u9664\u7F29\u7565\u56FE\u7684\u540D\u5B57\u4E3A ").append(file1.getName()).toString());
            file1.delete();
        }
        i++;
          goto _L4
_L2:
        ArrayList arraylist1;
label0:
        {
            arraylist1 = b(new String[] {
                "original_path", "watermark_path"
            }, "photo_type=?", new String[] {
                String.valueOf(3)
            });
            File file2 = new File((new StringBuilder()).append(h.a).append("original").toString());
            if (file2 == null || !file2.exists())
            {
                break label0;
            }
            File afile1[] = file2.listFiles();
            int i1 = afile1.length;
            for (k = 0; k < i1; k++)
            {
                File file4;
                boolean flag;
label1:
                {
                    file4 = afile1[k];
                    if (file4 == null || !file4.exists() || l1 - file4.lastModified() <= 0xa4cb800L)
                    {
                        continue;
                    }
                    boolean flag2 = false;
                    Iterator iterator1 = arraylist.iterator();
                    do
                    {
                        flag = flag2;
                        if (!iterator1.hasNext())
                        {
                            break;
                        }
                        if (!((g)iterator1.next()).q().equals(file4.toString()))
                        {
                            continue;
                        }
                        flag = true;
                        break;
                    } while (true);
                    if (flag || arraylist1.isEmpty())
                    {
                        break label1;
                    }
                    iterator1 = arraylist1.iterator();
                    do
                    {
                        if (!iterator1.hasNext())
                        {
                            break label1;
                        }
                    } while (!((g)iterator1.next()).q().equals(file4.toString()));
                    flag = true;
                }
                if (!flag)
                {
                    com.gtp.a.a.b.c.a("delete_photos", (new StringBuilder()).append("2\u3001\u5220\u9664\u539F\u56FE\u7684\u540D\u5B57\u4E3A ").append(file4.getName()).toString());
                    file4.delete();
                }
            }

        }
label2:
        {
            File file3 = new File((new StringBuilder()).append(h.a).append("watermark").toString());
            if (file3 == null || !file3.exists())
            {
                break label2;
            }
            File afile2[] = file3.listFiles();
            int j1 = afile2.length;
            for (k = 0; k < j1; k++)
            {
                File file5;
                boolean flag1;
label3:
                {
                    file5 = afile2[k];
                    if (file5 == null || !file5.exists() || l1 - file5.lastModified() <= 0xa4cb800L)
                    {
                        continue;
                    }
                    boolean flag3 = false;
                    Iterator iterator2 = arraylist.iterator();
                    do
                    {
                        flag1 = flag3;
                        if (!iterator2.hasNext())
                        {
                            break;
                        }
                        if (!((g)iterator2.next()).u().equals(file5.toString()))
                        {
                            continue;
                        }
                        flag1 = true;
                        break;
                    } while (true);
                    if (flag1 || arraylist1.isEmpty())
                    {
                        break label3;
                    }
                    iterator2 = arraylist1.iterator();
                    do
                    {
                        if (!iterator2.hasNext())
                        {
                            break label3;
                        }
                    } while (!((g)iterator2.next()).u().equals(file5.toString()));
                    flag1 = true;
                }
                if (!flag1)
                {
                    com.gtp.a.a.b.c.a("delete_photos", (new StringBuilder()).append("3\u3001\u5220\u9664\u6C34\u5370\u56FE\u7684\u540D\u5B57\u4E3A ").append(file5.getName()).toString());
                    file5.delete();
                }
            }

        }
        GoWidgetApplication.c(b.getApplicationContext()).a().edit().putLong("key_check_delete_overtime_photo", l1).commit();
        return;
        k = 0;
          goto _L5
    }

    static boolean f(ad ad1)
    {
        return ad1.d();
    }

    static List g(ad ad1)
    {
        return ad1.c();
    }

    public HashMap a(String as[], String s, String as1[])
    {
        HashMap hashmap = new HashMap();
        as = b.getContentResolver().query(WeatherContentProvider.y, as, s, as1, null);
        if (as != null && as.moveToFirst())
        {
            int k = as.getColumnCount();
            do
            {
                s = new com.gtp.go.weather.sharephoto.b.j();
                int i = 0;
                while (i < k) 
                {
                    as1 = as.getColumnName(i);
                    if (as1.equals("photo_id"))
                    {
                        s.a(as.getLong(i));
                    } else
                    if (as1.equals("data_type"))
                    {
                        s.a(as.getInt(i));
                    } else
                    if (as1.equals("data_value"))
                    {
                        s.b(as.getInt(i));
                    } else
                    if (as1.equals("user_id"))
                    {
                        s.a(as.getString(i));
                    } else
                    if (as1.equals("city_id"))
                    {
                        s.b(as.getString(i));
                    }
                    i++;
                }
                hashmap.put(Long.valueOf(s.a()), s);
            } while (as.moveToNext());
            if (as != null)
            {
                try
                {
                    as.close();
                }
                // Misplaced declaration of an exception variable
                catch (String as[])
                {
                    as.printStackTrace();
                    return hashmap;
                }
            }
        }
        return hashmap;
    }

    public void a(int i, int k, String s, ArrayList arraylist)
    {
        (new ai(this, i, k, s)).execute(new ArrayList[] {
            arraylist
        });
    }

    public void a(int i, aj aj)
    {
label0:
        {
            if (aj != null)
            {
                am am1 = (am)g.get(i);
                if (am1 == null)
                {
                    break label0;
                }
                com.gtp.go.weather.sharephoto.photo.am.a(am1, aj);
            }
            return;
        }
        aj = new am(this, aj);
        g.put(i, aj);
        aj.execute(new Integer[] {
            Integer.valueOf(i)
        });
    }

    public void a(int i, String s)
    {
        a(false, i, s);
    }

    public void a(long l, com.gtp.go.weather.sharephoto.photo.a a1)
    {
        if (l != -1L)
        {
            (new ae(this, a1, l)).execute(new Long[] {
                Long.valueOf(l)
            });
            return;
        } else
        {
            a1.a(Long.valueOf(l), null);
            return;
        }
    }

    public void a(Activity activity, long l)
    {
        (new ag(this, activity.getContentResolver(), l)).execute(new Void[0]);
    }

    public void a(ah ah)
    {
        f = ah;
    }

    public void a(b b1)
    {
        e = b1;
    }

    protected void a(ArrayList arraylist)
    {
        File file = new File((new StringBuilder()).append(com.gtp.a.a.c.c.a()).append(File.separator).append("sharephoto").toString());
        if (file.exists())
        {
            String as[] = file.list();
            if (as != null)
            {
                int k = as.length;
                for (int i = 0; i < k; i++)
                {
                    Object obj = as[i];
                    g g1 = a(((String) (obj)), arraylist);
                    if (g1 == null)
                    {
                        continue;
                    }
                    obj = new File(file, ((String) (obj)));
                    h.a(h.a(g1.a()), g1.y());
                    h.a(h.b(g1.a()), g1.q());
                    String s = g1.u();
                    if (!TextUtils.isEmpty(s))
                    {
                        h.a(h.c(g1.a()), s);
                    }
                    r.a(((File) (obj)));
                }

            }
        }
    }

    public void a(boolean flag, int i, String s)
    {
        (new al(this, flag, i, s)).execute(new Object[0]);
    }

    public ArrayList b(String as[], String s, String as1[])
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        as = b.getContentResolver().query(WeatherContentProvider.w, as, s, as1, null);
        if (as == null) goto _L2; else goto _L1
_L1:
        if (!as.moveToFirst()) goto _L4; else goto _L3
_L3:
        int k = as.getColumnCount();
_L5:
        boolean flag;
        s = new g();
        int i = 0;
        while (i < k) 
        {
            as1 = as.getColumnName(i);
            if (as1.equals("photo_id"))
            {
                s.a(as.getLong(i));
            } else
            if (as1.equals("user_id"))
            {
                s.a(as.getString(i));
            } else
            if (as1.equals("photo_type"))
            {
                s.c(as.getInt(i));
            } else
            if (as1.equals("belong_page"))
            {
                s.d(as.getInt(i));
            } else
            if (as1.equals("image_type"))
            {
                s.e(as.getInt(i));
            } else
            if (as1.equals("favour"))
            {
                s.a(as.getInt(i));
            } else
            if (as1.equals("backcount"))
            {
                s.b(as.getInt(i));
            } else
            if (as1.equals("is_myfavourite"))
            {
                boolean flag1;
                if (as.getInt(i) == 1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                s.a(flag1);
            } else
            if (as1.equals("city_id"))
            {
                s.b(as.getString(i));
            } else
            if (as1.equals("city"))
            {
                s.d(as.getString(i));
            } else
            if (as1.equals("up_time_long"))
            {
                s.b(as.getLong(i));
            } else
            if (as1.equals("up_time_date"))
            {
                s.c(as.getString(i));
            } else
            if (as1.equals("desc"))
            {
                s.e(as.getString(i));
            } else
            if (as1.equals("addr"))
            {
                s.g(as.getString(i));
            } else
            if (as1.equals("latlng"))
            {
                s.f(as.getString(i));
            } else
            if (as1.equals("original_url"))
            {
                s.h(as.getString(i));
            } else
            if (as1.equals("original_path"))
            {
                s.i(as.getString(i));
            } else
            if (as1.equals("original_w_h"))
            {
                as1 = as.getString(i);
                if (!TextUtils.isEmpty(as1) && as1.contains("*"))
                {
                    as1 = as1.split("\\*");
                    try
                    {
                        s.f(Integer.valueOf(as1[0]).intValue());
                        s.g(Integer.valueOf(as1[1]).intValue());
                    }
                    // Misplaced declaration of an exception variable
                    catch (String as1[]) { }
                }
            } else
            if (as1.equals("watermark_url"))
            {
                s.j(as.getString(i));
            } else
            if (as1.equals("watermark_path"))
            {
                s.k(as.getString(i));
            } else
            if (as1.equals("watermark_w_h"))
            {
                as1 = as.getString(i);
                if (!TextUtils.isEmpty(as1) && as1.contains("*"))
                {
                    as1 = as1.split("[*]");
                    try
                    {
                        s.h(Integer.valueOf(as1[0]).intValue());
                        s.i(Integer.valueOf(as1[1]).intValue());
                    }
                    // Misplaced declaration of an exception variable
                    catch (String as1[]) { }
                }
            } else
            if (as1.equals("compose_url"))
            {
                s.l(as.getString(i));
            } else
            if (as1.equals("compose_path"))
            {
                s.m(as.getString(i));
            } else
            if (as1.equals("compose_w_h"))
            {
                as1 = as.getString(i);
                if (!TextUtils.isEmpty(as1) && as1.contains("*"))
                {
                    as1 = as1.split("\\*");
                    try
                    {
                        s.j(Integer.valueOf(as1[0]).intValue());
                        s.k(Integer.valueOf(as1[1]).intValue());
                    }
                    // Misplaced declaration of an exception variable
                    catch (String as1[]) { }
                }
            }
            i++;
        }
        as1 = arraylist.iterator();
        g g1;
        do
        {
            if (!as1.hasNext())
            {
                break MISSING_BLOCK_LABEL_1046;
            }
            g1 = (g)as1.next();
        } while (g1.a() != s.a() || g1.e() != s.e());
        flag = true;
_L6:
        if (!flag)
        {
            if (!TextUtils.isEmpty(s.q()) && (new File(s.q())).exists())
            {
                s.b(true);
            }
            if (!TextUtils.isEmpty(s.u()) && (new File(s.u())).exists())
            {
                s.c(true);
            }
            if (!TextUtils.isEmpty(s.y()) && (new File(s.y())).exists())
            {
                s.d(true);
            }
            arraylist.add(s);
        } else
        {
            com.gtp.a.a.b.c.a("photo", "\u7591\u4F3C\u51FA\u73B0\u56FE\u7247\u91CD\u590D\u6570\u636E\uFF01");
        }
        if (as.moveToNext()) goto _L5; else goto _L4
_L4:
        try
        {
            as.close();
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            as.printStackTrace();
            return arraylist;
        }
_L2:
        return arraylist;
        flag = false;
          goto _L6
    }

    public void b(long l, com.gtp.go.weather.sharephoto.photo.a a1)
    {
        (new af(this, l, a1)).execute(new Void[0]);
    }

    static 
    {
        a = (new StringBuilder()).append(h.a).append("compose").toString();
    }
}
