// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.a;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gtp.a.a.b.c;
import org.json.JSONObject;

// Referenced classes of package com.go.weatherex.a:
//            g, d, e

class f extends AsyncTask
{

    final d a;
    private Context b;
    private String c;
    private String d;

    public f(d d1, Context context, String s, String s1)
    {
        a = d1;
        super();
        b = context;
        c = s;
        if (s1 == null)
        {
            s1 = "";
        }
        d = s1;
    }

    protected transient String a(Object aobj[])
    {
        aobj = g.a(b, c, d);
        if (aobj != null)
        {
            aobj = ((JSONObject) (aobj)).toString();
        } else
        {
            aobj = "";
        }
        com.gtp.a.a.b.c.a("ActivationManager", (new StringBuilder()).append("phead --> ").append(((String) (aobj))).toString());
        if (TextUtils.isEmpty(((CharSequence) (aobj))))
        {
            return null;
        }
        String s;
        if (w.p(b))
        {
            s = "http://activatecode.3g.cn/activationcode/nlValifyclient.do";
        } else
        {
            s = "http://api.goforandroid.com/activationcode/nlValifyclient.do";
        }
        com.gtp.a.a.b.c.a("ActivationManager", (new StringBuilder()).append("url --> ").append(s).toString());
        aobj = g.b(b, s, ((String) (aobj)));
        com.gtp.a.a.b.c.a("ActivationManager", (new StringBuilder()).append("\u3010result\u3011 --> ").append(((String) (aobj))).toString());
        return ((String) (aobj));
    }

    protected void a(String s)
    {
label0:
        {
label1:
            {
                super.onPostExecute(s);
                if (com.go.weatherex.a.d.a(a) != null)
                {
                    if (TextUtils.isEmpty(s))
                    {
                        break label0;
                    }
                    if (!s.equals("200"))
                    {
                        break label1;
                    }
                    com.go.weatherex.a.d.a(a).a(1);
                }
                return;
            }
            if (s.equals("400"))
            {
                com.go.weatherex.a.d.a(a).a(2);
                return;
            }
            if (s.equals("401"))
            {
                com.go.weatherex.a.d.a(a).a(3);
                return;
            }
            if (s.equals("402"))
            {
                com.go.weatherex.a.d.a(a).a(4);
                return;
            }
            if (s.equals("405") || s.equals("406"))
            {
                com.go.weatherex.a.d.a(a).a(5);
                return;
            } else
            {
                com.go.weatherex.a.d.a(a).a(0);
                return;
            }
        }
        com.go.weatherex.a.d.a(a).a(0);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((String)obj);
    }
}
