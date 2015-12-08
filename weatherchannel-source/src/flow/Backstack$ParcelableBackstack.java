// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package flow;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package flow:
//            Backstack, Parcer

private static interface _cls1
    extends Parcelable
{
    public static class Memory
        implements Backstack.ParcelableBackstack
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
            Backstack.Entry entry;
            for (Iterator iterator = backstack.iterator(); iterator.hasNext(); arraylist.add(new Backstack.ParcelableEntry(Backstack.Entry.access$300(entry), parcer.wrap(entry.getScreen()))))
            {
                entry = (Backstack.Entry)iterator.next();
            }

            parcel.writeLong(Backstack.access$400(backstack));
            parcel.writeTypedList(arraylist);
        }

        Memory(Backstack backstack1, Parcer parcer1)
        {
            backstack = backstack1;
            parcer = parcer1;
        }
    }

    public static class Parcelled
        implements Backstack.ParcelableBackstack
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
            for (Iterator iterator = entries.iterator(); iterator.hasNext(); arraylist.add(((Backstack.ParcelableEntry)iterator.next()).toRealEntry(parcer))) { }
            return (new Backstack.Builder(highestId, arraylist, null)).build();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeLong(highestId);
            parcel.writeTypedList(entries);
        }

        Parcelled(long l, List list)
        {
            highestId = l;
            entries = list;
        }
    }


    public static final android.os.led.entries CREATOR = new android.os.Parcelable.Creator() {

        public Backstack.ParcelableBackstack createFromParcel(Parcel parcel)
        {
            ArrayList arraylist = new ArrayList();
            long l = parcel.readLong();
            parcel.readTypedList(arraylist, Backstack.ParcelableEntry.CREATOR);
            return new Parcelled(l, arraylist);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Backstack.ParcelableBackstack[] newArray(int i)
        {
            return new Parcelled[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };

    public abstract Backstack getBackstack(Parcer parcer);

}
