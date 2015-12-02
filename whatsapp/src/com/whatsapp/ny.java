// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.whatsapp.fieldstats.l;
import com.whatsapp.fieldstats.o;
import java.util.HashMap;

// Referenced classes of package com.whatsapp:
//            App, ab8, w2, ContactPicker, 
//            ft, og, au2

class ny
    implements android.widget.AdapterView.OnItemClickListener
{

    final ListView a;
    final w2 b;

    ny(w2 w2_1, ListView listview)
    {
        b = w2_1;
        a = listview;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l1)
    {
label0:
        {
label1:
            {
                int j = App.am;
                adapterview = (ab8)a.getAdapter();
                if (ContactPicker.r(b.a) == null)
                {
                    if (ab8.c(adapterview, i))
                    {
                        ft.a(o.TELL_A_FRIEND, l.CONTACTPICKER_LIST);
                        App.c(b.a);
                        if (j == 0)
                        {
                            break label0;
                        }
                    }
                    if (ab8.a(adapterview, i))
                    {
                        ContactPicker.g(b.a);
                        if (j == 0)
                        {
                            break label0;
                        }
                    }
                    if (ab8.b(adapterview, i))
                    {
                        break label0;
                    }
                    ContactPicker.a(b.a, adapterview.b(i));
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                if (ab8.c(adapterview, i) || ab8.a(adapterview, i) || ab8.b(adapterview, i))
                {
                    break label0;
                }
                adapterview = adapterview.b(i);
                if (ContactPicker.r(b.a).containsKey(((og) (adapterview)).a))
                {
                    ContactPicker.r(b.a).remove(((og) (adapterview)).a);
                    view.setBackgroundResource(0);
                    if (j == 0)
                    {
                        break label1;
                    }
                }
                if (au2.i > 0 && ContactPicker.r(b.a).size() >= au2.i)
                {
                    b.a.f(String.format(b.a.getString(0x7f0e0062), new Object[] {
                        Integer.valueOf(au2.i)
                    }));
                    if (j == 0)
                    {
                        break label1;
                    }
                }
                ContactPicker.r(b.a).put(((og) (adapterview)).a, adapterview);
                view.setBackgroundResource(0x7f02013c);
            }
            ContactPicker.i(b.a);
        }
    }
}
