// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.util.ArrayMap;
import com.ubercab.client.core.app.RiderActivity;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class cys
{

    private final Application a;
    private int b;
    private final Set c = new CopyOnWriteArraySet();

    public cys(Application application)
    {
        b = 19;
        a = application;
    }

    public static boolean a(RiderActivity rideractivity, String s)
    {
        return ActivityCompat.shouldShowRequestPermissionRationale(rideractivity, s);
    }

    public final void a(RiderActivity rideractivity, int i, String as[], int ai[])
    {
        rideractivity = rideractivity.b(i);
        if (rideractivity == null)
        {
            return;
        }
        ArrayMap arraymap = new ArrayMap(as.length);
        int j = as.length;
        i = 0;
        boolean flag = true;
        while (i < j) 
        {
            boolean flag1;
            if (ai[i] == 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            arraymap.put(as[i], Boolean.valueOf(flag1));
            if (flag && flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i++;
        }
        for (as = c.iterator(); as.hasNext(); ((cyu)as.next()).a(arraymap)) { }
        rideractivity.a(arraymap, flag);
    }

    public final transient void a(RiderActivity rideractivity, doc doc1, String as[])
    {
        LinkedList linkedlist = new LinkedList();
        LinkedList linkedlist1 = new LinkedList();
        int i = 0;
        while (i <= 0) 
        {
            String s = as[0];
            if (a(s))
            {
                linkedlist.add(s);
            } else
            {
                linkedlist1.add(s);
            }
            i++;
        }
        if (linkedlist1.isEmpty())
        {
            rideractivity = new ArrayMap(linkedlist.size());
            for (as = linkedlist.iterator(); as.hasNext(); rideractivity.put((String)as.next(), Boolean.valueOf(true))) { }
            doc1.a(rideractivity, true);
            return;
        }
        i = b;
        if (b >= 49)
        {
            b = 19;
        } else
        {
            b = b + 1;
        }
        rideractivity.a(i, new cyt(doc1, linkedlist));
        for (doc1 = c.iterator(); doc1.hasNext(); ((cyu)doc1.next()).a(linkedlist1)) { }
        ActivityCompat.requestPermissions(rideractivity, (String[])linkedlist1.toArray(new String[linkedlist1.size()]), i);
    }

    public final void a(cyu cyu1)
    {
        c.add(cyu1);
    }

    public final boolean a(String s)
    {
        boolean flag = false;
        int i;
        try
        {
            i = ContextCompat.checkSelfPermission(a, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        if (i == 0)
        {
            flag = true;
        }
        return flag;
    }
}
