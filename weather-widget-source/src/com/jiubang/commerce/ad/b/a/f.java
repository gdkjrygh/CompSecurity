// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.b.a;

import android.content.Context;
import android.text.TextUtils;
import com.jiubang.commerce.utils.b;
import com.jiubang.commerce.utils.e;
import com.jiubang.commerce.utils.j;
import com.jiubang.commerce.utils.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.commerce.ad.b.a:
//            b, g, a, c, 
//            j

public class f
    implements Serializable
{

    private int A;
    private int B;
    private int C;
    private int D;
    private String E[];
    private int F;
    private String G;
    private int H;
    private int I;
    private long J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private List Q;
    private List R;
    private long S;
    private String T;
    private List U;
    private com.jiubang.commerce.ad.b.a.j V;
    private int W;
    private int a;
    private int b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private a x;
    private int y;
    private int z;

    public f()
    {
    }

    public static com.jiubang.commerce.ad.a.b a(Context context, int i1, int j1, boolean flag, f f1, JSONObject jsonobject)
    {
        Object obj5 = a(context, i1, jsonobject);
        Object obj3;
        if (obj5 != null)
        {
            Object obj2 = ((f) (obj5)).s();
            Object obj1;
            Object obj4;
            List list;
            Object obj6;
            Iterator iterator;
            com.jiubang.commerce.ad.b.a.b b1;
            int k1;
            boolean flag1;
            if (obj2 == null || ((List) (obj2)).isEmpty())
            {
                Object obj = obj2;
                if (obj2 == null)
                {
                    obj = new ArrayList();
                }
                ((List) (obj)).add(obj5);
                obj3 = obj;
            } else
            {
                obj3 = obj2;
            }
        } else
        {
            obj3 = null;
        }
        if (obj3 == null || ((List) (obj3)).isEmpty())
        {
            return null;
        }
        obj4 = null;
        flag1 = true;
        obj6 = ((List) (obj3)).iterator();
        obj2 = null;
        do
        {
label0:
            {
                do
                {
                    if (!((Iterator) (obj6)).hasNext())
                    {
                        break label0;
                    }
                    obj1 = (f)((Iterator) (obj6)).next();
                } while (f1 != null && f1.u() && f1.b() != ((f) (obj1)).b());
                if (obj1 != null)
                {
                    list = ((f) (obj1)).v();
                } else
                {
                    list = null;
                }
                if (list != null)
                {
                    if (list.isEmpty())
                    {
                        obj2 = obj1;
                    } else
                    {
label1:
                        {
                            if (((f) (obj1)).u() || f1 == null || f1.b() != ((f) (obj1)).b())
                            {
                                break label1;
                            }
                            obj2 = (f)((List) (obj3)).get(((List) (obj3)).size() - 1);
                            if (obj2 == null || !((f) (obj2)).u())
                            {
                                break label1;
                            }
                            obj2 = obj1;
                        }
                    }
                } else
                {
                    obj2 = obj1;
                }
            }
        } while (true);
        obj6 = ((f) (obj5)).r();
        if (j.a)
        {
            com.jiubang.commerce.utils.j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i1).append("]getOfflineAdInfoList(hasShowAdUrls::->").append(((String) (obj6))).append(")").toString());
        }
        obj5 = new ArrayList();
        iterator = list.iterator();
        obj2 = obj4;
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        b1 = (com.jiubang.commerce.ad.b.a.b)iterator.next();
        if (b1 == null) goto _L4; else goto _L3
_L3:
        obj4 = obj2;
        if (obj2 == null)
        {
            obj4 = new ArrayList();
        }
        if (!flag || TextUtils.isEmpty(((CharSequence) (obj6)))) goto _L6; else goto _L5
_L5:
        obj2 = obj4;
        if (((String) (obj6)).indexOf((new StringBuilder()).append("||").append(b1.w()).append("||").toString()) >= 0) goto _L4; else goto _L6
_L6:
label2:
        {
            if (!com.jiubang.commerce.utils.b.a(context, b1.b()))
            {
                break label2;
            }
            ((List) (obj5)).add(b1.b());
            obj2 = obj4;
        }
          goto _L4
        if (j1 <= 0 || ((List) (obj4)).size() < j1) goto _L8; else goto _L7
_L7:
        flag = false;
        obj2 = obj4;
_L15:
        if (((List) (obj3)).size() != 1) goto _L10; else goto _L9
_L9:
        flag1 = flag;
        if (!j.a) goto _L12; else goto _L11
