// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package flow;

import android.os.Parcel;
import java.util.ArrayList;

// Referenced classes of package flow:
//            Backstack

static final class rcelled
    implements android.os.d
{

    public rcelled createFromParcel(Parcel parcel)
    {
        ArrayList arraylist = new ArrayList();
        long l = parcel.readLong();
        parcel.readTypedList(arraylist, R);
        return new rcelled(l, arraylist);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public createFromParcel[] newArray(int i)
    {
        return new rcelled[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    rcelled()
    {
    }
}
