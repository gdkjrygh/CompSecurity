// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.FilterQueryProvider;
import com.ubercab.client.core.contacts.Contact;
import com.ubercab.client.core.contacts.ContactViewHolder;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public abstract class dad extends CursorAdapter
    implements FilterQueryProvider
{

    protected boolean a;
    protected Context b;
    protected dac c;
    protected List d;
    protected dae e;
    protected Collection f;

    public dad(Context context, boolean flag)
    {
        super(context, null, false);
        f = new HashSet();
        b = context;
        a = flag;
        c = new dac(context);
        setFilterQueryProvider(this);
    }

    public final int a(long l)
    {
        for (int i = 0; i < getCount(); i++)
        {
            if (getItemId(i) == l)
            {
                return i;
            }
        }

        return 0;
    }

    protected abstract ContactViewHolder a(View view);

    public abstract String a(Cursor cursor);

    public final void a(dae dae1)
    {
        e = dae1;
    }

    public final void a(Collection collection)
    {
        f = collection;
        notifyDataSetChanged();
    }

    public final void a(List list)
    {
        d = list;
    }

    protected abstract Contact b(Cursor cursor);

    public void bindView(View view, Context context, Cursor cursor)
    {
        boolean flag1 = f.contains(a(cursor));
        boolean flag;
        if (d == null)
        {
            flag = false;
        } else
        {
            flag = d.contains(a(cursor));
        }
        ((ContactViewHolder)view.getTag()).a(b(cursor), flag1, flag);
    }

    public void changeCursor(Cursor cursor)
    {
        super.changeCursor(cursor);
        if (e != null)
        {
            e.a();
        }
    }

    public boolean isEnabled(int i)
    {
        if (d == null)
        {
            return false;
        }
        return !d.contains(a((Cursor)getItem(i)));
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = c.a(viewgroup);
        context.setTag(a(context));
        return context;
    }
}
