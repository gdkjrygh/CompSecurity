// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.b.a;
import com.google.android.gms.plus.a.b.b;
import com.google.android.gms.plus.a.b.c;
import com.google.android.gms.plus.a.b.f;
import com.google.android.gms.plus.a.b.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            fe, jg, fb

public final class kq extends fe
    implements SafeParcelable, a
{

    public static final jg CREATOR = new jg();
    private static final HashMap Mu;
    private final Set Mv;
    private String NA;
    private c NB;
    private boolean NC;
    private String ND;
    private d NE;
    private String NF;
    private int NG;
    private List NH;
    private List NI;
    private int NJ;
    private int NK;
    private String NL;
    private List NM;
    private boolean NN;
    private String Nu;
    private a Nv;
    private String Nw;
    private String Nx;
    private int Ny;
    private b Nz;
    private int eP;
    private String iK;
    private final int jE;
    private String uf;
    private String zk;

    public kq()
    {
        jE = 2;
        Mv = new HashSet();
    }

    public kq(String s, String s1, c c, int i, String s2)
    {
        jE = 2;
        Mv = new HashSet();
        uf = s;
        Mv.add(Integer.valueOf(9));
        zk = s1;
        Mv.add(Integer.valueOf(14));
        NB = c;
        Mv.add(Integer.valueOf(15));
        NG = i;
        Mv.add(Integer.valueOf(21));
        iK = s2;
        Mv.add(Integer.valueOf(27));
    }

    kq(Set set, int i, String s, a a1, String s1, String s2, int k, 
            b b1, String s3, String s4, int l, String s5, c c, boolean flag, 
            String s6, d d, String s7, int i1, List list, List list1, int j1, 
            int k1, String s8, String s9, List list2, boolean flag1)
    {
        Mv = set;
        jE = i;
        Nu = s;
        Nv = a1;
        Nw = s1;
        Nx = s2;
        Ny = k;
        Nz = b1;
        NA = s3;
        uf = s4;
        eP = l;
        zk = s5;
        NB = c;
        NC = flag;
        ND = s6;
        NE = d;
        NF = s7;
        NG = i1;
        NH = list;
        NI = list1;
        NJ = j1;
        NK = k1;
        NL = s8;
        iK = s9;
        NM = list2;
        NN = flag1;
    }

    public static kq j(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = CREATOR;
        abyte0 = com.google.android.gms.internal.jg.a(parcel);
        parcel.recycle();
        return abyte0;
    }

    protected final boolean a(fe.a a1)
    {
        return Mv.contains(Integer.valueOf(a1.cq()));
    }

    protected final Object ac(String s)
    {
        return null;
    }

    protected final boolean ad(String s)
    {
        return false;
    }

    protected final Object b(fe.a a1)
    {
        switch (a1.cq())
        {
        case 10: // '\n'
        case 11: // '\013'
        case 13: // '\r'
        case 17: // '\021'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(a1.cq()).toString());

        case 2: // '\002'
            return Nu;

        case 3: // '\003'
            return Nv;

        case 4: // '\004'
            return Nw;

        case 5: // '\005'
            return Nx;

        case 6: // '\006'
            return Integer.valueOf(Ny);

        case 7: // '\007'
            return Nz;

        case 8: // '\b'
            return NA;

        case 9: // '\t'
            return uf;

        case 12: // '\f'
            return Integer.valueOf(eP);

        case 14: // '\016'
            return zk;

        case 15: // '\017'
            return NB;

        case 16: // '\020'
            return Boolean.valueOf(NC);

        case 18: // '\022'
            return ND;

        case 19: // '\023'
            return NE;

        case 20: // '\024'
            return NF;

        case 21: // '\025'
            return Integer.valueOf(NG);

        case 22: // '\026'
            return NH;

        case 23: // '\027'
            return NI;

        case 24: // '\030'
            return Integer.valueOf(NJ);

        case 25: // '\031'
            return Integer.valueOf(NK);

        case 26: // '\032'
            return NL;

        case 27: // '\033'
            return iK;

        case 28: // '\034'
            return NM;

        case 29: // '\035'
            return Boolean.valueOf(NN);
        }
    }

    public final HashMap cj()
    {
        return Mu;
    }

    public final int describeContents()
    {
        jg jg1 = CREATOR;
        return 0;
    }

    public final boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof kq))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (kq)obj;
            fe.a a1;
