// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.Filter;
import com.ubercab.client.core.contacts.Contact;
import com.ubercab.client.core.contacts.ContactViewHolder;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public final class few extends dag
{

    private Collection g;
    private Collection h;

    public few(Context context, cgh cgh, boolean flag)
    {
        super(context, cgh, flag);
        g = new HashSet();
        h = new HashSet();
        getFilter().filter(null);
    }

    public final void b(Collection collection)
    {
        HashSet hashset = new HashSet();
        if (collection != null)
        {
            for (collection = collection.iterator(); collection.hasNext(); hashset.add(duj.d((String)collection.next(), null))) { }
        }
        h = hashset;
        notifyDataSetChanged();
    }

    public final void bindView(View view, Context context, Cursor cursor)
    {
        context = duj.d(cursor.getString(cursor.getColumnIndex("data1")), null);
        boolean flag;
        if (h.contains(context) || g.contains(context))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((ContactViewHolder)view.getTag()).a(Contact.a(cursor), flag, false);
    }

    public final void c(Collection collection)
    {
        HashSet hashset = new HashSet();
        if (collection != null)
        {
            for (collection = collection.iterator(); collection.hasNext(); hashset.add(duj.d(((com.ubercab.client.core.ui.ChipEditText.Chip)collection.next()).c(), null))) { }
        }
        g = hashset;
        notifyDataSetChanged();
    }

    public final CharSequence convertToString(Cursor cursor)
    {
        return cursor.getString(cursor.getColumnIndex("data1"));
    }

    public final boolean isEnabled(int i)
    {
        Object obj = (Cursor)getItem(i);
        obj = duj.d(((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("data1")), null);
        return !h.contains(obj);
    }
}
