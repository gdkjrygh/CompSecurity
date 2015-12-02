// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.whatsapp:
//            ao1, WebImagePicker, nt, App

class kf extends AsyncTask
{

    final ao1 a;

    kf(ao1 ao1_1)
    {
        a = ao1_1;
        super();
    }

    protected List a(Void avoid[])
    {
        avoid = WebImagePicker.j(a.a).c();
        return avoid;
        avoid;
        Log.a(avoid);
_L2:
        return null;
        avoid;
        Log.a(avoid);
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void a(List list)
    {
label0:
        {
            Object obj = a;
            boolean flag;
            if (WebImagePicker.j(a.a).d() && WebImagePicker.h(a.a).size() < 100)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ao1.a(((ao1) (obj)), flag);
            ao1.a(a, null);
            if (list != null)
            {
                list.removeAll(WebImagePicker.h(a.a));
                WebImagePicker.h(a.a).addAll(list);
            }
            if (!WebImagePicker.h(a.a).isEmpty())
            {
                break label0;
            }
            obj = (TextView)a.a.getListView().getEmptyView();
            if (list == null)
            {
                ((TextView) (obj)).setText(0x7f0e02e1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            ((TextView) (obj)).setText(a.a.getString(0x7f0e02da, new Object[] {
                WebImagePicker.j(a.a).a()
            }));
        }
        a.notifyDataSetChanged();
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((List)obj);
    }
}
