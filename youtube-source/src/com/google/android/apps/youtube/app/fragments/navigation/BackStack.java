// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.common.e.l;
import java.util.Iterator;

// Referenced classes of package com.google.android.apps.youtube.app.fragments.navigation:
//            a

public abstract class BackStack
    implements Parcelable
{

    protected final l stack;

    protected BackStack()
    {
        stack = new l();
    }

    protected BackStack(Parcel parcel)
    {
        stack = new l();
        int j = parcel.readInt();
        for (int i = 0; i < j; i++)
        {
            stack.offer(readEntryFromParcel(parcel));
        }

    }

    public int describeContents()
    {
        return 0;
    }

    public final boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public a pop()
    {
        return (a)stack.poll();
    }

    public a popAll()
    {
        a a1;
        for (a1 = null; !stack.isEmpty(); a1 = (a)stack.poll()) { }
        return a1;
    }

    public final void push(a a1)
    {
        stack.offer(a1);
    }

    protected abstract a readEntryFromParcel(Parcel parcel);

    protected abstract void writeEntryToParcel(a a1, Parcel parcel, int i);

    public void writeToParcel(Parcel parcel, int i)
    {
        Iterator iterator = stack.iterator();
        int i1 = stack.size();
        a aa[] = new a[i1];
        int j = i1;
        while (iterator.hasNext()) 
        {
            j--;
            aa[j] = (a)iterator.next();
        }
        parcel.writeInt(i1);
        for (int k = 0; k < i1; k++)
        {
            writeEntryToParcel(aa[k], parcel, i);
        }

    }
}