label1:
            do
            {
                for (Iterator iterator = Mu.values().iterator(); iterator.hasNext();)
                {
                    a1 = (fe.a)iterator.next();
                    if (!a(a1))
                    {
                        continue label1;
                    }
                    if (((kq) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((kq) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((kq) (obj)).a(a1));
            return false;
        }
        return true;
    }

    final Set fD()
    {
        return Mv;
    }

    final a fY()
    {
        return Nv;
    }

    final b fZ()
    {
        return Nz;
    }

    public final Object freeze()
    {
        return gf();
    }

    final c ga()
    {
        return NB;
    }

    final d gb()
    {
        return NE;
    }

    final List gc()
    {
        return NH;
    }

    final List gd()
    {
        return NI;
    }

    final List ge()
    {
        return NM;
    }

    public final String getAboutMe()
    {
        return Nu;
    }

    public final b getAgeRange()
    {
        return Nv;
    }

    public final String getBirthday()
    {
        return Nw;
    }

    public final String getBraggingRights()
    {
        return Nx;
    }

    public final int getCircledByCount()
    {
        return Ny;
    }

    public final c getCover()
    {
        return Nz;
    }

    public final String getCurrentLocation()
    {
        return NA;
    }

    public final String getDisplayName()
    {
        return uf;
    }

    public final int getGender()
    {
        return eP;
    }

    public final String getId()
    {
        return zk;
    }

    public final f getImage()
    {
        return NB;
    }

    public final String getLanguage()
    {
        return ND;
    }

    public final g getName()
    {
        return NE;
    }

    public final String getNickname()
    {
        return NF;
    }

    public final int getObjectType()
    {
        return NG;
    }

    public final List getOrganizations()
    {
        return (ArrayList)NH;
    }

    public final List getPlacesLived()
    {
        return (ArrayList)NI;
    }

    public final int getPlusOneCount()
    {
        return NJ;
    }

    public final int getRelationshipStatus()
    {
        return NK;
    }

    public final String getTagline()
    {
        return NL;
    }

    public final String getUrl()
    {
        return iK;
    }

    public final List getUrls()
    {
        return (ArrayList)NM;
    }

    final int getVersionCode()
    {
        return jE;
    }

    public final kq gf()
    {
        return this;
    }

    public final boolean hasAboutMe()
    {
        return Mv.contains(Integer.valueOf(2));
    }

    public final boolean hasAgeRange()
    {
        return Mv.contains(Integer.valueOf(3));
    }

    public final boolean hasBirthday()
    {
        return Mv.contains(Integer.valueOf(4));
    }

    public final boolean hasBraggingRights()
    {
        return Mv.contains(Integer.valueOf(5));
    }

    public final boolean hasCircledByCount()
    {
        return Mv.contains(Integer.valueOf(6));
    }

    public final boolean hasCover()
    {
        return Mv.contains(Integer.valueOf(7));
    }

    public final boolean hasCurrentLocation()
    {
        return Mv.contains(Integer.valueOf(8));
    }

    public final boolean hasDisplayName()
    {
        return Mv.contains(Integer.valueOf(9));
    }

    public final boolean hasGender()
    {
        return Mv.contains(Integer.valueOf(12));
    }

    public final boolean hasId()
    {
        return Mv.contains(Integer.valueOf(14));
    }

    public final boolean hasImage()
    {
        return Mv.contains(Integer.valueOf(15));
    }

    public final boolean hasIsPlusUser()
    {
        return Mv.contains(Integer.valueOf(16));
    }

    public final boolean hasLanguage()
    {
        return Mv.contains(Integer.valueOf(18));
    }

    public final boolean hasName()
    {
        return Mv.contains(Integer.valueOf(19));
    }

    public final boolean hasNickname()
    {
        return Mv.contains(Integer.valueOf(20));
    }

    public final boolean hasObjectType()
    {
        return Mv.contains(Integer.valueOf(21));
    }

    public final boolean hasOrganizations()
    {
        return Mv.contains(Integer.valueOf(22));
    }

    public final boolean hasPlacesLived()
    {
        return Mv.contains(Integer.valueOf(23));
    }

    public final boolean hasPlusOneCount()
    {
        return Mv.contains(Integer.valueOf(24));
    }

    public final boolean hasRelationshipStatus()
    {
        return Mv.contains(Integer.valueOf(25));
    }

    public final boolean hasTagline()
    {
        return Mv.contains(Integer.valueOf(26));
    }

    public final boolean hasUrl()
    {
        return Mv.contains(Integer.valueOf(27));
    }

    public final boolean hasUrls()
    {
        return Mv.contains(Integer.valueOf(28));
    }

    public final boolean hasVerified()
    {
        return Mv.contains(Integer.valueOf(29));
    }

    public final int hashCode()
    {
        Iterator iterator = Mu.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            fe.a a1 = (fe.a)iterator.next();
            if (a(a1))
            {
                int k = a1.cq();
                i = b(a1).hashCode() + (i + k);
            }
        } while (true);
        return i;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final boolean isPlusUser()
    {
        return NC;
    }

    public final boolean isVerified()
    {
        return NN;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        jg jg1 = CREATOR;
        com.google.android.gms.internal.jg.a(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        Mu = hashmap;
        hashmap.put("aboutMe", com.google.android.gms.internal.fe.a.g("aboutMe", 2));
        Mu.put("ageRange", com.google.android.gms.internal.fe.a.a("ageRange", 3, com/google/android/gms/internal/kq$a));
        Mu.put("birthday", com.google.android.gms.internal.fe.a.g("birthday", 4));
        Mu.put("braggingRights", com.google.android.gms.internal.fe.a.g("braggingRights", 5));
        Mu.put("circledByCount", fe.a.d("circledByCount", 6));
        Mu.put("cover", com.google.android.gms.internal.fe.a.a("cover", 7, com/google/android/gms/internal/kq$b));
        Mu.put("currentLocation", com.google.android.gms.internal.fe.a.g("currentLocation", 8));
        Mu.put("displayName", com.google.android.gms.internal.fe.a.g("displayName", 9));
        Mu.put("gender", com.google.android.gms.internal.fe.a.a("gender", 12, (new fb()).c("male", 0).c("female", 1).c("other", 2), false));
        Mu.put("id", com.google.android.gms.internal.fe.a.g("id", 14));
        Mu.put("image", com.google.android.gms.internal.fe.a.a("image", 15, com/google/android/gms/internal/kq$c));
        Mu.put("isPlusUser", com.google.android.gms.internal.fe.a.f("isPlusUser", 16));
        Mu.put("language", com.google.android.gms.internal.fe.a.g("language", 18));
        Mu.put("name", com.google.android.gms.internal.fe.a.a("name", 19, com/google/android/gms/internal/kq$d));
        Mu.put("nickname", com.google.android.gms.internal.fe.a.g("nickname", 20));
        Mu.put("objectType", com.google.android.gms.internal.fe.a.a("objectType", 21, (new fb()).c("person", 0).c("page", 1), false));
        Mu.put("organizations", com.google.android.gms.internal.fe.a.b("organizations", 22, com/google/android/gms/internal/kq$f));
        Mu.put("placesLived", com.google.android.gms.internal.fe.a.b("placesLived", 23, com/google/android/gms/internal/kq$g));
        Mu.put("plusOneCount", fe.a.d("plusOneCount", 24));
        Mu.put("relationshipStatus", com.google.android.gms.internal.fe.a.a("relationshipStatus", 25, (new fb()).c("single", 0).c("in_a_relationship", 1).c("engaged", 2).c("married", 3).c("its_complicated", 4).c("open_relationship", 5).c("widowed", 6).c("in_domestic_partnership", 7).c("in_civil_union", 8), false));
        Mu.put("tagline", com.google.android.gms.internal.fe.a.g("tagline", 26));
        Mu.put("url", com.google.android.gms.internal.fe.a.g("url", 27));
        Mu.put("urls", com.google.android.gms.internal.fe.a.b("urls", 28, com/google/android/gms/internal/kq$h));
        Mu.put("verified", com.google.android.gms.internal.fe.a.f("verified", 29));
    }
}
