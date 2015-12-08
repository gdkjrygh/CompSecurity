// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments.navigation;

import android.os.Parcel;
import com.google.android.apps.youtube.common.e.l;

// Referenced classes of package com.google.android.apps.youtube.app.fragments.navigation:
//            BackStack, b, a, PaneDescriptor

public final class PaneBackStack extends BackStack
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private boolean authenticated;

    public PaneBackStack()
    {
        authenticated = false;
    }

    public PaneBackStack(Parcel parcel)
    {
        super(parcel);
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        authenticated = flag;
    }

    public final boolean isAuthenticated()
    {
        return authenticated;
    }

    public final a pop()
    {
        if (stack.isEmpty())
        {
            authenticated = false;
        }
        return super.pop();
    }

    public final a popAll()
    {
        authenticated = false;
        return super.popAll();
    }

    public final a popCheckpoint()
    {
        a a1 = null;
        do
        {
            if (stack.isEmpty())
            {
                break;
            }
            a a2 = (a)stack.poll();
            a1 = a2;
            if (!((PaneDescriptor)a2.a).isCheckPoint())
            {
                continue;
            }
            a1 = a2;
            break;
        } while (true);
        return a1;
    }

    public final void push(PaneDescriptor panedescriptor, android.support.v4.app.Fragment.SavedState savedstate)
    {
        super.push(new a(panedescriptor, savedstate));
    }

    protected final a readEntryFromParcel(Parcel parcel)
    {
        return new a((PaneDescriptor)parcel.readParcelable(com/google/android/apps/youtube/app/fragments/navigation/PaneDescriptor.getClassLoader()), (android.support.v4.app.Fragment.SavedState)parcel.readParcelable(android/support/v4/app/Fragment$SavedState.getClassLoader()));
    }

    public final void setAuthenticated()
    {
        authenticated = true;
    }

    protected final void writeEntryToParcel(a a1, Parcel parcel, int i)
    {
        parcel.writeParcelable(a1.a, 0);
        parcel.writeParcelable(a1.b, 0);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        if (authenticated)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }

}
