// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package flow;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package flow:
//            HasParent, Parcer

public final class Backstack
    implements Iterable
{
    public static final class Builder
    {

        private final Deque backstack;
        private long highestId;

        public Builder addAll(Collection collection)
        {
            Object obj;
            Deque deque;
            long l;
            for (collection = collection.iterator(); collection.hasNext(); deque.push(new Entry(l, obj)))
            {
                obj = collection.next();
                deque = backstack;
                l = highestId + 1L;
                highestId = l;
            }

            return this;
        }

        public Backstack build()
        {
            if (backstack.isEmpty())
            {
                throw new IllegalStateException("Backstack may not be empty");
            } else
            {
                return new Backstack(highestId, backstack);
            }
        }

        public Builder clear()
        {
            backstack.clear();
            return this;
        }

        public Entry pop()
        {
            return (Entry)backstack.pop();
        }

        public Builder push(Object obj)
        {
            Deque deque = backstack;
            long l = highestId + 1L;
            highestId = l;
            deque.push(new Entry(l, obj));
            return this;
        }

        private Builder(long l, Collection collection)
        {
            highestId = l;
            backstack = new ArrayDeque(collection);
        }

        Builder(long l, Collection collection, _cls1 _pcls1)
        {
            this(l, collection);
        }
    }

    public static final class Entry
    {

        private final long id;
        private final Object screen;

        public long getId()
        {
            return id;
        }

        public Object getScreen()
        {
            return screen;
        }

        public String toString()
        {
            return (new StringBuilder()).append("{").append(id).append(", ").append(screen).append("}").toString();
        }


        private Entry(long l, Object obj)
        {
            id = l;
            screen = obj;
        }

        Entry(long l, Object obj, _cls1 _pcls1)
        {
            this(l, obj);
        }
    }

    private static interface ParcelableBackstack
        extends Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public ParcelableBackstack createFromParcel(Parcel parcel)
            {
                ArrayList arraylist = new ArrayList();
                long l = parcel.readLong();
                parcel.readTypedList(arraylist, ParcelableEntry.CREATOR);
                return new ParcelableBackstack.Parcelled(l, arraylist);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public ParcelableBackstack[] newArray(int i)
            {
                return new ParcelableBackstack.Parcelled[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };

        public abstract Backstack getBackstack(Parcer parcer);

    }

    public static class ParcelableBackstack.Memory
        implements ParcelableBackstack
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
            Entry entry;
            for (Iterator iterator1 = backstack.iterator(); iterator1.hasNext(); arraylist.add(new ParcelableEntry(entry.id, parcer.wrap(entry.getScreen()))))
            {
                entry = (Entry)iterator1.next();
            }

            parcel.writeLong(backstack.highestId);
            parcel.writeTypedList(arraylist);
        }

        ParcelableBackstack.Memory(Backstack backstack1, Parcer parcer1)
        {
            backstack = backstack1;
            parcer = parcer1;
        }
    }

    public static class ParcelableBackstack.Parcelled
        implements ParcelableBackstack
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
            for (Iterator iterator1 = entries.iterator(); iterator1.hasNext(); arraylist.add(((ParcelableEntry)iterator1.next()).toRealEntry(parcer))) { }
            return (new Builder(highestId, arraylist)).build();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeLong(highestId);
            parcel.writeTypedList(entries);
        }

        ParcelableBackstack.Parcelled(long l, List list)
        {
            highestId = l;
            entries = list;
        }
    }

    private static class ParcelableEntry
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public ParcelableEntry createFromParcel(Parcel parcel)
            {
                return new ParcelableEntry(parcel.readLong(), parcel.readParcelable(getClass().getClassLoader()));
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public ParcelableEntry[] newArray(int i)
            {
                return new ParcelableEntry[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        private final long id;
        private final Parcelable parcelable;

        public int describeContents()
        {
            return 0;
        }

        public Entry toRealEntry(Parcer parcer)
        {
            return new Entry(id, parcer.unwrap(parcelable));
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeLong(id);
            parcel.writeParcelable(parcelable, i);
        }


        ParcelableEntry(long l, Parcelable parcelable1)
        {
            id = l;
            parcelable = parcelable1;
        }
    }

    private static class ReadIterator
        implements Iterator
    {

        private final Iterator iterator;

        public boolean hasNext()
        {
            return iterator.hasNext();
        }

        public Object next()
        {
            return iterator.next();
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        public ReadIterator(Iterator iterator1)
        {
            iterator = iterator1;
        }
    }


    private final Deque backstack;
    private final long highestId;

    private Backstack(long l, Deque deque)
    {
        highestId = l;
        backstack = deque;
    }

    Backstack(long l, Deque deque, _cls1 _pcls1)
    {
        this(l, deque);
    }

    public static Builder emptyBuilder()
    {
        return new Builder(-1L, Collections.emptyList());
    }

    public static Backstack from(Parcelable parcelable, Parcer parcer)
    {
        return ((ParcelableBackstack)parcelable).getBackstack(parcer);
    }

    public static Backstack fromUpChain(Object obj)
    {
        LinkedList linkedlist = new LinkedList();
        for (; obj instanceof HasParent; obj = ((HasParent)obj).getParent())
        {
            linkedlist.addFirst(obj);
        }

        linkedlist.addFirst(obj);
        obj = emptyBuilder();
        ((Builder) (obj)).addAll(linkedlist);
        return ((Builder) (obj)).build();
    }

    public static Backstack single(Object obj)
    {
        return emptyBuilder().push(obj).build();
    }

    public Builder buildUpon()
    {
        return new Builder(highestId, backstack);
    }

    public Entry current()
    {
        return (Entry)backstack.peek();
    }

    public Parcelable getParcelable(Parcer parcer)
    {
        return new ParcelableBackstack.Memory(this, parcer);
    }

    public Iterator iterator()
    {
        return new ReadIterator(backstack.iterator());
    }

    public Iterator reverseIterator()
    {
        return new ReadIterator(backstack.descendingIterator());
    }

    public int size()
    {
        return backstack.size();
    }

    public String toString()
    {
        return backstack.toString();
    }

}
