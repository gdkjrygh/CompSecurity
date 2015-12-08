// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal;

import android.os.Binder;
import android.os.Parcel;

// Referenced classes of package com.google.android.youtube.player.internal:
//            j

public abstract class k extends Binder
    implements j
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int l)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, l);

        case 1598968902: 
            parcel1.writeString("com.google.android.youtube.player.internal.IOnFullscreenListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IOnFullscreenListener");
            break;
        }
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        parcel1.writeNoException();
        return true;
    }
}
