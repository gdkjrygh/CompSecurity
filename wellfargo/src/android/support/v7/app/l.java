// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.ListView;

// Referenced classes of package android.support.v7.app:
//            j, h

class l extends CursorAdapter
{

    final ListView a;
    final h b;
    final j c;
    private final int d;
    private final int e;

    l(j j1, Context context, Cursor cursor, boolean flag, ListView listview, h h1)
    {
        c = j1;
        a = listview;
        b = h1;
        super(context, cursor, flag);
        j1 = getCursor();
        d = j1.getColumnIndexOrThrow(c.I);
        e = j1.getColumnIndexOrThrow(c.J);
    }

    public void bindView(View view, Context context, Cursor cursor)
    {
        ((CheckedTextView)view.findViewById(0x1020014)).setText(cursor.getString(d));
        view = a;
        int i = cursor.getPosition();
        boolean flag;
        if (cursor.getInt(e) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setItemChecked(i, flag);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return c.b.inflate(h.j(b), viewgroup, false);
    }
}
