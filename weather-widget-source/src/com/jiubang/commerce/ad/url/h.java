// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.url;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.jiubang.commerce.ad.a.a;
import com.jiubang.commerce.ad.b.a.l;
import com.jiubang.commerce.utils.j;
import com.jiubang.commerce.utils.k;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.ad.url:
//            i, j, n, d

public class h extends AsyncTask
{

    private com.jiubang.commerce.ad.url.j a;
    private Context b;
    private String c;
    private List d;
    private boolean e;
    private i f;

    public h(Context context, String s, List list, boolean flag, i i1)
    {
        b(context, s, list, flag, i1);
    }

    private void a()
    {
        if (f != null)
        {
            f = null;
        }
        if (d != null)
        {
            d.clear();
            d = null;
        }
        if (a != null)
        {
            a = null;
        }
    }

    public static boolean a(Context context, String s, List list, boolean flag, i i1)
    {
        if (k.a(context))
        {
            (new h(context, s, list, flag, i1)).execute(new Integer[] {
                Integer.valueOf(0)
            });
            return true;
        }
        j.d("Ad_SDK", "startExecuteTaskNew(preloadUrl, no network)");
        if (i1 != null)
        {
            i1.a(context);
        }
        if (list != null && list.size() > 0)
        {
            i1 = com.jiubang.commerce.ad.url.j.a(context);
            for (int j1 = 0; j1 < list.size(); j1++)
            {
                a a1 = (a)list.get(j1);
                if (a1 != null && !TextUtils.isEmpty(a1.q()) && TextUtils.isEmpty(i1.b(a1.q())))
                {
                    (new n(1, 2, a1.q(), "network is not ok", 0L)).a(context, s, String.valueOf(a1.e()), String.valueOf(a1.d()));
                }
            }

        }
        return false;
    }

    private void b(Context context, String s, List list, boolean flag, i i1)
    {
        b = context;
        c = s;
        d = list;
        e = flag;
        f = i1;
        a = com.jiubang.commerce.ad.url.j.a(b);
    }

    protected transient List a(Integer ainteger[])
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        ainteger = null;
_L10:
        if (a == null || d == null || d.size() <= 0) goto _L2; else goto _L1
_L1:
        Object obj = ainteger;
        a a1 = (a)d.remove(0);
        obj = ainteger;
        if (!e) goto _L4; else goto _L3
_L3:
        obj = ainteger;
        boolean flag = TextUtils.isEmpty(a.b(a1.q()));
_L17:
        if (a1 == null) goto _L6; else goto _L5
_L5:
        obj = ainteger;
        if (TextUtils.isEmpty(a1.q()) || !flag) goto _L6; else goto _L7
_L7:
        obj = ainteger;
        if (a.d(a1.q())) goto _L6; else goto _L8
_L8:
        obj = ainteger;
        a.a(a1.q());
        obj = ainteger;
        Object obj2 = new l();
        obj = ainteger;
        ((l) (obj2)).a(a1.a());
        obj = ainteger;
        ainteger = com.jiubang.commerce.ad.url.d.a(b, ((l) (obj2)), c, String.valueOf(a1.e()), String.valueOf(a1.d()), com.jiubang.commerce.ad.url.d.a(a1.q()));
        obj = ainteger;
        if (!e)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        obj = ainteger;
        a.a(a1.f(), a1.q(), ainteger);
        obj = ainteger;
        arraylist.add(ainteger);
        flag = true;
_L16:
        if (!j.a) goto _L10; else goto _L9
_L9:
        obj2 = (new StringBuilder()).append("AdUrlPreParseTask.doInBackground(\u5269\u4F59\u8981\u89E3\u6790\u6570\u91CF\uFF1A").append(d.size()).append(", \u89E3\u6790\u5E7F\u544A\u540D\uFF1A");
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_459;
        }
        obj = a1.g();
_L18:
        obj2 = ((StringBuilder) (obj2)).append(((String) (obj))).append(", \u662F\u5426\u521A\u8FDB\u884C\u9884\u52A0\u8F7D:").append(flag).append(", \u89E3\u6790\u524D\u5730\u5740\uFF1A");
        if (a1 == null) goto _L12; else goto _L11
_L11:
        obj = a1.q();
_L13:
        obj2 = ((StringBuilder) (obj2)).append(((String) (obj))).append(",\u89E3\u6790\u540E\u5730\u5740\uFF1A");
        if (!TextUtils.isEmpty(ainteger) || a1 == null)
        {
            break MISSING_BLOCK_LABEL_372;
        }
        obj = a.b(a1.q());
_L14:
        j.c("Ad_SDK", ((StringBuilder) (obj2)).append(((String) (obj))).append(")").toString());
          goto _L10
_L12:
        obj = "";
          goto _L13
        obj = ainteger;
          goto _L14
        ainteger;
        Object obj1 = obj;
        obj = ainteger;
        ainteger = ((Integer []) (obj1));
_L15:
        ((Exception) (obj)).printStackTrace();
        StringBuilder stringbuilder = (new StringBuilder()).append("AdUrlPreParseTask.doInBackground(fail, ");
        if (obj != null)
        {
            obj = ((Exception) (obj)).getMessage();
        } else
        {
            obj = "";
        }
        j.d("Ad_SDK", stringbuilder.append(((String) (obj))).append(")").toString());
          goto _L10
_L2:
        return arraylist;
        obj;
          goto _L15
_L6:
        flag = false;
          goto _L16
_L4:
        flag = true;
          goto _L17
        obj = "";
          goto _L18
    }

    protected void a(List list)
    {
        super.onPostExecute(list);
        if (f != null)
        {
            try
            {
                f.a(b);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        if (j.a)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("AdUrlPreParseTask.onPostExecute(complete, ");
            int i1;
            if (list != null)
            {
                i1 = list.size();
            } else
            {
                i1 = -1;
            }
            j.a("Ad_SDK", stringbuilder.append(i1).append(")").toString());
        }
        a();
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Integer[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((List)obj);
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
    }
}
