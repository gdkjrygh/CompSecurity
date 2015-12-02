// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.ubercab.ui.TextView;

public final class fpp extends ArrayAdapter
{

    private LayoutInflater a;

    public fpp(Context context)
    {
        super(context, 0);
        a = LayoutInflater.from(context);
    }

    private View a(int i, ViewGroup viewgroup)
    {
        viewgroup = a.inflate(0x7f0301ad, viewgroup, false);
        fpq fpq1 = new fpq();
        if (i == 0)
        {
            viewgroup.setBackgroundResource(0x7f02010d);
        } else
        if (getCount() > 0 && i == getCount() - 1)
        {
            viewgroup.setBackgroundResource(0x7f0200e9);
            viewgroup.setPadding(0, 0, 0, 0);
        } else
        {
            viewgroup.setBackgroundResource(0x7f0200fb);
        }
        fpq1.a = (TextView)viewgroup.findViewById(0x7f0e0512);
        fpq1.a.setText(((fpt)getItem(i)).b());
        viewgroup.setTag(fpq1);
        return viewgroup;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            return a(i, viewgroup);
        } else
        {
            viewgroup = (fpq)view.getTag();
            ((fpq) (viewgroup)).a.setText(((fpt)getItem(i)).b());
            view.setTag(viewgroup);
            return view;
        }
    }
}
