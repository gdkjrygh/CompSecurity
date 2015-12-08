// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package flow;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package flow:
//            Backstack, Parcer

public static class parcer
    implements parcer
{

    private final Backstack backstack;
    private final Parcer parcer;

    public int describeContents()
    {
        return 0;
    }

    public Backstack getBackstack(Parcer parcer1)
    {
        return backstack;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ArrayList arraylist = new ArrayList();
        backstack backstack1;
        for (Iterator iterator = backstack.iterator(); iterator.hasNext(); arraylist.add(new backstack(backstack(backstack1), parcer.wrap(backstack1.parcer()))))
        {
            backstack1 = (parcer)iterator.next();
        }

        parcel.writeLong(Backstack.access$400(backstack));
        parcel.writeTypedList(arraylist);
    }

    (Backstack backstack1, Parcer parcer1)
    {
        backstack = backstack1;
        parcer = parcer1;
    }
}
