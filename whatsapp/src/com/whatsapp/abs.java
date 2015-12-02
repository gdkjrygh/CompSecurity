// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.text.TextUtils;
import android.widget.SectionIndexer;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            ab8, App, og, ContactPicker

class abs extends ab8
    implements SectionIndexer
{

    private ArrayList e;
    private ArrayList f;
    final ContactPicker g;

    public abs(ContactPicker contactpicker, Context context, ArrayList arraylist)
    {
        g = contactpicker;
        super(contactpicker, context, arraylist);
        e = new ArrayList();
        f = new ArrayList();
    }

    private void a()
    {
        int j = App.am;
        e = new ArrayList();
        f = new ArrayList();
        int k = b.size();
        int i = 0;
        String s1 = "";
        do
        {
            String s2;
label0:
            {
label1:
                {
label2:
                    {
                        String s;
label3:
                        {
                            if (i >= k)
                            {
                                break label1;
                            }
                            s = ((og)b.get(i)).a(g);
                            s2 = s1;
                            if (TextUtils.isEmpty(s))
                            {
                                break label2;
                            }
                            s2 = s.substring(0, 1).toUpperCase();
                            if (!Character.isDigit(s2.charAt(0)))
                            {
                                s = s2;
                                if (s2.charAt(0) != '+')
                                {
                                    break label3;
                                }
                            }
                            s = "#";
                        }
                        s2 = s1;
                        if (!s1.equals(s))
                        {
                            e.add(s);
                            f.add(Integer.valueOf(i));
                            s2 = s;
                        }
                    }
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                return;
            }
            i++;
            s1 = s2;
        } while (true);
    }

    public int getPositionForSection(int i)
    {
        if (f == null || i >= f.size() || i < 0)
        {
            return -1;
        } else
        {
            return ((Integer)f.get(i)).intValue();
        }
    }

    public int getSectionForPosition(int i)
    {
        int k = App.am;
        if (i < 0)
        {
            return 0;
        }
        if (i >= b.size())
        {
            return e.size() - 1;
        }
        int j = f.size() - 1;
        do
        {
            if (j < 0)
            {
                break;
            }
            if (((Integer)f.get(j)).intValue() <= i)
            {
                return j;
            }
            j--;
        } while (k == 0);
        return 0;
    }

    public Object[] getSections()
    {
        return e.toArray(new String[1]);
    }

    public void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        a();
    }
}