_L11:
        jsonobject = (new StringBuilder()).append("[vmId:").append(i1).append("]getOfflineAdInfoList(offlineAd, requtstAdData:").append(flag).append(", virtualModuleId:").append(i1).append(", adCount:").append(j1).append(", availableCount:").append(0).append(", returnAdCount:");
        if (obj2 != null)
        {
            k1 = ((List) (obj2)).size();
        } else
        {
            k1 = -1;
        }
        com.jiubang.commerce.utils.j.b("Ad_SDK", jsonobject.append(k1).append(")").toString());
        jsonobject = ((JSONObject) (obj1));
        obj1 = obj2;
_L14:
        if (jsonobject != null)
        {
            obj2 = new com.jiubang.commerce.ad.a.b();
            if (f1 != null)
            {
                f1 = f1.w();
            } else
            {
                f1 = null;
            }
            jsonobject.a(((com.jiubang.commerce.ad.b.a.j) (f1)));
            ((com.jiubang.commerce.ad.a.b) (obj2)).a(context, jsonobject, ((List) (obj1)));
            ((com.jiubang.commerce.ad.a.b) (obj2)).a(flag);
            if (obj1 != null && ((List) (obj1)).size() > 0 && j.a)
            {
                context = ((List) (obj1)).iterator();
                do
                {
                    if (!context.hasNext())
                    {
                        break;
                    }
                    f1 = (com.jiubang.commerce.ad.b.a.b)context.next();
                    if (f1 != null)
                    {
                        com.jiubang.commerce.utils.j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i1).append("]return offline ad info::>(count:").append(((List) (obj1)).size()).append("--").append(j1).append(", VirtualModuleId:").append(f1.E()).append(", ModuleId:").append(f1.F()).append(", MapId:").append(f1.a()).append(", packageName:").append(f1.b()).append(", Name:").append(f1.c()).append(", availableCount:").append(0).append(", mAdvDataSourceType:").append(jsonobject.f()).append(")").toString());
                    }
                } while (true);
            }
            return ((com.jiubang.commerce.ad.a.b) (obj2));
        } else
        {
            return null;
        }
_L8:
        ((List) (obj4)).add(b1);
        obj2 = obj4;
          goto _L4
_L10:
        if (obj2 != null && ((List) (obj2)).size() < j1)
        {
            try
            {
                jsonobject.put("hasShowAdUrlList", "");
                a(i1, jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                jsonobject.printStackTrace();
            }
            jsonobject = list.iterator();
label3:
            do
            {
                do
                {
                    if (!jsonobject.hasNext())
                    {
                        break label3;
                    }
                    obj3 = (com.jiubang.commerce.ad.b.a.b)jsonobject.next();
                } while (obj3 == null || ((List) (obj2)).contains(obj3) || ((List) (obj5)).contains(((com.jiubang.commerce.ad.b.a.b) (obj3)).b()) || com.jiubang.commerce.utils.b.a(context, ((com.jiubang.commerce.ad.b.a.b) (obj3)).b()));
                ((List) (obj2)).add(obj3);
            } while (j1 <= 0 || ((List) (obj2)).size() < j1);
        }
        flag1 = false;
        if (!j.a) goto _L12; else goto _L13
_L13:
        com.jiubang.commerce.utils.j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i1).append("]getOfflineAdInfoList(onlineAd, requtstAdData:").append(false).append(", virtualModuleId:").append(i1).append(", adCount:").append(j1).append(", availableCount:").append(0).append(", returnAdCount:").append(((List) (obj2)).size()).append(")").toString());
        flag = false;
        jsonobject = ((JSONObject) (obj1));
        obj1 = obj2;
          goto _L14
_L12:
        flag = flag1;
        jsonobject = ((JSONObject) (obj1));
        obj1 = obj2;
          goto _L14
