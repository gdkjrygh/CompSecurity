// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Parcel;

// Referenced classes of package com.google.android.youtube.player.internal:
//            y

public abstract class z extends Binder
    implements y
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag3 = false;
        boolean flag2 = false;
        String s;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
            Bitmap bitmap;
            String s1;
            boolean flag;
            if (parcel.readInt() != 0)
            {
                bitmap = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
            } else
            {
                bitmap = null;
            }
            s1 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (parcel.readInt() != 0)
            {
                flag2 = true;
            }
            a(bitmap, s1, flag, flag2);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
            s = parcel.readString();
            break;
        }
        boolean flag1;
        if (parcel.readInt() != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag3;
        if (parcel.readInt() != 0)
        {
            flag2 = true;
        }
        a(s, flag1, flag2);
        parcel1.writeNoException();
        return true;
    }
}
