// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.ubercab.rider.realtime.model.FareSplit;
import com.ubercab.rider.realtime.model.FareSplitClient;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class dty
{

    public static String a(Context context, FareSplit faresplit)
    {
        faresplit = faresplit.getClients();
        int j;
        if (faresplit != null)
        {
            faresplit = faresplit.iterator();
            int i = 0;
            do
            {
                j = i;
                if (!faresplit.hasNext())
                {
                    break;
                }
                if (((FareSplitClient)faresplit.next()).getStatus().equals("Accepted"))
                {
                    i++;
                }
            } while (true);
        } else
        {
            j = 0;
        }
        if (j < 2)
        {
            return context.getString(0x7f07023d);
        } else
        {
            return context.getString(0x7f07023c, new Object[] {
                Integer.valueOf(j)
            });
        }
    }

    public static String a(Context context, String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 5: default 56
    //                   -2081881145: 94
    //                   -522759168: 136
    //                   -58529607: 122
    //                   632840270: 108
    //                   1418225932: 150;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_150;
_L7:
        switch (byte0)
        {
        default:
            return s;

        case 0: // '\0'
            return context.getString(0x7f070236);

        case 1: // '\001'
            return context.getString(0x7f07023b);

        case 2: // '\002'
            return context.getString(0x7f070237);

        case 3: // '\003'
            return context.getString(0x7f070288);

        case 4: // '\004'
            return context.getString(0x7f070241);
        }
_L2:
        if (s.equals("Accepted"))
        {
            byte0 = 0;
        }
          goto _L7
_L5:
        if (s.equals("Declined"))
        {
            byte0 = 1;
        }
          goto _L7
_L4:
        if (s.equals("Canceled"))
        {
            byte0 = 2;
        }
          goto _L7
_L3:
        if (s.equals("InvalidNumber"))
        {
            byte0 = 3;
        }
          goto _L7
        if (s.equals("NoAccount"))
        {
            byte0 = 4;
        }
          goto _L7
    }

    public static String a(FareSplitClient faresplitclient)
    {
        String s = faresplitclient.getDisplayName();
        if (!TextUtils.isEmpty(s))
        {
            return s;
        } else
        {
            return duj.b(faresplitclient.getMobileDigits(), faresplitclient.getMobileCountryIso2());
        }
    }

    public static Collection a(FareSplit faresplit)
    {
        HashSet hashset = new HashSet();
        faresplit = faresplit.getClients();
        if (faresplit != null)
        {
            FareSplitClient faresplitclient;
            for (faresplit = faresplit.iterator(); faresplit.hasNext(); hashset.add(duj.c(faresplitclient.getMobileDigits(), faresplitclient.getMobileCountryIso2())))
            {
                faresplitclient = (FareSplitClient)faresplit.next();
            }

        }
        return hashset;
    }
}
