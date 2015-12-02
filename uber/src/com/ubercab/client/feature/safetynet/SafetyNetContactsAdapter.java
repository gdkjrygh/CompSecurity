// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.safetynet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import cev;
import com.ubercab.client.core.model.SafetyNetContact;
import com.ubercab.ui.TextView;
import dac;
import duj;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class SafetyNetContactsAdapter extends BaseAdapter
{

    private final cev a;
    private LayoutInflater b;
    private dac c;
    private boolean d;
    private boolean e;
    private String f;
    private List g;
    private Set h;
    private Set i;

    public SafetyNetContactsAdapter(Context context, cev cev)
    {
        g = new ArrayList();
        h = new HashSet();
        i = new HashSet();
        a = cev;
        b = LayoutInflater.from(context);
        c = new dac(context);
    }

    private View a(View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = b.inflate(0x7f030094, viewgroup, false);
            view1.setTag(new EmptyViewHolder(view1));
        }
        ((EmptyViewHolder)view1.getTag()).mTextViewEmpty.setText(f);
        return view1;
    }

    static cev a(SafetyNetContactsAdapter safetynetcontactsadapter)
    {
        return safetynetcontactsadapter.a;
    }

    private SafetyNetContact a(int j)
    {
        if (a())
        {
            return (SafetyNetContact)g.get(j);
        } else
        {
            return null;
        }
    }

    private void d()
    {
        Iterator iterator = h.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            SafetyNetContact safetynetcontact = (SafetyNetContact)iterator.next();
            if (!g.contains(safetynetcontact))
            {
                iterator.remove();
            }
        } while (true);
    }

    public final void a(SafetyNetContact safetynetcontact)
    {
        if (safetynetcontact == null)
        {
            return;
        }
        if (h.contains(safetynetcontact))
        {
            h.remove(safetynetcontact);
        } else
        {
            h.add(safetynetcontact);
        }
        notifyDataSetChanged();
    }

    public final void a(String s)
    {
        f = s;
    }

    public final void a(List list)
    {
        g.clear();
        if (list != null)
        {
            g.addAll(list);
        }
        d();
        notifyDataSetChanged();
    }

    public final void a(boolean flag)
    {
        e = flag;
        notifyDataSetChanged();
    }

    public final boolean a()
    {
        return g != null && !g.isEmpty();
    }

    public final void b()
    {
        d = true;
        notifyDataSetChanged();
    }

    public final void b(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            SafetyNetContact safetynetcontact = (SafetyNetContact)list.next();
            if (!g.contains(safetynetcontact))
            {
                g.add(safetynetcontact);
            }
        } while (true);
        d();
        notifyDataSetChanged();
    }

    public final boolean b(SafetyNetContact safetynetcontact)
    {
        return h.contains(safetynetcontact);
    }

    public final List c()
    {
        return new ArrayList(h);
    }

    public final void c(List list)
    {
        if (list == null)
        {
            return;
        }
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            SafetyNetContact safetynetcontact = (SafetyNetContact)list.next();
            if (!h.contains(safetynetcontact) && g.contains(safetynetcontact))
            {
                h.add(safetynetcontact);
            }
        } while (true);
        notifyDataSetChanged();
    }

    public final void d(List list)
    {
        i = new HashSet(list);
    }

    public final int getCount()
    {
        if (a())
        {
            return g.size();
        } else
        {
            return 1;
        }
    }

    public final Object getItem(int j)
    {
        return a(j);
    }

    public final long getItemId(int j)
    {
        return (long)j;
    }

    public final int getItemViewType(int j)
    {
        return !a() ? 1 : 0;
    }

    public final View getView(int j, View view, ViewGroup viewgroup)
    {
        boolean flag = false;
        if (!a())
        {
            view = a(view, viewgroup);
        } else
        {
            View view1 = view;
            if (view == null)
            {
                view1 = c.a(viewgroup);
                view1.setTag(new SafetyNetContactViewHolder(view1));
            }
            viewgroup = a(j);
            SafetyNetContactViewHolder safetynetcontactviewholder = (SafetyNetContactViewHolder)view1.getTag();
            safetynetcontactviewholder.a(viewgroup);
            safetynetcontactviewholder.mTextViewName.setText(viewgroup.getName());
            safetynetcontactviewholder.mTextViewNumber.setText(duj.a(viewgroup.getPhone()));
            safetynetcontactviewholder.mImageViewPicture.setImageResource(0x7f02006f);
            view = safetynetcontactviewholder.mImageRemove;
            if (e)
            {
                j = 0;
            } else
            {
                j = 8;
            }
            view.setVisibility(j);
            view = safetynetcontactviewholder.mCheckBoxIsInvited;
            if (d)
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = 8;
            }
            view.setVisibility(j);
            view = view1;
            if (d)
            {
                safetynetcontactviewholder.mCheckBoxIsInvited.setChecked(h.contains(viewgroup));
                return view1;
            }
        }
        return view;
    }

    public final int getViewTypeCount()
    {
        return 2;
    }

    public final boolean isEnabled(int j)
    {
        SafetyNetContact safetynetcontact = a(j);
        return !i.contains(safetynetcontact);
    }

    private class EmptyViewHolder
    {

        final SafetyNetContactsAdapter a;
        TextView mTextViewEmpty;

        public EmptyViewHolder(View view)
        {
            a = SafetyNetContactsAdapter.this;
            super();
            ButterKnife.inject(this, view);
        }
    }


    private class SafetyNetContactViewHolder
    {

        final SafetyNetContactsAdapter a;
        private SafetyNetContact b;
        CheckBox mCheckBoxIsInvited;
        ImageButton mImageRemove;
        ImageView mImageViewPicture;
        TextView mTextViewName;
        TextView mTextViewNumber;

        final void a(SafetyNetContact safetynetcontact)
        {
            b = safetynetcontact;
        }

        void onClickRemove()
        {
            SafetyNetContactsAdapter.a(a).c(new ffe(b));
        }

        public SafetyNetContactViewHolder(View view)
        {
            a = SafetyNetContactsAdapter.this;
            super();
            ButterKnife.inject(this, view);
        }
    }

}
