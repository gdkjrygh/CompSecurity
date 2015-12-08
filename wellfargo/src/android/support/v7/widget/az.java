// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package android.support.v7.widget:
//            SearchView

class az
    implements android.widget.TextView.OnEditorActionListener
{

    final SearchView a;

    az(SearchView searchview)
    {
        a = searchview;
        super();
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        SearchView.j(a);
        return true;
    }
}
