// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.ubercab.ui.TextView;

public final class daw extends ArrayAdapter
{

    private LayoutInflater a;

    public daw(Context context)
    {
        super(context, 0);
        a = LayoutInflater.from(context);
    }

    public final long getItemId(int i)
    {
        return (long)((dav)getItem(i)).a();
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        dav dav1;
        if (view == null)
        {
            dax dax1 = new dax((byte)0);
            view = a.inflate(0x7f0300c4, viewgroup, false);
            dax.a(dax1, (ImageView)view.findViewById(0x7f0e020e));
            dax.a(dax1, (TextView)view.findViewById(0x7f0e020f));
            view.setTag(dax1);
            viewgroup = dax1;
        } else
        {
            viewgroup = (dax)view.getTag();
        }
        dav1 = (dav)getItem(i);
        dax.a(viewgroup).setImageResource(dav1.c());
        dax.b(viewgroup).setText(dav1.b());
        return view;
    }
}
