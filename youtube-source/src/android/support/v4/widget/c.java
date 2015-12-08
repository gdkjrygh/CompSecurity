// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

// Referenced classes of package android.support.v4.widget:
//            g, d, e, f

public abstract class c extends BaseAdapter
    implements g, Filterable
{

    protected boolean a;
    protected boolean b;
    protected Cursor c;
    protected Context d;
    protected int e;
    protected d f;
    protected DataSetObserver g;
    protected f h;
    protected FilterQueryProvider i;

    public c(Context context, Cursor cursor, boolean flag)
    {
        boolean flag1 = true;
        super();
        int j;
        int k;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 2;
        }
        if ((j & 1) == 1)
        {
            b = true;
            j |= 2;
        } else
        {
            b = false;
        }
        if (cursor != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        c = cursor;
        a = flag;
        d = context;
        if (flag)
        {
            k = cursor.getColumnIndexOrThrow("_id");
        } else
        {
            k = -1;
        }
        e = k;
        if ((j & 2) == 2)
        {
            f = new d(this);
            g = new e(this, (byte)0);
        } else
        {
            f = null;
            g = null;
        }
        if (flag)
        {
            if (f != null)
            {
                cursor.registerContentObserver(f);
            }
            if (g != null)
            {
                cursor.registerDataSetObserver(g);
            }
        }
    }

    public final Cursor a()
    {
        return c;
    }

    public Cursor a(CharSequence charsequence)
    {
        if (i != null)
        {
            return i.runQuery(charsequence);
        } else
        {
            return c;
        }
    }

    public abstract View a(Context context, Cursor cursor, ViewGroup viewgroup);

    public void a(Cursor cursor)
    {
        if (cursor == c)
        {
            cursor = null;
        } else
        {
            Cursor cursor1 = c;
            if (cursor1 != null)
            {
                if (f != null)
                {
                    cursor1.unregisterContentObserver(f);
                }
                if (g != null)
                {
                    cursor1.unregisterDataSetObserver(g);
                }
            }
            c = cursor;
            if (cursor != null)
            {
                if (f != null)
                {
                    cursor.registerContentObserver(f);
                }
                if (g != null)
                {
                    cursor.registerDataSetObserver(g);
                }
                e = cursor.getColumnIndexOrThrow("_id");
                a = true;
                notifyDataSetChanged();
                cursor = cursor1;
            } else
            {
                e = -1;
                a = false;
                notifyDataSetInvalidated();
                cursor = cursor1;
            }
        }
        if (cursor != null)
        {
            cursor.close();
        }
    }

    public abstract void a(View view, Cursor cursor);

    public View b(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return a(context, cursor, viewgroup);
    }

    public CharSequence b(Cursor cursor)
    {
        if (cursor == null)
        {
            return "";
        } else
        {
            return cursor.toString();
        }
    }

    protected final void b()
    {
        if (b && c != null && !c.isClosed())
        {
            a = c.requery();
        }
    }

    public int getCount()
    {
        if (a && c != null)
        {
            return c.getCount();
        } else
        {
            return 0;
        }
    }

    public View getDropDownView(int j, View view, ViewGroup viewgroup)
    {
        if (a)
        {
            c.moveToPosition(j);
            View view1 = view;
            if (view == null)
            {
                view1 = b(d, c, viewgroup);
            }
            view = d;
            a(view1, c);
            return view1;
        } else
        {
            return null;
        }
    }

    public Filter getFilter()
    {
        if (h == null)
        {
            h = new f(this);
        }
        return h;
    }

    public Object getItem(int j)
    {
        if (a && c != null)
        {
            c.moveToPosition(j);
            return c;
        } else
        {
            return null;
        }
    }

    public long getItemId(int j)
    {
        long l1 = 0L;
        long l = l1;
        if (a)
        {
            l = l1;
            if (c != null)
            {
                l = l1;
                if (c.moveToPosition(j))
                {
                    l = c.getLong(e);
                }
            }
        }
        return l;
    }

    public View getView(int j, View view, ViewGroup viewgroup)
    {
        if (!a)
        {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!c.moveToPosition(j))
        {
            throw new IllegalStateException((new StringBuilder("couldn't move cursor to position ")).append(j).toString());
        }
        View view1 = view;
        if (view == null)
        {
            view1 = a(d, c, viewgroup);
        }
        view = d;
        a(view1, c);
        return view1;
    }

    public boolean hasStableIds()
    {
        return true;
    }
}
