// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.KeyEventCompat;
import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            SearchView

class ay
    implements android.view.View.OnKeyListener
{

    final SearchView a;

    ay(SearchView searchview)
    {
        a = searchview;
        super();
    }

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (SearchView.o(a) != null)
        {
            if (SearchView.m(a).isPopupShowing() && SearchView.m(a).getListSelection() != -1)
            {
                return SearchView.a(a, view, i, keyevent);
            }
            if (!SearchView.SearchAutoComplete.a(SearchView.m(a)) && KeyEventCompat.hasNoModifiers(keyevent) && keyevent.getAction() == 1 && i == 66)
            {
                view.cancelLongPress();
                SearchView.a(a, 0, null, SearchView.m(a).getText().toString());
                return true;
            }
        }
        return false;
    }
}
