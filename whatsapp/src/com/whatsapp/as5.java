// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.CheckBox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.UnknownFormatConversionException;

// Referenced classes of package com.whatsapp:
//            App, og, a5, MultipleContactPicker

class as5
    implements android.view.View.OnClickListener
{

    final a5 a;

    as5(a5 a5_1)
    {
        a = a5_1;
        super();
    }

    public void onClick(View view)
    {
        og og1;
        int j;
        boolean flag3;
        j = App.am;
        flag3 = ((CheckBox)view).isChecked();
        og1 = (og)view.getTag();
        boolean flag1;
        try
        {
            flag1 = App.C(og1.a);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (!flag1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag2 = flag3;
        if (flag3)
        {
            int i;
            int k;
            try
            {
                i = MultipleContactPicker.d(a.a).size();
                k = MultipleContactPicker.a(a.a);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            flag2 = flag3;
            if (i == k)
            {
                og og2;
                boolean flag;
                try
                {
                    a.a.f(String.format(a.a.getString(MultipleContactPicker.e(a.a)), new Object[] {
                        Integer.valueOf(MultipleContactPicker.a(a.a))
                    }));
                }
                catch (UnknownFormatConversionException unknownformatconversionexception)
                {
                    a.a.a(0x7f0e027f);
                }
                ((CheckBox)view).setChecked(false);
                flag2 = false;
            }
        }
        og1.L = flag2;
        flag2 = og1.L;
        if (flag2)
        {
            try
            {
                MultipleContactPicker.d(a.a).add(og1.a);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_215;
            }
        }
        MultipleContactPicker.d(a.a).remove(og1.a);
        MultipleContactPicker.a(a.a, MultipleContactPicker.d(a.a).size());
        view = MultipleContactPicker.f(a.a).iterator();
        flag = false;
        do
        {
            if (!view.hasNext())
            {
                break;
            }
            og2 = (og)view.next();
            if (og2 != og1)
            {
                try
                {
                    flag2 = og1.a.equals(og2.a);
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    throw view;
                }
                if (flag2)
                {
                    og2.L = og1.L;
                    flag = true;
                }
            }
        } while (j == 0);
        if (flag)
        {
            try
            {
                a.notifyDataSetChanged();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        view;
        throw view;
    }
}
