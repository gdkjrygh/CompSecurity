// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.ubercab.client.core.model.FeedbackType;
import java.util.List;

public final class fcq extends ArrayAdapter
{

    public fcq(Context context, List list)
    {
        super(context, 0x1090008, list);
        setDropDownViewResource(0x1090009);
        insert(new FeedbackType(context.getString(0x7f070441)), 0);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        view = super.getDropDownView(i, view, viewgroup);
        viewgroup = (com.ubercab.rider.realtime.model.FeedbackType)getItem(i);
        ((TextView)view.findViewById(0x1020014)).setText(viewgroup.getDescription());
        return view;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        view = super.getView(i, view, viewgroup);
        viewgroup = (com.ubercab.rider.realtime.model.FeedbackType)getItem(i);
        ((TextView)view.findViewById(0x1020014)).setText(viewgroup.getDescription());
        return view;
    }
}