_L2:
        flag = true;
          goto _L15
        obj1 = null;
        jsonobject = ((JSONObject) (obj2));
        flag = flag1;
          goto _L14
    }

    public static f a(Context context, int i1, JSONObject jsonobject)
    {
        Object obj2;
        ArrayList arraylist;
        arraylist = null;
        obj2 = null;
        if (jsonobject != null && jsonobject.length() > 0) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if (!jsonobject.has(String.valueOf(i1))) goto _L4; else goto _L3
_L3:
        Object obj = jsonobject.getJSONObject(String.valueOf(i1));
_L11:
        f f1;
        JSONObject jsonobject1 = ((JSONObject) (obj));
        if (obj == null)
        {
            jsonobject1 = jsonobject;
        }
        f1 = b(context, i1, jsonobject1);
        if (f1 == null) goto _L1; else goto _L5
_L5:
        Object obj1;
        obj1 = f1.p();
        obj = arraylist;
        if (obj1 == null) goto _L7; else goto _L6
_L6:
        obj = arraylist;
        if (((List) (obj1)).isEmpty()) goto _L7; else goto _L8
_L8:
        Iterator iterator;
        arraylist = new ArrayList();
        iterator = ((List) (obj1)).iterator();
        obj = obj2;
_L10:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (g)iterator.next();
        if (obj1 == null || !jsonobject.has(String.valueOf(((g) (obj1)).a())))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = b(context, i1, jsonobject.getJSONObject(String.valueOf(((g) (obj1)).a())));
        obj = obj1;
        obj1 = obj;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        arraylist.add(obj);
        obj1 = obj;
_L12:
        obj = obj1;
        if (true) goto _L10; else goto _L9
        obj;
        ((Exception) (obj)).printStackTrace();
_L4:
        obj = null;
          goto _L11
        obj1;
_L13:
        Exception exception;
        exception.printStackTrace();
        exception = ((Exception) (obj));
          goto _L12
_L9:
        f1.U = arraylist;
_L7:
        if (jsonobject.has("saveDataTime"))
        {
            f1.S = jsonobject.optLong("saveDataTime", 0L);
        }
        if (jsonobject.has("hasShowAdUrlList"))
        {
            f1.T = jsonobject.optString("hasShowAdUrlList", "");
        }
        if (obj != null && j.a)
        {
            com.jiubang.commerce.utils.j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i1).append("]BaseModuleDataItemBean.parseMainModuleJsonObject(moduleId:").append(((f) (obj)).a).append("[").append(i1).append("], AdvPositionId:").append(((f) (obj)).b).append(", OnlineAdvPositionId:").append(((f) (obj)).u).append(", AdvDataSource:").append(((f) (obj)).w).append(", FbAdvCount:").append(((f) (obj)).z).append(", AdvDataSourceType:").append(((f) (obj)).A).append(", SaveDataTime:").append(((f) (obj)).S).append(", \u662F\u5426\u4E3ASDK\u5E7F\u544A:").append(((f) (obj)).t()).append(", \u662F\u5426\u4E3A\u79BB\u7EBF\u5E7F\u544A:").append(((f) (obj)).u()).append(")").toString());
        }
        return f1;
        exception;
          goto _L13
    }

    public static boolean a(int i1, JSONObject jsonobject)
    {
        if (jsonobject == null || jsonobject.length() < 1)
        {
            return false;
        }
        boolean flag;
        if (!jsonobject.has("saveDataTime"))
        {
            try
            {
                jsonobject.put("saveDataTime", System.currentTimeMillis());
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        try
        {
            flag = com.jiubang.commerce.utils.e.a(b(i1), com.jiubang.commerce.utils.p.d(jsonobject), true);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
            return false;
        }
        return flag;
    }

    public static boolean a(long l1)
    {
        return l1 <= 0L || l1 > System.currentTimeMillis() - 0xdbba00L;
    }

    public static boolean a(f f1)
    {
        return f1 != null && 1 == f1.n();
    }

    public static f b(Context context, int i1, JSONObject jsonobject)
    {
        String as[] = null;
        if (jsonobject == null || jsonobject.length() <= 0)
        {
            return null;
        }
        f f1 = new f();
        f1.a = jsonobject.optInt("moduleId", 0);
        f1.b = jsonobject.optInt("advpositionid", 0);
        f1.c = jsonobject.optString("moduleName", "");
        f1.d = jsonobject.optString("moduleDesc", "");
        f1.e = jsonobject.optString("moduleSubtitle", "");
        f1.f = jsonobject.optString("backImage", "");
        f1.g = jsonobject.optString("banner", "");
        f1.h = jsonobject.optString("preview", "");
        f1.i = jsonobject.optString("icon", "");
        f1.j = jsonobject.optString("url", "");
        f1.k = jsonobject.optInt("showrandom", 0);
        f1.l = jsonobject.optInt("gorandom", 0);
        f1.m = jsonobject.optInt("acttype", 0);
        f1.n = jsonobject.optInt("sequence", 0);
        f1.o = jsonobject.optInt("preloadswitch", 0);
        f1.p = jsonobject.optInt("preloadswitchtype", 0);
        f1.q = jsonobject.optInt("adfrequency", 0);
        f1.r = jsonobject.optInt("adfirst", 0);
        f1.s = jsonobject.optInt("adsplit", 0);
        f1.t = jsonobject.optInt("adcolsetype", 0);
        f1.u = jsonobject.optInt("onlineadvpositionid", 0);
        f1.v = jsonobject.optInt("effect", 0);
        f1.w = jsonobject.optInt("advdatasource", 0);
        f1.x = com.jiubang.commerce.ad.b.a.a.a(jsonobject.optJSONObject("advdatasourceextinfo"));
        f1.y = jsonobject.optInt("advscene", 0);
        f1.z = jsonobject.optInt("fbadvcount", 0);
        f1.A = jsonobject.optInt("advdatasourcetype", 0);
        String s1 = jsonobject.optString("fbid", "");
        if (!TextUtils.isEmpty(s1))
        {
            as = s1.split("#");
        }
        f1.E = as;
        f1.F = jsonobject.optInt("fbadvpos", 0);
        f1.G = jsonobject.optString("fbtabid", "");
        f1.H = jsonobject.optInt("fbnumperline", 0);
        f1.I = jsonobject.optInt("hasanimation", 0);
        f1.B = jsonobject.optInt("fbadvabplan", 0);
        f1.C = jsonobject.optInt("admobbanner", 0);
        f1.D = jsonobject.optInt("onlineadvtype", 3);
        f1.J = jsonobject.optInt("dataVersion", 0);
        f1.K = jsonobject.optInt("dataType", 1);
        f1.L = jsonobject.optInt("layout", 0);
        f1.M = jsonobject.optInt("pages", 0);
        f1.N = jsonobject.optInt("pageid", 0);
        f1.O = jsonobject.optInt("statisticstype", 0);
        f1.P = jsonobject.optInt("clearflag", 0);
        if (f1.K == 1 && jsonobject.has("childmodules"))
        {
            f1.Q = com.jiubang.commerce.ad.b.a.g.a(context, jsonobject.optJSONArray("childmodules"), i1);
        }
        if (jsonobject.has("contents"))
        {
            f1.R = com.jiubang.commerce.ad.b.a.c.a(context, jsonobject.optJSONArray("contents"), i1, f1.a, f1.b, f1.w);
        }
        f1.a(i1);
        if (j.a)
        {
            com.jiubang.commerce.utils.j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i1).append("] \u5E7F\u544A\u6A21\u5757\u63A7\u5236\u4FE1\u606F::->(child, moduleId:").append(f1.a).append("[").append(i1).append("], AdvPositionId:").append(f1.b).append(", OnlineAdvPositionId:").append(f1.u).append(", AdvDataSource:").append(f1.w).append(", FbAdvCount:").append(f1.z).append(", AdvDataSourceType:").append(f1.A).append(", \u662F\u5426\u4E3ASDK\u5E7F\u544A:").append(f1.t()).append(", \u662F\u5426\u4E3A\u79BB\u7EBF\u5E7F\u544A:").append(f1.u()).append(")").toString());
        }
        return f1;
    }

    public static String b(int i1)
    {
        return com.jiubang.commerce.utils.p.d(Integer.valueOf(i1));
    }

    public static boolean b(f f1)
    {
        return f1 != null && 2 == f1.n();
    }

    public static boolean c(f f1)
    {
        return f1 != null && 3 == f1.n();
    }

    public int a()
    {
        return W;
    }

    public void a(int i1)
    {
        W = i1;
    }

    public void a(com.jiubang.commerce.ad.b.a.j j1)
    {
        V = j1;
    }

    public int b()
    {
        return a;
    }

    public int c()
    {
        return b;
    }

    public int d()
    {
        return w;
    }

    public a e()
    {
        return x;
    }

    public int f()
    {
        return A;
    }

    public int g()
    {
        return z;
    }

    public String[] h()
    {
        return E;
    }

    public int i()
    {
        return q;
    }

    public int j()
    {
        return r;
    }

    public int k()
    {
        return s;
    }

    public int l()
    {
        return t;
    }

    public int m()
    {
        return u;
    }

    public int n()
    {
        return D;
    }

    public int o()
    {
        return P;
    }

    public List p()
    {
        return Q;
    }

    public long q()
    {
        return S;
    }

    public String r()
    {
        return T;
    }

    public List s()
    {
        return U;
    }

    public boolean t()
    {
        return "1".equals(String.valueOf(f())) && m() <= 0;
    }

    public boolean u()
    {
        return "0".equals(String.valueOf(A));
    }

    public List v()
    {
        if (R == null || R.isEmpty())
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        Iterator iterator = R.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c c1 = (c)iterator.next();
            if (c1 != null && c1.a() != null)
            {
                arraylist.add(c1.a());
            }
        } while (true);
        return arraylist;
    }

    public com.jiubang.commerce.ad.b.a.j w()
    {
        return V;
    }

    public String x()
    {
        com.jiubang.commerce.ad.b.a.j j1;
label0:
        {
            j1 = w();
            String s1 = "-1";
            if (j1 != null)
            {
                if (!j1.c())
                {
                    break label0;
                }
                s1 = j1.b();
            }
            return s1;
        }
        return j1.a();
    }
}
