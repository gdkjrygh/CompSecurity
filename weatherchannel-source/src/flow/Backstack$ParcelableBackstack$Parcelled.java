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

public static class entries
    implements entries
{

    private final List entries;
    private final long highestId;

    public int describeContents()
    {
        return 0;
    }

    public Backstack getBackstack(Parcer parcer)
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = entries.iterator(); iterator.hasNext(); arraylist.add(((entries)iterator.next()).entries(parcer))) { }
        return (new entries(highestId, arraylist, null)).highestId();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(highestId);
        parcel.writeTypedList(entries);
    }

    (long l, List list)
    {
        highestId = l;
        entries = list;
    }
}
