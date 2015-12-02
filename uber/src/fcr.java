// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import com.ubercab.rider.realtime.model.FeedbackType;
import java.util.List;

public final class fcr extends BaseAdapter
{

    private fcs a;
    private List b;

    public fcr(List list, fcs fcs)
    {
        b = list;
        a = fcs;
    }

    static fcs a(fcr fcr1)
    {
        return fcr1.a;
    }

    public final int getCount()
    {
        return b.size();
    }

    public final Object getItem(int i)
    {
        return b.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)((FeedbackType)b.get(i)).getId().intValue();
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030163, null);
        }
        view = (FeedbackType)b.get(i);
        viewgroup = (RadioButton)view1.findViewById(0x7f0e042c);
        viewgroup.setText(view.getDescription());
        viewgroup.setOnClickListener(new android.view.View.OnClickListener(view) {

            final FeedbackType a;
            final fcr b;

            public final void onClick(View view2)
            {
                view2 = (RadioButton)view2;
                fcr.a(b).a(view2, a.getId().intValue());
            }

            
            {
                b = fcr.this;
                a = feedbacktype;
                super();
            }
        });
        return view1;
    }
}
