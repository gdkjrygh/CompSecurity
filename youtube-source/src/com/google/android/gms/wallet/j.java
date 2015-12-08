// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet:
//            FullWallet, ProxyCard, Address

public final class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(FullWallet fullwallet, Parcel parcel, int i)
    {
        int k = b.a(parcel);
        b.a(parcel, 1, fullwallet.getVersionCode());
        b.a(parcel, 2, fullwallet.Oq, false);
        b.a(parcel, 3, fullwallet.Or, false);
        b.a(parcel, 4, fullwallet.Os, i, false);
        b.a(parcel, 5, fullwallet.Ot, false);
        b.a(parcel, 6, fullwallet.Ou, i, false);
        b.a(parcel, 7, fullwallet.Ov, i, false);
        b.a(parcel, 8, fullwallet.Ow, false);
        b.a(parcel, k);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String as[] = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        Address address = null;
        Address address1 = null;
        String s = null;
        ProxyCard proxycard = null;
        String s1 = null;
        String s2 = null;
        do
        {
            if (parcel.dataPosition() < k)
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
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 4: // '\004'
                    proxycard = (ProxyCard)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ProxyCard.CREATOR);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 6: // '\006'
                    address1 = (Address)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, Address.CREATOR);
                    break;

                case 7: // '\007'
                    address = (Address)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, Address.CREATOR);
                    break;

                case 8: // '\b'
                    as = com.google.android.gms.common.internal.safeparcel.a.t(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new FullWallet(i, s2, s1, proxycard, s, address1, address, as);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new FullWallet[i];
    }
}
