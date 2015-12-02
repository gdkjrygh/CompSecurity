// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import com.actionbarsherlock.app.ActionBar;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            App, asj, MediaView, aoz, 
//            w7

public class v1 extends AsyncTask
{

    private ArrayList a;
    final MediaView b;

    public v1(MediaView mediaview)
    {
        b = mediaview;
        super();
    }

    protected Integer a(Void avoid[])
    {
        int j = App.am;
        avoid = new asj(this);
        a = App.ah.a(MediaView.d(b), avoid);
        Object obj = Integer.valueOf(0);
        int i = 0;
        do
        {
label0:
            {
label1:
                {
                    avoid = ((Void []) (obj));
                    if (i >= a.size())
                    {
                        break label1;
                    }
                    avoid = ((Void []) (obj));
                    if (((c4)a.get(i)).y.equals(MediaView.c(b)))
                    {
                        obj = Integer.valueOf(a.size() - i - 1);
                        avoid = ((Void []) (obj));
                        if (j == 0)
                        {
                            break label1;
                        }
                        avoid = ((Void []) (obj));
                    }
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                return avoid;
            }
            i++;
            obj = avoid;
        } while (true);
    }

    public void a()
    {
        cancel(true);
    }

    protected void a(Integer integer)
    {
        com.whatsapp.MediaView.a(b, a);
        com.whatsapp.MediaView.a(b, integer.intValue());
        if (MediaView.m(b).size() > 0)
        {
            MediaView.j(b).notifyDataSetChanged();
            MediaView.p(b).setCurrentItem(MediaView.o(b), false);
            b.getSupportActionBar().setDisplayShowTitleEnabled(true);
            b.getSupportActionBar().setTitle(b.getString(0x7f0e023c, new Object[] {
                Integer.valueOf(MediaView.o(b) + 1), Integer.valueOf(MediaView.m(b).size())
            }));
            b.invalidateOptionsMenu();
        }
        b.setSupportProgressBarIndeterminateVisibility(false);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Integer)obj);
    }
}
