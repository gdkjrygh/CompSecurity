// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet:
//            FullWalletRequest, Cart

public final class k
    implements android.os.Parcelable.Creator
{

    public k()
    {
    }

    static void a(FullWalletRequest fullwalletrequest, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, fullwalletrequest.getVersionCode());
        b.a(parcel, 2, fullwalletrequest.Oq, false);
        b.a(parcel, 3, fullwalletrequest.Or, false);
        b.a(parcel, 4, fullwalletrequest.Ox, i, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        Cart cart = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        String s = null;
        int i = 0;
        String s1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 4: // '\004'
                    cart = (Cart)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, Cart.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new FullWalletRequest(i, s, s1, cart);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new FullWalletRequest[i];
    }
}
