// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.ubercab.client.feature.profiles.BadgeView;
import com.ubercab.client.feature.profiles.EditBadgeFragment;
import com.ubercab.client.feature.profiles.model.BadgeIcons;
import java.util.List;

public final class eyc extends ArrayAdapter
{

    final EditBadgeFragment a;
    private final LayoutInflater b;

    public eyc(EditBadgeFragment editbadgefragment, Context context, List list)
    {
        a = editbadgefragment;
        super(context, 0x7f030059, list);
        b = LayoutInflater.from(editbadgefragment.getActivity());
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = b.inflate(0x7f030059, viewgroup, false);
        }
        view = (BadgeView)view1.findViewById(0x7f0e0105);
        viewgroup = (String)getItem(i);
        a.e.a(BadgeIcons.getResIdForIcon(viewgroup)).a(view);
        view.a(EditBadgeFragment.d(a));
        view1.setTag(viewgroup);
        if (EditBadgeFragment.e(a) != null && viewgroup.equals(EditBadgeFragment.e(a)))
        {
            view = (String)view1.getTag();
            EditBadgeFragment.a(a, view1, view);
        }
        return view1;
    }
}
