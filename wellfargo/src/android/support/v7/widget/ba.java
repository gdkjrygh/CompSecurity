// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.ResultReceiver;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

class ba
{

    private Method a;
    private Method b;
    private Method c;
    private Method d;

    ba()
    {
        try
        {
            a = android/widget/AutoCompleteTextView.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            a.setAccessible(true);
        }
        catch (NoSuchMethodException nosuchmethodexception3) { }
        try
        {
            b = android/widget/AutoCompleteTextView.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            b.setAccessible(true);
        }
        catch (NoSuchMethodException nosuchmethodexception2) { }
        try
        {
            c = android/widget/AutoCompleteTextView.getMethod("ensureImeVisible", new Class[] {
                Boolean.TYPE
            });
            c.setAccessible(true);
        }
        catch (NoSuchMethodException nosuchmethodexception1) { }
        try
        {
            d = android/view/inputmethod/InputMethodManager.getMethod("showSoftInputUnchecked", new Class[] {
                Integer.TYPE, android/os/ResultReceiver
            });
            d.setAccessible(true);
            return;
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            return;
        }
    }

    void a(InputMethodManager inputmethodmanager, View view, int i)
    {
        if (d != null)
        {
            try
            {
                d.invoke(inputmethodmanager, new Object[] {
                    Integer.valueOf(i), null
                });
                return;
            }
            catch (Exception exception) { }
        }
        inputmethodmanager.showSoftInput(view, i);
    }

    void a(AutoCompleteTextView autocompletetextview)
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        a.invoke(autocompletetextview, new Object[0]);
        return;
        autocompletetextview;
    }

    void a(AutoCompleteTextView autocompletetextview, boolean flag)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        c.invoke(autocompletetextview, new Object[] {
            Boolean.valueOf(flag)
        });
        return;
        autocompletetextview;
    }

    void b(AutoCompleteTextView autocompletetextview)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        b.invoke(autocompletetextview, new Object[0]);
        return;
        autocompletetextview;
    }
}
