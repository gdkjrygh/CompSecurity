// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.b.a;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.commerce.ad.b.a:
//            k, f

public class b
    implements Serializable
{

    private int A;
    private String B;
    private int C;
    private List D;
    private int E;
    private String F;
    private String G;
    private int H;
    private String I;
    private int J;
    private String K;
    private String L;
    private String M;
    private String N;
    private int O;
    private int P;
    private String Q;
    private String R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private String X;
    private int Y;
    private boolean Z;
    private int a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private boolean h;
    private String i;
    private String j;
    private List k;
    private String l;
    private String m;
    private String n;
    private String o;
    private int p;
    private String q;
    private String r;
    private int s;
    private String t;
    private String u;
    private int v;
    private String w;
    private String x;
    private String y;
    private int z;

    public b()
    {
        Z = false;
    }

    public static b a(Context context, JSONObject jsonobject, int i1, int j1, int k1, int l1, boolean flag)
    {
        boolean flag1 = true;
        if (jsonobject == null)
        {
            return null;
        }
        context = new b();
        context.a = jsonobject.optInt("mapid", 0);
        context.b = jsonobject.optString("serialNum", "");
        context.c = jsonobject.optString("pkgname", "");
        context.d = jsonobject.optString("name", "");
        context.e = jsonobject.optString("banner", "");
        context.f = jsonobject.optString("bannertitle", "");
        context.g = jsonobject.optString("bannerdescribe", "");
        JSONArray jsonarray;
        Exception exception;
        ArrayList arraylist;
        int i2;
        if (jsonobject.optInt("ish5adv", 0) != 1)
        {
            flag1 = false;
        }
        context.h = flag1;
        context.i = jsonobject.optString("icon", "");
        context.j = jsonobject.optString("preview", "");
        if (!jsonobject.has("images"))
        {
            break MISSING_BLOCK_LABEL_225;
        }
        jsonarray = jsonobject.getJSONArray("images");
        if (jsonarray == null)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        if (jsonarray.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        arraylist = new ArrayList();
        i2 = 0;
_L2:
        if (i2 >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(jsonarray.optString(i2, ""));
        i2++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            context.k = arraylist;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        context.l = jsonobject.optString("versionName", "");
        context.m = jsonobject.optString("versionNumber", "");
        context.n = jsonobject.optString("score", "");
        context.o = jsonobject.optString("developer", "");
        context.p = jsonobject.optInt("paytype", 0);
        context.q = jsonobject.optString("price", "");
        context.r = jsonobject.optString("size", "");
        context.s = jsonobject.optInt("downloadCount", 0);
        context.t = jsonobject.optString("downloadCount_s", "");
        context.u = jsonobject.optString("detail", "");
        context.v = jsonobject.optInt("adpreload", 0);
        context.w = jsonobject.optString("updateLog", "");
        context.x = jsonobject.optString("support", "");
        context.y = jsonobject.optString("updateTime", "");
        context.z = jsonobject.optInt("otype", 0);
        context.A = jsonobject.optInt("downtype", 0);
        context.B = jsonobject.optString("downurl", "");
        context.C = jsonobject.optInt("showtype", 0);
        context.D = com.jiubang.commerce.ad.b.a.k.a(jsonobject.optJSONArray("tags"));
        context.E = jsonobject.optInt("isremd", 0);
        context.F = jsonobject.optString("remdmsg", "");
        context.G = jsonobject.optString("pricerange", "");
        context.H = jsonobject.optInt("isad", 0);
        context.I = jsonobject.optString("adurl", "");
        context.J = jsonobject.optInt("adsrc", 0);
        context.K = jsonobject.optString("showcallurl", "");
        context.L = jsonobject.optString("clickcallurl", "");
        context.M = jsonobject.optString("installcallurl", "");
        context.N = jsonobject.optString("category", "");
        context.O = jsonobject.optInt("adtype", 0);
        context.P = jsonobject.optInt("ua", 0);
        context.Q = jsonobject.optString("cparams", "");
        context.R = jsonobject.optString("imgfull", "");
        context.S = jsonobject.optInt("dsize", 0);
        context.T = jsonobject.optInt("frequency", 0);
        context.U = i1;
        context.V = j1;
        context.W = k1;
        context.X = com.jiubang.commerce.ad.b.a.f.b(((b) (context)).U);
        context.Y = l1;
        context.Z = flag;
        return context;
    }

    public String A()
    {
        return M;
    }

    public int B()
    {
        return P;
    }

    public String C()
    {
        return N;
    }

    public int D()
    {
        return O;
    }

    public int E()
    {
        return U;
    }

    public int F()
    {
        return V;
    }

    public int G()
    {
        return W;
    }

    public String H()
    {
        return X;
    }

    public int I()
    {
        return Y;
    }

    public String J()
    {
        return Q;
    }

    public String K()
    {
        return R;
    }

    public boolean L()
    {
        return Z;
    }

    public int M()
    {
        return S;
    }

    public int N()
    {
        return T;
    }

    public int a()
    {
        return a;
    }

    public String b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public String d()
    {
        return e;
    }

    public String e()
    {
        return f;
    }

    public String f()
    {
        return g;
    }

    public boolean g()
    {
        return h;
    }

    public String h()
    {
        return i;
    }

    public String i()
    {
        return j;
    }

    public String j()
    {
        return l;
    }

    public String k()
    {
        return m;
    }

    public String l()
    {
        return n;
    }

    public String m()
    {
        return o;
    }

    public String n()
    {
        return q;
    }

    public String o()
    {
        return r;
    }

    public String p()
    {
        return t;
    }

    public String q()
    {
        return u;
    }

    public int r()
    {
        return v;
    }

    public int s()
    {
        return A;
    }

    public String t()
    {
        return B;
    }

    public String u()
    {
        return F;
    }

    public int v()
    {
        return H;
    }

    public String w()
    {
        return I;
    }

    public int x()
    {
        return J;
    }

    public String y()
    {
        return K;
    }

    public String z()
    {
        return L;
    }
}
