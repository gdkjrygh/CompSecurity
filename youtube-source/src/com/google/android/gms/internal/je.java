// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            kl

public final class je
    implements android.os.Parcelable.Creator
{

    public je()
    {
    }

    static void a(kl kl1, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        Set set = kl1.fD();
        if (set.contains(Integer.valueOf(1)))
        {
            b.a(parcel, 1, kl1.getVersionCode());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            b.a(parcel, 2, kl1.fE(), i, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            b.a(parcel, 3, kl1.getAdditionalName(), true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            b.a(parcel, 4, kl1.fF(), i, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            b.a(parcel, 5, kl1.getAddressCountry(), true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            b.a(parcel, 6, kl1.getAddressLocality(), true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            b.a(parcel, 7, kl1.getAddressRegion(), true);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            b.b(parcel, 8, kl1.fG(), true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            b.a(parcel, 9, kl1.getAttendeeCount());
        }
        if (set.contains(Integer.valueOf(10)))
        {
            b.b(parcel, 10, kl1.fH(), true);
        }
        if (set.contains(Integer.valueOf(11)))
        {
            b.a(parcel, 11, kl1.fI(), i, true);
        }
        if (set.contains(Integer.valueOf(12)))
        {
            b.b(parcel, 12, kl1.fJ(), true);
        }
        if (set.contains(Integer.valueOf(13)))
        {
            b.a(parcel, 13, kl1.getBestRating(), true);
        }
        if (set.contains(Integer.valueOf(14)))
        {
            b.a(parcel, 14, kl1.getBirthDate(), true);
        }
        if (set.contains(Integer.valueOf(15)))
        {
            b.a(parcel, 15, kl1.fK(), i, true);
        }
        if (set.contains(Integer.valueOf(17)))
        {
            b.a(parcel, 17, kl1.getContentSize(), true);
        }
        if (set.contains(Integer.valueOf(16)))
        {
            b.a(parcel, 16, kl1.getCaption(), true);
        }
        if (set.contains(Integer.valueOf(19)))
        {
            b.b(parcel, 19, kl1.fL(), true);
        }
        if (set.contains(Integer.valueOf(18)))
        {
            b.a(parcel, 18, kl1.getContentUrl(), true);
        }
        if (set.contains(Integer.valueOf(21)))
        {
            b.a(parcel, 21, kl1.getDateModified(), true);
        }
        if (set.contains(Integer.valueOf(20)))
        {
            b.a(parcel, 20, kl1.getDateCreated(), true);
        }
        if (set.contains(Integer.valueOf(23)))
        {
            b.a(parcel, 23, kl1.getDescription(), true);
        }
        if (set.contains(Integer.valueOf(22)))
        {
            b.a(parcel, 22, kl1.getDatePublished(), true);
        }
        if (set.contains(Integer.valueOf(25)))
        {
            b.a(parcel, 25, kl1.getEmbedUrl(), true);
        }
        if (set.contains(Integer.valueOf(24)))
        {
            b.a(parcel, 24, kl1.getDuration(), true);
        }
        if (set.contains(Integer.valueOf(27)))
        {
            b.a(parcel, 27, kl1.getFamilyName(), true);
        }
        if (set.contains(Integer.valueOf(26)))
        {
            b.a(parcel, 26, kl1.getEndDate(), true);
        }
        if (set.contains(Integer.valueOf(29)))
        {
            b.a(parcel, 29, kl1.fM(), i, true);
        }
        if (set.contains(Integer.valueOf(28)))
        {
            b.a(parcel, 28, kl1.getGender(), true);
        }
        if (set.contains(Integer.valueOf(31)))
        {
            b.a(parcel, 31, kl1.getHeight(), true);
        }
        if (set.contains(Integer.valueOf(30)))
        {
            b.a(parcel, 30, kl1.getGivenName(), true);
        }
        if (set.contains(Integer.valueOf(34)))
        {
            b.a(parcel, 34, kl1.fN(), i, true);
        }
        if (set.contains(Integer.valueOf(32)))
        {
            b.a(parcel, 32, kl1.getId(), true);
        }
        if (set.contains(Integer.valueOf(33)))
        {
            b.a(parcel, 33, kl1.getImage(), true);
        }
        if (set.contains(Integer.valueOf(38)))
        {
            b.a(parcel, 38, kl1.getLongitude());
        }
        if (set.contains(Integer.valueOf(39)))
        {
            b.a(parcel, 39, kl1.getName(), true);
        }
        if (set.contains(Integer.valueOf(36)))
        {
            b.a(parcel, 36, kl1.getLatitude());
        }
        if (set.contains(Integer.valueOf(37)))
        {
            b.a(parcel, 37, kl1.fO(), i, true);
        }
        if (set.contains(Integer.valueOf(42)))
        {
            b.a(parcel, 42, kl1.getPlayerType(), true);
        }
        if (set.contains(Integer.valueOf(43)))
        {
            b.a(parcel, 43, kl1.getPostOfficeBoxNumber(), true);
        }
        if (set.contains(Integer.valueOf(40)))
        {
            b.a(parcel, 40, kl1.fP(), i, true);
        }
        if (set.contains(Integer.valueOf(41)))
        {
            b.b(parcel, 41, kl1.fQ(), true);
        }
        if (set.contains(Integer.valueOf(46)))
        {
            b.a(parcel, 46, kl1.fR(), i, true);
        }
        if (set.contains(Integer.valueOf(47)))
        {
            b.a(parcel, 47, kl1.getStartDate(), true);
        }
        if (set.contains(Integer.valueOf(44)))
        {
            b.a(parcel, 44, kl1.getPostalCode(), true);
        }
        if (set.contains(Integer.valueOf(45)))
        {
            b.a(parcel, 45, kl1.getRatingValue(), true);
        }
        if (set.contains(Integer.valueOf(51)))
        {
            b.a(parcel, 51, kl1.getThumbnailUrl(), true);
        }
        if (set.contains(Integer.valueOf(50)))
        {
            b.a(parcel, 50, kl1.fS(), i, true);
        }
        if (set.contains(Integer.valueOf(49)))
        {
            b.a(parcel, 49, kl1.getText(), true);
        }
        if (set.contains(Integer.valueOf(48)))
        {
            b.a(parcel, 48, kl1.getStreetAddress(), true);
        }
        if (set.contains(Integer.valueOf(55)))
        {
            b.a(parcel, 55, kl1.getWidth(), true);
        }
        if (set.contains(Integer.valueOf(54)))
        {
            b.a(parcel, 54, kl1.getUrl(), true);
        }
        if (set.contains(Integer.valueOf(53)))
        {
            b.a(parcel, 53, kl1.getType(), true);
        }
        if (set.contains(Integer.valueOf(52)))
        {
            b.a(parcel, 52, kl1.getTickerSymbol(), true);
        }
        if (set.contains(Integer.valueOf(56)))
        {
            b.a(parcel, 56, kl1.getWorstRating(), true);
        }
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        HashSet hashset = new HashSet();
        int j = 0;
        kl kl10 = null;
        java.util.ArrayList arraylist5 = null;
        kl kl9 = null;
        String s34 = null;
        String s33 = null;
        String s32 = null;
        java.util.ArrayList arraylist4 = null;
        int i = 0;
        java.util.ArrayList arraylist3 = null;
        kl kl8 = null;
        java.util.ArrayList arraylist2 = null;
        String s31 = null;
        String s30 = null;
        kl kl7 = null;
        String s29 = null;
        String s28 = null;
        String s27 = null;
        java.util.ArrayList arraylist1 = null;
        String s26 = null;
        String s25 = null;
        String s24 = null;
        String s23 = null;
        String s22 = null;
        String s21 = null;
        String s20 = null;
        String s19 = null;
        String s18 = null;
        kl kl6 = null;
        String s17 = null;
        String s16 = null;
        String s15 = null;
        String s14 = null;
        kl kl5 = null;
        double d1 = 0.0D;
        kl kl4 = null;
        double d = 0.0D;
        String s13 = null;
        kl kl3 = null;
        java.util.ArrayList arraylist = null;
        String s12 = null;
        String s11 = null;
        String s10 = null;
        String s9 = null;
        kl kl2 = null;
        String s8 = null;
        String s7 = null;
        String s6 = null;
        kl kl1 = null;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                case 35: // '#'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    kl10 = (kl)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, kl.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    arraylist5 = com.google.android.gms.common.internal.safeparcel.a.u(parcel, l);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    kl9 = (kl)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, kl.CREATOR);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s34 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    s33 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    s32 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    arraylist4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, kl.CREATOR);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 10: // '\n'
                    arraylist3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, kl.CREATOR);
                    hashset.add(Integer.valueOf(10));
                    break;

                case 11: // '\013'
                    kl8 = (kl)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, kl.CREATOR);
                    hashset.add(Integer.valueOf(11));
                    break;

                case 12: // '\f'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, kl.CREATOR);
                    hashset.add(Integer.valueOf(12));
                    break;

                case 13: // '\r'
                    s31 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(13));
                    break;

                case 14: // '\016'
                    s30 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(14));
                    break;

                case 15: // '\017'
                    kl7 = (kl)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, kl.CREATOR);
                    hashset.add(Integer.valueOf(15));
                    break;

                case 17: // '\021'
                    s28 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(17));
                    break;

                case 16: // '\020'
                    s29 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(16));
                    break;

                case 19: // '\023'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, kl.CREATOR);
                    hashset.add(Integer.valueOf(19));
                    break;

                case 18: // '\022'
                    s27 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(18));
                    break;

                case 21: // '\025'
                    s25 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(21));
                    break;

                case 20: // '\024'
                    s26 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(20));
                    break;

                case 23: // '\027'
                    s23 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(23));
                    break;

                case 22: // '\026'
                    s24 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(22));
                    break;

                case 25: // '\031'
                    s21 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(25));
                    break;

                case 24: // '\030'
                    s22 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(24));
                    break;

                case 27: // '\033'
                    s19 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(27));
                    break;

                case 26: // '\032'
                    s20 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(26));
                    break;

                case 29: // '\035'
                    kl6 = (kl)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, kl.CREATOR);
                    hashset.add(Integer.valueOf(29));
                    break;

                case 28: // '\034'
                    s18 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(28));
                    break;

                case 31: // '\037'
                    s16 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(31));
                    break;

                case 30: // '\036'
                    s17 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(30));
                    break;

                case 34: // '"'
                    kl5 = (kl)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, kl.CREATOR);
                    hashset.add(Integer.valueOf(34));
                    break;

                case 32: // ' '
                    s15 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(32));
                    break;

                case 33: // '!'
                    s14 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(33));
                    break;

                case 38: // '&'
                    d = com.google.android.gms.common.internal.safeparcel.a.k(parcel, l);
                    hashset.add(Integer.valueOf(38));
                    break;

                case 39: // '\''
                    s13 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(39));
                    break;

                case 36: // '$'
                    d1 = com.google.android.gms.common.internal.safeparcel.a.k(parcel, l);
                    hashset.add(Integer.valueOf(36));
                    break;

                case 37: // '%'
                    kl4 = (kl)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, kl.CREATOR);
                    hashset.add(Integer.valueOf(37));
                    break;

                case 42: // '*'
                    s12 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(42));
                    break;

                case 43: // '+'
                    s11 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(43));
                    break;

                case 40: // '('
                    kl3 = (kl)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, kl.CREATOR);
                    hashset.add(Integer.valueOf(40));
                    break;

                case 41: // ')'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, kl.CREATOR);
                    hashset.add(Integer.valueOf(41));
                    break;

                case 46: // '.'
                    kl2 = (kl)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, kl.CREATOR);
                    hashset.add(Integer.valueOf(46));
                    break;

                case 47: // '/'
                    s8 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(47));
                    break;

                case 44: // ','
                    s10 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(44));
                    break;

                case 45: // '-'
                    s9 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(45));
                    break;

                case 51: // '3'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(51));
                    break;

                case 50: // '2'
                    kl1 = (kl)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, kl.CREATOR);
                    hashset.add(Integer.valueOf(50));
                    break;

                case 49: // '1'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(49));
                    break;

                case 48: // '0'
                    s7 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(48));
                    break;

                case 55: // '7'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(55));
                    break;

                case 54: // '6'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(54));
                    break;

                case 53: // '5'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(53));
                    break;

                case 52: // '4'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(52));
                    break;

                case 56: // '8'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(56));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != k)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
                }
                return new kl(hashset, j, kl10, arraylist5, kl9, s34, s33, s32, arraylist4, i, arraylist3, kl8, arraylist2, s31, s30, kl7, s29, s28, s27, arraylist1, s26, s25, s24, s23, s22, s21, s20, s19, s18, kl6, s17, s16, s15, s14, kl5, d1, kl4, d, s13, kl3, arraylist, s12, s11, s10, s9, kl2, s8, s7, s6, kl1, s5, s4, s3, s2, s1, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new kl[i];
    }
}
