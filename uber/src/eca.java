// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.ubercab.client.feature.faresplit.master.FareSplitClientViewHolder;
import com.ubercab.rider.realtime.model.FareSplit;
import com.ubercab.rider.realtime.model.FareSplitClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class eca extends BaseAdapter
    implements android.view.View.OnClickListener
{

    private boolean a;
    private ecb b;
    private dac c;
    private List d;
    private final cgh e;

    public eca(Context context, cgh cgh)
    {
        d = new ArrayList();
        c = new dac(context);
        e = cgh;
    }

    static int a(String s)
    {
        return b(s);
    }

    private FareSplitClient a(int i)
    {
        return (FareSplitClient)d.get(i);
    }

    private static int b(String s)
    {
        byte byte0;
        byte byte1;
        byte1 = 1;
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 5: default 60
    //                   -2081881145: 101
    //                   -522759168: 157
    //                   632840270: 129
    //                   982065527: 115
    //                   1418225932: 143;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_157;
_L7:
        switch (byte0)
        {
        default:
            byte1 = 6;
            // fall through

        case 0: // '\0'
            return byte1;

        case 1: // '\001'
            return 2;

        case 2: // '\002'
            return 3;

        case 3: // '\003'
            return 4;

        case 4: // '\004'
            return 5;
        }
_L2:
        if (s.equals("Accepted"))
        {
            byte0 = 0;
        }
          goto _L7
_L5:
        if (s.equals("Pending"))
        {
            byte0 = 1;
        }
          goto _L7
_L4:
        if (s.equals("Declined"))
        {
            byte0 = 2;
        }
          goto _L7
_L6:
        if (s.equals("NoAccount"))
        {
            byte0 = 3;
        }
          goto _L7
        if (s.equals("InvalidNumber"))
        {
            byte0 = 4;
        }
          goto _L7
    }

    public final void a(FareSplit faresplit)
    {
        FareSplitClient faresplitclient = faresplit.getClientSelf();
        boolean flag;
        if (faresplitclient != null && faresplitclient.getIsInitiator())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        faresplit = new ArrayList(faresplit.getClients());
        Collections.sort(faresplit, new Comparator() {

            final eca a;

            private static int a(FareSplitClient faresplitclient1, FareSplitClient faresplitclient2)
            {
                Integer integer = Integer.valueOf(eca.a(faresplitclient1.getStatus()));
                Integer integer1 = Integer.valueOf(eca.a(faresplitclient2.getStatus()));
                if (!integer.equals(integer1))
                {
                    return integer.compareTo(integer1);
                } else
                {
                    faresplitclient1 = dty.a(faresplitclient1);
                    return dty.a(faresplitclient2).compareTo(faresplitclient1);
                }
            }

            public final int compare(Object obj, Object obj1)
            {
                return a((FareSplitClient)obj, (FareSplitClient)obj1);
            }

            
            {
                a = eca.this;
                super();
            }
        });
        d = faresplit;
        notifyDataSetChanged();
    }

    public final void a(ecb ecb1)
    {
        b = ecb1;
    }

    public final int getCount()
    {
        return d.size();
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = c.a(viewgroup);
        }
        viewgroup = (FareSplitClientViewHolder)view1.getTag();
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new FareSplitClientViewHolder(view1, this, e);
            view1.setTag(view);
        }
        view.a(a(i), i, a);
        return view1;
    }

    public final boolean isEnabled(int i)
    {
        return false;
    }

    public final void onClick(View view)
    {
        if (view.getId() == 0x7f0e0184)
        {
            view = a(((Integer)view.getTag()).intValue());
            if (b != null)
            {
                b.a(view);
            }
        }
    }
}
